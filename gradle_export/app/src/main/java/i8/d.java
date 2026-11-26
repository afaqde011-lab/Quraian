package i8;

import a8.i0;
import androidx.media3.common.ParserException;
import fh.d2;
import fh.q0;
import fh.r0;
import fh.t0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public abstract class d {

    public static final String[] f7530a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    public static final String[] f7531b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    public static final String[] f7532c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static i0 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!e7.a.j(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        r0 r0Var = t0.B;
        d2 d2VarB = d2.E;
        long j9 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (e7.a.j(xmlPullParserNewPullParser, "rdf:Description")) {
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    String strG = e7.a.g(xmlPullParserNewPullParser, f7530a[i11]);
                    if (strG != null) {
                        if (Integer.parseInt(strG) != 1) {
                            break loop0;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                String strG2 = e7.a.g(xmlPullParserNewPullParser, f7531b[i12]);
                                if (strG2 != null) {
                                    j9 = Long.parseLong(strG2);
                                    if (j9 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i12++;
                            }
                            j9 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i10 >= 2) {
                                r0 r0Var2 = t0.B;
                                d2VarB = d2.E;
                                break;
                            }
                            String strG3 = e7.a.g(xmlPullParserNewPullParser, f7532c[i10]);
                            if (strG3 != null) {
                                d2VarB = t0.t(new c(0L, 0L, "image/jpeg"), new c(Long.parseLong(strG3), 0L, "video/mp4"));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                return null;
            }
            if (e7.a.j(xmlPullParserNewPullParser, "Container:Directory")) {
                d2VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (e7.a.j(xmlPullParserNewPullParser, "GContainer:Directory")) {
                d2VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!e7.a.i(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (d2VarB.isEmpty()) {
            break loop0;
        }
        return new i0(j9, d2VarB, 6);
        return null;
    }

    public static d2 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        q0 q0VarM = t0.m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (e7.a.j(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strG = e7.a.g(xmlPullParser, strConcat3);
                String strG2 = e7.a.g(xmlPullParser, strConcat4);
                String strG3 = e7.a.g(xmlPullParser, strConcat5);
                String strG4 = e7.a.g(xmlPullParser, strConcat6);
                if (strG == null || strG2 == null) {
                    return d2.E;
                }
                q0VarM.c(new c(strG3 != null ? Long.parseLong(strG3) : 0L, strG4 != null ? Long.parseLong(strG4) : 0L, strG));
            }
        } while (!e7.a.i(xmlPullParser, strConcat2));
        return q0VarM.g();
    }
}
