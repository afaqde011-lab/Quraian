package k50;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class l implements Serializable, Comparable {
    public static final l D = new l(new byte[0]);
    public final byte[] A;
    public transient int B;
    public transient String C;

    public l(byte[] data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.A = data;
    }

    public static int g(l lVar, l other) {
        lVar.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return lVar.f(0, other.h());
    }

    public static int k(l lVar, l other) {
        lVar.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return lVar.j(other.h());
    }

    public static l o(l lVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return lVar.n(i, i2);
    }

    public String a() {
        byte[] map = a.a;
        byte[] bArr = this.A;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & 255) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr2[i2] = map[(b4 & 255) >> 2];
            bArr2[i2 + 1] = map[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr2[i2] = map[(b5 & 255) >> 2];
            bArr2[i2 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = map[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        return new String(bArr2, r30.a.a);
    }

    @Override
    public final int compareTo(l other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i = 0; i < iMin; i++) {
            int i2 = i(i) & 255;
            int i3 = other.i(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.A, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.b(bArrDigest);
        return new l(bArrDigest);
    }

    public int d() {
        return this.A.length;
    }

    public String e() {
        byte[] bArr = this.A;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = l50.b.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int iD = lVar.d();
            byte[] bArr = this.A;
            if (iD == bArr.length && lVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        byte[] bArr = this.A;
        int length = bArr.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!ab.a0.o(bArr, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.A;
    }

    public int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.A);
        this.B = iHashCode;
        return iHashCode;
    }

    public byte i(int i) {
        return this.A[i];
    }

    public int j(byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iD = d();
        byte[] bArr = this.A;
        for (int iMin = Math.min(iD, bArr.length - other.length); -1 < iMin; iMin--) {
            if (ab.a0.o(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i, l other, int i2) {
        kotlin.jvm.internal.m.e(other, "other");
        return other.m(0, this.A, i, i2);
    }

    public boolean m(int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.A;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && ab.a0.o(bArr, i, other, i2, i3);
    }

    public l n(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.A;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(oi.k.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new l(h00.n.w0(i, i2, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public l p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new l(bArrCopyOf);
            }
            i++;
        }
    }

    public final String q() {
        String str = this.C;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        kotlin.jvm.internal.m.e(bArrH, "<this>");
        String str2 = new String(bArrH, r30.a.a);
        this.C = str2;
        return str2;
    }

    public void r(i iVar, int i) {
        iVar.write(this.A, 0, i);
    }

    public String toString() {
        byte b;
        int i;
        l lVar = this;
        byte[] bArr = lVar.A;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i11 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i11 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i11 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i12 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i12;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i12 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strQ = lVar.q();
            String strSubstring = strQ.substring(0, i3);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            String strV0 = r30.r.v0(r30.r.v0(r30.r.v0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strQ.length()) {
                return oi.k.g(']', "[text=", strV0);
            }
            return "[size=" + bArr.length + " text=" + strV0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + lVar.e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(oi.k.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 != bArr.length) {
            lVar = new l(h00.n.w0(0, 64, bArr));
        }
        sb.append(lVar.e());
        sb.append("…]");
        return sb.toString();
    }
}
