package eq;

import b2.r;
import d0.y;
import h0.z1;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.q;
import l1.r1;
import l1.y0;
import ri.t1;
import u00.n;

public abstract class m {
    public static final float a = 42;
    public static final float b = 48;
    public static final float c = 600;

    public static final void a(cq.i selectedTab, kk.c layerBackdrop, u00.k onTabSelected, r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(selectedTab, "selectedTab");
        kotlin.jvm.internal.m.e(layerBackdrop, "layerBackdrop");
        kotlin.jvm.internal.m.e(onTabSelected, "onTabSelected");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-837474826);
        int i2 = i | (g0Var.g(selectedTab) ? 4 : 2) | (g0Var.g(layerBackdrop) ? 32 : 16) | (g0Var.i(onTabSelected) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = oi.k.s(b(selectedTab), g0Var);
            }
            y0 y0Var = (y0) objN;
            boolean z = (i2 & 14) == 4;
            Object objN2 = g0Var.N();
            if (z || objN2 == obj) {
                objN2 = new f(selectedTab, y0Var, null, 1);
                g0Var.n0(objN2);
            }
            q.i(selectedTab, g0Var, (n) objN2);
            r rVarQ = z1.q(rVar, c);
            float f = 32;
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new c(y0Var, 1);
                g0Var.n0(objN3);
            }
            t1.d((u00.a) objN3, onTabSelected, layerBackdrop, rVarQ, 0L, (t) null, a, f, b, v1.d.d(1902921333, new y(1, onTabSelected), g0Var), v1.d.d(-681395116, new y(2, onTabSelected), g0Var), g0Var, ((i2 >> 3) & 112) | 918555654 | ((i2 << 3) & 896), 54, 96);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(selectedTab, layerBackdrop, onTabSelected, rVar, i, 1);
        }
    }

    public static final int b(cq.i iVar) {
        if (kotlin.jvm.internal.m.a(iVar, cq.c.b)) {
            return 0;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.f.b)) {
            return 1;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.e.b)) {
            return 2;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.d.b)) {
            return 3;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.h.b)) {
            return 4;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.g.b)) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
