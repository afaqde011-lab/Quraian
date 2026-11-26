package i30;

import e30.z0;
import j10.h;
import j10.q0;
import j10.r0;
import kotlin.jvm.internal.m;
import u00.k;

public final class a implements k {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        z0 it = (z0) obj;
        switch (this.A) {
            case 0:
                m.e(it, "it");
                h hVarG = it.m0().g();
                return Boolean.valueOf(hVarG != null && (hVarG instanceof r0) && (((r0) hVarG).l() instanceof q0));
            default:
                m.e(it, "it");
                h hVarG2 = it.m0().g();
                return Boolean.valueOf(hVarG2 != null && ((hVarG2 instanceof q0) || (hVarG2 instanceof r0)));
        }
    }
}
