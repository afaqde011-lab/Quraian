package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class b1 {

    public static final b1 f588f = new b1(0, new int[0], new Object[0], false);

    public int f589a;

    public int[] f590b;

    public Object[] f591c;

    public int f592d = -1;

    public boolean f593e;

    public b1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f589a = i10;
        this.f590b = iArr;
        this.f591c = objArr;
        this.f593e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f590b;
        if (i10 > iArr.length) {
            int i11 = this.f589a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f590b = Arrays.copyOf(iArr, i10);
            this.f591c = Arrays.copyOf(this.f591c, i10);
        }
    }

    public final int b() {
        int iV;
        int iX;
        int iV2;
        int i10 = this.f592d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f589a; i12++) {
            int i13 = this.f590b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f591c[i12]).getClass();
                    iV2 = l.V(i14) + 8;
                } else if (i15 == 2) {
                    iV2 = l.T(i14, (g) this.f591c[i12]);
                } else if (i15 == 3) {
                    iV = l.V(i14) * 2;
                    iX = ((b1) this.f591c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f591c[i12]).getClass();
                    iV2 = l.V(i14) + 4;
                }
                i11 = iV2 + i11;
            } else {
                long jLongValue = ((Long) this.f591c[i12]).longValue();
                iV = l.V(i14);
                iX = l.X(jLongValue);
            }
            i11 = iX + iV + i11;
        }
        this.f592d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f593e) {
            throw new UnsupportedOperationException();
        }
        a(this.f589a + 1);
        int[] iArr = this.f590b;
        int i11 = this.f589a;
        iArr[i11] = i10;
        this.f591c[i11] = obj;
        this.f589a = i11 + 1;
    }

    public final void d(d0 d0Var) {
        if (this.f589a == 0) {
            return;
        }
        d0Var.getClass();
        l lVar = (l) d0Var.f598a;
        for (int i10 = 0; i10 < this.f589a; i10++) {
            int i11 = this.f590b[i10];
            Object obj = this.f591c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                lVar.r0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                lVar.h0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                lVar.d0(i12, (g) obj);
            } else if (i13 == 3) {
                lVar.o0(i12, 3);
                ((b1) obj).d(d0Var);
                lVar.o0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                lVar.f0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        int i10 = this.f589a;
        if (i10 == b1Var.f589a) {
            int[] iArr = this.f590b;
            int[] iArr2 = b1Var.f590b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f591c;
            Object[] objArr2 = b1Var.f591c;
            int i12 = this.f589a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f589a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f590b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f591c;
        int i15 = this.f589a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
