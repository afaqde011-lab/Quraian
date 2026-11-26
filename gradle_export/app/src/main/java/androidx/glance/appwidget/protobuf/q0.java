package androidx.glance.appwidget.protobuf;

import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class q0 implements z0 {

    public static final int[] f937n = new int[0];

    public static final Unsafe f938o = i1.j();

    public final int[] f939a;

    public final Object[] f940b;

    public final int f941c;

    public final int f942d;

    public final a f943e;

    public final boolean f944f;

    public final int[] f945g;

    public final int f946h;

    public final int f947i;

    public final s0 f948j;

    public final g0 f949k;
    public final b1 l;
    public final m0 m;

    public q0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, s0 s0Var, g0 g0Var, b1 b1Var, s sVar, m0 m0Var) {
        this.f939a = iArr;
        this.f940b = objArr;
        this.f941c = i10;
        this.f942d = i11;
        this.f944f = aVar instanceof z;
        this.f945g = iArr2;
        this.f946h = i12;
        this.f947i = i13;
        this.f948j = s0Var;
        this.f949k = g0Var;
        this.l = b1Var;
        this.f943e = aVar;
        this.m = m0Var;
    }

    public static Field H(Class cls, String str) {
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

    public static int N(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void h(Object obj) {
        if (!o(obj)) {
            throw new IllegalArgumentException(g4.c.h(obj, "Mutating immutable message: "));
        }
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).h();
        }
        return true;
    }

    public static q0 v(y0 y0Var, s0 s0Var, g0 g0Var, b1 b1Var, s sVar, m0 m0Var) {
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
        Field fieldH;
        int i31;
        char cCharAt9;
        int i32;
        Field fieldH2;
        Field fieldH3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        String str = y0Var.f965b;
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
            iArr = f937n;
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
        Unsafe unsafe = f938o;
        Object[] objArr2 = y0Var.f966c;
        Class<?> cls = y0Var.f964a.getClass();
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
                } else if (i88 == 12 && (e4.f.a(y0Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i90 = i89 * 2;
                Object obj = objArr[i90];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H(cls, (String) obj);
                    objArr[i90] = fieldH2;
                }
                int i91 = i68;
                i28 = i15;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH2);
                int i92 = i90 + 1;
                Object obj2 = objArr[i92];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H(cls, (String) obj2);
                    objArr[i92] = fieldH3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldH3);
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
                Field fieldH4 = H(cls, (String) objArr[i15]);
                if (i83 == 9 || i83 == 17) {
                    i27 = i27;
                    objArr3[a1.b.e(i71, 3, 2, 1)] = fieldH4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = i27;
                        i32 = i15 + 2;
                        objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i93];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = i27;
                        if (y0Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i32 = i15 + 2;
                            objArr3[a1.b.e(i71, 3, 2, 1)] = objArr[i93];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
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
                                fieldH = (Field) obj3;
                            } else {
                                fieldH = H(cls, (String) obj3);
                                objArr[i96] = fieldH;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
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
        return new q0(iArr3, objArr3, i11, i14, y0Var.f964a, iArr, i16, i68, s0Var, g0Var, b1Var, sVar, m0Var);
    }

    public static long w(int i10) {
        return i10 & 1048575;
    }

    public static int x(Object obj, long j9) {
        return ((Integer) i1.f894c.i(obj, j9)).intValue();
    }

    public static long y(Object obj, long j9) {
        return ((Long) i1.f894c.i(obj, j9)).longValue();
    }

    public final int A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, androidx.glance.appwidget.protobuf.d r35) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.q0.A(java.lang.Object, byte[], int, int, int, androidx.glance.appwidget.protobuf.d):int");
    }

    public final int B(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j9, int i17, d dVar) throws InvalidProtocolBufferException {
        int i18;
        Unsafe unsafe = f938o;
        long j10 = this.f939a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Double.valueOf(Double.longBitsToDouble(ab.a0.N(bArr, i10))));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Float.valueOf(Float.intBitsToFloat(ab.a0.M(bArr, i10))));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i20;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iT = ab.a0.T(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Long.valueOf(dVar.f882b));
                unsafe.putInt(obj, j10, i13);
                return iT;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iR = ab.a0.R(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Integer.valueOf(dVar.f881a));
                unsafe.putInt(obj, j10, i13);
                return iR;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Long.valueOf(ab.a0.N(bArr, i10)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i21;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Integer.valueOf(ab.a0.M(bArr, i10)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i22;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iT2 = ab.a0.T(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Boolean.valueOf(dVar.f882b != 0));
                unsafe.putInt(obj, j10, i13);
                return iT2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iR2 = ab.a0.R(bArr, i10, dVar);
                int i23 = dVar.f881a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j9, RuntimeVersion.SUFFIX);
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (l1.f922a.S(bArr, iR2, iR2 + i23) != 0) {
                            throw InvalidProtocolBufferException.b();
                        }
                    }
                    unsafe.putObject(obj, j9, new String(bArr, iR2, i23, e0.f885a));
                    iR2 += i23;
                }
                unsafe.putInt(obj, j10, i13);
                return iR2;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objU = u(obj, i13, i17);
                    int iP0 = ab.a0.p0(objU, l(i17), bArr, i18, i11, dVar);
                    M(obj, i13, i17, objU);
                    return iP0;
                }
                return i18;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int iL = ab.a0.L(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, dVar.f883c);
                    unsafe.putInt(obj, j10, i13);
                    return iL;
                }
                return i18;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int iR3 = ab.a0.R(bArr, i18, dVar);
                    int i24 = dVar.f881a;
                    j(i17);
                    unsafe.putObject(obj, j9, Integer.valueOf(i24));
                    unsafe.putInt(obj, j10, i13);
                    return iR3;
                }
                return i18;
            case 66:
                i18 = i10;
                if (i14 == 0) {
                    int iR4 = ab.a0.R(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, Integer.valueOf(androidx.datastore.preferences.protobuf.j.d(dVar.f881a)));
                    unsafe.putInt(obj, j10, i13);
                    return iR4;
                }
                return i18;
            case 67:
                i18 = i10;
                if (i14 == 0) {
                    int iT3 = ab.a0.T(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, Long.valueOf(androidx.datastore.preferences.protobuf.j.f(dVar.f882b)));
                    unsafe.putInt(obj, j10, i13);
                    return iT3;
                }
                return i18;
            case 68:
                if (i14 == 3) {
                    Object objU2 = u(obj, i13, i17);
                    int iO0 = ab.a0.o0(objU2, l(i17), bArr, i10, i11, (i12 & (-8)) | 4, dVar);
                    M(obj, i13, i17, objU2);
                    return iO0;
                }
            default:
                return i10;
        }
    }

    public final int C(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j9, int i15, long j10, d dVar) throws InvalidProtocolBufferException {
        int iR;
        int i16;
        int i17;
        int iS;
        Unsafe unsafe = f938o;
        d0 d0VarMutableCopyWithCapacity = (d0) unsafe.getObject(obj, j10);
        if (!((b) d0VarMutableCopyWithCapacity).A) {
            int size = d0VarMutableCopyWithCapacity.size();
            d0VarMutableCopyWithCapacity = d0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, d0VarMutableCopyWithCapacity);
        }
        d0 d0Var = d0VarMutableCopyWithCapacity;
        switch (i15) {
            case TYPE_SINT64_VALUE:
            case 35:
                if (i13 == 2) {
                    p pVar = (p) d0Var;
                    int iR2 = ab.a0.R(bArr, i10, dVar);
                    int i18 = dVar.f881a + iR2;
                    while (iR2 < i18) {
                        pVar.addDouble(Double.longBitsToDouble(ab.a0.N(bArr, iR2)));
                        iR2 += 8;
                    }
                    if (iR2 == i18) {
                        return iR2;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 != 1) {
                    return i10;
                }
                p pVar2 = (p) d0Var;
                pVar2.addDouble(Double.longBitsToDouble(ab.a0.N(bArr, i10)));
                int i19 = i10 + 8;
                while (i19 < i11) {
                    int iR3 = ab.a0.R(bArr, i19, dVar);
                    if (i12 != dVar.f881a) {
                        return i19;
                    }
                    pVar2.addDouble(Double.longBitsToDouble(ab.a0.N(bArr, iR3)));
                    i19 = iR3 + 8;
                }
                return i19;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
            case 36:
                if (i13 == 2) {
                    v vVar = (v) d0Var;
                    int iR4 = ab.a0.R(bArr, i10, dVar);
                    int i20 = dVar.f881a + iR4;
                    while (iR4 < i20) {
                        vVar.addFloat(Float.intBitsToFloat(ab.a0.M(bArr, iR4)));
                        iR4 += 4;
                    }
                    if (iR4 == i20) {
                        return iR4;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 != 5) {
                    return i10;
                }
                v vVar2 = (v) d0Var;
                vVar2.addFloat(Float.intBitsToFloat(ab.a0.M(bArr, i10)));
                int i21 = i10 + 4;
                while (i21 < i11) {
                    int iR5 = ab.a0.R(bArr, i21, dVar);
                    if (i12 != dVar.f881a) {
                        return i21;
                    }
                    vVar2.addFloat(Float.intBitsToFloat(ab.a0.M(bArr, iR5)));
                    i21 = iR5 + 4;
                }
                return i21;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case 37:
            case 38:
                if (i13 == 2) {
                    i0 i0Var = (i0) d0Var;
                    int iR6 = ab.a0.R(bArr, i10, dVar);
                    int i22 = dVar.f881a + iR6;
                    while (iR6 < i22) {
                        iR6 = ab.a0.T(bArr, iR6, dVar);
                        i0Var.addLong(dVar.f882b);
                    }
                    if (iR6 == i22) {
                        return iR6;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 != 0) {
                    return i10;
                }
                i0 i0Var2 = (i0) d0Var;
                int iT = ab.a0.T(bArr, i10, dVar);
                i0Var2.addLong(dVar.f882b);
                while (iT < i11) {
                    int iR7 = ab.a0.R(bArr, iT, dVar);
                    if (i12 != dVar.f881a) {
                        return iT;
                    }
                    iT = ab.a0.T(bArr, iR7, dVar);
                    i0Var2.addLong(dVar.f882b);
                }
                return iT;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
            case 29:
            case 39:
            case 43:
                iR = i10;
                if (i13 == 2) {
                    a0 a0Var = (a0) d0Var;
                    int iR8 = ab.a0.R(bArr, i10, dVar);
                    int i23 = dVar.f881a + iR8;
                    while (iR8 < i23) {
                        iR8 = ab.a0.R(bArr, iR8, dVar);
                        a0Var.addInt(dVar.f881a);
                    }
                    if (iR8 == i23) {
                        return iR8;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    return ab.a0.S(i12, bArr, iR, i11, d0Var, dVar);
                }
                break;
            case 23:
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
            case 40:
            case 46:
                iR = i10;
                if (i13 == 2) {
                    i0 i0Var3 = (i0) d0Var;
                    int iR9 = ab.a0.R(bArr, i10, dVar);
                    int i24 = dVar.f881a + iR9;
                    while (iR9 < i24) {
                        i0Var3.addLong(ab.a0.N(bArr, iR9));
                        iR9 += 8;
                    }
                    if (iR9 == i24) {
                        return iR9;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 1) {
                    i0 i0Var4 = (i0) d0Var;
                    i0Var4.addLong(ab.a0.N(bArr, i10));
                    while (true) {
                        i16 = iR + 8;
                        if (i16 < i11) {
                            iR = ab.a0.R(bArr, i16, dVar);
                            if (i12 == dVar.f881a) {
                                i0Var4.addLong(ab.a0.N(bArr, iR));
                            }
                        }
                    }
                    return i16;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                iR = i10;
                if (i13 == 2) {
                    a0 a0Var2 = (a0) d0Var;
                    int iR10 = ab.a0.R(bArr, i10, dVar);
                    int i25 = dVar.f881a + iR10;
                    while (iR10 < i25) {
                        a0Var2.addInt(ab.a0.M(bArr, iR10));
                        iR10 += 4;
                    }
                    if (iR10 == i25) {
                        return iR10;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 5) {
                    a0 a0Var3 = (a0) d0Var;
                    a0Var3.addInt(ab.a0.M(bArr, i10));
                    while (true) {
                        i17 = iR + 4;
                        if (i17 < i11) {
                            iR = ab.a0.R(bArr, i17, dVar);
                            if (i12 == dVar.f881a) {
                                a0Var3.addInt(ab.a0.M(bArr, iR));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 25:
            case 42:
                iR = i10;
                if (i13 == 2) {
                    e eVar = (e) d0Var;
                    int iR11 = ab.a0.R(bArr, i10, dVar);
                    int i26 = dVar.f881a + iR11;
                    while (iR11 < i26) {
                        iR11 = ab.a0.T(bArr, iR11, dVar);
                        eVar.addBoolean(dVar.f882b != 0);
                    }
                    if (iR11 == i26) {
                        return iR11;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    e eVar2 = (e) d0Var;
                    int iT2 = ab.a0.T(bArr, i10, dVar);
                    eVar2.addBoolean(dVar.f882b != 0);
                    while (iT2 < i11) {
                        int iR12 = ab.a0.R(bArr, iT2, dVar);
                        if (i12 != dVar.f881a) {
                            return iT2;
                        }
                        iT2 = ab.a0.T(bArr, iR12, dVar);
                        eVar2.addBoolean(dVar.f882b != 0);
                    }
                    return iT2;
                }
                break;
            case RuntimeVersion.MINOR:
                iR = i10;
                if (i13 == 2) {
                    if ((j9 & 536870912) == 0) {
                        int iR13 = ab.a0.R(bArr, i10, dVar);
                        int i27 = dVar.f881a;
                        if (i27 < 0) {
                            throw InvalidProtocolBufferException.e();
                        }
                        if (i27 == 0) {
                            d0Var.add(RuntimeVersion.SUFFIX);
                        } else {
                            d0Var.add(new String(bArr, iR13, i27, e0.f885a));
                            iR13 += i27;
                        }
                        while (iR13 < i11) {
                            int iR14 = ab.a0.R(bArr, iR13, dVar);
                            if (i12 != dVar.f881a) {
                                return iR13;
                            }
                            iR13 = ab.a0.R(bArr, iR14, dVar);
                            int i28 = dVar.f881a;
                            if (i28 < 0) {
                                throw InvalidProtocolBufferException.e();
                            }
                            if (i28 == 0) {
                                d0Var.add(RuntimeVersion.SUFFIX);
                            } else {
                                d0Var.add(new String(bArr, iR13, i28, e0.f885a));
                                iR13 += i28;
                            }
                        }
                        return iR13;
                    }
                    int iR15 = ab.a0.R(bArr, i10, dVar);
                    int i29 = dVar.f881a;
                    if (i29 < 0) {
                        throw InvalidProtocolBufferException.e();
                    }
                    if (i29 == 0) {
                        d0Var.add(RuntimeVersion.SUFFIX);
                    } else {
                        int i30 = iR15 + i29;
                        if (l1.f922a.S(bArr, iR15, i30) != 0) {
                            throw InvalidProtocolBufferException.b();
                        }
                        d0Var.add(new String(bArr, iR15, i29, e0.f885a));
                        iR15 = i30;
                    }
                    while (iR15 < i11) {
                        int iR16 = ab.a0.R(bArr, iR15, dVar);
                        if (i12 != dVar.f881a) {
                            return iR15;
                        }
                        iR15 = ab.a0.R(bArr, iR16, dVar);
                        int i31 = dVar.f881a;
                        if (i31 < 0) {
                            throw InvalidProtocolBufferException.e();
                        }
                        if (i31 == 0) {
                            d0Var.add(RuntimeVersion.SUFFIX);
                        } else {
                            int i32 = iR15 + i31;
                            if (l1.f922a.S(bArr, iR15, i32) != 0) {
                                throw InvalidProtocolBufferException.b();
                            }
                            d0Var.add(new String(bArr, iR15, i31, e0.f885a));
                            iR15 = i32;
                        }
                    }
                    return iR15;
                }
                break;
            case 27:
                return i13 == 2 ? ab.a0.O(l(i14), i12, bArr, i10, i11, d0Var, dVar) : i10;
            case 28:
                if (i13 != 2) {
                    return i10;
                }
                int iR17 = ab.a0.R(bArr, i10, dVar);
                int i33 = dVar.f881a;
                if (i33 < 0) {
                    throw InvalidProtocolBufferException.e();
                }
                if (i33 > bArr.length - iR17) {
                    throw InvalidProtocolBufferException.g();
                }
                if (i33 == 0) {
                    d0Var.add(i.B);
                } else {
                    d0Var.add(i.c(iR17, i33, bArr));
                    iR17 += i33;
                }
                while (iR17 < i11) {
                    int iR18 = ab.a0.R(bArr, iR17, dVar);
                    if (i12 != dVar.f881a) {
                        return iR17;
                    }
                    iR17 = ab.a0.R(bArr, iR18, dVar);
                    int i34 = dVar.f881a;
                    if (i34 < 0) {
                        throw InvalidProtocolBufferException.e();
                    }
                    if (i34 > bArr.length - iR17) {
                        throw InvalidProtocolBufferException.g();
                    }
                    if (i34 == 0) {
                        d0Var.add(i.B);
                    } else {
                        d0Var.add(i.c(iR17, i34, bArr));
                        iR17 += i34;
                    }
                }
                return iR17;
            case 30:
            case 44:
                if (i13 == 2) {
                    a0 a0Var4 = (a0) d0Var;
                    iS = ab.a0.R(bArr, i10, dVar);
                    int i35 = dVar.f881a + iS;
                    while (iS < i35) {
                        iS = ab.a0.R(bArr, iS, dVar);
                        a0Var4.addInt(dVar.f881a);
                    }
                    if (iS != i35) {
                        throw InvalidProtocolBufferException.g();
                    }
                } else {
                    if (i13 != 0) {
                        return i10;
                    }
                    iS = ab.a0.S(i12, bArr, i10, i11, d0Var, dVar);
                }
                j(i14);
                Class cls = a1.f870a;
                return iS;
            case 33:
            case 47:
                if (i13 == 2) {
                    a0 a0Var5 = (a0) d0Var;
                    int iR19 = ab.a0.R(bArr, i10, dVar);
                    int i36 = dVar.f881a + iR19;
                    while (iR19 < i36) {
                        iR19 = ab.a0.R(bArr, iR19, dVar);
                        a0Var5.addInt(androidx.datastore.preferences.protobuf.j.d(dVar.f881a));
                    }
                    if (iR19 == i36) {
                        return iR19;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 != 0) {
                    return i10;
                }
                a0 a0Var6 = (a0) d0Var;
                int iR20 = ab.a0.R(bArr, i10, dVar);
                a0Var6.addInt(androidx.datastore.preferences.protobuf.j.d(dVar.f881a));
                while (iR20 < i11) {
                    int iR21 = ab.a0.R(bArr, iR20, dVar);
                    if (i12 != dVar.f881a) {
                        return iR20;
                    }
                    iR20 = ab.a0.R(bArr, iR21, dVar);
                    a0Var6.addInt(androidx.datastore.preferences.protobuf.j.d(dVar.f881a));
                }
                return iR20;
            case 34:
            case 48:
                if (i13 == 2) {
                    i0 i0Var5 = (i0) d0Var;
                    int iR22 = ab.a0.R(bArr, i10, dVar);
                    int i37 = dVar.f881a + iR22;
                    while (iR22 < i37) {
                        iR22 = ab.a0.T(bArr, iR22, dVar);
                        i0Var5.addLong(androidx.datastore.preferences.protobuf.j.f(dVar.f882b));
                    }
                    if (iR22 == i37) {
                        return iR22;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 != 0) {
                    return i10;
                }
                i0 i0Var6 = (i0) d0Var;
                int iT3 = ab.a0.T(bArr, i10, dVar);
                i0Var6.addLong(androidx.datastore.preferences.protobuf.j.f(dVar.f882b));
                while (iT3 < i11) {
                    int iR23 = ab.a0.R(bArr, iT3, dVar);
                    if (i12 != dVar.f881a) {
                        return iT3;
                    }
                    iT3 = ab.a0.T(bArr, iR23, dVar);
                    i0Var6.addLong(androidx.datastore.preferences.protobuf.j.f(dVar.f882b));
                }
                return iT3;
            case 49:
                if (i13 == 3) {
                    z0 z0VarL = l(i14);
                    int i38 = (i12 & (-8)) | 4;
                    z zVarNewInstance = z0VarL.newInstance();
                    int iO0 = ab.a0.o0(zVarNewInstance, z0VarL, bArr, i10, i11, i38, dVar);
                    z0 z0Var = z0VarL;
                    int i39 = i38;
                    z0Var.makeImmutable(zVarNewInstance);
                    dVar.f883c = zVarNewInstance;
                    d0Var.add(zVarNewInstance);
                    while (iO0 < i11) {
                        int iR24 = ab.a0.R(bArr, iO0, dVar);
                        if (i12 != dVar.f881a) {
                            return iO0;
                        }
                        z zVarNewInstance2 = z0Var.newInstance();
                        z0 z0Var2 = z0Var;
                        int i40 = i39;
                        iO0 = ab.a0.o0(zVarNewInstance2, z0Var2, bArr, iR24, i11, i40, dVar);
                        z0Var2.makeImmutable(zVarNewInstance2);
                        dVar.f883c = zVarNewInstance2;
                        d0Var.add(zVarNewInstance2);
                        z0Var = z0Var2;
                        i39 = i40;
                    }
                    return iO0;
                }
            default:
                return i10;
        }
        return iR;
    }

    public final void D(Object obj, long j9, l lVar, z0 z0Var, r rVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        this.f949k.getClass();
        d0 d0VarA = g0.a(obj, j9);
        androidx.datastore.preferences.protobuf.j jVar = lVar.f918a;
        int i10 = lVar.f919b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            z zVarNewInstance = z0Var.newInstance();
            lVar.b(zVarNewInstance, z0Var, rVar);
            z0Var.makeImmutable(zVarNewInstance);
            d0VarA.add(zVarNewInstance);
            if (jVar.i() || lVar.f921d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i10);
        lVar.f921d = iF;
    }

    public final void E(Object obj, int i10, l lVar, z0 z0Var, r rVar) throws InvalidProtocolBufferException {
        int iF;
        this.f949k.getClass();
        d0 d0VarA = g0.a(obj, i10 & 1048575);
        androidx.datastore.preferences.protobuf.j jVar = lVar.f918a;
        int i11 = lVar.f919b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            z zVarNewInstance = z0Var.newInstance();
            lVar.c(zVarNewInstance, z0Var, rVar);
            z0Var.makeImmutable(zVarNewInstance);
            d0VarA.add(zVarNewInstance);
            if (jVar.i() || lVar.f921d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i11);
        lVar.f921d = iF;
    }

    public final void F(int i10, l lVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i10) != 0) {
            lVar.v(2);
            i1.p(obj, i10 & 1048575, lVar.f918a.E());
        } else if (!this.f944f) {
            i1.p(obj, i10 & 1048575, lVar.e());
        } else {
            lVar.v(2);
            i1.p(obj, i10 & 1048575, lVar.f918a.D());
        }
    }

    public final void G(int i10, l lVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i11 = 536870912 & i10;
        g0 g0Var = this.f949k;
        if (i11 != 0) {
            g0Var.getClass();
            lVar.r(g0.a(obj, i10 & 1048575), true);
        } else {
            g0Var.getClass();
            lVar.r(g0.a(obj, i10 & 1048575), false);
        }
    }

    public final void I(Object obj, int i10) {
        int i11 = this.f939a[i10 + 2];
        long j9 = 1048575 & i11;
        if (j9 == 1048575) {
            return;
        }
        i1.n(obj, j9, (1 << (i11 >>> 20)) | i1.f894c.g(obj, j9));
    }

    public final void J(Object obj, int i10, int i11) {
        i1.n(obj, this.f939a[i11 + 2] & 1048575, i10);
    }

    public final int K(int i10, int i11) {
        int[] iArr = this.f939a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    public final void L(Object obj, int i10, Object obj2) {
        f938o.putObject(obj, O(i10) & 1048575, obj2);
        I(obj, i10);
    }

    public final void M(Object obj, int i10, int i11, Object obj2) {
        f938o.putObject(obj, O(i11) & 1048575, obj2);
        J(obj, i10, i11);
    }

    public final int O(int i10) {
        return this.f939a[i10 + 1];
    }

    public final void P(Object obj, k0 k0Var) {
        int i10;
        boolean z10;
        q0 q0Var = this;
        int[] iArr = q0Var.f939a;
        int length = iArr.length;
        Unsafe unsafe = f938o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iO = q0Var.O(i13);
            int i15 = iArr[i13];
            int iN = N(iO);
            if (iN <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j9 = iO & i11;
            switch (iN) {
                case 0:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        double dE = i1.f894c.e(obj, j9);
                        o oVar = (o) k0Var.f917a;
                        oVar.getClass();
                        oVar.r0(i15, Double.doubleToRawLongBits(dE));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        float f3 = i1.f894c.f(obj, j9);
                        o oVar2 = (o) k0Var.f917a;
                        oVar2.getClass();
                        oVar2.p0(i15, Float.floatToRawIntBits(f3));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).A0(i15, unsafe.getLong(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).A0(i15, unsafe.getLong(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).t0(i15, unsafe.getInt(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).r0(i15, unsafe.getLong(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).p0(i15, unsafe.getInt(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).n0(i15, i1.f894c.c(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        Object object = unsafe.getObject(obj, j9);
                        if (object instanceof String) {
                            ((o) k0Var.f917a).w0(i15, (String) object);
                        } else {
                            ((o) k0Var.f917a).o0(i15, (i) object);
                        }
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).v0(i15, (a) unsafe.getObject(obj, j9), q0Var.l(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).o0(i15, (i) unsafe.getObject(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).y0(i15, unsafe.getInt(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).t0(i15, unsafe.getInt(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).p0(i15, unsafe.getInt(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        ((o) k0Var.f917a).r0(i15, unsafe.getLong(obj, j9));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        int i18 = unsafe.getInt(obj, j9);
                        ((o) k0Var.f917a).y0(i15, (i18 >> 31) ^ (i18 << 1));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        long j10 = unsafe.getLong(obj, j9);
                        ((o) k0Var.f917a).A0(i15, (j10 >> 63) ^ (j10 << 1));
                    }
                    q0Var = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if (q0Var.n(obj, i13, i12, i14, i10)) {
                        k0Var.a(i15, unsafe.getObject(obj, j9), q0Var.l(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TYPE_SINT64_VALUE:
                    a1.n(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    a1.r(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    a1.t(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    a1.z(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    a1.s(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    a1.q(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    a1.p(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    a1.m(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case RuntimeVersion.MINOR:
                    int i19 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j9);
                    Class cls = a1.f870a;
                    if (list != null && !list.isEmpty()) {
                        k0Var.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            ((o) k0Var.f917a).w0(i19, (String) list.get(i20));
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 27:
                    int i21 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j9);
                    z0 z0VarL = q0Var.l(i13);
                    Class cls2 = a1.f870a;
                    if (list2 != null && !list2.isEmpty()) {
                        k0Var.getClass();
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((o) k0Var.f917a).v0(i21, (a) list2.get(i22), z0VarL);
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 28:
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j9);
                    Class cls3 = a1.f870a;
                    if (list3 != null && !list3.isEmpty()) {
                        k0Var.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            ((o) k0Var.f917a).o0(i23, (i) list3.get(i24));
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 29:
                    z10 = false;
                    a1.y(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    z10 = false;
                    a1.o(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    z10 = false;
                    a1.u(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    z10 = false;
                    a1.v(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    z10 = false;
                    a1.w(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    z10 = false;
                    a1.x(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    a1.n(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 36:
                    a1.r(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 37:
                    a1.t(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 38:
                    a1.z(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 39:
                    a1.s(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 40:
                    a1.q(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 41:
                    a1.p(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 42:
                    a1.m(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 43:
                    a1.y(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 44:
                    a1.o(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 45:
                    a1.u(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 46:
                    a1.v(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 47:
                    a1.w(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 48:
                    a1.x(iArr[i13], (List) unsafe.getObject(obj, j9), k0Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 49:
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j9);
                    z0 z0VarL2 = q0Var.l(i13);
                    Class cls4 = a1.f870a;
                    if (list4 != null && !list4.isEmpty()) {
                        k0Var.getClass();
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            k0Var.a(i25, list4.get(i26), z0VarL2);
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j9) != null) {
                        Object objK = q0Var.k(i13);
                        q0Var.m.getClass();
                        a1.b.x(objK);
                        throw null;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 51:
                    if (q0Var.p(obj, i15, i13)) {
                        double dDoubleValue = ((Double) i1.f894c.i(obj, j9)).doubleValue();
                        o oVar3 = (o) k0Var.f917a;
                        oVar3.getClass();
                        oVar3.r0(i15, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 52:
                    if (q0Var.p(obj, i15, i13)) {
                        float fFloatValue = ((Float) i1.f894c.i(obj, j9)).floatValue();
                        o oVar4 = (o) k0Var.f917a;
                        oVar4.getClass();
                        oVar4.p0(i15, Float.floatToRawIntBits(fFloatValue));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 53:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).A0(i15, y(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 54:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).A0(i15, y(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 55:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).t0(i15, x(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 56:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).r0(i15, y(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 57:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).p0(i15, x(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 58:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).n0(i15, ((Boolean) i1.f894c.i(obj, j9)).booleanValue());
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 59:
                    if (q0Var.p(obj, i15, i13)) {
                        Object object2 = unsafe.getObject(obj, j9);
                        if (object2 instanceof String) {
                            ((o) k0Var.f917a).w0(i15, (String) object2);
                        } else {
                            ((o) k0Var.f917a).o0(i15, (i) object2);
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 60:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).v0(i15, (a) unsafe.getObject(obj, j9), q0Var.l(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 61:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).o0(i15, (i) unsafe.getObject(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 62:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).y0(i15, x(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 63:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).t0(i15, x(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 64:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).p0(i15, x(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 65:
                    if (q0Var.p(obj, i15, i13)) {
                        ((o) k0Var.f917a).r0(i15, y(obj, j9));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 66:
                    if (q0Var.p(obj, i15, i13)) {
                        int iX = x(obj, j9);
                        ((o) k0Var.f917a).y0(i15, (iX >> 31) ^ (iX << 1));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 67:
                    if (q0Var.p(obj, i15, i13)) {
                        long jY = y(obj, j9);
                        ((o) k0Var.f917a).A0(i15, (jY << 1) ^ (jY >> 63));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 68:
                    if (q0Var.p(obj, i15, i13)) {
                        k0Var.a(i15, unsafe.getObject(obj, j9), q0Var.l(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                default:
                    i13 += 3;
                    i11 = 1048575;
                    break;
            }
        }
        ((d1) q0Var.l).getClass();
        ((z) obj).unknownFields.e(k0Var);
    }

    @Override
    public final int a(z zVar) {
        int i10;
        int iI0;
        int iI1;
        int iI2;
        int iK0;
        int iI3;
        int iK1;
        int iI4;
        int iI5;
        int iI6;
        int iB;
        int iJ0;
        int iE0;
        int iI7;
        int iB2;
        int iC;
        int iI8;
        int size;
        int i11;
        int iI9;
        int iI10;
        int size2;
        int iI11;
        int iJ1;
        int iB3;
        int iI12;
        int iI13;
        int iK2;
        int iI14;
        int iK3;
        int i12;
        q0 q0Var = this;
        z zVar2 = zVar;
        Unsafe unsafe = f938o;
        int i13 = 0;
        int i14 = 0;
        int iE1 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = q0Var.f939a;
            if (i13 >= iArr.length) {
                ((d1) q0Var.l).getClass();
                return zVar2.unknownFields.b() + iE1;
            }
            int iO = q0Var.O(i13);
            int iN = N(iO);
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & 1048575;
            if (iN <= 17) {
                if (i18 != i15) {
                    i14 = i18 == 1048575 ? 0 : unsafe.getInt(zVar2, i18);
                    i15 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j9 = iO & 1048575;
            if (iN >= u.B.A) {
                int i19 = u.C.A;
            }
            switch (iN) {
                case 0:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI0 = o.i0(i16);
                        iC = iI0 + 8;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 1:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI1 = o.i0(i16);
                        iI5 = iI1 + 4;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 2:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        long j10 = unsafe.getLong(zVar2, j9);
                        iI2 = o.i0(i16);
                        iK0 = o.k0(j10);
                        iE1 += iK0 + iI2;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 3:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        long j11 = unsafe.getLong(zVar2, j9);
                        iI2 = o.i0(i16);
                        iK0 = o.k0(j11);
                        iE1 += iK0 + iI2;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 4:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        int i20 = unsafe.getInt(zVar2, j9);
                        iI3 = o.i0(i16);
                        iK1 = o.k0(i20);
                        iE0 = iK1 + iI3;
                        iE1 += iE0;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 5:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI4 = o.i0(i16);
                        iI5 = iI4 + 8;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 6:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI1 = o.i0(i16);
                        iI5 = iI1 + 4;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 7:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI5 = o.i0(i16) + 1;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 8:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        Object object = unsafe.getObject(zVar2, j9);
                        iE1 = (object instanceof i ? o.e0(i16, (i) object) : o.h0((String) object) + o.i0(i16)) + iE1;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 9:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        Object object2 = unsafe.getObject(zVar2, j9);
                        z0 z0VarL = q0Var.l(i13);
                        Class cls = a1.f870a;
                        iI6 = o.i0(i16);
                        iB = ((a) object2).b(z0VarL);
                        iJ0 = o.j0(iB);
                        i12 = iJ0 + iB + iI6;
                        iE1 += i12;
                    }
                    i13 += 3;
                    break;
                case 10:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iE0 = o.e0(i16, (i) unsafe.getObject(zVar2, j9));
                        iE1 += iE0;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 11:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        int i21 = unsafe.getInt(zVar2, j9);
                        iI3 = o.i0(i16);
                        iK1 = o.j0(i21);
                        iE0 = iK1 + iI3;
                        iE1 += iE0;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 12:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        int i22 = unsafe.getInt(zVar2, j9);
                        iI3 = o.i0(i16);
                        iK1 = o.k0(i22);
                        iE0 = iK1 + iI3;
                        iE1 += iE0;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 13:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI1 = o.i0(i16);
                        iI5 = iI1 + 4;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 14:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        iI4 = o.i0(i16);
                        iI5 = iI4 + 8;
                        iE1 += iI5;
                    }
                    q0Var = this;
                    zVar2 = zVar;
                    i13 += 3;
                    break;
                case 15:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        int i23 = unsafe.getInt(zVar2, j9);
                        iI3 = o.i0(i16);
                        iK1 = o.f0(i23);
                        iE0 = iK1 + iI3;
                        iE1 += iE0;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 16:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        long j12 = unsafe.getLong(zVar2, j9);
                        iI2 = o.i0(i16);
                        iK0 = o.g0(j12);
                        iE1 += iK0 + iI2;
                    }
                    q0Var = this;
                    i13 += 3;
                    break;
                case 17:
                    if (q0Var.n(zVar2, i13, i15, i14, i10)) {
                        a aVar = (a) unsafe.getObject(zVar2, j9);
                        z0 z0VarL2 = q0Var.l(i13);
                        iI7 = o.i0(i16) * 2;
                        iB2 = aVar.b(z0VarL2);
                        iC = iB2 + iI7;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case TYPE_SINT64_VALUE:
                    iC = a1.c(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    iC = a1.b(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    List list = (List) unsafe.getObject(zVar2, j9);
                    Class cls2 = a1.f870a;
                    if (list.size() == 0) {
                        iI8 = 0;
                    } else {
                        iI8 = (o.i0(i16) * list.size()) + a1.e(list);
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    List list2 = (List) unsafe.getObject(zVar2, j9);
                    Class cls3 = a1.f870a;
                    size = list2.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.i(list2);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    List list3 = (List) unsafe.getObject(zVar2, j9);
                    Class cls4 = a1.f870a;
                    size = list3.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.d(list3);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 23:
                    iC = a1.c(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case 24:
                    iC = a1.b(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zVar2, j9);
                    Class cls5 = a1.f870a;
                    int size3 = list4.size();
                    iE1 += size3 == 0 ? 0 : (o.i0(i16) + 1) * size3;
                    i13 += 3;
                    break;
                case RuntimeVersion.MINOR:
                    List list5 = (List) unsafe.getObject(zVar2, j9);
                    Class cls6 = a1.f870a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iI8 = 0;
                    } else {
                        iI8 = o.i0(i16) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof i) {
                                int size5 = ((i) obj).size();
                                iI8 = o.j0(size5) + size5 + iI8;
                            } else {
                                iI8 = o.h0((String) obj) + iI8;
                            }
                        }
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(zVar2, j9);
                    z0 z0VarL3 = q0Var.l(i13);
                    Class cls7 = a1.f870a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iI10 = 0;
                    } else {
                        iI10 = o.i0(i16) * size6;
                        for (int i25 = 0; i25 < size6; i25++) {
                            int iB4 = ((a) list6.get(i25)).b(z0VarL3);
                            iI10 += o.j0(iB4) + iB4;
                        }
                    }
                    iE1 += iI10;
                    i13 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zVar2, j9);
                    Class cls8 = a1.f870a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iI8 = 0;
                    } else {
                        iI8 = o.i0(i16) * size7;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int size8 = ((i) list7.get(i26)).size();
                            iI8 += o.j0(size8) + size8;
                        }
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(zVar2, j9);
                    Class cls9 = a1.f870a;
                    size = list8.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.h(list8);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(zVar2, j9);
                    Class cls10 = a1.f870a;
                    size = list9.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.a(list9);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 31:
                    iC = a1.b(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    iC = a1.c(i16, (List) unsafe.getObject(zVar2, j9));
                    iE1 += iC;
                    i13 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zVar2, j9);
                    Class cls11 = a1.f870a;
                    size = list10.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.f(list10);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(zVar2, j9);
                    Class cls12 = a1.f870a;
                    size = list11.size();
                    if (size == 0) {
                        iI8 = 0;
                    } else {
                        i11 = a1.g(list11);
                        iI9 = o.i0(i16);
                        iI8 = (iI9 * size) + i11;
                    }
                    iE1 += iI8;
                    i13 += 3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(zVar2, j9);
                    Class cls13 = a1.f870a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(zVar2, j9);
                    Class cls14 = a1.f870a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 37:
                    size2 = a1.e((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 38:
                    size2 = a1.i((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 39:
                    size2 = a1.d((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(zVar2, j9);
                    Class cls15 = a1.f870a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(zVar2, j9);
                    Class cls16 = a1.f870a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(zVar2, j9);
                    Class cls17 = a1.f870a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 43:
                    size2 = a1.h((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 44:
                    size2 = a1.a((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(zVar2, j9);
                    Class cls18 = a1.f870a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(zVar2, j9);
                    Class cls19 = a1.f870a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 47:
                    size2 = a1.f((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 48:
                    size2 = a1.g((List) unsafe.getObject(zVar2, j9));
                    if (size2 > 0) {
                        iI11 = o.i0(i16);
                        iJ1 = o.j0(size2);
                        iE1 += iJ1 + iI11 + size2;
                    }
                    i13 += 3;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(zVar2, j9);
                    z0 z0VarL4 = q0Var.l(i13);
                    Class cls20 = a1.f870a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iB3 = 0;
                    } else {
                        iB3 = 0;
                        for (int i27 = 0; i27 < size9; i27++) {
                            iB3 += ((a) list19.get(i27)).b(z0VarL4) + (o.i0(i16) * 2);
                        }
                    }
                    iE1 += iB3;
                    i13 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(zVar2, j9);
                    Object objK = q0Var.k(i13);
                    q0Var.m.getClass();
                    l0 l0Var = (l0) object3;
                    if (objK != null) {
                        throw new ClassCastException();
                    }
                    if (l0Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = l0Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i13 += 3;
                    break;
                case 51:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI0 = o.i0(i16);
                        iC = iI0 + 8;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 52:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI12 = o.i0(i16);
                        iC = iI12 + 4;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 53:
                    if (q0Var.p(zVar2, i16, i13)) {
                        long jY = y(zVar2, j9);
                        iI13 = o.i0(i16);
                        iK2 = o.k0(jY);
                        i12 = iK2 + iI13;
                        iE1 += i12;
                    }
                    i13 += 3;
                    break;
                case 54:
                    if (q0Var.p(zVar2, i16, i13)) {
                        long jY2 = y(zVar2, j9);
                        iI13 = o.i0(i16);
                        iK2 = o.k0(jY2);
                        i12 = iK2 + iI13;
                        iE1 += i12;
                    }
                    i13 += 3;
                    break;
                case 55:
                    if (q0Var.p(zVar2, i16, i13)) {
                        int iX = x(zVar2, j9);
                        iI14 = o.i0(i16);
                        iK3 = o.k0(iX);
                        iC = iK3 + iI14;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 56:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI0 = o.i0(i16);
                        iC = iI0 + 8;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 57:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI12 = o.i0(i16);
                        iC = iI12 + 4;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 58:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iC = o.i0(i16) + 1;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 59:
                    if (q0Var.p(zVar2, i16, i13)) {
                        Object object4 = unsafe.getObject(zVar2, j9);
                        iE1 = (object4 instanceof i ? o.e0(i16, (i) object4) : o.h0((String) object4) + o.i0(i16)) + iE1;
                    }
                    i13 += 3;
                    break;
                case 60:
                    if (q0Var.p(zVar2, i16, i13)) {
                        Object object5 = unsafe.getObject(zVar2, j9);
                        z0 z0VarL5 = q0Var.l(i13);
                        Class cls21 = a1.f870a;
                        iI6 = o.i0(i16);
                        iB = ((a) object5).b(z0VarL5);
                        iJ0 = o.j0(iB);
                        i12 = iJ0 + iB + iI6;
                        iE1 += i12;
                    }
                    i13 += 3;
                    break;
                case 61:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iC = o.e0(i16, (i) unsafe.getObject(zVar2, j9));
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 62:
                    if (q0Var.p(zVar2, i16, i13)) {
                        int iX2 = x(zVar2, j9);
                        iI14 = o.i0(i16);
                        iK3 = o.j0(iX2);
                        iC = iK3 + iI14;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 63:
                    if (q0Var.p(zVar2, i16, i13)) {
                        int iX3 = x(zVar2, j9);
                        iI14 = o.i0(i16);
                        iK3 = o.k0(iX3);
                        iC = iK3 + iI14;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 64:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI12 = o.i0(i16);
                        iC = iI12 + 4;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 65:
                    if (q0Var.p(zVar2, i16, i13)) {
                        iI0 = o.i0(i16);
                        iC = iI0 + 8;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 66:
                    if (q0Var.p(zVar2, i16, i13)) {
                        int iX4 = x(zVar2, j9);
                        iI14 = o.i0(i16);
                        iK3 = o.f0(iX4);
                        iC = iK3 + iI14;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                case 67:
                    if (q0Var.p(zVar2, i16, i13)) {
                        long jY3 = y(zVar2, j9);
                        iI13 = o.i0(i16);
                        iK2 = o.g0(jY3);
                        i12 = iK2 + iI13;
                        iE1 += i12;
                    }
                    i13 += 3;
                    break;
                case 68:
                    if (q0Var.p(zVar2, i16, i13)) {
                        a aVar2 = (a) unsafe.getObject(zVar2, j9);
                        z0 z0VarL6 = q0Var.l(i13);
                        iI7 = o.i0(i16) * 2;
                        iB2 = aVar2.b(z0VarL6);
                        iC = iB2 + iI7;
                        iE1 += iC;
                    }
                    i13 += 3;
                    break;
                default:
                    i13 += 3;
                    break;
            }
        }
    }

    @Override
    public final void b(Object obj, l lVar, r rVar) throws Throwable {
        int i10;
        int i11;
        l lVar2;
        int i12;
        q0 q0Var = this;
        Object obj2 = obj;
        l lVar3 = lVar;
        r rVar2 = rVar;
        rVar2.getClass();
        h(obj2);
        b1 b1Var = q0Var.l;
        int[] iArr = q0Var.f945g;
        int i13 = q0Var.f947i;
        int i14 = q0Var.f946h;
        c1 c1VarA = null;
        while (true) {
            try {
                int iA = lVar3.a();
                int iK = (iA < q0Var.f941c || iA > q0Var.f942d) ? -1 : q0Var.K(iA, 0);
                if (iK >= 0) {
                    int iO = q0Var.O(iK);
                    try {
                        int iN = N(iO);
                        g0 g0Var = q0Var.f949k;
                        switch (iN) {
                            case 0:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW = w(iO);
                                lVar2.v(1);
                                Object obj3 = obj2;
                                try {
                                    i1.f894c.m(obj3, jW, lVar2.f918a.s());
                                    obj2 = obj3;
                                    q0Var.I(obj2, iK);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj2 = obj3;
                                    try {
                                        b1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = b1Var.a(obj2);
                                        }
                                        if (!b1Var.b(0, lVar2, c1VarA)) {
                                            for (i12 = i10; i12 < i13; i12++) {
                                                q0Var.i(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (i11 = i10; i11 < i13; i11++) {
                                            q0Var.i(iArr[i11], obj2, c1VarA);
                                        }
                                        if (c1VarA != null) {
                                            ((d1) b1Var).getClass();
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj3;
                                    while (i11 < i13) {
                                        q0Var.i(iArr[i11], obj2, c1VarA);
                                    }
                                    if (c1VarA != null) {
                                        ((d1) b1Var).getClass();
                                        ((z) obj2).unknownFields = c1VarA;
                                    }
                                    throw th;
                                }
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 1:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW2 = w(iO);
                                lVar2.v(5);
                                i1.f894c.n(obj2, jW2, lVar2.f918a.w());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 2:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW3 = w(iO);
                                lVar2.v(0);
                                i1.o(obj2, jW3, lVar2.f918a.y());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 3:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW4 = w(iO);
                                lVar2.v(0);
                                i1.o(obj2, jW4, lVar2.f918a.H());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 4:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW5 = w(iO);
                                lVar2.v(0);
                                i1.n(obj2, jW5, lVar2.f918a.x());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 5:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW6 = w(iO);
                                lVar2.v(1);
                                i1.o(obj2, jW6, lVar2.f918a.v());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 6:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW7 = w(iO);
                                lVar2.v(5);
                                i1.n(obj2, jW7, lVar2.f918a.u());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 7:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW8 = w(iO);
                                lVar2.v(0);
                                i1.f894c.k(obj2, jW8, lVar2.f918a.o());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 8:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                q0Var.F(iO, lVar2, obj2);
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 9:
                                r rVar3 = rVar2;
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                a aVar = (a) q0Var.t(obj2, iK);
                                z0 z0VarL = q0Var.l(iK);
                                lVar2.v(2);
                                lVar2.c(aVar, z0VarL, rVar3);
                                q0Var.L(obj2, iK, aVar);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 10:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                i1.p(obj2, w(iO), lVar2.e());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 11:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW9 = w(iO);
                                lVar2.v(0);
                                i1.n(obj2, jW9, lVar2.f918a.G());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 12:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                lVar2.v(0);
                                int iT = lVar2.f918a.t();
                                q0Var.j(iK);
                                i1.n(obj2, w(iO), iT);
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 13:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW10 = w(iO);
                                lVar2.v(5);
                                i1.n(obj2, jW10, lVar2.f918a.z());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 14:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW11 = w(iO);
                                lVar2.v(1);
                                i1.o(obj2, jW11, lVar2.f918a.A());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 15:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW12 = w(iO);
                                lVar2.v(0);
                                i1.n(obj2, jW12, lVar2.f918a.B());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 16:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW13 = w(iO);
                                lVar2.v(0);
                                i1.o(obj2, jW13, lVar2.f918a.C());
                                q0Var.I(obj2, iK);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 17:
                                r rVar4 = rVar2;
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                a aVar2 = (a) q0Var.t(obj2, iK);
                                z0 z0VarL2 = q0Var.l(iK);
                                lVar2.v(3);
                                lVar2.b(aVar2, z0VarL2, rVar4);
                                q0Var.L(obj2, iK, aVar2);
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case TYPE_SINT64_VALUE:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW14 = w(iO);
                                g0Var.getClass();
                                lVar2.g(g0.a(obj2, jW14));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW15 = w(iO);
                                g0Var.getClass();
                                lVar2.k(g0.a(obj2, jW15));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW16 = w(iO);
                                g0Var.getClass();
                                lVar2.m(g0.a(obj2, jW16));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW17 = w(iO);
                                g0Var.getClass();
                                lVar2.t(g0.a(obj2, jW17));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW18 = w(iO);
                                g0Var.getClass();
                                lVar2.l(g0.a(obj2, jW18));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 23:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW19 = w(iO);
                                g0Var.getClass();
                                lVar2.j(g0.a(obj2, jW19));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 24:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW20 = w(iO);
                                g0Var.getClass();
                                lVar2.i(g0.a(obj2, jW20));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 25:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                long jW21 = w(iO);
                                g0Var.getClass();
                                lVar2.d(g0.a(obj2, jW21));
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case RuntimeVersion.MINOR:
                                i10 = i14;
                                q0Var = q0Var;
                                lVar2 = lVar3;
                                try {
                                    q0Var.G(iO, lVar2, obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    b1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = b1Var.a(obj2);
                                    }
                                    if (!b1Var.b(0, lVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            q0Var.i(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((z) obj2).unknownFields = c1VarA;
                                    }
                                }
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 27:
                                i10 = i14;
                                try {
                                    try {
                                        q0Var.E(obj2, iO, lVar3, q0Var.l(iK), rVar);
                                        lVar2 = lVar3;
                                        q0Var = q0Var;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        lVar2 = lVar3;
                                        q0Var = q0Var;
                                        b1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = b1Var.a(obj2);
                                        }
                                        if (!b1Var.b(0, lVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                q0Var.i(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    lVar2 = lVar3;
                                    b1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = b1Var.a(obj2);
                                    }
                                    if (!b1Var.b(0, lVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            q0Var.i(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((z) obj2).unknownFields = c1VarA;
                                    }
                                }
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 28:
                                i10 = i14;
                                long jW22 = w(iO);
                                g0Var.getClass();
                                lVar3.f(g0.a(obj2, jW22));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 29:
                                i10 = i14;
                                long jW23 = w(iO);
                                g0Var.getClass();
                                lVar3.s(g0.a(obj2, jW23));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 30:
                                i10 = i14;
                                long jW24 = w(iO);
                                g0Var.getClass();
                                d0 d0VarA = g0.a(obj2, jW24);
                                lVar3.h(d0VarA);
                                q0Var.j(iK);
                                a1.j(obj2, iA, d0VarA, c1VarA, b1Var);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 31:
                                i10 = i14;
                                long jW25 = w(iO);
                                g0Var.getClass();
                                lVar3.n(g0.a(obj2, jW25));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                i10 = i14;
                                long jW26 = w(iO);
                                g0Var.getClass();
                                lVar3.o(g0.a(obj2, jW26));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 33:
                                i10 = i14;
                                long jW27 = w(iO);
                                g0Var.getClass();
                                lVar3.p(g0.a(obj2, jW27));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 34:
                                i10 = i14;
                                long jW28 = w(iO);
                                g0Var.getClass();
                                lVar3.q(g0.a(obj2, jW28));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 35:
                                i10 = i14;
                                long jW29 = w(iO);
                                g0Var.getClass();
                                lVar3.g(g0.a(obj2, jW29));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 36:
                                i10 = i14;
                                long jW30 = w(iO);
                                g0Var.getClass();
                                lVar3.k(g0.a(obj2, jW30));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 37:
                                i10 = i14;
                                long jW31 = w(iO);
                                g0Var.getClass();
                                lVar3.m(g0.a(obj2, jW31));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 38:
                                i10 = i14;
                                long jW32 = w(iO);
                                g0Var.getClass();
                                lVar3.t(g0.a(obj2, jW32));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 39:
                                i10 = i14;
                                long jW33 = w(iO);
                                g0Var.getClass();
                                lVar3.l(g0.a(obj2, jW33));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 40:
                                i10 = i14;
                                long jW34 = w(iO);
                                g0Var.getClass();
                                lVar3.j(g0.a(obj2, jW34));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 41:
                                i10 = i14;
                                long jW35 = w(iO);
                                g0Var.getClass();
                                lVar3.i(g0.a(obj2, jW35));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 42:
                                i10 = i14;
                                long jW36 = w(iO);
                                g0Var.getClass();
                                lVar3.d(g0.a(obj2, jW36));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 43:
                                i10 = i14;
                                long jW37 = w(iO);
                                g0Var.getClass();
                                lVar3.s(g0.a(obj2, jW37));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 44:
                                i10 = i14;
                                long jW38 = w(iO);
                                g0Var.getClass();
                                d0 d0VarA2 = g0.a(obj2, jW38);
                                lVar3.h(d0VarA2);
                                q0Var.j(iK);
                                a1.j(obj2, iA, d0VarA2, c1VarA, b1Var);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 45:
                                i10 = i14;
                                long jW39 = w(iO);
                                g0Var.getClass();
                                lVar3.n(g0.a(obj2, jW39));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 46:
                                i10 = i14;
                                long jW40 = w(iO);
                                g0Var.getClass();
                                lVar3.o(g0.a(obj2, jW40));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 47:
                                i10 = i14;
                                long jW41 = w(iO);
                                g0Var.getClass();
                                lVar3.p(g0.a(obj2, jW41));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 48:
                                i10 = i14;
                                long jW42 = w(iO);
                                g0Var.getClass();
                                lVar3.q(g0.a(obj2, jW42));
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 49:
                                i10 = i14;
                                try {
                                    try {
                                        q0Var.D(obj2, w(iO), lVar, q0Var.l(iK), rVar);
                                        lVar3 = lVar;
                                        lVar2 = lVar3;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        q0Var = q0Var;
                                        lVar2 = lVar;
                                        b1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = b1Var.a(obj2);
                                        }
                                        if (!b1Var.b(0, lVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                q0Var.i(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    lVar2 = lVar;
                                    q0Var = q0Var;
                                    b1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = b1Var.a(obj2);
                                    }
                                    if (!b1Var.b(0, lVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            q0Var.i(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((z) obj2).unknownFields = c1VarA;
                                    }
                                    q0Var = q0Var;
                                    lVar3 = lVar2;
                                    i14 = i10;
                                    rVar2 = rVar;
                                    break;
                                }
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 50:
                                i10 = i14;
                                q0Var.q(iK, obj2, q0Var.k(iK));
                                throw null;
                            case 51:
                                i10 = i14;
                                long jW43 = w(iO);
                                lVar3.v(1);
                                i1.p(obj2, jW43, Double.valueOf(lVar3.f918a.s()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 52:
                                i10 = i14;
                                long jW44 = w(iO);
                                lVar3.v(5);
                                i1.p(obj2, jW44, Float.valueOf(lVar3.f918a.w()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 53:
                                i10 = i14;
                                long jW45 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW45, Long.valueOf(lVar3.f918a.y()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 54:
                                i10 = i14;
                                long jW46 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW46, Long.valueOf(lVar3.f918a.H()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 55:
                                i10 = i14;
                                long jW47 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW47, Integer.valueOf(lVar3.f918a.x()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 56:
                                i10 = i14;
                                long jW48 = w(iO);
                                lVar3.v(1);
                                i1.p(obj2, jW48, Long.valueOf(lVar3.f918a.v()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 57:
                                i10 = i14;
                                long jW49 = w(iO);
                                lVar3.v(5);
                                i1.p(obj2, jW49, Integer.valueOf(lVar3.f918a.u()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 58:
                                i10 = i14;
                                long jW50 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW50, Boolean.valueOf(lVar3.f918a.o()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 59:
                                i10 = i14;
                                q0Var.F(iO, lVar3, obj2);
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 60:
                                i10 = i14;
                                a aVar3 = (a) q0Var.u(obj2, iA, iK);
                                z0 z0VarL3 = q0Var.l(iK);
                                lVar3.v(2);
                                lVar3.c(aVar3, z0VarL3, rVar2);
                                q0Var.M(obj2, iA, iK, aVar3);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 61:
                                i10 = i14;
                                i1.p(obj2, w(iO), lVar3.e());
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 62:
                                i10 = i14;
                                long jW51 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW51, Integer.valueOf(lVar3.f918a.G()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 63:
                                i10 = i14;
                                lVar3.v(0);
                                int iT2 = lVar3.f918a.t();
                                q0Var.j(iK);
                                i1.p(obj2, w(iO), Integer.valueOf(iT2));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 64:
                                i10 = i14;
                                long jW52 = w(iO);
                                lVar3.v(5);
                                i1.p(obj2, jW52, Integer.valueOf(lVar3.f918a.z()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 65:
                                i10 = i14;
                                long jW53 = w(iO);
                                lVar3.v(1);
                                i1.p(obj2, jW53, Long.valueOf(lVar3.f918a.A()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 66:
                                i10 = i14;
                                long jW54 = w(iO);
                                lVar3.v(0);
                                i1.p(obj2, jW54, Integer.valueOf(lVar3.f918a.B()));
                                q0Var.J(obj2, iA, iK);
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 67:
                                i10 = i14;
                                try {
                                    try {
                                        long jW55 = w(iO);
                                        lVar3.v(0);
                                        i1.p(obj2, jW55, Long.valueOf(lVar3.f918a.C()));
                                        q0Var.J(obj2, iA, iK);
                                        lVar2 = lVar3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        q0Var = q0Var;
                                        while (i11 < i13) {
                                            q0Var.i(iArr[i11], obj2, c1VarA);
                                        }
                                        if (c1VarA != null) {
                                            ((d1) b1Var).getClass();
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    lVar2 = lVar3;
                                    b1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = b1Var.a(obj2);
                                    }
                                    if (!b1Var.b(0, lVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            q0Var.i(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((z) obj2).unknownFields = c1VarA;
                                    }
                                }
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            case 68:
                                a aVar4 = (a) q0Var.u(obj2, iA, iK);
                                z0 z0VarL4 = q0Var.l(iK);
                                lVar3.v(3);
                                lVar3.b(aVar4, z0VarL4, rVar2);
                                q0Var.M(obj2, iA, iK, aVar4);
                                i10 = i14;
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                            default:
                                if (c1VarA == null) {
                                    try {
                                        c1VarA = b1Var.a(obj2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        i10 = i14;
                                        lVar2 = lVar3;
                                        b1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = b1Var.a(obj2);
                                        }
                                        if (!b1Var.b(0, lVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                q0Var.i(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((z) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                }
                                if (!b1Var.b(0, lVar3, c1VarA)) {
                                    while (i14 < i13) {
                                        q0Var.i(iArr[i14], obj2, c1VarA);
                                        i14++;
                                    }
                                    if (c1VarA == null) {
                                        return;
                                    }
                                }
                                i10 = i14;
                                lVar2 = lVar3;
                                q0Var = q0Var;
                                lVar3 = lVar2;
                                i14 = i10;
                                rVar2 = rVar;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                        i10 = i14;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i14 < i13) {
                        q0Var.i(iArr[i14], obj2, c1VarA);
                        i14++;
                    }
                    if (c1VarA == null) {
                        return;
                    } else {
                        ((d1) b1Var).getClass();
                    }
                } else {
                    b1Var.getClass();
                    if (c1VarA == null) {
                        c1VarA = b1Var.a(obj2);
                    }
                    if (!b1Var.b(0, lVar3, c1VarA)) {
                        while (i14 < i13) {
                            q0Var.i(iArr[i14], obj2, c1VarA);
                            i14++;
                        }
                        if (c1VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                q0Var = q0Var;
                i10 = i14;
            }
        }
        ((z) obj2).unknownFields = c1VarA;
    }

    @Override
    public final int c(z zVar) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f939a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iO = O(i13);
            int i14 = iArr[i13];
            long j9 = 1048575 & iO;
            int i15 = 1237;
            int iHashCode = 37;
            switch (N(iO)) {
                case 0:
                    i10 = i12 * 53;
                    iB = e0.b(Double.doubleToLongBits(i1.f894c.e(zVar, j9)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(i1.f894c.f(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = e0.b(i1.f894c.h(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = e0.b(i1.f894c.h(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = e0.b(i1.f894c.h(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = i1.f894c.c(zVar, j9);
                    Charset charset = e0.f885a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) i1.f894c.i(zVar, j9)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = i1.f894c.i(zVar, j9);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = i1.f894c.i(zVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = e0.b(i1.f894c.h(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = i1.f894c.g(zVar, j9);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = e0.b(i1.f894c.h(zVar, j9));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = i1.f894c.i(zVar, j9);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = i1.f894c.i(zVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = i1.f894c.i(zVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 51:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(Double.doubleToLongBits(((Double) i1.f894c.i(zVar, j9)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case 52:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) i1.f894c.i(zVar, j9)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case 53:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(y(zVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 54:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(y(zVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 55:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 56:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(y(zVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 57:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 58:
                    if (p(zVar, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) i1.f894c.i(zVar, j9)).booleanValue();
                        Charset charset2 = e0.f885a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = ((String) i1.f894c.i(zVar, j9)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = i1.f894c.i(zVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 61:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = i1.f894c.i(zVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 63:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(y(zVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = x(zVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = e0.b(y(zVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (p(zVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = i1.f894c.i(zVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        ((d1) this.l).getClass();
        return zVar.unknownFields.hashCode() + (i12 * 53);
    }

    @Override
    public final void d(Object obj, k0 k0Var) {
        k0Var.getClass();
        P(obj, k0Var);
    }

    @Override
    public final void e(Object obj, byte[] bArr, int i10, int i11, d dVar) {
        A(obj, bArr, i10, i11, 0, dVar);
    }

    @Override
    public final boolean f(z zVar, z zVar2) {
        int[] iArr = this.f939a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iO = O(i10);
                long j9 = iO & 1048575;
                switch (N(iO)) {
                    case 0:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var = i1.f894c;
                            if (Double.doubleToLongBits(h1Var.e(zVar, j9)) != Double.doubleToLongBits(h1Var.e(zVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var2 = i1.f894c;
                            if (Float.floatToIntBits(h1Var2.f(zVar, j9)) != Float.floatToIntBits(h1Var2.f(zVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var3 = i1.f894c;
                            if (h1Var3.h(zVar, j9) != h1Var3.h(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var4 = i1.f894c;
                            if (h1Var4.h(zVar, j9) != h1Var4.h(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var5 = i1.f894c;
                            if (h1Var5.g(zVar, j9) != h1Var5.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var6 = i1.f894c;
                            if (h1Var6.h(zVar, j9) != h1Var6.h(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var7 = i1.f894c;
                            if (h1Var7.g(zVar, j9) != h1Var7.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var8 = i1.f894c;
                            if (h1Var8.c(zVar, j9) != h1Var8.c(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var9 = i1.f894c;
                            if (!a1.l(h1Var9.i(zVar, j9), h1Var9.i(zVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var10 = i1.f894c;
                            if (!a1.l(h1Var10.i(zVar, j9), h1Var10.i(zVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var11 = i1.f894c;
                            if (!a1.l(h1Var11.i(zVar, j9), h1Var11.i(zVar2, j9))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var12 = i1.f894c;
                            if (h1Var12.g(zVar, j9) != h1Var12.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var13 = i1.f894c;
                            if (h1Var13.g(zVar, j9) != h1Var13.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var14 = i1.f894c;
                            if (h1Var14.g(zVar, j9) != h1Var14.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var15 = i1.f894c;
                            if (h1Var15.h(zVar, j9) != h1Var15.h(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var16 = i1.f894c;
                            if (h1Var16.g(zVar, j9) != h1Var16.g(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var17 = i1.f894c;
                            if (h1Var17.h(zVar, j9) != h1Var17.h(zVar2, j9)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!g(zVar, zVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var18 = i1.f894c;
                            if (!a1.l(h1Var18.i(zVar, j9), h1Var18.i(zVar2, j9))) {
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
                        h1 h1Var19 = i1.f894c;
                        zL = a1.l(h1Var19.i(zVar, j9), h1Var19.i(zVar2, j9));
                        break;
                    case 50:
                        h1 h1Var20 = i1.f894c;
                        zL = a1.l(h1Var20.i(zVar, j9), h1Var20.i(zVar2, j9));
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
                        h1 h1Var21 = i1.f894c;
                        if (h1Var21.g(zVar, j10) != h1Var21.g(zVar2, j10) || !a1.l(h1Var21.i(zVar, j9), h1Var21.i(zVar2, j9))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                d1 d1Var = (d1) this.l;
                d1Var.getClass();
                c1 c1Var = zVar.unknownFields;
                d1Var.getClass();
                if (c1Var.equals(zVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(z zVar, z zVar2, int i10) {
        return m(zVar, i10) == m(zVar2, i10);
    }

    public final void i(int i10, Object obj, Object obj2) {
        int i11 = this.f939a[i10];
        if (i1.f894c.i(obj, O(i10) & 1048575) == null) {
            return;
        }
        j(i10);
    }

    @Override
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f946h) {
            int i15 = this.f945g[i14];
            int[] iArr = this.f939a;
            int i16 = iArr[i15];
            int iO = O(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f938o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iO) == 0 || n(obj, i15, i10, i11, i19)) {
                int iN = N(iO);
                if (iN == 9 || iN == 17) {
                    if (n(obj, i15, i10, i11, i19)) {
                        if (!l(i15).isInitialized(i1.f894c.i(obj, iO & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iN != 27) {
                        if (iN == 60 || iN == 68) {
                            if (p(obj, i16, i15)) {
                                if (!l(i15).isInitialized(i1.f894c.i(obj, iO & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iN != 49) {
                            if (iN != 50) {
                                continue;
                            } else {
                                Object objI = i1.f894c.i(obj, iO & 1048575);
                                this.m.getClass();
                                if (!((l0) objI).isEmpty()) {
                                    a1.b.x(k(i15));
                                    throw null;
                                }
                            }
                        }
                        i14++;
                        i12 = i10;
                        i13 = i11;
                    }
                    List list = (List) i1.f894c.i(obj, iO & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        z0 z0VarL = l(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (z0VarL.isInitialized(list.get(i21))) {
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

    public final void j(int i10) {
        if (this.f940b[a1.b.e(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final Object k(int i10) {
        return this.f940b[(i10 / 3) * 2];
    }

    public final z0 l(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f940b;
        z0 z0Var = (z0) objArr[i11];
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0VarA = w0.f961c.a((Class) objArr[i11 + 1]);
        objArr[i11] = z0VarA;
        return z0VarA;
    }

    public final boolean m(Object obj, int i10) {
        int i11 = this.f939a[i10 + 2];
        long j9 = i11 & 1048575;
        if (j9 == 1048575) {
            int iO = O(i10);
            long j10 = iO & 1048575;
            switch (N(iO)) {
                case 0:
                    if (Double.doubleToRawLongBits(i1.f894c.e(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i1.f894c.f(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i1.f894c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i1.f894c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i1.f894c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i1.f894c.c(obj, j10);
                case 8:
                    Object objI = i1.f894c.i(obj, j10);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof i) {
                        return !i.B.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i1.f894c.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.B.equals(i1.f894c.i(obj, j10));
                case 11:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i1.f894c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i1.f894c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i1.f894c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (i1.f894c.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & i1.f894c.g(obj, j9)) == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void makeImmutable(Object obj) {
        if (o(obj)) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                zVar.l(Integer.MAX_VALUE);
                zVar.memoizedHashCode = 0;
                zVar.i();
            }
            int[] iArr = this.f939a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iO = O(i10);
                long j9 = 1048575 & iO;
                int iN = N(iO);
                if (iN != 9) {
                    if (iN != 60 && iN != 68) {
                        switch (iN) {
                            case 17:
                                if (m(obj, i10)) {
                                    l(i10).makeImmutable(f938o.getObject(obj, j9));
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
                                this.f949k.getClass();
                                b bVar = (b) ((d0) i1.f894c.i(obj, j9));
                                if (bVar.A) {
                                    bVar.A = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f938o;
                                Object object = unsafe.getObject(obj, j9);
                                if (object != null) {
                                    this.m.getClass();
                                    ((l0) object).A = false;
                                    unsafe.putObject(obj, j9, object);
                                }
                                break;
                        }
                    } else if (p(obj, iArr[i10], i10)) {
                        l(i10).makeImmutable(f938o.getObject(obj, j9));
                    }
                } else if (m(obj, i10)) {
                    l(i10).makeImmutable(f938o.getObject(obj, j9));
                }
            }
            ((d1) this.l).getClass();
            c1 c1Var = ((z) obj).unknownFields;
            if (c1Var.f880e) {
                c1Var.f880e = false;
            }
        }
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        h(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f939a;
            if (i10 >= iArr.length) {
                a1.k(this.l, obj, obj2);
                return;
            }
            int iO = O(i10);
            long j9 = 1048575 & iO;
            int i11 = iArr[i10];
            switch (N(iO)) {
                case 0:
                    if (!m(obj2, i10)) {
                        obj3 = obj;
                    } else {
                        h1 h1Var = i1.f894c;
                        obj3 = obj;
                        h1Var.m(obj3, j9, h1Var.e(obj2, j9));
                        I(obj3, i10);
                    }
                    break;
                case 1:
                    if (m(obj2, i10)) {
                        h1 h1Var2 = i1.f894c;
                        h1Var2.n(obj, j9, h1Var2.f(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(obj2, i10)) {
                        i1.o(obj, j9, i1.f894c.h(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(obj2, i10)) {
                        i1.o(obj, j9, i1.f894c.h(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(obj2, i10)) {
                        i1.o(obj, j9, i1.f894c.h(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(obj2, i10)) {
                        h1 h1Var3 = i1.f894c;
                        h1Var3.k(obj, j9, h1Var3.c(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(obj2, i10)) {
                        i1.p(obj, j9, i1.f894c.i(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    r(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(obj2, i10)) {
                        i1.p(obj, j9, i1.f894c.i(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(obj2, i10)) {
                        i1.o(obj, j9, i1.f894c.h(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(obj2, i10)) {
                        i1.n(obj, j9, i1.f894c.g(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(obj2, i10)) {
                        i1.o(obj, j9, i1.f894c.h(obj2, j9));
                        I(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    r(obj, obj2, i10);
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
                    this.f949k.getClass();
                    h1 h1Var4 = i1.f894c;
                    d0 d0VarMutableCopyWithCapacity = (d0) h1Var4.i(obj, j9);
                    d0 d0Var = (d0) h1Var4.i(obj2, j9);
                    int size = d0VarMutableCopyWithCapacity.size();
                    int size2 = d0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((b) d0VarMutableCopyWithCapacity).A) {
                            d0VarMutableCopyWithCapacity = d0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                        }
                        d0VarMutableCopyWithCapacity.addAll(d0Var);
                    }
                    if (size > 0) {
                        d0Var = d0VarMutableCopyWithCapacity;
                    }
                    i1.p(obj, j9, d0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = a1.f870a;
                    h1 h1Var5 = i1.f894c;
                    Object objI = h1Var5.i(obj, j9);
                    Object objI2 = h1Var5.i(obj2, j9);
                    this.m.getClass();
                    i1.p(obj, j9, m0.a(objI, objI2));
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
                    if (p(obj2, i11, i10)) {
                        i1.p(obj, j9, i1.f894c.i(obj2, j9));
                        J(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    s(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i11, i10)) {
                        i1.p(obj, j9, i1.f894c.i(obj2, j9));
                        J(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(obj, obj2, i10);
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

    public final boolean n(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    @Override
    public final z newInstance() {
        this.f948j.getClass();
        return ((z) this.f943e).j();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return i1.f894c.g(obj, (long) (this.f939a[i11 + 2] & 1048575)) == i10;
    }

    public final void q(int i10, Object obj, Object obj2) {
        long jO = O(i10) & 1048575;
        Object objI = i1.f894c.i(obj, jO);
        m0 m0Var = this.m;
        if (objI != null) {
            m0Var.getClass();
            if (!((l0) objI).A) {
                l0 l0VarD = l0.B.d();
                m0.a(l0VarD, objI);
                i1.p(obj, jO, l0VarD);
                objI = l0VarD;
            }
        } else {
            m0Var.getClass();
            objI = l0.B.d();
            i1.p(obj, jO, objI);
        }
        m0Var.getClass();
        a1.b.x(obj2);
        throw null;
    }

    public final void r(Object obj, Object obj2, int i10) {
        if (m(obj2, i10)) {
            long jO = O(i10) & 1048575;
            Unsafe unsafe = f938o;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f939a[i10] + " is present but null: " + obj2);
            }
            z0 z0VarL = l(i10);
            if (!m(obj, i10)) {
                if (o(object)) {
                    z zVarNewInstance = z0VarL.newInstance();
                    z0VarL.mergeFrom(zVarNewInstance, object);
                    unsafe.putObject(obj, jO, zVarNewInstance);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                I(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!o(object2)) {
                z zVarNewInstance2 = z0VarL.newInstance();
                z0VarL.mergeFrom(zVarNewInstance2, object2);
                unsafe.putObject(obj, jO, zVarNewInstance2);
                object2 = zVarNewInstance2;
            }
            z0VarL.mergeFrom(object2, object);
        }
    }

    public final void s(Object obj, Object obj2, int i10) {
        int[] iArr = this.f939a;
        int i11 = iArr[i10];
        if (p(obj2, i11, i10)) {
            long jO = O(i10) & 1048575;
            Unsafe unsafe = f938o;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            z0 z0VarL = l(i10);
            if (!p(obj, i11, i10)) {
                if (o(object)) {
                    z zVarNewInstance = z0VarL.newInstance();
                    z0VarL.mergeFrom(zVarNewInstance, object);
                    unsafe.putObject(obj, jO, zVarNewInstance);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                J(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!o(object2)) {
                z zVarNewInstance2 = z0VarL.newInstance();
                z0VarL.mergeFrom(zVarNewInstance2, object2);
                unsafe.putObject(obj, jO, zVarNewInstance2);
                object2 = zVarNewInstance2;
            }
            z0VarL.mergeFrom(object2, object);
        }
    }

    public final Object t(Object obj, int i10) {
        z0 z0VarL = l(i10);
        long jO = O(i10) & 1048575;
        if (!m(obj, i10)) {
            return z0VarL.newInstance();
        }
        Object object = f938o.getObject(obj, jO);
        if (o(object)) {
            return object;
        }
        z zVarNewInstance = z0VarL.newInstance();
        if (object != null) {
            z0VarL.mergeFrom(zVarNewInstance, object);
        }
        return zVarNewInstance;
    }

    public final Object u(Object obj, int i10, int i11) {
        z0 z0VarL = l(i11);
        if (!p(obj, i10, i11)) {
            return z0VarL.newInstance();
        }
        Object object = f938o.getObject(obj, O(i11) & 1048575);
        if (o(object)) {
            return object;
        }
        z zVarNewInstance = z0VarL.newInstance();
        if (object != null) {
            z0VarL.mergeFrom(zVarNewInstance, object);
        }
        return zVarNewInstance;
    }

    public final void z(long j9, int i10, Object obj) {
        Unsafe unsafe = f938o;
        Object objK = k(i10);
        Object object = unsafe.getObject(obj, j9);
        this.m.getClass();
        if (!((l0) object).A) {
            l0 l0VarD = l0.B.d();
            m0.a(l0VarD, object);
            unsafe.putObject(obj, j9, l0VarD);
        }
        a1.b.x(objK);
        throw null;
    }
}
