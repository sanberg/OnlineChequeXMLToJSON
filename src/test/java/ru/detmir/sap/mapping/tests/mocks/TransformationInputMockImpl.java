package ru.detmir.sap.mapping.tests.mocks;

import com.sap.aii.mapping.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TransformationInputMockImpl extends TransformationInput {
    private final String mockPayloadString;
    private final InputPayload inputPayload;

    public TransformationInputMockImpl(String mockPayloadString) {
        this.mockPayloadString = mockPayloadString;
        this.inputPayload = new InputPayloadImpl();
    }

    @Override
    public InputHeader getInputHeader() {
        return null;
    }

    @Override
    public InputParameters getInputParameters() {
        return new InputParametersImpl();
    }

    @Override
    public InputPayload getInputPayload() {
        return this.inputPayload;
    }

    @Override
    public InputAttachments getInputAttachments() {
        return null;
    }

    class InputPayloadImpl extends InputPayload {
        InputPayloadImpl() {
        }

        public InputStream getInputStream() {
            return new ByteArrayInputStream(mockPayloadString.getBytes());
        }
    }
}
