package jx;

import p40.o0;

public final class p {
    public static final o Companion = new o();
    public final int a;
    public final Integer b;

    public p(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public p(int i, Integer num, int i2) {
        if (1 != (i & 1)) {
            o0.g(i, 1, n.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && kotlin.jvm.internal.m.a(this.b, pVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TopRecitersLauncherItem(reciterId=" + this.a + ", listensCount=" + this.b + ")";
    }
}
