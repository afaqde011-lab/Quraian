package pp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import bt.j2;
import c2.l;
import ca.r;
import com.mchutov.quranify.insights.data.source.local.db.InsightsDatabase;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d0.q1;
import e1.n0;
import fs.g;
import g00.b0;
import h00.d0;
import i2.s0;
import is.c1;
import is.g1;
import is.l0;
import is.m1;
import is.p0;
import is.z;
import j3.a0;
import j3.w;
import j3.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import js.h;
import kotlin.jvm.internal.m;
import m3.g0;
import m3.i0;
import m3.o0;
import m3.q0;
import os.x;
import q0.b2;
import q0.c0;
import q0.o;
import q0.q;
import q3.i;
import q3.p;
import q3.u;
import q30.j;
import ri.t1;
import s10.w0;
import u00.k;
import u00.n;
import w.v;

public final class d implements k {
    public final int A;

    public d(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        o0 o0VarB;
        i0 i0Var;
        String str;
        int i = this.A;
        final int i2 = 9;
        final int i3 = 28;
        final int i4 = 27;
        final int i5 = 25;
        final int i6 = 4;
        final int i7 = 3;
        final int i8 = 26;
        char c = 1;
        char c2 = 1;
        b0 b0Var = b0.a;
        final int i9 = 0;
        switch (i) {
            case 0:
                m.e((String) obj, "it");
                return b0Var;
            case 1:
                ry.c it = (ry.c) obj;
                m.e(it, "it");
                return it.a;
            case 2:
                c2.m.a.getClass();
                y.f((a0) obj, l.b);
                return b0Var;
            case 3:
                return new o(((Context) obj).getContentResolver());
            case 4:
                int i11 = c0.b;
                return b0Var;
            case 5:
                return b0Var;
            case 6:
                n0 n0Var = (n0) obj;
                String str2 = n0Var.g.B;
                long j = n0Var.f;
                int i12 = q0.c;
                int i13 = (int) (j & 4294967295L);
                if (i13 > 0) {
                    v5.g gVarX = q.x();
                    if (gVarX != null) {
                        int iB = gVarX.b(str2, i13 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i13 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str2, i13, -1);
                        }
                    } else if (i13 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str2, i13, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new r3.e(((int) (n0Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 7:
                n0 n0Var2 = (n0) obj;
                String str3 = n0Var2.g.B;
                long j2 = n0Var2.f;
                int i14 = q0.c;
                int iT = q.t((int) (j2 & 4294967295L), str3);
                if (iT != -1) {
                    return new r3.e(0, iT - ((int) (n0Var2.f & 4294967295L)));
                }
                return null;
            case 8:
                n0 n0Var3 = (n0) obj;
                Integer numE = n0Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = n0Var3.f;
                int i15 = q0.c;
                return new r3.e(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 9:
                n0 n0Var4 = (n0) obj;
                Integer numD = n0Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = n0Var4.f;
                int i16 = q0.c;
                return new r3.e(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 10:
                n0 n0Var5 = (n0) obj;
                Integer numC = n0Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = n0Var5.f;
                int i17 = q0.c;
                return new r3.e(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 11:
                n0 n0Var6 = (n0) obj;
                Integer numB = n0Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = n0Var6.f;
                int i18 = q0.c;
                return new r3.e(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(1);
                m.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                q1 q1Var = ((Boolean) obj2).booleanValue() ? q1.A : q1.B;
                Object obj3 = list.get(0);
                m.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new b2(q1Var, ((Float) obj3).floatValue());
            case 13:
                m3.f fVar = (m3.f) obj;
                Object obj4 = fVar.a;
                if (!(obj4 instanceof m3.o) || (o0VarB = ((m3.o) obj4).b()) == null || (o0VarB.a == null && o0VarB.b == null && o0VarB.c == null && o0VarB.d == null)) {
                    return va.a.i(new m3.f[]{fVar});
                }
                Object obj5 = fVar.a;
                m.c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                o0 o0VarB2 = ((m3.o) obj5).b();
                if (o0VarB2 == null || (i0Var = o0VarB2.a) == null) {
                    i0Var = new i0(0L, 0L, (u) null, (q3.o) null, (p) null, (i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65535);
                }
                return va.a.i(new m3.f[]{fVar, new m3.f(i0Var, fVar.b, fVar.c)});
            case 14:
                ((a0) obj).a(w.B, b0Var);
                return b0Var;
            case 15:
                q3.q qVar = (q3.q) obj;
                return "'" + qVar.b() + "' " + qVar.a();
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                j it2 = (j) obj;
                m.e(it2, "it");
                return it2.iterator();
            case 17:
                return Boolean.valueOf(obj == null);
            case 18:
                n40.a buildSerialDescriptor = (n40.a) obj;
                m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("JsonPrimitive", new q40.o(new h.e(24)));
                buildSerialDescriptor.a("JsonNull", new q40.o(new h.e(25)));
                buildSerialDescriptor.a("JsonLiteral", new q40.o(new h.e(26)));
                buildSerialDescriptor.a("JsonObject", new q40.o(new h.e(27)));
                buildSerialDescriptor.a("JsonArray", new q40.o(new h.e(28)));
                return b0Var;
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                m.e(entry, "<destruct>");
                String str4 = (String) entry.getKey();
                q40.l lVar = (q40.l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                r40.w.a(str4, sb);
                sb.append(':');
                sb.append(lVar);
                String string = sb.toString();
                m.d(string, "toString(...)");
                return string;
            case 20:
                lo.l it3 = (lo.l) obj;
                m.e(it3, "it");
                return Integer.valueOf(it3.a);
            case 21:
                y50.a module = (y50.a) obj;
                m.e(module, "$this$module");
                module.a(new w50.a(new v50.a(c60.a.e, kotlin.jvm.internal.a0.a.b(pq.a.class), null, new ou.a(19), v50.c.B)));
                return b0Var;
            case 22:
                y50.a module2 = (y50.a) obj;
                m.e(module2, "$this$module");
                final int i19 = 10;
                n nVar = new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i19) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var2.b(SharedPreferences.class), null, bVar), (bk.m) single2.f(b0Var2.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var3.b(ms.b.class), null, null), (ms.a) single3.f(b0Var3.b(ms.a.class), null, null), (h) single3.f(b0Var3.b(h.class), null, null), (g) single3.f(b0Var3.b(g.class), null, null), (fs.h) single3.f(b0Var3.b(fs.h.class), null, null), (fs.j) single3.f(b0Var3.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var4.b(js.i.class), null, null), (fs.k) single6.f(b0Var4.b(fs.k.class), null, null), (fs.l) single6.f(b0Var4.b(fs.l.class), null, null), (is.c0) single6.f(b0Var4.b(is.c0.class), null, null), (bk.m) single6.f(b0Var4.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var5.b(ms.b.class), null, null), (js.j) single8.f(b0Var5.b(js.j.class), null, null), (fs.m) single8.f(b0Var5.b(fs.m.class), null, null), (bk.m) single8.f(b0Var5.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var6.b(p0.class), null, null), (c1) single10.f(b0Var6.b(c1.class), null, null), (g1) single10.f(b0Var6.b(g1.class), null, null), (is.y) single10.f(b0Var6.b(is.y.class), null, null), (is.j) single10.f(b0Var6.b(is.j.class), null, null), (is.f) single10.f(b0Var6.b(is.f.class), null, null), (is.m) single10.f(b0Var6.b(is.m.class), null, null), (m1) single10.f(b0Var6.b(m1.class), null, null), (l0) single10.f(b0Var6.b(l0.class), null, null), (wo.c0) single10.f(b0Var6.b(wo.c0.class), null, null), (au.a) single10.f(b0Var6.b(au.a.class), null, null), (br.i) single10.f(b0Var6.b(br.i.class), null, null), (is.c0) single10.f(b0Var6.b(is.c0.class), null, null), (ns.c) single10.f(b0Var6.b(ns.c.class), null, null), (z) single10.f(b0Var6.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var7.b(wo.c0.class), null, null), (js.f) single13.f(b0Var7.b(js.f.class), null, null), (fs.f) single13.f(b0Var7.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var8.b(c1.class), null, null), (jr.b) single15.f(b0Var8.b(jr.b.class), null, null), (br.i) single15.f(b0Var8.b(br.i.class), null, null), (m1) single15.f(b0Var8.b(m1.class), null, null), (wo.c0) single15.f(b0Var8.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var9.b(is.c0.class), null, null), (p0) single16.f(b0Var9.b(p0.class), null, null), (c1) single16.f(b0Var9.b(c1.class), null, null), (l0) single16.f(b0Var9.b(l0.class), null, null), (wo.c0) single16.f(b0Var9.b(wo.c0.class), null, null), (au.a) single16.f(b0Var9.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var10.b(is.c0.class), null, null), (ns.c) single17.f(b0Var10.b(ns.c.class), null, null), (is.y) single17.f(b0Var10.b(is.y.class), null, null), (wo.c0) single17.f(b0Var10.b(wo.c0.class), null, null), (au.a) single17.f(b0Var10.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var11.b(is.j.class), null, null), (is.f) single18.f(b0Var11.b(is.f.class), null, null), (is.c) single18.f(b0Var11.b(is.c.class), null, null), (is.m) single18.f(b0Var11.b(is.m.class), null, null), (m1) single18.f(b0Var11.b(m1.class), null, null), (br.i) single18.f(b0Var11.b(br.i.class), null, null), (p0) single18.f(b0Var11.b(p0.class), null, null), (is.c0) single18.f(b0Var11.b(is.c0.class), null, null), (c1) single18.f(b0Var11.b(c1.class), null, null), (l0) single18.f(b0Var11.b(l0.class), null, null), (wo.c0) single18.f(b0Var11.b(wo.c0.class), null, null), (z) single18.f(b0Var11.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var12.b(js.k.class), null, null), (fs.n) single19.f(b0Var12.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var12.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var13.b(js.c.class), null, null), (fs.c) single20.f(b0Var13.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var14.b(js.b.class), null, null), (fs.b) single21.f(b0Var14.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var15.b(js.a.class), null, null), (fs.a) single22.f(b0Var15.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var16.b(js.d.class), null, null), (fs.d) single23.f(b0Var16.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                };
                v50.c cVar = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                a10.d dVarB = b0Var2.b(InsightsDatabase.class);
                b60.b bVar = c60.a.e;
                module2.a(new w50.e(new v50.a(bVar, dVarB, null, nVar, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.o.class), null, new ou.a(23), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.g.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i6) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i21 = 16;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.d.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i21) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.b.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i3) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.i.class), null, new qs.c(i6), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.k.class), null, new qs.c(5), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.l.class), null, new qs.c(6), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ks.m.class), null, new qs.c(7), cVar)));
                qs.c cVar2 = new qs.c(8);
                v50.c cVar3 = v50.c.B;
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.n.class), null, cVar2, cVar3)));
                final int i22 = 21;
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.c.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i22) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.b.class), null, new qs.c(2), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.a.class), null, new qs.c(10), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.d.class), null, new qs.c(11), cVar3)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.k.class), null, new qs.c(12), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.c.class), null, new qs.c(13), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.b.class), null, new qs.c(14), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.a.class), null, new ou.a(20), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.d.class), null, new ou.a(21), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ms.b.class), null, new ou.a(22), cVar)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.j.class), null, new ou.a(24), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.k.class), null, new ou.a(i5), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.e.class), null, new ou.a(i8), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.h.class), null, new ou.a(i4), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.g.class), null, new ou.a(i3), cVar3)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(p0.class), null, new ou.a(29), cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ms.a.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i9) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final char c3 = c2 == true ? 1 : 0;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.h.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (c3) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i23 = 2;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(l0.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i23) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.i.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i7) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i24 = 5;
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.l.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i24) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar3)));
                final int i25 = 6;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(c1.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i25) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i26 = 7;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.j.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i26) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i27 = 8;
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.m.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i27) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar3)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(g1.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i2) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i28 = 11;
                w50.e eVar = new w50.e(new v50.a(bVar, b0Var2.b(x.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i28) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar));
                module2.a(eVar);
                LinkedHashSet linkedHashSet = module2.b;
                linkedHashSet.add(eVar);
                final int i29 = 12;
                w50.e eVar2 = new w50.e(new v50.a(bVar, b0Var2.b(z.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i29) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar));
                module2.a(eVar2);
                linkedHashSet.add(eVar2);
                final int i31 = 13;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(js.f.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i31) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i32 = 14;
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(fs.f.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i32) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar3)));
                final int i33 = 15;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.c0.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i33) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i34 = 17;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(vs.c.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i34) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i35 = 18;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ns.c.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i35) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i36 = 19;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(ns.j.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i36) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i37 = 20;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.y.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i37) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i38 = 22;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(m1.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i38) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i39 = 23;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.j.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i39) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                final int i41 = 24;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.f.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i41) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.c.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i5) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(is.m.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i8) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(xs.b.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i4) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar3)));
                final int i42 = 29;
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(zs.a.class), null, new n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        switch (i42) {
                            case 0:
                                e60.a single = (e60.a) obj6;
                                a60.a it4 = (a60.a) obj7;
                                m.e(single, "$this$single");
                                m.e(it4, "it");
                                return new ms.a((x40.w) single.f(kotlin.jvm.internal.a0.a.b(x40.w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
                            case 1:
                                e60.a single2 = (e60.a) obj6;
                                a60.a it5 = (a60.a) obj7;
                                m.e(single2, "$this$single");
                                m.e(it5, "it");
                                Context contextI = t1.i(single2);
                                b60.b bVar2 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                                return new h(contextI, (SharedPreferences) single2.f(b0Var3.b(SharedPreferences.class), null, bVar2), (bk.m) single2.f(b0Var3.b(bk.m.class), null, null));
                            case 2:
                                e60.a single3 = (e60.a) obj6;
                                a60.a it6 = (a60.a) obj7;
                                m.e(single3, "$this$single");
                                m.e(it6, "it");
                                Context contextI2 = t1.i(single3);
                                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                                return new l0(contextI2, (ms.b) single3.f(b0Var4.b(ms.b.class), null, null), (ms.a) single3.f(b0Var4.b(ms.a.class), null, null), (h) single3.f(b0Var4.b(h.class), null, null), (g) single3.f(b0Var4.b(g.class), null, null), (fs.h) single3.f(b0Var4.b(fs.h.class), null, null), (fs.j) single3.f(b0Var4.b(fs.j.class), null, null));
                            case 3:
                                e60.a single4 = (e60.a) obj6;
                                a60.a it7 = (a60.a) obj7;
                                m.e(single4, "$this$single");
                                m.e(it7, "it");
                                return new js.i((ks.l) single4.f(kotlin.jvm.internal.a0.a.b(ks.l.class), null, null));
                            case 4:
                                e60.a single5 = (e60.a) obj6;
                                a60.a it8 = (a60.a) obj7;
                                m.e(single5, "$this$single");
                                m.e(it8, "it");
                                return ((InsightsDatabase) single5.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).t();
                            case 5:
                                e60.a factory = (e60.a) obj6;
                                a60.a it9 = (a60.a) obj7;
                                m.e(factory, "$this$factory");
                                m.e(it9, "it");
                                return new fs.l();
                            case 6:
                                e60.a single6 = (e60.a) obj6;
                                a60.a it10 = (a60.a) obj7;
                                m.e(single6, "$this$single");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                                return new c1((js.i) single6.f(b0Var5.b(js.i.class), null, null), (fs.k) single6.f(b0Var5.b(fs.k.class), null, null), (fs.l) single6.f(b0Var5.b(fs.l.class), null, null), (is.c0) single6.f(b0Var5.b(is.c0.class), null, null), (bk.m) single6.f(b0Var5.b(bk.m.class), null, null));
                            case 7:
                                e60.a single7 = (e60.a) obj6;
                                a60.a it11 = (a60.a) obj7;
                                m.e(single7, "$this$single");
                                m.e(it11, "it");
                                return new js.j((ks.m) single7.f(kotlin.jvm.internal.a0.a.b(ks.m.class), null, null));
                            case 8:
                                e60.a factory2 = (e60.a) obj6;
                                a60.a it12 = (a60.a) obj7;
                                m.e(factory2, "$this$factory");
                                m.e(it12, "it");
                                return new fs.m();
                            case 9:
                                e60.a single8 = (e60.a) obj6;
                                a60.a it13 = (a60.a) obj7;
                                m.e(single8, "$this$single");
                                m.e(it13, "it");
                                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                                return new g1((ms.b) single8.f(b0Var6.b(ms.b.class), null, null), (js.j) single8.f(b0Var6.b(js.j.class), null, null), (fs.m) single8.f(b0Var6.b(fs.m.class), null, null), (bk.m) single8.f(b0Var6.b(bk.m.class), null, null));
                            case 10:
                                e60.a single9 = (e60.a) obj6;
                                a60.a it14 = (a60.a) obj7;
                                m.e(single9, "$this$single");
                                m.e(it14, "it");
                                r rVarX = bi.b.x(t1.h(single9), InsightsDatabase.class, "insights_database");
                                rVarX.a(new fa.a[]{InsightsDatabase.l});
                                rVarX.p = false;
                                rVarX.q = true;
                                rVarX.r = true;
                                return (InsightsDatabase) rVarX.b();
                            case 11:
                                e60.a single10 = (e60.a) obj6;
                                a60.a it15 = (a60.a) obj7;
                                m.e(single10, "$this$single");
                                m.e(it15, "it");
                                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                                return new x((p0) single10.f(b0Var7.b(p0.class), null, null), (c1) single10.f(b0Var7.b(c1.class), null, null), (g1) single10.f(b0Var7.b(g1.class), null, null), (is.y) single10.f(b0Var7.b(is.y.class), null, null), (is.j) single10.f(b0Var7.b(is.j.class), null, null), (is.f) single10.f(b0Var7.b(is.f.class), null, null), (is.m) single10.f(b0Var7.b(is.m.class), null, null), (m1) single10.f(b0Var7.b(m1.class), null, null), (l0) single10.f(b0Var7.b(l0.class), null, null), (wo.c0) single10.f(b0Var7.b(wo.c0.class), null, null), (au.a) single10.f(b0Var7.b(au.a.class), null, null), (br.i) single10.f(b0Var7.b(br.i.class), null, null), (is.c0) single10.f(b0Var7.b(is.c0.class), null, null), (ns.c) single10.f(b0Var7.b(ns.c.class), null, null), (z) single10.f(b0Var7.b(z.class), null, null));
                            case 12:
                                e60.a single11 = (e60.a) obj6;
                                a60.a it16 = (a60.a) obj7;
                                m.e(single11, "$this$single");
                                m.e(it16, "it");
                                return new z((SharedPreferences) single11.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 13:
                                e60.a single12 = (e60.a) obj6;
                                a60.a it17 = (a60.a) obj7;
                                m.e(single12, "$this$single");
                                m.e(it17, "it");
                                return new js.f((ks.k) single12.f(kotlin.jvm.internal.a0.a.b(ks.k.class), null, null));
                            case 14:
                                e60.a factory3 = (e60.a) obj6;
                                a60.a it18 = (a60.a) obj7;
                                m.e(factory3, "$this$factory");
                                m.e(it18, "it");
                                return new fs.f();
                            case 15:
                                e60.a single13 = (e60.a) obj6;
                                a60.a it19 = (a60.a) obj7;
                                m.e(single13, "$this$single");
                                m.e(it19, "it");
                                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                                return new is.c0((wo.c0) single13.f(b0Var8.b(wo.c0.class), null, null), (js.f) single13.f(b0Var8.b(js.f.class), null, null), (fs.f) single13.f(b0Var8.b(fs.f.class), null, null));
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                e60.a single14 = (e60.a) obj6;
                                a60.a it20 = (a60.a) obj7;
                                m.e(single14, "$this$single");
                                m.e(it20, "it");
                                return ((InsightsDatabase) single14.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).s();
                            case 17:
                                e60.a single15 = (e60.a) obj6;
                                a60.a it21 = (a60.a) obj7;
                                m.e(single15, "$this$single");
                                m.e(it21, "it");
                                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                                return new vs.c((c1) single15.f(b0Var9.b(c1.class), null, null), (jr.b) single15.f(b0Var9.b(jr.b.class), null, null), (br.i) single15.f(b0Var9.b(br.i.class), null, null), (m1) single15.f(b0Var9.b(m1.class), null, null), (wo.c0) single15.f(b0Var9.b(wo.c0.class), null, null));
                            case 18:
                                e60.a single16 = (e60.a) obj6;
                                a60.a it22 = (a60.a) obj7;
                                m.e(single16, "$this$single");
                                m.e(it22, "it");
                                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                                return new ns.c((is.c0) single16.f(b0Var10.b(is.c0.class), null, null), (p0) single16.f(b0Var10.b(p0.class), null, null), (c1) single16.f(b0Var10.b(c1.class), null, null), (l0) single16.f(b0Var10.b(l0.class), null, null), (wo.c0) single16.f(b0Var10.b(wo.c0.class), null, null), (au.a) single16.f(b0Var10.b(au.a.class), null, null), ab.y.l0(t1.i(single16)));
                            case 19:
                                e60.a single17 = (e60.a) obj6;
                                a60.a it23 = (a60.a) obj7;
                                m.e(single17, "$this$single");
                                m.e(it23, "it");
                                Context contextI3 = t1.i(single17);
                                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                                return new ns.j(contextI3, (is.c0) single17.f(b0Var11.b(is.c0.class), null, null), (ns.c) single17.f(b0Var11.b(ns.c.class), null, null), (is.y) single17.f(b0Var11.b(is.y.class), null, null), (wo.c0) single17.f(b0Var11.b(wo.c0.class), null, null), (au.a) single17.f(b0Var11.b(au.a.class), null, null));
                            case 20:
                                e60.a single18 = (e60.a) obj6;
                                a60.a it24 = (a60.a) obj7;
                                m.e(single18, "$this$single");
                                m.e(it24, "it");
                                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                                return new is.y((is.j) single18.f(b0Var12.b(is.j.class), null, null), (is.f) single18.f(b0Var12.b(is.f.class), null, null), (is.c) single18.f(b0Var12.b(is.c.class), null, null), (is.m) single18.f(b0Var12.b(is.m.class), null, null), (m1) single18.f(b0Var12.b(m1.class), null, null), (br.i) single18.f(b0Var12.b(br.i.class), null, null), (p0) single18.f(b0Var12.b(p0.class), null, null), (is.c0) single18.f(b0Var12.b(is.c0.class), null, null), (c1) single18.f(b0Var12.b(c1.class), null, null), (l0) single18.f(b0Var12.b(l0.class), null, null), (wo.c0) single18.f(b0Var12.b(wo.c0.class), null, null), (z) single18.f(b0Var12.b(z.class), null, null));
                            case 21:
                                e60.a factory4 = (e60.a) obj6;
                                a60.a it25 = (a60.a) obj7;
                                m.e(factory4, "$this$factory");
                                m.e(it25, "it");
                                return new fs.c();
                            case 22:
                                e60.a single19 = (e60.a) obj6;
                                a60.a it26 = (a60.a) obj7;
                                m.e(single19, "$this$single");
                                m.e(it26, "it");
                                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                                return new m1((js.k) single19.f(b0Var13.b(js.k.class), null, null), (fs.n) single19.f(b0Var13.b(fs.n.class), null, null), (SharedPreferences) single19.f(b0Var13.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
                            case 23:
                                e60.a single20 = (e60.a) obj6;
                                a60.a it27 = (a60.a) obj7;
                                m.e(single20, "$this$single");
                                m.e(it27, "it");
                                kotlin.jvm.internal.b0 b0Var14 = kotlin.jvm.internal.a0.a;
                                return new is.j((js.c) single20.f(b0Var14.b(js.c.class), null, null), (fs.c) single20.f(b0Var14.b(fs.c.class), null, null));
                            case 24:
                                e60.a single21 = (e60.a) obj6;
                                a60.a it28 = (a60.a) obj7;
                                m.e(single21, "$this$single");
                                m.e(it28, "it");
                                kotlin.jvm.internal.b0 b0Var15 = kotlin.jvm.internal.a0.a;
                                return new is.f((js.b) single21.f(b0Var15.b(js.b.class), null, null), (fs.b) single21.f(b0Var15.b(fs.b.class), null, null));
                            case 25:
                                e60.a single22 = (e60.a) obj6;
                                a60.a it29 = (a60.a) obj7;
                                m.e(single22, "$this$single");
                                m.e(it29, "it");
                                kotlin.jvm.internal.b0 b0Var16 = kotlin.jvm.internal.a0.a;
                                return new is.c((js.a) single22.f(b0Var16.b(js.a.class), null, null), (fs.a) single22.f(b0Var16.b(fs.a.class), null, null));
                            case 26:
                                e60.a single23 = (e60.a) obj6;
                                a60.a it30 = (a60.a) obj7;
                                m.e(single23, "$this$single");
                                m.e(it30, "it");
                                kotlin.jvm.internal.b0 b0Var17 = kotlin.jvm.internal.a0.a;
                                return new is.m((js.d) single23.f(b0Var17.b(js.d.class), null, null), (fs.d) single23.f(b0Var17.b(fs.d.class), null, null));
                            case 27:
                                e60.a factory5 = (e60.a) obj6;
                                a60.a it31 = (a60.a) obj7;
                                m.e(factory5, "$this$factory");
                                m.e(it31, "it");
                                return new xs.b((bk.m) factory5.f(kotlin.jvm.internal.a0.a.b(bk.m.class), null, null), t1.h(factory5));
                            case 28:
                                e60.a single24 = (e60.a) obj6;
                                a60.a it32 = (a60.a) obj7;
                                m.e(single24, "$this$single");
                                m.e(it32, "it");
                                return ((InsightsDatabase) single24.f(kotlin.jvm.internal.a0.a.b(InsightsDatabase.class), null, null)).r();
                            default:
                                a60.a it33 = (a60.a) obj7;
                                m.e((e60.a) obj6, "$this$single");
                                m.e(it33, "it");
                                return new zs.a();
                        }
                    }
                }, cVar)));
                module2.a(new w50.e(new v50.a(bVar, b0Var2.b(zs.b.class), null, new qs.c(i9), cVar)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(j2.class), null, new qs.c(c == true ? 1 : 0), cVar3)));
                module2.a(new w50.a(new v50.a(bVar, b0Var2.b(xs.c.class), null, new qs.c(i7), cVar3)));
                module2.b(new b60.b("INSIGHTS_SCOPE_KEY"), new d(24));
                return b0Var;
            case 23:
                f60.a aVar = (f60.a) obj;
                m.e(aVar, "<this>");
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                aVar.b.a(new w50.d(new v50.a(aVar.a, b0Var3.b(k.class), new b60.c(b0Var3.b(InsightsTabRoute$InsightsScreen.class)), new qs.e(), v50.c.C)));
                return b0Var;
            case 24:
                f60.a scope = (f60.a) obj;
                m.e(scope, "$this$scope");
                LinkedHashMap linkedHashMapU = d0.U(d0.U(d0.Q(new g00.k("transitionSpec", new d(i5))), d0.Q(new g00.k("popTransitionSpec", new d(i8)))), d0.Q(new g00.k("predictivePopTransitionSpec", new qs.c(i2))));
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                b60.c cVar4 = new b60.c(b0Var4.b(InsightsRoute$InsightsScreen.class));
                ax.g gVar = new ax.g(linkedHashMapU, i8);
                b60.b bVar2 = scope.a;
                v50.c cVar5 = v50.c.C;
                w50.d dVar = new w50.d(new v50.a(bVar2, b0Var4.b(k.class), cVar4, gVar, cVar5));
                y50.a aVar2 = scope.b;
                aVar2.a(dVar);
                aVar2.a(new w50.d(new v50.a(bVar2, b0Var4.b(k.class), new b60.c(b0Var4.b(rr.f.class)), new ax.g(linkedHashMapU, i4), cVar5)));
                aVar2.a(new w50.d(new v50.a(bVar2, b0Var4.b(k.class), new b60.c(b0Var4.b(rr.i.class)), new ax.g(linkedHashMapU, i3), cVar5)));
                return b0Var;
            case 25:
                v transitionSpec = (v) obj;
                m.e(transitionSpec, "$this$transitionSpec");
                return w.m.d(w.s0.i(new e6.c(4)), w.s0.d((x.y) null, 3));
            case 26:
                v popTransitionSpec = (v) obj;
                m.e(popTransitionSpec, "$this$popTransitionSpec");
                return w.m.d(w.s0.c((x.y) null, 3), w.s0.k(new e6.c(4)));
            case 27:
                ot.o it4 = (ot.o) obj;
                m.e(it4, "it");
                return it4.a;
            case 28:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i9 < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i9);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i9++;
                }
                return arrayList;
            default:
                m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                w0 w0Var = g0.a;
                Boolean bool = Boolean.FALSE;
                m3.h hVar = (m.a(obj6, bool) || obj6 == null) ? null : (m3.h) ((k) w0Var.C).invoke(obj6);
                m.b(hVar);
                Object obj7 = list2.get(1);
                int i43 = q0.c;
                q0 q0Var = (m.a(obj7, bool) || obj7 == null) ? null : (q0) ((k) g0.p.C).invoke(obj7);
                m.b(q0Var);
                return new r3.w(hVar, q0Var.a, (q0) null);
        }
    }
}
