package dl;

import db.g;
import g1.l8;
import h00.n;
import i2.s0;
import java.util.ArrayList;
import k1.h0;
import kh.o;
import m3.r0;
import m3.z;
import q3.a0;
import q3.l;
import q3.q;
import q3.r;
import q3.s;
import q3.t;
import q3.u;
import x3.i;

public abstract class f {
    public static final l a;
    public static final l b;
    public static final l c;
    public static final l8 d;

    static {
        u uVar = u.J;
        a0 a0VarC = c(uVar);
        u uVar2 = u.K;
        a0 a0VarC2 = c(uVar2);
        u uVar3 = u.L;
        a0 a0VarC3 = c(uVar3);
        u uVar4 = u.M;
        a = new l(n.k0(new a0[]{a0VarC, a0VarC2, a0VarC3, c(uVar4)}));
        b = new l(n.k0(new a0[]{b(uVar), b(uVar2), b(uVar3), b(uVar4)}));
        u uVar5 = u.G;
        a0 a0VarA = a(uVar5, 0);
        u uVar6 = u.H;
        a0 a0VarA2 = a(uVar6, 0);
        u uVar7 = u.I;
        a0 a0VarA3 = a(uVar7, 0);
        a0 a0VarA4 = a(uVar, 0);
        a0 a0VarA5 = a(uVar2, 0);
        a0 a0VarA6 = a(uVar3, 0);
        a0 a0VarA7 = a(uVar4, 0);
        u uVar8 = u.N;
        a0 a0VarA8 = a(uVar8, 0);
        u uVar9 = u.O;
        l lVar = new l(n.k0(new a0[]{a0VarA, a0VarA2, a0VarA3, a0VarA4, a0VarA5, a0VarA6, a0VarA7, a0VarA8, a(uVar9, 0), a(uVar5, 1), a(uVar6, 1), a(uVar7, 1), a(uVar, 1), a(uVar2, 1), a(uVar3, 1), a(uVar4, 1), a(uVar8, 1), a(uVar9, 1)}));
        c = lVar;
        r0 r0Var = h0.d;
        r0 r0Var2 = h0.e;
        r0 r0Var3 = h0.f;
        r0 r0Var4 = h0.g;
        r0 r0Var5 = h0.h;
        r0 r0Var6 = h0.i;
        r0 r0Var7 = h0.m;
        r0 r0Var8 = h0.n;
        r0 r0Var9 = h0.o;
        r0 r0Var10 = h0.a;
        r0 r0Var11 = h0.b;
        r0 r0Var12 = h0.c;
        r0 r0Var13 = h0.j;
        r0 r0Var14 = h0.k;
        r0 r0Var15 = h0.l;
        d = new l8(r0.a(r0Var, 0L, o.z(57), uVar4, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777177), r0.a(r0Var2, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var3, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var4, 0L, o.z(32), uVar4, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777177), r0.a(r0Var5, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var6, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var7, 0L, o.z(22), uVar3, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777177), r0.a(r0Var8, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var9, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var10, 0L, o.z(16), (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777181), r0.a(r0Var11, 0L, o.z(14), (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777181), r0.a(r0Var12, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var13, 0L, o.z(14), uVar2, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777177), r0.a(r0Var14, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0.a(r0Var15, 0L, 0L, (u) null, lVar, 0L, (s0) null, 0, 0L, (z) null, (i) null, 16777183), r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, r0Var9, r0Var10, r0Var11, r0Var12, r0Var13, r0Var14, r0Var15);
    }

    public static final a0 a(u uVar, int i) {
        int i2 = i == 1 ? 2131296257 : 2131296256;
        q[] qVarArr = new q[0];
        g gVar = new g(3);
        ArrayList arrayList = gVar.B;
        int i3 = uVar.A;
        if (1 > i3 || i3 >= 1001) {
            s3.a.a("'wght' value must be in [1, 1000]. Actual: " + i3);
        }
        gVar.a(new s(i3));
        float f = i;
        if (0.0f > f || f > 1.0f) {
            s3.a.a("'ital' must be in 0.0f..1.0f. Actual: " + f);
        }
        gVar.a(new r(f));
        gVar.f(qVarArr);
        return o.a(i2, uVar, i, new t((q[]) arrayList.toArray(new q[arrayList.size()])), 8);
    }

    public static final a0 b(u uVar) {
        int i = uVar.A;
        if (1 > i || i >= 1001) {
            s3.a.a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return o.a(2131296258, uVar, 0, new t(new q[]{new s(i)}), 12);
    }

    public static final a0 c(u uVar) {
        int i = uVar.A;
        if (1 > i || i >= 1001) {
            s3.a.a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return o.a(2131296260, uVar, 0, new t(new q[]{new s(i)}), 12);
    }
}
