package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class w1 extends t implements l1 {
    public final l1 E;
    public final qj.c F;

    public w1(l1 l1Var, qj.c cVar) {
        l1Var.getClass();
        this.E = l1Var;
        this.F = cVar;
    }

    @Override
    public final void clear() {
        this.E.clear();
    }

    @Override
    public final Map e() {
        return new s1(this.E.b(), new ab.r(this, 14));
    }

    @Override
    public final Collection f() {
        return new r(this, 0);
    }

    @Override
    public final Set g() {
        return this.E.keySet();
    }

    @Override
    public final Collection get(Object obj) {
        return w.A(new l9.f0(this.F, obj, 27), (List) this.E.get(obj));
    }

    @Override
    public final Iterator h() {
        return new h1(this.E.a().iterator(), new me.i(this.F, 26));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.E.size();
    }
}
