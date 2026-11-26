package hb;

import g00.b0;

public final class v implements u00.k {
    public final int A;
    public final x B;
    public final ma.a C;

    public v(x xVar, ma.a aVar, int i10) {
        this.A = i10;
        this.B = xVar;
        this.C = aVar;
    }

    public final Object invoke(Object obj) {
        u.e eVar = (u.e) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(eVar, "_tmpMap");
                this.B.a(this.C, eVar);
                break;
            default:
                kotlin.jvm.internal.m.e(eVar, "_tmpMap");
                this.B.b(this.C, eVar);
                break;
        }
        return b0.a;
    }
}
