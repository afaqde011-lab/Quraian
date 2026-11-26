package p30;

import a10.a0;
import a10.z;
import com.google.android.gms.internal.measurement.x5;
import d10.d2;
import d10.r1;
import h00.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.b0;
import qd.s0;

public final class n implements u00.k {
    public final int A = 0;
    public final n20.c B;
    public final a10.d C;

    public n(a10.d dVar, n20.c cVar) {
        this.C = dVar;
        this.B = cVar;
    }

    public n(n20.c cVar, a10.d dVar) {
        this.B = cVar;
        this.C = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        a10.d dVarG;
        switch (this.A) {
            case 0:
                a10.d dVar = this.C;
                n20.c cVar = this.B;
                m klass = (m) obj;
                kotlin.jvm.internal.m.e(klass, "klass");
                List typeParameters = dVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(h00.r.q0(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    r1 r1Var = new r1(klass, ((r1) it.next()).C, (kotlin.jvm.internal.m.a(cVar, g10.o.J) || kotlin.jvm.internal.m.a(cVar, g10.o.I)) ? a0.C : a0.A);
                    r1Var.F = va.a.R(d2.b);
                    arrayList.add(r1Var);
                }
                return arrayList;
            default:
                x xVar = x.A;
                n20.c cVar2 = this.B;
                a10.d dVar2 = this.C;
                m klass2 = (m) obj;
                kotlin.jvm.internal.m.e(klass2, "klass");
                if (kotlin.jvm.internal.m.a(cVar2, g10.o.K)) {
                    a10.x xVarA = kotlin.jvm.internal.a0.a(Iterable.class, z.c);
                    b0 b0Var = kotlin.jvm.internal.a0.a;
                    dVarG = ((a) b0Var.d(xVarA)).g();
                    if (dVarG == null) {
                        throw new a40.b0(x5.p(b0Var, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (kotlin.jvm.internal.m.a(cVar2, g10.o.L)) {
                    a10.x xVarA2 = kotlin.jvm.internal.a0.a(Collection.class, z.c);
                    b0 b0Var2 = kotlin.jvm.internal.a0.a;
                    dVarG = ((a) b0Var2.d(xVarA2)).g();
                    if (dVarG == null) {
                        throw new a40.b0(x5.p(b0Var2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (kotlin.jvm.internal.m.a(cVar2, g10.o.N)) {
                    a10.x xVarA3 = kotlin.jvm.internal.a0.a(Collection.class, z.c);
                    b0 b0Var3 = kotlin.jvm.internal.a0.a;
                    dVarG = ((a) b0Var3.d(xVarA3)).g();
                    if (dVarG == null) {
                        throw new a40.b0(x5.p(b0Var3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (kotlin.jvm.internal.m.a(cVar2, g10.o.M)) {
                    a10.x xVarA4 = kotlin.jvm.internal.a0.a(Iterator.class, z.c);
                    b0 b0Var4 = kotlin.jvm.internal.a0.a;
                    dVarG = ((a) b0Var4.d(xVarA4)).g();
                    if (dVarG == null) {
                        throw new a40.b0(x5.p(b0Var4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    dVarG = null;
                }
                List<r1> list = klass2.C;
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
                for (r1 r1Var2 : list) {
                    z zVar = z.c;
                    arrayList2.add(a.a.I(s0.a0(r1Var2, xVar, false, xVar)));
                }
                List listC0 = h00.n.C0(new a10.d[]{dVar2, dVarG});
                ArrayList arrayList3 = new ArrayList(h00.r.q0(listC0, 10));
                Iterator it2 = ((ArrayList) listC0).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(s0.a0((a10.d) it2.next(), arrayList2, false, xVar));
                }
                return arrayList3;
        }
    }
}
