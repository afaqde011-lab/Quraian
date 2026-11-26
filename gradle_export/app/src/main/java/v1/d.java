package v1;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.r1;
import u00.n;

public abstract class d {

    public static final Object f15331a = new Object();

    public static final StackTraceElement[] f15332b = new StackTraceElement[0];

    public static final j f15333c = new j(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(g0 g0Var, n nVar) {
        m.c(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        d0.d(2, nVar);
        nVar.invoke(g0Var, 1);
    }

    public static final c d(int i10, g00.e eVar, l1.j jVar) {
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = new c(eVar, i10, true);
            g0Var.n0(objN);
        }
        c cVar = (c) objN;
        cVar.k(eVar);
        return cVar;
    }

    public static final boolean e(r1 r1Var, r1 r1Var2) {
        if (r1Var == null) {
            return true;
        }
        if (r1Var instanceof r1) {
            return !r1Var.b() || r1Var.equals(r1Var2) || m.a(r1Var.f9920c, r1Var2.f9920c);
        }
        return false;
    }
}
