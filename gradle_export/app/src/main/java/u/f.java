package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class f implements Collection, Set, v00.b, v00.f {
    public int[] A = v.a.f15304a;
    public Object[] B = v.a.f15306c;
    public int C;

    public f(Object obj) {
    }

    public final Object a(int i10) {
        int i11 = this.C;
        Object[] objArr = this.B;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.A;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                h00.n.p0(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.B;
                h00.n.q0(i10, i13, i11, objArr2, objArr2);
            }
            this.B[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.A = iArr2;
            this.B = new Object[i14];
            if (i10 > 0) {
                h00.n.u0(0, i10, 6, iArr, iArr2);
                h00.n.v0(0, i10, 6, objArr, this.B);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                h00.n.p0(i10, i15, i11, iArr, this.A);
                h00.n.q0(i10, i15, i11, objArr, this.B);
            }
        }
        if (i11 != this.C) {
            throw new ConcurrentModificationException();
        }
        this.C = i12;
        return obj;
    }

    @Override
    public final boolean add(Object obj) {
        int i10;
        int iA;
        int i11 = this.C;
        if (obj == null) {
            iA = r.a(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iA = r.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i12 = ~iA;
        int[] iArr = this.A;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.B;
            int[] iArr2 = new int[i13];
            this.A = iArr2;
            this.B = new Object[i13];
            if (i11 != this.C) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                h00.n.u0(0, iArr.length, 6, iArr, iArr2);
                h00.n.v0(0, objArr.length, 6, objArr, this.B);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.A;
            int i14 = i12 + 1;
            h00.n.p0(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.B;
            h00.n.q0(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.C;
        if (i11 == i15) {
            int[] iArr4 = this.A;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.B[i12] = obj;
                this.C = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        int size = collection.size() + this.C;
        int i10 = this.C;
        int[] iArr = this.A;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.B;
            int[] iArr2 = new int[size];
            this.A = iArr2;
            this.B = new Object[size];
            if (i10 > 0) {
                h00.n.u0(0, i10, 6, iArr, iArr2);
                h00.n.v0(0, this.C, 6, objArr, this.B);
            }
        }
        if (this.C != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override
    public final void clear() {
        if (this.C != 0) {
            this.A = v.a.f15304a;
            this.B = v.a.f15306c;
            this.C = 0;
        }
        if (this.C != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return (obj == null ? r.a(this, null, 0) : r.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.C != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.C;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.B[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        int[] iArr = this.A;
        int i10 = this.C;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override
    public final boolean isEmpty() {
        return this.C <= 0;
    }

    @Override
    public final Iterator iterator() {
        return new a(this);
    }

    @Override
    public final boolean remove(Object obj) {
        int iA = obj == null ? r.a(this, null, 0) : r.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        a(iA);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.C - 1; -1 < i10; i10--) {
            if (!h00.q.F0(collection, this.B[i10])) {
                a(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        return this.C;
    }

    @Override
    public final Object[] toArray() {
        return h00.n.x0(this.B, 0, this.C);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "array");
        int i10 = this.C;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        h00.n.q0(0, 0, this.C, this.B, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.C * 14);
        sb2.append('{');
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.B[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
