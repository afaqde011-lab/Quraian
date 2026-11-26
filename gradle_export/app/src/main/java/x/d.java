package x;

import l1.p2;

public abstract class d {

    public static final b1 f16271a = c.v(0.0f, 0.0f, null, 7);

    public static final b1 f16272b;

    static {
        h2.c cVar = z1.f16390a;
        f16272b = c.v(0.0f, 0.0f, new y3.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final p2 a(float f3, y yVar, String str, l1.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            yVar = f16272b;
        }
        y yVar2 = yVar;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        int i12 = i10 << 6;
        return c(new y3.f(f3), c.m, yVar2, null, str, jVar, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
    }

    public static final p2 b(float f3, y yVar, String str, l1.j jVar, int i10, int i11) {
        y yVar2;
        int i12 = i11 & 2;
        b1 b1Var = f16271a;
        if (i12 != 0) {
            yVar = b1Var;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (yVar == b1Var) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(1144115775);
            boolean z10 = (((i10 & 896) ^ 384) > 256 && g0Var.d(0.01f)) || (i10 & 384) == 256;
            Object objN = g0Var.N();
            if (z10 || objN == l1.i.f9868a) {
                objN = c.v(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                g0Var.n0(objN);
            }
            g0Var.r(false);
            yVar2 = (b1) objN;
        } else {
            l1.g0 g0Var2 = (l1.g0) jVar;
            g0Var2.c0(1144225701);
            g0Var2.r(false);
            yVar2 = yVar;
        }
        int i13 = i10 << 3;
        return c(Float.valueOf(f3), c.f16258k, yVar2, null, str2, jVar, (i10 & 14) | (57344 & i13) | (i13 & 458752), 0);
    }

    public static final p2 c(Object obj, r1 r1Var, i iVar, Float f3, String str, l1.j jVar, int i10, int i11) {
        i b1Var;
        Float f10 = (i11 & 8) != 0 ? null : f3;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = l1.q.z(null);
            g0Var.n0(objN);
        }
        l1.z0 z0Var = (l1.z0) objN;
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = new b(obj, r1Var, f10);
            g0Var.n0(objN2);
        }
        b bVar = (b) objN2;
        l1.z0 z0VarG = l1.q.G(null, jVar);
        if (f10 == null || !(iVar instanceof b1)) {
            b1Var = iVar;
        } else {
            b1 b1Var2 = (b1) iVar;
            if (kotlin.jvm.internal.m.a(b1Var2.f16247c, f10)) {
                b1Var = iVar;
            } else {
                b1Var = new b1(b1Var2.f16245a, b1Var2.f16246b, f10);
            }
        }
        l1.z0 z0VarG2 = l1.q.G(b1Var, jVar);
        Object objN3 = g0Var.N();
        if (objN3 == cVar) {
            objN3 = ri.t1.b(-1, 6, null);
            g0Var.n0(objN3);
        }
        c40.l lVar = (c40.l) objN3;
        boolean zI = g0Var.i(lVar) | ((((i10 & 14) ^ 6) > 4 && g0Var.i(obj)) || (i10 & 6) == 4);
        Object objN4 = g0Var.N();
        if (zI || objN4 == cVar) {
            objN4 = new l6.c(lVar, obj, 27);
            g0Var.n0(objN4);
        }
        l1.q.k((u00.a) objN4, jVar);
        boolean zI2 = g0Var.i(lVar) | g0Var.i(bVar) | g0Var.g(z0VarG2) | g0Var.g(z0VarG);
        Object objN5 = g0Var.N();
        if (zI2 || objN5 == cVar) {
            androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(lVar, bVar, z0VarG2, z0VarG, (k00.c) null);
            g0Var.n0(n0Var);
            objN5 = n0Var;
        }
        l1.q.i(lVar, jVar, (u00.n) objN5);
        p2 p2Var = (p2) z0Var.getValue();
        return p2Var == null ? bVar.f16234c : p2Var;
    }
}
