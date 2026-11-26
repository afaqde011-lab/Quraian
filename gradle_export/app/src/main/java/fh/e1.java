package fh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class e1 extends o0 implements Set {
    public static final int C = 0;
    public transient t0 B;

    public static int l(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            ta.c0.r("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static e1 m(int i10, Object... objArr) {
        if (i10 == 0) {
            return k2.J;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new q2(obj);
        }
        int iL = l(i10);
        Object[] objArr2 = new Object[iL];
        int i11 = iL - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(g4.c.f(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iW = w.w(iHashCode);
            while (true) {
                int i15 = iW & i11;
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
                iW++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new q2(obj4);
        }
        if (l(i13) < iL / 2) {
            return m(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new k2(i12, i11, i13, objArr, objArr2);
    }

    public static e1 n(Collection collection) {
        if ((collection instanceof e1) && !(collection instanceof SortedSet)) {
            e1 e1Var = (e1) collection;
            if (!e1Var.i()) {
                return e1Var;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    public static e1 p(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        ta.c0.r("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m(length, objArr2);
    }

    @Override
    public t0 a() {
        t0 t0Var = this.B;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0VarO = o();
        this.B = t0VarO;
        return t0VarO;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e1) && (this instanceof k2) && (((e1) obj) instanceof k2) && hashCode() != obj.hashCode()) {
            return false;
        }
        return w.k(this, obj);
    }

    @Override
    public int hashCode() {
        return w.o(this);
    }

    public t0 o() {
        Object[] array = toArray(o0.A);
        r0 r0Var = t0.B;
        return t0.l(array.length, array);
    }
}
