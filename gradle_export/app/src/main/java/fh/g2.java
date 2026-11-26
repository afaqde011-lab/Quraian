package fh;

public final class g2 extends e1 {
    public final transient w0 D;
    public final transient h2 E;

    public g2(w0 w0Var, h2 h2Var) {
        this.D = w0Var;
        this.E = h2Var;
    }

    @Override
    public final t0 a() {
        return this.E;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        return this.E.b(i10, objArr);
    }

    @Override
    public final boolean contains(Object obj) {
        return this.D.get(obj) != null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final s2 iterator() {
        return this.E.listIterator(0);
    }

    @Override
    public final int size() {
        return this.D.size();
    }
}
