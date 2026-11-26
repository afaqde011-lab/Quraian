package x10;

import ri.t1;

public abstract class u {
    public static final n20.c a;
    public static final n20.b b;

    static {
        n20.c cVar = new n20.c("kotlin.jvm.JvmField");
        a = cVar;
        kh.n.n0(cVar);
        kh.n.n0(new n20.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = kh.n.F("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        kotlin.jvm.internal.m.e(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + t1.p(propertyName);
    }

    public static final String b(String str) {
        String strP;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strP = str.substring(2);
            kotlin.jvm.internal.m.d(strP, "substring(...)");
        } else {
            strP = t1.p(str);
        }
        sb.append(strP);
        return sb.toString();
    }

    public static final boolean c(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        if (r30.r.x0(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (kotlin.jvm.internal.m.f(97, cCharAt) > 0 || kotlin.jvm.internal.m.f(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
