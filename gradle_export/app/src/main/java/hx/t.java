package hx;

import androidx.datastore.core.DataStore;
import as.b1;
import b3.o0;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$PlaylistScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeTabRoute$HomeRootScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g1.c8;
import g1.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import ur.r1;
import w.s0;
import x.q1;

public final class t implements u00.k {
    public final int A;

    public t(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        int i6 = 12;
        final int i7 = 1;
        final int i8 = 0;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                w.v AnimatedContent = (w.v) obj;
                kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
                x.r rVar = x.x.a;
                final t tVar = new t(i7);
                if (((Boolean) AnimatedContent.c()).booleanValue()) {
                    return w.m.d(s0.c(x.c.w(280, 0, rVar, 2), 2).a(s0.j(tVar, x.c.w(280, 0, rVar, 2))), s0.d(x.c.w(280, 0, rVar, 2), 2).a(s0.l(new u00.k(tVar) {
                        public final t B;

                        {
                            this.B = tVar;
                        }

                        @Override
                        public final Object invoke(Object obj2) {
                            int iIntValue;
                            int i9 = i8;
                            Integer num = (Integer) obj2;
                            num.getClass();
                            switch (i9) {
                                case 0:
                                    iIntValue = ((Number) this.B.invoke(num)).intValue();
                                    break;
                                default:
                                    iIntValue = ((Number) this.B.invoke(num)).intValue();
                                    break;
                            }
                            return Integer.valueOf(-iIntValue);
                        }
                    }, x.c.w(280, 0, rVar, 2))));
                }
                return w.m.d(s0.c(x.c.w(280, 0, rVar, 2), 2).a(s0.j(new u00.k(tVar) {
                    public final t B;

                    {
                        this.B = tVar;
                    }

                    @Override
                    public final Object invoke(Object obj2) {
                        int iIntValue;
                        int i9 = i7;
                        Integer num = (Integer) obj2;
                        num.getClass();
                        switch (i9) {
                            case 0:
                                iIntValue = ((Number) this.B.invoke(num)).intValue();
                                break;
                            default:
                                iIntValue = ((Number) this.B.invoke(num)).intValue();
                                break;
                        }
                        return Integer.valueOf(-iIntValue);
                    }
                }, x.c.w(280, 0, rVar, 2))), s0.d(x.c.w(280, 0, rVar, 2), 2).a(s0.l(tVar, x.c.w(280, 0, rVar, 2))));
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() / 12);
            case 2:
                y50.a module = (y50.a) obj;
                kotlin.jvm.internal.m.e(module, "$this$module");
                b60.b bVar = new b60.b("LISTENING_TIMER_STORE_SCOPE_KEY");
                ir.b bVar2 = new ir.b(i8);
                v50.c cVar = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                a10.d dVarB = b0Var2.b(DataStore.class);
                b60.b bVar3 = c60.a.e;
                module.a(new w50.e(new v50.a(bVar3, dVarB, bVar, bVar2, cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(br.i.class), null, new c8(16), cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(gr.b.class), null, new c8(21), cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(er.j.class), null, new c8(22), cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(er.a.class), null, new c8(23), cVar)));
                c8 c8Var = new c8(24);
                v50.c cVar2 = v50.c.B;
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(hr.b.class), null, c8Var, cVar2)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(rr.a.class), null, new c8(25), cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(rr.b.class), null, new c8(26), cVar)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(jr.b.class), null, new c8(27), cVar)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(pr.c.class), null, new c8(28), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(pr.a.class), null, new ir.b(i7), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(HomeAnalytics.class), null, new ir.b(2), cVar2)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(gr.a.class), null, new ir.b(3), cVar)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(cr.b.class), null, new ir.b(4), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(cr.a.class), null, new ir.b(5), cVar2)));
                module.a(new w50.e(new v50.a(bVar3, b0Var2.b(er.d.class), null, new ir.b(6), cVar)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(or.a.class), null, new ir.b(7), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(or.b.class), null, new c8(13), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(vr.c.class), null, new c8(14), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(pr.b.class), null, new c8(15), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(r1.class), null, new c8(17), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(ds.n.class), null, new c8(18), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(cs.p.class), null, new c8(19), cVar2)));
                module.a(new w50.a(new v50.a(bVar3, b0Var2.b(b1.class), null, new c8(20), cVar2)));
                module.b(new b60.b("HOME_SCOPE_KEY"), new t(3));
                return b0Var;
            case 3:
                f60.a scope = (f60.a) obj;
                kotlin.jvm.internal.m.e(scope, "$this$scope");
                LinkedHashMap linkedHashMapU = h00.d0.U(h00.d0.U(h00.d0.Q(new g00.k("transitionSpec", new t(5))), h00.d0.Q(new g00.k("popTransitionSpec", new t(6)))), h00.d0.Q(new g00.k("predictivePopTransitionSpec", new c8(29))));
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                b60.c cVar3 = new b60.c(b0Var3.b(HomeRoute$HomeScreen.class));
                ax.g gVar = new ax.g(linkedHashMapU, 6);
                b60.b bVar4 = scope.a;
                v50.c cVar4 = v50.c.C;
                w50.d dVar = new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), cVar3, gVar, cVar4));
                y50.a aVar = scope.b;
                aVar.a(dVar);
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(gx.k.class)), new ax.g(linkedHashMapU, 7), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(ReciterRoute$ReciterScreen.class)), new ax.g(linkedHashMapU, i5), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(HomeRoute$PlaylistScreen.class)), new ax.g(linkedHashMapU, i4), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(HomeRoute$AudioStoryScreen.class)), new ax.g(linkedHashMapU, i3), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(rr.f.class)), new ax.g(linkedHashMapU, i2), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(rr.i.class)), new ax.g(linkedHashMapU, i6), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(InsightsRoute$InsightsScreen.class)), new ax.g(linkedHashMapU, 13), cVar4)));
                aVar.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(zs.d.class)), new ax.g(linkedHashMapU, 14), cVar4)));
                return b0Var;
            case 4:
                f60.a aVar2 = (f60.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "<this>");
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                aVar2.b.a(new w50.d(new v50.a(aVar2.a, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(HomeTabRoute$HomeRootScreen.class)), new ir.d(), v50.c.C)));
                return b0Var;
            case 5:
                w.v transitionSpec = (w.v) obj;
                kotlin.jvm.internal.m.e(transitionSpec, "$this$transitionSpec");
                return w.m.d(s0.i(new e6.c(4)), s0.d((x.y) null, 3));
            case 6:
                w.v popTransitionSpec = (w.v) obj;
                kotlin.jvm.internal.m.e(popTransitionSpec, "$this$popTransitionSpec");
                return w.m.d(s0.c((x.y) null, 3), s0.k(new e6.c(4)));
            case 7:
                w.v AnimatedContent2 = (w.v) obj;
                kotlin.jvm.internal.m.e(AnimatedContent2, "$this$AnimatedContent");
                i7 = ((su.e) AnimatedContent2.c()).ordinal() <= ((su.e) AnimatedContent2.a()).ordinal() ? -1 : 1;
                q1 q1VarW = x.c.w(200, 0, (x.v) null, 6);
                return w.m.d(s0.j(new s1(i7, 4), x.c.w(200, 0, (x.v) null, 6)).a(s0.c(q1VarW, 2)), s0.l(new s1(i7, 5), x.c.w(200, 0, (x.v) null, 6)).a(s0.d(q1VarW, 2)));
            case 8:
                k0.u item = (k0.u) obj;
                kotlin.jvm.internal.m.e(item, "$this$item");
                return new k0.d(qd.s0.H(k0.u.b));
            case 9:
                dw.a it = (dw.a) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Integer.valueOf(it.a);
            case 10:
                bx.c it2 = (bx.c) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return Integer.valueOf(it2.a);
            case 11:
                i2.c0 graphicsLayer = (i2.c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.L0(false);
                return b0Var;
            case 12:
                i2.c0 graphicsLayer2 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.s0(0.8f);
                return b0Var;
            case 13:
                List list = (List) obj;
                return new j0.v(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 14:
                return b0Var;
            case 15:
                o0 o0Var = (o0) obj;
                a1.i iVarG0 = o0Var.G0();
                long jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    ((hf.c) iVarG0.B).y(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    o0Var.a();
                    return b0Var;
                } finally {
                    w.c.t(iVarG0, jQ);
                }
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                Float f = (Float) obj;
                f.getClass();
                return new j1.r(new x.b(f, x.c.k, (Object) null, 12));
            case 17:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 18:
                PlayerItem it3 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.getReciterId() + "/" + it3.getSurahId();
            case 19:
                ((Integer) obj).getClass();
                return null;
            case 20:
                List list2 = (List) obj;
                return new k0.y(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 21:
                ((Integer) obj).getClass();
                k0.p pVar = k0.a0.a;
                return h00.x.A;
            case 22:
                ((Integer) obj).getClass();
                k0.p pVar2 = k0.a0.a;
                return -1;
            case 23:
                o0 o0Var2 = (o0) obj;
                kotlin.jvm.internal.m.e(o0Var2, "<this>");
                o0Var2.a();
                return b0Var;
            case 24:
                y50.a module2 = (y50.a) obj;
                kotlin.jvm.internal.m.e(module2, "$this$module");
                jk.c cVar5 = new jk.c(8);
                v50.c cVar6 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                a10.d dVarB2 = b0Var5.b(yl.a.class);
                b60.b bVar5 = c60.a.e;
                module2.a(new w50.e(new v50.a(bVar5, dVarB2, null, cVar5, cVar6)));
                module2.a(new w50.e(new v50.a(bVar5, b0Var5.b(nq.b.class), null, new jk.c(9), cVar6)));
                module2.a(new w50.e(new v50.a(bVar5, b0Var5.b(lq.a.class), null, new jk.c(10), cVar6)));
                module2.a(new w50.e(new v50.a(bVar5, b0Var5.b(oq.b.class), null, new jk.c(11), cVar6)));
                return b0Var;
            case 25:
                ma.a _connection = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection, "_connection");
                ma.c cVarK0 = _connection.k0("SELECT * FROM listening_day_reciter_stat_data ORDER BY updatedAt DESC");
                try {
                    int I = w50.c.I(cVarK0, SubscriberAttributeKt.JSON_NAME_KEY);
                    int I2 = w50.c.I(cVarK0, "dayStart");
                    int I3 = w50.c.I(cVarK0, "reciterId");
                    int I4 = w50.c.I(cVarK0, "seconds");
                    int I5 = w50.c.I(cVarK0, "updatedAt");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        arrayList.add(new gs.a(cVarK0.R(I), cVarK0.getLong(I2), (int) cVarK0.getLong(I3), (int) cVarK0.getLong(I4), cVarK0.getLong(I5)));
                    }
                    cVarK0.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarK0.close();
                    throw th;
                }
            case 26:
                ma.a _connection2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection2, "_connection");
                ma.c cVarK1 = _connection2.k0("DELETE FROM listening_day_reciter_stat_data");
                try {
                    cVarK1.d0();
                    return b0Var;
                } finally {
                    cVarK1.close();
                }
            case 27:
                ma.a _connection3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection3, "_connection");
                ma.c cVarK2 = _connection3.k0("SELECT * FROM listening_day_surah_stat_data ORDER BY updatedAt DESC");
                try {
                    int I6 = w50.c.I(cVarK2, SubscriberAttributeKt.JSON_NAME_KEY);
                    int I7 = w50.c.I(cVarK2, "dayStart");
                    int I8 = w50.c.I(cVarK2, "surahNumber");
                    int I9 = w50.c.I(cVarK2, "reciterId");
                    int I10 = w50.c.I(cVarK2, "seconds");
                    int I11 = w50.c.I(cVarK2, "updatedAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK2.d0()) {
                        arrayList2.add(new gs.b(cVarK2.R(I6), cVarK2.getLong(I7), (int) cVarK2.getLong(I8), (int) cVarK2.getLong(I9), (int) cVarK2.getLong(I10), cVarK2.getLong(I11)));
                    }
                    cVarK2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarK2.close();
                    throw th2;
                }
            case 28:
                ma.a _connection4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection4, "_connection");
                ma.c cVarK3 = _connection4.k0("DELETE FROM listening_day_surah_stat_data");
                try {
                    cVarK3.d0();
                    return b0Var;
                } finally {
                    cVarK3.close();
                }
            default:
                ma.a _connection5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection5, "_connection");
                ma.c cVarK4 = _connection5.k0("SELECT * FROM listening_hour_stat_data ORDER BY updatedAt DESC");
                try {
                    int I12 = w50.c.I(cVarK4, SubscriberAttributeKt.JSON_NAME_KEY);
                    int I13 = w50.c.I(cVarK4, "dayStart");
                    int I14 = w50.c.I(cVarK4, "hour");
                    int I15 = w50.c.I(cVarK4, "quranSeconds");
                    int I16 = w50.c.I(cVarK4, "updatedAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK4.d0()) {
                        arrayList3.add(new gs.c(cVarK4.R(I12), cVarK4.getLong(I13), (int) cVarK4.getLong(I14), (int) cVarK4.getLong(I15), cVarK4.getLong(I16)));
                    }
                    cVarK4.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarK4.close();
                    throw th3;
                }
        }
    }
}
