package fh;

import java.util.Arrays;

public abstract class c1 extends o0 implements x1 {
    public static final int D = 0;
    public transient d2 B;
    public transient e1 C;

    @Override
    public final t0 a() {
        d2 d2Var = this.B;
        if (d2Var != null) {
            return d2Var;
        }
        t0 t0VarA = super.a();
        this.B = (d2) t0VarA;
        return t0VarA;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        s2 it = m().iterator();
        while (it.hasNext()) {
            z1 z1Var = (z1) it.next();
            Arrays.fill(objArr, i10, z1Var.a() + i10, z1Var.f5681a);
            i10 += z1Var.a();
        }
        return i10;
    }

    @Override
    public final boolean contains(Object obj) {
        return ((j2) this).E.b(obj) > 0;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        j2 j2Var = (j2) this;
        if (j2Var.size() != x1Var.size()) {
            return false;
        }
        c1 c1Var = (c1) x1Var;
        if (m().size() != c1Var.m().size()) {
            return false;
        }
        for (z1 z1Var : c1Var.m()) {
            if (j2Var.E.b(z1Var.f5681a) != z1Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return w.o(m());
    }

    @Override
    public final s2 iterator() {
        return new z0(m().iterator());
    }

    public abstract e1 l();

    public final e1 m() {
        e1 b1Var = this.C;
        if (b1Var == null) {
            b1Var = isEmpty() ? k2.J : new b1(this, 0);
            this.C = b1Var;
        }
        return b1Var;
    }

    @Override
    public final String toString() {
        return m().toString();
    }
}
