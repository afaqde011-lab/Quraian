package p30;

import a10.x;
import d10.b2;
import d10.x1;

public abstract class a implements h30.e, h30.f, h30.i, h30.j, x {
    public final x1 A;

    public a(u00.a aVar) {
        x1 x1VarQ = null;
        x1 x1Var = aVar instanceof x1 ? (x1) aVar : null;
        if (x1Var != null) {
            x1VarQ = x1Var;
        } else if (aVar != null) {
            x1VarQ = va.a.Q((j10.c) null, aVar);
        }
        this.A = x1VarQ;
    }

    public abstract a A();

    public abstract x d();

    public boolean equals(Object obj) {
        return (obj instanceof a) && e30.c.z(q.A, this, (h30.g) obj);
    }

    public abstract a10.d g();

    public int hashCode() {
        a10.e eVarS = s();
        int iHashCode = eVarS != null ? eVarS.hashCode() : 0;
        return Boolean.hashCode(f()) + ((r().hashCode() + (iHashCode * 31)) * 31);
    }

    public abstract boolean o();

    public abstract boolean t();

    public String toString() {
        return b2.f(this, false);
    }

    public abstract boolean v();

    public abstract boolean w();

    public abstract a x();

    public abstract a y(boolean z);

    public abstract a z(boolean z);
}
