package d0;

import java.util.List;

public final class k3 extends p1 {

    public final c40.h f4442f;

    public a40.u1 f4443g;

    public k3(u2 u2Var, av.o oVar, y3.c cVar) {
        super(u2Var, oVar, cVar);
        this.f4442f = ri.t1.b(Integer.MAX_VALUE, 6, null);
    }

    public static final java.lang.Object c(d0.k3 r16, d0.u2 r17, d0.i3 r18, m00.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: d0.k3.c(d0.k3, d0.u2, d0.i3, m00.c):java.lang.Object");
    }

    public static i3 e(c40.h hVar) {
        i3 i3Var = null;
        q30.k kVarF = ri.t1.F(new v0((Object) new h1(hVar, 1), (k00.c) i3Var, 1));
        while (kVarF.hasNext()) {
            i3 i3VarA = (i3) kVarF.next();
            if (i3Var != null) {
                i3VarA = i3Var.a(i3VarA);
            }
            i3Var = i3VarA;
        }
        return i3Var;
    }

    public final boolean d(v2.k kVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        c40.h hVar;
        u2 u2Var;
        v2.s sVar = (v2.s) h00.q.N0((List) kVar.f15387a);
        if (sVar != null) {
            h00.x xVar = sVar.m;
            if (xVar == null) {
                xVar = h00.x.A;
            }
            int size = xVar.size();
            int i10 = 0;
            z12 = false;
            while (true) {
                hVar = this.f4442f;
                u2Var = this.f4487a;
                if (i10 >= size) {
                    break;
                }
                v2.b bVar = (v2.b) xVar.get(i10);
                long j9 = bVar.f15355d ^ (-9223372034707292160L);
                if (!(u2Var.i(u2Var.e(j9)) == 0.0f)) {
                    z12 = !(hVar.j(new i3(j9, bVar.f15352a, false)) instanceof c40.n) || z12;
                }
                i10++;
            }
            z10 = true;
            z11 = false;
            long j10 = sVar.l ^ (-9223372034707292160L);
            boolean z13 = kVar.f15392f == 12;
            if (!(u2Var.i(u2Var.e(j10)) == 0.0f) || z13) {
                if (!(hVar.j(new i3(j10, sVar.f15400b, z13)) instanceof c40.n) || z12) {
                    z12 = true;
                }
            }
            return (!z12 || this.f4490d) ? z10 : z11;
        }
        z10 = true;
        z11 = false;
        z12 = z11;
        if (z12) {
        }
    }
}
