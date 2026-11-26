package g1;

import java.util.List;
import kotlin.KotlinNothingValueException;

public final class p5 implements z2.w0 {

    public final u00.k f5901a;

    public final boolean f5902b;

    public final w6 f5903c;

    public final h1.d1 f5904d;

    public final h0.n1 f5905e;

    public final float f5906f;

    public p5(u00.k kVar, boolean z10, w6 w6Var, h1.d1 d1Var, h0.n1 n1Var, float f3) {
        this.f5901a = kVar;
        this.f5902b = z10;
        this.f5903c = w6Var;
        this.f5904d = d1Var;
        this.f5905e = n1Var;
        this.f5906f = f3;
    }

    public static final int h(int i10, p5 p5Var, int i11, int i12, z2.l1 l1Var, z2.l1 l1Var2) {
        if (p5Var.f5902b) {
            i12 = Math.round((1 + 0.0f) * ((i11 - l1Var2.B) / 2.0f));
        }
        return Math.max(i10 + i12, (l1Var != null ? l1Var.B : 0) / 2);
    }

    public final int a(z2.w wVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j9, float f3) {
        int[] iArr = {i16, i12, i13, com.google.android.gms.internal.measurement.b5.B(f3, i15, 0)};
        for (int i18 = 0; i18 < 4; i18++) {
            i14 = Math.max(i14, iArr[i18]);
        }
        h0.n1 n1Var = this.f5905e;
        float fA0 = wVar.A0(n1Var.c());
        return y3.b.f(Math.max(i10, Math.max(i11, w00.a.F(com.google.android.gms.internal.measurement.b5.A(fA0, Math.max(fA0, i15 / 2.0f), f3) + i14 + wVar.A0(n1Var.a())))) + i17, j9);
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        return e(wVar, list, i10, new fo.b(25, (byte) 0));
    }

    public final int c(z2.w wVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j9, float f3) {
        int i17 = i12 + i13;
        int iMax = Math.max(i14 + i17, Math.max(i16 + i17, com.google.android.gms.internal.measurement.b5.B(f3, i15, 0))) + i10 + i11;
        y3.m mVar = y3.m.A;
        h0.n1 n1Var = this.f5905e;
        return y3.b.g(Math.max(iMax, w00.a.F((i15 + wVar.A0(n1Var.d(mVar) + n1Var.b(mVar))) * f3)), j9);
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        return f(wVar, list, i10, new fo.b(28, (byte) 0));
    }

    public final int e(z2.w wVar, List list, int i10, u00.n nVar) throws KotlinNothingValueException {
        Object obj;
        int iM;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        p5 p5Var = this;
        float fInvoke = p5Var.f5904d.invoke();
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj), "Leading")) {
                break;
            }
            i11++;
        }
        z2.v0 v0Var = (z2.v0) obj;
        if (v0Var != null) {
            iM = h1.f.m(i10, v0Var.D(Integer.MAX_VALUE));
            iIntValue = ((Number) nVar.invoke(v0Var, Integer.valueOf(i10))).intValue();
        } else {
            iM = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        z2.v0 v0Var2 = (z2.v0) obj2;
        if (v0Var2 != null) {
            iM = h1.f.m(iM, v0Var2.D(Integer.MAX_VALUE));
            iIntValue2 = ((Number) nVar.invoke(v0Var2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj3), "Label")) {
                break;
            }
            i13++;
        }
        z2.v0 v0Var3 = (z2.v0) obj3;
        int iIntValue5 = v0Var3 != null ? ((Number) nVar.invoke(v0Var3, Integer.valueOf(com.google.android.gms.internal.measurement.b5.B(fInvoke, iM, i10)))).intValue() : 0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj4), "Prefix")) {
                break;
            }
            i14++;
        }
        z2.v0 v0Var4 = (z2.v0) obj4;
        if (v0Var4 != null) {
            iIntValue3 = ((Number) nVar.invoke(v0Var4, Integer.valueOf(iM))).intValue();
            iM = h1.f.m(iM, v0Var4.D(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i15);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj5), "Suffix")) {
                break;
            }
            i15++;
        }
        z2.v0 v0Var5 = (z2.v0) obj5;
        if (v0Var5 != null) {
            iIntValue4 = ((Number) nVar.invoke(v0Var5, Integer.valueOf(iM))).intValue();
            iM = h1.f.m(iM, v0Var5.D(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj8 = list.get(i16);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj8), "TextField")) {
                int iIntValue6 = ((Number) nVar.invoke(obj8, Integer.valueOf(iM))).intValue();
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj6), "Hint")) {
                        break;
                    }
                    i17++;
                }
                z2.v0 v0Var6 = (z2.v0) obj6;
                int iIntValue7 = v0Var6 != null ? ((Number) nVar.invoke(v0Var6, Integer.valueOf(iM))).intValue() : 0;
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i18);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj7), "Supporting")) {
                        break;
                    }
                    i18++;
                }
                z2.v0 v0Var7 = (z2.v0) obj7;
                return p5Var.a(wVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, v0Var7 != null ? ((Number) nVar.invoke(v0Var7, Integer.valueOf(i10))).intValue() : 0, y3.b.b(0, 0, 0, 0, 15), fInvoke);
            }
            i16++;
            iIntValue4 = iIntValue4;
            p5Var = this;
            iIntValue3 = iIntValue3;
        }
        a4.a.b("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int f(z2.w wVar, List list, int i10, u00.n nVar) throws KotlinNothingValueException {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj7), "TextField")) {
                int iIntValue = ((Number) nVar.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                z2.v0 v0Var = (z2.v0) obj2;
                int iIntValue2 = v0Var != null ? ((Number) nVar.invoke(v0Var, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                z2.v0 v0Var2 = (z2.v0) obj3;
                int iIntValue3 = v0Var2 != null ? ((Number) nVar.invoke(v0Var2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                z2.v0 v0Var3 = (z2.v0) obj4;
                int iIntValue4 = v0Var3 != null ? ((Number) nVar.invoke(v0Var3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                z2.v0 v0Var4 = (z2.v0) obj5;
                int iIntValue5 = v0Var4 != null ? ((Number) nVar.invoke(v0Var4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                z2.v0 v0Var5 = (z2.v0) obj6;
                int iIntValue6 = v0Var5 != null ? ((Number) nVar.invoke(v0Var5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    Object obj8 = list.get(i17);
                    if (kotlin.jvm.internal.m.a(h1.f.k((z2.v0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                z2.v0 v0Var6 = (z2.v0) obj;
                return c(wVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, v0Var6 != null ? ((Number) nVar.invoke(v0Var6, Integer.valueOf(i10))).intValue() : 0, y3.b.b(0, 0, 0, 0, 15), this.f5904d.invoke());
            }
        }
        a4.a.b("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        return e(wVar, list, i10, new fo.b(27, (byte) 0));
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        return f(wVar, list, i10, new fo.b(26, (byte) 0));
    }

    @Override
    public final z2.x0 j(z2.y0 r44, java.util.List r45, long r46) {
        throw new UnsupportedOperationException("Method not decompiled: g1.p5.j(z2.y0, java.util.List, long):z2.x0");
    }
}
