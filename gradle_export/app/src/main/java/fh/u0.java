package fh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class u0 extends u implements l1, Serializable {
    public final transient i2 E;
    public final transient int F;

    public u0(i2 i2Var, int i10) {
        this.E = i2Var;
        this.F = i10;
    }

    @Override
    public final Collection a() {
        return (o0) super.a();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override
    public final Map e() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final Collection f() {
        return new y0(this);
    }

    @Override
    public final Set g() {
        throw new AssertionError("unreachable");
    }

    @Override
    public final Collection get(Object obj) {
        t0 t0Var = (t0) this.E.get(obj);
        if (t0Var != null) {
            return t0Var;
        }
        r0 r0Var = t0.B;
        return d2.E;
    }

    @Override
    public final Iterator h() {
        return new x0(this);
    }

    @Override
    public w0 b() {
        return this.E;
    }

    @Override
    public final Set keySet() {
        return this.E.keySet();
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.F;
    }
}
