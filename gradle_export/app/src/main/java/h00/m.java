package h00;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class m extends h {
    public static final Object[] D = new Object[0];
    public int A;
    public Object[] B;
    public int C;

    public m() {
        this.B = D;
    }

    public m(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = D;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(g4.c.f(i, "Illegal Capacity: "));
            }
            objArr = new Object[i];
        }
        this.B = objArr;
    }

    public m(g0 g0Var) {
        Object[] objArrC = kotlin.jvm.internal.l.c(g0Var, new Object[0]);
        this.B = objArrC;
        this.C = objArrC.length;
        if (objArrC.length == 0) {
            this.B = D;
        }
    }

    @Override
    public final int a() {
        return this.C;
    }

    @Override
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.C;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        h(this.C + 1);
        int iO = o(this.A + i);
        int i3 = this.C;
        if (i < ((i3 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.B;
                kotlin.jvm.internal.m.e(objArr, "<this>");
                iO = objArr.length;
            }
            int i4 = iO - 1;
            int i5 = this.A;
            if (i5 == 0) {
                Object[] objArr2 = this.B;
                kotlin.jvm.internal.m.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.A;
            if (i4 >= i6) {
                Object[] objArr3 = this.B;
                objArr3[length] = objArr3[i6];
                n.q0(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.B;
                n.q0(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.B;
                objArr5[objArr5.length - 1] = objArr5[0];
                n.q0(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.B[i4] = obj;
            this.A = length;
        } else {
            int iO2 = o(i3 + this.A);
            if (iO < iO2) {
                Object[] objArr6 = this.B;
                n.q0(iO + 1, iO, iO2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.B;
                n.q0(1, 0, iO2, objArr7, objArr7);
                Object[] objArr8 = this.B;
                objArr8[0] = objArr8[objArr8.length - 1];
                n.q0(iO + 1, iO, objArr8.length - 1, objArr8, objArr8);
            }
            this.B[iO] = obj;
        }
        this.C++;
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        int i2 = this.C;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.C) {
            return addAll(elements);
        }
        p();
        h(elements.size() + this.C);
        int iO = o(this.C + this.A);
        int iO2 = o(this.A + i);
        int size = elements.size();
        if (i >= ((this.C + 1) >> 1)) {
            int i3 = iO2 + size;
            if (iO2 < iO) {
                int i4 = size + iO;
                Object[] objArr = this.B;
                if (i4 <= objArr.length) {
                    n.q0(i3, iO2, iO, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    n.q0(i3 - objArr.length, iO2, iO, objArr, objArr);
                } else {
                    int length = iO - (i4 - objArr.length);
                    n.q0(0, length, iO, objArr, objArr);
                    Object[] objArr2 = this.B;
                    n.q0(i3, iO2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.B;
                n.q0(size, 0, iO, objArr3, objArr3);
                Object[] objArr4 = this.B;
                if (i3 >= objArr4.length) {
                    n.q0(i3 - objArr4.length, iO2, objArr4.length, objArr4, objArr4);
                } else {
                    n.q0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.B;
                    n.q0(i3, iO2, objArr5.length - size, objArr5, objArr5);
                }
            }
            e(iO2, elements);
            return true;
        }
        int i5 = this.A;
        int length2 = i5 - size;
        if (iO2 < i5) {
            Object[] objArr6 = this.B;
            n.q0(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iO2) {
                Object[] objArr7 = this.B;
                n.q0(objArr7.length - size, 0, iO2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.B;
                n.q0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.B;
                n.q0(0, size, iO2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.B;
            n.q0(length2, i5, iO2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.B;
            length2 += objArr11.length;
            int i6 = iO2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                n.q0(length2, i5, iO2, objArr11, objArr11);
            } else {
                n.q0(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.B;
                n.q0(0, this.A + length3, iO2, objArr12, objArr12);
            }
        }
        this.A = length2;
        e(m(iO2 - size), elements);
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p();
        h(elements.size() + a());
        e(o(a() + this.A), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        h(this.C + 1);
        int length = this.A;
        if (length == 0) {
            Object[] objArr = this.B;
            kotlin.jvm.internal.m.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.A = i;
        this.B[i] = obj;
        this.C++;
    }

    public final void addLast(Object obj) {
        p();
        h(a() + 1);
        this.B[o(a() + this.A)] = obj;
        this.C = a() + 1;
    }

    @Override
    public final Object c(int i) {
        int i2 = this.C;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        if (i == va.a.M(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.A + i);
        Object[] objArr = this.B;
        Object obj = objArr[iO];
        if (i < (this.C >> 1)) {
            int i3 = this.A;
            if (iO >= i3) {
                n.q0(i3 + 1, i3, iO, objArr, objArr);
            } else {
                n.q0(1, 0, iO, objArr, objArr);
                Object[] objArr2 = this.B;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.A;
                n.q0(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.B;
            int i5 = this.A;
            objArr3[i5] = null;
            this.A = k(i5);
        } else {
            int iO2 = o(va.a.M(this) + this.A);
            if (iO <= iO2) {
                Object[] objArr4 = this.B;
                n.q0(iO, iO + 1, iO2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.B;
                n.q0(iO, iO + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.B;
                objArr6[objArr6.length - 1] = objArr6[0];
                n.q0(0, 1, iO2 + 1, objArr6, objArr6);
            }
            this.B[iO2] = null;
        }
        this.C--;
        return obj;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.A, o(a() + this.A));
        }
        this.A = 0;
        this.C = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.B.length;
        while (i < length && it.hasNext()) {
            this.B[i] = it.next();
            i++;
        }
        int i2 = this.A;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.B[i3] = it.next();
        }
        this.C = collection.size() + this.C;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.B[this.A];
    }

    @Override
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(w.c.h(i, iA, "index: ", ", size: "));
        }
        return this.B[o(this.A + i)];
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.B;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == D) {
            if (i < 10) {
                i = 10;
            }
            this.B = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        n.q0(0, this.A, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.B;
        int length2 = objArr3.length;
        int i3 = this.A;
        n.q0(length2 - i3, 0, i3, objArr3, objArr2);
        this.A = 0;
        this.B = objArr2;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.B[this.A];
    }

    @Override
    public final int indexOf(Object obj) {
        int i;
        int iO = o(a() + this.A);
        int length = this.A;
        if (length < iO) {
            while (length < iO) {
                if (kotlin.jvm.internal.m.a(obj, this.B[length])) {
                    i = this.A;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.A) < iO) {
            return -1;
        }
        int length2 = this.B.length;
        while (length < length2) {
            if (kotlin.jvm.internal.m.a(obj, this.B[length])) {
                i = this.A;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (kotlin.jvm.internal.m.a(obj, this.B[i2])) {
                length = i2 + this.B.length;
                i = this.A;
            }
        }
        return -1;
        return length - i;
    }

    @Override
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int k(int i) {
        Object[] objArr = this.B;
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.B[o(va.a.M(this) + this.A)];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.B[o(va.a.M(this) + this.A)];
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iO = o(this.C + this.A);
        int i2 = this.A;
        if (i2 < iO) {
            length = iO - 1;
            if (i2 <= length) {
                while (!kotlin.jvm.internal.m.a(obj, this.B[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.A;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.A >= iO) {
            for (int i3 = iO - 1; -1 < i3; i3--) {
                if (kotlin.jvm.internal.m.a(obj, this.B[i3])) {
                    length = i3 + this.B.length;
                    i = this.A;
                    return length - i;
                }
            }
            Object[] objArr = this.B;
            kotlin.jvm.internal.m.e(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.A;
            if (i4 <= length) {
                while (!kotlin.jvm.internal.m.a(obj, this.B[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.A;
                return length - i;
            }
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.B.length : i;
    }

    public final void n(int i, int i2) {
        if (i < i2) {
            n.y0(i, i2, null, this.B);
            return;
        }
        Object[] objArr = this.B;
        n.y0(i, objArr.length, null, objArr);
        n.y0(0, i2, null, this.B);
    }

    public final int o(int i) {
        Object[] objArr = this.B;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int iO;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int iO2 = o(a() + this.A);
            int i = this.A;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.B[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.B[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                n.y0(iO, iO2, null, this.B);
            } else {
                int length = this.B.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.B;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.B[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr2 = this.B;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.B[iO] = obj3;
                        iO = k(iO);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.C = m(iO - this.A);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        Object[] objArr = this.B;
        int i = this.A;
        Object obj = objArr[i];
        objArr[i] = null;
        this.A = k(i);
        this.C = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        int iO = o(va.a.M(this) + this.A);
        Object[] objArr = this.B;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.C = a() - 1;
        return obj;
    }

    @Override
    public final void removeRange(int i, int i2) {
        rd.a.j(i, i2, this.C);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.C) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        p();
        if (i < this.C - i2) {
            int iO = o(this.A + (i - 1));
            int iO2 = o(this.A + (i2 - 1));
            while (i > 0) {
                int i4 = iO + 1;
                int iMin = Math.min(i, Math.min(i4, iO2 + 1));
                Object[] objArr = this.B;
                int i5 = iO2 - iMin;
                int i6 = iO - iMin;
                n.q0(i5 + 1, i6 + 1, i4, objArr, objArr);
                iO = m(i6);
                iO2 = m(i5);
                i -= iMin;
            }
            int iO3 = o(this.A + i3);
            n(this.A, iO3);
            this.A = iO3;
        } else {
            int iO4 = o(this.A + i2);
            int iO5 = o(this.A + i);
            int i7 = this.C;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.B;
                i2 = Math.min(i7, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.B;
                int i8 = iO4 + i2;
                n.q0(iO5, iO4, i8, objArr3, objArr3);
                iO4 = o(i8);
                iO5 = o(iO5 + i2);
            }
            int iO6 = o(this.C + this.A);
            n(m(iO6 - i3), iO6);
        }
        this.C -= i3;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int iO;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int iO2 = o(a() + this.A);
            int i = this.A;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.B[i];
                    if (elements.contains(obj)) {
                        this.B[iO] = obj;
                        iO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                n.y0(iO, iO2, null, this.B);
            } else {
                int length = this.B.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.B;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.B[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr2 = this.B;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.B[iO] = obj3;
                        iO = k(iO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.C = m(iO - this.A);
            }
        }
        return z;
    }

    @Override
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(w.c.h(i, iA, "index: ", ", size: "));
        }
        int iO = o(this.A + i);
        Object[] objArr = this.B;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int length = array.length;
        int i = this.C;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iO = o(this.C + this.A);
        int i2 = this.A;
        if (i2 < iO) {
            n.v0(i2, iO, 2, this.B, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.B;
            n.q0(0, this.A, objArr.length, objArr, array);
            Object[] objArr2 = this.B;
            n.q0(objArr2.length - this.A, 0, iO, objArr2, array);
        }
        int i3 = this.C;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }
}
