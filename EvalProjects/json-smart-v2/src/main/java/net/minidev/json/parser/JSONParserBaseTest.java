package net.minidev.json.parser;

import java.io.IOException;
import java.math.BigDecimal;

import static net.minidev.json.parser.ParseException.ERROR_UNEXPECTED_TOKEN;

public class JSONParserBaseTest extends JSONParserBase {

    public JSONParserBaseTest()
    {
        super(0);
    }

    public JSONParserBaseTest(String val)
    {
        super(0);
    }

    public Number pubExtractFloat(String val, boolean acceptLeadingZ, boolean useHiPrecisionF) throws ParseException
    {
        xs = val;

        if (!acceptLeadingZ)
            checkLeadinZero();
        if (!useHiPrecisionF)
            return Float.parseFloat(xs);
        if (xs.length() > 18) // follow JSonIJ parsing method
            return new BigDecimal(xs);
        return Double.parseDouble(xs);
    }

    public Number pubCurrentExtractFloat(String val) throws ParseException
    {
        xs = val;
        return extractFloat();
    }

    protected void read() throws IOException
    {
        return;
    }

    protected void readNoEnd() throws IOException
    {
        return;
    }

    protected void readNQString(boolean[] stop) throws IOException
    {
        return;
    }

    protected Object readNumber(boolean[] stop) throws ParseException, IOException
    {
        return null;
    }

    void readS() throws IOException
    {
        return;
    }

    protected void readString() throws ParseException, IOException
    {
        return;
    }
}
