package u;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class s0 {
    public int[] A;
    public Object[] B;
    public int C;

    public s0(int i10) {
        this.A = i10 == 0 ? v.a.f15304a : new int[i10];
        this.B = i10 == 0 ? v.a.f15306c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.C * 2;
        Object[] objArr = this.B;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i10) {
        int i11 = this.C;
        int[] iArr = this.A;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.A = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.B, i10 * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.B = objArrCopyOf;
        }
        if (this.C != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.C > 0) {
            this.A = v.a.f15304a;
            this.B = v.a.f15306c;
            this.C = 0;
        }
        if (this.C > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.C;
        if (i11 == 0) {
            return -1;
        }
        int iA = v.a.a(this.A, i11, i10);
        if (iA < 0 || kotlin.jvm.internal.m.a(obj, this.B[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.A[i12] == i10) {
            if (kotlin.jvm.internal.m.a(obj, this.B[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.A[i13] == i10; i13--) {
            if (kotlin.jvm.internal.m.a(obj, this.B[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof s0) {
                int i10 = this.C;
                if (i10 != ((s0) obj).C) {
                    return false;
                }
                s0 s0Var = (s0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objJ = j(i11);
                    Object obj2 = s0Var.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !s0Var.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.C != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.C;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.C;
        if (i10 == 0) {
            return -1;
        }
        int iA = v.a.a(this.A, i10, 0);
        if (iA < 0 || this.B[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.A[i11] == 0) {
            if (this.B[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.A[i12] == 0; i12--) {
            if (this.B[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.C) {
            z10 = true;
        }
        if (z10) {
            return this.B[i10 << 1];
        }
        v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.B[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.B[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.C)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.B;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.A;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                h00.n.p0(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.B;
                h00.n.q0(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.B;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.A = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.B, i16 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.B = objArrCopyOf;
            if (i11 != this.C) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                h00.n.p0(0, 0, i10, iArr, this.A);
                h00.n.q0(0, 0, i12, objArr, this.B);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                h00.n.p0(i10, i17, i11, iArr, this.A);
                h00.n.q0(i12, i17 << 1, i11 << 1, objArr, this.B);
            }
        }
        if (i11 != this.C) {
            throw new ConcurrentModificationException();
        }
        this.C = i13;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.A;
        Object[] objArr = this.B;
        int i10 = this.C;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.C) {
            z10 = true;
        }
        if (!z10) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.B;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.C <= 0;
    }

    public final Object j(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.C) {
            z10 = true;
        }
        if (z10) {
            return this.B[(i10 << 1) + 1];
        }
        v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.C;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(iHashCode, obj) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.B;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iD;
        int[] iArr = this.A;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.A = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.B, i13 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.B = objArrCopyOf;
            if (i10 != this.C) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.A;
            int i14 = i12 + 1;
            h00.n.p0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.B;
            h00.n.q0(i14 << 1, i12 << 1, this.C << 1, objArr2, objArr2);
        }
        int i15 = this.C;
        if (i10 == i15) {
            int[] iArr3 = this.A;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.B;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.C = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return h(iE);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !kotlin.jvm.internal.m.a(obj2, j(iE))) {
            return false;
        }
        h(iE);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !kotlin.jvm.internal.m.a(obj2, j(iE))) {
            return false;
        }
        i(iE, obj3);
        return true;
    }

    public final int size() {
        return this.C;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.C * 28);
        sb2.append('{');
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i11);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
