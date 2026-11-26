package tp;

import android.view.View;
import androidx.lifecycle.w;
import bt.y0;
import c3.o0;
import g00.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.p1;
import l1.q;
import l1.q1;
import l1.q2;
import l1.r1;
import u00.k;
import u00.n;

public abstract class h {
    public static final float c;
    public static final float d;
    public static final q2 a = new q2(new sy.e(12));
    public static final q2 b = new q2(new sy.e(13));
    public static final float e = 320;
    public static final float f = 16;

    static {
        float f2 = 560;
        c = f2;
        d = f2;
    }

    public static final void a(u00.a onDismiss, u00.a onBackToMethod, u00.a aVar, j jVar, int i) {
        m.e(onDismiss, "onDismiss");
        m.e(onBackToMethod, "onBackToMethod");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-406797624);
        int i2 = i | (g0Var.i(onDismiss) ? 4 : 2) | (g0Var.i(onBackToMethod) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            g0Var.X();
            if ((i & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new e();
                g0Var.n0(objN);
            }
            e eVar = (e) objN;
            boolean zI = g0Var.i(eVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new q0.a(eVar, 12);
                g0Var.n0(objN2);
            }
            q.e(b0.a, (k) objN2, g0Var);
            p1 p1Var = r6.d.a;
            w wVar = (w) g0Var.k(p1Var);
            p1 p1Var2 = ja.a.a;
            ia.g gVar = (ia.g) g0Var.k(p1Var2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((((i2 & 896) ^ 384) > 256 && g0Var.g(aVar)) || (i2 & 384) == 256);
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new d(onDismiss, aVar, onBackToMethod);
                g0Var.n0(objN3);
            }
            q.b(new q1[]{u6.a.a.a(eVar), p1Var.a(wVar), p1Var2.a(gVar), b.a((d) objN3)}, v1.d.d(-2095872504, new eu.d(20, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(onDismiss, onBackToMethod, aVar, i, 0);
        }
    }

    public static final void b(u00.a onDismiss, u00.a onBackToMethod, u00.a aVar, j jVar, int i) {
        m.e(onDismiss, "onDismiss");
        m.e(onBackToMethod, "onBackToMethod");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-870401628);
        int i2 = i | (g0Var.i(onDismiss) ? 4 : 2) | (g0Var.i(onBackToMethod) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            g0Var.X();
            if ((i & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new g();
                g0Var.n0(objN);
            }
            g gVar = (g) objN;
            boolean zI = g0Var.i(gVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new q0.a(gVar, 13);
                g0Var.n0(objN2);
            }
            q.e(b0.a, (k) objN2, g0Var);
            p1 p1Var = r6.d.a;
            w wVar = (w) g0Var.k(p1Var);
            p1 p1Var2 = ja.a.a;
            ia.g gVar2 = (ia.g) g0Var.k(p1Var2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((((i2 & 896) ^ 384) > 256 && g0Var.g(aVar)) || (i2 & 384) == 256);
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new f(onDismiss, aVar, onBackToMethod);
                g0Var.n0(objN3);
            }
            q.b(new q1[]{u6.a.a.a(gVar), p1Var.a(wVar), p1Var2.a(gVar2), a.a(Boolean.TRUE), b.a((f) objN3)}, v1.d.d(-1692115356, new eu.d(21, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(onDismiss, onBackToMethod, aVar, i, 1);
        }
    }

    public static final void c(j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1373096675);
        if (g0Var.S(i & 1, i != 0)) {
            View view = (View) g0Var.k(o0.f);
            boolean zI = g0Var.i(view);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.a) {
                objN = new y0(view, null, 9);
                g0Var.n0(objN);
            }
            q.i(view, g0Var, (n) objN);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 7);
        }
    }
}
