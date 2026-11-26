package androidx.datastore.preferences.protobuf;

import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class l0 implements u0 {

    public static final int[] f646n = new int[0];

    public static final Unsafe f647o = h1.i();

    public final int[] f648a;

    public final Object[] f649b;

    public final int f650c;

    public final int f651d;

    public final a f652e;

    public final boolean f653f;

    public final int[] f654g;

    public final int f655h;

    public final int f656i;

    public final n0 f657j;

    public final a0 f658k;
    public final a1 l;
    public final h0 m;

    public l0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, n0 n0Var, a0 a0Var, a1 a1Var, o oVar, h0 h0Var) {
        this.f648a = iArr;
        this.f649b = objArr;
        this.f650c = i10;
        this.f651d = i11;
        this.f653f = aVar instanceof v;
        this.f654g = iArr2;
        this.f655h = i12;
        this.f656i = i13;
        this.f657j = n0Var;
        this.f658k = a0Var;
        this.l = a1Var;
        this.f652e = aVar;
        this.m = h0Var;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = g4.c.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int G(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).g();
        }
        return true;
    }

    public static l0 s(t0 t0Var, n0 n0Var, a0 a0Var, a1 a1Var, o oVar, h0 h0Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        Object[] objArr;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldB;
        int i31;
        char cCharAt9;
        int i32;
        Field fieldB2;
        Field fieldB3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        String str = t0Var.f678b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (str.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = str.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f646n;
            i13 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = str.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = str.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i24;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i24;
            }
            int i45 = i42 + 1;
            int iCharAt4 = str.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = str.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = str.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = str.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = str.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = str.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt = str.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = str.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = str.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = str.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = str.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = str.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = str.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = str.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i11 = iCharAt5;
            i12 = i67;
            i13 = iCharAt3;
            i39 = i63;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = i66;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f647o;
        Object[] objArr2 = t0Var.f679c;
        Class<?> cls = t0Var.f677a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i68 = i16 + i12;
        int i69 = i68;
        int i70 = i16;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            int i74 = length;
            if (iCharAt10 >= 55296) {
                int i75 = iCharAt10 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    cCharAt12 = str.charAt(i76);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    objArr2 = objArr;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i36;
            } else {
                objArr = objArr2;
                i25 = i73;
            }
            int i78 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i34 = i80 + 1;
                    cCharAt11 = str.charAt(i80);
                    i35 = i79;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 = i35 | ((cCharAt11 & 8191) << i81);
                    i81 += 13;
                    i80 = i34;
                }
                iCharAt11 = i35 | (cCharAt11 << i81);
                i26 = i34;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt10;
            int i83 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            int i84 = i13;
            if (i83 >= 51) {
                int i85 = i26 + 1;
                int iCharAt12 = str.charAt(i26);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = 13;
                    while (true) {
                        i33 = i85 + 1;
                        cCharAt10 = str.charAt(i85);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i33;
                        c10 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i87);
                    i85 = i33;
                }
                int i88 = i83 - 51;
                int i89 = iCharAt12;
                if (i88 == 9 || i88 == 17) {
                    objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                } else if (i88 == 12 && (e4.f.a(t0Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i90 = i89 * 2;
                Object obj = objArr[i90];
                if (obj instanceof Field) {
                    fieldB2 = (Field) obj;
                } else {
                    fieldB2 = B(cls, (String) obj);
                    objArr[i90] = fieldB2;
                }
                int i91 = i68;
                i28 = i15;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldB2);
                int i92 = i90 + 1;
                Object obj2 = objArr[i92];
                if (obj2 instanceof Field) {
                    fieldB3 = (Field) obj2;
                } else {
                    fieldB3 = B(cls, (String) obj2);
                    objArr[i92] = fieldB3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldB3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i71 = i71;
                i29 = i85;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i27 = i91;
                i30 = 0;
            } else {
                i27 = i68;
                int i93 = i15 + 1;
                Field fieldB4 = B(cls, (String) objArr[i15]);
                if (i83 == 9 || i83 == 17) {
                    i27 = i27;
                    objArr3[a1.b.e(i71, 3, 2, 1)] = fieldB4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = i27;
                        i32 = i15 + 2;
                        objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i93];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = i27;
                        if (t0Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i32 = i15 + 2;
                            objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i93];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            i29 = i26 + 1;
                            int iCharAt13 = str.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i94 = iCharAt13 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i31 = i29 + 1;
                                    cCharAt9 = str.charAt(i29);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i94 |= (cCharAt9 & 8191) << i95;
                                    i95 += 13;
                                    i29 = i31;
                                }
                                iCharAt13 = i94 | (cCharAt9 << i95);
                                i29 = i31;
                            }
                            int i96 = (iCharAt13 / 32) + (i84 * 2);
                            Object obj3 = objArr[i96];
                            if (obj3 instanceof Field) {
                                fieldB = (Field) obj3;
                            } else {
                                fieldB = B(cls, (String) obj3);
                                objArr[i96] = fieldB;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB);
                            i30 = iCharAt13 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    } else {
                        if (i83 == 50) {
                            int i97 = i70 + 1;
                            iArr[i70] = i71;
                            int i98 = (i71 / 3) * 2;
                            int i99 = i15 + 2;
                            objArr3[i98] = objArr[i93];
                            i70 = i97;
                            if ((iCharAt11 & 2048) != 0) {
                                i28 = i15 + 3;
                                objArr3[i98 + 1] = objArr[i99];
                            } else {
                                i28 = i99;
                            }
                        } else {
                            i27 = i27;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        if (i83 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                }
                i28 = i93;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                if (i83 >= 18) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
            }
            int i100 = i71 + 1;
            iArr4[i71] = i82;
            int i101 = i71 + 2;
            int i102 = i71;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset;
            i71 = i102 + 3;
            iArr4[i101] = (i30 << 20) | iObjectFieldOffset2;
            i39 = i29;
            length = i74;
            iArr3 = iArr4;
            objArr2 = objArr;
            i68 = i27;
            i15 = i28;
            i13 = i84;
            str = str;
        }
        return new l0(iArr3, objArr3, i11, i14, t0Var.f677a, iArr, i16, i68, n0Var, a0Var, a1Var, oVar, h0Var);
    }

    public static long t(int i10) {
        return i10 & 1048575;
    }

    public static int u(Object obj, long j9) {
        return ((Integer) h1.f615c.h(obj, j9)).intValue();
    }

    public static long v(Object obj, long j9) {
        return ((Long) h1.f615c.h(obj, j9)).longValue();
    }

    public final void A(int i10, k kVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i11 = 536870912 & i10;
        a0 a0Var = this.f658k;
        if (i11 != 0) {
            a0Var.getClass();
            kVar.s(a0.a(obj, i10 & 1048575), true);
        } else {
            a0Var.getClass();
            kVar.s(a0.a(obj, i10 & 1048575), false);
        }
    }

    public final void C(Object obj, int i10) {
        int i11 = this.f648a[i10 + 2];
        long j9 = 1048575 & i11;
        if (j9 == 1048575) {
            return;
        }
        h1.m(obj, j9, (1 << (i11 >>> 20)) | h1.f615c.f(obj, j9));
    }

    public final void D(Object obj, int i10, int i11) {
        h1.m(obj, this.f648a[i11 + 2] & 1048575, i10);
    }

    public final void E(Object obj, int i10, a aVar) {
        f647o.putObject(obj, H(i10) & 1048575, aVar);
        C(obj, i10);
    }

    public final void F(Object obj, int i10, int i11, a aVar) {
        f647o.putObject(obj, H(i11) & 1048575, aVar);
        D(obj, i10, i11);
    }

    public final int H(int i10) {
        return this.f648a[i10 + 1];
    }

    public final void I(Object obj, d0 d0Var) throws IOException {
        int i10;
        int i11;
        boolean z10;
        l0 l0Var = this;
        int[] iArr = l0Var.f648a;
        int length = iArr.length;
        Unsafe unsafe = f647o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iH = l0Var.H(i14);
            int i16 = iArr[i14];
            int iG = G(iH);
            if (iG <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j9 = iH & i12;
            switch (iG) {
                case 0:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        double d3 = h1.f615c.d(obj, j9);
                        l lVar = (l) d0Var.f598a;
                        lVar.getClass();
                        lVar.h0(i16, Double.doubleToRawLongBits(d3));
                    }
                    break;
                case 1:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        float fE = h1.f615c.e(obj, j9);
                        l lVar2 = (l) d0Var.f598a;
                        lVar2.getClass();
                        lVar2.f0(i16, Float.floatToRawIntBits(fE));
                    }
                    l0Var = this;
                    break;
                case 2:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).r0(i16, unsafe.getLong(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 3:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).r0(i16, unsafe.getLong(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 4:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).j0(i16, unsafe.getInt(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 5:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).h0(i16, unsafe.getLong(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 6:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).f0(i16, unsafe.getInt(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 7:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).c0(i16, h1.f615c.c(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 8:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        Object object = unsafe.getObject(obj, j9);
                        if (object instanceof String) {
                            ((l) d0Var.f598a).m0(i16, (String) object);
                        } else {
                            ((l) d0Var.f598a).d0(i16, (g) object);
                        }
                    }
                    l0Var = this;
                    break;
                case 9:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).l0(i16, (a) unsafe.getObject(obj, j9), l0Var.i(i14));
                    }
                    break;
                case 10:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).d0(i16, (g) unsafe.getObject(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 11:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).p0(i16, unsafe.getInt(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 12:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).j0(i16, unsafe.getInt(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 13:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).f0(i16, unsafe.getInt(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 14:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        ((l) d0Var.f598a).h0(i16, unsafe.getLong(obj, j9));
                    }
                    l0Var = this;
                    break;
                case 15:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        int i19 = unsafe.getInt(obj, j9);
                        ((l) d0Var.f598a).p0(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    l0Var = this;
                    break;
                case 16:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        long j10 = unsafe.getLong(obj, j9);
                        ((l) d0Var.f598a).r0(i16, (j10 >> 63) ^ (j10 << 1));
                    }
                    l0Var = this;
                    break;
                case 17:
                    if (l0Var.k(obj, i14, i13, i15, i10)) {
                        d0Var.a(i16, unsafe.getObject(obj, j9), l0Var.i(i14));
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    i13 = i13;
                    v0.n(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    i13 = i13;
                    v0.r(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    i13 = i13;
                    v0.t(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    i13 = i13;
                    v0.z(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    i13 = i13;
                    v0.s(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 23:
                    i13 = i13;
                    v0.q(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 24:
                    i13 = i13;
                    v0.p(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 25:
                    i13 = i13;
                    v0.m(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case RuntimeVersion.MINOR:
                    i11 = i13;
                    int i20 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j9);
                    Class cls = v0.f681a;
                    if (list != null && !list.isEmpty()) {
                        d0Var.getClass();
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            ((l) d0Var.f598a).m0(i20, (String) list.get(i21));
                        }
                    }
                    i13 = i11;
                    break;
                case 27:
                    i11 = i13;
                    int i22 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j9);
                    u0 u0VarI = l0Var.i(i14);
                    Class cls2 = v0.f681a;
                    if (list2 != null && !list2.isEmpty()) {
                        d0Var.getClass();
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((l) d0Var.f598a).l0(i22, (a) list2.get(i23), u0VarI);
                        }
                    }
                    i13 = i11;
                    break;
                case 28:
                    i11 = i13;
                    int i24 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j9);
                    Class cls3 = v0.f681a;
                    if (list3 != null && !list3.isEmpty()) {
                        d0Var.getClass();
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            ((l) d0Var.f598a).d0(i24, (g) list3.get(i25));
                        }
                    }
                    i13 = i11;
                    break;
                case 29:
                    z10 = false;
                    v0.y(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 30:
                    z10 = false;
                    v0.o(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 31:
                    z10 = false;
                    v0.u(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    z10 = false;
                    v0.v(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 33:
                    z10 = false;
                    v0.w(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 34:
                    z10 = false;
                    v0.x(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, false);
                    i13 = i13;
                    break;
                case 35:
                    i11 = i13;
                    v0.n(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 36:
                    i11 = i13;
                    v0.r(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 37:
                    i11 = i13;
                    v0.t(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 38:
                    i11 = i13;
                    v0.z(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 39:
                    i11 = i13;
                    v0.s(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 40:
                    i11 = i13;
                    v0.q(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 41:
                    i11 = i13;
                    v0.p(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 42:
                    i11 = i13;
                    v0.m(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 43:
                    i11 = i13;
                    v0.y(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 44:
                    i11 = i13;
                    v0.o(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 45:
                    i11 = i13;
                    v0.u(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 46:
                    i11 = i13;
                    v0.v(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 47:
                    i11 = i13;
                    v0.w(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 48:
                    i11 = i13;
                    v0.x(iArr[i14], (List) unsafe.getObject(obj, j9), d0Var, true);
                    i13 = i11;
                    break;
                case 49:
                    i11 = i13;
                    int i26 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j9);
                    u0 u0VarI2 = l0Var.i(i14);
                    Class cls4 = v0.f681a;
                    if (list4 != null && !list4.isEmpty()) {
                        d0Var.getClass();
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            d0Var.a(i26, list4.get(i27), u0VarI2);
                        }
                    }
                    i13 = i11;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j9);
                    if (object2 != null) {
                        int i28 = 2;
                        Object obj2 = l0Var.f649b[(i14 / 3) * 2];
                        l0Var.m.getClass();
                        e0 e0Var = ((f0) obj2).f604a;
                        l lVar3 = (l) d0Var.f598a;
                        lVar3.getClass();
                        for (Map.Entry entry : ((g0) object2).entrySet()) {
                            lVar3.o0(i16, i28);
                            lVar3.q0(f0.a(e0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            q.b(lVar3, e0Var.f600a, 1, key);
                            i28 = 2;
                            q.b(lVar3, e0Var.f601b, 2, value);
                            i13 = i13;
                        }
                    }
                    i11 = i13;
                    i13 = i11;
                    break;
                case 51:
                    if (l0Var.m(obj, i16, i14)) {
                        double dDoubleValue = ((Double) h1.f615c.h(obj, j9)).doubleValue();
                        l lVar4 = (l) d0Var.f598a;
                        lVar4.getClass();
                        lVar4.h0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (l0Var.m(obj, i16, i14)) {
                        float fFloatValue = ((Float) h1.f615c.h(obj, j9)).floatValue();
                        l lVar5 = (l) d0Var.f598a;
                        lVar5.getClass();
                        lVar5.f0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).r0(i16, v(obj, j9));
                    }
                    break;
                case 54:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).r0(i16, v(obj, j9));
                    }
                    break;
                case 55:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).j0(i16, u(obj, j9));
                    }
                    break;
                case 56:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).h0(i16, v(obj, j9));
                    }
                    break;
                case 57:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).f0(i16, u(obj, j9));
                    }
                    break;
                case 58:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).c0(i16, ((Boolean) h1.f615c.h(obj, j9)).booleanValue());
                    }
                    break;
                case 59:
                    if (l0Var.m(obj, i16, i14)) {
                        Object object3 = unsafe.getObject(obj, j9);
                        if (object3 instanceof String) {
                            ((l) d0Var.f598a).m0(i16, (String) object3);
                        } else {
                            ((l) d0Var.f598a).d0(i16, (g) object3);
                        }
                    }
                    break;
                case 60:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).l0(i16, (a) unsafe.getObject(obj, j9), l0Var.i(i14));
                    }
                    break;
                case 61:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).d0(i16, (g) unsafe.getObject(obj, j9));
                    }
                    break;
                case 62:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).p0(i16, u(obj, j9));
                    }
                    break;
                case 63:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).j0(i16, u(obj, j9));
                    }
                    break;
                case 64:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).f0(i16, u(obj, j9));
                    }
                    break;
                case 65:
                    if (l0Var.m(obj, i16, i14)) {
                        ((l) d0Var.f598a).h0(i16, v(obj, j9));
                    }
                    break;
                case 66:
                    if (l0Var.m(obj, i16, i14)) {
                        int iU = u(obj, j9);
                        ((l) d0Var.f598a).p0(i16, (iU >> 31) ^ (iU << 1));
                    }
                    break;
                case 67:
                    if (l0Var.m(obj, i16, i14)) {
                        long jV = v(obj, j9);
                        ((l) d0Var.f598a).r0(i16, (jV << 1) ^ (jV >> 63));
                    }
                    break;
                case 68:
                    if (l0Var.m(obj, i16, i14)) {
                        d0Var.a(i16, unsafe.getObject(obj, j9), l0Var.i(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        ((c1) l0Var.l).getClass();
        ((v) obj).unknownFields.d(d0Var);
    }

    @Override
    public final void a(Object obj, d0 d0Var) throws IOException {
        d0Var.getClass();
        I(obj, d0Var);
    }

    @Override
    public final int b(v vVar) {
        int i10;
        int iV;
        int iV2;
        int iV3;
        int iX;
        int iV4;
        int iX2;
        int iV5;
        int iV6;
        int iT;
        int iV7;
        int iA;
        int iC;
        int iV8;
        int size;
        int i11;
        int iV9;
        int iV10;
        int size2;
        int iV11;
        int iW;
        int iX3;
        int iA2;
        int iV12;
        int iW2;
        l0 l0Var = this;
        v vVar2 = vVar;
        Unsafe unsafe = f647o;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iT2 = 0;
        while (true) {
            int[] iArr = l0Var.f648a;
            if (i13 >= iArr.length) {
                ((c1) l0Var.l).getClass();
                return vVar2.unknownFields.b() + iT2;
            }
            int iH = l0Var.H(i13);
            int iG = G(iH);
            int i15 = iArr[i13];
            int i16 = iArr[i13 + 2];
            int i17 = i16 & 1048575;
            if (iG <= 17) {
                if (i17 != i12) {
                    i14 = i17 == 1048575 ? 0 : unsafe.getInt(vVar2, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j9 = iH & 1048575;
            if (iG >= r.B.A) {
                int i18 = r.C.A;
            }
            switch (iG) {
                case 0:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV = l.V(i15);
                        iC = iV + 8;
                        iT2 += iC;
                    }
                    break;
                case 1:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV2 = l.V(i15);
                        iV6 = iV2 + 4;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 2:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        long j10 = unsafe.getLong(vVar2, j9);
                        iV3 = l.V(i15);
                        iX = l.X(j10);
                        iT2 += iX + iV3;
                    }
                    l0Var = this;
                    break;
                case 3:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        long j11 = unsafe.getLong(vVar2, j9);
                        iV3 = l.V(i15);
                        iX = l.X(j11);
                        iT2 += iX + iV3;
                    }
                    l0Var = this;
                    break;
                case 4:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        int i19 = unsafe.getInt(vVar2, j9);
                        iV4 = l.V(i15);
                        iX2 = l.X(i19);
                        iT = iX2 + iV4;
                        iT2 += iT;
                    }
                    l0Var = this;
                    break;
                case 5:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV5 = l.V(i15);
                        iV6 = iV5 + 8;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 6:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV2 = l.V(i15);
                        iV6 = iV2 + 4;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 7:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV6 = l.V(i15) + 1;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 8:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        Object object = unsafe.getObject(vVar2, j9);
                        iT2 = (object instanceof g ? l.T(i15, (g) object) : l.U((String) object) + l.V(i15)) + iT2;
                    }
                    l0Var = this;
                    break;
                case 9:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        Object object2 = unsafe.getObject(vVar2, j9);
                        u0 u0VarI = l0Var.i(i13);
                        Class cls = v0.f681a;
                        int iV13 = l.V(i15);
                        int iA3 = ((a) object2).a(u0VarI);
                        iT2 += l.W(iA3) + iA3 + iV13;
                    }
                    break;
                case 10:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iT = l.T(i15, (g) unsafe.getObject(vVar2, j9));
                        iT2 += iT;
                    }
                    l0Var = this;
                    break;
                case 11:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        int i20 = unsafe.getInt(vVar2, j9);
                        iV4 = l.V(i15);
                        iX2 = l.W(i20);
                        iT = iX2 + iV4;
                        iT2 += iT;
                    }
                    l0Var = this;
                    break;
                case 12:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        int i21 = unsafe.getInt(vVar2, j9);
                        iV4 = l.V(i15);
                        iX2 = l.X(i21);
                        iT = iX2 + iV4;
                        iT2 += iT;
                    }
                    l0Var = this;
                    break;
                case 13:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV2 = l.V(i15);
                        iV6 = iV2 + 4;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 14:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        iV5 = l.V(i15);
                        iV6 = iV5 + 8;
                        iT2 += iV6;
                    }
                    l0Var = this;
                    vVar2 = vVar;
                    break;
                case 15:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        int i22 = unsafe.getInt(vVar2, j9);
                        iV4 = l.V(i15);
                        iX2 = l.W((i22 >> 31) ^ (i22 << 1));
                        iT = iX2 + iV4;
                        iT2 += iT;
                    }
                    l0Var = this;
                    break;
                case 16:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        long j12 = unsafe.getLong(vVar2, j9);
                        iV3 = l.V(i15);
                        iX = l.X((j12 << 1) ^ (j12 >> 63));
                        iT2 += iX + iV3;
                    }
                    l0Var = this;
                    break;
                case 17:
                    if (l0Var.k(vVar2, i13, i12, i14, i10)) {
                        a aVar = (a) unsafe.getObject(vVar2, j9);
                        u0 u0VarI2 = l0Var.i(i13);
                        iV7 = l.V(i15) * 2;
                        iA = aVar.a(u0VarI2);
                        iC = iA + iV7;
                        iT2 += iC;
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    iC = v0.c(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    iC = v0.b(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    List list = (List) unsafe.getObject(vVar2, j9);
                    Class cls2 = v0.f681a;
                    if (list.size() == 0) {
                        iV8 = 0;
                    } else {
                        iV8 = (l.V(i15) * list.size()) + v0.e(list);
                    }
                    iT2 += iV8;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    List list2 = (List) unsafe.getObject(vVar2, j9);
                    Class cls3 = v0.f681a;
                    size = list2.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.i(list2);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    List list3 = (List) unsafe.getObject(vVar2, j9);
                    Class cls4 = v0.f681a;
                    size = list3.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.d(list3);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case 23:
                    iC = v0.c(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case 24:
                    iC = v0.b(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(vVar2, j9);
                    Class cls5 = v0.f681a;
                    int size3 = list4.size();
                    iT2 += size3 == 0 ? 0 : (l.V(i15) + 1) * size3;
                    break;
                case RuntimeVersion.MINOR:
                    List list5 = (List) unsafe.getObject(vVar2, j9);
                    Class cls6 = v0.f681a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iV8 = 0;
                    } else {
                        iV8 = l.V(i15) * size4;
                        for (int i23 = 0; i23 < size4; i23++) {
                            Object obj = list5.get(i23);
                            if (obj instanceof g) {
                                int size5 = ((g) obj).size();
                                iV8 = l.W(size5) + size5 + iV8;
                            } else {
                                iV8 = l.U((String) obj) + iV8;
                            }
                        }
                    }
                    iT2 += iV8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(vVar2, j9);
                    u0 u0VarI3 = l0Var.i(i13);
                    Class cls7 = v0.f681a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iV10 = 0;
                    } else {
                        iV10 = l.V(i15) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            int iA4 = ((a) list6.get(i24)).a(u0VarI3);
                            iV10 += l.W(iA4) + iA4;
                        }
                    }
                    iT2 += iV10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(vVar2, j9);
                    Class cls8 = v0.f681a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iV8 = 0;
                    } else {
                        iV8 = l.V(i15) * size7;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int size8 = ((g) list7.get(i25)).size();
                            iV8 += l.W(size8) + size8;
                        }
                    }
                    iT2 += iV8;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(vVar2, j9);
                    Class cls9 = v0.f681a;
                    size = list8.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.h(list8);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(vVar2, j9);
                    Class cls10 = v0.f681a;
                    size = list9.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.a(list9);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case 31:
                    iC = v0.b(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    iC = v0.c(i15, (List) unsafe.getObject(vVar2, j9));
                    iT2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(vVar2, j9);
                    Class cls11 = v0.f681a;
                    size = list10.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.f(list10);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(vVar2, j9);
                    Class cls12 = v0.f681a;
                    size = list11.size();
                    if (size == 0) {
                        iV8 = 0;
                    } else {
                        i11 = v0.g(list11);
                        iV9 = l.V(i15);
                        iV8 = (iV9 * size) + i11;
                    }
                    iT2 += iV8;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(vVar2, j9);
                    Class cls13 = v0.f681a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(vVar2, j9);
                    Class cls14 = v0.f681a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 37:
                    size2 = v0.e((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 38:
                    size2 = v0.i((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 39:
                    size2 = v0.d((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(vVar2, j9);
                    Class cls15 = v0.f681a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(vVar2, j9);
                    Class cls16 = v0.f681a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(vVar2, j9);
                    Class cls17 = v0.f681a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 43:
                    size2 = v0.h((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 44:
                    size2 = v0.a((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(vVar2, j9);
                    Class cls18 = v0.f681a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(vVar2, j9);
                    Class cls19 = v0.f681a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 47:
                    size2 = v0.f((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 48:
                    size2 = v0.g((List) unsafe.getObject(vVar2, j9));
                    if (size2 > 0) {
                        iV11 = l.V(i15);
                        iW = l.W(size2);
                        iX3 = iW + iV11;
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(vVar2, j9);
                    u0 u0VarI4 = l0Var.i(i13);
                    Class cls20 = v0.f681a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i26 = 0; i26 < size9; i26++) {
                            iA2 += ((a) list19.get(i26)).a(u0VarI4) + (l.V(i15) * 2);
                        }
                    }
                    iT2 += iA2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(vVar2, j9);
                    Object obj2 = l0Var.f649b[(i13 / 3) * 2];
                    l0Var.m.getClass();
                    g0 g0Var = (g0) object3;
                    f0 f0Var = (f0) obj2;
                    if (g0Var.isEmpty()) {
                        iV10 = 0;
                    } else {
                        iV10 = 0;
                        for (Map.Entry entry : g0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            f0Var.getClass();
                            int iV14 = l.V(i15);
                            int iA5 = f0.a(f0Var.f604a, key, value);
                            iV10 += l.W(iA5) + iA5 + iV14;
                        }
                    }
                    iT2 += iV10;
                    break;
                case 51:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV = l.V(i15);
                        iC = iV + 8;
                        iT2 += iC;
                    }
                    break;
                case 52:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV12 = l.V(i15);
                        iC = iV12 + 4;
                        iT2 += iC;
                    }
                    break;
                case 53:
                    if (l0Var.m(vVar2, i15, i13)) {
                        long jV = v(vVar2, j9);
                        size2 = l.V(i15);
                        iX3 = l.X(jV);
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 54:
                    if (l0Var.m(vVar2, i15, i13)) {
                        long jV2 = v(vVar2, j9);
                        size2 = l.V(i15);
                        iX3 = l.X(jV2);
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 55:
                    if (l0Var.m(vVar2, i15, i13)) {
                        int iU = u(vVar2, j9);
                        iV7 = l.V(i15);
                        iA = l.X(iU);
                        iC = iA + iV7;
                        iT2 += iC;
                    }
                    break;
                case 56:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV = l.V(i15);
                        iC = iV + 8;
                        iT2 += iC;
                    }
                    break;
                case 57:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV12 = l.V(i15);
                        iC = iV12 + 4;
                        iT2 += iC;
                    }
                    break;
                case 58:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iC = l.V(i15) + 1;
                        iT2 += iC;
                    }
                    break;
                case 59:
                    if (l0Var.m(vVar2, i15, i13)) {
                        Object object4 = unsafe.getObject(vVar2, j9);
                        iT2 = (object4 instanceof g ? l.T(i15, (g) object4) : l.U((String) object4) + l.V(i15)) + iT2;
                    }
                    break;
                case 60:
                    if (l0Var.m(vVar2, i15, i13)) {
                        Object object5 = unsafe.getObject(vVar2, j9);
                        u0 u0VarI5 = l0Var.i(i13);
                        Class cls21 = v0.f681a;
                        int iV15 = l.V(i15);
                        int iA6 = ((a) object5).a(u0VarI5);
                        iW2 = l.W(iA6) + iA6 + iV15;
                        iT2 += iW2;
                    }
                    break;
                case 61:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iC = l.T(i15, (g) unsafe.getObject(vVar2, j9));
                        iT2 += iC;
                    }
                    break;
                case 62:
                    if (l0Var.m(vVar2, i15, i13)) {
                        int iU2 = u(vVar2, j9);
                        iV7 = l.V(i15);
                        iA = l.W(iU2);
                        iC = iA + iV7;
                        iT2 += iC;
                    }
                    break;
                case 63:
                    if (l0Var.m(vVar2, i15, i13)) {
                        int iU3 = u(vVar2, j9);
                        iV7 = l.V(i15);
                        iA = l.X(iU3);
                        iC = iA + iV7;
                        iT2 += iC;
                    }
                    break;
                case 64:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV12 = l.V(i15);
                        iC = iV12 + 4;
                        iT2 += iC;
                    }
                    break;
                case 65:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iV = l.V(i15);
                        iC = iV + 8;
                        iT2 += iC;
                    }
                    break;
                case 66:
                    if (l0Var.m(vVar2, i15, i13)) {
                        int iU4 = u(vVar2, j9);
                        iV7 = l.V(i15);
                        iA = l.W((iU4 >> 31) ^ (iU4 << 1));
                        iC = iA + iV7;
                        iT2 += iC;
                    }
                    break;
                case 67:
                    if (l0Var.m(vVar2, i15, i13)) {
                        long jV3 = v(vVar2, j9);
                        size2 = l.V(i15);
                        iX3 = l.X((jV3 << 1) ^ (jV3 >> 63));
                        iW2 = iX3 + size2;
                        iT2 += iW2;
                    }
                    break;
                case 68:
                    if (l0Var.m(vVar2, i15, i13)) {
                        iC = ((a) unsafe.getObject(vVar2, j9)).a(l0Var.i(i13)) + (l.V(i15) * 2);
                        iT2 += iC;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    @Override
    public final int c(v vVar) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f648a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iH = H(i13);
            int i14 = iArr[i13];
            long j9 = 1048575 & iH;
            int i15 = 1237;
            int iHashCode = 37;
            switch (G(iH)) {
                case 0:
                    i10 = i12 * 53;
                    iB = x.b(Double.doubleToLongBits(h1.f615c.d(vVar, j9)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(h1.f615c.e(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = x.b(h1.f615c.g(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = x.b(h1.f615c.g(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = x.b(h1.f615c.g(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = h1.f615c.c(vVar, j9);
                    Charset charset = x.f684a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) h1.f615c.h(vVar, j9)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objH = h1.f615c.h(vVar, j9);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = h1.f615c.h(vVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = x.b(h1.f615c.g(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = h1.f615c.f(vVar, j9);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = x.b(h1.f615c.g(vVar, j9));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objH2 = h1.f615c.h(vVar, j9);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case TYPE_SINT64_VALUE:
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                case 23:
                case 24:
                case 25:
                case RuntimeVersion.MINOR:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iB = h1.f615c.h(vVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = h1.f615c.h(vVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 51:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(Double.doubleToLongBits(((Double) h1.f615c.h(vVar, j9)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case 52:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) h1.f615c.h(vVar, j9)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case 53:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(v(vVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 54:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(v(vVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 55:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 56:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(v(vVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 57:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 58:
                    if (m(vVar, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) h1.f615c.h(vVar, j9)).booleanValue();
                        Charset charset2 = x.f684a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = ((String) h1.f615c.h(vVar, j9)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = h1.f615c.h(vVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 61:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = h1.f615c.h(vVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 63:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(v(vVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = u(vVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x.b(v(vVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (m(vVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = h1.f615c.h(vVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        ((c1) this.l).getClass();
        return vVar.unknownFields.hashCode() + (i12 * 53);
    }

    @Override
    public final boolean d(v vVar, v vVar2) {
        int[] iArr = this.f648a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iH = H(i10);
                long j9 = iH & 1048575;
                switch (G(iH)) {
                    case 0:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var = h1.f615c;
                            if (Double.doubleToLongBits(g1Var.d(vVar, j9)) != Double.doubleToLongBits(g1Var.d(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var2 = h1.f615c;
                            if (Float.floatToIntBits(g1Var2.e(vVar, j9)) != Float.floatToIntBits(g1Var2.e(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var3 = h1.f615c;
                            if (g1Var3.g(vVar, j9) != g1Var3.g(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var4 = h1.f615c;
                            if (g1Var4.g(vVar, j9) != g1Var4.g(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var5 = h1.f615c;
                            if (g1Var5.f(vVar, j9) != g1Var5.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var6 = h1.f615c;
                            if (g1Var6.g(vVar, j9) != g1Var6.g(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var7 = h1.f615c;
                            if (g1Var7.f(vVar, j9) != g1Var7.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var8 = h1.f615c;
                            if (g1Var8.c(vVar, j9) != g1Var8.c(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var9 = h1.f615c;
                            if (!v0.l(g1Var9.h(vVar, j9), g1Var9.h(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var10 = h1.f615c;
                            if (!v0.l(g1Var10.h(vVar, j9), g1Var10.h(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var11 = h1.f615c;
                            if (!v0.l(g1Var11.h(vVar, j9), g1Var11.h(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var12 = h1.f615c;
                            if (g1Var12.f(vVar, j9) != g1Var12.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var13 = h1.f615c;
                            if (g1Var13.f(vVar, j9) != g1Var13.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var14 = h1.f615c;
                            if (g1Var14.f(vVar, j9) != g1Var14.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var15 = h1.f615c;
                            if (g1Var15.g(vVar, j9) != g1Var15.g(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var16 = h1.f615c;
                            if (g1Var16.f(vVar, j9) != g1Var16.f(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var17 = h1.f615c;
                            if (g1Var17.g(vVar, j9) != g1Var17.g(vVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!f(vVar, vVar2, i10)) {
                            zL = false;
                        } else {
                            g1 g1Var18 = h1.f615c;
                            if (!v0.l(g1Var18.h(vVar, j9), g1Var18.h(vVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case TYPE_SINT64_VALUE:
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    case 23:
                    case 24:
                    case 25:
                    case RuntimeVersion.MINOR:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        g1 g1Var19 = h1.f615c;
                        zL = v0.l(g1Var19.h(vVar, j9), g1Var19.h(vVar2, j9));
                        break;
                    case 50:
                        g1 g1Var20 = h1.f615c;
                        zL = v0.l(g1Var20.h(vVar, j9), g1Var20.h(vVar2, j9));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i10 + 2] & 1048575;
                        g1 g1Var21 = h1.f615c;
                        if (g1Var21.f(vVar, j10) != g1Var21.f(vVar2, j10) || !v0.l(g1Var21.h(vVar, j9), g1Var21.h(vVar2, j9))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                c1 c1Var = (c1) this.l;
                c1Var.getClass();
                b1 b1Var = vVar.unknownFields;
                c1Var.getClass();
                if (b1Var.equals(vVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void e(java.lang.Object r19, androidx.datastore.preferences.protobuf.k r20, androidx.datastore.preferences.protobuf.n r21) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l0.e(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    public final boolean f(v vVar, v vVar2, int i10) {
        return j(vVar, i10) == j(vVar2, i10);
    }

    public final void g(int i10, Object obj, Object obj2) {
        int i11 = this.f648a[i10];
        if (h1.f615c.h(obj, H(i10) & 1048575) == null) {
            return;
        }
        h(i10);
    }

    public final void h(int i10) {
        if (this.f649b[a1.b.e(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final u0 i(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f649b;
        u0 u0Var = (u0) objArr[i11];
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0VarA = r0.f672c.a((Class) objArr[i11 + 1]);
        objArr[i11] = u0VarA;
        return u0VarA;
    }

    @Override
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f655h) {
            int i15 = this.f654g[i14];
            int[] iArr = this.f648a;
            int i16 = iArr[i15];
            int iH = H(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f647o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iH) == 0 || k(obj, i15, i10, i11, i19)) {
                int iG = G(iH);
                if (iG == 9 || iG == 17) {
                    if (k(obj, i15, i10, i11, i19)) {
                        if (!i(i15).isInitialized(h1.f615c.h(obj, iH & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iG != 27) {
                        if (iG == 60 || iG == 68) {
                            if (m(obj, i16, i15)) {
                                if (!i(i15).isInitialized(h1.f615c.h(obj, iH & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        } else if (iG != 49) {
                            if (iG != 50) {
                                continue;
                            } else {
                                Object objH = h1.f615c.h(obj, iH & 1048575);
                                this.m.getClass();
                                g0 g0Var = (g0) objH;
                                if (g0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((f0) this.f649b[(i15 / 3) * 2]).f604a.f601b.A != q1.I) {
                                        continue;
                                    } else {
                                        u0 u0VarA = null;
                                        for (Object obj2 : g0Var.values()) {
                                            if (u0VarA == null) {
                                                u0VarA = r0.f672c.a(obj2.getClass());
                                            }
                                            if (!u0VarA.isInitialized(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        }
                    }
                    List list = (List) h1.f615c.h(obj, iH & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        u0 u0VarI = i(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (u0VarI.isInitialized(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j(Object obj, int i10) {
        int i11 = this.f648a[i10 + 2];
        long j9 = i11 & 1048575;
        if (j9 == 1048575) {
            int iH = H(i10);
            long j10 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (Double.doubleToRawLongBits(h1.f615c.d(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(h1.f615c.e(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (h1.f615c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (h1.f615c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (h1.f615c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return h1.f615c.c(obj, j10);
                case 8:
                    Object objH = h1.f615c.h(obj, j10);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof g) {
                        return !g.C.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (h1.f615c.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.C.equals(h1.f615c.h(obj, j10));
                case 11:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (h1.f615c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (h1.f615c.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (h1.f615c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (h1.f615c.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & h1.f615c.f(obj, j9)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean k(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return j(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean m(Object obj, int i10, int i11) {
        return h1.f615c.f(obj, (long) (this.f648a[i11 + 2] & 1048575)) == i10;
    }

    @Override
    public final void makeImmutable(Object obj) {
        if (l(obj)) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                vVar.k(Integer.MAX_VALUE);
                vVar.memoizedHashCode = 0;
                vVar.h();
            }
            int[] iArr = this.f648a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iH = H(i10);
                long j9 = 1048575 & iH;
                int iG = G(iH);
                if (iG != 9) {
                    if (iG != 60 && iG != 68) {
                        switch (iG) {
                            case 17:
                                if (j(obj, i10)) {
                                    i(i10).makeImmutable(f647o.getObject(obj, j9));
                                }
                                break;
                            case TYPE_SINT64_VALUE:
                            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            case 23:
                            case 24:
                            case 25:
                            case RuntimeVersion.MINOR:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f658k.getClass();
                                b bVar = (b) ((w) h1.f615c.h(obj, j9));
                                if (bVar.A) {
                                    bVar.A = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f647o;
                                Object object = unsafe.getObject(obj, j9);
                                if (object != null) {
                                    this.m.getClass();
                                    ((g0) object).A = false;
                                    unsafe.putObject(obj, j9, object);
                                }
                                break;
                        }
                    } else if (m(obj, iArr[i10], i10)) {
                        i(i10).makeImmutable(f647o.getObject(obj, j9));
                    }
                } else if (j(obj, i10)) {
                    i(i10).makeImmutable(f647o.getObject(obj, j9));
                }
            }
            ((c1) this.l).getClass();
            b1 b1Var = ((v) obj).unknownFields;
            if (b1Var.f593e) {
                b1Var.f593e = false;
            }
        }
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        if (!l(obj)) {
            throw new IllegalArgumentException(g4.c.h(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f648a;
            if (i10 >= iArr.length) {
                v0.k(this.l, obj, obj2);
                return;
            }
            int iH = H(i10);
            long j9 = 1048575 & iH;
            int i11 = iArr[i10];
            switch (G(iH)) {
                case 0:
                    if (!j(obj2, i10)) {
                        obj3 = obj;
                    } else {
                        g1 g1Var = h1.f615c;
                        obj3 = obj;
                        g1Var.l(obj3, j9, g1Var.d(obj2, j9));
                        C(obj3, i10);
                    }
                    break;
                case 1:
                    if (j(obj2, i10)) {
                        g1 g1Var2 = h1.f615c;
                        g1Var2.m(obj, j9, g1Var2.e(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (j(obj2, i10)) {
                        h1.n(obj, j9, h1.f615c.g(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (j(obj2, i10)) {
                        h1.n(obj, j9, h1.f615c.g(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (j(obj2, i10)) {
                        h1.n(obj, j9, h1.f615c.g(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (j(obj2, i10)) {
                        g1 g1Var3 = h1.f615c;
                        g1Var3.j(obj, j9, g1Var3.c(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (j(obj2, i10)) {
                        h1.o(obj, j9, h1.f615c.h(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    o(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 10:
                    if (j(obj2, i10)) {
                        h1.o(obj, j9, h1.f615c.h(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (j(obj2, i10)) {
                        h1.n(obj, j9, h1.f615c.g(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (j(obj2, i10)) {
                        h1.m(obj, j9, h1.f615c.f(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (j(obj2, i10)) {
                        h1.n(obj, j9, h1.f615c.g(obj2, j9));
                        C(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    o(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case TYPE_SINT64_VALUE:
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                case 23:
                case 24:
                case 25:
                case RuntimeVersion.MINOR:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f658k.getClass();
                    g1 g1Var4 = h1.f615c;
                    w wVarC = (w) g1Var4.h(obj, j9);
                    w wVar = (w) g1Var4.h(obj2, j9);
                    s0 s0Var = (s0) wVarC;
                    int i12 = s0Var.C;
                    int i13 = ((s0) wVar).C;
                    if (i12 > 0 && i13 > 0) {
                        if (!((b) wVarC).A) {
                            wVarC = s0Var.c(i13 + i12);
                        }
                        ((b) wVarC).addAll(wVar);
                    }
                    if (i12 > 0) {
                        wVar = wVarC;
                    }
                    h1.o(obj, j9, wVar);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = v0.f681a;
                    g1 g1Var5 = h1.f615c;
                    Object objH = g1Var5.h(obj, j9);
                    Object objH2 = g1Var5.h(obj2, j9);
                    this.m.getClass();
                    h1.o(obj, j9, h0.a(objH, objH2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m(obj2, i11, i10)) {
                        h1.o(obj, j9, h1.f615c.h(obj2, j9));
                        D(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    p(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m(obj2, i11, i10)) {
                        h1.o(obj, j9, h1.f615c.h(obj2, j9));
                        D(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    p(obj, obj2, i10);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i10 += 3;
            obj = obj3;
        }
    }

    public final void n(Object obj, int i10, Object obj2, n nVar, k kVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jH = H(i10) & 1048575;
        Object objH = h1.f615c.h(obj, jH);
        h0 h0Var = this.m;
        if (objH == null) {
            h0Var.getClass();
            objH = g0.B.c();
            h1.o(obj, jH, objH);
        } else {
            h0Var.getClass();
            if (!((g0) objH).A) {
                g0 g0VarC = g0.B.c();
                h0.a(g0VarC, objH);
                h1.o(obj, jH, g0VarC);
                objH = g0VarC;
            }
        }
        h0Var.getClass();
        g0 g0Var = (g0) objH;
        e0 e0Var = ((f0) obj2).f604a;
        kVar.w(2);
        j jVar = kVar.f633a;
        int iN = jVar.n(jVar.G());
        Object obj3 = e0Var.f602c;
        Object objI = RuntimeVersion.SUFFIX;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = kVar.a();
                if (iA == Integer.MAX_VALUE || jVar.i()) {
                    break;
                }
                if (iA == 1) {
                    objI = kVar.i(e0Var.f600a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!kVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!kVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = kVar.i(e0Var.f601b, obj3.getClass(), nVar);
                }
            } catch (Throwable th2) {
                jVar.l(iN);
                throw th2;
            }
        }
        g0Var.put(objI, objI2);
        jVar.l(iN);
    }

    @Override
    public final v newInstance() {
        this.f657j.getClass();
        return ((v) this.f652e).i();
    }

    public final void o(Object obj, Object obj2, int i10) {
        if (j(obj2, i10)) {
            long jH = H(i10) & 1048575;
            Unsafe unsafe = f647o;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f648a[i10] + " is present but null: " + obj2);
            }
            u0 u0VarI = i(i10);
            if (!j(obj, i10)) {
                if (l(object)) {
                    v vVarNewInstance = u0VarI.newInstance();
                    u0VarI.mergeFrom(vVarNewInstance, object);
                    unsafe.putObject(obj, jH, vVarNewInstance);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                C(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!l(object2)) {
                v vVarNewInstance2 = u0VarI.newInstance();
                u0VarI.mergeFrom(vVarNewInstance2, object2);
                unsafe.putObject(obj, jH, vVarNewInstance2);
                object2 = vVarNewInstance2;
            }
            u0VarI.mergeFrom(object2, object);
        }
    }

    public final void p(Object obj, Object obj2, int i10) {
        int[] iArr = this.f648a;
        int i11 = iArr[i10];
        if (m(obj2, i11, i10)) {
            long jH = H(i10) & 1048575;
            Unsafe unsafe = f647o;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            u0 u0VarI = i(i10);
            if (!m(obj, i11, i10)) {
                if (l(object)) {
                    v vVarNewInstance = u0VarI.newInstance();
                    u0VarI.mergeFrom(vVarNewInstance, object);
                    unsafe.putObject(obj, jH, vVarNewInstance);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                D(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!l(object2)) {
                v vVarNewInstance2 = u0VarI.newInstance();
                u0VarI.mergeFrom(vVarNewInstance2, object2);
                unsafe.putObject(obj, jH, vVarNewInstance2);
                object2 = vVarNewInstance2;
            }
            u0VarI.mergeFrom(object2, object);
        }
    }

    public final Object q(Object obj, int i10) {
        u0 u0VarI = i(i10);
        long jH = H(i10) & 1048575;
        if (!j(obj, i10)) {
            return u0VarI.newInstance();
        }
        Object object = f647o.getObject(obj, jH);
        if (l(object)) {
            return object;
        }
        v vVarNewInstance = u0VarI.newInstance();
        if (object != null) {
            u0VarI.mergeFrom(vVarNewInstance, object);
        }
        return vVarNewInstance;
    }

    public final Object r(Object obj, int i10, int i11) {
        u0 u0VarI = i(i11);
        if (!m(obj, i10, i11)) {
            return u0VarI.newInstance();
        }
        Object object = f647o.getObject(obj, H(i11) & 1048575);
        if (l(object)) {
            return object;
        }
        v vVarNewInstance = u0VarI.newInstance();
        if (object != null) {
            u0VarI.mergeFrom(vVarNewInstance, object);
        }
        return vVarNewInstance;
    }

    public final int w(int i10) {
        if (i10 >= this.f650c && i10 <= this.f651d) {
            int[] iArr = this.f648a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
            while (i11 <= length) {
                int i12 = (length + i11) >>> 1;
                int i13 = i12 * 3;
                int i14 = iArr[i13];
                if (i10 == i14) {
                    return i13;
                }
                if (i10 < i14) {
                    length = i12 - 1;
                } else {
                    i11 = i12 + 1;
                }
            }
        }
        return -1;
    }

    public final void x(Object obj, long j9, k kVar, u0 u0Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        this.f658k.getClass();
        w wVarA = a0.a(obj, j9);
        j jVar = kVar.f633a;
        int i10 = kVar.f634b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            v vVarNewInstance = u0Var.newInstance();
            kVar.b(vVarNewInstance, u0Var, nVar);
            u0Var.makeImmutable(vVarNewInstance);
            ((s0) wVarA).add(vVarNewInstance);
            if (jVar.i() || kVar.f636d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i10);
        kVar.f636d = iF;
    }

    public final void y(Object obj, int i10, k kVar, u0 u0Var, n nVar) throws InvalidProtocolBufferException {
        int iF;
        this.f658k.getClass();
        w wVarA = a0.a(obj, i10 & 1048575);
        j jVar = kVar.f633a;
        int i11 = kVar.f634b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            v vVarNewInstance = u0Var.newInstance();
            kVar.c(vVarNewInstance, u0Var, nVar);
            u0Var.makeImmutable(vVarNewInstance);
            ((s0) wVarA).add(vVarNewInstance);
            if (jVar.i() || kVar.f636d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i11);
        kVar.f636d = iF;
    }

    public final void z(int i10, k kVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i10) != 0) {
            kVar.w(2);
            h1.o(obj, i10 & 1048575, kVar.f633a.E());
        } else if (!this.f653f) {
            h1.o(obj, i10 & 1048575, kVar.e());
        } else {
            kVar.w(2);
            h1.o(obj, i10 & 1048575, kVar.f633a.D());
        }
    }
}
