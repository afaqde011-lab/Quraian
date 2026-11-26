package sd;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

public final class g2 implements Attributes {

    public XmlPullParser f13987a;

    @Override
    public final int getIndex(String str) {
        return -1;
    }

    @Override
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override
    public final int getLength() {
        return this.f13987a.getAttributeCount();
    }

    @Override
    public final String getLocalName(int i10) {
        return this.f13987a.getAttributeName(i10);
    }

    @Override
    public final String getQName(int i10) {
        XmlPullParser xmlPullParser = this.f13987a;
        String attributeName = xmlPullParser.getAttributeName(i10);
        if (xmlPullParser.getAttributePrefix(i10) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i10) + ':' + attributeName;
    }

    @Override
    public final String getType(int i10) {
        return null;
    }

    @Override
    public final String getType(String str) {
        return null;
    }

    @Override
    public final String getType(String str, String str2) {
        return null;
    }

    @Override
    public final String getURI(int i10) {
        return this.f13987a.getAttributeNamespace(i10);
    }

    @Override
    public final String getValue(int i10) {
        return this.f13987a.getAttributeValue(i10);
    }

    @Override
    public final String getValue(String str) {
        return null;
    }

    @Override
    public final String getValue(String str, String str2) {
        return null;
    }
}
