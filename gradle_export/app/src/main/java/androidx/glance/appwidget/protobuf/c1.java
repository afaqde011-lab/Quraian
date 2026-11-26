package androidx.glance.appwidget.protobuf;

import java.util.Arrays;

public final class c1 {

    public static final c1 f875f = new c1(0, new int[0], new Object[0], false);

    public int f876a;

    public int[] f877b;

    public Object[] f878c;

    public int f879d = -1;

    public boolean f880e;

    public c1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f876a = i10;
        this.f877b = iArr;
        this.f878c = objArr;
        this.f880e = z10;
    }

    public static c1 c() {
        return new c1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f877b;
        if (i10 > iArr.length) {
            int i11 = this.f876a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f877b = Arrays.copyOf(iArr, i10);
            this.f878c = Arrays.copyOf(this.f878c, i10);
        }
    }

    public final int b() {
        int iI0;
        int iK0;
        int iI1;
        int i10 = this.f879d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f876a; i12++) {
            int i13 = this.f877b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f878c[i12]).getClass();
                    iI1 = o.i0(i14) + 8;
                } else if (i15 == 2) {
                    iI1 = o.e0(i14, (i) this.f878c[i12]);
                } else if (i15 == 3) {
                    iI0 = o.i0(i14) * 2;
                    iK0 = ((c1) this.f878c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.c());
                    }
                    ((Integer) this.f878c[i12]).getClass();
                    iI1 = o.i0(i14) + 4;
                }
                i11 = iI1 + i11;
            } else {
                long jLongValue = ((Long) this.f878c[i12]).longValue();
                iI0 = o.i0(i14);
                iK0 = o.k0(jLongValue);
            }
            i11 = iK0 + iI0 + i11;
        }
        this.f879d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f880e) {
            throw new UnsupportedOperationException();
        }
        a(this.f876a + 1);
        int[] iArr = this.f877b;
        int i11 = this.f876a;
        iArr[i11] = i10;
        this.f878c[i11] = obj;
        this.f876a = i11 + 1;
    }

    public final void e(k0 k0Var) {
        if (this.f876a == 0) {
            return;
        }
        k0Var.getClass();
        o oVar = (o) k0Var.f917a;
        for (int i10 = 0; i10 < this.f876a; i10++) {
            int i11 = this.f877b[i10];
            Object obj = this.f878c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                oVar.A0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                oVar.r0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                oVar.o0(i12, (i) obj);
            } else if (i13 == 3) {
                oVar.x0(i12, 3);
                ((c1) obj).e(k0Var);
                oVar.x0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                oVar.p0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        int i10 = this.f876a;
        if (i10 == c1Var.f876a) {
            int[] iArr = this.f877b;
            int[] iArr2 = c1Var.f877b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f878c;
            Object[] objArr2 = c1Var.f878c;
            int i12 = this.f876a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f876a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f877b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f878c;
        int i15 = this.f876a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
