package r30;

import java.nio.charset.Charset;

public abstract class a {
    public static final Charset a;
    public static volatile Charset b;
    public static volatile Charset c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        a = charsetForName;
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
