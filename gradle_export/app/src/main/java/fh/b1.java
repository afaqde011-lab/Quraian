package fh;

public final class b1 extends e1 {
    public final int D;
    public final c1 E;

    public b1(c1 c1Var, int i10) {
        this.D = i10;
        this.E = c1Var;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        return a().b(i10, objArr);
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.D) {
            case 0:
                if (!(obj instanceof z1)) {
                    return false;
                }
                z1 z1Var = (z1) obj;
                if (z1Var.a() <= 0) {
                    return false;
                }
                return ((j2) this.E).E.b(z1Var.f5681a) == z1Var.a();
            default:
                return ((j2) this.E).contains(obj);
        }
    }

    @Override
    public int hashCode() {
        switch (this.D) {
            case 0:
                return this.E.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final boolean i() {
        switch (this.D) {
            case 0:
                this.E.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final s2 iterator() {
        return a().listIterator(0);
    }

    @Override
    public final t0 o() {
        return new f1(this);
    }

    @Override
    public final int size() {
        switch (this.D) {
            case 0:
                return this.E.l().size();
            default:
                return ((j2) this.E).E.f5666c;
        }
    }
}
