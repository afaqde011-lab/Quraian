package ib;

import android.net.NetworkRequest;
import za.v;

public final class f {

    public static final String f7570b;

    public final Object f7571a;

    static {
        String strF = v.f("NetworkRequestCompat");
        kotlin.jvm.internal.m.d(strF, "tagWithPrefix(...)");
        f7570b = strF;
    }

    public f(NetworkRequest networkRequest) {
        this.f7571a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f7571a, ((f) obj).f7571a);
    }

    public final int hashCode() {
        Object obj = this.f7571a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f7571a + ')';
    }
}
