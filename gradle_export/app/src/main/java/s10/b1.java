package s10;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b1 {
    public int a;
    public z3 b;
    public final ArrayList c = new ArrayList(0);
    public b1 d;
    public b1 e;
    public x0 f;
    public final ArrayList g;

    public b1(int i) {
        this.a = i;
        u10.l.a.getClass();
        List listA = u10.k.a();
        ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            arrayList.add(new w10.g());
        }
        this.g = arrayList;
    }

    public final z3 a() {
        z3 z3Var = this.b;
        if (z3Var != null) {
            return z3Var;
        }
        kotlin.jvm.internal.m.k("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
        b1 b1Var = (b1) obj;
        return this.a == b1Var.a && a().equals(b1Var.a()) && kotlin.jvm.internal.m.a(this.c, b1Var.c) && kotlin.jvm.internal.m.a(this.e, b1Var.e) && kotlin.jvm.internal.m.a(this.d, b1Var.d) && kotlin.jvm.internal.m.a(this.f, b1Var.f) && kotlin.jvm.internal.m.a(this.g, b1Var.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.a * 31)) * 31);
    }
}
