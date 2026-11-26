package nf;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class q extends j implements Set {
    public static final int C = 0;
    public transient o B;

    public static q i(int i10, Object... objArr) {
        if (i10 == 0) {
            return a0.J;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new d0(obj);
        }
        int iK = k(i10);
        Object[] objArr2 = new Object[iK];
        int i11 = iK - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(g4.c.f(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i15 = iRotateLeft & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new d0(obj4);
        }
        if (k(i13) < iK / 2) {
            return i(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new a0(i12, i11, i13, objArr, objArr2);
    }

    public static int k(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q) && (this instanceof a0) && (((q) obj) instanceof a0) && ((a0) this).E != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return b.b(this);
    }

    public o l() {
        o oVar = this.B;
        if (oVar != null) {
            return oVar;
        }
        o oVarM = m();
        this.B = oVarM;
        return oVarM;
    }

    public o m() {
        Object[] array = toArray(j.A);
        k kVar = o.B;
        return o.l(array.length, array);
    }
}
