package q40;

import kotlin.NoWhenBranchMatchedException;
import l0.h1;
import l1.q1;
import qd.j0;

public abstract class c {
    public static final b d = new b(new q1(false, true, "    ", "type", true, a.B), s40.e.a);
    public final q1 a;
    public final ce.c b;
    public final o10.b c = new o10.b(13);

    public c(q1 q1Var, ce.c cVar) {
        this.a = q1Var;
        this.b = cVar;
    }

    public final Object a(l40.a deserializer, l element) {
        o40.c lVar;
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        kotlin.jvm.internal.m.e(element, "element");
        String str = null;
        if (element instanceof x) {
            lVar = new r40.n(this, (x) element, str, 12);
        } else if (element instanceof e) {
            lVar = new r40.o(this, (e) element);
        } else {
            if (!(element instanceof r) && !element.equals(u.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new r40.l(this, (b0) element, null);
        }
        return lVar.j(deserializer);
    }

    public final Object b(String string, l40.a deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        kotlin.jvm.internal.m.e(string, "string");
        a20.g gVar = new a20.g(string);
        Object objJ = new r40.t(this, r40.x.OBJ, gVar, deserializer.getDescriptor(), null).j(deserializer);
        if (gVar.l() == 10) {
            return objJ;
        }
        a20.g.u(gVar, "Expected EOF after parsing, but had " + string.charAt(gVar.B - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final l c(l40.a serializer, Object obj) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        new r40.m(this, (u00.k) new h1(zVar, 1), 1).y(serializer, obj);
        Object obj2 = zVar.A;
        if (obj2 != null) {
            return (l) obj2;
        }
        kotlin.jvm.internal.m.k("result");
        throw null;
    }

    public final String d(l40.a serializer, Object obj) {
        char[] cArr;
        kotlin.jvm.internal.m.e(serializer, "serializer");
        j0 j0Var = new j0((char) 0, 10);
        r40.d dVar = r40.d.c;
        synchronized (dVar) {
            h00.m mVar = (h00.m) ((androidx.datastore.preferences.protobuf.j) dVar).b;
            cArr = null;
            char[] cArr2 = (char[]) (mVar.isEmpty() ? null : mVar.removeLast());
            if (cArr2 != null) {
                ((androidx.datastore.preferences.protobuf.j) dVar).a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        j0Var.C = cArr;
        try {
            new r40.u(new androidx.media3.common.q(j0Var, 10, false), this, r40.x.OBJ, new p[r40.x.H.a()]).y(serializer, obj);
            return j0Var.toString();
        } finally {
            j0Var.p();
        }
    }
}
