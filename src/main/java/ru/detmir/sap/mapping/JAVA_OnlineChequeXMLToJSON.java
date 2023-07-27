package ru.detmir.sap.mapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import ru.detmir.sap.mapping.model.ChequeDto;

import javax.xml.bind.JAXB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Base64;

public class JAVA_OnlineChequeXMLToJSON extends AbstractTransformation {
    @Override
    public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
        StringBuilder sourcexml = new StringBuilder();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in.getInputPayload().getInputStream()));
            while ((line = br.readLine()) != null)
                sourcexml.append(line).append("\n");
            br.close();
            String server = in.getInputParameters().getString("server");
            String topicName = in.getInputParameters().getString("topicName");
            ChequeDto chequeFromInputXML = JAXB.unmarshal(new StringReader(sourcexml.toString()), ChequeDto.class);
            Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyyy HH:mm:ss").create();
            String decoded = new String(Base64.getEncoder().encode(gson.toJson(chequeFromInputXML).getBytes()));
            String resXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<ns1:CommonKafkaMessageRequest xmlns:ns1=\"urn:DetMir.ru:Hybris:Common\">" +
                    "<server>" + server + "</server>" +
                    "<topicName>" + topicName + "</topicName>" +
                    "<data>" + decoded + "</data></ns1:CommonKafkaMessageRequest>";
            out.getOutputPayload().getOutputStream().write(resXML.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
