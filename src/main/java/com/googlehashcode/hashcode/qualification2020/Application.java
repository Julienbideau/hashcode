package com.googlehashcode.hashcode.qualification2020;

import com.googlehashcode.hashcode.common.HashCodePhase;
import com.googlehashcode.hashcode.common.HashCodeApplication;
import com.googlehashcode.hashcode.common.HashCodeSession;
import com.googlehashcode.hashcode.qualification2020.impl.Algorithm;
import com.googlehashcode.hashcode.qualification2020.impl.InputValueParser;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        final HashCodeSession session = new HashCodeSession(2020, HashCodePhase.QUALIFICATION);
        final HashCodeApplication hashCodeApplication = new HashCodeApplication(session);
        hashCodeApplication.run(new Algorithm(), new InputValueParser());
    }
}
