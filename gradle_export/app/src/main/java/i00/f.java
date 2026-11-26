package i00;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class f implements Map, Serializable, v00.e {
    public static final f N;
    public Object[] A;
    public Object[] B;
    public int[] C;
    public int[] D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public g J;
    public h K;
    public g L;
    public boolean M;

    static {
        f fVar = new f(0);
        fVar.M = true;
        N = fVar;
    }

    public f() {
        this(8);
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.A = objArr;
        this.B = null;
        this.C = iArr;
        this.D = new int[iHighestOneBit];
        this.E = 2;
        this.F = 0;
        this.G = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        e();
        while (true) {
            int iM = m(obj);
            int i = this.E * 2;
            int length = this.D.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.D;
                int i3 = iArr[iM];
                if (i3 == 0) {
                    int i4 = this.F;
                    Object[] objArr = this.A;
                    if (i4 >= objArr.length) {
                        j(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.F = i5;
                    objArr[i4] = obj;
                    this.C[i4] = iM;
                    iArr[iM] = i5;
                    this.I++;
                    this.H++;
                    if (i2 > this.E) {
                        this.E = i2;
                    }
                    return i4;
                }
                if (m.a(this.A[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    n(this.D.length * 2);
                    break;
                }
                iM = iM == 0 ? this.D.length - 1 : iM - 1;
            }
        }
    }

    public final f c() {
        e();
        this.M = true;
        if (this.I > 0) {
            return this;
        }
        f fVar = N;
        m.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    @Override
    public final void clear() {
        e();
        int i = this.F - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.C;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.D[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ze.d.O(this.A, 0, this.F);
        Object[] objArr = this.B;
        if (objArr != null) {
            ze.d.O(objArr, 0, this.F);
        }
        this.I = 0;
        this.F = 0;
        this.H++;
    }

    @Override
    public final boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public final void e() {
        if (this.M) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final Set entrySet() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.L = gVar2;
        return gVar2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.I == map.size() && h(map.entrySet());
    }

    public final void g(boolean z) {
        int i;
        Object[] objArr = this.B;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.F;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.C;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.A;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.D[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ze.d.O(this.A, i3, i);
        if (objArr != null) {
            ze.d.O(objArr, i3, this.F);
        }
        this.F = i3;
    }

    @Override
    public final Object get(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.B;
        m.b(objArr);
        return objArr[iK];
    }

    public final boolean h(Collection m) {
        m.e(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            int i2 = cVar.A;
            f fVar = (f) cVar.D;
            if (i2 >= fVar.F) {
                throw new NoSuchElementException();
            }
            cVar.A = i2 + 1;
            cVar.B = i2;
            Object obj = fVar.A[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.B;
            m.b(objArr);
            Object obj2 = objArr[cVar.B];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.h();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        m.e(entry, "entry");
        int iK = k(entry.getKey());
        if (iK < 0) {
            return false;
        }
        Object[] objArr = this.B;
        m.b(objArr);
        return m.a(objArr[iK], entry.getValue());
    }

    @Override
    public final boolean isEmpty() {
        return this.I == 0;
    }

    public final void j(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.A;
        int length = objArr.length;
        int i2 = this.F;
        int i3 = length - i2;
        int i4 = i2 - this.I;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            g(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            m.d(objArrCopyOf2, "copyOf(...)");
            this.A = objArrCopyOf2;
            Object[] objArr2 = this.B;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                m.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.B = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.C, i6);
            m.d(iArrCopyOf, "copyOf(...)");
            this.C = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.D.length) {
                n(iHighestOneBit);
            }
        }
    }

    public final int k(Object obj) {
        int iM = m(obj);
        int i = this.E;
        while (true) {
            int i2 = this.D[iM];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (m.a(this.A[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? this.D.length - 1 : iM - 1;
        }
    }

    @Override
    public final Set keySet() {
        g gVar = this.J;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.J = gVar2;
        return gVar2;
    }

    public final int l(Object obj) {
        int i = this.F;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.C[i] >= 0) {
                Object[] objArr = this.B;
                m.b(objArr);
                if (m.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.G;
    }

    public final void n(int i) {
        int[] iArr;
        this.H++;
        int i2 = 0;
        if (this.F > this.I) {
            g(false);
        }
        this.D = new int[i];
        this.G = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.F) {
            int i3 = i2 + 1;
            int iM = m(this.A[i2]);
            int i4 = this.E;
            while (true) {
                iArr = this.D;
                if (iArr[iM] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM = iM == 0 ? iArr.length - 1 : iM - 1;
            }
            iArr[iM] = i3;
            this.C[i2] = iM;
            i2 = i3;
        }
    }

    public final void o(int i) {
        int i2;
        int i3;
        int iM;
        int[] iArr;
        Object[] objArr = this.A;
        m.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.B;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.C[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.D.length - 1 : length - 1;
                int[] iArr2 = this.D;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.E) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM = m(this.A[i3]) - length;
                    iArr = this.D;
                }
            } while ((iM & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.C[i3] = i4;
        }
        this.C[i] = -1;
        this.I--;
        this.H++;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        e();
        int iA = a(obj);
        Object[] objArr = this.B;
        if (objArr == null) {
            int length = this.A.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.B = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override
    public final void putAll(Map from) {
        m.e(from, "from");
        e();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        j(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.B;
            if (objArr == null) {
                int length = this.A.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.B = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!m.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override
    public final Object remove(Object obj) {
        e();
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.B;
        m.b(objArr);
        Object obj2 = objArr[iK];
        o(iK);
        return obj2;
    }

    @Override
    public final int size() {
        return this.I;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.I * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = cVar.A;
            f fVar = (f) cVar.D;
            if (i2 >= fVar.F) {
                throw new NoSuchElementException();
            }
            cVar.A = i2 + 1;
            cVar.B = i2;
            Object obj = fVar.A[i2];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.B;
            m.b(objArr);
            Object obj2 = objArr[cVar.B];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.h();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    @Override
    public final Collection values() {
        h hVar = this.K;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.K = hVar2;
        return hVar2;
    }
}
