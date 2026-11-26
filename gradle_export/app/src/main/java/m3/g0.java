package m3;

import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import s10.w0;

public abstract class g0 {
    public static final w0 A;
    public static final w0 B;
    public static final w0 C;
    public static final f0 D;
    public static final f0 E;
    public static final f0 F;

    public static final w0 f10427a;

    public static final w0 f10428b;

    public static final w0 f10429c;

    public static final w0 f10430d;

    public static final w0 f10431e;

    public static final w0 f10432f;

    public static final w0 f10433g;

    public static final w0 f10434h;

    public static final w0 f10436j;

    public static final w0 f10437k;
    public static final w0 l;
    public static final w0 m;

    public static final w0 f10438n;

    public static final w0 f10439o;

    public static final w0 f10440p;

    public static final w0 f10441q;

    public static final f0 f10443s;

    public static final f0 f10444t;

    public static final f0 f10445u;

    public static final w0 f10446v;

    public static final w0 f10447w;

    public static final f0 f10448x;

    public static final f0 f10449y;

    public static final f0 f10450z;

    public static final w0 f10435i = new w0(new b0(9), new c0(0), 15);

    public static final f0 f10442r = new f0(d0.A, e0.A);

    static {
        final int i10 = 1;
        f10427a = new w0(new lt.a(10), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i11 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i10) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i12 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i11 < size) {
                            Object obj17 = list9.get(i11);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i11++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i11 < size2) {
                            Object obj22 = list12.get(i11);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i11++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i13 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i13, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i14 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i15 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i16 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i17 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i14, i15, j12, qVar2, xVar, iVar2, i16, i17, sVar);
                }
            }
        }, 15);
        final int i11 = 13;
        f10428b = new w0(new lt.a(17), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i12 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i13 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i12 < size) {
                            Object obj17 = list9.get(i12);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i12++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i12 < size2) {
                            Object obj22 = list12.get(i12);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i12++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i14 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i14, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i15 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i16 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i17 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i18 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i15, i16, j12, qVar2, xVar, iVar2, i17, i18, sVar);
                }
            }
        }, 15);
        final int i12 = 25;
        f10429c = new w0(new lt.a(29), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i13 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i14 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i13 < size) {
                            Object obj17 = list9.get(i13);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i13++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i13 < size2) {
                            Object obj22 = list12.get(i13);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i13++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i15 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i15, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i16 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i17 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i18 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i19 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i16, i17, j12, qVar2, xVar, iVar2, i18, i19, sVar);
                }
            }
        }, 15);
        final int i13 = 27;
        f10430d = new w0(new b0(6), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i14 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i15 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i14 < size) {
                            Object obj17 = list9.get(i14);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i14++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i14 < size2) {
                            Object obj22 = list12.get(i14);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i14++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i16 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i16, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i17 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i18 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i19 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i110 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i17, i18, j12, qVar2, xVar, iVar2, i19, i110, sVar);
                }
            }
        }, 15);
        final int i14 = 28;
        f10431e = new w0(new b0(8), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i15 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i16 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i15 < size) {
                            Object obj17 = list9.get(i15);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i15++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i15 < size2) {
                            Object obj22 = list12.get(i15);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i15++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i17 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i17, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i18 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i19 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i110 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i111 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i18, i19, j12, qVar2, xVar, iVar2, i110, i111, sVar);
                }
            }
        }, 15);
        final int i15 = 10;
        f10432f = new w0(new lt.a(15), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i16 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i17 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i16 < size) {
                            Object obj17 = list9.get(i16);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i16++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i16 < size2) {
                            Object obj22 = list12.get(i16);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i16++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i18 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i18, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i19 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i110 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i111 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i112 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i19, i110, j12, qVar2, xVar, iVar2, i111, i112, sVar);
                }
            }
        }, 15);
        final int i16 = 21;
        f10433g = new w0(new lt.a(26), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i17 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i18 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i17 < size) {
                            Object obj17 = list9.get(i17);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i17++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i17 < size2) {
                            Object obj22 = list12.get(i17);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i17++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i19 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i19, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i110 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i111 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i112 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i113 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i110, i111, j12, qVar2, xVar, iVar2, i112, i113, sVar);
                }
            }
        }, 15);
        final int i17 = 29;
        f10434h = new w0(new b0(7), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i18 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i19 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i18 < size) {
                            Object obj17 = list9.get(i18);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i18++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i18 < size2) {
                            Object obj22 = list12.get(i18);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i18++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i110 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i110, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i111 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i112 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i113 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i114 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i111, i112, j12, qVar2, xVar, iVar2, i113, i114, sVar);
                }
            }
        }, 15);
        final int i18 = 0;
        f10436j = new w0(new b0(10), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i19 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i18) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i110 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i19 < size) {
                            Object obj17 = list9.get(i19);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i19++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i19 < size2) {
                            Object obj22 = list12.get(i19);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i19++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i111 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i111, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i112 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i113 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i114 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i115 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i112, i113, j12, qVar2, xVar, iVar2, i114, i115, sVar);
                }
            }
        }, 15);
        final int i19 = 2;
        f10437k = new w0(new lt.a(11), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i19) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i20 = 3;
        l = new w0(new lt.a(12), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i20) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i21 = 4;
        m = new w0(new lt.a(13), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i21) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i22 = 5;
        f10438n = new w0(new lt.a(14), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i22) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i23 = 6;
        f10439o = new w0(new lt.a(16), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i23) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i24 = 7;
        f10440p = new w0(new lt.a(18), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i24) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i25 = 8;
        f10441q = new w0(new lt.a(19), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i25) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i26 = 9;
        f10443s = new f0(new lt.a(20), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i26) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i27 = 11;
        f10444t = new f0(new lt.a(21), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i27) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i28 = 12;
        f10445u = new f0(new lt.a(22), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i28) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i29 = 14;
        f10446v = new w0(new lt.a(23), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i29) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i30 = 15;
        f10447w = new w0(new lt.a(24), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i30) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i31 = 16;
        f10448x = new f0(new lt.a(25), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i31) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i32 = 17;
        f10449y = new f0(new lt.a(27), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i32) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i33 = 18;
        f10450z = new f0(new lt.a(28), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i33) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i34 = 19;
        A = new w0(new b0(0), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i34) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i35 = 20;
        B = new w0(new b0(1), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i35) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i36 = 22;
        C = new w0(new b0(2), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i36) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        }, 15);
        final int i37 = 23;
        D = new f0(new b0(3), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i37) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i38 = 24;
        E = new f0(new b0(4), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i38) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
        final int i39 = 26;
        F = new f0(new b0(5), new u00.k() {
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                i2.t tVar;
                int i110 = 0;
                i0 i0Var = null;
                sVar = null;
                x3.s sVar = null;
                mVar = null;
                m mVar = null;
                nVar = null;
                n nVar = null;
                s0Var = null;
                s0 s0Var = null;
                t0Var = null;
                t0 t0Var = null;
                i0Var2 = null;
                i0 i0Var2 = null;
                vVar = null;
                v vVar = null;
                i0Var = null;
                switch (i39) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        u00.k kVar = (u00.k) g0.f10435i.C;
                        Boolean bool = Boolean.FALSE;
                        i0 i0Var3 = (kotlin.jvm.internal.m.a(obj2, bool) || obj2 == null) ? null : (i0) kVar.invoke(obj2);
                        Object obj3 = list.get(1);
                        i0 i0Var4 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (i0) kVar.invoke(obj3);
                        Object obj4 = list.get(2);
                        i0 i0Var5 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (i0) kVar.invoke(obj4);
                        Object obj5 = list.get(3);
                        if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                            i0Var = (i0) kVar.invoke(obj5);
                        }
                        return new o0(i0Var3, i0Var4, i0Var5, i0Var);
                    case 1:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj6 = list2.get(1);
                        List list3 = (kotlin.jvm.internal.m.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((u00.k) g0.f10428b.C).invoke(obj6);
                        Object obj7 = list2.get(0);
                        String str = obj7 != null ? (String) obj7 : null;
                        kotlin.jvm.internal.m.b(str);
                        return new h(list3, str);
                    case 2:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.l(((Integer) obj).intValue());
                    case 3:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list4 = (List) obj;
                        return new x3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                    case 4:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj8 = list5.get(0);
                        y3.p[] pVarArr = y3.o.f16598b;
                        u00.k kVar2 = g0.f10448x.B;
                        Boolean bool2 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj8, bool2);
                        y3.o oVar = obj8 != null ? (y3.o) kVar2.invoke(obj8) : null;
                        kotlin.jvm.internal.m.b(oVar);
                        long j9 = oVar.f16600a;
                        Object obj9 = list5.get(1);
                        kotlin.jvm.internal.m.a(obj9, bool2);
                        y3.o oVar2 = obj9 != null ? (y3.o) kVar2.invoke(obj9) : null;
                        kotlin.jvm.internal.m.b(oVar2);
                        return new x3.q(j9, oVar2.f16600a);
                    case 5:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.u(((Integer) obj).intValue());
                    case 6:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new x3.a(((Float) obj).floatValue());
                    case 7:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj10 = list6.get(0);
                        Integer num = obj10 != null ? (Integer) obj10 : null;
                        kotlin.jvm.internal.m.b(num);
                        int iIntValue = num.intValue();
                        Object obj11 = list6.get(1);
                        Integer num2 = obj11 != null ? (Integer) obj11 : null;
                        kotlin.jvm.internal.m.b(num2);
                        return new q0(h0.b(iIntValue, num2.intValue()));
                    case 8:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list7 = (List) obj;
                        Object obj12 = list7.get(0);
                        int i111 = i2.t.f7168h;
                        Boolean bool3 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj12, bool3);
                        if (obj12 != null) {
                            tVar = obj12.equals(bool3) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                        } else {
                            tVar = null;
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        long j10 = tVar.f7169a;
                        Object obj13 = list7.get(1);
                        f0 f0Var = g0.f10450z;
                        kotlin.jvm.internal.m.a(obj13, bool3);
                        h2.b bVar = obj13 != null ? (h2.b) f0Var.B.invoke(obj13) : null;
                        kotlin.jvm.internal.m.b(bVar);
                        long j11 = bVar.f6544a;
                        Object obj14 = list7.get(2);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        kotlin.jvm.internal.m.b(f3);
                        return new i2.s0(j10, j11, f3.floatValue());
                    case 9:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.k(((Integer) obj).intValue());
                    case 10:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list8 = (List) obj;
                        Object obj15 = list8.get(0);
                        String str2 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str2);
                        Object obj16 = list8.get(1);
                        return new n(str2, (kotlin.jvm.internal.m.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj16), null);
                    case 11:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.m(((Integer) obj).intValue());
                    case 12:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.d(((Integer) obj).intValue());
                    case 13:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        ArrayList arrayList = new ArrayList(list9.size());
                        int size = list9.size();
                        while (i110 < size) {
                            Object obj17 = list9.get(i110);
                            f fVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (f) ((u00.k) g0.f10429c.C).invoke(obj17);
                            kotlin.jvm.internal.m.b(fVar);
                            arrayList.add(fVar);
                            i110++;
                        }
                        return arrayList;
                    case 14:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.o(((Integer) obj).intValue());
                    case 15:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new q3.p(((Integer) obj).intValue());
                    case 16:
                        Boolean bool4 = Boolean.FALSE;
                        if (kotlin.jvm.internal.m.a(obj, bool4)) {
                            return new y3.o(y3.o.f16599c);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list10 = (List) obj;
                        Object obj18 = list10.get(0);
                        Float f10 = obj18 != null ? (Float) obj18 : null;
                        kotlin.jvm.internal.m.b(f10);
                        float fFloatValue = f10.floatValue();
                        Object obj19 = list10.get(1);
                        f0 f0Var2 = g0.f10449y;
                        kotlin.jvm.internal.m.a(obj19, bool4);
                        y3.p pVar = obj19 != null ? (y3.p) f0Var2.B.invoke(obj19) : null;
                        kotlin.jvm.internal.m.b(pVar);
                        return new y3.o(kh.o.F(fFloatValue, pVar.f16601a));
                    case 17:
                        if (kotlin.jvm.internal.m.a(obj, 0)) {
                            return new y3.p(8589934592L);
                        }
                        return kotlin.jvm.internal.m.a(obj, 1) ? new y3.p(4294967296L) : new y3.p(0L);
                    case TYPE_SINT64_VALUE:
                        if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                            return new h2.b(9205357640488583168L);
                        }
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list11 = (List) obj;
                        Object obj20 = list11.get(0);
                        Float f11 = obj20 != null ? (Float) obj20 : null;
                        kotlin.jvm.internal.m.b(f11);
                        float fFloatValue2 = f11.floatValue();
                        Object obj21 = list11.get(1);
                        Float f12 = obj21 != null ? (Float) obj21 : null;
                        kotlin.jvm.internal.m.b(f12);
                        return new h2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list12 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list12.size());
                        int size2 = list12.size();
                        while (i110 < size2) {
                            Object obj22 = list12.get(i110);
                            t3.a aVar = (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (t3.a) ((u00.k) g0.B.C).invoke(obj22);
                            kotlin.jvm.internal.m.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new t3.b(arrayList2);
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new t3.a(localeForLanguageTag);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list13 = (List) obj;
                        Object obj23 = list13.get(0);
                        String str4 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.b(str4);
                        Object obj24 = list13.get(1);
                        return new m(str4, (kotlin.jvm.internal.m.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (o0) ((u00.k) g0.f10436j.C).invoke(obj24), null);
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj25 = list14.get(0);
                        float f13 = x3.f.f16406b;
                        f0 f0Var3 = g0.D;
                        Boolean bool5 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj25, bool5);
                        x3.f fVar2 = obj25 != null ? (x3.f) f0Var3.B.invoke(obj25) : null;
                        kotlin.jvm.internal.m.b(fVar2);
                        float f14 = fVar2.f16409a;
                        Object obj26 = list14.get(1);
                        f0 f0Var4 = g0.E;
                        kotlin.jvm.internal.m.a(obj26, bool5);
                        x3.h hVar = obj26 != null ? (x3.h) f0Var4.B.invoke(obj26) : null;
                        kotlin.jvm.internal.m.b(hVar);
                        int i112 = hVar.f16411a;
                        Object obj27 = list14.get(2);
                        f0 f0Var5 = g0.F;
                        kotlin.jvm.internal.m.a(obj27, bool5);
                        x3.g gVar = obj27 != null ? (x3.g) f0Var5.B.invoke(obj27) : null;
                        kotlin.jvm.internal.m.b(gVar);
                        return new x3.i(f14, i112, gVar.f16410a);
                    case 23:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        x3.f.a(fFloatValue3);
                        return new x3.f(fFloatValue3);
                    case 24:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.h(((Integer) obj).intValue());
                    case 25:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list15 = (List) obj;
                        Object obj28 = list15.get(0);
                        j jVar = obj28 != null ? (j) obj28 : null;
                        kotlin.jvm.internal.m.b(jVar);
                        Object obj29 = list15.get(2);
                        Integer num3 = obj29 != null ? (Integer) obj29 : null;
                        kotlin.jvm.internal.m.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj30 = list15.get(3);
                        Integer num4 = obj30 != null ? (Integer) obj30 : null;
                        kotlin.jvm.internal.m.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj31 = list15.get(4);
                        String str5 = obj31 != null ? (String) obj31 : null;
                        kotlin.jvm.internal.m.b(str5);
                        switch (jVar.ordinal()) {
                            case 0:
                                Object obj32 = list15.get(1);
                                w0 w0Var = g0.f10434h;
                                if (!kotlin.jvm.internal.m.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    vVar = (v) ((u00.k) w0Var.C).invoke(obj32);
                                }
                                kotlin.jvm.internal.m.b(vVar);
                                return new f(iIntValue2, iIntValue3, vVar, str5);
                            case 1:
                                Object obj33 = list15.get(1);
                                w0 w0Var2 = g0.f10435i;
                                if (!kotlin.jvm.internal.m.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    i0Var2 = (i0) ((u00.k) w0Var2.C).invoke(obj33);
                                }
                                kotlin.jvm.internal.m.b(i0Var2);
                                return new f(iIntValue2, iIntValue3, i0Var2, str5);
                            case 2:
                                Object obj34 = list15.get(1);
                                w0 w0Var3 = g0.f10430d;
                                if (!kotlin.jvm.internal.m.a(obj34, Boolean.FALSE) && obj34 != null) {
                                    t0Var = (t0) ((u00.k) w0Var3.C).invoke(obj34);
                                }
                                kotlin.jvm.internal.m.b(t0Var);
                                return new f(iIntValue2, iIntValue3, t0Var, str5);
                            case 3:
                                Object obj35 = list15.get(1);
                                w0 w0Var4 = g0.f10431e;
                                if (!kotlin.jvm.internal.m.a(obj35, Boolean.FALSE) && obj35 != null) {
                                    s0Var = (s0) ((u00.k) w0Var4.C).invoke(obj35);
                                }
                                kotlin.jvm.internal.m.b(s0Var);
                                return new f(iIntValue2, iIntValue3, s0Var, str5);
                            case 4:
                                Object obj36 = list15.get(1);
                                w0 w0Var5 = g0.f10432f;
                                if (!kotlin.jvm.internal.m.a(obj36, Boolean.FALSE) && obj36 != null) {
                                    nVar = (n) ((u00.k) w0Var5.C).invoke(obj36);
                                }
                                kotlin.jvm.internal.m.b(nVar);
                                return new f(iIntValue2, iIntValue3, nVar, str5);
                            case 5:
                                Object obj37 = list15.get(1);
                                w0 w0Var6 = g0.f10433g;
                                if (!kotlin.jvm.internal.m.a(obj37, Boolean.FALSE) && obj37 != null) {
                                    mVar = (m) ((u00.k) w0Var6.C).invoke(obj37);
                                }
                                kotlin.jvm.internal.m.b(mVar);
                                return new f(iIntValue2, iIntValue3, mVar, str5);
                            case 6:
                                Object obj38 = list15.get(1);
                                String str6 = obj38 != null ? (String) obj38 : null;
                                kotlin.jvm.internal.m.b(str6);
                                return new f(iIntValue2, iIntValue3, new k0(str6), str5);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case RuntimeVersion.MINOR:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new x3.g(((Integer) obj).intValue());
                    case 27:
                        String str7 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new t0(str7);
                    case 28:
                        String str8 = obj != null ? (String) obj : null;
                        kotlin.jvm.internal.m.b(str8);
                        return new s0(str8);
                    default:
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj39 = list16.get(0);
                        f0 f0Var6 = g0.f10443s;
                        Boolean bool6 = Boolean.FALSE;
                        kotlin.jvm.internal.m.a(obj39, bool6);
                        x3.k kVar3 = obj39 != null ? (x3.k) f0Var6.B.invoke(obj39) : null;
                        kotlin.jvm.internal.m.b(kVar3);
                        int i113 = kVar3.f16416a;
                        Object obj40 = list16.get(1);
                        f0 f0Var7 = g0.f10444t;
                        kotlin.jvm.internal.m.a(obj40, bool6);
                        x3.m mVar2 = obj40 != null ? (x3.m) f0Var7.B.invoke(obj40) : null;
                        kotlin.jvm.internal.m.b(mVar2);
                        int i114 = mVar2.f16421a;
                        Object obj41 = list16.get(2);
                        y3.p[] pVarArr2 = y3.o.f16598b;
                        f0 f0Var8 = g0.f10448x;
                        kotlin.jvm.internal.m.a(obj41, bool6);
                        y3.o oVar3 = obj41 != null ? (y3.o) f0Var8.B.invoke(obj41) : null;
                        kotlin.jvm.internal.m.b(oVar3);
                        long j12 = oVar3.f16600a;
                        Object obj42 = list16.get(3);
                        x3.q qVar = x3.q.f16426c;
                        x3.q qVar2 = (kotlin.jvm.internal.m.a(obj42, bool6) || obj42 == null) ? null : (x3.q) ((u00.k) g0.m.C).invoke(obj42);
                        Object obj43 = list16.get(4);
                        x xVar = (kotlin.jvm.internal.m.a(obj43, bool6) || obj43 == null) ? null : (x) ((u00.k) h0.f10451a.C).invoke(obj43);
                        Object obj44 = list16.get(5);
                        x3.i iVar = x3.i.f16412d;
                        x3.i iVar2 = (kotlin.jvm.internal.m.a(obj44, bool6) || obj44 == null) ? null : (x3.i) ((u00.k) g0.C.C).invoke(obj44);
                        Object obj45 = list16.get(6);
                        x3.e eVar = (kotlin.jvm.internal.m.a(obj45, bool6) || obj45 == null) ? null : (x3.e) ((u00.k) h0.f10453c.C).invoke(obj45);
                        kotlin.jvm.internal.m.b(eVar);
                        int i115 = eVar.f16405a;
                        Object obj46 = list16.get(7);
                        f0 f0Var9 = g0.f10445u;
                        kotlin.jvm.internal.m.a(obj46, bool6);
                        x3.d dVar = obj46 != null ? (x3.d) f0Var9.B.invoke(obj46) : null;
                        kotlin.jvm.internal.m.b(dVar);
                        int i116 = dVar.f16403a;
                        Object obj47 = list16.get(8);
                        boolean zA = kotlin.jvm.internal.m.a(obj47, bool6);
                        w0 w0Var7 = h0.f10454d;
                        if (!zA && obj47 != null) {
                            sVar = (x3.s) ((u00.k) w0Var7.C).invoke(obj47);
                        }
                        return new v(i113, i114, j12, qVar2, xVar, iVar2, i115, i116, sVar);
                }
            }
        });
    }

    public static final Object a(Object obj, y1.j jVar, y1.b bVar) {
        Object objC;
        return (obj == null || (objC = jVar.c(bVar, obj)) == null) ? Boolean.FALSE : objC;
    }
}
