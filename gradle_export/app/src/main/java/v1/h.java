package v1;

import l1.m1;
import l1.p1;
import l1.s2;
import qd.j0;

public final class h extends s1.c implements m1 {
    public static final h D = new h(s1.k.f13620e, 0);

    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof p1) {
            return super.containsKey((p1) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof s2) {
            return super.containsValue((s2) obj);
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj instanceof p1) {
            return (s2) super.get((p1) obj);
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p1) ? obj2 : (s2) super.getOrDefault((p1) obj, (s2) obj2);
    }

    @Override
    public final g h() {
        g gVar = new g(this);
        gVar.G = this;
        return gVar;
    }

    public final h k(p1 p1Var, s2 s2Var) {
        j0 j0VarU = this.A.u(p1Var, p1Var.hashCode(), 0, s2Var);
        return j0VarU == null ? this : new h((s1.k) j0VarU.C, this.B + j0VarU.B);
    }
}
