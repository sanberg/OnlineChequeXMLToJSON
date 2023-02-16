import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws JAXBException {
        String jsonString = "{\n" +
                "  \"id\": 19963559,\n" +
                "  \"externalId\": \"magna exercitation ut irure\",\n" +
                "  \"orderGuid\": \"tempor eiusmod nulla\",\n" +
                "  \"orderCode\": \"do quis aliqua ullamco\",\n" +
                "  \"groupCode\": \"aute ad\",\n" +
                "  \"groupGuid\": \"adipisicing reprehenderit\",\n" +
                "  \"totalAmount\": 79245039.01136684,\n" +
                "  \"totalDiscount\": 33762886.32723141,\n" +
                "  \"createdTs\": -27510421,\n" +
                "  \"type\": \"sale\",\n" +
                "  \"atolData\": {\n" +
                "    \"callbackUrl\": \"veniam ullamco culpa do\",\n" +
                "    \"daemonCode\": \"fugiat veniam aliqua magna esse\",\n" +
                "    \"deviceCode\": \"do deserunt aute\",\n" +
                "    \"warnings\": \"elit\",\n" +
                "    \"externalId\": \"esse magna ea \",\n" +
                "    \"groupCode\": \"dolore dolore pariatur consectetur esse\",\n" +
                "    \"status\": \"sed dolore Ut\",\n" +
                "    \"uuid\": \"irure in ut aute\",\n" +
                "    \"payload\": {\n" +
                "      \"ecrRegistrationNumber\": \"eu\",\n" +
                "      \"fiscalDocumentAttribute\": 59853681,\n" +
                "      \"fiscalDocumentNumber\": -76693968,\n" +
                "      \"fiscalReceiptNumber\": 18305265,\n" +
                "      \"fnNumber\": -23431808,\n" +
                "      \"fnsSite\": \"in\",\n" +
                "      \"receiptDatetime\": \"1964-12-13T04:18:18.434Z\",\n" +
                "      \"shiftNumber\": \"tempor sit\",\n" +
                "      \"total\": \"ut dolor fugiat sunt in\",\n" +
                "      \"ofdInn\": \"dolore in\",\n" +
                "      \"ofdReceiptUrl\": \"amet nulla aliquip\",\n" +
                "      \"zn\": \"nisi ipsum ut\",\n" +
                "      \"rnm\": \"tempor cillum fugiat\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"description\": \"qui incididunt sint do\",\n" +
                "  \"url\": \"non dolore\",\n" +
                "  \"userEmail\": \"irure in\",\n" +
                "  \"userName\": \"commodo Excepteur et occaecat\",\n" +
                "  \"userPhone\": \"esse anim quis\",\n" +
                "  \"createdTsSource\": 49736176,\n" +
                "  \"channel\": \"offline\",\n" +
                "  \"items\": [\n" +
                "    {\n" +
                "      \"id\": -85831328,\n" +
                "      \"itemType\": \"donation\",\n" +
                "      \"orderCode\": \"eu proident\",\n" +
                "      \"productName\": \"Lorem\",\n" +
                "      \"productCode\": \"ad deserunt ullamco\",\n" +
                "      \"quantity\": 88025924,\n" +
                "      \"price\": 95697236.90848875,\n" +
                "      \"position\": -47931166,\n" +
                "      \"ndsCode\": \"NDS_10\",\n" +
                "      \"discountInfo\": [\n" +
                "        {\n" +
                "          \"code\": \"sint ad\",\n" +
                "          \"amountPerItem\": 80709060.3455716\n" +
                "        },\n" +
                "        {\n" +
                "          \"code\": \"dolore adipisicing fugiat\",\n" +
                "          \"amountPerItem\": -97143036.20554668\n" +
                "        }\n" +
                "      ],\n" +
                "      \"createdTs\": 8365979,\n" +
                "      \"chequeId\": 59028864,\n" +
                "      \"loyaltyPercent\": -17428372,\n" +
                "      \"vendorCode\": \"occaecat\",\n" +
                "      \"vendorPhone\": \"in cupidatat officia\",\n" +
                "      \"vendorName\": \"voluptate dolor aliquip\",\n" +
                "      \"vendorInn\": \"enim amet \"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": -97097539,\n" +
                "      \"itemType\": \"product\",\n" +
                "      \"orderCode\": \"Excepteur velit\",\n" +
                "      \"productName\": \"mollit proident dolore\",\n" +
                "      \"productCode\": \"deserunt incididunt sit enim consectetur\",\n" +
                "      \"quantity\": -9229347,\n" +
                "      \"price\": -34873606.171288475,\n" +
                "      \"position\": -16103220,\n" +
                "      \"ndsCode\": \"NONE\",\n" +
                "      \"discountInfo\": [\n" +
                "        {\n" +
                "          \"code\": \"quis ea ut Ut\",\n" +
                "          \"amountPerItem\": 1066617.7183630466\n" +
                "        },\n" +
                "        {\n" +
                "          \"code\": \"pariatur eu enim ullamco\",\n" +
                "          \"amountPerItem\": 59859723.52309039\n" +
                "        }\n" +
                "      ],\n" +
                "      \"createdTs\": -1979998,\n" +
                "      \"chequeId\": 61995576,\n" +
                "      \"loyaltyPercent\": 1192939,\n" +
                "      \"vendorCode\": \"qui incididunt offic\",\n" +
                "      \"vendorPhone\": \"quis reprehenderit sint \",\n" +
                "      \"vendorName\": \"eu an\",\n" +
                "      \"vendorInn\": \"enim nisi ad nostrud\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"prepaid\": false,\n" +
                "  \"loyalty\": {\n" +
                "    \"transactionId\": \"dolore Ut mollit\",\n" +
                "    \"barcode\": \"officia\"\n" +
                "  },\n" +
                "  \"cashier\": \"cillum officia deserunt\",\n" +
                "  \"posId\": \"dolore Ut laborum officia dolor\",\n" +
                "  \"address\": \"consequat\",\n" +
                "  \"placeOfSettlement\": \"consectetur\",\n" +
                "  \"chain\": \"detmir\",\n" +
                "  \"loyaltyPromoText\": \"laborum exercitation esse\",\n" +
                "  \"promoText\": \"ullamco ea\",\n" +
                "  \"giftCard\": \"laboris elit\",\n" +
                "  \"giftCardTs\": 69916366,\n" +
                "  \"giftCardAmount\": 86733738.0095715,\n" +
                "  \"bonusCard\": \"est adipisicing irure\",\n" +
                "  \"redeemed\": -80027598.87977451,\n" +
                "  \"awarded\": 31060386.686567515,\n" +
                "  \"loyaltyBalance\": -44786871.97338726,\n" +
                "  \"loyaltyActivePoints\": -22416485.69107558,\n" +
                "  \"loyaltyInactivePoints\": -8968680.359727442,\n" +
                "  \"ndsMap\": {\n" +
                "    \"labore_066\": 15463160.184706792\n" +
                "  },\n" +
                "  \"sent\": true,\n" +
                "  \"mustBeSent\": true,\n" +
                "  \"paymentMethod\": \"loyalty\",\n" +
                "  \"cardAmount\": -24072648.444494188,\n" +
                "  \"cashAmount\": 4962752.93524006,\n" +
                "  \"giftCardDetails\": [\n" +
                "    {\n" +
                "      \"transactionId\": \"in veniam irure fugiat\",\n" +
                "      \"barcode\": \"dolor nisi ad\",\n" +
                "      \"transactionDate\": -72435017\n" +
                "    },\n" +
                "    {\n" +
                "      \"transactionId\": \"sit aliqua\",\n" +
                "      \"barcode\": \"do Excepteur in fugiat\",\n" +
                "      \"transactionDate\": 26512374\n" +
                "    }\n" +
                "  ],\n" +
                "  \"properties\": {\n" +
                "    \"sunt_73\": \"mollit esse\",\n" +
                "    \"ullamco63\": \"sed dolore Excepteur\"\n" +
                "  },\n" +
                "  \"groupPublicId\": true\n" +
                "}";
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ns1:SalesEmailCheckRequest xmlns:ns1=\"urn:DetMir.ru:Hybris:Finance\"><externalId>00003200067100000004</externalId><orderCode></orderCode><totalAmount>-898</totalAmount><createdTsSource>1673705236</createdTsSource><createdTs>1673705236</createdTs><paymentMethod>3306</paymentMethod><items><itemType>2808</itemType><productName>Сапожки для девочек:Розовый:22-</productName><productCode>4610037049291</productCode><quantity>-1.000</quantity><price>-315.99</price><position>0</position><ndsCode>NDS_20</ndsCode></items><items><itemType>2808</itemType><productName>Сапожки для девочек:Розовый:22-</productName><productCode>4610037049291</productCode><quantity>-1.000</quantity><price>-316.01</price><position>1</position><ndsCode>NDS_20</ndsCode></items><items><itemType>2808</itemType><productName>Сапожки для девочек:Розовый:22-</productName><productCode>4610037049291</productCode><quantity>-1.000</quantity><price>-316.00</price><position>2</position><ndsCode>NDS_20</ndsCode></items></ns1:SalesEmailCheckRequest>";


        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        ChequeDto cheque = gson.fromJson(jsonString, ChequeDto.class);
        ChequeDto chequeXML = JAXB.unmarshal(new StringReader(xmlString), ChequeDto.class);
        System.out.println("deserialized");
        //System.out.println("result is: " + cheque.toString());
        System.out.println(gson.toJson(cheque));

        System.out.println(gson.toJson(chequeXML));


    }
}