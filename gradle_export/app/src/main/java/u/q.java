package u;

import java.util.Arrays;

public final class q implements Cloneable {
    public boolean A;
    public long[] B;
    public Object[] C;
    public int D;

    public q(int i10) {
        if (i10 == 0) {
            this.B = v.a.f15305b;
            this.C = v.a.f15306c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.B = new long[i14];
        this.C = new Object[i14];
    }

    public q(Object obj) {
        this(10);
    }

    public final void a() {
        int i10 = this.D;
        Object[] objArr = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.D = 0;
        this.A = false;
    }

    public final Object b(long j9) {
        Object obj;
        int iB = v.a.b(this.B, this.D, j9);
        if (iB < 0 || (obj = this.C[iB]) == r.f14887a) {
            return null;
        }
        return obj;
    }

    public final int c(long j9) {
        if (this.A) {
            int i10 = this.D;
            long[] jArr = this.B;
            Object[] objArr = this.C;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != r.f14887a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.A = false;
            this.D = i11;
        }
        return v.a.b(this.B, this.D, j9);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        q qVar = (q) objClone;
        qVar.B = (long[]) this.B.clone();
        qVar.C = (Object[]) this.C.clone();
        return qVar;
    }

    public final long d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.D)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.A) {
            long[] jArr = this.B;
            Object[] objArr = this.C;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != r.f14887a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.A = false;
            this.D = i12;
        }
        return this.B[i10];
    }

    public final void e(Object obj, long j9) {
        Object obj2 = r.f14887a;
        int iB = v.a.b(this.B, this.D, j9);
        if (iB >= 0) {
            this.C[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.D;
        if (i10 < i11) {
            Object[] objArr = this.C;
            if (objArr[i10] == obj2) {
                this.B[i10] = j9;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.A) {
            long[] jArr = this.B;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.C;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.A = false;
                this.D = i12;
                i10 = ~v.a.b(this.B, i12, j9);
            }
        }
        int i14 = this.D;
        if (i14 >= this.B.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.B, i18);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.B = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.C, i18);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.C = objArrCopyOf;
        }
        int i19 = this.D;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.B;
            int i20 = i10 + 1;
            h00.n.t0(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.C;
            h00.n.q0(i20, i10, this.D, objArr3, objArr3);
        }
        this.B[i10] = j9;
        this.C[i10] = obj;
        this.D++;
    }

    public final void f(long j9) {
        int iB = v.a.b(this.B, this.D, j9);
        if (iB >= 0) {
            Object[] objArr = this.C;
            Object obj = objArr[iB];
            Object obj2 = r.f14887a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.A = true;
            }
        }
    }

    public final int g() {
        if (this.A) {
            int i10 = this.D;
            long[] jArr = this.B;
            Object[] objArr = this.C;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != r.f14887a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.A = false;
            this.D = i11;
        }
        return this.D;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.D)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.A) {
            long[] jArr = this.B;
            Object[] objArr = this.C;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != r.f14887a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.A = false;
            this.D = i12;
        }
        return this.C[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.D * 28);
        sb2.append('{');
        int i10 = this.D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            Object objH = h(i11);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
