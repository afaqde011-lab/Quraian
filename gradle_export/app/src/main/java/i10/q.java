package i10;

import h00.z;
import j10.e0;
import j10.h0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import m10.a0;

public final class q implements h0 {
    public final d30.l a;
    public final a0 b;
    public a30.i c;
    public final d30.j d;

    public q(d30.l lVar, hf.c cVar, a0 a0Var) {
        this.a = lVar;
        this.b = a0Var;
        this.d = lVar.c(new a20.d(this, 2));
    }

    @Override
    public final boolean a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        d30.j jVar = this.d;
        Object obj = jVar.B.get(fqName);
        return ((obj == null || obj == d30.k.B) ? c(fqName) : (e0) jVar.invoke(fqName)) == null;
    }

    @Override
    public final void b(n20.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        n30.l.a(arrayList, this.d.invoke(fqName));
    }

    public final b30.c c(n20.c fqName) {
        InputStream inputStreamA;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        n20.e segment = g10.p.k;
        kotlin.jvm.internal.m.e(segment, "segment");
        if (fqName.a.h(segment)) {
            b30.a.m.getClass();
            inputStreamA = b30.d.a(b30.a.a(fqName));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return va.a.q(fqName, this.a, this.b, inputStreamA);
        }
        return null;
    }

    @Override
    public final Collection h(n20.c fqName, u00.k kVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return z.A;
    }
}
