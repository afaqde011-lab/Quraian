package nf;

import java.util.Iterator;

public final class a0 extends q {
    public static final Object[] I;
    public static final a0 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new a0(0, 0, 0, objArr, objArr);
    }

    public a0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.D = objArr;
        this.E = i10;
        this.F = objArr2;
        this.G = i11;
        this.H = i12;
    }

    @Override
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.D;
        int i10 = this.H;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int b() {
        return this.H;
    }

    @Override
    public final int c() {
        return 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.F;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i10 = iRotateLeft & this.G;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i10 + 1;
        }
    }

    @Override
    public final f0 e() {
        return l().listIterator(0);
    }

    @Override
    public final Object[] h() {
        return this.D;
    }

    @Override
    public final int hashCode() {
        return this.E;
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final o m() {
        return o.l(this.H, this.D);
    }

    @Override
    public final int size() {
        return this.H;
    }
}
