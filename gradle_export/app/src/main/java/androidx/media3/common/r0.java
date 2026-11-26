package androidx.media3.common;

import java.util.HashSet;

public abstract class r0 {

    public static final HashSet f1466a = new HashSet();

    public static String f1467b = "media3.common";

    public static synchronized void a(String str) {
        if (f1466a.add(str)) {
            f1467b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f1467b;
    }
}
