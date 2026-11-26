package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class r0 implements a1 {

    public static final int[] f4312o = new int[0];

    public static final Unsafe f4313p = m1.j();

    public final int[] f4314a;

    public final Object[] f4315b;

    public final int f4316c;

    public final int f4317d;

    public final a f4318e;

    public final boolean f4319f;

    public final boolean f4320g;

    public final int[] f4321h;

    public final int f4322i;

    public final int f4323j;

    public final t0 f4324k;
    public final h0 l;
    public final c1 m;

    public final m0 f4325n;

    public r0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, boolean z10, int[] iArr2, int i12, int i13, t0 t0Var, h0 h0Var, c1 c1Var, q qVar, m0 m0Var) {
        this.f4314a = iArr;
        this.f4315b = objArr;
        this.f4316c = i10;
        this.f4317d = i11;
        this.f4319f = aVar instanceof x;
        this.f4320g = z10;
        this.f4321h = iArr2;
        this.f4322i = i12;
        this.f4323j = i13;
        this.f4324k = t0Var;
        this.l = h0Var;
        this.m = c1Var;
        this.f4318e = aVar;
        this.f4325n = m0Var;
    }

    public static int A(Object obj, long j9) {
        return ((Integer) m1.f4297c.i(obj, j9)).intValue();
    }

    public static long B(Object obj, long j9) {
        return ((Long) m1.f4297c.i(obj, j9)).longValue();
    }

    public static Field L(Class cls, String str) {
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

    public static int R(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void U(int i10, Object obj, k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            k0Var.a(i10, (i) obj);
            return;
        }
        String str = (String) obj;
        m mVar = (m) k0Var.f4283a;
        mVar.f0(i10, 2);
        int i11 = mVar.f4293d;
        byte[] bArr = mVar.f4292c;
        int i12 = mVar.f4294e;
        try {
            int iW = m.W(str.length() * 3);
            int iW2 = m.W(str.length());
            if (iW2 != iW) {
                mVar.g0(p1.b(str));
                int i13 = mVar.f4294e;
                mVar.f4294e = p1.f4308a.t(str, bArr, i13, i11 - i13);
                return;
            }
            int i14 = i12 + iW2;
            mVar.f4294e = i14;
            int iT = p1.f4308a.t(str, bArr, i14, i11 - i14);
            mVar.f4294e = i12;
            mVar.g0((iT - i12) - iW2);
            mVar.f4294e = iT;
        } catch (o1 e3) {
            mVar.f4294e = i12;
            m.f4289f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(b0.f4244a);
            try {
                mVar.g0(bytes.length);
                mVar.Z(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new CodedOutputStream$OutOfSpaceException(e11);
        }
    }

    public static void h(Object obj) {
        if (!p(obj)) {
            throw new IllegalArgumentException(g4.c.h(obj, "Mutating immutable message: "));
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).m();
        }
        return true;
    }

    public static List r(x xVar, long j9) {
        return (List) m1.f4297c.i(xVar, j9);
    }

    public static r0 x(z0 z0Var, t0 t0Var, h0 h0Var, c1 c1Var, q qVar, m0 m0Var) {
        if (z0Var instanceof z0) {
            return y(z0Var, t0Var, h0Var, c1Var, qVar, m0Var);
        }
        z0Var.getClass();
        throw new ClassCastException();
    }

    public static r0 y(z0 z0Var, t0 t0Var, h0 h0Var, c1 c1Var, q qVar, m0 m0Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        int i28;
        int i29;
        Field fieldL;
        int i30;
        char cCharAt9;
        int i31;
        Field fieldL2;
        Field fieldL3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        int i37 = 0;
        boolean z10 = (z0Var.f4339d & 1) != 1;
        String str = z0Var.f4337b;
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
        int iCharAt4 = str.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i40 = iCharAt4 & 8191;
            int i41 = 13;
            while (true) {
                i36 = i39 + 1;
                cCharAt13 = str.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            iCharAt4 = i40 | (cCharAt13 << i41);
            i39 = i36;
        }
        if (iCharAt4 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f4312o;
            i12 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i21 = i42 + 1;
                    cCharAt8 = str.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i21;
                }
                iCharAt5 = i43 | (cCharAt8 << i44);
                i42 = i21;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    cCharAt7 = str.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                iCharAt6 = i46 | (cCharAt7 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            int iCharAt7 = str.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i19 = i48 + 1;
                    cCharAt6 = str.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i19;
                }
                iCharAt7 = i49 | (cCharAt6 << i50);
                i48 = i19;
            }
            int i51 = i48 + 1;
            int iCharAt8 = str.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i18 = i51 + 1;
                    cCharAt5 = str.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i18;
                }
                iCharAt8 = i52 | (cCharAt5 << i53);
                i51 = i18;
            }
            int i54 = i51 + 1;
            iCharAt = str.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i17 = i54 + 1;
                    cCharAt4 = str.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i17;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i17;
            }
            int i57 = i54 + 1;
            iCharAt2 = str.charAt(i54);
            if (iCharAt2 >= 55296) {
                int i58 = iCharAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i16 = i57 + 1;
                    cCharAt3 = str.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i16;
                }
                iCharAt2 = i58 | (cCharAt3 << i59);
                i57 = i16;
            }
            int i60 = i57 + 1;
            int iCharAt9 = str.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i15 = i60 + 1;
                    cCharAt2 = str.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i15;
                }
                iCharAt9 = i61 | (cCharAt2 << i62);
                i60 = i15;
            }
            int i63 = i60 + 1;
            iCharAt3 = str.charAt(i60);
            if (iCharAt3 >= 55296) {
                int i64 = iCharAt3 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i14 = i65 + 1;
                    cCharAt = str.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i65 = i14;
                }
                iCharAt3 = i64 | (cCharAt << i66);
                i63 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i11 = (iCharAt5 * 2) + iCharAt6;
            i12 = iCharAt7;
            i13 = iCharAt8;
            iArr = iArr2;
            i37 = iCharAt5;
            i39 = i63;
        }
        Unsafe unsafe = f4313p;
        Object[] objArr = z0Var.f4338c;
        Class<?> cls = z0Var.f4336a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i67 = iCharAt2 + iCharAt3;
        int i68 = i67;
        int i69 = iCharAt3;
        int i70 = 0;
        int i71 = 0;
        while (i39 < length) {
            int i72 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            int i73 = i37;
            if (iCharAt10 >= 55296) {
                int i74 = iCharAt10 & 8191;
                int i75 = i72;
                int i76 = 13;
                while (true) {
                    i35 = i75 + 1;
                    cCharAt12 = str.charAt(i75);
                    i22 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i35;
                    length = i22;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i23 = i35;
            } else {
                i22 = length;
                i23 = i72;
            }
            int i77 = i23 + 1;
            int iCharAt11 = str.charAt(i23);
            if (iCharAt11 >= 55296) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i33 = i79 + 1;
                    cCharAt11 = str.charAt(i79);
                    i34 = i78;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 = i34 | ((cCharAt11 & 8191) << i80);
                    i80 += 13;
                    i79 = i33;
                }
                iCharAt11 = i34 | (cCharAt11 << i80);
                i24 = i33;
            } else {
                i24 = i77;
            }
            int i81 = iCharAt10;
            int i82 = iCharAt11 & 255;
            int i83 = i12;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            int i84 = i13;
            if (i82 >= 51) {
                int i85 = i24 + 1;
                int iCharAt12 = str.charAt(i24);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = 13;
                    while (true) {
                        i32 = i85 + 1;
                        cCharAt10 = str.charAt(i85);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i32;
                        c10 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i87);
                    i85 = i32;
                }
                int i88 = i82 - 51;
                int i89 = iCharAt12;
                if (i88 == 9 || i88 == 17) {
                    objArr2[a1.b.e(i70, 3, 2, 1)] = objArr[i11];
                    i11++;
                } else if (i88 == 12 && !z10) {
                    objArr2[a1.b.e(i70, 3, 2, 1)] = objArr[i11];
                    i11++;
                }
                int i90 = i89 * 2;
                Object obj = objArr[i90];
                if (obj instanceof Field) {
                    fieldL2 = (Field) obj;
                } else {
                    fieldL2 = L(cls, (String) obj);
                    objArr[i90] = fieldL2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldL2);
                int i91 = i90 + 1;
                Object obj2 = objArr[i91];
                if (obj2 instanceof Field) {
                    fieldL3 = (Field) obj2;
                } else {
                    fieldL3 = L(cls, (String) obj2);
                    objArr[i91] = fieldL3;
                }
                iArr = iArr;
                i26 = i85;
                i70 = i70;
                z10 = z10;
                objArr2 = objArr2;
                i28 = i11;
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL3);
                i29 = iObjectFieldOffset3;
                i27 = 0;
            } else {
                int i92 = i11 + 1;
                Field fieldL4 = L(cls, (String) objArr[i11]);
                if (i82 == 9 || i82 == 17) {
                    objArr2[a1.b.e(i70, 3, 2, 1)] = fieldL4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i31 = i11 + 2;
                        objArr2[a1.b.e(i70, 3, 2, 1)] = objArr[i92];
                    } else if (i82 != 12 && i82 != 30 && i82 != 44) {
                        if (i82 == 50) {
                            int i93 = i69 + 1;
                            iArr[i69] = i70;
                            int i94 = (i70 / 3) * 2;
                            int i95 = i11 + 2;
                            objArr2[i94] = objArr[i92];
                            if ((iCharAt11 & 2048) != 0) {
                                i25 = i11 + 3;
                                objArr2[i94 + 1] = objArr[i95];
                                z10 = z10;
                                iArr = iArr;
                                i69 = i93;
                            } else {
                                z10 = z10;
                                i25 = i95;
                                i69 = i93;
                                iArr = iArr;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                        if ((iCharAt11 & 4096) == 4096 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i24;
                            i27 = 0;
                        } else {
                            i26 = i24 + 1;
                            int iCharAt13 = str.charAt(i24);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i30 = i26 + 1;
                                    cCharAt9 = str.charAt(i26);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i26 = i30;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                                i26 = i30;
                            }
                            int i98 = (iCharAt13 / 32) + (i73 * 2);
                            Object obj3 = objArr[i98];
                            if (obj3 instanceof Field) {
                                fieldL = (Field) obj3;
                            } else {
                                fieldL = L(cls, (String) obj3);
                                objArr[i98] = fieldL;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL);
                            i27 = iCharAt13 % 32;
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i68] = iObjectFieldOffset;
                            i68++;
                        }
                        i28 = i25;
                        i29 = iObjectFieldOffset;
                    } else if (!z10) {
                        i31 = i11 + 2;
                        objArr2[a1.b.e(i70, 3, 2, 1)] = objArr[i92];
                    }
                    i25 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i24;
                        i27 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i24;
                        i27 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                    i28 = i25;
                    i29 = iObjectFieldOffset;
                }
                i25 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i24;
                    i27 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i24;
                    i27 = 0;
                }
                if (i82 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
                i28 = i25;
                i29 = iObjectFieldOffset;
            }
            int i99 = i70 + 1;
            iArr3[i70] = i81;
            int i100 = i70 + 2;
            int i101 = iObjectFieldOffset2;
            iArr3[i99] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i82 << 20) | i29;
            iArr3[i100] = (i27 << 20) | i101;
            int i102 = i28;
            i70 += 3;
            str = str;
            i11 = i102;
            objArr2 = objArr2;
            i39 = i26;
            z10 = z10;
            i37 = i73;
            i12 = i83;
            length = i22;
            iArr = iArr;
            i13 = i84;
        }
        return new r0(iArr3, objArr2, i12, i13, z0Var.f4336a, z10, iArr, iCharAt3, i67, t0Var, h0Var, c1Var, qVar, m0Var);
    }

    public static long z(int i10) {
        return i10 & 1048575;
    }

    public final void C(long j9, int i10, Object obj) {
        Unsafe unsafe = f4313p;
        Object objK = k(i10);
        Object object = unsafe.getObject(obj, j9);
        this.f4325n.getClass();
        if (!((l0) object).A) {
            l0 l0VarD = l0.B.d();
            m0.b(l0VarD, object);
            unsafe.putObject(obj, j9, l0VarD);
        }
        a1.b.x(objK);
        throw null;
    }

    public final int D(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j9, int i17, d dVar) throws InvalidProtocolBufferException {
        int i18;
        Unsafe unsafe = f4313p;
        long j10 = this.f4314a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Double.valueOf(Double.longBitsToDouble(va.a.w(bArr, i10))));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Float.valueOf(Float.intBitsToFloat(va.a.v(bArr, i10))));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i20;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iE = va.a.E(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Long.valueOf(dVar.f4253b));
                unsafe.putInt(obj, j10, i13);
                return iE;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iC = va.a.C(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Integer.valueOf(dVar.f4252a));
                unsafe.putInt(obj, j10, i13);
                return iC;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Long.valueOf(va.a.w(bArr, i10)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j10, i13);
                return i21;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j9, Integer.valueOf(va.a.v(bArr, i10)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j10, i13);
                return i22;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iE2 = va.a.E(bArr, i10, dVar);
                unsafe.putObject(obj, j9, Boolean.valueOf(dVar.f4253b != 0));
                unsafe.putInt(obj, j10, i13);
                return iE2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iC2 = va.a.C(bArr, i10, dVar);
                int i23 = dVar.f4252a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j9, RuntimeVersion.SUFFIX);
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!p1.f4308a.G(bArr, iC2, iC2 + i23)) {
                            throw InvalidProtocolBufferException.b();
                        }
                    }
                    unsafe.putObject(obj, j9, new String(bArr, iC2, i23, b0.f4244a));
                    iC2 += i23;
                }
                unsafe.putInt(obj, j10, i13);
                return iC2;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objW = w(obj, i13, i17);
                    int iV = va.a.V(objW, l(i17), bArr, i18, i11, dVar);
                    Q(obj, i13, i17, objW);
                    return iV;
                }
                return i18;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int iU = va.a.u(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, dVar.f4254c);
                    unsafe.putInt(obj, j10, i13);
                    return iU;
                }
                return i18;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int iC3 = va.a.C(bArr, i18, dVar);
                    int i24 = dVar.f4252a;
                    j(i17);
                    unsafe.putObject(obj, j9, Integer.valueOf(i24));
                    unsafe.putInt(obj, j10, i13);
                    return iC3;
                }
                return i18;
            case 66:
                i18 = i10;
                if (i14 == 0) {
                    int iC4 = va.a.C(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, Integer.valueOf(androidx.datastore.preferences.protobuf.j.e(dVar.f4252a)));
                    unsafe.putInt(obj, j10, i13);
                    return iC4;
                }
                return i18;
            case 67:
                i18 = i10;
                if (i14 == 0) {
                    int iE3 = va.a.E(bArr, i18, dVar);
                    unsafe.putObject(obj, j9, Long.valueOf(androidx.datastore.preferences.protobuf.j.g(dVar.f4253b)));
                    unsafe.putInt(obj, j10, i13);
                    return iE3;
                }
                return i18;
            case 68:
                if (i14 == 3) {
                    Object objW2 = w(obj, i13, i17);
                    int iE4 = ((r0) l(i17)).E(objW2, bArr, i10, i11, (i12 & (-8)) | 4, dVar);
                    dVar.f4254c = objW2;
                    Q(obj, i13, i17, objW2);
                    return iE4;
                }
            default:
                return i10;
        }
    }

    public final int E(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.d r35) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.E(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.d):int");
    }

    public final void F(Object obj, byte[] bArr, int i10, int i11, d dVar) throws InvalidProtocolBufferException {
        int i12;
        int iO;
        Object obj2;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        byte b7;
        Object obj3;
        byte[] bArr2;
        int i17;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        Unsafe unsafe2;
        int i18;
        Object obj5;
        Object obj6;
        int i19;
        int i20;
        int i21;
        r0 r0Var = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i22 = i11;
        d dVar2 = dVar;
        h(obj7);
        Unsafe unsafe3 = f4313p;
        int iE = i10;
        int i23 = -1;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (iE < i22) {
            int iB = iE + 1;
            int i27 = bArr5[iE];
            if (i27 < 0) {
                iB = va.a.B(i27, bArr5, iB, dVar2);
                i27 = dVar2.f4252a;
            }
            i23 = i27 >>> 3;
            int i28 = i27 & 7;
            int i29 = r0Var.f4317d;
            int i30 = r0Var.f4316c;
            if (i23 > i23) {
                iO = (i23 < i30 || i23 > i29) ? -1 : r0Var.O(i23, i24 / 3);
                i12 = 0;
            } else if (i23 < i30 || i23 > i29) {
                i12 = 0;
                iO = -1;
            } else {
                i12 = 0;
                iO = r0Var.O(i23, 0);
            }
            i24 = iO;
            if (i24 == -1) {
                int i31 = iB;
                obj2 = obj7;
                i13 = i31;
                unsafe = unsafe3;
                i14 = i27;
                i15 = i23;
                i16 = i12;
            } else {
                int[] iArr = r0Var.f4314a;
                int i32 = iArr[i24 + 1];
                int iR = R(i32);
                int i33 = i27;
                long j9 = i32 & 1048575;
                if (iR <= 17) {
                    int i34 = iArr[i24 + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i25) {
                        int i37 = 1048575;
                        if (i25 != 1048575) {
                            unsafe3.putInt(obj7, i25, i26);
                            i37 = 1048575;
                        }
                        if (i36 != i37) {
                            i26 = unsafe3.getInt(obj7, i36);
                        }
                        i25 = i36;
                    }
                    switch (iR) {
                        case 0:
                            unsafe3 = unsafe3;
                            bArr2 = bArr5;
                            b7 = -1;
                            i17 = iB;
                            if (i28 != 1) {
                                obj3 = obj7;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                m1.f4297c.m(obj7, j9, Double.longBitsToDouble(va.a.w(bArr2, i17)));
                                iE = i17 + 8;
                                i26 |= i35;
                                bArr5 = bArr2;
                                unsafe3 = unsafe3;
                                i22 = i11;
                            }
                            break;
                        case 1:
                            unsafe3 = unsafe3;
                            bArr2 = bArr5;
                            b7 = -1;
                            i17 = iB;
                            if (i28 != 5) {
                                obj3 = obj7;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                m1.f4297c.n(obj7, j9, Float.intBitsToFloat(va.a.v(bArr2, i17)));
                                iE = i17 + 4;
                                i26 |= i35;
                                bArr5 = bArr2;
                                unsafe3 = unsafe3;
                                i22 = i11;
                            }
                            break;
                        case 2:
                        case 3:
                            bArr3 = bArr5;
                            b7 = -1;
                            i17 = iB;
                            if (i28 != 0) {
                                unsafe3 = unsafe3;
                                obj3 = obj7;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                int iE2 = va.a.E(bArr3, i17, dVar2);
                                unsafe3.putLong(obj7, j9, dVar2.f4253b);
                                i26 |= i35;
                                iE = iE2;
                                bArr5 = bArr3;
                                i22 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            bArr3 = bArr5;
                            b7 = -1;
                            i17 = iB;
                            if (i28 != 0) {
                                unsafe3 = unsafe3;
                                obj3 = obj7;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                int iC = va.a.C(bArr3, i17, dVar2);
                                unsafe3.putInt(obj7, j9, dVar2.f4252a);
                                i26 |= i35;
                                iE = iC;
                                bArr5 = bArr3;
                                i22 = i11;
                            }
                            break;
                        case 5:
                        case 14:
                            Object obj8 = obj7;
                            bArr3 = bArr5;
                            b7 = -1;
                            Unsafe unsafe4 = unsafe3;
                            int i38 = iB;
                            if (i28 != 1) {
                                i17 = i38;
                                unsafe3 = unsafe4;
                                obj3 = obj8;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                long jW = va.a.w(bArr3, i38);
                                unsafe3 = unsafe4;
                                obj7 = obj8;
                                unsafe3.putLong(obj7, j9, jW);
                                iE = i38 + 8;
                                i26 |= i35;
                                bArr5 = bArr3;
                                i22 = i11;
                            }
                            break;
                        case 6:
                        case 13:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b7 = -1;
                            unsafe2 = unsafe3;
                            i18 = iB;
                            if (i28 != 5) {
                                Unsafe unsafe5 = unsafe2;
                                i17 = i18;
                                obj3 = obj4;
                                unsafe3 = unsafe5;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                unsafe2.putInt(obj4, j9, va.a.v(bArr4, i18));
                                iE = i18 + 4;
                                i26 |= i35;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i22 = i11;
                            }
                            break;
                        case 7:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b7 = -1;
                            unsafe2 = unsafe3;
                            i18 = iB;
                            if (i28 != 0) {
                                Unsafe unsafe6 = unsafe2;
                                i17 = i18;
                                obj3 = obj4;
                                unsafe3 = unsafe6;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                iE = va.a.E(bArr4, i18, dVar2);
                                m1.f4297c.k(obj4, j9, dVar2.f4253b != 0);
                                i26 |= i35;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i22 = i11;
                            }
                            break;
                        case 8:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b7 = -1;
                            unsafe2 = unsafe3;
                            i18 = iB;
                            if (i28 != 2) {
                                Unsafe unsafe7 = unsafe2;
                                i17 = i18;
                                obj3 = obj4;
                                unsafe3 = unsafe7;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                iE = (i32 & 536870912) == 0 ? va.a.y(bArr4, i18, dVar2) : va.a.z(bArr4, i18, dVar2);
                                unsafe2.putObject(obj4, j9, dVar2.f4254c);
                                i26 |= i35;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i22 = i11;
                            }
                            break;
                        case 9:
                            obj4 = obj7;
                            b7 = -1;
                            if (i28 != 2) {
                                Unsafe unsafe8 = unsafe3;
                                obj3 = obj4;
                                unsafe3 = unsafe8;
                                i17 = iB;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                Unsafe unsafe9 = unsafe3;
                                Object objV = r0Var.v(obj4, i24);
                                byte[] bArr6 = bArr5;
                                unsafe2 = unsafe9;
                                int iV = va.a.V(objV, r0Var.l(i24), bArr6, iB, i22, dVar2);
                                bArr4 = bArr6;
                                r0Var.P(obj4, i24, objV);
                                i26 |= i35;
                                iE = iV;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i22 = i11;
                            }
                            break;
                        case 10:
                            obj5 = obj7;
                            b7 = -1;
                            if (i28 != 2) {
                                obj3 = obj5;
                                i17 = iB;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                iE = va.a.u(bArr5, iB, dVar2);
                                unsafe3.putObject(obj5, j9, dVar2.f4254c);
                                i26 |= i35;
                                i24 = i24;
                                i23 = i23;
                                obj7 = obj5;
                            }
                            break;
                        case 12:
                            obj5 = obj7;
                            b7 = -1;
                            if (i28 != 0) {
                                obj3 = obj5;
                                i17 = iB;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                iE = va.a.C(bArr5, iB, dVar2);
                                unsafe3.putInt(obj5, j9, dVar2.f4252a);
                                i26 |= i35;
                                i24 = i24;
                                i23 = i23;
                                obj7 = obj5;
                            }
                            break;
                        case 15:
                            obj5 = obj7;
                            b7 = -1;
                            if (i28 != 0) {
                                obj3 = obj5;
                                i17 = iB;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                iE = va.a.C(bArr5, iB, dVar2);
                                unsafe3.putInt(obj5, j9, androidx.datastore.preferences.protobuf.j.e(dVar2.f4252a));
                                i26 |= i35;
                                i24 = i24;
                                i23 = i23;
                                obj7 = obj5;
                            }
                            break;
                        case 16:
                            if (i28 != 0) {
                                b7 = -1;
                                obj3 = obj7;
                                i17 = iB;
                                i14 = i33 == true ? 1 : 0;
                                obj2 = obj3;
                                i13 = i17;
                                unsafe = unsafe3;
                                i15 = i23;
                                i16 = i24;
                            } else {
                                int iE3 = va.a.E(bArr5, iB, dVar2);
                                unsafe3.putLong(obj7, j9, androidx.datastore.preferences.protobuf.j.g(dVar2.f4253b));
                                i26 |= i35;
                                i24 = i24;
                                i23 = i23;
                                iE = iE3;
                            }
                            break;
                        default:
                            unsafe3 = unsafe3;
                            obj3 = obj7;
                            b7 = -1;
                            i17 = iB;
                            i14 = i33 == true ? 1 : 0;
                            obj2 = obj3;
                            i13 = i17;
                            unsafe = unsafe3;
                            i15 = i23;
                            i16 = i24;
                            break;
                    }
                } else {
                    Object obj9 = obj7;
                    Unsafe unsafe10 = unsafe3;
                    byte[] bArr7 = bArr5;
                    int i39 = iB;
                    if (iR != 27) {
                        i14 = i33 == true ? 1 : 0;
                        i19 = i39;
                        if (iR <= 49) {
                            unsafe = unsafe10;
                            i15 = i23;
                            int i40 = i25;
                            int i41 = i26;
                            int iG = r0Var.G(obj, bArr, i19, i11, i14 == true ? 1 : 0, i28, i24, i32, iR, j9, dVar);
                            i16 = i24;
                            if (iG != i19) {
                                bArr5 = bArr;
                                i22 = i11;
                                dVar2 = dVar;
                                obj7 = obj;
                                iE = iG;
                                i24 = i16;
                                i25 = i40;
                                i26 = i41;
                                i23 = i15;
                                unsafe3 = unsafe;
                            } else {
                                i13 = iG;
                                i25 = i40;
                                i26 = i41;
                                obj2 = obj;
                            }
                        } else {
                            unsafe = unsafe10;
                            i20 = i25;
                            i15 = i23;
                            obj6 = obj;
                            i16 = i24;
                            i21 = i26;
                            if (iR != 50) {
                                int iD = r0Var.D(obj6, bArr, i19, i11, i14 == true ? 1 : 0, i15, i28, i32, iR, j9, i16, dVar);
                                obj2 = obj6;
                                if (iD != i19) {
                                    r0Var = this;
                                    i22 = i11;
                                    dVar2 = dVar;
                                    obj7 = obj2;
                                    iE = iD;
                                    i24 = i16;
                                    i25 = i20;
                                    i26 = i21;
                                    i23 = i15;
                                    unsafe3 = unsafe;
                                    bArr5 = bArr;
                                } else {
                                    i13 = iD;
                                    i25 = i20;
                                    i26 = i21;
                                }
                            } else if (i28 == 2) {
                                r0Var.C(j9, i16, obj6);
                                throw null;
                            }
                        }
                    } else if (i28 == 2) {
                        a0 a0VarMutableCopyWithCapacity = (a0) unsafe10.getObject(obj9, j9);
                        if (!((b) a0VarMutableCopyWithCapacity).A) {
                            int size = a0VarMutableCopyWithCapacity.size();
                            a0VarMutableCopyWithCapacity = a0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe10.putObject(obj9, j9, a0VarMutableCopyWithCapacity);
                        }
                        int iX = va.a.x(r0Var.l(i24), i33 == true ? 1 : 0, bArr7, i39, i11, a0VarMutableCopyWithCapacity, dVar2);
                        obj7 = obj;
                        bArr5 = bArr;
                        dVar2 = dVar;
                        iE = iX;
                        unsafe3 = unsafe10;
                        i22 = i11;
                    } else {
                        obj6 = obj;
                        i14 = i33 == true ? 1 : 0;
                        unsafe = unsafe10;
                        i19 = i39;
                        i20 = i25;
                        i21 = i26;
                        i15 = i23;
                        i16 = i24;
                    }
                    i13 = i19;
                    obj2 = obj6;
                    i25 = i20;
                    i26 = i21;
                }
            }
            x xVar = (x) obj2;
            d1 d1VarC = xVar.unknownFields;
            if (d1VarC == d1.f4255f) {
                d1VarC = d1.c();
                xVar.unknownFields = d1VarC;
            }
            int iA = va.a.A(i14 == true ? 1 : 0, bArr, i13, i11, d1VarC, dVar);
            bArr5 = bArr;
            dVar2 = dVar;
            i22 = i11;
            obj7 = obj2;
            i24 = i16;
            i23 = i15;
            unsafe3 = unsafe;
            iE = iA;
            r0Var = this;
        }
        Unsafe unsafe11 = unsafe3;
        Object obj10 = obj7;
        int i42 = i22;
        int i43 = i25;
        int i44 = i26;
        if (i43 != 1048575) {
            unsafe11.putInt(obj10, i43, i44);
        }
        if (iE != i42) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int G(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j9, int i15, long j10, d dVar) throws InvalidProtocolBufferException {
        int iD;
        Unsafe unsafe = f4313p;
        a0 a0VarMutableCopyWithCapacity = (a0) unsafe.getObject(obj, j10);
        if (!((b) a0VarMutableCopyWithCapacity).A) {
            int size = a0VarMutableCopyWithCapacity.size();
            a0VarMutableCopyWithCapacity = a0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, a0VarMutableCopyWithCapacity);
        }
        a0 a0Var = a0VarMutableCopyWithCapacity;
        switch (i15) {
            case TYPE_SINT64_VALUE:
            case 35:
                if (i13 == 2) {
                    n nVar = (n) a0Var;
                    int iC = va.a.C(bArr, i10, dVar);
                    int i16 = dVar.f4252a + iC;
                    while (iC < i16) {
                        nVar.addDouble(Double.longBitsToDouble(va.a.w(bArr, iC)));
                        iC += 8;
                    }
                    if (iC == i16) {
                        return iC;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 1) {
                    n nVar2 = (n) a0Var;
                    nVar2.addDouble(Double.longBitsToDouble(va.a.w(bArr, i10)));
                    i10 += 8;
                    while (i10 < i11) {
                        int iC2 = va.a.C(bArr, i10, dVar);
                        if (i12 == dVar.f4252a) {
                            nVar2.addDouble(Double.longBitsToDouble(va.a.w(bArr, iC2)));
                            i10 = iC2 + 8;
                        }
                    }
                }
                return i10;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
            case 36:
                if (i13 == 2) {
                    t tVar = (t) a0Var;
                    int iC3 = va.a.C(bArr, i10, dVar);
                    int i17 = dVar.f4252a + iC3;
                    while (iC3 < i17) {
                        tVar.addFloat(Float.intBitsToFloat(va.a.v(bArr, iC3)));
                        iC3 += 4;
                    }
                    if (iC3 == i17) {
                        return iC3;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 5) {
                    t tVar2 = (t) a0Var;
                    tVar2.addFloat(Float.intBitsToFloat(va.a.v(bArr, i10)));
                    int i18 = i10 + 4;
                    while (i18 < i11) {
                        int iC4 = va.a.C(bArr, i18, dVar);
                        if (i12 != dVar.f4252a) {
                            return i18;
                        }
                        tVar2.addFloat(Float.intBitsToFloat(va.a.v(bArr, iC4)));
                        i18 = iC4 + 4;
                    }
                    return i18;
                }
                return i10;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case 37:
            case 38:
                if (i13 == 2) {
                    i0 i0Var = (i0) a0Var;
                    int iC5 = va.a.C(bArr, i10, dVar);
                    int i19 = dVar.f4252a + iC5;
                    while (iC5 < i19) {
                        iC5 = va.a.E(bArr, iC5, dVar);
                        i0Var.addLong(dVar.f4253b);
                    }
                    if (iC5 == i19) {
                        return iC5;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    i0 i0Var2 = (i0) a0Var;
                    int iE = va.a.E(bArr, i10, dVar);
                    i0Var2.addLong(dVar.f4253b);
                    while (iE < i11) {
                        int iC6 = va.a.C(bArr, iE, dVar);
                        if (i12 != dVar.f4252a) {
                            return iE;
                        }
                        iE = va.a.E(bArr, iC6, dVar);
                        i0Var2.addLong(dVar.f4253b);
                    }
                    return iE;
                }
                return i10;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
            case 29:
            case 39:
            case 43:
                if (i13 != 2) {
                    if (i13 == 0) {
                        return va.a.D(i12, bArr, i10, i11, a0Var, dVar);
                    }
                    return i10;
                }
                y yVar = (y) a0Var;
                int iC7 = va.a.C(bArr, i10, dVar);
                int i20 = dVar.f4252a + iC7;
                while (iC7 < i20) {
                    iC7 = va.a.C(bArr, iC7, dVar);
                    yVar.addInt(dVar.f4252a);
                }
                if (iC7 == i20) {
                    return iC7;
                }
                throw InvalidProtocolBufferException.g();
            case 23:
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
            case 40:
            case 46:
                if (i13 == 2) {
                    i0 i0Var3 = (i0) a0Var;
                    int iC8 = va.a.C(bArr, i10, dVar);
                    int i21 = dVar.f4252a + iC8;
                    while (iC8 < i21) {
                        i0Var3.addLong(va.a.w(bArr, iC8));
                        iC8 += 8;
                    }
                    if (iC8 == i21) {
                        return iC8;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 1) {
                    i0 i0Var4 = (i0) a0Var;
                    i0Var4.addLong(va.a.w(bArr, i10));
                    int i22 = i10 + 8;
                    while (i22 < i11) {
                        int iC9 = va.a.C(bArr, i22, dVar);
                        if (i12 != dVar.f4252a) {
                            return i22;
                        }
                        i0Var4.addLong(va.a.w(bArr, iC9));
                        i22 = iC9 + 8;
                    }
                    return i22;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    y yVar2 = (y) a0Var;
                    int iC10 = va.a.C(bArr, i10, dVar);
                    int i23 = dVar.f4252a + iC10;
                    while (iC10 < i23) {
                        yVar2.addInt(va.a.v(bArr, iC10));
                        iC10 += 4;
                    }
                    if (iC10 == i23) {
                        return iC10;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 5) {
                    y yVar3 = (y) a0Var;
                    yVar3.addInt(va.a.v(bArr, i10));
                    int i24 = i10 + 4;
                    while (i24 < i11) {
                        int iC11 = va.a.C(bArr, i24, dVar);
                        if (i12 != dVar.f4252a) {
                            return i24;
                        }
                        yVar3.addInt(va.a.v(bArr, iC11));
                        i24 = iC11 + 4;
                    }
                    return i24;
                }
                return i10;
            case 25:
            case 42:
                if (i13 == 2) {
                    e eVar = (e) a0Var;
                    int iC12 = va.a.C(bArr, i10, dVar);
                    int i25 = dVar.f4252a + iC12;
                    while (iC12 < i25) {
                        iC12 = va.a.E(bArr, iC12, dVar);
                        eVar.addBoolean(dVar.f4253b != 0);
                    }
                    if (iC12 == i25) {
                        return iC12;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    e eVar2 = (e) a0Var;
                    int iE2 = va.a.E(bArr, i10, dVar);
                    eVar2.addBoolean(dVar.f4253b != 0);
                    while (iE2 < i11) {
                        int iC13 = va.a.C(bArr, iE2, dVar);
                        if (i12 != dVar.f4252a) {
                            return iE2;
                        }
                        iE2 = va.a.E(bArr, iC13, dVar);
                        eVar2.addBoolean(dVar.f4253b != 0);
                    }
                    return iE2;
                }
                return i10;
            case RuntimeVersion.MINOR:
                if (i13 == 2) {
                    if ((j9 & 536870912) == 0) {
                        int iC14 = va.a.C(bArr, i10, dVar);
                        int i26 = dVar.f4252a;
                        if (i26 < 0) {
                            throw InvalidProtocolBufferException.e();
                        }
                        if (i26 == 0) {
                            a0Var.add(RuntimeVersion.SUFFIX);
                        } else {
                            a0Var.add(new String(bArr, iC14, i26, b0.f4244a));
                            iC14 += i26;
                        }
                        while (iC14 < i11) {
                            int iC15 = va.a.C(bArr, iC14, dVar);
                            if (i12 != dVar.f4252a) {
                                return iC14;
                            }
                            iC14 = va.a.C(bArr, iC15, dVar);
                            int i27 = dVar.f4252a;
                            if (i27 < 0) {
                                throw InvalidProtocolBufferException.e();
                            }
                            if (i27 == 0) {
                                a0Var.add(RuntimeVersion.SUFFIX);
                            } else {
                                a0Var.add(new String(bArr, iC14, i27, b0.f4244a));
                                iC14 += i27;
                            }
                        }
                        return iC14;
                    }
                    int iC16 = va.a.C(bArr, i10, dVar);
                    int i28 = dVar.f4252a;
                    if (i28 < 0) {
                        throw InvalidProtocolBufferException.e();
                    }
                    if (i28 == 0) {
                        a0Var.add(RuntimeVersion.SUFFIX);
                    } else {
                        int i29 = iC16 + i28;
                        if (!p1.f4308a.G(bArr, iC16, i29)) {
                            throw InvalidProtocolBufferException.b();
                        }
                        a0Var.add(new String(bArr, iC16, i28, b0.f4244a));
                        iC16 = i29;
                    }
                    while (iC16 < i11) {
                        int iC17 = va.a.C(bArr, iC16, dVar);
                        if (i12 != dVar.f4252a) {
                            return iC16;
                        }
                        iC16 = va.a.C(bArr, iC17, dVar);
                        int i30 = dVar.f4252a;
                        if (i30 < 0) {
                            throw InvalidProtocolBufferException.e();
                        }
                        if (i30 == 0) {
                            a0Var.add(RuntimeVersion.SUFFIX);
                        } else {
                            int i31 = iC16 + i30;
                            if (!p1.f4308a.G(bArr, iC16, i31)) {
                                throw InvalidProtocolBufferException.b();
                            }
                            a0Var.add(new String(bArr, iC16, i30, b0.f4244a));
                            iC16 = i31;
                        }
                    }
                    return iC16;
                }
                return i10;
            case 27:
                if (i13 == 2) {
                    return va.a.x(l(i14), i12, bArr, i10, i11, a0Var, dVar);
                }
                return i10;
            case 28:
                if (i13 == 2) {
                    int iC18 = va.a.C(bArr, i10, dVar);
                    int i32 = dVar.f4252a;
                    if (i32 < 0) {
                        throw InvalidProtocolBufferException.e();
                    }
                    if (i32 > bArr.length - iC18) {
                        throw InvalidProtocolBufferException.g();
                    }
                    if (i32 == 0) {
                        a0Var.add(i.B);
                    } else {
                        a0Var.add(i.c(iC18, i32, bArr));
                        iC18 += i32;
                    }
                    while (iC18 < i11) {
                        int iC19 = va.a.C(bArr, iC18, dVar);
                        if (i12 != dVar.f4252a) {
                            return iC18;
                        }
                        iC18 = va.a.C(bArr, iC19, dVar);
                        int i33 = dVar.f4252a;
                        if (i33 < 0) {
                            throw InvalidProtocolBufferException.e();
                        }
                        if (i33 > bArr.length - iC18) {
                            throw InvalidProtocolBufferException.g();
                        }
                        if (i33 == 0) {
                            a0Var.add(i.B);
                        } else {
                            a0Var.add(i.c(iC18, i33, bArr));
                            iC18 += i33;
                        }
                    }
                    return iC18;
                }
                return i10;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iD = va.a.D(i12, bArr, i10, i11, a0Var, dVar);
                    }
                    return i10;
                }
                y yVar4 = (y) a0Var;
                iD = va.a.C(bArr, i10, dVar);
                int i34 = dVar.f4252a + iD;
                while (iD < i34) {
                    iD = va.a.C(bArr, iD, dVar);
                    yVar4.addInt(dVar.f4252a);
                }
                if (iD != i34) {
                    throw InvalidProtocolBufferException.g();
                }
                j(i14);
                Class cls = b1.f4246a;
                return iD;
            case 33:
            case 47:
                if (i13 == 2) {
                    y yVar5 = (y) a0Var;
                    int iC20 = va.a.C(bArr, i10, dVar);
                    int i35 = dVar.f4252a + iC20;
                    while (iC20 < i35) {
                        iC20 = va.a.C(bArr, iC20, dVar);
                        yVar5.addInt(androidx.datastore.preferences.protobuf.j.e(dVar.f4252a));
                    }
                    if (iC20 == i35) {
                        return iC20;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    y yVar6 = (y) a0Var;
                    int iC21 = va.a.C(bArr, i10, dVar);
                    yVar6.addInt(androidx.datastore.preferences.protobuf.j.e(dVar.f4252a));
                    while (iC21 < i11) {
                        int iC22 = va.a.C(bArr, iC21, dVar);
                        if (i12 != dVar.f4252a) {
                            return iC21;
                        }
                        iC21 = va.a.C(bArr, iC22, dVar);
                        yVar6.addInt(androidx.datastore.preferences.protobuf.j.e(dVar.f4252a));
                    }
                    return iC21;
                }
                return i10;
            case 34:
            case 48:
                if (i13 == 2) {
                    i0 i0Var5 = (i0) a0Var;
                    int iC23 = va.a.C(bArr, i10, dVar);
                    int i36 = dVar.f4252a + iC23;
                    while (iC23 < i36) {
                        iC23 = va.a.E(bArr, iC23, dVar);
                        i0Var5.addLong(androidx.datastore.preferences.protobuf.j.g(dVar.f4253b));
                    }
                    if (iC23 == i36) {
                        return iC23;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                if (i13 == 0) {
                    i0 i0Var6 = (i0) a0Var;
                    int iE3 = va.a.E(bArr, i10, dVar);
                    i0Var6.addLong(androidx.datastore.preferences.protobuf.j.g(dVar.f4253b));
                    while (iE3 < i11) {
                        int iC24 = va.a.C(bArr, iE3, dVar);
                        if (i12 != dVar.f4252a) {
                            return iE3;
                        }
                        iE3 = va.a.E(bArr, iC24, dVar);
                        i0Var6.addLong(androidx.datastore.preferences.protobuf.j.g(dVar.f4253b));
                    }
                    return iE3;
                }
                return i10;
            case 49:
                if (i13 == 3) {
                    a1 a1VarL = l(i14);
                    int i37 = (i12 & (-8)) | 4;
                    Object objNewInstance = a1VarL.newInstance();
                    r0 r0Var = (r0) a1VarL;
                    int iE4 = r0Var.E(objNewInstance, bArr, i10, i11, i37, dVar);
                    dVar.f4254c = objNewInstance;
                    a1VarL.makeImmutable(objNewInstance);
                    dVar.f4254c = objNewInstance;
                    a0Var.add(objNewInstance);
                    while (iE4 < i11) {
                        int iC25 = va.a.C(bArr, iE4, dVar);
                        if (i12 != dVar.f4252a) {
                            return iE4;
                        }
                        Object objNewInstance2 = a1VarL.newInstance();
                        iE4 = r0Var.E(objNewInstance2, bArr, iC25, i11, i37, dVar);
                        dVar.f4254c = objNewInstance2;
                        a1VarL.makeImmutable(objNewInstance2);
                        dVar.f4254c = objNewInstance2;
                        a0Var.add(objNewInstance2);
                    }
                    return iE4;
                }
                return i10;
            default:
                return i10;
        }
    }

    public final void H(Object obj, long j9, l lVar, a1 a1Var, p pVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        List listC = this.l.c(obj, j9);
        androidx.datastore.preferences.protobuf.j jVar = lVar.f4284a;
        int i10 = lVar.f4285b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object objNewInstance = a1Var.newInstance();
            lVar.b(objNewInstance, a1Var, pVar);
            a1Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (jVar.i() || lVar.f4287d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i10);
        lVar.f4287d = iF;
    }

    public final void I(Object obj, int i10, l lVar, a1 a1Var, p pVar) throws InvalidProtocolBufferException {
        int iF;
        List listC = this.l.c(obj, i10 & 1048575);
        androidx.datastore.preferences.protobuf.j jVar = lVar.f4284a;
        int i11 = lVar.f4285b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object objNewInstance = a1Var.newInstance();
            lVar.c(objNewInstance, a1Var, pVar);
            a1Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (jVar.i() || lVar.f4287d != 0) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == i11);
        lVar.f4287d = iF;
    }

    public final void J(Object obj, int i10, l lVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i10) != 0) {
            lVar.v(2);
            m1.p(obj, i10 & 1048575, lVar.f4284a.E());
        } else if (!this.f4319f) {
            m1.p(obj, i10 & 1048575, lVar.e());
        } else {
            lVar.v(2);
            m1.p(obj, i10 & 1048575, lVar.f4284a.D());
        }
    }

    public final void K(Object obj, int i10, l lVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i11 = 536870912 & i10;
        h0 h0Var = this.l;
        if (i11 != 0) {
            lVar.r(h0Var.c(obj, i10 & 1048575), true);
        } else {
            lVar.r(h0Var.c(obj, i10 & 1048575), false);
        }
    }

    public final void M(Object obj, int i10) {
        int i11 = this.f4314a[i10 + 2];
        long j9 = 1048575 & i11;
        if (j9 == 1048575) {
            return;
        }
        m1.n(obj, j9, (1 << (i11 >>> 20)) | m1.f4297c.g(obj, j9));
    }

    public final void N(Object obj, int i10, int i11) {
        m1.n(obj, this.f4314a[i11 + 2] & 1048575, i10);
    }

    public final int O(int i10, int i11) {
        int[] iArr = this.f4314a;
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

    public final void P(Object obj, int i10, Object obj2) {
        f4313p.putObject(obj, S(i10) & 1048575, obj2);
        M(obj, i10);
    }

    public final void Q(Object obj, int i10, int i11, Object obj2) {
        f4313p.putObject(obj, S(i11) & 1048575, obj2);
        N(obj, i10, i11);
    }

    public final int S(int i10) {
        return this.f4314a[i10 + 1];
    }

    public final void T(Object obj, k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f4314a;
        int length = iArr.length;
        Unsafe unsafe = f4313p;
        int i13 = 1048575;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 = i12 + 3) {
            int iS = S(i15);
            int i16 = iArr[i15];
            int iR = R(iS);
            if (iR <= 17) {
                int i17 = iArr[i15 + 2];
                i10 = 1048575;
                int i18 = i17 & 1048575;
                if (i18 != i13) {
                    i14 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i10 = 1048575;
                i11 = 0;
            }
            int i19 = i15;
            long j9 = iS & i10;
            switch (iR) {
                case 0:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        double dE = m1.f4297c.e(obj, j9);
                        m mVar = (m) k0Var.f4283a;
                        mVar.getClass();
                        mVar.c0(i16, Double.doubleToRawLongBits(dE));
                        continue;
                    }
                    break;
                case 1:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        float f3 = m1.f4297c.f(obj, j9);
                        m mVar2 = (m) k0Var.f4283a;
                        mVar2.getClass();
                        mVar2.a0(i16, Float.floatToRawIntBits(f3));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).h0(i16, unsafe.getLong(obj, j9));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).h0(i16, unsafe.getLong(obj, j9));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i20 = unsafe.getInt(obj, j9);
                        m mVar3 = (m) k0Var.f4283a;
                        mVar3.f0(i16, 0);
                        mVar3.e0(i20);
                    }
                    break;
                case 5:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).c0(i16, unsafe.getLong(obj, j9));
                    }
                    break;
                case 6:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).a0(i16, unsafe.getInt(obj, j9));
                    }
                    break;
                case 7:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        boolean zC = m1.f4297c.c(obj, j9);
                        m mVar4 = (m) k0Var.f4283a;
                        mVar4.f0(i16, 0);
                        mVar4.Y(zC ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        U(i16, unsafe.getObject(obj, j9), k0Var);
                    }
                    break;
                case 9:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        k0Var.c(i16, unsafe.getObject(obj, j9), l(i12));
                    }
                    break;
                case 10:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        k0Var.a(i16, (i) unsafe.getObject(obj, j9));
                    }
                    break;
                case 11:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i21 = unsafe.getInt(obj, j9);
                        m mVar5 = (m) k0Var.f4283a;
                        mVar5.f0(i16, 0);
                        mVar5.g0(i21);
                    }
                    break;
                case 12:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i22 = unsafe.getInt(obj, j9);
                        m mVar6 = (m) k0Var.f4283a;
                        mVar6.f0(i16, 0);
                        mVar6.e0(i22);
                    }
                    break;
                case 13:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).a0(i16, unsafe.getInt(obj, j9));
                    }
                    break;
                case 14:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((m) k0Var.f4283a).c0(i16, unsafe.getLong(obj, j9));
                    }
                    break;
                case 15:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i23 = unsafe.getInt(obj, j9);
                        m mVar7 = (m) k0Var.f4283a;
                        mVar7.f0(i16, 0);
                        mVar7.g0((i23 >> 31) ^ (i23 << 1));
                    }
                    break;
                case 16:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        long j10 = unsafe.getLong(obj, j9);
                        ((m) k0Var.f4283a).h0(i16, (j10 << 1) ^ (j10 >> 63));
                    }
                    break;
                case 17:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        k0Var.b(i16, unsafe.getObject(obj, j9), l(i12));
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    i12 = i19;
                    b1.A(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    i12 = i19;
                    b1.E(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    i12 = i19;
                    b1.H(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    i12 = i19;
                    b1.P(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    i12 = i19;
                    b1.G(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 23:
                    i12 = i19;
                    b1.D(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 24:
                    i12 = i19;
                    b1.C(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 25:
                    i12 = i19;
                    b1.y(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case RuntimeVersion.MINOR:
                    i12 = i19;
                    b1.N(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var);
                    break;
                case 27:
                    i12 = i19;
                    b1.I(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, l(i12));
                    break;
                case 28:
                    i12 = i19;
                    b1.z(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var);
                    break;
                case 29:
                    i12 = i19;
                    b1.O(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    break;
                case 30:
                    i12 = i19;
                    b1.B(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 31:
                    i12 = i19;
                    b1.J(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    i12 = i19;
                    b1.K(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 33:
                    i12 = i19;
                    b1.L(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 34:
                    i12 = i19;
                    b1.M(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, false);
                    continue;
                    break;
                case 35:
                    i12 = i19;
                    b1.A(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 36:
                    i12 = i19;
                    b1.E(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 37:
                    i12 = i19;
                    b1.H(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 38:
                    i12 = i19;
                    b1.P(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 39:
                    i12 = i19;
                    b1.G(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 40:
                    i12 = i19;
                    b1.D(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 41:
                    i12 = i19;
                    b1.C(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 42:
                    i12 = i19;
                    b1.y(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 43:
                    i12 = i19;
                    b1.O(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 44:
                    i12 = i19;
                    b1.B(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 45:
                    i12 = i19;
                    b1.J(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 46:
                    i12 = i19;
                    b1.K(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 47:
                    i12 = i19;
                    b1.L(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 48:
                    i12 = i19;
                    b1.M(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, true);
                    break;
                case 49:
                    i12 = i19;
                    b1.F(iArr[i12], (List) unsafe.getObject(obj, j9), k0Var, l(i12));
                    break;
                case 50:
                    i12 = i19;
                    if (unsafe.getObject(obj, j9) != null) {
                        Object objK = k(i12);
                        this.f4325n.getClass();
                        a1.b.x(objK);
                        throw null;
                    }
                    break;
                case 51:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        double dDoubleValue = ((Double) m1.f4297c.i(obj, j9)).doubleValue();
                        m mVar8 = (m) k0Var.f4283a;
                        mVar8.getClass();
                        mVar8.c0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        float fFloatValue = ((Float) m1.f4297c.i(obj, j9)).floatValue();
                        m mVar9 = (m) k0Var.f4283a;
                        mVar9.getClass();
                        mVar9.a0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).h0(i16, B(obj, j9));
                    }
                    break;
                case 54:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).h0(i16, B(obj, j9));
                    }
                    break;
                case 55:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        int iA = A(obj, j9);
                        m mVar10 = (m) k0Var.f4283a;
                        mVar10.f0(i16, 0);
                        mVar10.e0(iA);
                    }
                    break;
                case 56:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).c0(i16, B(obj, j9));
                    }
                    break;
                case 57:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).a0(i16, A(obj, j9));
                    }
                    break;
                case 58:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        boolean zBooleanValue = ((Boolean) m1.f4297c.i(obj, j9)).booleanValue();
                        m mVar11 = (m) k0Var.f4283a;
                        mVar11.f0(i16, 0);
                        mVar11.Y(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        U(i16, unsafe.getObject(obj, j9), k0Var);
                    }
                    break;
                case 60:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        k0Var.c(i16, unsafe.getObject(obj, j9), l(i12));
                    }
                    break;
                case 61:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        k0Var.a(i16, (i) unsafe.getObject(obj, j9));
                    }
                    break;
                case 62:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        int iA2 = A(obj, j9);
                        m mVar12 = (m) k0Var.f4283a;
                        mVar12.f0(i16, 0);
                        mVar12.g0(iA2);
                    }
                    break;
                case 63:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        int iA3 = A(obj, j9);
                        m mVar13 = (m) k0Var.f4283a;
                        mVar13.f0(i16, 0);
                        mVar13.e0(iA3);
                    }
                    break;
                case 64:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).a0(i16, A(obj, j9));
                    }
                    break;
                case 65:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        ((m) k0Var.f4283a).c0(i16, B(obj, j9));
                    }
                    break;
                case 66:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        int iA4 = A(obj, j9);
                        m mVar14 = (m) k0Var.f4283a;
                        mVar14.f0(i16, 0);
                        mVar14.g0((iA4 >> 31) ^ (iA4 << 1));
                    }
                    break;
                case 67:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        long jB = B(obj, j9);
                        ((m) k0Var.f4283a).h0(i16, (jB << 1) ^ (jB >> 63));
                    }
                    break;
                case 68:
                    i12 = i19;
                    if (q(obj, i16, i12)) {
                        k0Var.b(i16, unsafe.getObject(obj, j9), l(i12));
                    }
                    break;
                default:
                    i12 = i19;
                    break;
            }
        }
        ((e1) this.m).getClass();
        ((x) obj).unknownFields.e(k0Var);
    }

    @Override
    public final boolean a(x xVar, x xVar2) {
        int[] iArr = this.f4314a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zX = true;
            if (i10 < length) {
                int iS = S(i10);
                long j9 = iS & 1048575;
                switch (R(iS)) {
                    case 0:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var = m1.f4297c;
                            if (Double.doubleToLongBits(l1Var.e(xVar, j9)) != Double.doubleToLongBits(l1Var.e(xVar2, j9))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var2 = m1.f4297c;
                            if (Float.floatToIntBits(l1Var2.f(xVar, j9)) != Float.floatToIntBits(l1Var2.f(xVar2, j9))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var3 = m1.f4297c;
                            if (l1Var3.h(xVar, j9) != l1Var3.h(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 3:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var4 = m1.f4297c;
                            if (l1Var4.h(xVar, j9) != l1Var4.h(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 4:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var5 = m1.f4297c;
                            if (l1Var5.g(xVar, j9) != l1Var5.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 5:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var6 = m1.f4297c;
                            if (l1Var6.h(xVar, j9) != l1Var6.h(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 6:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var7 = m1.f4297c;
                            if (l1Var7.g(xVar, j9) != l1Var7.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 7:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var8 = m1.f4297c;
                            if (l1Var8.c(xVar, j9) != l1Var8.c(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var9 = m1.f4297c;
                            if (!b1.x(l1Var9.i(xVar, j9), l1Var9.i(xVar2, j9))) {
                                zX = false;
                            }
                        }
                        break;
                    case 9:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var10 = m1.f4297c;
                            if (!b1.x(l1Var10.i(xVar, j9), l1Var10.i(xVar2, j9))) {
                                zX = false;
                            }
                        }
                        break;
                    case 10:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var11 = m1.f4297c;
                            if (!b1.x(l1Var11.i(xVar, j9), l1Var11.i(xVar2, j9))) {
                                zX = false;
                            }
                        }
                        break;
                    case 11:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var12 = m1.f4297c;
                            if (l1Var12.g(xVar, j9) != l1Var12.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 12:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var13 = m1.f4297c;
                            if (l1Var13.g(xVar, j9) != l1Var13.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 13:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var14 = m1.f4297c;
                            if (l1Var14.g(xVar, j9) != l1Var14.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 14:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var15 = m1.f4297c;
                            if (l1Var15.h(xVar, j9) != l1Var15.h(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 15:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var16 = m1.f4297c;
                            if (l1Var16.g(xVar, j9) != l1Var16.g(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 16:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var17 = m1.f4297c;
                            if (l1Var17.h(xVar, j9) != l1Var17.h(xVar2, j9)) {
                                zX = false;
                            }
                        }
                        break;
                    case 17:
                        if (!g(xVar, xVar2, i10)) {
                            zX = false;
                        } else {
                            l1 l1Var18 = m1.f4297c;
                            if (!b1.x(l1Var18.i(xVar, j9), l1Var18.i(xVar2, j9))) {
                                zX = false;
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
                        l1 l1Var19 = m1.f4297c;
                        zX = b1.x(l1Var19.i(xVar, j9), l1Var19.i(xVar2, j9));
                        break;
                    case 50:
                        l1 l1Var20 = m1.f4297c;
                        zX = b1.x(l1Var20.i(xVar, j9), l1Var20.i(xVar2, j9));
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
                        l1 l1Var21 = m1.f4297c;
                        if (l1Var21.g(xVar, j10) != l1Var21.g(xVar2, j10) || !b1.x(l1Var21.i(xVar, j9), l1Var21.i(xVar2, j9))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i10 += 3;
                }
            } else {
                e1 e1Var = (e1) this.m;
                e1Var.getClass();
                d1 d1Var = xVar.unknownFields;
                e1Var.getClass();
                if (d1Var.equals(xVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int b(x xVar) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f4314a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iS = S(i13);
            int i14 = iArr[i13];
            long j9 = 1048575 & iS;
            int i15 = 1237;
            int iHashCode = 37;
            switch (R(iS)) {
                case 0:
                    i10 = i12 * 53;
                    iB = b0.b(Double.doubleToLongBits(m1.f4297c.e(xVar, j9)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(m1.f4297c.f(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = b0.b(m1.f4297c.h(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = b0.b(m1.f4297c.h(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = b0.b(m1.f4297c.h(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = m1.f4297c.c(xVar, j9);
                    Charset charset = b0.f4244a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) m1.f4297c.i(xVar, j9)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = m1.f4297c.i(xVar, j9);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = m1.f4297c.i(xVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = b0.b(m1.f4297c.h(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = m1.f4297c.g(xVar, j9);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = b0.b(m1.f4297c.h(xVar, j9));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = m1.f4297c.i(xVar, j9);
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
                    iB = m1.f4297c.i(xVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = m1.f4297c.i(xVar, j9).hashCode();
                    i12 = iB + i10;
                    break;
                case 51:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(Double.doubleToLongBits(((Double) m1.f4297c.i(xVar, j9)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case 52:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) m1.f4297c.i(xVar, j9)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case 53:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(B(xVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 54:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(B(xVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 55:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 56:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(B(xVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 57:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 58:
                    if (q(xVar, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) m1.f4297c.i(xVar, j9)).booleanValue();
                        Charset charset2 = b0.f4244a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = ((String) m1.f4297c.i(xVar, j9)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = m1.f4297c.i(xVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 61:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = m1.f4297c.i(xVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 63:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(B(xVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = A(xVar, j9);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = b0.b(B(xVar, j9));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (q(xVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = m1.f4297c.i(xVar, j9).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        ((e1) this.m).getClass();
        return xVar.unknownFields.hashCode() + (i12 * 53);
    }

    @Override
    public final int c(x xVar) {
        return this.f4320g ? n(xVar) : m(xVar);
    }

    @Override
    public final void d(Object obj, byte[] bArr, int i10, int i11, d dVar) throws InvalidProtocolBufferException {
        if (this.f4320g) {
            F(obj, bArr, i10, i11, dVar);
        } else {
            E(obj, bArr, i10, i11, 0, dVar);
        }
    }

    @Override
    public final void e(Object obj, l lVar, p pVar) throws Throwable {
        r0 r0Var;
        int i10;
        l lVar2;
        int i11;
        r0 r0Var2 = this;
        Object obj2 = obj;
        l lVar3 = lVar;
        p pVar2 = pVar;
        pVar2.getClass();
        h(obj2);
        c1 c1Var = r0Var2.m;
        int[] iArr = r0Var2.f4321h;
        int i12 = r0Var2.f4323j;
        int i13 = r0Var2.f4322i;
        d1 d1VarA = null;
        while (true) {
            try {
                int iA = lVar3.a();
                int iO = (iA < r0Var2.f4316c || iA > r0Var2.f4317d) ? -1 : r0Var2.O(iA, 0);
                if (iO >= 0) {
                    int iS = r0Var2.S(iO);
                    try {
                        int iR = R(iS);
                        h0 h0Var = r0Var2.l;
                        switch (iR) {
                            case 0:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ = z(iS);
                                lVar2.v(1);
                                Object obj3 = obj2;
                                try {
                                    m1.f4297c.m(obj3, jZ, lVar2.f4284a.s());
                                    obj2 = obj3;
                                    r0Var.M(obj2, iO);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj2 = obj3;
                                    try {
                                        c1Var.getClass();
                                        if (d1VarA == null) {
                                            d1VarA = c1Var.a(obj2);
                                        }
                                        if (!c1Var.b(d1VarA, lVar2)) {
                                            for (i11 = i10; i11 < i12; i11++) {
                                                r0Var.i(iArr[i11], obj2, d1VarA);
                                            }
                                            if (d1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = d1VarA;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj3;
                                }
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 1:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ2 = z(iS);
                                lVar2.v(5);
                                m1.f4297c.n(obj2, jZ2, lVar2.f4284a.w());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 2:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ3 = z(iS);
                                lVar2.v(0);
                                m1.o(obj2, jZ3, lVar2.f4284a.y());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 3:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ4 = z(iS);
                                lVar2.v(0);
                                m1.o(obj2, jZ4, lVar2.f4284a.H());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 4:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ5 = z(iS);
                                lVar2.v(0);
                                m1.n(obj2, jZ5, lVar2.f4284a.x());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 5:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ6 = z(iS);
                                lVar2.v(1);
                                m1.o(obj2, jZ6, lVar2.f4284a.v());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 6:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ7 = z(iS);
                                lVar2.v(5);
                                m1.n(obj2, jZ7, lVar2.f4284a.u());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 7:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ8 = z(iS);
                                lVar2.v(0);
                                m1.f4297c.k(obj2, jZ8, lVar2.f4284a.o());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 8:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                r0Var.J(obj2, iS, lVar2);
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 9:
                                lVar2 = lVar3;
                                p pVar3 = pVar2;
                                i10 = i13;
                                r0Var = r0Var2;
                                a aVar = (a) r0Var.v(obj2, iO);
                                a1 a1VarL = r0Var.l(iO);
                                lVar2.v(2);
                                lVar2.c(aVar, a1VarL, pVar3);
                                r0Var.P(obj2, iO, aVar);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 10:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                m1.p(obj2, z(iS), lVar2.e());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 11:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ9 = z(iS);
                                lVar2.v(0);
                                m1.n(obj2, jZ9, lVar2.f4284a.G());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 12:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                lVar2.v(0);
                                int iT = lVar2.f4284a.t();
                                r0Var.j(iO);
                                m1.n(obj2, z(iS), iT);
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 13:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ10 = z(iS);
                                lVar2.v(5);
                                m1.n(obj2, jZ10, lVar2.f4284a.z());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 14:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ11 = z(iS);
                                lVar2.v(1);
                                m1.o(obj2, jZ11, lVar2.f4284a.A());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 15:
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var = r0Var2;
                                long jZ12 = z(iS);
                                lVar2.v(0);
                                m1.n(obj2, jZ12, lVar2.f4284a.B());
                                r0Var.M(obj2, iO);
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 16:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                long jZ13 = z(iS);
                                lVar2.v(0);
                                i10 = i13;
                                try {
                                    m1.o(obj2, jZ13, lVar2.f4284a.C());
                                    r0Var.M(obj2, iO);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    c1Var.getClass();
                                    if (d1VarA == null) {
                                        d1VarA = c1Var.a(obj2);
                                    }
                                    if (!c1Var.b(d1VarA, lVar2)) {
                                        while (i11 < i12) {
                                            r0Var.i(iArr[i11], obj2, d1VarA);
                                        }
                                        if (d1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = d1VarA;
                                    }
                                }
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 17:
                                lVar2 = lVar3;
                                p pVar4 = pVar2;
                                r0Var = r0Var2;
                                a aVar2 = (a) r0Var.v(obj2, iO);
                                a1 a1VarL2 = r0Var.l(iO);
                                lVar2.v(3);
                                lVar2.b(aVar2, a1VarL2, pVar4);
                                r0Var.P(obj2, iO, aVar2);
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case TYPE_SINT64_VALUE:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.g(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.k(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.m(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.t(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.l(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 23:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.j(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 24:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.i(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 25:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                lVar2.d(h0Var.c(obj2, z(iS)));
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case RuntimeVersion.MINOR:
                                lVar2 = lVar3;
                                r0Var = r0Var2;
                                try {
                                    r0Var.K(obj2, iS, lVar2);
                                    i10 = i13;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    i10 = i13;
                                    c1Var.getClass();
                                    if (d1VarA == null) {
                                        d1VarA = c1Var.a(obj2);
                                    }
                                    if (!c1Var.b(d1VarA, lVar2)) {
                                        while (i11 < i12) {
                                            r0Var.i(iArr[i11], obj2, d1VarA);
                                        }
                                        if (d1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = d1VarA;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 27:
                                try {
                                    try {
                                        r0Var2.I(obj2, iS, lVar3, r0Var2.l(iO), pVar);
                                        lVar2 = lVar3;
                                        r0Var = r0Var2;
                                        i10 = i13;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        lVar2 = lVar3;
                                        r0Var = r0Var2;
                                        i10 = i13;
                                        c1Var.getClass();
                                        if (d1VarA == null) {
                                            d1VarA = c1Var.a(obj2);
                                        }
                                        if (!c1Var.b(d1VarA, lVar2)) {
                                            while (i11 < i12) {
                                                r0Var.i(iArr[i11], obj2, d1VarA);
                                            }
                                            if (d1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = d1VarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                    r0Var = r0Var2;
                                    lVar2 = lVar3;
                                    i10 = i13;
                                    c1Var.getClass();
                                    if (d1VarA == null) {
                                        d1VarA = c1Var.a(obj2);
                                    }
                                    if (!c1Var.b(d1VarA, lVar2)) {
                                        while (i11 < i12) {
                                            r0Var.i(iArr[i11], obj2, d1VarA);
                                        }
                                        if (d1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = d1VarA;
                                    }
                                    r0Var2 = r0Var;
                                    lVar3 = lVar2;
                                    i13 = i10;
                                    pVar2 = pVar;
                                    break;
                                }
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 28:
                                lVar3.f(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 29:
                                lVar3.s(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 30:
                                lVar3.h(h0Var.c(obj2, iS & 1048575));
                                r0Var2.j(iO);
                                Class cls = b1.f4246a;
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 31:
                                lVar3.n(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                lVar3.o(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 33:
                                lVar3.p(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 34:
                                lVar3.q(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 35:
                                lVar3.g(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 36:
                                lVar3.k(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 37:
                                lVar3.m(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 38:
                                lVar3.t(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 39:
                                lVar3.l(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 40:
                                lVar3.j(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 41:
                                lVar3.i(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 42:
                                lVar3.d(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 43:
                                lVar3.s(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 44:
                                lVar3.h(h0Var.c(obj2, iS & 1048575));
                                r0Var2.j(iO);
                                Class cls2 = b1.f4246a;
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 45:
                                lVar3.n(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 46:
                                lVar3.o(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 47:
                                lVar3.p(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 48:
                                lVar3.q(h0Var.c(obj2, iS & 1048575));
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 49:
                                l lVar4 = lVar3;
                                try {
                                    r0Var2.H(obj2, iS & 1048575, lVar4, r0Var2.l(iO), pVar);
                                    lVar3 = lVar4;
                                    r0Var = r0Var2;
                                    lVar2 = lVar3;
                                    i10 = i13;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    r0Var = r0Var2;
                                    lVar2 = lVar4;
                                    i10 = i13;
                                    c1Var.getClass();
                                    if (d1VarA == null) {
                                        d1VarA = c1Var.a(obj2);
                                    }
                                    if (!c1Var.b(d1VarA, lVar2)) {
                                        while (i11 < i12) {
                                            r0Var.i(iArr[i11], obj2, d1VarA);
                                        }
                                        if (d1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = d1VarA;
                                    }
                                }
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 50:
                                r0Var2.s(iO, obj2, r0Var2.k(iO));
                                throw null;
                            case 51:
                                lVar3.v(1);
                                m1.p(obj2, iS & 1048575, Double.valueOf(lVar3.f4284a.s()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 52:
                                lVar3.v(5);
                                m1.p(obj2, iS & 1048575, Float.valueOf(lVar3.f4284a.w()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 53:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Long.valueOf(lVar3.f4284a.y()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 54:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Long.valueOf(lVar3.f4284a.H()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 55:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(lVar3.f4284a.x()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 56:
                                lVar3.v(1);
                                m1.p(obj2, iS & 1048575, Long.valueOf(lVar3.f4284a.v()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 57:
                                lVar3.v(5);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(lVar3.f4284a.u()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 58:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Boolean.valueOf(lVar3.f4284a.o()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 59:
                                r0Var2.J(obj2, iS, lVar3);
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 60:
                                a aVar3 = (a) r0Var2.w(obj2, iA, iO);
                                a1 a1VarL3 = r0Var2.l(iO);
                                lVar3.v(2);
                                lVar3.c(aVar3, a1VarL3, pVar2);
                                r0Var2.Q(obj2, iA, iO, aVar3);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 61:
                                m1.p(obj2, iS & 1048575, lVar3.e());
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 62:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(lVar3.f4284a.G()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 63:
                                lVar3.v(0);
                                int iT2 = lVar3.f4284a.t();
                                r0Var2.j(iO);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(iT2));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 64:
                                lVar3.v(5);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(lVar3.f4284a.z()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 65:
                                lVar3.v(1);
                                m1.p(obj2, iS & 1048575, Long.valueOf(lVar3.f4284a.A()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 66:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Integer.valueOf(lVar3.f4284a.B()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 67:
                                lVar3.v(0);
                                m1.p(obj2, iS & 1048575, Long.valueOf(lVar3.f4284a.C()));
                                r0Var2.N(obj2, iA, iO);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            case 68:
                                a aVar4 = (a) r0Var2.w(obj2, iA, iO);
                                a1 a1VarL4 = r0Var2.l(iO);
                                lVar3.v(3);
                                lVar3.b(aVar4, a1VarL4, pVar2);
                                r0Var2.Q(obj2, iA, iO, aVar4);
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                            default:
                                if (d1VarA == null) {
                                    try {
                                        d1VarA = c1Var.a(obj2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        r0Var = r0Var2;
                                        lVar2 = lVar3;
                                        i10 = i13;
                                        c1Var.getClass();
                                        if (d1VarA == null) {
                                            d1VarA = c1Var.a(obj2);
                                        }
                                        if (!c1Var.b(d1VarA, lVar2)) {
                                            while (i11 < i12) {
                                                r0Var.i(iArr[i11], obj2, d1VarA);
                                            }
                                            if (d1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = d1VarA;
                                        }
                                    }
                                }
                                if (!c1Var.b(d1VarA, lVar3)) {
                                    while (i13 < i12) {
                                        r0Var2.i(iArr[i13], obj2, d1VarA);
                                        i13++;
                                    }
                                    if (d1VarA == null) {
                                        return;
                                    }
                                }
                                r0Var = r0Var2;
                                lVar2 = lVar3;
                                i10 = i13;
                                r0Var2 = r0Var;
                                lVar3 = lVar2;
                                i13 = i10;
                                pVar2 = pVar;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                        r0Var = r0Var2;
                        lVar2 = lVar3;
                        i10 = i13;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i13 < i12) {
                        r0Var2.i(iArr[i13], obj2, d1VarA);
                        i13++;
                    }
                    if (d1VarA == null) {
                        return;
                    } else {
                        ((e1) c1Var).getClass();
                    }
                } else {
                    c1Var.getClass();
                    if (d1VarA == null) {
                        d1VarA = c1Var.a(obj2);
                    }
                    if (!c1Var.b(d1VarA, lVar3)) {
                        while (i13 < i12) {
                            r0Var2.i(iArr[i13], obj2, d1VarA);
                            i13++;
                        }
                        if (d1VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                r0Var = r0Var2;
            }
            i10 = i13;
            for (int i14 = i10; i14 < i12; i14++) {
                r0Var.i(iArr[i14], obj2, d1VarA);
            }
            if (d1VarA != null) {
                ((e1) c1Var).getClass();
                ((x) obj2).unknownFields = d1VarA;
            }
            throw th;
        }
        ((x) obj2).unknownFields = d1VarA;
    }

    @Override
    public final void f(Object obj, k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        k0Var.getClass();
        m mVar = (m) k0Var.f4283a;
        if (!this.f4320g) {
            T(obj, k0Var);
            return;
        }
        int[] iArr = this.f4314a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iS = S(i10);
            int i11 = iArr[i10];
            switch (R(iS)) {
                case 0:
                    if (o(obj, i10)) {
                        double dE = m1.f4297c.e(obj, iS & 1048575);
                        mVar.getClass();
                        mVar.c0(i11, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (o(obj, i10)) {
                        float f3 = m1.f4297c.f(obj, iS & 1048575);
                        mVar.getClass();
                        mVar.a0(i11, Float.floatToRawIntBits(f3));
                    }
                    break;
                case 2:
                    if (o(obj, i10)) {
                        mVar.h0(i11, m1.f4297c.h(obj, iS & 1048575));
                    }
                    break;
                case 3:
                    if (o(obj, i10)) {
                        mVar.h0(i11, m1.f4297c.h(obj, iS & 1048575));
                    }
                    break;
                case 4:
                    if (o(obj, i10)) {
                        int iG = m1.f4297c.g(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.e0(iG);
                    }
                    break;
                case 5:
                    if (o(obj, i10)) {
                        mVar.c0(i11, m1.f4297c.h(obj, iS & 1048575));
                    }
                    break;
                case 6:
                    if (o(obj, i10)) {
                        mVar.a0(i11, m1.f4297c.g(obj, iS & 1048575));
                    }
                    break;
                case 7:
                    if (o(obj, i10)) {
                        boolean zC = m1.f4297c.c(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.Y(zC ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (o(obj, i10)) {
                        U(i11, m1.f4297c.i(obj, iS & 1048575), k0Var);
                    }
                    break;
                case 9:
                    if (o(obj, i10)) {
                        k0Var.c(i11, m1.f4297c.i(obj, iS & 1048575), l(i10));
                    }
                    break;
                case 10:
                    if (o(obj, i10)) {
                        k0Var.a(i11, (i) m1.f4297c.i(obj, iS & 1048575));
                    }
                    break;
                case 11:
                    if (o(obj, i10)) {
                        int iG2 = m1.f4297c.g(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.g0(iG2);
                    }
                    break;
                case 12:
                    if (o(obj, i10)) {
                        int iG3 = m1.f4297c.g(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.e0(iG3);
                    }
                    break;
                case 13:
                    if (o(obj, i10)) {
                        mVar.a0(i11, m1.f4297c.g(obj, iS & 1048575));
                    }
                    break;
                case 14:
                    if (o(obj, i10)) {
                        mVar.c0(i11, m1.f4297c.h(obj, iS & 1048575));
                    }
                    break;
                case 15:
                    if (o(obj, i10)) {
                        int iG4 = m1.f4297c.g(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.g0((iG4 >> 31) ^ (iG4 << 1));
                    }
                    break;
                case 16:
                    if (o(obj, i10)) {
                        long jH = m1.f4297c.h(obj, iS & 1048575);
                        mVar.h0(i11, (jH >> 63) ^ (jH << 1));
                    }
                    break;
                case 17:
                    if (o(obj, i10)) {
                        k0Var.b(i11, m1.f4297c.i(obj, iS & 1048575), l(i10));
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    b1.A(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    b1.E(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    b1.H(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    b1.P(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    b1.G(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 23:
                    b1.D(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 24:
                    b1.C(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 25:
                    b1.y(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case RuntimeVersion.MINOR:
                    b1.N(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var);
                    break;
                case 27:
                    b1.I(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, l(i10));
                    break;
                case 28:
                    b1.z(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var);
                    break;
                case 29:
                    b1.O(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 30:
                    b1.B(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 31:
                    b1.J(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    b1.K(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 33:
                    b1.L(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 34:
                    b1.M(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, false);
                    break;
                case 35:
                    b1.A(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 36:
                    b1.E(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 37:
                    b1.H(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 38:
                    b1.P(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 39:
                    b1.G(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 40:
                    b1.D(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 41:
                    b1.C(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 42:
                    b1.y(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 43:
                    b1.O(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 44:
                    b1.B(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 45:
                    b1.J(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 46:
                    b1.K(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 47:
                    b1.L(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 48:
                    b1.M(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, true);
                    break;
                case 49:
                    b1.F(iArr[i10], (List) m1.f4297c.i(obj, iS & 1048575), k0Var, l(i10));
                    break;
                case 50:
                    if (m1.f4297c.i(obj, iS & 1048575) != null) {
                        Object objK = k(i10);
                        this.f4325n.getClass();
                        a1.b.x(objK);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (q(obj, i11, i10)) {
                        double dDoubleValue = ((Double) m1.f4297c.i(obj, iS & 1048575)).doubleValue();
                        mVar.getClass();
                        mVar.c0(i11, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (q(obj, i11, i10)) {
                        float fFloatValue = ((Float) m1.f4297c.i(obj, iS & 1048575)).floatValue();
                        mVar.getClass();
                        mVar.a0(i11, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (q(obj, i11, i10)) {
                        mVar.h0(i11, B(obj, iS & 1048575));
                    }
                    break;
                case 54:
                    if (q(obj, i11, i10)) {
                        mVar.h0(i11, B(obj, iS & 1048575));
                    }
                    break;
                case 55:
                    if (q(obj, i11, i10)) {
                        int iA = A(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.e0(iA);
                    }
                    break;
                case 56:
                    if (q(obj, i11, i10)) {
                        mVar.c0(i11, B(obj, iS & 1048575));
                    }
                    break;
                case 57:
                    if (q(obj, i11, i10)) {
                        mVar.a0(i11, A(obj, iS & 1048575));
                    }
                    break;
                case 58:
                    if (q(obj, i11, i10)) {
                        boolean zBooleanValue = ((Boolean) m1.f4297c.i(obj, iS & 1048575)).booleanValue();
                        mVar.f0(i11, 0);
                        mVar.Y(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (q(obj, i11, i10)) {
                        U(i11, m1.f4297c.i(obj, iS & 1048575), k0Var);
                    }
                    break;
                case 60:
                    if (q(obj, i11, i10)) {
                        k0Var.c(i11, m1.f4297c.i(obj, iS & 1048575), l(i10));
                    }
                    break;
                case 61:
                    if (q(obj, i11, i10)) {
                        k0Var.a(i11, (i) m1.f4297c.i(obj, iS & 1048575));
                    }
                    break;
                case 62:
                    if (q(obj, i11, i10)) {
                        int iA2 = A(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.g0(iA2);
                    }
                    break;
                case 63:
                    if (q(obj, i11, i10)) {
                        int iA3 = A(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.e0(iA3);
                    }
                    break;
                case 64:
                    if (q(obj, i11, i10)) {
                        mVar.a0(i11, A(obj, iS & 1048575));
                    }
                    break;
                case 65:
                    if (q(obj, i11, i10)) {
                        mVar.c0(i11, B(obj, iS & 1048575));
                    }
                    break;
                case 66:
                    if (q(obj, i11, i10)) {
                        int iA4 = A(obj, iS & 1048575);
                        mVar.f0(i11, 0);
                        mVar.g0((iA4 >> 31) ^ (iA4 << 1));
                    }
                    break;
                case 67:
                    if (q(obj, i11, i10)) {
                        long jB = B(obj, iS & 1048575);
                        mVar.h0(i11, (jB >> 63) ^ (jB << 1));
                    }
                    break;
                case 68:
                    if (q(obj, i11, i10)) {
                        k0Var.b(i11, m1.f4297c.i(obj, iS & 1048575), l(i10));
                    }
                    break;
            }
        }
        ((e1) this.m).getClass();
        ((x) obj).unknownFields.e(k0Var);
    }

    public final boolean g(x xVar, x xVar2, int i10) {
        return o(xVar, i10) == o(xVar2, i10);
    }

    public final void i(int i10, Object obj, Object obj2) {
        int i11 = this.f4314a[i10];
        if (m1.f4297c.i(obj, S(i10) & 1048575) == null) {
            return;
        }
        j(i10);
    }

    @Override
    public final boolean isInitialized(Object obj) {
        int iR;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean zO = true;
            if (i11 >= this.f4322i) {
                return true;
            }
            int i13 = this.f4321h[i11];
            int[] iArr = this.f4314a;
            int i14 = iArr[i13];
            int iS = S(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i12 = f4313p.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & iS) == 0) {
                iR = R(iS);
                if (iR != 9 || iR == 17) {
                    if (i10 == 1048575) {
                        zO = o(obj, i13);
                    } else if ((i17 & i12) == 0) {
                        zO = false;
                    }
                    if (zO) {
                        continue;
                    } else if (!l(i13).isInitialized(m1.f4297c.i(obj, iS & 1048575))) {
                    }
                    i11++;
                } else {
                    if (iR != 27) {
                        if (iR == 60 || iR == 68) {
                            if (!q(obj, i14, i13)) {
                                continue;
                            } else if (!l(i13).isInitialized(m1.f4297c.i(obj, iS & 1048575))) {
                            }
                        } else if (iR != 49) {
                            if (iR != 50) {
                                continue;
                            } else {
                                Object objI = m1.f4297c.i(obj, iS & 1048575);
                                this.f4325n.getClass();
                                if (!((l0) objI).isEmpty()) {
                                    a1.b.x(k(i13));
                                    throw null;
                                }
                            }
                        }
                        i11++;
                    }
                    List list = (List) m1.f4297c.i(obj, iS & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        a1 a1VarL = l(i13);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (a1VarL.isInitialized(list.get(i18))) {
                            }
                        }
                    }
                    i11++;
                }
            } else {
                if (i10 == 1048575 ? o(obj, i13) : (i12 & i17) != 0) {
                    iR = R(iS);
                    if (iR != 9) {
                    }
                    if (i10 == 1048575) {
                        zO = o(obj, i13);
                    } else if ((i17 & i12) == 0) {
                        zO = false;
                    }
                    if (zO) {
                        continue;
                    } else if (!l(i13).isInitialized(m1.f4297c.i(obj, iS & 1048575))) {
                    }
                    i11++;
                }
            }
            return false;
        }
    }

    public final void j(int i10) {
        if (this.f4315b[a1.b.e(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final Object k(int i10) {
        return this.f4315b[(i10 / 3) * 2];
    }

    public final a1 l(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f4315b;
        a1 a1Var = (a1) objArr[i11];
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1VarA = x0.f4333c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a1VarA;
        return a1VarA;
    }

    public final int m(x xVar) {
        int i10;
        int iV;
        int iX;
        int iV2;
        int iT;
        int iR;
        int iV3;
        int iU;
        int iD;
        int iS;
        Unsafe unsafe = f4313p;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iC = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f4314a;
            if (i13 >= iArr.length) {
                ((e1) this.m).getClass();
                return xVar.unknownFields.b() + iC;
            }
            int iS2 = S(i13);
            int i15 = iArr[i13];
            int iR2 = R(iS2);
            if (iR2 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i14 = unsafe.getInt(xVar, i17);
                    i12 = i17;
                }
            } else {
                i10 = 0;
            }
            long j9 = iS2 & i11;
            switch (iR2) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iC = x5.C(i15, 8, iC);
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        iC = x5.C(i15, 4, iC);
                    }
                    break;
                case 2:
                    if ((i10 & i14) != 0) {
                        long j10 = unsafe.getLong(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X(j10);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 3:
                    if ((i10 & i14) != 0) {
                        long j11 = unsafe.getLong(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X(j11);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 4:
                    if ((i10 & i14) != 0) {
                        int i18 = unsafe.getInt(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.T(i18);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        iR = m.R(i15);
                        iC += iR;
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        iR = m.Q(i15);
                        iC += iR;
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iC = x5.C(i15, 1, iC);
                    }
                    break;
                case 8:
                    if ((i10 & i14) != 0) {
                        Object object = unsafe.getObject(xVar, j9);
                        if (object instanceof i) {
                            int iV4 = m.V(i15);
                            int size = ((i) object).size();
                            iD = x5.D(size, size, iV4, iC);
                        } else {
                            iV3 = m.V(i15);
                            iU = m.U((String) object);
                            iD = iU + iV3 + iC;
                        }
                        iC = iD;
                    }
                    break;
                case 9:
                    if ((i10 & i14) != 0) {
                        Object object2 = unsafe.getObject(xVar, j9);
                        a1 a1VarL = l(i13);
                        Class cls = b1.f4246a;
                        int iV5 = m.V(i15);
                        int iA = ((a) object2).a(a1VarL);
                        iC = x5.D(iA, iA, iV5, iC);
                    }
                    break;
                case 10:
                    if ((i10 & i14) != 0) {
                        iR = m.O(i15, (i) unsafe.getObject(xVar, j9));
                        iC += iR;
                    }
                    break;
                case 11:
                    if ((i10 & i14) != 0) {
                        int i19 = unsafe.getInt(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.W(i19);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 12:
                    if ((i10 & i14) != 0) {
                        int i20 = unsafe.getInt(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.T(i20);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iC = x5.C(i15, 4, iC);
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iC = x5.C(i15, 8, iC);
                    }
                    break;
                case 15:
                    if ((i10 & i14) != 0) {
                        int i21 = unsafe.getInt(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.W((i21 >> 31) ^ (i21 << 1));
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        long j12 = unsafe.getLong(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X((j12 >> 63) ^ (j12 << 1));
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 17:
                    if ((i10 & i14) != 0) {
                        iR = m.S(i15, (a) unsafe.getObject(xVar, j9), l(i13));
                        iC += iR;
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    iR = b1.f(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    iR = b1.d(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    iR = b1.j(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    iR = b1.t(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    iR = b1.h(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 23:
                    iR = b1.f(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 24:
                    iR = b1.d(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(xVar, j9);
                    Class cls2 = b1.f4246a;
                    int size2 = list.size();
                    iC += size2 == 0 ? 0 : (m.V(i15) + 1) * size2;
                    break;
                case RuntimeVersion.MINOR:
                    iR = b1.q(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 27:
                    iR = b1.l(i15, (List) unsafe.getObject(xVar, j9), l(i13));
                    iC += iR;
                    break;
                case 28:
                    iR = b1.a(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 29:
                    iR = b1.r(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 30:
                    iR = b1.b(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 31:
                    iR = b1.d(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    iR = b1.f(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 33:
                    iR = b1.m(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 34:
                    iR = b1.o(i15, (List) unsafe.getObject(xVar, j9));
                    iC += iR;
                    break;
                case 35:
                    int iG = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG > 0) {
                        iC = x5.D(iG, m.V(i15), iG, iC);
                    }
                    break;
                case 36:
                    int iE = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE > 0) {
                        iC = x5.D(iE, m.V(i15), iE, iC);
                    }
                    break;
                case 37:
                    int iK = b1.k((List) unsafe.getObject(xVar, j9));
                    if (iK > 0) {
                        iC = x5.D(iK, m.V(i15), iK, iC);
                    }
                    break;
                case 38:
                    int iU2 = b1.u((List) unsafe.getObject(xVar, j9));
                    if (iU2 > 0) {
                        iC = x5.D(iU2, m.V(i15), iU2, iC);
                    }
                    break;
                case 39:
                    int i22 = b1.i((List) unsafe.getObject(xVar, j9));
                    if (i22 > 0) {
                        iC = x5.D(i22, m.V(i15), i22, iC);
                    }
                    break;
                case 40:
                    int iG2 = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG2 > 0) {
                        iC = x5.D(iG2, m.V(i15), iG2, iC);
                    }
                    break;
                case 41:
                    int iE2 = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE2 > 0) {
                        iC = x5.D(iE2, m.V(i15), iE2, iC);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(xVar, j9);
                    Class cls3 = b1.f4246a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iC = x5.D(size3, m.V(i15), size3, iC);
                    }
                    break;
                case 43:
                    int iS3 = b1.s((List) unsafe.getObject(xVar, j9));
                    if (iS3 > 0) {
                        iC = x5.D(iS3, m.V(i15), iS3, iC);
                    }
                    break;
                case 44:
                    int iC2 = b1.c((List) unsafe.getObject(xVar, j9));
                    if (iC2 > 0) {
                        iC = x5.D(iC2, m.V(i15), iC2, iC);
                    }
                    break;
                case 45:
                    int iE3 = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE3 > 0) {
                        iC = x5.D(iE3, m.V(i15), iE3, iC);
                    }
                    break;
                case 46:
                    int iG3 = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG3 > 0) {
                        iC = x5.D(iG3, m.V(i15), iG3, iC);
                    }
                    break;
                case 47:
                    int iN = b1.n((List) unsafe.getObject(xVar, j9));
                    if (iN > 0) {
                        iC = x5.D(iN, m.V(i15), iN, iC);
                    }
                    break;
                case 48:
                    int iP = b1.p((List) unsafe.getObject(xVar, j9));
                    if (iP > 0) {
                        iC = x5.D(iP, m.V(i15), iP, iC);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(xVar, j9);
                    a1 a1VarL2 = l(i13);
                    Class cls4 = b1.f4246a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iS = 0;
                    } else {
                        iS = 0;
                        for (int i23 = 0; i23 < size4; i23++) {
                            iS += m.S(i15, (a) list3.get(i23), a1VarL2);
                        }
                    }
                    iC += iS;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(xVar, j9);
                    Object objK = k(i13);
                    this.f4325n.getClass();
                    m0.a(object3, objK);
                    break;
                case 51:
                    if (q(xVar, i15, i13)) {
                        iC = x5.C(i15, 8, iC);
                    }
                    break;
                case 52:
                    if (q(xVar, i15, i13)) {
                        iC = x5.C(i15, 4, iC);
                    }
                    break;
                case 53:
                    if (q(xVar, i15, i13)) {
                        long jB = B(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X(jB);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 54:
                    if (q(xVar, i15, i13)) {
                        long jB2 = B(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X(jB2);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 55:
                    if (q(xVar, i15, i13)) {
                        int iA2 = A(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.T(iA2);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 56:
                    if (q(xVar, i15, i13)) {
                        iR = m.R(i15);
                        iC += iR;
                    }
                    break;
                case 57:
                    if (q(xVar, i15, i13)) {
                        iR = m.Q(i15);
                        iC += iR;
                    }
                    break;
                case 58:
                    if (q(xVar, i15, i13)) {
                        iC = x5.C(i15, 1, iC);
                    }
                    break;
                case 59:
                    if (q(xVar, i15, i13)) {
                        Object object4 = unsafe.getObject(xVar, j9);
                        if (object4 instanceof i) {
                            int iV6 = m.V(i15);
                            int size5 = ((i) object4).size();
                            iD = x5.D(size5, size5, iV6, iC);
                        } else {
                            iV3 = m.V(i15);
                            iU = m.U((String) object4);
                            iD = iU + iV3 + iC;
                        }
                        iC = iD;
                    }
                    break;
                case 60:
                    if (q(xVar, i15, i13)) {
                        Object object5 = unsafe.getObject(xVar, j9);
                        a1 a1VarL3 = l(i13);
                        Class cls5 = b1.f4246a;
                        int iV7 = m.V(i15);
                        int iA3 = ((a) object5).a(a1VarL3);
                        iC = x5.D(iA3, iA3, iV7, iC);
                    }
                    break;
                case 61:
                    if (q(xVar, i15, i13)) {
                        iR = m.O(i15, (i) unsafe.getObject(xVar, j9));
                        iC += iR;
                    }
                    break;
                case 62:
                    if (q(xVar, i15, i13)) {
                        int iA4 = A(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.W(iA4);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 63:
                    if (q(xVar, i15, i13)) {
                        int iA5 = A(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.T(iA5);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 64:
                    if (q(xVar, i15, i13)) {
                        iC = x5.C(i15, 4, iC);
                    }
                    break;
                case 65:
                    if (q(xVar, i15, i13)) {
                        iC = x5.C(i15, 8, iC);
                    }
                    break;
                case 66:
                    if (q(xVar, i15, i13)) {
                        int iA6 = A(xVar, j9);
                        iV2 = m.V(i15);
                        iT = m.W((iA6 >> 31) ^ (iA6 << 1));
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 67:
                    if (q(xVar, i15, i13)) {
                        long jB3 = B(xVar, j9);
                        iV = m.V(i15);
                        iX = m.X((jB3 >> 63) ^ (jB3 << 1));
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 68:
                    if (q(xVar, i15, i13)) {
                        iR = m.S(i15, (a) unsafe.getObject(xVar, j9), l(i13));
                        iC += iR;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    @Override
    public final void makeImmutable(Object obj) {
        if (p(obj)) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                xVar.t(Integer.MAX_VALUE);
                xVar.memoizedHashCode = 0;
                xVar.n();
            }
            int length = this.f4314a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iS = S(i10);
                long j9 = 1048575 & iS;
                int iR = R(iS);
                if (iR != 9) {
                    switch (iR) {
                        case 17:
                            if (o(obj, i10)) {
                                l(i10).makeImmutable(f4313p.getObject(obj, j9));
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
                            this.l.a(obj, j9);
                            break;
                        case 50:
                            Unsafe unsafe = f4313p;
                            Object object = unsafe.getObject(obj, j9);
                            if (object != null) {
                                this.f4325n.getClass();
                                ((l0) object).A = false;
                                unsafe.putObject(obj, j9, object);
                            }
                            break;
                    }
                } else if (o(obj, i10)) {
                    l(i10).makeImmutable(f4313p.getObject(obj, j9));
                }
            }
            ((e1) this.m).getClass();
            ((x) obj).unknownFields.f4260e = false;
        }
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        h(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4314a;
            if (i10 >= iArr.length) {
                b1.w(this.m, obj, obj2);
                return;
            }
            int iS = S(i10);
            long j9 = 1048575 & iS;
            int i11 = iArr[i10];
            switch (R(iS)) {
                case 0:
                    if (!o(obj2, i10)) {
                        obj3 = obj;
                    } else {
                        l1 l1Var = m1.f4297c;
                        obj3 = obj;
                        l1Var.m(obj3, j9, l1Var.e(obj2, j9));
                        M(obj3, i10);
                    }
                    break;
                case 1:
                    if (o(obj2, i10)) {
                        l1 l1Var2 = m1.f4297c;
                        l1Var2.n(obj, j9, l1Var2.f(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(obj2, i10)) {
                        m1.o(obj, j9, m1.f4297c.h(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(obj2, i10)) {
                        m1.o(obj, j9, m1.f4297c.h(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(obj2, i10)) {
                        m1.o(obj, j9, m1.f4297c.h(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(obj2, i10)) {
                        l1 l1Var3 = m1.f4297c;
                        l1Var3.k(obj, j9, l1Var3.c(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(obj2, i10)) {
                        m1.p(obj, j9, m1.f4297c.i(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    t(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(obj2, i10)) {
                        m1.p(obj, j9, m1.f4297c.i(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(obj2, i10)) {
                        m1.o(obj, j9, m1.f4297c.h(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(obj2, i10)) {
                        m1.n(obj, j9, m1.f4297c.g(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(obj2, i10)) {
                        m1.o(obj, j9, m1.f4297c.h(obj2, j9));
                        M(obj, i10);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    t(obj, obj2, i10);
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
                    this.l.b(obj, obj2, j9);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = b1.f4246a;
                    l1 l1Var4 = m1.f4297c;
                    Object objI = l1Var4.i(obj, j9);
                    Object objI2 = l1Var4.i(obj2, j9);
                    this.f4325n.getClass();
                    m1.p(obj, j9, m0.b(objI, objI2));
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
                    if (q(obj2, i11, i10)) {
                        m1.p(obj, j9, m1.f4297c.i(obj2, j9));
                        N(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    u(obj, obj2, i10);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i11, i10)) {
                        m1.p(obj, j9, m1.f4297c.i(obj2, j9));
                        N(obj, i11, i10);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    u(obj, obj2, i10);
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

    public final int n(x xVar) {
        int iV;
        int iX;
        int iV2;
        int iT;
        int iR;
        int iV3;
        int iU;
        int iV4;
        int iX2;
        int iS;
        Unsafe unsafe = f4313p;
        int i10 = 0;
        int iC = 0;
        while (true) {
            int[] iArr = this.f4314a;
            if (i10 >= iArr.length) {
                ((e1) this.m).getClass();
                return xVar.unknownFields.b() + iC;
            }
            int iS2 = S(i10);
            int iR2 = R(iS2);
            int i11 = iArr[i10];
            long j9 = iS2 & 1048575;
            if (iR2 >= s.B.A && iR2 <= s.C.A) {
                int i12 = iArr[i10 + 2];
            }
            switch (iR2) {
                case 0:
                    if (o(xVar, i10)) {
                        iC = x5.C(i11, 8, iC);
                    }
                    break;
                case 1:
                    if (o(xVar, i10)) {
                        iC = x5.C(i11, 4, iC);
                    }
                    break;
                case 2:
                    if (o(xVar, i10)) {
                        long jH = m1.f4297c.h(xVar, j9);
                        iV = m.V(i11);
                        iX = m.X(jH);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 3:
                    if (o(xVar, i10)) {
                        long jH2 = m1.f4297c.h(xVar, j9);
                        iV = m.V(i11);
                        iX = m.X(jH2);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 4:
                    if (o(xVar, i10)) {
                        int iG = m1.f4297c.g(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.T(iG);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 5:
                    if (o(xVar, i10)) {
                        iR = m.R(i11);
                        iC += iR;
                    }
                    break;
                case 6:
                    if (o(xVar, i10)) {
                        iR = m.Q(i11);
                        iC += iR;
                    }
                    break;
                case 7:
                    if (o(xVar, i10)) {
                        iC = x5.C(i11, 1, iC);
                    }
                    break;
                case 8:
                    if (o(xVar, i10)) {
                        Object objI = m1.f4297c.i(xVar, j9);
                        if (objI instanceof i) {
                            int iV5 = m.V(i11);
                            int size = ((i) objI).size();
                            iC = x5.D(size, size, iV5, iC);
                        } else {
                            iV3 = m.V(i11);
                            iU = m.U((String) objI);
                            iC = iU + iV3 + iC;
                        }
                    }
                    break;
                case 9:
                    if (o(xVar, i10)) {
                        Object objI2 = m1.f4297c.i(xVar, j9);
                        a1 a1VarL = l(i10);
                        Class cls = b1.f4246a;
                        int iV6 = m.V(i11);
                        int iA = ((a) objI2).a(a1VarL);
                        iC = x5.D(iA, iA, iV6, iC);
                    }
                    break;
                case 10:
                    if (o(xVar, i10)) {
                        iR = m.O(i11, (i) m1.f4297c.i(xVar, j9));
                        iC += iR;
                    }
                    break;
                case 11:
                    if (o(xVar, i10)) {
                        int iG2 = m1.f4297c.g(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.W(iG2);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 12:
                    if (o(xVar, i10)) {
                        int iG3 = m1.f4297c.g(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.T(iG3);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 13:
                    if (o(xVar, i10)) {
                        iC = x5.C(i11, 4, iC);
                    }
                    break;
                case 14:
                    if (o(xVar, i10)) {
                        iC = x5.C(i11, 8, iC);
                    }
                    break;
                case 15:
                    if (o(xVar, i10)) {
                        int iG4 = m1.f4297c.g(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.W((iG4 >> 31) ^ (iG4 << 1));
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 16:
                    if (o(xVar, i10)) {
                        long jH3 = m1.f4297c.h(xVar, j9);
                        iV4 = m.V(i11);
                        iX2 = m.X((jH3 >> 63) ^ (jH3 << 1));
                        iR = iX2 + iV4;
                        iC += iR;
                    }
                    break;
                case 17:
                    if (o(xVar, i10)) {
                        iR = m.S(i11, (a) m1.f4297c.i(xVar, j9), l(i10));
                        iC += iR;
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    iR = b1.f(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    iR = b1.d(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    iR = b1.j(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    iR = b1.t(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    iR = b1.h(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 23:
                    iR = b1.f(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 24:
                    iR = b1.d(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 25:
                    List listR = r(xVar, j9);
                    Class cls2 = b1.f4246a;
                    int size2 = listR.size();
                    iC += size2 == 0 ? 0 : (m.V(i11) + 1) * size2;
                    break;
                case RuntimeVersion.MINOR:
                    iR = b1.q(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 27:
                    iR = b1.l(i11, r(xVar, j9), l(i10));
                    iC += iR;
                    break;
                case 28:
                    iR = b1.a(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 29:
                    iR = b1.r(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 30:
                    iR = b1.b(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 31:
                    iR = b1.d(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    iR = b1.f(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 33:
                    iR = b1.m(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 34:
                    iR = b1.o(i11, r(xVar, j9));
                    iC += iR;
                    break;
                case 35:
                    int iG5 = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG5 > 0) {
                        iC = x5.D(iG5, m.V(i11), iG5, iC);
                    }
                    break;
                case 36:
                    int iE = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE > 0) {
                        iC = x5.D(iE, m.V(i11), iE, iC);
                    }
                    break;
                case 37:
                    int iK = b1.k((List) unsafe.getObject(xVar, j9));
                    if (iK > 0) {
                        iC = x5.D(iK, m.V(i11), iK, iC);
                    }
                    break;
                case 38:
                    int iU2 = b1.u((List) unsafe.getObject(xVar, j9));
                    if (iU2 > 0) {
                        iC = x5.D(iU2, m.V(i11), iU2, iC);
                    }
                    break;
                case 39:
                    int i13 = b1.i((List) unsafe.getObject(xVar, j9));
                    if (i13 > 0) {
                        iC = x5.D(i13, m.V(i11), i13, iC);
                    }
                    break;
                case 40:
                    int iG6 = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG6 > 0) {
                        iC = x5.D(iG6, m.V(i11), iG6, iC);
                    }
                    break;
                case 41:
                    int iE2 = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE2 > 0) {
                        iC = x5.D(iE2, m.V(i11), iE2, iC);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(xVar, j9);
                    Class cls3 = b1.f4246a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iC = x5.D(size3, m.V(i11), size3, iC);
                    }
                    break;
                case 43:
                    int iS3 = b1.s((List) unsafe.getObject(xVar, j9));
                    if (iS3 > 0) {
                        iC = x5.D(iS3, m.V(i11), iS3, iC);
                    }
                    break;
                case 44:
                    int iC2 = b1.c((List) unsafe.getObject(xVar, j9));
                    if (iC2 > 0) {
                        iC = x5.D(iC2, m.V(i11), iC2, iC);
                    }
                    break;
                case 45:
                    int iE3 = b1.e((List) unsafe.getObject(xVar, j9));
                    if (iE3 > 0) {
                        iC = x5.D(iE3, m.V(i11), iE3, iC);
                    }
                    break;
                case 46:
                    int iG7 = b1.g((List) unsafe.getObject(xVar, j9));
                    if (iG7 > 0) {
                        iC = x5.D(iG7, m.V(i11), iG7, iC);
                    }
                    break;
                case 47:
                    int iN = b1.n((List) unsafe.getObject(xVar, j9));
                    if (iN > 0) {
                        iC = x5.D(iN, m.V(i11), iN, iC);
                    }
                    break;
                case 48:
                    int iP = b1.p((List) unsafe.getObject(xVar, j9));
                    if (iP > 0) {
                        iC = x5.D(iP, m.V(i11), iP, iC);
                    }
                    break;
                case 49:
                    List listR2 = r(xVar, j9);
                    a1 a1VarL2 = l(i10);
                    Class cls4 = b1.f4246a;
                    int size4 = listR2.size();
                    if (size4 == 0) {
                        iS = 0;
                    } else {
                        iS = 0;
                        for (int i14 = 0; i14 < size4; i14++) {
                            iS += m.S(i11, (a) listR2.get(i14), a1VarL2);
                        }
                    }
                    iC += iS;
                    break;
                case 50:
                    Object objI3 = m1.f4297c.i(xVar, j9);
                    Object objK = k(i10);
                    this.f4325n.getClass();
                    m0.a(objI3, objK);
                    break;
                case 51:
                    if (q(xVar, i11, i10)) {
                        iC = x5.C(i11, 8, iC);
                    }
                    break;
                case 52:
                    if (q(xVar, i11, i10)) {
                        iC = x5.C(i11, 4, iC);
                    }
                    break;
                case 53:
                    if (q(xVar, i11, i10)) {
                        long jB = B(xVar, j9);
                        iV = m.V(i11);
                        iX = m.X(jB);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 54:
                    if (q(xVar, i11, i10)) {
                        long jB2 = B(xVar, j9);
                        iV = m.V(i11);
                        iX = m.X(jB2);
                        iR = iX + iV;
                        iC += iR;
                    }
                    break;
                case 55:
                    if (q(xVar, i11, i10)) {
                        int iA2 = A(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.T(iA2);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 56:
                    if (q(xVar, i11, i10)) {
                        iR = m.R(i11);
                        iC += iR;
                    }
                    break;
                case 57:
                    if (q(xVar, i11, i10)) {
                        iR = m.Q(i11);
                        iC += iR;
                    }
                    break;
                case 58:
                    if (q(xVar, i11, i10)) {
                        iC = x5.C(i11, 1, iC);
                    }
                    break;
                case 59:
                    if (q(xVar, i11, i10)) {
                        Object objI4 = m1.f4297c.i(xVar, j9);
                        if (objI4 instanceof i) {
                            int iV7 = m.V(i11);
                            int size5 = ((i) objI4).size();
                            iC = x5.D(size5, size5, iV7, iC);
                        } else {
                            iV3 = m.V(i11);
                            iU = m.U((String) objI4);
                            iC = iU + iV3 + iC;
                        }
                    }
                    break;
                case 60:
                    if (q(xVar, i11, i10)) {
                        Object objI5 = m1.f4297c.i(xVar, j9);
                        a1 a1VarL3 = l(i10);
                        Class cls5 = b1.f4246a;
                        int iV8 = m.V(i11);
                        int iA3 = ((a) objI5).a(a1VarL3);
                        iC = x5.D(iA3, iA3, iV8, iC);
                    }
                    break;
                case 61:
                    if (q(xVar, i11, i10)) {
                        iR = m.O(i11, (i) m1.f4297c.i(xVar, j9));
                        iC += iR;
                    }
                    break;
                case 62:
                    if (q(xVar, i11, i10)) {
                        int iA4 = A(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.W(iA4);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 63:
                    if (q(xVar, i11, i10)) {
                        int iA5 = A(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.T(iA5);
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 64:
                    if (q(xVar, i11, i10)) {
                        iC = x5.C(i11, 4, iC);
                    }
                    break;
                case 65:
                    if (q(xVar, i11, i10)) {
                        iC = x5.C(i11, 8, iC);
                    }
                    break;
                case 66:
                    if (q(xVar, i11, i10)) {
                        int iA6 = A(xVar, j9);
                        iV2 = m.V(i11);
                        iT = m.W((iA6 >> 31) ^ (iA6 << 1));
                        iR = iT + iV2;
                        iC += iR;
                    }
                    break;
                case 67:
                    if (q(xVar, i11, i10)) {
                        long jB3 = B(xVar, j9);
                        iV4 = m.V(i11);
                        iX2 = m.X((jB3 >> 63) ^ (jB3 << 1));
                        iR = iX2 + iV4;
                        iC += iR;
                    }
                    break;
                case 68:
                    if (q(xVar, i11, i10)) {
                        iR = m.S(i11, (a) m1.f4297c.i(xVar, j9), l(i10));
                        iC += iR;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    @Override
    public final Object newInstance() {
        this.f4324k.getClass();
        return ((x) this.f4318e).p();
    }

    public final boolean o(Object obj, int i10) {
        int i11 = this.f4314a[i10 + 2];
        long j9 = i11 & 1048575;
        if (j9 == 1048575) {
            int iS = S(i10);
            long j10 = iS & 1048575;
            switch (R(iS)) {
                case 0:
                    if (Double.doubleToRawLongBits(m1.f4297c.e(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(m1.f4297c.f(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (m1.f4297c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (m1.f4297c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (m1.f4297c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return m1.f4297c.c(obj, j10);
                case 8:
                    Object objI = m1.f4297c.i(obj, j10);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof i) {
                        return !i.B.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (m1.f4297c.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.B.equals(m1.f4297c.i(obj, j10));
                case 11:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (m1.f4297c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (m1.f4297c.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (m1.f4297c.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (m1.f4297c.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & m1.f4297c.g(obj, j9)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i10, int i11) {
        return m1.f4297c.g(obj, (long) (this.f4314a[i11 + 2] & 1048575)) == i10;
    }

    public final void s(int i10, Object obj, Object obj2) {
        long jS = S(i10) & 1048575;
        Object objI = m1.f4297c.i(obj, jS);
        m0 m0Var = this.f4325n;
        if (objI != null) {
            m0Var.getClass();
            if (!((l0) objI).A) {
                l0 l0VarD = l0.B.d();
                m0.b(l0VarD, objI);
                m1.p(obj, jS, l0VarD);
                objI = l0VarD;
            }
        } else {
            m0Var.getClass();
            objI = l0.B.d();
            m1.p(obj, jS, objI);
        }
        m0Var.getClass();
        a1.b.x(obj2);
        throw null;
    }

    public final void t(Object obj, Object obj2, int i10) {
        if (o(obj2, i10)) {
            long jS = S(i10) & 1048575;
            Unsafe unsafe = f4313p;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4314a[i10] + " is present but null: " + obj2);
            }
            a1 a1VarL = l(i10);
            if (!o(obj, i10)) {
                if (p(object)) {
                    Object objNewInstance = a1VarL.newInstance();
                    a1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jS, objNewInstance);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                M(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!p(object2)) {
                Object objNewInstance2 = a1VarL.newInstance();
                a1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jS, objNewInstance2);
                object2 = objNewInstance2;
            }
            a1VarL.mergeFrom(object2, object);
        }
    }

    public final void u(Object obj, Object obj2, int i10) {
        int[] iArr = this.f4314a;
        int i11 = iArr[i10];
        if (q(obj2, i11, i10)) {
            long jS = S(i10) & 1048575;
            Unsafe unsafe = f4313p;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            a1 a1VarL = l(i10);
            if (!q(obj, i11, i10)) {
                if (p(object)) {
                    Object objNewInstance = a1VarL.newInstance();
                    a1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jS, objNewInstance);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                N(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!p(object2)) {
                Object objNewInstance2 = a1VarL.newInstance();
                a1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jS, objNewInstance2);
                object2 = objNewInstance2;
            }
            a1VarL.mergeFrom(object2, object);
        }
    }

    public final Object v(Object obj, int i10) {
        a1 a1VarL = l(i10);
        long jS = S(i10) & 1048575;
        if (!o(obj, i10)) {
            return a1VarL.newInstance();
        }
        Object object = f4313p.getObject(obj, jS);
        if (p(object)) {
            return object;
        }
        Object objNewInstance = a1VarL.newInstance();
        if (object != null) {
            a1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object w(Object obj, int i10, int i11) {
        a1 a1VarL = l(i11);
        if (!q(obj, i10, i11)) {
            return a1VarL.newInstance();
        }
        Object object = f4313p.getObject(obj, S(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        Object objNewInstance = a1VarL.newInstance();
        if (object != null) {
            a1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
