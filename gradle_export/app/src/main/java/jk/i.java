package jk;

import g00.b0;
import kotlin.jvm.internal.m;

public final class i implements u00.k {
    public final int A;
    public final y3.c B;
    public final u00.k C;

    public i(u00.k kVar, y3.c cVar, int i10) {
        this.A = i10;
        this.C = kVar;
        this.B = cVar;
    }

    public i(y3.c cVar, u00.k kVar, int i10) {
        this.A = i10;
        this.B = cVar;
        this.C = kVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                u00.k kVar = this.C;
                k2.d dVar = (k2.d) obj;
                m.e(dVar, "$this$record");
                y3.c cVarO = dVar.G0().o();
                dVar.G0().z(this.B);
                try {
                    kVar.invoke(dVar);
                } finally {
                    dVar.G0().z(cVarO);
                }
                break;
            case 1:
                this.C.invoke(new jx.g(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            case 2:
                this.C.invoke(new jx.i(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            case 3:
                this.C.invoke(new jx.i(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            case 4:
                this.C.invoke(new qx.i(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            case 5:
                this.C.invoke(new qx.i(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            default:
                this.C.invoke(new qx.g(this.B.h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
        }
        return b0.a;
    }
}
