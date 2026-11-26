package d10;

import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public abstract class m0 extends j implements a10.w, u1 {
    public static final Object N = new Object();
    public final l1 H;
    public final String I;
    public final String J;
    public final Object K;
    public final Object L;
    public final x1 M;

    public m0(l1 container, j10.l0 descriptor) {
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        this(container, strB, c2.b(descriptor).W(), descriptor, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    public m0(l1 l1Var, String str, String str2, j10.l0 l0Var, Object obj) {
        this.H = l1Var;
        this.I = str;
        this.J = str2;
        this.K = obj;
        this.L = rd.a.I(g00.i.B, new x(this, 0));
        this.M = va.a.Q(l0Var, new x(this, 1));
    }

    public m0(l1 l1Var, String name, String signature, Object obj) {
        this(l1Var, name, signature, null, obj);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
    }

    @Override
    public final j10.l0 w() {
        Object objInvoke = this.M.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (j10.l0) objInvoke;
    }

    public abstract a0 B();

    @Override
    public final e10.g a() {
        return B().a();
    }

    @Override
    public final e10.g e() {
        B().getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        m0 m0Var;
        n20.c cVar = i2.a;
        if (obj instanceof m0) {
            m0Var = (m0) obj;
        } else if (obj instanceof kotlin.jvm.internal.u) {
            a10.c cVarCompute = ((kotlin.jvm.internal.u) obj).compute();
            if (cVarCompute instanceof m0) {
                m0Var = (m0) cVarCompute;
            } else {
                m0Var = null;
            }
        } else {
            m0Var = null;
        }
        if (m0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.H, m0Var.H) && kotlin.jvm.internal.m.a(this.I, m0Var.I) && kotlin.jvm.internal.m.a(this.J, m0Var.J) && kotlin.jvm.internal.m.a(this.K, m0Var.K);
    }

    @Override
    public final String getName() {
        return this.I;
    }

    @Override
    public final l1 h() {
        return this.H;
    }

    public final int hashCode() {
        return this.J.hashCode() + x5.e(this.H.hashCode() * 31, this.I, 31);
    }

    @Override
    public final boolean isSuspend() {
        return false;
    }

    @Override
    public final Object q() {
        return this.K;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        b2.a(sb, this);
        sb.append(this instanceof a10.m ? "var " : "val ");
        b2.c(sb, this);
        b2.b(this.I, sb);
        sb.append(": ");
        sb.append(b2.f(getReturnType(), false));
        return sb.toString();
    }

    public final Member z() {
        if (!w().H()) {
            return null;
        }
        n20.b bVar = c2.a;
        qd.s0 s0VarB = c2.b(w());
        if (s0VarB instanceof y0) {
            y0 y0Var = (y0) s0VarB;
            k20.g gVar = y0Var.e;
            l20.d dVar = y0Var.d;
            if ((dVar.B & 16) == 16) {
                l20.c cVar = dVar.G;
                int i = cVar.B;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.H.y(gVar.getString(cVar.C), gVar.getString(cVar.D));
            }
        }
        return (Field) this.L.getValue();
    }
}
