package b1;

import a1.s2;
import a1.w2;
import g1.l3;
import g1.x5;
import m3.n0;
import m3.q0;
import q0.y0;

public final class k implements u00.n {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public k(e0 e0Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, y0 y0Var, boolean z10) {
        this.A = 0;
        this.C = yVar;
        this.E = e0Var;
        this.F = y0Var;
        this.D = yVar2;
        this.B = z10;
    }

    public k(Object obj, boolean z10, u00.a aVar, u00.a aVar2, b2.r rVar, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = z10;
        this.D = aVar;
        this.E = aVar2;
        this.F = rVar;
    }

    public k(u00.a aVar, b2.r rVar, boolean z10, l3 l3Var, v1.c cVar, int i10) {
        this.A = 3;
        this.C = aVar;
        this.D = rVar;
        this.B = z10;
        this.E = l3Var;
        this.F = cVar;
    }

    public k(boolean z10, Object obj, u00.a aVar, g00.e eVar, u00.a aVar2, int i10, int i11) {
        this.A = i11;
        this.B = z10;
        this.C = obj;
        this.D = aVar;
        this.E = eVar;
        this.F = aVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iG;
        int iG2;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj6;
                e0 e0Var = (e0) obj4;
                y0 y0Var = (y0) obj3;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj5;
                yVar.A = h2.b.f(yVar.A, ((h2.b) obj2).f6544a);
                s2 s2Var = e0Var.f1941b;
                w2 w2Var = e0Var.f1940a;
                n0 n0VarC = s2Var.c();
                if (n0VarC != null) {
                    m3.q qVar = n0VarC.f10497b;
                    e0Var.A(y0Var, h2.b.f(yVar2.A, yVar.A));
                    boolean z10 = this.B;
                    if (z10) {
                        iG = qVar.g(e0Var.n());
                    } else {
                        long j9 = w2Var.d().D;
                        int i11 = q0.f10519c;
                        iG = (int) (j9 >> 32);
                    }
                    int i12 = iG;
                    if (z10) {
                        long j10 = w2Var.d().D;
                        int i13 = q0.f10519c;
                        iG2 = (int) (j10 & 4294967295L);
                    } else {
                        iG2 = qVar.g(e0Var.n());
                    }
                    int i14 = iG2;
                    long j11 = w2Var.d().D;
                    long jB = e0Var.B(w2Var.d(), i12, i14, z10, e1.v.f5013h, false, false, new q2.b(9));
                    if (q0.d(j11) || !q0.d(jB)) {
                        w2Var.j(jB);
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                cz.a.a((ry.a) obj6, this.B, (u00.a) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, iK);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                eu.a.s(this.B, (u00.a) obj6, (u00.a) obj5, (u00.a) obj4, (u00.a) obj3, (l1.j) obj, iK2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(196615);
                x5.e((u00.a) obj6, (b2.r) obj5, this.B, (l3) obj4, (v1.c) obj3, (l1.j) obj, iK3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iK4 = l1.q.K(1);
                st.j.j(this.B, (rt.g) obj6, (u00.a) obj5, (u00.k) obj4, (u00.a) obj3, (l1.j) obj, iK4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK5 = l1.q.K(49);
                wr.g.e((u30.b) obj6, this.B, (u00.a) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, iK5);
                break;
        }
        return b0Var;
    }
}
