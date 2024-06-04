package org.apache.logging.log4j.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
//import tools.aqua.concolic.Tainting;
//import tools.aqua.concolic.Verifier;

import java.io.IOException;

public class App {

    protected static final Logger parentLogger = LogManager.getLogger();

    public static void main( String[] args ) {
        String s = Verifier.nondetString();
        if(s.equals("test"))
        {
            assert false;
        }
    }
}
