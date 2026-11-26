package d1;

import b2.q;
import b3.e1;
import c3.d2;
import java.util.List;
import kotlin.Metadata;
import m3.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld1/f;", "Lb3/e1;", "Ld1/i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends e1 {
    public final m3.h B;
    public final r0 C;
    public final q3.h D;
    public final u00.k E;
    public final int F;
    public final boolean G;
    public final int H;
    public final int I;
    public final List J;
    public final u00.k K;
    public final u00.k L;

    public f(m3.h hVar, r0 r0Var, q3.h hVar2, u00.k kVar, int i10, boolean z10, int i11, int i12, List list, u00.k kVar2, u00.k kVar3) {
        this.B = hVar;
        this.C = r0Var;
        this.D = hVar2;
        this.E = kVar;
        this.F = i10;
        this.G = z10;
        this.H = i11;
        this.I = i12;
        this.J = list;
        this.K = kVar2;
        this.L = kVar3;
    }

    @Override
    public final q d() {
        i iVar = new i();
        iVar.O = this.B;
        iVar.P = this.C;
        iVar.Q = this.D;
        iVar.R = this.E;
        iVar.S = this.F;
        iVar.T = this.G;
        iVar.U = this.H;
        iVar.V = this.I;
        iVar.W = this.J;
        iVar.X = this.K;
        iVar.Y = this.L;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.B, fVar.B) && kotlin.jvm.internal.m.a(this.C, fVar.C) && kotlin.jvm.internal.m.a(this.J, fVar.J) && kotlin.jvm.internal.m.a(this.D, fVar.D) && this.E == fVar.E && this.L == fVar.L && this.F == fVar.F && this.G == fVar.G && this.H == fVar.H && this.I == fVar.I && this.K == fVar.K;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        int iHashCode = (this.D.hashCode() + a1.b.g(this.C, this.B.hashCode() * 31, 31)) * 31;
        u00.k kVar = this.E;
        int iE = (((w.c.e(w.c.d(this.F, (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31, 31), 31, this.G) + this.H) * 31) + this.I) * 31;
        List list = this.J;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        u00.k kVar2 = this.K;
        int iHashCode3 = (iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 29791;
        u00.k kVar3 = this.L;
        return iHashCode3 + (kVar3 != null ? kVar3.hashCode() : 0);
    }

    @Override
    public final void i(q qVar) {
        boolean z10;
        m3.h hVar;
        boolean zA;
        boolean z11;
        boolean z12;
        boolean z13;
        List list;
        List list2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        q3.h hVar2;
        q3.h hVar3;
        int i14;
        int i15;
        u00.k kVar;
        u00.k kVar2;
        boolean z16;
        boolean z17;
        u00.k kVar3;
        u00.k kVar4;
        u00.k kVar5;
        u00.k kVar6;
        d dVarB1;
        boolean zD;
        i iVar = (i) qVar;
        r0 r0Var = iVar.P;
        r0 r0Var2 = this.C;
        if (r0Var2 != r0Var) {
            if (!r0Var2.f10522a.b(r0Var.f10522a)) {
                z10 = true;
            }
            String str = iVar.O.B;
            hVar = this.B;
            zA = kotlin.jvm.internal.m.a(str, hVar.B);
            boolean zA2 = kotlin.jvm.internal.m.a(iVar.O.A, hVar.A);
            if (zA || !zA2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                iVar.O = hVar;
            }
            if (!zA) {
                iVar.f4583c0 = null;
            }
            r0 r0Var3 = iVar.P;
            r0 r0Var4 = this.C;
            z12 = true;
            z13 = !r0Var3.d(r0Var4);
            iVar.P = r0Var4;
            list = iVar.W;
            list2 = this.J;
            if (!kotlin.jvm.internal.m.a(list, list2)) {
                iVar.W = list2;
                z13 = true;
            }
            i10 = iVar.V;
            i11 = this.I;
            if (i10 != i11) {
                iVar.V = i11;
                z13 = true;
            }
            i12 = iVar.U;
            i13 = this.H;
            if (i12 != i13) {
                iVar.U = i13;
                z13 = true;
            }
            z14 = iVar.T;
            z15 = this.G;
            if (z14 != z15) {
                iVar.T = z15;
                z13 = true;
            }
            hVar2 = iVar.Q;
            hVar3 = this.D;
            if (!kotlin.jvm.internal.m.a(hVar2, hVar3)) {
                iVar.Q = hVar3;
                z13 = true;
            }
            i14 = iVar.S;
            i15 = this.F;
            if (i14 == i15) {
                z12 = z13;
            } else {
                iVar.S = i15;
            }
            kVar = iVar.R;
            kVar2 = this.E;
            z16 = true;
            if (kVar != kVar2) {
                iVar.R = kVar2;
                z17 = true;
            } else {
                z17 = false;
            }
            kVar3 = iVar.X;
            kVar4 = this.K;
            if (kVar3 != kVar4) {
                iVar.X = kVar4;
                z17 = true;
            }
            kVar5 = iVar.Y;
            kVar6 = this.L;
            if (kVar5 != kVar6) {
                iVar.Y = kVar6;
            } else {
                z16 = z17;
            }
            if (!z11 || z12 || z16) {
                dVarB1 = iVar.B1();
                m3.h hVar4 = iVar.O;
                r0 r0Var5 = iVar.P;
                q3.h hVar5 = iVar.Q;
                int i16 = iVar.S;
                boolean z18 = iVar.T;
                int i17 = iVar.U;
                int i18 = iVar.V;
                List list3 = iVar.W;
                dVarB1.f4545a = hVar4;
                zD = r0Var5.d(dVarB1.f4555k);
                dVarB1.f4555k = r0Var5;
                if (!zD) {
                    dVarB1.f4559q <<= 2;
                    dVarB1.l = null;
                    dVarB1.f4556n = null;
                    dVarB1.f4558p = -1;
                    dVarB1.f4557o = -1;
                }
                dVarB1.f4546b = hVar5;
                dVarB1.f4547c = i16;
                dVarB1.f4548d = z18;
                dVarB1.f4549e = i17;
                dVarB1.f4550f = i18;
                dVarB1.f4551g = list3;
                dVarB1.f4559q = (dVarB1.f4559q << 2) | 2;
                dVarB1.l = null;
                dVarB1.f4556n = null;
                dVarB1.f4558p = -1;
                dVarB1.f4557o = -1;
            } else {
                z11 = z11;
            }
            if (iVar.N) {
                if (z11 || (z10 && iVar.f4582b0 != null)) {
                    b3.m.o(iVar);
                }
                if (z11 || z12 || z16) {
                    b3.m.n(iVar);
                    b3.m.m(iVar);
                }
                if (z10) {
                    b3.m.m(iVar);
                }
            }
            return;
        }
        r0Var2.getClass();
        z10 = false;
        String str2 = iVar.O.B;
        hVar = this.B;
        zA = kotlin.jvm.internal.m.a(str2, hVar.B);
        boolean zA3 = kotlin.jvm.internal.m.a(iVar.O.A, hVar.A);
        if (zA) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (z11) {
            iVar.O = hVar;
        }
        if (!zA) {
            iVar.f4583c0 = null;
        }
        r0 r0Var6 = iVar.P;
        r0 r0Var7 = this.C;
        z12 = true;
        z13 = !r0Var6.d(r0Var7);
        iVar.P = r0Var7;
        list = iVar.W;
        list2 = this.J;
        if (!kotlin.jvm.internal.m.a(list, list2)) {
            iVar.W = list2;
            z13 = true;
        }
        i10 = iVar.V;
        i11 = this.I;
        if (i10 != i11) {
            iVar.V = i11;
            z13 = true;
        }
        i12 = iVar.U;
        i13 = this.H;
        if (i12 != i13) {
            iVar.U = i13;
            z13 = true;
        }
        z14 = iVar.T;
        z15 = this.G;
        if (z14 != z15) {
            iVar.T = z15;
            z13 = true;
        }
        hVar2 = iVar.Q;
        hVar3 = this.D;
        if (!kotlin.jvm.internal.m.a(hVar2, hVar3)) {
            iVar.Q = hVar3;
            z13 = true;
        }
        i14 = iVar.S;
        i15 = this.F;
        if (i14 == i15) {
            z12 = z13;
        } else {
            iVar.S = i15;
        }
        kVar = iVar.R;
        kVar2 = this.E;
        z16 = true;
        if (kVar != kVar2) {
            iVar.R = kVar2;
            z17 = true;
        } else {
            z17 = false;
        }
        kVar3 = iVar.X;
        kVar4 = this.K;
        if (kVar3 != kVar4) {
            iVar.X = kVar4;
            z17 = true;
        }
        kVar5 = iVar.Y;
        kVar6 = this.L;
        if (kVar5 != kVar6) {
            iVar.Y = kVar6;
        } else {
            z16 = z17;
        }
        if (z11) {
            dVarB1 = iVar.B1();
            m3.h hVar6 = iVar.O;
            r0 r0Var8 = iVar.P;
            q3.h hVar7 = iVar.Q;
            int i19 = iVar.S;
            boolean z19 = iVar.T;
            int i110 = iVar.U;
            int i111 = iVar.V;
            List list4 = iVar.W;
            dVarB1.f4545a = hVar6;
            zD = r0Var8.d(dVarB1.f4555k);
            dVarB1.f4555k = r0Var8;
            if (!zD) {
                dVarB1.f4559q <<= 2;
                dVarB1.l = null;
                dVarB1.f4556n = null;
                dVarB1.f4558p = -1;
                dVarB1.f4557o = -1;
            }
            dVarB1.f4546b = hVar7;
            dVarB1.f4547c = i19;
            dVarB1.f4548d = z19;
            dVarB1.f4549e = i110;
            dVarB1.f4550f = i111;
            dVarB1.f4551g = list4;
            dVarB1.f4559q = (dVarB1.f4559q << 2) | 2;
            dVarB1.l = null;
            dVarB1.f4556n = null;
            dVarB1.f4558p = -1;
            dVarB1.f4557o = -1;
        } else {
            dVarB1 = iVar.B1();
            m3.h hVar8 = iVar.O;
            r0 r0Var9 = iVar.P;
            q3.h hVar9 = iVar.Q;
            int i112 = iVar.S;
            boolean z110 = iVar.T;
            int i113 = iVar.U;
            int i114 = iVar.V;
            List list5 = iVar.W;
            dVarB1.f4545a = hVar8;
            zD = r0Var9.d(dVarB1.f4555k);
            dVarB1.f4555k = r0Var9;
            if (!zD) {
                dVarB1.f4559q <<= 2;
                dVarB1.l = null;
                dVarB1.f4556n = null;
                dVarB1.f4558p = -1;
                dVarB1.f4557o = -1;
            }
            dVarB1.f4546b = hVar9;
            dVarB1.f4547c = i112;
            dVarB1.f4548d = z110;
            dVarB1.f4549e = i113;
            dVarB1.f4550f = i114;
            dVarB1.f4551g = list5;
            dVarB1.f4559q = (dVarB1.f4559q << 2) | 2;
            dVarB1.l = null;
            dVarB1.f4556n = null;
            dVarB1.f4558p = -1;
            dVarB1.f4557o = -1;
        }
        if (iVar.N) {
            return;
        }
        if (z11) {
            b3.m.o(iVar);
        } else {
            b3.m.o(iVar);
        }
        if (z11) {
            b3.m.n(iVar);
            b3.m.m(iVar);
        } else {
            b3.m.n(iVar);
            b3.m.m(iVar);
        }
        if (z10) {
            b3.m.m(iVar);
        }
    }
}
