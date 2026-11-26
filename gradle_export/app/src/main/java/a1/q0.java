package a1;

import android.os.Bundle;
import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.List;

public final class q0 implements u00.k {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;

    public q0(d6.f1 f1Var, int i10, String str) {
        this.A = 1;
        this.D = f1Var;
        this.B = i10;
        this.C = str;
    }

    public q0(Object obj, int i10, Object obj2, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
        this.D = obj2;
    }

    public q0(Object obj, Object obj2, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.D = obj2;
        this.B = i10;
    }

    public final Object invoke(Object obj) {
        Integer numValueOf;
        int i10;
        int i11;
        int i12;
        switch (this.A) {
            case 0:
                String str = (String) this.C;
                List list = (List) this.D;
                z0.a aVar = (z0.a) obj;
                m3.q0 q0Var = aVar.E;
                if (q0Var != null) {
                    long j9 = q0Var.f10520a;
                    int i13 = (int) (j9 >> 32);
                    x0.v(aVar, i13, (int) (j9 & 4294967295L), str);
                    if (str.length() > 0) {
                        aVar.d(i13, str.length() + i13, list);
                    }
                } else {
                    int iG = m3.q0.g(aVar.D);
                    x0.v(aVar, iG, m3.q0.f(aVar.D), str);
                    if (str.length() > 0) {
                        aVar.d(iG, str.length() + iG, list);
                    }
                }
                int iG2 = m3.q0.g(aVar.D);
                int i14 = this.B;
                int iY = ab.a0.y(i14 > 0 ? (iG2 + i14) - 1 : (iG2 + i14) - str.length(), 0, aVar.B.length());
                aVar.f(m3.h0.b(iY, iY));
                return g00.b0.a;
            case 1:
                d6.f1 f1Var = (d6.f1) this.D;
                String str2 = (String) this.C;
                f6.a aVar2 = (f6.a) obj;
                f6.d dVarU = f6.e.u();
                String canonicalName = f1Var.getClass().getCanonicalName();
                dVarU.c();
                f6.e.n((f6.e) dVarU.B, canonicalName);
                dVarU.c();
                f6.e.o((f6.e) dVarU.B, this.B);
                dVarU.c();
                f6.e.p((f6.e) dVarU.B, str2);
                f6.e eVar = (f6.e) dVarU.a();
                aVar2.c();
                f6.n.q((f6.n) aVar2.B, eVar);
                return g00.b0.a;
            case 2:
                d6.f1 f1Var2 = (d6.f1) this.C;
                Bundle bundle = (Bundle) this.D;
                f6.a aVar3 = (f6.a) obj;
                f6.h hVarU = f6.i.u();
                String canonicalName2 = f1Var2.getClass().getCanonicalName();
                hVarU.c();
                f6.i.n((f6.i) hVarU.B, canonicalName2);
                hVarU.c();
                f6.i.o((f6.i) hVarU.B, this.B);
                Parcel parcelObtain = Parcel.obtain();
                bundle.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                androidx.glance.appwidget.protobuf.h hVarC = androidx.glance.appwidget.protobuf.i.c(0, bArrMarshall.length, bArrMarshall);
                hVarU.c();
                f6.i.p((f6.i) hVarU.B, hVarC);
                f6.i iVar = (f6.i) hVarU.a();
                aVar3.c();
                f6.n.o((f6.n) aVar3.B, iVar);
                return g00.b0.a;
            case 3:
                String str3 = (String) this.C;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.D;
                String str4 = (String) obj;
                kotlin.jvm.internal.m.e(str4, "day");
                boolean zEquals = str4.equals(str3);
                int iIntValue = this.B;
                if (zEquals) {
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    ss.c cVar = (ss.c) linkedHashMap.get(str4);
                    numValueOf = cVar != null ? Integer.valueOf(cVar.c) : null;
                }
                if (numValueOf != null) {
                    Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                }
                return Long.valueOf(((long) iIntValue) * 60000);
            case 4:
                l1.r1 r1Var = (l1.r1) this.C;
                u.c0 c0Var = (u.c0) this.D;
                l1.m mVar = (l1.m) obj;
                int i15 = r1Var.f9922e;
                int i16 = this.B;
                if (i15 == i16 && kotlin.jvm.internal.m.a(c0Var, r1Var.f9923f) && (mVar instanceof l1.p)) {
                    long[] jArr = c0Var.f14831a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j10 = jArr[i17];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8;
                                int i19 = 8 - ((~(i17 - length)) >>> 31);
                                int i20 = 0;
                                while (i20 < i19) {
                                    if ((255 & j10) < 128) {
                                        int i21 = (i17 << 3) + i20;
                                        Object obj2 = c0Var.f14832b[i21];
                                        boolean z10 = c0Var.f14833c[i21] != i16;
                                        if (z10) {
                                            l1.p pVar = (l1.p) mVar;
                                            i12 = i18;
                                            u.i0 i0Var = pVar.G;
                                            va.a.b0(i0Var, obj2, r1Var);
                                            i11 = i16;
                                            if (obj2 instanceof l1.w) {
                                                l1.w wVar = (l1.w) obj2;
                                                if (!i0Var.c(wVar)) {
                                                    va.a.c0(pVar.J, wVar);
                                                }
                                                u.i0 i0Var2 = r1Var.f9924g;
                                                if (i0Var2 != null) {
                                                    i0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            i11 = i16;
                                            i12 = i18;
                                        }
                                        if (z10) {
                                            c0Var.f(i21);
                                        }
                                    } else {
                                        i11 = i16;
                                        i12 = i18;
                                    }
                                    j10 >>= i12;
                                    i20++;
                                    i18 = i12;
                                    i16 = i11;
                                }
                                i10 = i16;
                                if (i19 == i18) {
                                }
                            } else {
                                i10 = i16;
                            }
                            if (i17 != length) {
                                i17++;
                                i16 = i10;
                            }
                        }
                    }
                }
                return g00.b0.a;
            case 5:
                q0.k2 k2Var = (q0.k2) this.C;
                z2.l1 l1Var = (z2.l1) this.D;
                z2.k1 k1Var = (z2.k1) obj;
                int i22 = k2Var.B;
                q0.b2 b2Var = k2Var.A;
                r3.c0 c0Var2 = k2Var.C;
                q0.e2 e2Var = (q0.e2) k2Var.D.invoke();
                b2Var.a(d0.q1.A, q0.q.o(k1Var, i22, c0Var2, e2Var != null ? e2Var.f12608a : null, false, l1Var.A), this.B, l1Var.B);
                z2.k1.k(k1Var, l1Var, 0, Math.round(-b2Var.f12569a.h()));
                return g00.b0.a;
            default:
                z.n1 n1Var = (z.n1) this.C;
                z2.l1 l1Var2 = (z2.l1) this.D;
                z2.k1 k1Var2 = (z2.k1) obj;
                int iH = n1Var.O.f16951a.h();
                if (iH < 0) {
                    iH = 0;
                }
                int i23 = this.B;
                if (iH > i23) {
                    iH = i23;
                }
                int i24 = -iH;
                boolean z11 = n1Var.P;
                int i25 = z11 ? 0 : i24;
                if (!z11) {
                    i24 = 0;
                }
                k1Var2.A = true;
                z2.k1.o(k1Var2, l1Var2, i25, i24);
                k1Var2.A = false;
                return g00.b0.a;
        }
    }
}
