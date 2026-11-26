package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

public final class d1 {

    public static final d1 f4255f = new d1(0, new int[0], new Object[0], false);

    public int f4256a;

    public int[] f4257b;

    public Object[] f4258c;

    public int f4259d = -1;

    public boolean f4260e;

    public d1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4256a = i10;
        this.f4257b = iArr;
        this.f4258c = objArr;
        this.f4260e = z10;
    }

    public static d1 c() {
        return new d1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f4257b;
        if (i10 > iArr.length) {
            int i11 = this.f4256a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4257b = Arrays.copyOf(iArr, i10);
            this.f4258c = Arrays.copyOf(this.f4258c, i10);
        }
    }

    public final int b() {
        int iV;
        int iX;
        int iR;
        int i10 = this.f4259d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4256a; i12++) {
            int i13 = this.f4257b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f4258c[i12]).getClass();
                    iR = m.R(i14);
                } else if (i15 == 2) {
                    iR = m.O(i14, (i) this.f4258c[i12]);
                } else if (i15 == 3) {
                    iV = m.V(i14) * 2;
                    iX = ((d1) this.f4258c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.c());
                    }
                    ((Integer) this.f4258c[i12]).getClass();
                    iR = m.Q(i14);
                }
                i11 = iR + i11;
            } else {
                long jLongValue = ((Long) this.f4258c[i12]).longValue();
                iV = m.V(i14);
                iX = m.X(jLongValue);
            }
            i11 = iX + iV + i11;
        }
        this.f4259d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f4260e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4256a + 1);
        int[] iArr = this.f4257b;
        int i11 = this.f4256a;
        iArr[i11] = i10;
        this.f4258c[i11] = obj;
        this.f4256a = i11 + 1;
    }

    public final void e(k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        if (this.f4256a == 0) {
            return;
        }
        k0Var.getClass();
        m mVar = (m) k0Var.f4283a;
        for (int i10 = 0; i10 < this.f4256a; i10++) {
            int i11 = this.f4257b[i10];
            Object obj = this.f4258c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                mVar.h0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                mVar.c0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                k0Var.a(i12, (i) obj);
            } else if (i13 == 3) {
                mVar.f0(i12, 3);
                ((d1) obj).e(k0Var);
                mVar.f0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                mVar.a0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i10 = this.f4256a;
        if (i10 == d1Var.f4256a) {
            int[] iArr = this.f4257b;
            int[] iArr2 = d1Var.f4257b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f4258c;
            Object[] objArr2 = d1Var.f4258c;
            int i12 = this.f4256a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4256a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f4257b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f4258c;
        int i15 = this.f4256a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
