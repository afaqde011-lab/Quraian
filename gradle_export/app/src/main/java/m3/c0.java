package m3;

import bv.e3;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.mchutov.quranify.settings.presentation.analytics.SettingsAnalytics;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute;
import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute;
import gz.m1;
import h0.p1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s10.w0;

public final class c0 implements u00.k {
    public final int A;

    public c0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) {
        i2.t tVar;
        i2.t tVar2;
        int i10 = this.A;
        int i11 = 27;
        i2.s0 s0Var = null;
        lVar = null;
        l lVar = null;
        s0Var = null;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i12 = i2.t.f7168h;
                Boolean bool = Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj2, bool);
                if (obj2 != null) {
                    tVar = obj2.equals(bool) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj2).intValue()));
                } else {
                    tVar = null;
                }
                kotlin.jvm.internal.m.b(tVar);
                long j9 = tVar.f7169a;
                Object obj3 = list.get(1);
                y3.p[] pVarArr = y3.o.f16598b;
                u00.k kVar = g0.f10448x.B;
                kotlin.jvm.internal.m.a(obj3, bool);
                y3.o oVar = obj3 != null ? (y3.o) kVar.invoke(obj3) : null;
                kotlin.jvm.internal.m.b(oVar);
                long j10 = oVar.f16600a;
                Object obj4 = list.get(2);
                q3.u uVar = q3.u.B;
                q3.u uVar2 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (q3.u) ((u00.k) g0.f10438n.C).invoke(obj4);
                Object obj5 = list.get(3);
                q3.o oVar2 = (kotlin.jvm.internal.m.a(obj5, bool) || obj5 == null) ? null : (q3.o) ((u00.k) g0.f10446v.C).invoke(obj5);
                Object obj6 = list.get(4);
                q3.p pVar = (kotlin.jvm.internal.m.a(obj6, bool) || obj6 == null) ? null : (q3.p) ((u00.k) g0.f10447w.C).invoke(obj6);
                Object obj7 = list.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list.get(7);
                kotlin.jvm.internal.m.a(obj8, bool);
                y3.o oVar3 = obj8 != null ? (y3.o) kVar.invoke(obj8) : null;
                kotlin.jvm.internal.m.b(oVar3);
                long j11 = oVar3.f16600a;
                Object obj9 = list.get(8);
                x3.a aVar = (kotlin.jvm.internal.m.a(obj9, bool) || obj9 == null) ? null : (x3.a) ((u00.k) g0.f10439o.C).invoke(obj9);
                Object obj10 = list.get(9);
                x3.p pVar2 = (kotlin.jvm.internal.m.a(obj10, bool) || obj10 == null) ? null : (x3.p) ((u00.k) g0.l.C).invoke(obj10);
                Object obj11 = list.get(10);
                t3.b bVar = t3.b.C;
                t3.b bVar2 = (kotlin.jvm.internal.m.a(obj11, bool) || obj11 == null) ? null : (t3.b) ((u00.k) g0.A.C).invoke(obj11);
                Object obj12 = list.get(11);
                kotlin.jvm.internal.m.a(obj12, bool);
                if (obj12 != null) {
                    tVar2 = obj12.equals(bool) ? new i2.t(i2.t.f7167g) : new i2.t(i2.b0.c(((Integer) obj12).intValue()));
                } else {
                    tVar2 = null;
                }
                kotlin.jvm.internal.m.b(tVar2);
                long j12 = tVar2.f7169a;
                Object obj13 = list.get(12);
                x3.l lVar2 = (kotlin.jvm.internal.m.a(obj13, bool) || obj13 == null) ? null : (x3.l) ((u00.k) g0.f10437k.C).invoke(obj13);
                Object obj14 = list.get(13);
                i2.s0 s0Var2 = i2.s0.f7158d;
                w0 w0Var = g0.f10441q;
                if (!kotlin.jvm.internal.m.a(obj14, bool) && obj14 != null) {
                    s0Var = (i2.s0) ((u00.k) w0Var.C).invoke(obj14);
                }
                return new i0(j9, j10, uVar2, oVar2, pVar, (q3.i) null, str, j11, aVar, pVar2, bVar2, j12, lVar2, s0Var, 49184);
            case 1:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj15 = list2.get(0);
                Boolean bool2 = obj15 != null ? (Boolean) obj15 : null;
                kotlin.jvm.internal.m.b(bool2);
                boolean zBooleanValue = bool2.booleanValue();
                Object obj16 = list2.get(1);
                boolean zA = kotlin.jvm.internal.m.a(obj16, Boolean.FALSE);
                w0 w0Var2 = h0.f10452b;
                if (!zA && obj16 != null) {
                    lVar = (l) ((u00.k) w0Var2.C).invoke(obj16);
                }
                kotlin.jvm.internal.m.b(lVar);
                return new x(lVar.f10477a, zBooleanValue);
            case 2:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new l(((Integer) obj).intValue());
            case 3:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new x3.e(((Integer) obj).intValue());
            case 4:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                Object obj17 = list3.get(0);
                x3.r rVar = (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (x3.r) ((u00.k) h0.f10455e.C).invoke(obj17);
                kotlin.jvm.internal.m.b(rVar);
                int i13 = rVar.f16429a;
                Object obj18 = list3.get(1);
                Boolean bool3 = obj18 != null ? (Boolean) obj18 : null;
                kotlin.jvm.internal.m.b(bool3);
                return new x3.s(i13, bool3.booleanValue());
            case 5:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new x3.r(((Integer) obj).intValue());
            case 6:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 7:
                ju.h hVar = (ju.h) obj;
                kotlin.jvm.internal.m.e(hVar, "it");
                return Integer.valueOf(hVar.a);
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 9:
                kotlin.jvm.internal.m.e((String) obj, "it");
                return b0Var;
            case 10:
                ju.d dVar = (ju.d) obj;
                kotlin.jvm.internal.m.e(dVar, "it");
                return dVar.b + "_" + dVar.d;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                int iIntValue = ((Number) entry.getKey()).intValue();
                su.b bVar3 = (su.b) entry.getValue();
                return iIntValue + ":" + bVar3.a + "-" + bVar3.b;
            case 12:
                y50.a aVar2 = (y50.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "$this$module");
                ny.c cVar = new ny.c(12, (byte) 0);
                v50.c cVar2 = v50.c.B;
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                a10.d dVarB = b0Var2.b(ly.a.class);
                b60.b bVar4 = c60.a.e;
                aVar2.a(new w50.a(new v50.a(bVar4, dVarB, (b60.a) null, cVar, cVar2)));
                b0 b0Var3 = new b0(28);
                v50.c cVar3 = v50.c.A;
                aVar2.a(new w50.e(new v50.a(bVar4, b0Var2.b(my.a.class), (b60.a) null, b0Var3, cVar3)));
                aVar2.a(new w50.e(new v50.a(bVar4, b0Var2.b(my.b.class), (b60.a) null, new ny.c(4, (byte) 0), cVar3)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(iy.b.class), (b60.a) null, new ny.c(5, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(ly.f.class), (b60.a) null, new ny.c(6, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(iy.a.class), (b60.a) null, new ny.c(7, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(ly.d.class), (b60.a) null, new ny.c(8, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(ky.a.class), (b60.a) null, new ny.c(9, (byte) 0), cVar2)));
                aVar2.a(new w50.e(new v50.a(bVar4, b0Var2.b(sy.c.class), (b60.a) null, new ny.c(10, (byte) 0), cVar3)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(SettingsAnalytics.class), (b60.a) null, new ny.c(11, (byte) 0), cVar2)));
                aVar2.a(new w50.e(new v50.a(bVar4, b0Var2.b(sy.b.class), (b60.a) null, new ny.c(14, (byte) 0), cVar3)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(m1.class), (b60.a) null, new ny.c(15, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(dz.s.class), (b60.a) null, new ny.c(16, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(nz.n.class), (b60.a) null, new ny.c(17, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(ez.u.class), (b60.a) null, new ny.c(18, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(wy.p.class), (b60.a) null, new ny.c(19, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(uy.l.class), (b60.a) null, new ny.c(20, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(pz.l.class), (b60.a) null, new b0(25), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(az.r.class), (b60.a) null, new b0(26), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(zy.p.class), (b60.a) null, new b0(i11), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(qy.a.class), (b60.a) null, new b0(29), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(bz.s.class), (b60.a) null, new ny.c(0, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(jz.d0.class), (b60.a) null, new ny.c(1, (byte) 0), cVar2)));
                aVar2.a(new w50.a(new v50.a(bVar4, b0Var2.b(xy.o.class), (b60.a) null, new ny.c(2, (byte) 0), cVar2)));
                aVar2.a(new w50.e(new v50.a(bVar4, b0Var2.b(ty.a.class), (b60.a) null, new ny.c(3, (byte) 0), cVar3)));
                aVar2.b(new b60.b("SETTINGS_SCOPE_KEY"), new c0(13));
                return b0Var;
            case 13:
                f60.a aVar3 = (f60.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "$this$scope");
                LinkedHashMap linkedHashMapU = h00.d0.U(h00.d0.U(h00.d0.Q(new g00.k("transitionSpec", new c0(15))), h00.d0.Q(new g00.k("popTransitionSpec", new c0(16)))), h00.d0.Q(new g00.k("predictivePopTransitionSpec", new ny.c(13, (byte) 0))));
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                b60.c cVar4 = new b60.c(b0Var4.b(SettingsRoute.SettingsScreen.class));
                ny.e eVar = new ny.e(0);
                b60.b bVar5 = aVar3.a;
                v50.c cVar5 = v50.c.C;
                w50.d dVar2 = new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), cVar4, eVar, cVar5));
                y50.a aVar4 = aVar3.b;
                aVar4.a(dVar2);
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.NotificationScreen.class)), new ax.g(linkedHashMapU, 17), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.DownloadManagerScreen.class)), new ax.g(linkedHashMapU, 18), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.DebugControlsScreen.class)), new ax.g(linkedHashMapU, 19), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.EditDetailsScreen.class)), new ax.g(linkedHashMapU, 20), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.ChangePasswordScreen.class)), new ax.g(linkedHashMapU, 21), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.ManageSubscriptionScreen.class)), new ax.g(linkedHashMapU, 22), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.DevicesScreen.class)), new ax.g(linkedHashMapU, 23), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.CancellationBenefitsScreen.class)), new ax.g(linkedHashMapU, 24), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.CancellationQuestionnaireScreen.class)), new ax.g(linkedHashMapU, 25), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.DeleteAccountQuestionnaireScreen.class)), new ax.g(linkedHashMapU, 15), cVar5)));
                aVar4.a(new w50.d(new v50.a(bVar5, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(SettingsRoute.DeleteAccountCodeScreen.class)), new ax.g(linkedHashMapU, 16), cVar5)));
                return b0Var;
            case 14:
                f60.a aVar5 = (f60.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "<this>");
                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                aVar5.b.a(new w50.d(new v50.a(aVar5.a, b0Var5.b(u00.k.class), new b60.c(b0Var5.b(SettingsTabRoute.SettingsScreen.class)), new ny.e(1), v50.c.C)));
                return b0Var;
            case 15:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$transitionSpec");
                return w.m.d(w.s0.i(new e6.c(4)), w.s0.d(null, 3));
            case 16:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$popTransitionSpec");
                return w.m.d(w.s0.c(null, 3), w.s0.k(new e6.c(4)));
            case 17:
                a10.w[] wVarArr = j3.y.f8004a;
                ((j3.a0) obj).a(j3.w.f7982e, b0Var);
                return b0Var;
            case TYPE_SINT64_VALUE:
                return Integer.valueOf(-((Integer) obj).intValue());
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                y50.a aVar6 = (y50.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "$this$module");
                ny.c cVar6 = new ny.c(27, (byte) 0);
                v50.c cVar7 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                a10.d dVarB2 = b0Var6.b(aq.a.class);
                b60.b bVar6 = c60.a.e;
                aVar6.a(new w50.e(new v50.a(bVar6, dVarB2, (b60.a) null, cVar6, cVar7)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(nu.a.class), (b60.a) null, new ou.a(2), cVar7)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(mv.b.class), (b60.a) null, new ou.a(3), cVar7)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(xu.f.class), (b60.a) null, new ou.a(4), cVar7)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(nu.d.class), (b60.a) null, new ou.a(5), cVar7)));
                ny.c cVar8 = new ny.c(22, (byte) 0);
                v50.c cVar9 = v50.c.B;
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(qu.a.class), (b60.a) null, cVar8, cVar9)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(wu.a.class), (b60.a) null, new ny.c(23, (byte) 0), cVar9)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(ov.g.class), (b60.a) null, new ny.c(24, (byte) 0), cVar7)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(AudioPlayerAnalytics.class), (b60.a) null, new ny.c(25, (byte) 0), cVar9)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(AndroidAutoAnalytics.class), (b60.a) null, new ny.c(26, (byte) 0), cVar9)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(zu.a.class), (b60.a) null, new ny.c(28, (byte) 0), cVar7)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var6.b(uu.a.class), (b60.a) null, new ny.c(29, (byte) 0), cVar7)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(e3.class), (b60.a) null, new ou.a(0), cVar9)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var6.b(ev.c0.class), (b60.a) null, new ou.a(1), cVar9)));
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                kotlin.jvm.internal.m.e((String) obj, "it");
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                Map.Entry entry2 = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry2, "entry");
                pl.q qVar = (pl.q) entry2.getValue();
                Object key = entry2.getKey();
                h2.c cVar10 = qVar.a;
                int i14 = (int) cVar10.f6546a;
                int i15 = (int) cVar10.f6547b;
                int i16 = (int) cVar10.f6548c;
                int i17 = (int) cVar10.f6549d;
                boolean z10 = qVar.b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key);
                sb2.append(":");
                sb2.append(i14);
                sb2.append(",");
                sb2.append(i15);
                w.c.v(sb2, ",", i16, ",", i17);
                sb2.append(",");
                sb2.append(z10);
                return sb2.toString();
            case 23:
                lo.l lVar3 = (lo.l) obj;
                kotlin.jvm.internal.m.e(lVar3, "it");
                return Integer.valueOf(lVar3.a);
            case 24:
                w.v vVar = (w.v) obj;
                kotlin.jvm.internal.m.e(vVar, "$this$AnimatedContent");
                return w.m.d(vVar.c() instanceof lo.g ? w.s0.c(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2).a(w.s0.e(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 0.0f, 6)) : w.s0.c(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2), vVar.a() instanceof lo.g ? w.s0.d(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2).a(w.s0.f(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 0.0f, 6)) : w.s0.d(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2));
            case 25:
                lo.i iVar = (lo.i) obj;
                kotlin.jvm.internal.m.e(iVar, "it");
                return kotlin.jvm.internal.a0.a.b(iVar.getClass());
            case RuntimeVersion.MINOR:
                ((Boolean) obj).getClass();
                p1 p1Var = po.m.a;
                return b0Var;
            case 27:
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.Q(1);
                return b0Var;
            case 28:
                b3.o0 o0Var = (b3.o0) obj;
                kotlin.jvm.internal.m.e(o0Var, "$this$drawWithContent");
                o0Var.a();
                k2.d.m0(o0Var, sg.f.P(va.a.S(new i2.t(i2.t.f7162b), new i2.t(i2.t.f7166f)), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
                return b0Var;
            default:
                kotlin.jvm.internal.m.e((String) obj, "it");
                return b0Var;
        }
    }
}
