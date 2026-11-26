package d10;

import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;

public final class w implements w1 {
    public static final a10.w[] E;
    public final j A;
    public final int B;
    public final a10.n C;
    public final x1 D;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(w.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        E = new a10.w[]{b0Var.h(sVar), a1.b.h(w.class, "annotations", "getAnnotations()Ljava/util/List;", 0, b0Var)};
    }

    public w(j jVar, int i, a10.n nVar, u00.a aVar) {
        this.A = jVar;
        this.B = i;
        this.C = nVar;
        this.D = va.a.Q((j10.c) null, aVar);
        va.a.Q((j10.c) null, new u(this, 0));
    }

    public final j10.j0 d() {
        a10.w wVar = E[0];
        Object objInvoke = this.D.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (j10.j0) objInvoke;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w wVar = (w) ((w1) obj);
        return kotlin.jvm.internal.m.a(this.A, wVar.A) && this.B == wVar.B;
    }

    public final p30.i g() {
        e30.w type = d().getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        return new p30.i(type, new u(this, 1));
    }

    public final String getName() {
        j10.j0 j0VarD = d();
        m10.r0 r0Var = j0VarD instanceof m10.r0 ? (m10.r0) j0VarD : null;
        if (r0Var != null && !r0Var.l().B()) {
            n20.e name = r0Var.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (!name.B) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.B) + (this.A.hashCode() * 31);
    }

    public final boolean o() {
        j10.j0 j0VarD = d();
        m10.r0 r0Var = j0VarD instanceof m10.r0 ? (m10.r0) j0VarD : null;
        if (r0Var != null) {
            return u20.d.a(r0Var);
        }
        return false;
    }

    public final boolean t() {
        j10.j0 j0VarD = d();
        return (j0VarD instanceof m10.r0) && ((m10.r0) j0VarD).K != null;
    }

    public final String toString() throws IOException {
        String strD;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.C.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + getName());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append("parameter #" + this.B + ' ' + getName());
        }
        sb.append(" of ");
        Object obj = this.A;
        if (obj instanceof a10.w) {
            a10.w wVar = (a10.w) obj;
            StringBuilder sb2 = new StringBuilder();
            b2.a(sb2, wVar);
            sb2.append(wVar instanceof a10.m ? "var " : "val ");
            b2.c(sb2, wVar);
            b2.b(wVar.getName(), sb2);
            sb2.append(": ");
            sb2.append(b2.f(wVar.getReturnType(), false));
            strD = sb2.toString();
        } else {
            if (!(obj instanceof a10.g)) {
                throw new IllegalStateException(("Illegal callable: " + obj).toString());
            }
            strD = b2.d((a10.g) obj);
        }
        sb.append(strD);
        return sb.toString();
    }
}
