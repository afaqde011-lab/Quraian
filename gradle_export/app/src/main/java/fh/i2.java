package fh;

import java.util.Arrays;
import java.util.Objects;

public final class i2 extends w0 {
    public static final i2 G = new i2(0, null, new Object[0]);
    public final transient Object D;
    public final transient Object[] E;
    public final transient int F;

    public i2(int i10, Object obj, Object[] objArr) {
        this.D = obj;
        this.E = objArr;
        this.F = i10;
    }

    public static i2 h(int i10, Object[] objArr, c50.h hVar) {
        if (i10 == 0) {
            return G;
        }
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new i2(1, null, objArr);
        }
        ta.c0.x(i10, objArr.length >> 1);
        Object objI = i(objArr, i10, e1.l(i10), 0);
        if (objI instanceof Object[]) {
            Object[] objArr2 = (Object[]) objI;
            v0 v0Var = (v0) objArr2[2];
            if (hVar == null) {
                throw v0Var.a();
            }
            hVar.D = v0Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objI = obj;
            i10 = iIntValue;
        }
        return new i2(i10, objI, objArr);
    }

    public static Object i(Object[] objArr, int i10, int i11, int i12) {
        v0 v0Var = null;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[i12]);
            Objects.requireNonNull(objArr[i12 ^ 1]);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = 0;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            while (i14 < i10) {
                int i16 = (i14 * 2) + i12;
                int i17 = (i15 * 2) + i12;
                Object obj = objArr[i16];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj2);
                int iW = w.w(obj.hashCode());
                while (true) {
                    int i18 = iW & i13;
                    int i19 = bArr[i18] & 255;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i15 < i14) {
                            objArr[i17] = obj;
                            objArr[i17 ^ 1] = obj2;
                        }
                        i15++;
                        break;
                    }
                    if (obj.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        Object obj3 = objArr[i20];
                        Objects.requireNonNull(obj3);
                        v0Var = new v0(obj, obj2, obj3);
                        objArr[i20] = obj2;
                        break;
                    }
                    iW = i18 + 1;
                }
                i14++;
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), v0Var};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i21 = 0;
            while (i14 < i10) {
                int i22 = (i14 * 2) + i12;
                int i23 = (i21 * 2) + i12;
                Object obj4 = objArr[i22];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj5);
                int iW2 = w.w(obj4.hashCode());
                while (true) {
                    int i24 = iW2 & i13;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i21 < i14) {
                            objArr[i23] = obj4;
                            objArr[i23 ^ 1] = obj5;
                        }
                        i21++;
                        break;
                    }
                    if (obj4.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj6 = objArr[i26];
                        Objects.requireNonNull(obj6);
                        v0Var = new v0(obj4, obj5, obj6);
                        objArr[i26] = obj5;
                        break;
                    }
                    iW2 = i24 + 1;
                }
                i14++;
            }
            return i21 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i21), v0Var};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        while (i14 < i10) {
            int i28 = (i14 * 2) + i12;
            int i29 = (i27 * 2) + i12;
            Object obj7 = objArr[i28];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i28 ^ 1];
            Objects.requireNonNull(obj8);
            int iW3 = w.w(obj7.hashCode());
            while (true) {
                int i30 = iW3 & i13;
                int i31 = iArr[i30];
                if (i31 == -1) {
                    iArr[i30] = i29;
                    if (i27 < i14) {
                        objArr[i29] = obj7;
                        objArr[i29 ^ 1] = obj8;
                    }
                    i27++;
                    break;
                }
                if (obj7.equals(objArr[i31])) {
                    int i32 = i31 ^ 1;
                    Object obj9 = objArr[i32];
                    Objects.requireNonNull(obj9);
                    v0Var = new v0(obj7, obj8, obj9);
                    objArr[i32] = obj8;
                    break;
                }
                iW3 = i30 + 1;
            }
            i14++;
        }
        return i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), v0Var};
    }

    public static Object j(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iW = w.w(obj2.hashCode());
            while (true) {
                int i12 = iW & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iW = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iW2 = w.w(obj2.hashCode());
            while (true) {
                int i14 = iW2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iW2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iW3 = w.w(obj2.hashCode());
            while (true) {
                int i16 = iW3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iW3 = i16 + 1;
            }
        }
    }

    @Override
    public final f2 c() {
        return new f2(this, this.E, 0, this.F);
    }

    @Override
    public final g2 d() {
        return new g2(this, new h2(this.E, 0, this.F));
    }

    @Override
    public final o0 e() {
        return new h2(this.E, 1, this.F);
    }

    @Override
    public final Object get(Object obj) {
        Object objJ = j(this.D, this.E, this.F, 0, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override
    public final int size() {
        return this.F;
    }
}
