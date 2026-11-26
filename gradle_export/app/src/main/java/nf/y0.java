package nf;

import java.util.Arrays;

public final class y0 extends c1 {
    public final u0 A;

    public y0(u0 u0Var) {
        this.A = u0Var;
    }

    @Override
    public final int a() {
        return c1.d((byte) 64);
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iA = c1Var.a();
        int iD = c1.d((byte) 64);
        if (iD != iA) {
            return iD - c1Var.a();
        }
        u0 u0Var = ((y0) c1Var).A;
        u0 u0Var2 = this.A;
        byte[] bArr = u0Var2.B;
        int length = bArr.length;
        byte[] bArr2 = u0Var.B;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return r0.f11253a.compare(u0Var2.m(), u0Var.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            return this.A.equals(((y0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.d((byte) 64)), this.A});
    }

    public final String toString() {
        l0 l0Var;
        int i10;
        boolean z10;
        m0 m0Var = o0.f11248d;
        o0 m0Var2 = m0Var.f11251c;
        if (m0Var2 == null) {
            l0 l0Var2 = m0Var.f11249a;
            char[] cArr = l0Var2.f11238b;
            int i11 = 0;
            while (true) {
                if (i11 >= cArr.length) {
                    l0Var = l0Var2;
                    break;
                }
                char c10 = cArr[i11];
                if (c10 >= 'a' && c10 <= 'z') {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= cArr.length) {
                            z10 = false;
                            break;
                        }
                        char c11 = cArr[i12];
                        if (c11 >= 'A' && c11 <= 'Z') {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (!z10) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i13 = 0; i13 < cArr.length; i13++) {
                            char c12 = cArr[i13];
                            if (c12 >= 97 && c12 <= 122) {
                                c12 ^= 32;
                            }
                            cArr2[i13] = (char) c12;
                        }
                        l0Var = new l0(l0Var2.f11237a.concat(".upperCase()"), cArr2);
                        byte[] bArr = l0Var.f11243g;
                        if (!l0Var2.f11244h || l0Var.f11244h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i10 = 65; i10 <= 90; i10++) {
                            int i14 = i10 | 32;
                            byte b7 = bArr[i10];
                            byte b10 = bArr[i14];
                            if (b7 == -1) {
                                bArrCopyOf[i10] = b10;
                            } else {
                                char c13 = (char) i10;
                                char c14 = (char) i14;
                                if (b10 != -1) {
                                    throw new IllegalStateException(b.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                }
                                bArrCopyOf[i14] = b7;
                            }
                        }
                        l0Var = new l0(l0Var.f11237a.concat(".ignoreCase()"), l0Var.f11238b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i11++;
            }
            m0Var2 = l0Var == l0Var2 ? m0Var : new m0(l0Var);
            m0Var.f11251c = m0Var2;
        }
        byte[] bArrM = this.A.m();
        return a1.b.p("h'", m0Var2.c(bArrM.length, bArrM), "'");
    }
}
