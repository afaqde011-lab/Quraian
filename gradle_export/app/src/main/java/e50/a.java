package e50;

import com.revenuecat.purchases.common.Constants;

public final class a {
    public static final k50.l d;
    public static final k50.l e;
    public static final k50.l f;
    public static final k50.l g;
    public static final k50.l h;
    public static final k50.l i;
    public final k50.l a;
    public final k50.l b;
    public final int c;

    static {
        k50.l lVar = k50.l.D;
        d = sg.f.I(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        e = sg.f.I(":status");
        f = sg.f.I(":method");
        g = sg.f.I(":path");
        h = sg.f.I(":scheme");
        i = sg.f.I(":authority");
    }

    public a(String name, String value) {
        this(sg.f.I(name), sg.f.I(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        k50.l lVar = k50.l.D;
    }

    public a(k50.l name, String value) {
        this(name, sg.f.I(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        k50.l lVar = k50.l.D;
    }

    public a(k50.l name, k50.l value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        this.a = name;
        this.b = value;
        this.c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.a, aVar.a) && kotlin.jvm.internal.m.a(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.q() + ": " + this.b.q();
    }
}
