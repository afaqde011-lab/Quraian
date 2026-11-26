package q30;

import c3.y2;
import com.google.android.gms.internal.measurement.g4;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import q0.f2;

public abstract class l extends m {
    public static j j0(Iterator it) {
        kotlin.jvm.internal.m.e(it, "<this>");
        return new a(new y2(it, 4));
    }

    public static int k0(j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        Iterator it = jVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                va.a.j0();
                throw null;
            }
        }
        return i;
    }

    public static j l0(j jVar, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return jVar;
        }
        return jVar instanceof c ? ((c) jVar).b(i) : new b(jVar, i, 0);
    }

    public static final g m0(j jVar) {
        pp.d dVar = new pp.d(16);
        if (!(jVar instanceof r)) {
            return new g(jVar, new xn.a(17), dVar);
        }
        r rVar = (r) jVar;
        return new g(rVar.a, rVar.b, dVar);
    }

    public static j n0(Object obj, u00.k nextFunction) {
        kotlin.jvm.internal.m.e(nextFunction, "nextFunction");
        return obj == null ? d.a : new i((u00.a) new f2(obj, 1), nextFunction);
    }

    public static j o0(u00.a aVar) {
        return new a(new i(aVar, (u00.k) new ca.q(12, aVar)));
    }

    public static String p0(j jVar, String str) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : jVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            g4.q(sb, obj, (u00.k) null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object q0(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static r r0(j jVar, u00.k transform) {
        kotlin.jvm.internal.m.e(transform, "transform");
        return new r(jVar, transform);
    }

    public static f s0(j jVar, u00.k kVar) {
        return new f(new r(jVar, kVar), false, new pp.d(17));
    }

    public static j t0(j jVar, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return d.a;
        }
        return jVar instanceof c ? ((c) jVar).a(i) : new b(jVar, i, 1);
    }

    public static List u0(j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return x.A;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return va.a.R(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
