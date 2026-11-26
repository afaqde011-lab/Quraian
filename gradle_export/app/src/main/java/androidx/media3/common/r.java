package androidx.media3.common;

import android.util.SparseBooleanArray;

public final class r {

    public final SparseBooleanArray f1465a;

    public r(SparseBooleanArray sparseBooleanArray) {
        this.f1465a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (this.f1465a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f1465a;
        ta.c0.u(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f1465a.equals(((r) obj).f1465a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1465a.hashCode();
    }
}
