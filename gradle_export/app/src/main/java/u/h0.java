package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class h0 implements v00.f, Set, v00.a {
    public final f0 A;
    public final f0 B;

    public h0(f0 f0Var) {
        kotlin.jvm.internal.m.e(f0Var, "parent");
        this.A = f0Var;
        this.B = f0Var;
    }

    @Override
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        f0 f0Var = this.B;
        f0Var.getClass();
        int i10 = f0Var.f14852g;
        for (Object obj : collection) {
            int iD = f0Var.d(obj);
            f0Var.f14847b[iD] = obj;
            long[] jArr = f0Var.f14848c;
            int i11 = f0Var.f14849d;
            jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((((long) iD) & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            f0Var.f14849d = iD;
            if (f0Var.f14850e == Integer.MAX_VALUE) {
                f0Var.f14850e = iD;
            }
        }
        return i10 != f0Var.f14852g;
    }

    @Override
    public final void clear() {
        this.B.b();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.c(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.A.c(it.next())) {
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
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.A, ((h0) obj).A);
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.A.f14852g == 0;
    }

    @Override
    public final Iterator iterator() {
        return new q30.h(this);
    }

    @Override
    public final boolean remove(Object obj) {
        return this.B.g(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        kotlin.jvm.internal.m.e(collection, "elements");
        f0 f0Var = this.B;
        f0Var.getClass();
        int i10 = f0Var.f14852g;
        Iterator it = collection.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = iHashCode ^ (iHashCode << 16);
            int i14 = i13 & 127;
            int i15 = f0Var.f14851f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = f0Var.f14846a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j9 = ((jArr[i17 + i11] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
                long j10 = (((long) i14) * 72340172838076673L) ^ j9;
                long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (j11 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                    int i19 = i11;
                    if (kotlin.jvm.internal.m.a(f0Var.f14847b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                    i11 = i19;
                }
                int i20 = i11;
                if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i12 += 8;
                i16 = (i16 + i12) & i15;
                i11 = i20;
            }
            if (iNumberOfTrailingZeros >= 0) {
                f0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i10 != f0Var.f14852g;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        return this.B.i(collection);
    }

    @Override
    public final int size() {
        return this.A.f14852g;
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "array");
        return kotlin.jvm.internal.l.c(this, objArr);
    }

    public final String toString() {
        return this.A.toString();
    }
}
