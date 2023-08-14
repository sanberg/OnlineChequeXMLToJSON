package ru.detmir.sap.mapping.tests.mocks;

import com.sap.aii.mapping.api.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class TransformationOutputMockImpl extends TransformationOutput {
    private final ByteArrayOutputStream result = new ByteArrayOutputStream();

    @Override
    public OutputHeader getOutputHeader() {
        return null;
    }

    @Override
    public OutputParameters getOutputParameters() {
        return null;
    }

    @Override
    public OutputPayload getOutputPayload() {
        return new OutputPayloadImpl();
    }

    @Override
    public OutputAttachments getOutputAttachments() {
        return null;
    }

    @Override
    public void copyInputAttachments() {

    }


    class OutputPayloadImpl extends OutputPayload {
        OutputPayloadImpl() {
        }

        public OutputStream getOutputStream() {
            return result;
        }
    }
}
