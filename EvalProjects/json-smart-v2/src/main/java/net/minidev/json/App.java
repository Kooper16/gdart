package net.minidev.json;

import net.minidev.json.parser.JSONParserBaseTest;
import net.minidev.json.parser.ParseException;
import tools.aqua.concolic.Tainting;
import tools.aqua.concolic.Verifier;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String s = Verifier.nondetString();
        boolean acc = Verifier.nondetBoolean();
        boolean useHi = Verifier.nondetBoolean();
        if(true)
        {
            try
            {
                //JSONParser parser = new JSONParser();
                //parser.parse(s);
                JSONParserBaseTest parser = new JSONParserBaseTest();
                parser.pubExtractFloat(s, acc, useHi);
                System.out.println( "No Exception!" );
            }
            catch (ParseException e)
            {
                assert true;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println( "Exception!" );
                assert false;
            }
        }
    }
}

