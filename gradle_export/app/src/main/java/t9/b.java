package t9;

import android.view.View;
import c3.o0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.t;
import sy.e;

public abstract class b {

    public static final t f14419a = new t((u00.a) new e(9));

    public static s9.d a(j jVar) {
        s9.d dVar;
        g0 g0Var = (g0) jVar;
        s9.d dVar2 = (s9.d) g0Var.k(f14419a);
        if (dVar2 != null) {
            g0Var.c0(950834231);
            g0Var.r(false);
            return dVar2;
        }
        g0Var.c0(950836184);
        View view = (View) g0Var.k(o0.f2726f);
        m.e(view, "<this>");
        while (true) {
            dVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(2131363129);
            s9.d dVar3 = tag instanceof s9.d ? (s9.d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            }
            Object objE = bi.b.E(view);
            view = objE instanceof View ? (View) objE : null;
        }
        g0Var.r(false);
        return dVar;
    }
}
