package ru.detmir.sap.mapping.tests.mocks;

import com.sap.aii.mapping.api.InputParameters;
import com.sap.aii.mapping.lookup.Channel;

public class InputParametersImpl extends InputParameters {
    @Override
    public Object getValue(String s) {
        return null;
    }

    @Override
    public String getString(String s) {
        return s;
    }

    @Override
    public int getInt(String s) {
        return 0;
    }

    @Override
    public Channel getChannel(String s) {
        return null;
    }
}
