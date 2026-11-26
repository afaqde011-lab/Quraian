package fs;

import java.util.Locale;
import ss.o;

public final class j {
    public static o a(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1402931637:
                    if (lowerCase.equals("completed")) {
                        return o.C;
                    }
                    break;
                case -1281977283:
                    if (lowerCase.equals("failed")) {
                        return o.E;
                    }
                    break;
                case -682587753:
                    if (lowerCase.equals("pending")) {
                        return o.B;
                    }
                    break;
                case 1239105089:
                    if (lowerCase.equals("uploading")) {
                        return o.A;
                    }
                    break;
                case 2147444528:
                    if (lowerCase.equals("skipped")) {
                        return o.D;
                    }
                    break;
            }
        }
        return null;
    }
}
