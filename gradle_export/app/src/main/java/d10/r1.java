package d10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class r1 implements h30.l, h30.m, a10.e {
    public final s1 A;
    public final u00.a B;
    public final String C;
    public final a10.a0 D;
    public final j10.r0 E;
    public volatile List F;

    public r1(s1 s1Var, j10.r0 r0Var) {
        a10.a0 a0Var;
        x1 x1VarQ = va.a.Q((j10.c) null, new a30.l(r0Var, 24));
        String strB = r0Var.getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        e30.a1 a1VarF = r0Var.F();
        kotlin.jvm.internal.m.d(a1VarF, "getVariance(...)");
        int iOrdinal = a1VarF.ordinal();
        if (iOrdinal == 0) {
            a0Var = a10.a0.A;
        } else if (iOrdinal == 1) {
            a0Var = a10.a0.B;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a0Var = a10.a0.C;
        }
        a10.a0 a0Var2 = a0Var;
        r0Var.A();
        this(r0Var, s1Var, x1VarQ, strB, a0Var2);
        List upperBounds = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(h00.r.q0(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new p30.i((e30.w) it.next(), null));
        }
        this.F = arrayList;
    }

    public r1(s1 container, String name, a10.a0 a0Var) {
        this(null, container, null, name, a0Var);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
    }

    public r1(j10.r0 r0Var, s1 s1Var, x1 x1Var, String str, a10.a0 a0Var) {
        this.A = s1Var;
        this.B = x1Var;
        this.C = str;
        this.D = a0Var;
        this.E = r0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        s1 s1Var = this.A;
        if (s1Var == null) {
            u00.a aVar = this.B;
            kotlin.jvm.internal.m.b(aVar);
            s1Var = (s1) aVar.invoke();
        }
        r1 r1Var = (r1) obj;
        s1 s1Var2 = r1Var.A;
        if (s1Var2 == null) {
            u00.a aVar2 = r1Var.B;
            kotlin.jvm.internal.m.b(aVar2);
            s1Var2 = (s1) aVar2.invoke();
        }
        return kotlin.jvm.internal.m.a(s1Var, s1Var2) && kotlin.jvm.internal.m.a(this.C, r1Var.C);
    }

    public final int hashCode() {
        s1 s1Var = this.A;
        if (s1Var == null) {
            u00.a aVar = this.B;
            kotlin.jvm.internal.m.b(aVar);
            s1Var = (s1) aVar.invoke();
        }
        return this.C.hashCode() + (s1Var.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.D.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sb.append("out ");
            }
        }
        sb.append(this.C);
        return sb.toString();
    }
}
