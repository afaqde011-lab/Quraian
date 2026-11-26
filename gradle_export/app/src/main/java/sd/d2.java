package sd;

import com.caverock.androidsvg.SVGParseException;
import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

public final class d2 extends DefaultHandler2 {
    public final h2 A;

    public d2(h2 h2Var) {
        this.A = h2Var;
    }

    @Override
    public final void characters(char[] cArr, int i10, int i11) {
        this.A.G(new String(cArr, i10, i11));
    }

    @Override
    public final void endDocument() {
        this.A.getClass();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        this.A.c(str, str2, str3);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        h2.y(new com.google.android.gms.internal.play_billing.q1(str2));
        str.equals("xml-stylesheet");
    }

    @Override
    public final void startDocument() {
        this.A.E();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        this.A.F(str, str2, str3, attributes);
    }
}
