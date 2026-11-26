package k50;

import java.util.RandomAccess;

public final class y extends h00.f implements RandomAccess {
    public final l[] A;
    public final int[] B;

    public y(l[] lVarArr, int[] iArr) {
        this.A = lVarArr;
        this.B = iArr;
    }

    @Override
    public final int a() {
        return this.A.length;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof l) {
            return super.contains((l) obj);
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        return this.A[i];
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof l) {
            return super.indexOf((l) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return super.lastIndexOf((l) obj);
        }
        return -1;
    }
}
