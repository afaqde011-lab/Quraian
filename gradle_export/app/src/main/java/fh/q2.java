package fh;

public final class q2 extends e1 {
    public final transient Object D;

    public q2(Object obj) {
        obj.getClass();
        this.D = obj;
    }

    @Override
    public final t0 a() {
        return t0.s(this.D);
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        objArr[i10] = this.D;
        return i10 + 1;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final s2 iterator() {
        return new k1(this.D);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.D.toString() + ']';
    }
}
