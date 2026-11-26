package fh;

import com.google.android.gms.internal.measurement.x5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public final class h0 extends b2 implements Serializable {
    public final Comparator[] A;

    public h0(v vVar, v vVar2) {
        this.A = new Comparator[]{vVar, vVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.A;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            return Arrays.equals(this.A, ((h0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    public final String toString() {
        return x5.n(new StringBuilder("Ordering.compound("), Arrays.toString(this.A), ")");
    }
}
