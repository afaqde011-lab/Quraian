package w;

import l1.p2;

public final class t extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final u B;
    public final long C;

    public t(u uVar, long j9, int i10) {
        super(1);
        this.A = i10;
        this.B = uVar;
        this.C = j9;
    }

    public final Object invoke(Object obj) {
        long j9;
        x.y yVar;
        long j10;
        switch (this.A) {
            case 0:
                x.k1 k1Var = (x.k1) obj;
                Object objA = k1Var.a();
                u uVar = this.B;
                if (kotlin.jvm.internal.m.a(objA, uVar.R.a())) {
                    j9 = y3.l.b(uVar.S, m.f15790a) ? this.C : uVar.S;
                } else {
                    p2 p2Var = (p2) uVar.R.f15815d.g(k1Var.a());
                    j9 = p2Var != null ? ((y3.l) p2Var.getValue()).f16596a : 0L;
                }
                p2 p2Var2 = (p2) uVar.R.f15815d.g(k1Var.c());
                long j11 = p2Var2 != null ? ((y3.l) p2Var2.getValue()).f16596a : 0L;
                c2 c2Var = (c2) uVar.Q.getValue();
                return (c2Var == null || (yVar = (x.y) c2Var.f15745b.invoke(new y3.l(j9), new y3.l(j11))) == null) ? x.c.v(0.0f, 400.0f, null, 5) : yVar;
            default:
                u uVar2 = this.B;
                if (kotlin.jvm.internal.m.a(obj, uVar2.R.a())) {
                    j10 = y3.l.b(uVar2.S, m.f15790a) ? this.C : uVar2.S;
                } else {
                    p2 p2Var3 = (p2) uVar2.R.f15815d.g(obj);
                    j10 = p2Var3 != null ? ((y3.l) p2Var3.getValue()).f16596a : 0L;
                }
                return new y3.l(j10);
        }
    }
}
