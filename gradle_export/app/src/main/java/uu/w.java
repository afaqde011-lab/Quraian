package uu;

import a1.q1;
import a40.c0;
import a40.m0;
import a40.u1;
import a40.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.f1;
import androidx.media3.common.q0;
import bv.i2;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import com.mchutov.quranify.main.presentation.analytics.DownloadEvent;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import d40.g1;
import d40.l1;
import d40.p1;
import d40.z0;
import e7.i0;
import hx.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.f4;
import qd.s0;
import ri.t1;
import vp.x;

public final class w implements a {
    public final p1 A;
    public final p1 B;
    public final p1 C;
    public final p1 D;
    public final p1 E;
    public final p1 F;
    public final p1 G;
    public final p1 H;
    public final p1 I;
    public final p1 J;
    public final p1 K;
    public final p1 L;
    public final p1 M;
    public final p1 N;
    public final p1 O;
    public final p1 P;
    public volatile boolean Q;
    public volatile long R;
    public long S;
    public final z0 T;
    public final Context a;
    public final xw.k b;
    public final tq.k c;
    public final nu.d d;
    public final zt.a e;
    public final wu.a f;
    public final qu.a g;
    public final AudioPlayerAnalytics h;
    public final DownloadAnalytics i;
    public final x j;
    public final hr.b k;
    public final tx.a l;
    public final zu.a m;
    public final xu.f n;
    public final a40.v o;
    public final a40.v p;
    public final z q;
    public volatile k9.u r;
    public s s;
    public u1 t;
    public u1 u;
    public final AtomicBoolean v;
    public final AtomicBoolean w;
    public final j40.c x;
    public final f4 y;
    public final o10.b z;

    public w(Context context, xw.k kVar, tq.k kVar2, nu.d dVar, zt.a aVar, wu.a aVar2, qu.a aVar3, AudioPlayerAnalytics audioPlayerAnalytics, DownloadAnalytics downloadAnalytics, x xVar, hr.b bVar, tx.a aVar4, zu.a aVar5, xu.f fVar) {
        h40.e defaultDispatcher = m0.a;
        b40.c mainDispatcher = f40.m.a;
        f40.c cVarC = c0.c(mainDispatcher);
        kotlin.jvm.internal.m.e(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.m.e(mainDispatcher, "mainDispatcher");
        this.a = context;
        this.b = kVar;
        this.c = kVar2;
        this.d = dVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = audioPlayerAnalytics;
        this.i = downloadAnalytics;
        this.j = xVar;
        this.k = bVar;
        this.l = aVar4;
        this.m = aVar5;
        this.n = fVar;
        this.o = defaultDispatcher;
        this.p = mainDispatcher;
        this.q = cVarC;
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = j40.d.a();
        f4 f4Var = new f4(context, new ComponentName(context, (Class<?>) AudioPlayerService.class));
        this.y = f4Var;
        o10.b bVar2 = new o10.b(this, 26);
        this.z = bVar2;
        h00.x xVar2 = h00.x.A;
        this.A = d40.o.c(ze.d.E(xVar2));
        k00.c cVar = null;
        this.B = d40.o.c(null);
        this.C = d40.o.c(null);
        this.D = d40.o.c(0L);
        this.E = d40.o.c(0L);
        Float fValueOf = Float.valueOf(1.0f);
        this.F = d40.o.c(fValueOf);
        Boolean bool = Boolean.FALSE;
        this.G = d40.o.c(bool);
        this.H = d40.o.c(bool);
        this.I = d40.o.c(bool);
        this.J = d40.o.c(0);
        this.K = d40.o.c(bool);
        this.L = d40.o.c(bool);
        this.M = d40.o.c(fValueOf);
        this.N = d40.o.c(qr.p.a);
        this.O = d40.o.c(bool);
        p1 p1VarC = d40.o.c(ze.d.E(xVar2));
        this.P = p1VarC;
        this.T = d40.o.x(d40.o.l(p1VarC, ((ut.p) aVar).k(), xVar.k, new b0(4, cVar, 2)), cVarC, g1.b, ze.d.E(xVar2));
        Bundle bundle = Bundle.EMPTY;
        Looper looperR = i0.r();
        k9.v vVar = new k9.v(looperR);
        i0.M(new Handler(looperR), new k9.r(vVar, new k9.u(context, f4Var, bundle, bVar2, looperR, vVar, f4Var.a.e() ? new h1.l(new g7.g(new c7.g(context))) : null), 0));
        vVar.a(new oi.p(this, vVar, 9), kh.p.A);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new h(this, cVar, 4), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new h(this, cVar, 5), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new h(this, cVar, 1), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new h(this, cVar, 2), 31);
    }

    public static final java.lang.Object a(uu.w r23, m00.c r24) {
        throw new UnsupportedOperationException("Method not decompiled: uu.w.a(uu.w, m00.c):java.lang.Object");
    }

    public static final void b(w wVar, boolean z) {
        p1 p1Var = wVar.G;
        if (((Boolean) p1Var.getValue()).booleanValue() == z) {
            return;
        }
        p1Var.k(null, Boolean.valueOf(z));
        wVar.w();
    }

    public static final java.lang.Object c(uu.w r12, android.os.Bundle r13, m00.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: uu.w.c(uu.w, android.os.Bundle, m00.c):java.lang.Object");
    }

    public static final void d(w wVar, k9.u uVar, boolean z) {
        AudioPlayerAnalytics audioPlayerAnalytics = wVar.h;
        PlayerItem playerItem = (PlayerItem) wVar.C.getValue();
        if (playerItem == null) {
            return;
        }
        if (z && uVar.isPlaying()) {
            uVar.pause();
            audioPlayerAnalytics.logEvent(new AudioPlayerEvent.AudioPause(String.valueOf(playerItem.getSurahId()), ((Number) wVar.E.getValue()).longValue()));
        } else {
            uVar.play();
            audioPlayerAnalytics.logEvent(new AudioPlayerEvent.AudioPlay(String.valueOf(playerItem.getSurahId()), playerItem.getSurahTranslation(), playerItem.getReciterName(), ((Boolean) wVar.K.getValue()).booleanValue()));
        }
    }

    public static void m(w wVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        ta.c0.M(wVar.q, (k00.i) null, (u00.n) null, new q1(wVar, (k00.c) null, 6), new bz.q((i & 2) == 0, wVar, z, null), 23);
    }

    public final void A() {
        this.h.logEvent(AudioPlayerEvent.AudioPrev.INSTANCE);
        xu.f fVar = this.n;
        tv.b bVar = fVar.h;
        if (bVar != null && bVar.g()) {
            tv.b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new su.m(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        v(true, new l1(2, null, 13));
    }

    public final java.lang.Object B(java.util.List r10, int r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: uu.w.B(java.util.List, int, m00.c):java.lang.Object");
    }

    public final Object C(m00.c cVar) {
        Object objJ = c0.J(new r(this, null), this.p, cVar);
        return objJ == l00.a.A ? objJ : g00.b0.a;
    }

    public final Object D(Integer num, Long l, m00.c cVar) {
        u uVar;
        u30.b bVar;
        u30.b bVar2;
        Long l2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.E = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.C;
        Object obj = l00.a.A;
        int i2 = uVar.E;
        Object obj2 = g00.b0.a;
        Object obj3 = null;
        if (i2 == 0) {
            t1.O(objJ);
            if (num != null && l != null) {
                int iIntValue = num.intValue();
                uVar.A = l;
                uVar.E = 1;
                objJ = j(iIntValue, uVar);
                if (objJ != obj) {
                }
                return obj;
            }
            return obj3;
        }
        if (i2 == 1) {
            l = uVar.A;
            t1.O(objJ);
        } else {
            if (i2 == 2) {
                u30.b bVar3 = uVar.B;
                l = uVar.A;
                t1.O(objJ);
                bVar = bVar3;
                Boolean bool = Boolean.FALSE;
                uVar.A = l;
                uVar.B = bVar;
                uVar.E = 3;
                this.K.emit(bool, uVar);
                if (obj2 != obj) {
                    bVar2 = bVar;
                    l2 = l;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u30.b bVar4 = uVar.B;
            l2 = uVar.A;
            t1.O(objJ);
            bVar2 = bVar4;
        }
        for (Object obj4 : bVar2) {
            long surahId = ((PlayerItem) obj4).getSurahId();
            if (l2 != null && surahId == l2.longValue()) {
                obj3 = obj4;
                break;
            }
        }
        obj3 = (PlayerItem) obj3;
        if (obj3 == null) {
            return (PlayerItem) h00.q.N0(bVar2);
        }
        return obj3;
        u30.b bVar5 = (u30.b) objJ;
        if (!((h00.b) bVar5).isEmpty()) {
            uVar.A = l;
            uVar.B = bVar5;
            uVar.E = 2;
            this.P.emit(bVar5, uVar);
            if (obj2 != obj) {
                bVar = bVar5;
                Boolean bool2 = Boolean.FALSE;
                uVar.A = l;
                uVar.B = bVar;
                uVar.E = 3;
                this.K.emit(bool2, uVar);
                if (obj2 != obj) {
                    bVar2 = bVar;
                    l2 = l;
                    while (r10.hasNext()) {
                        long surahId2 = ((PlayerItem) obj4).getSurahId();
                        if (l2 != null) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    obj3 = (PlayerItem) obj3;
                    if (obj3 == null) {
                        return (PlayerItem) h00.q.N0(bVar2);
                    }
                }
            }
            return obj;
        }
        return obj3;
    }

    public final Object E(u30.b bVar, m00.c cVar) {
        v vVar;
        List listX;
        List list;
        List list2;
        List list3;
        rm.c cVar2;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.E = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.C;
        l00.a aVar = l00.a.A;
        int i2 = vVar.E;
        a40.v vVar2 = this.p;
        int i3 = 2;
        g00.b0 b0Var = g00.b0.a;
        k00.c cVar3 = null;
        if (i2 == 0) {
            t1.O(obj);
            if (!kotlin.jvm.internal.m.a(bVar, this.T.A.getValue())) {
                listX = this.f.X(bVar);
                u30.b bVarD0 = g4.d0(bVar);
                vVar.A = bVar;
                vVar.B = listX;
                vVar.E = 2;
                this.P.emit(bVarD0, vVar);
                list = bVar;
                if (b0Var != aVar) {
                }
            } else {
                if (((Boolean) this.I.getValue()).booleanValue()) {
                    v(false, new l1(i3, cVar3, 15));
                    return b0Var;
                }
                h hVar = new h(this, cVar3, 9);
                vVar.A = null;
                vVar.E = 1;
                if (c0.J(hVar, vVar2, vVar) != aVar) {
                    return b0Var;
                }
            }
            return aVar;
        }
        if (i2 == 1) {
            t1.O(obj);
            return b0Var;
        }
        if (i2 == 2) {
            List list4 = vVar.B;
            List list5 = vVar.A;
            t1.O(obj);
            listX = list4;
            list = list5;
        } else {
            if (i2 == 3) {
                list3 = vVar.B;
                List list6 = vVar.A;
                t1.O(obj);
                list2 = list6;
                PlayerItem playerItem = (PlayerItem) h00.q.N0(list2);
                vVar.A = null;
                vVar.B = list3;
                vVar.E = 4;
                this.C.emit(playerItem, vVar);
                if (b0Var != aVar) {
                }
                return aVar;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            list3 = vVar.B;
            t1.O(obj);
        }
        w();
        cVar2 = new rm.c(this, list3, cVar3, 16);
        vVar.A = null;
        vVar.B = null;
        vVar.E = 5;
        if (c0.J(cVar2, vVar2, vVar) != aVar) {
            return aVar;
        }
        return b0Var;
        Boolean bool = Boolean.FALSE;
        vVar.A = list;
        vVar.B = listX;
        vVar.E = 3;
        this.L.emit(bool, vVar);
        if (b0Var != aVar) {
            list2 = list;
            list3 = listX;
            PlayerItem playerItem2 = (PlayerItem) h00.q.N0(list2);
            vVar.A = null;
            vVar.B = list3;
            vVar.E = 4;
            this.C.emit(playerItem2, vVar);
            if (b0Var != aVar) {
                w();
                cVar2 = new rm.c(this, list3, cVar3, 16);
                vVar.A = null;
                vVar.B = null;
                vVar.E = 5;
                if (c0.J(cVar2, vVar2, vVar) != aVar) {
                    return b0Var;
                }
            }
        }
        return aVar;
    }

    public final Object e(p pVar) {
        a40.k kVar = new a40.k(1, s0.j0(pVar));
        kVar.r();
        Context context = this.a;
        context.getClass();
        f4 f4Var = this.y;
        f4Var.getClass();
        Bundle bundle = Bundle.EMPTY;
        Looper looperR = i0.r();
        o10.b bVar = this.z;
        bVar.getClass();
        k9.v vVar = new k9.v(looperR);
        i0.M(new Handler(looperR), new k9.r(vVar, new k9.u(context, f4Var, bundle, bVar, looperR, vVar, f4Var.a.e() ? new h1.l(new g7.g(new c7.g(context))) : null), 0));
        vVar.a(new kh.r(kVar, vVar, 23), kh.p.A);
        Object objQ = kVar.q();
        l00.a aVar = l00.a.A;
        return objQ;
    }

    public final void f() {
        this.Q = false;
        this.R = 0L;
    }

    public final Object g(boolean z, k00.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.A;
        Object obj2 = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(obj);
            if (z && !this.v.get()) {
                this.m.b(ru.a.A);
            }
            if (!this.v.get() && this.m.a()) {
                k9.u uVar = this.r;
                if (uVar != null) {
                    if (!uVar.d.isConnected()) {
                        uVar = null;
                    }
                    if (uVar != null) {
                        return uVar;
                    }
                }
                bVar.C = 1;
                if (u(false, bVar) == obj2) {
                    return obj2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        k9.u uVar2 = this.r;
        if (uVar2 == null || !uVar2.d.isConnected()) {
            return null;
        }
        return uVar2;
    }

    public final void h() {
        m(this, this.C.getValue() == null, 2);
    }

    public final Object i(int i, int i2, m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.D = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.B;
        Object obj = l00.a.A;
        int i4 = cVar2.D;
        if (i4 == 0) {
            t1.O(objJ);
            cVar2.A = i2;
            cVar2.D = 1;
            objJ = j(i, cVar2);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = cVar2.A;
            t1.O(objJ);
        }
        for (Object obj2 : (Iterable) objJ) {
            if (((PlayerItem) obj2).getSurahNumber() == i2) {
                return obj2;
            }
        }
        return null;
    }

    public final Object j(int i, m00.c cVar) {
        d dVar;
        List list;
        Iterator it;
        List list2;
        Object next;
        bx.c cVar2;
        List list3;
        bx.b bVarA;
        List list4;
        bx.b bVarA2;
        u30.b<bx.f> bVar;
        ArrayList arrayList;
        Iterator it2;
        Object next2;
        bx.f fVar;
        PlayerItem playerItemX;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.E = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objI = dVar.C;
        l00.a aVar = l00.a.A;
        int i3 = dVar.E;
        if (i3 == 0) {
            t1.O(objI);
            dVar.A = i;
            dVar.E = 1;
            objI = ((ut.p) this.e).i(dVar);
            if (objI != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            i = dVar.A;
            t1.O(objI);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = dVar.A;
            list = dVar.B;
            t1.O(objI);
        }
        it = ((Iterable) objI).iterator();
        do {
            list2 = null;
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bx.c) next).a != i);
        cVar2 = (bx.c) next;
        list3 = h00.x.A;
        if (cVar2 == null) {
            return ze.d.E(list3);
        }
        bVarA = cVar2.a();
        if (bVarA != null) {
            list4 = bVarA.e;
        } else {
            list4 = null;
        }
        if (list4 == null) {
            list4 = list3;
        }
        bVarA2 = cVar2.a();
        if (bVarA2 != null && (bVar = bVarA2.e) != null) {
            arrayList = new ArrayList();
            for (bx.f fVar2 : bVar) {
                it2 = list4.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((bx.f) next2).b != fVar2.b);
                fVar = (bx.f) next2;
                if (fVar != null) {
                    playerItemX = this.g.X(new ru.b(cVar2, fVar, null, list));
                } else {
                    playerItemX = null;
                }
                if (playerItemX != null) {
                    arrayList.add(playerItemX);
                }
            }
            list2 = arrayList;
        }
        if (list2 != null) {
            list3 = list2;
        }
        return g4.d0(list3);
        List list5 = (List) objI;
        dVar.B = list5;
        dVar.A = i;
        dVar.E = 2;
        Object objC = this.b.c(dVar);
        if (objC != aVar) {
            list = list5;
            objI = objC;
            it = ((Iterable) objI).iterator();
            do {
                list2 = null;
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((bx.c) next).a != i);
            cVar2 = (bx.c) next;
            list3 = h00.x.A;
            if (cVar2 == null) {
                return ze.d.E(list3);
            }
            bVarA = cVar2.a();
            if (bVarA != null) {
                list4 = bVarA.e;
            } else {
                list4 = null;
            }
            if (list4 == null) {
                list4 = list3;
            }
            bVarA2 = cVar2.a();
            if (bVarA2 != null) {
                arrayList = new ArrayList();
                while (r3.hasNext()) {
                    it2 = list4.iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((bx.f) next2).b != fVar2.b);
                    fVar = (bx.f) next2;
                    if (fVar != null) {
                        playerItemX = this.g.X(new ru.b(cVar2, fVar, null, list));
                    } else {
                        playerItemX = null;
                    }
                    if (playerItemX != null) {
                        arrayList.add(playerItemX);
                    }
                }
                list2 = arrayList;
            }
            if (list2 != null) {
                list3 = list2;
            }
            return g4.d0(list3);
        }
        return aVar;
    }

    public final Object k(int i, int i2, m00.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i3 = eVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.C = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objI = eVar.A;
        Object obj = l00.a.A;
        int i4 = eVar.C;
        if (i4 == 0) {
            t1.O(objI);
            eVar.C = 1;
            objI = i(i, i2, eVar);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objI);
        }
        return Boolean.valueOf(objI != null);
    }

    public final boolean l() {
        q0 currentMediaItem;
        String str;
        if (!this.m.a()) {
            return false;
        }
        k9.u uVar = this.r;
        if (uVar == null || (currentMediaItem = uVar.getCurrentMediaItem()) == null || (str = currentMediaItem.a) == null) {
            return true;
        }
        return !r30.r.x0(str, "audio_story/", false);
    }

    public final void n(PlayerItem playerItem) {
        String playerUri;
        if (playerItem == null || (playerUri = playerItem.getPlayerUri()) == null || r30.k.L0(playerUri)) {
            return;
        }
        this.i.logEvent(new DownloadEvent.OfflinePlayback(playerItem.getSurahId(), playerItem.getSurahNumber(), playerItem.getReciterId()));
    }

    public final void o(k9.u uVar) {
        this.r = uVar;
        if (l()) {
            p1 p1Var = this.M;
            Float fValueOf = Float.valueOf(uVar.getPlaybackParameters().a);
            p1Var.getClass();
            p1Var.k(null, fValueOf);
        }
        k9.u uVar2 = this.r;
        if (uVar2 == null) {
            return;
        }
        s sVar = this.s;
        if (sVar != null) {
            k9.u uVar3 = this.r;
            if (uVar3 != null) {
                uVar3.removeListener(sVar);
            }
            this.s = null;
        }
        s sVar2 = new s(this, uVar2);
        this.s = sVar2;
        uVar2.addListener(sVar2);
    }

    public final void p() {
        v(true, new av.d(this, this.m.a(), (k00.c) null));
    }

    public final java.lang.Object q(int r9, int r10, m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: uu.w.q(int, int, m00.c):java.lang.Object");
    }

    public final Object r(PlayerItem playerItem, List list, boolean z, m00.c cVar) {
        this.h.logEvent(new AudioPlayerEvent.PlayerPlayTapped(String.valueOf(playerItem.getSurahId())));
        n(playerItem);
        Object objJ = c0.J(new m(this, playerItem, list, z, null), this.p, cVar);
        return objJ == l00.a.A ? objJ : g00.b0.a;
    }

    public final Object s(PlayerItem playerItem, m00.c cVar) {
        n nVar;
        int iIndexOf;
        List listX;
        PlayerItem playerItem2;
        int i;
        List list;
        d6.e eVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i2 = nVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.F = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.D;
        Object obj = l00.a.A;
        int i3 = nVar.F;
        Object obj2 = g00.b0.a;
        switch (i3) {
            case 0:
                t1.O(objJ);
                this.h.logEvent(new AudioPlayerEvent.PlayerPlayTapped(String.valueOf(playerItem.getSurahId())));
                n(playerItem);
                int reciterId = playerItem.getReciterId();
                nVar.A = playerItem;
                nVar.F = 1;
                objJ = j(reciterId, nVar);
                if (objJ != obj) {
                    u30.b bVar = (u30.b) objJ;
                    iIndexOf = bVar.indexOf(playerItem);
                    listX = this.f.X(bVar);
                    nVar.A = playerItem;
                    nVar.B = listX;
                    nVar.C = iIndexOf;
                    nVar.F = 2;
                    this.P.emit(bVar, nVar);
                    if (obj2 != obj) {
                        playerItem2 = playerItem;
                        i = iIndexOf;
                        list = listX;
                        Boolean bool = Boolean.FALSE;
                        nVar.A = playerItem2;
                        nVar.B = list;
                        nVar.C = i;
                        nVar.F = 3;
                        this.K.emit(bool, nVar);
                        if (obj2 != obj) {
                            Boolean bool2 = Boolean.FALSE;
                            nVar.A = playerItem2;
                            nVar.B = list;
                            nVar.C = i;
                            nVar.F = 4;
                            this.L.emit(bool2, nVar);
                            if (obj2 != obj) {
                                nVar.A = playerItem2;
                                nVar.B = list;
                                nVar.C = i;
                                nVar.F = 5;
                                this.C.emit(playerItem2, nVar);
                                if (obj2 != obj) {
                                    int i4 = i;
                                    List list2 = list;
                                    PlayerItem playerItem3 = playerItem2;
                                    w();
                                    eVar = new d6.e(this, playerItem3, list2, i4, (k00.c) null);
                                    nVar.A = null;
                                    nVar.B = null;
                                    nVar.C = i4;
                                    nVar.F = 6;
                                    if (c0.J(eVar, this.p, nVar) != obj) {
                                        return obj2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                playerItem = nVar.A;
                t1.O(objJ);
                u30.b bVar2 = (u30.b) objJ;
                iIndexOf = bVar2.indexOf(playerItem);
                listX = this.f.X(bVar2);
                nVar.A = playerItem;
                nVar.B = listX;
                nVar.C = iIndexOf;
                nVar.F = 2;
                this.P.emit(bVar2, nVar);
                if (obj2 != obj) {
                    playerItem2 = playerItem;
                    i = iIndexOf;
                    list = listX;
                    Boolean bool3 = Boolean.FALSE;
                    nVar.A = playerItem2;
                    nVar.B = list;
                    nVar.C = i;
                    nVar.F = 3;
                    this.K.emit(bool3, nVar);
                    if (obj2 != obj) {
                        Boolean bool4 = Boolean.FALSE;
                        nVar.A = playerItem2;
                        nVar.B = list;
                        nVar.C = i;
                        nVar.F = 4;
                        this.L.emit(bool4, nVar);
                        if (obj2 != obj) {
                            nVar.A = playerItem2;
                            nVar.B = list;
                            nVar.C = i;
                            nVar.F = 5;
                            this.C.emit(playerItem2, nVar);
                            if (obj2 != obj) {
                                int i5 = i;
                                List list3 = list;
                                PlayerItem playerItem4 = playerItem2;
                                w();
                                eVar = new d6.e(this, playerItem4, list3, i5, (k00.c) null);
                                nVar.A = null;
                                nVar.B = null;
                                nVar.C = i5;
                                nVar.F = 6;
                                if (c0.J(eVar, this.p, nVar) != obj) {
                                    return obj2;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                i = nVar.C;
                list = nVar.B;
                playerItem2 = nVar.A;
                t1.O(objJ);
                Boolean bool5 = Boolean.FALSE;
                nVar.A = playerItem2;
                nVar.B = list;
                nVar.C = i;
                nVar.F = 3;
                this.K.emit(bool5, nVar);
                if (obj2 != obj) {
                    Boolean bool6 = Boolean.FALSE;
                    nVar.A = playerItem2;
                    nVar.B = list;
                    nVar.C = i;
                    nVar.F = 4;
                    this.L.emit(bool6, nVar);
                    if (obj2 != obj) {
                        nVar.A = playerItem2;
                        nVar.B = list;
                        nVar.C = i;
                        nVar.F = 5;
                        this.C.emit(playerItem2, nVar);
                        if (obj2 != obj) {
                            int i6 = i;
                            List list4 = list;
                            PlayerItem playerItem5 = playerItem2;
                            w();
                            eVar = new d6.e(this, playerItem5, list4, i6, (k00.c) null);
                            nVar.A = null;
                            nVar.B = null;
                            nVar.C = i6;
                            nVar.F = 6;
                            if (c0.J(eVar, this.p, nVar) != obj) {
                                return obj2;
                            }
                        }
                    }
                }
                return obj;
            case 3:
                i = nVar.C;
                list = nVar.B;
                playerItem2 = nVar.A;
                t1.O(objJ);
                Boolean bool7 = Boolean.FALSE;
                nVar.A = playerItem2;
                nVar.B = list;
                nVar.C = i;
                nVar.F = 4;
                this.L.emit(bool7, nVar);
                if (obj2 != obj) {
                    nVar.A = playerItem2;
                    nVar.B = list;
                    nVar.C = i;
                    nVar.F = 5;
                    this.C.emit(playerItem2, nVar);
                    if (obj2 != obj) {
                        int i7 = i;
                        List list5 = list;
                        PlayerItem playerItem6 = playerItem2;
                        w();
                        eVar = new d6.e(this, playerItem6, list5, i7, (k00.c) null);
                        nVar.A = null;
                        nVar.B = null;
                        nVar.C = i7;
                        nVar.F = 6;
                        if (c0.J(eVar, this.p, nVar) != obj) {
                            return obj2;
                        }
                    }
                }
                return obj;
            case 4:
                i = nVar.C;
                list = nVar.B;
                playerItem2 = nVar.A;
                t1.O(objJ);
                nVar.A = playerItem2;
                nVar.B = list;
                nVar.C = i;
                nVar.F = 5;
                this.C.emit(playerItem2, nVar);
                if (obj2 != obj) {
                    int i8 = i;
                    List list6 = list;
                    PlayerItem playerItem7 = playerItem2;
                    w();
                    eVar = new d6.e(this, playerItem7, list6, i8, (k00.c) null);
                    nVar.A = null;
                    nVar.B = null;
                    nVar.C = i8;
                    nVar.F = 6;
                    if (c0.J(eVar, this.p, nVar) != obj) {
                        return obj2;
                    }
                }
                return obj;
            case 5:
                i = nVar.C;
                list = nVar.B;
                playerItem2 = nVar.A;
                t1.O(objJ);
                int i9 = i;
                List list7 = list;
                PlayerItem playerItem8 = playerItem2;
                w();
                eVar = new d6.e(this, playerItem8, list7, i9, (k00.c) null);
                nVar.A = null;
                nVar.B = null;
                nVar.C = i9;
                nVar.F = 6;
                if (c0.J(eVar, this.p, nVar) != obj) {
                    return obj;
                }
                return obj2;
            case 6:
                t1.O(objJ);
                return obj2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object t(bx.c cVar, m00.c cVar2) {
        o oVar;
        List list;
        bx.c cVar3;
        Object objI;
        List listX;
        List list2;
        List list3;
        PlayerItem playerItem;
        List list4;
        List list5;
        List list6;
        pz.k kVar;
        if (cVar2 instanceof o) {
            oVar = (o) cVar2;
            int i = oVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.G = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar2);
            }
        } else {
            oVar = new o(this, cVar2);
        }
        o oVar2 = oVar;
        Object obj = oVar2.E;
        l00.a aVar = l00.a.A;
        int i2 = oVar2.G;
        g00.b0 b0Var = g00.b0.a;
        k00.c cVar4 = null;
        if (i2 == 0) {
            t1.O(obj);
            bx.b bVarA = cVar.a();
            List list7 = bVarA != null ? bVarA.e : null;
            if (list7 == null) {
                list7 = h00.x.A;
            }
            list = list7;
            cVar3 = cVar;
            oVar2.A = cVar3;
            oVar2.B = list;
            oVar2.G = 1;
            objI = ((ut.p) this.e).i(oVar2);
            if (objI != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            list = (List) oVar2.B;
            bx.c cVar5 = oVar2.A;
            t1.O(obj);
            objI = obj;
            cVar3 = cVar5;
        } else {
            if (i2 == 2) {
                listX = oVar2.D;
                list2 = oVar2.C;
                t1.O(obj);
                Boolean bool = Boolean.FALSE;
                oVar2.A = null;
                oVar2.B = null;
                oVar2.C = list2;
                oVar2.D = listX;
                oVar2.G = 3;
                this.L.emit(bool, oVar2);
                if (b0Var != aVar) {
                    list3 = list2;
                    playerItem = (PlayerItem) h00.q.N0(list3);
                    if (playerItem != null) {
                        n(playerItem);
                        oVar2.A = null;
                        oVar2.B = null;
                        oVar2.C = list3;
                        oVar2.D = listX;
                        oVar2.G = 4;
                        this.C.emit(playerItem, oVar2);
                        if (b0Var != aVar) {
                            list6 = list3;
                        }
                    } else {
                        list4 = listX;
                        list5 = list3;
                        w();
                        kVar = new pz.k(this, list5, list4, cVar4, 14);
                        oVar2.A = null;
                        oVar2.B = null;
                        oVar2.C = null;
                        oVar2.D = null;
                        oVar2.G = 5;
                        if (c0.J(kVar, this.p, oVar2) == aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            }
            if (i2 == 3) {
                listX = oVar2.D;
                list3 = oVar2.C;
                t1.O(obj);
                playerItem = (PlayerItem) h00.q.N0(list3);
                if (playerItem != null) {
                    n(playerItem);
                    oVar2.A = null;
                    oVar2.B = null;
                    oVar2.C = list3;
                    oVar2.D = listX;
                    oVar2.G = 4;
                    this.C.emit(playerItem, oVar2);
                    if (b0Var != aVar) {
                        list6 = list3;
                    }
                } else {
                    list4 = listX;
                    list5 = list3;
                    w();
                    kVar = new pz.k(this, list5, list4, cVar4, 14);
                    oVar2.A = null;
                    oVar2.B = null;
                    oVar2.C = null;
                    oVar2.D = null;
                    oVar2.G = 5;
                    if (c0.J(kVar, this.p, oVar2) == aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            listX = oVar2.D;
            list6 = oVar2.C;
            t1.O(obj);
        }
        List list8 = list6;
        list4 = listX;
        list5 = list8;
        w();
        kVar = new pz.k(this, list5, list4, cVar4, 14);
        oVar2.A = null;
        oVar2.B = null;
        oVar2.C = null;
        oVar2.D = null;
        oVar2.G = 5;
        if (c0.J(kVar, this.p, oVar2) == aVar) {
            return aVar;
        }
        return b0Var;
        List list9 = (List) objI;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.g.X(new ru.b(cVar3, (bx.f) it.next(), null, list9)));
        }
        listX = this.f.X(arrayList);
        u30.b bVarD0 = g4.d0(arrayList);
        oVar2.A = null;
        oVar2.B = null;
        oVar2.C = arrayList;
        oVar2.D = listX;
        oVar2.G = 2;
        this.P.emit(bVarD0, oVar2);
        if (b0Var != aVar) {
            list2 = arrayList;
            Boolean bool2 = Boolean.FALSE;
            oVar2.A = null;
            oVar2.B = null;
            oVar2.C = list2;
            oVar2.D = listX;
            oVar2.G = 3;
            this.L.emit(bool2, oVar2);
            if (b0Var != aVar) {
                list3 = list2;
                playerItem = (PlayerItem) h00.q.N0(list3);
                if (playerItem != null) {
                    n(playerItem);
                    oVar2.A = null;
                    oVar2.B = null;
                    oVar2.C = list3;
                    oVar2.D = listX;
                    oVar2.G = 4;
                    this.C.emit(playerItem, oVar2);
                    if (b0Var != aVar) {
                        list6 = list3;
                        List list10 = list6;
                        list4 = listX;
                        list5 = list10;
                        w();
                        kVar = new pz.k(this, list5, list4, cVar4, 14);
                        oVar2.A = null;
                        oVar2.B = null;
                        oVar2.C = null;
                        oVar2.D = null;
                        oVar2.G = 5;
                        if (c0.J(kVar, this.p, oVar2) == aVar) {
                            return b0Var;
                        }
                    }
                } else {
                    list4 = listX;
                    list5 = list3;
                    w();
                    kVar = new pz.k(this, list5, list4, cVar4, 14);
                    oVar2.A = null;
                    oVar2.B = null;
                    oVar2.C = null;
                    oVar2.D = null;
                    oVar2.G = 5;
                    if (c0.J(kVar, this.p, oVar2) == aVar) {
                        return b0Var;
                    }
                }
            }
        }
        return aVar;
    }

    public final java.lang.Object u(boolean r14, m00.c r15) {
        throw new UnsupportedOperationException("Method not decompiled: uu.w.u(boolean, m00.c):java.lang.Object");
    }

    public final void v(boolean z, u00.n nVar) {
        ta.c0.M(this.q, this.p, (u00.n) null, (u00.k) null, new i2(this, z, nVar, (k00.c) null), 30);
    }

    public final void w() {
        PlayerItem playerItem = (PlayerItem) this.C.getValue();
        if (playerItem == null) {
            return;
        }
        List queue = (List) this.T.A.getValue();
        long jLongValue = ((Number) this.D.getValue()).longValue();
        long jLongValue2 = ((Number) this.E.getValue()).longValue();
        boolean zBooleanValue = ((Boolean) this.L.getValue()).booleanValue();
        nu.d dVar = this.d;
        SharedPreferences sharedPreferences = dVar.a;
        kotlin.jvm.internal.m.e(queue, "queue");
        String strI = dVar.b.i(queue);
        Iterator it = queue.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            PlayerItem playerItem2 = (PlayerItem) it.next();
            if (playerItem2.getSurahNumber() == playerItem.getSurahNumber() && playerItem2.getReciterId() == playerItem.getReciterId()) {
                break;
            } else {
                i++;
            }
        }
        if (i <= -1) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("PLAYER_QUEUE_JSON_KEY", strI);
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putInt("PLAYING_ITEM_POSITION_KEY", i);
        editorEdit2.apply();
        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
        editorEdit3.putLong("ITEM_OVERALL_DURATION_POSITION_KEY", jLongValue);
        editorEdit3.apply();
        SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
        editorEdit4.putLong("ITEM_DURATION_POSITION_KEY", jLongValue2);
        editorEdit4.apply();
        SharedPreferences.Editor editorEdit5 = sharedPreferences.edit();
        editorEdit5.putBoolean("IS_FAVORITES_MIX_PLAYLIST_KEY", zBooleanValue);
        editorEdit5.apply();
    }

    public final void x() {
        if (this.v.get()) {
            return;
        }
        u1 u1Var = this.t;
        k00.c cVar = null;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.t = ta.c0.M(this.q, this.p, (u00.n) null, (u00.k) null, new h(this, cVar, 7), 30);
    }

    public final void y() {
        this.h.logEvent(AudioPlayerEvent.AudioNext.INSTANCE);
        xu.f fVar = this.n;
        tv.b bVar = fVar.h;
        if (bVar != null && bVar.g()) {
            tv.b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new su.l(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        v(true, new l1(2, null, 12));
    }

    public final void z(long j) {
        ta.c0.M(this.q, this.p, (u00.n) null, (u00.k) null, new b1.f(this, j, (k00.c) null, 5), 30);
    }
}
