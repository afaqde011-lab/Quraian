package fh;

public final class k2 extends e1 {
    public static final Object[] I;
    public static final k2 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new k2(0, 0, 0, objArr, objArr);
    }

    public k2(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.D = objArr;
        this.E = i10;
        this.F = objArr2;
        this.G = i11;
        this.H = i12;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.D;
        int i11 = this.H;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] c() {
        return this.D;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.F;
            if (objArr.length != 0) {
                int iX = w.x(obj);
                while (true) {
                    int i10 = iX & this.G;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iX = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int e() {
        return this.H;
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.E;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final s2 iterator() {
        return a().listIterator(0);
    }

    @Override
    public final t0 o() {
        return t0.l(this.H, this.D);
    }

    @Override
    public final int size() {
        return this.H;
    }
}
