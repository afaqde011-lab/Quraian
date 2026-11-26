package fh;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class c0 extends AbstractSet implements Serializable {
    public transient Object A;
    public transient int[] B;
    public transient Object[] C;
    public transient int D;
    public transient int E;

    public static c0 a(int i10) {
        c0 c0Var = new c0();
        ta.c0.r("Expected size must be >= 0", i10 >= 0);
        c0Var.D = bi.b.u(i10, 1);
        return c0Var;
    }

    @Override
    public final boolean add(Object obj) {
        int iMin;
        char c10 = 31;
        if (c()) {
            ta.c0.z("Arrays already allocated", c());
            int i10 = this.D;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.A = w.h(iMax2);
            this.D = w.q(this.D, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.B = new int[i10];
            this.C = new Object[i10];
        }
        Set setB = b();
        if (setB != null) {
            return setB.add(obj);
        }
        int[] iArrH = h();
        Object[] objArrE = e();
        int i11 = this.E;
        int i12 = i11 + 1;
        int iX = w.x(obj);
        int i13 = (1 << (this.D & 31)) - 1;
        int i14 = iX & i13;
        Object obj2 = this.A;
        Objects.requireNonNull(obj2);
        int iY = w.y(i14, obj2);
        if (iY != 0) {
            int i15 = ~i13;
            int i16 = iX & i15;
            int i17 = 0;
            while (true) {
                int i18 = iY - 1;
                int i19 = iArrH[i18];
                char c11 = c10;
                if ((i19 & i15) == i16 && w50.c.A(obj, objArrE[i18])) {
                    return false;
                }
                int i20 = i19 & i13;
                i17++;
                if (i20 == 0) {
                    if (i17 < 9) {
                        if (i12 <= i13) {
                            iArrH[i18] = w.q(i19, i12, i13);
                            break;
                        }
                        i13 = i(i13, w.s(i13), iX, i11);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.D & 31), 1.0f);
                    int i21 = isEmpty() ? -1 : 0;
                    while (i21 >= 0) {
                        linkedHashSet.add(e()[i21]);
                        i21++;
                        if (i21 >= this.E) {
                            i21 = -1;
                        }
                    }
                    this.A = linkedHashSet;
                    this.B = null;
                    this.C = null;
                    this.D += 32;
                    return linkedHashSet.add(obj);
                }
                iY = i20;
                c10 = c11;
            }
        } else if (i12 > i13) {
            i13 = i(i13, w.s(i13), iX, i11);
        } else {
            Object obj3 = this.A;
            Objects.requireNonNull(obj3);
            w.z(i14, i12, obj3);
        }
        int length = h().length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.B = Arrays.copyOf(h(), iMin);
            this.C = Arrays.copyOf(e(), iMin);
        }
        h()[i11] = w.q(iX, 0, i13);
        e()[i11] = obj;
        this.E = i12;
        this.D += 32;
        return true;
    }

    public final Set b() {
        Object obj = this.A;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final boolean c() {
        return this.A == null;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.D += 32;
        Set setB = b();
        if (setB != null) {
            this.D = bi.b.u(size(), 3);
            setB.clear();
            this.A = null;
            this.E = 0;
            return;
        }
        Arrays.fill(e(), 0, this.E, (Object) null);
        Object obj = this.A;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.E, 0);
        this.E = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (c()) {
            return false;
        }
        Set setB = b();
        if (setB != null) {
            return setB.contains(obj);
        }
        int iX = w.x(obj);
        int i10 = (1 << (this.D & 31)) - 1;
        Object obj2 = this.A;
        Objects.requireNonNull(obj2);
        int iY = w.y(iX & i10, obj2);
        if (iY == 0) {
            return false;
        }
        int i11 = ~i10;
        int i12 = iX & i11;
        do {
            int i13 = iY - 1;
            int i14 = h()[i13];
            if ((i14 & i11) == i12 && w50.c.A(obj, e()[i13])) {
                return true;
            }
            iY = i14 & i10;
        } while (iY != 0);
        return false;
    }

    public final Object[] e() {
        Object[] objArr = this.C;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] h() {
        int[] iArr = this.B;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int i(int i10, int i11, int i12, int i13) {
        Object objH = w.h(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            w.z(i12 & i14, i13 + 1, objH);
        }
        Object obj = this.A;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iY = w.y(i15, obj);
            while (iY != 0) {
                int i16 = iY - 1;
                int i17 = iArrH[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iY2 = w.y(i19, objH);
                w.z(i19, iY, objH);
                iArrH[i16] = w.q(i18, iY2, i14);
                iY = i17 & i10;
            }
        }
        this.A = objH;
        this.D = w.q(this.D, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Iterator iterator() {
        Set setB = b();
        return setB != null ? setB.iterator() : new b0(this);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        int i11;
        if (!c()) {
            Set setB = b();
            if (setB != null) {
                return setB.remove(obj);
            }
            int i12 = (1 << (this.D & 31)) - 1;
            Object obj2 = this.A;
            Objects.requireNonNull(obj2);
            int iT = w.t(obj, null, i12, obj2, h(), e(), null);
            if (iT != -1) {
                Object obj3 = this.A;
                Objects.requireNonNull(obj3);
                int[] iArrH = h();
                Object[] objArrE = e();
                int size = size();
                int i13 = size - 1;
                if (iT < i13) {
                    Object obj4 = objArrE[i13];
                    objArrE[iT] = obj4;
                    objArrE[i13] = null;
                    iArrH[iT] = iArrH[i13];
                    iArrH[i13] = 0;
                    int iX = w.x(obj4) & i12;
                    int iY = w.y(iX, obj3);
                    if (iY == size) {
                        w.z(iX, iT + 1, obj3);
                    } else {
                        while (true) {
                            i10 = iY - 1;
                            i11 = iArrH[i10];
                            int i14 = i11 & i12;
                            if (i14 == size) {
                                break;
                            }
                            iY = i14;
                        }
                        iArrH[i10] = w.q(i11, iT + 1, i12);
                    }
                } else {
                    objArrE[iT] = null;
                    iArrH[iT] = 0;
                }
                this.E--;
                this.D += 32;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int size() {
        Set setB = b();
        return setB != null ? setB.size() : this.E;
    }

    @Override
    public final Object[] toArray() {
        if (c()) {
            return new Object[0];
        }
        Set setB = b();
        return setB != null ? setB.toArray() : Arrays.copyOf(e(), this.E);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        if (c()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setB = b();
        if (setB != null) {
            return setB.toArray(objArr);
        }
        Object[] objArrE = e();
        int i10 = this.E;
        ta.c0.y(0, i10, objArrE.length);
        if (objArr.length < i10) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        System.arraycopy(objArrE, 0, objArr, 0, i10);
        return objArr;
    }
}
