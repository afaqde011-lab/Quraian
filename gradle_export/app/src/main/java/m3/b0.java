package m3;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import g1.o3;
import g1.z6;
import h0.z1;
import java.util.ArrayList;
import java.util.List;
import l1.m1;
import s10.w0;

public final class b0 implements u00.n {
    public final int A;

    public b0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        b2.o oVar = b2.o.A;
        int i11 = 10;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                y1.b bVar = (y1.b) obj;
                List list = ((t3.b) obj2).A;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(g0.a((t3.a) list.get(i12), g0.B, bVar));
                }
                return arrayList;
            case 1:
                return ((t3.a) obj2).f14352a.toLanguageTag();
            case 2:
                y1.b bVar2 = (y1.b) obj;
                x3.i iVar = (x3.i) obj2;
                return va.a.i(g0.a(new x3.f(iVar.f16413a), g0.D, bVar2), g0.a(new x3.h(iVar.f16414b), g0.E, bVar2), g0.a(new x3.g(iVar.f16415c), g0.F, bVar2));
            case 3:
                return Float.valueOf(((x3.f) obj2).f16409a);
            case 4:
                return Integer.valueOf(((x3.h) obj2).f16411a);
            case 5:
                return Integer.valueOf(((x3.g) obj2).f16410a);
            case 6:
                return ((t0) obj2).f10536a;
            case 7:
                y1.b bVar3 = (y1.b) obj;
                v vVar = (v) obj2;
                Object objA = g0.a(new x3.k(vVar.f10537a), g0.f10443s, bVar3);
                Object objA2 = g0.a(new x3.m(vVar.f10538b), g0.f10444t, bVar3);
                Object objA3 = g0.a(new y3.o(vVar.f10539c), g0.f10448x, bVar3);
                x3.q qVar = vVar.f10540d;
                x3.q qVar2 = x3.q.f16426c;
                Object objA4 = g0.a(qVar, g0.m, bVar3);
                Object objA5 = g0.a(vVar.f10541e, h0.f10451a, bVar3);
                x3.i iVar2 = vVar.f10542f;
                x3.i iVar3 = x3.i.f16412d;
                return va.a.i(objA, objA2, objA3, objA4, objA5, g0.a(iVar2, g0.C, bVar3), g0.a(new x3.e(vVar.f10543g), h0.f10453c, bVar3), g0.a(new x3.d(vVar.f10544h), g0.f10445u, bVar3), g0.a(vVar.f10545i, h0.f10454d, bVar3));
            case 8:
                return ((s0) obj2).f10532a;
            case 9:
                y1.b bVar4 = (y1.b) obj;
                i0 i0Var = (i0) obj2;
                i2.t tVar = new i2.t(i0Var.f10457a.a());
                f0 f0Var = g0.f10442r;
                Object objA6 = g0.a(tVar, f0Var, bVar4);
                y3.o oVar2 = new y3.o(i0Var.f10458b);
                f0 f0Var2 = g0.f10448x;
                Object objA7 = g0.a(oVar2, f0Var2, bVar4);
                q3.u uVar = i0Var.f10459c;
                q3.u uVar2 = q3.u.B;
                Object objA8 = g0.a(uVar, g0.f10438n, bVar4);
                Object objA9 = g0.a(i0Var.f10460d, g0.f10446v, bVar4);
                Object objA10 = g0.a(i0Var.f10461e, g0.f10447w, bVar4);
                String str = i0Var.f10463g;
                Object objA11 = g0.a(new y3.o(i0Var.f10464h), f0Var2, bVar4);
                Object objA12 = g0.a(i0Var.f10465i, g0.f10439o, bVar4);
                Object objA13 = g0.a(i0Var.f10466j, g0.l, bVar4);
                t3.b bVar5 = i0Var.f10467k;
                t3.b bVar6 = t3.b.C;
                Object objA14 = g0.a(bVar5, g0.A, bVar4);
                Object objA15 = g0.a(new i2.t(i0Var.l), f0Var, bVar4);
                Object objA16 = g0.a(i0Var.m, g0.f10437k, bVar4);
                i2.s0 s0Var = i0Var.f10468n;
                i2.s0 s0Var2 = i2.s0.f7158d;
                return va.a.i(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, g0.a(s0Var, g0.f10441q, bVar4));
            case 10:
                y1.b bVar7 = (y1.b) obj;
                o0 o0Var = (o0) obj2;
                i0 i0Var2 = o0Var.f10502a;
                w0 w0Var = g0.f10435i;
                return va.a.i(g0.a(i0Var2, w0Var, bVar7), g0.a(o0Var.f10503b, w0Var, bVar7), g0.a(o0Var.f10504c, w0Var, bVar7), g0.a(o0Var.f10505d, w0Var, bVar7));
            case 11:
                x xVar = (x) obj2;
                Boolean boolValueOf = Boolean.valueOf(xVar.f10549a);
                w0 w0Var2 = g0.f10427a;
                return va.a.i(boolValueOf, g0.a(new l(xVar.f10550b), h0.f10452b, (y1.b) obj));
            case 12:
                return Integer.valueOf(((l) obj2).f10477a);
            case 13:
                return Integer.valueOf(((x3.e) obj2).f16405a);
            case 14:
                x3.s sVar = (x3.s) obj2;
                return va.a.i(g0.a(new x3.r(sVar.f16432a), h0.f10455e, (y1.b) obj), Boolean.valueOf(sVar.f16433b));
            case 15:
                return Integer.valueOf(((x3.r) obj2).f16429a);
            case 16:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j9 = dl.a.k;
                    p0.e eVar = p0.f.f12243a;
                    b2.r rVarC = f2.h.c(z1.m(z.n.f(oVar, j9, eVar), 18), eVar);
                    z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarC, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD, jVar, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                    l1.q.E(jVar, b3.h.f2041h);
                    l1.q.I(rVarC2, jVar, b3.h.f2037d);
                    o3.a(y3.R(2131231104, jVar, 0), null, z1.m(oVar, 10), dl.a.L, jVar, 440, 0);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 17:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(z3.U(jVar2, 2131886943), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 262142);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case TYPE_SINT64_VALUE:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o3.a(y3.R(2131231375, jVar3, 0), null, z1.m(oVar, 16), i2.t.b(0.6f, dl.a.k), jVar3, 440, 0);
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((Integer) obj).getClass();
                List list2 = (List) obj2;
                kotlin.jvm.internal.m.e(list2, "row");
                return h00.q.R0(list2, (CharSequence) null, (String) null, (String) null, new c0(i11), 31);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((Integer) obj).getClass();
                ju.d dVar = (ju.d) obj2;
                kotlin.jvm.internal.m.e(dVar, "review");
                return dVar.b + "_" + dVar.d;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((n6.a) obj).f11108a = (String) obj2;
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((n6.a) obj).f11111d = (b6.m) obj2;
                return b0Var;
            case 23:
                ((n6.a) obj).f11109b = (n6.e) obj2;
                return b0Var;
            case 24:
                ((n6.a) obj).f11110c = ((Integer) obj2).intValue();
                return b0Var;
            case 25:
                e60.a aVar = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                return new pz.l((ly.f) aVar.f(b0Var2.b(ly.f.class), (a60.a) null, (b60.a) null), (nm.b) aVar.f(b0Var2.b(nm.b.class), (a60.a) null, (b60.a) null));
            case RuntimeVersion.MINOR:
                e60.a aVar2 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                return new az.r((wo.b0) aVar2.f(b0Var3.b(wo.b0.class), (a60.a) null, (b60.a) null), (pm.c) aVar2.f(b0Var3.b(pm.c.class), (a60.a) null, (b60.a) null));
            case 27:
                e60.a aVar3 = (e60.a) obj;
                a60.a aVar4 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(aVar3, "$this$viewModel");
                kotlin.jvm.internal.m.e(aVar4, "<destruct>");
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                return new zy.p((DeleteAccountCodeLauncher) aVar4.a(0, b0Var4.b(DeleteAccountCodeLauncher.class)), (wo.b0) aVar3.f(b0Var4.b(wo.b0.class), (a60.a) null, (b60.a) null), (wo.c0) aVar3.f(b0Var4.b(wo.c0.class), (a60.a) null, (b60.a) null), (pm.c) aVar3.f(b0Var4.b(pm.c.class), (a60.a) null, (b60.a) null), (AuthAnalytics) aVar3.f(b0Var4.b(AuthAnalytics.class), (a60.a) null, (b60.a) null), (nm.b) aVar3.f(b0Var4.b(nm.b.class), (a60.a) null, (b60.a) null));
            case 28:
                e60.a aVar5 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                Object objB = ((l60.q0) aVar5.f(kotlin.jvm.internal.a0.a.b(l60.q0.class), (a60.a) null, (b60.a) null)).b(my.a.class);
                kotlin.jvm.internal.m.d(objB, "create(...)");
                return (my.a) objB;
            default:
                e60.a aVar6 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new qy.a((pm.c) aVar6.f(kotlin.jvm.internal.a0.a.b(pm.c.class), (a60.a) null, (b60.a) null));
        }
    }
}
