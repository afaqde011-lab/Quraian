package m1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;

public final class e implements RandomAccess {
    public Object[] A;
    public b B;
    public int C;

    public e(int i10, Object[] objArr) {
        this.A = objArr;
        this.C = i10;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.C + 1;
        if (this.A.length < i11) {
            m(i11);
        }
        Object[] objArr = this.A;
        int i12 = this.C;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.C++;
    }

    public final void b(Object obj) {
        int i10 = this.C + 1;
        if (this.A.length < i10) {
            m(i10);
        }
        Object[] objArr = this.A;
        int i11 = this.C;
        objArr[i11] = obj;
        this.C = i11 + 1;
    }

    public final void c(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.C + size;
        if (this.A.length < i11) {
            m(i11);
        }
        Object[] objArr = this.A;
        int i12 = this.C;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.C += size;
    }

    public final void d(int i10, e eVar) {
        int i11 = eVar.C;
        if (i11 == 0) {
            return;
        }
        int i12 = this.C + i11;
        if (this.A.length < i12) {
            m(i12);
        }
        Object[] objArr = this.A;
        int i13 = this.C;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.A, 0, objArr, i10, i11);
        this.C += i11;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.C + size;
        if (this.A.length < i12) {
            m(i12);
        }
        Object[] objArr = this.A;
        int i13 = this.C;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                va.a.k0();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.C += size;
        return true;
    }

    public final List f() {
        b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.B = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.A;
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.C = 0;
    }

    public final boolean h(Object obj) {
        int i10 = this.C - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !m.a(this.A[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.A;
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            if (m.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i10 = i(obj);
        if (i10 < 0) {
            return false;
        }
        k(i10);
        return true;
    }

    public final Object k(int i10) {
        Object[] objArr = this.A;
        Object obj = objArr[i10];
        int i11 = this.C;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.C - 1;
        this.C = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.C;
            if (i11 < i12) {
                Object[] objArr = this.A;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.C;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.A[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.C = i14;
        }
    }

    public final void m(int i10) {
        Object[] objArr = this.A;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.A = objArr2;
    }

    public final void n(Comparator comparator) {
        Arrays.sort(this.A, 0, this.C, comparator);
    }
}
