package l50;

import java.io.EOFException;
import k50.d0;
import k50.y;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(r30.a.a);
        m.d(bytes, "getBytes(...)");
        a = bytes;
    }

    public static final String a(k50.i iVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (iVar.F(j2) == 13) {
                String strZ = iVar.Z(j2, r30.a.a);
                iVar.skip(2L);
                return strZ;
            }
        }
        String strZ2 = iVar.Z(j, r30.a.a);
        iVar.skip(1L);
        return strZ2;
    }

    public static final int b(k50.i iVar, y options, boolean z) {
        int i;
        int i2;
        int i3;
        d0 d0Var;
        int i4;
        m.e(options, "options");
        d0 d0Var2 = iVar.A;
        if (d0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = d0Var2.a;
        int i5 = d0Var2.b;
        int i6 = d0Var2.c;
        int[] iArr = options.B;
        d0 d0Var3 = d0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i11 = iArr[i8];
            int i12 = i8 + 2;
            int i13 = iArr[i9];
            if (i13 != -1) {
                i7 = i13;
            }
            if (d0Var3 == null) {
                break;
            }
            if (i11 >= 0) {
                int i14 = i5 + 1;
                int i15 = bArr[i5] & 255;
                int i16 = i12 + i11;
                while (i12 != i16) {
                    if (i15 == iArr[i12]) {
                        i = iArr[i12 + i11];
                        if (i14 == i6) {
                            d0Var3 = d0Var3.f;
                            m.b(d0Var3);
                            int i17 = d0Var3.b;
                            byte[] bArr2 = d0Var3.a;
                            i2 = d0Var3.c;
                            if (d0Var3 == d0Var2) {
                                i3 = i17;
                                bArr = bArr2;
                                d0Var3 = null;
                            } else {
                                i3 = i17;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i14;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i18 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i18;
                    } else {
                        i12++;
                    }
                }
                return i7;
            }
            int i19 = (i11 * (-1)) + i12;
            while (true) {
                int i21 = i5 + 1;
                int i22 = i12 + 1;
                if ((bArr[i5] & 255) == iArr[i12]) {
                    boolean z2 = i22 == i19;
                    if (i21 == i6) {
                        m.b(d0Var3);
                        d0 d0Var4 = d0Var3.f;
                        m.b(d0Var4);
                        i3 = d0Var4.b;
                        byte[] bArr3 = d0Var4.a;
                        i4 = d0Var4.c;
                        if (d0Var4 != d0Var2) {
                            d0Var = d0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            d0Var = null;
                        }
                    } else {
                        d0Var = d0Var3;
                        i4 = i6;
                        i3 = i21;
                    }
                    if (z2) {
                        i = iArr[i22];
                        int i23 = i4;
                        d0Var3 = d0Var;
                        i2 = i23;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    d0Var3 = d0Var;
                    i12 = i22;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
