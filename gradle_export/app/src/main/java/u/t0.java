package u;

import java.util.Arrays;

public final class t0 implements Cloneable {
    public int[] A;
    public Object[] B;
    public int C;

    public t0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.A = new int[i14];
        this.B = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.C;
        if (i11 != 0 && i10 <= this.A[i11 - 1]) {
            e(i10, obj);
            return;
        }
        if (i11 >= this.A.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.A, i15);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.A = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.B, i15);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.B = objArrCopyOf;
        }
        this.A[i11] = i10;
        this.B[i11] = obj;
        this.C = i11 + 1;
    }

    public final t0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        t0 t0Var = (t0) objClone;
        t0Var.A = (int[]) this.A.clone();
        t0Var.B = (Object[]) this.B.clone();
        return t0Var;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = v.a.a(this.A, this.C, i10);
        if (iA < 0 || (obj = this.B[iA]) == r.f14889c) {
            return null;
        }
        return obj;
    }

    public final int d(int i10) {
        if (i10 >= this.C || i10 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.A[i10];
    }

    public final void e(int i10, Object obj) {
        int iA = v.a.a(this.A, this.C, i10);
        if (iA >= 0) {
            this.B[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.C;
        if (i11 < i12) {
            Object[] objArr = this.B;
            if (objArr[i11] == r.f14889c) {
                this.A[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.A.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.A, i16);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.A = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.B, i16);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.B = objArrCopyOf;
        }
        int i17 = this.C;
        if (i17 - i11 != 0) {
            int[] iArr = this.A;
            int i18 = i11 + 1;
            h00.n.p0(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.B;
            h00.n.q0(i18, i11, this.C, objArr2, objArr2);
        }
        this.A[i11] = i10;
        this.B[i11] = obj;
        this.C++;
    }

    public final Object f(int i10) {
        if (i10 >= this.C || i10 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.B[i10];
    }

    public final String toString() {
        int i10 = this.C;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.C;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i12));
            sb2.append('=');
            Object objF = f(i12);
            if (objF != this) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
