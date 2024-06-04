package org.apache.logging.log4j.core;

import tools.aqua.concolic.Tainting;
import tools.aqua.concolic.Verifier;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    public static void main( String[] args ) {
        String s = Verifier.nondetString();
        Logger logger = LogManager.getLogger();
        logger.info(s + "TEST");
    }
}
