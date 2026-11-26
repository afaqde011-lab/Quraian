package at;

import a40.t;
import androidx.lifecycle.f1;
import c7.i;
import cq.l;
import g00.k;
import java.util.List;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.j;
import l1.r1;
import q50.c;

public abstract class a {
    public static final List a = va.a.S(new k[]{new k(1, 2131886383), new k(3, 2131886386), new k(6, 2131886385), new k(12, 2131886384), new k(24, 2131886387)});

    public static final void a(j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1912316312);
        if (g0Var.S(i & 1, i != 0)) {
            l.a(g0Var);
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            i.S(a0.a.b(b.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), c.a(g0Var), (u00.a) null);
            throw new ClassCastException();
        }
        g0Var.V();
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new t(i);
        }
    }
}
