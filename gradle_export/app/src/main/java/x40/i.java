package x40;

import java.util.Comparator;

public final class i implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        String a = (String) obj;
        String b = (String) obj2;
        kotlin.jvm.internal.m.e(a, "a");
        kotlin.jvm.internal.m.e(b, "b");
        int iMin = Math.min(a.length(), b.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = a.charAt(i);
            char cCharAt2 = b.charAt(i);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.m.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a.length();
        int length2 = b.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
