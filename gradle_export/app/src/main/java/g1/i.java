package g1;

public final class i implements u00.n {
    public final int A;
    public final l1.z0 B;

    public i(l1.z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        float fMin2;
        int i10 = this.A;
        float fMin3 = 0.0f;
        g00.b0 b0Var = g00.b0.a;
        l1.z0 z0Var = this.B;
        switch (i10) {
            case 0:
                y3.k kVar = (y3.k) obj;
                y3.k kVar2 = (y3.k) obj2;
                float f3 = z3.f6036a;
                int i11 = kVar2.f16592a;
                int i12 = kVar2.f16595d;
                int i13 = kVar2.f16594c;
                int i14 = kVar2.f16593b;
                int i15 = kVar.f16594c;
                int i16 = kVar.f16593b;
                int i17 = kVar.f16595d;
                int i18 = kVar.f16592a;
                if (i11 >= i15) {
                    fMin = 0.0f;
                } else if (i13 <= i18) {
                    fMin = 1.0f;
                } else if (kVar2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(kVar.f16594c, i13) + Math.max(i18, i11)) / 2) - i11) / kVar2.d();
                }
                if (i14 < i17) {
                    if (i12 <= i16) {
                        fMin3 = 1.0f;
                    } else if (kVar2.b() != 0) {
                        fMin3 = (((Math.min(i17, i12) + Math.max(i16, i14)) / 2) - i14) / kVar2.b();
                    }
                }
                z0Var.setValue(new i2.w0(i2.b0.h(fMin, fMin3)));
                break;
            case 1:
                y3.k kVar3 = (y3.k) obj;
                y3.k kVar4 = (y3.k) obj2;
                kotlin.jvm.internal.m.e(kVar3, "parentBounds");
                kotlin.jvm.internal.m.e(kVar4, "menuBounds");
                int i19 = kVar3.f16593b;
                int i20 = kVar3.f16595d;
                int i21 = kVar3.f16592a;
                int i22 = kVar4.f16595d;
                int i23 = kVar4.f16594c;
                int i24 = kVar4.f16593b;
                int i25 = kVar4.f16592a;
                int i26 = kVar3.f16594c;
                if (i25 >= i26) {
                    fMin2 = 0.0f;
                } else if (i23 <= i21) {
                    fMin2 = 1.0f;
                } else if (kVar4.d() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(i26, i23) + Math.max(i21, i25)) / 2) - i25) / kVar4.d();
                }
                if (i24 < i20) {
                    if (i22 <= i19) {
                        fMin3 = 1.0f;
                    } else if (kVar4.b() != 0) {
                        fMin3 = (((Math.min(i20, i22) + Math.max(i19, i24)) / 2) - i24) / kVar4.b();
                    }
                }
                z0Var.setValue(new i2.w0(i2.b0.h(fMin2, fMin3)));
                break;
            case 2:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                } else {
                    o3.a(com.google.android.gms.internal.measurement.y3.R(((Boolean) z0Var.getValue()).booleanValue() ? 2131231183 : 2131231102, jVar, 0), "TimePickerTypeButtonIcon", null, dl.a.d, jVar, 56, 4);
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (!g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var2.V();
                } else {
                    boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                    Object objN = g0Var2.N();
                    if (objN == l1.i.f9868a) {
                        objN = new ct.k(z0Var, 24);
                        g0Var2.n0(objN);
                    }
                    up.i.c(zBooleanValue, (u00.a) objN, jVar2, 48);
                }
                break;
        }
        return b0Var;
    }
}
