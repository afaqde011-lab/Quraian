package a30;

import i20.u0;
import j10.n0;

public final class c0 implements u00.k {
    public static final c0 B = new c0();
    public final int A = 0;

    public c0() {
    }

    public c0(b30.c cVar) {
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                u0 it = (u0) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Integer.valueOf(it.D.size());
            default:
                kotlin.jvm.internal.m.e((n20.b) obj, "it");
                return n0.n;
        }
    }
}
