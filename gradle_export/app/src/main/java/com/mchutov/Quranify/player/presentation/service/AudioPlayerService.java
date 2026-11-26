package com.mchutov.quranify.player.presentation.service;

import a1.f2;
import a40.c0;
import a40.m0;
import a40.w1;
import ab.a0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.cast.CastPlayer;
import androidx.media3.common.a1;
import androidx.media3.common.b1;
import androidx.media3.common.f1;
import androidx.media3.common.q0;
import androidx.media3.common.s0;
import androidx.media3.common.t0;
import bt.y1;
import bx.f;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f4;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import d40.l1;
import e7.i0;
import f40.c;
import f40.m;
import fh.d2;
import fh.r0;
import g00.i;
import g00.p;
import h00.x;
import h40.e;
import i7.l;
import i7.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k9.a2;
import k9.a4;
import k9.b2;
import k9.e1;
import k9.g1;
import k9.h1;
import k9.s1;
import k9.t2;
import k9.z3;
import kh.b0;
import kh.t;
import kotlin.Metadata;
import ns.j;
import nv.b;
import nv.q;
import nv.s;
import ov.g;
import r30.r;
import rd.a;
import ri.t1;
import th.o;
import tv.d;
import u00.k;
import u00.n;
import uu.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/player/presentation/service/AudioPlayerService;", "Lk9/h1;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPlayerService extends h1 {
    public static final int j0 = 0;
    public z G;
    public CastPlayer H;
    public g1 I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final w1 c0;
    public final c d0;
    public final c e0;
    public boolean f0;
    public final p g0;
    public d h0;
    public final nv.c i0;

    public AudioPlayerService() {
        i iVar = i.A;
        this.J = a.I(iVar, new q(this, 10));
        this.K = a.I(iVar, new q(this, 11));
        this.L = a.I(iVar, new q(this, 12));
        this.M = a.I(iVar, new q(this, 13));
        this.N = a.I(iVar, new q(this, 14));
        this.O = a.I(iVar, new q(this, 15));
        this.P = a.I(iVar, new q(this, 16));
        this.Q = a.I(iVar, new q(this, 17));
        this.R = a.I(iVar, new q(this, 18));
        int i = 0;
        this.S = a.I(iVar, new q(this, i));
        this.T = a.I(iVar, new q(this, 1));
        this.U = a.I(iVar, new q(this, 2));
        this.V = a.I(iVar, new q(this, 3));
        this.W = a.I(iVar, new q(this, 4));
        this.X = a.I(iVar, new q(this, 5));
        this.Y = a.I(iVar, new q(this, 6));
        this.Z = a.I(iVar, new q(this, 7));
        this.a0 = a.I(iVar, new q(this, 8));
        this.b0 = a.I(iVar, new q(this, 9));
        w1 w1VarE = c0.e();
        this.c0 = w1VarE;
        e eVar = m0.a;
        this.d0 = c0.c(a.P(w1VarE, m.a.F));
        this.e0 = c0.c(a.P(w1VarE, h40.d.C));
        this.g0 = a.J(new nv.a(this, i));
        this.i0 = new nv.c(this);
    }

    public static boolean C(a2 a2Var) {
        return kotlin.jvm.internal.m.a(a2Var.a(), "com.google.android.projection.gearhead");
    }

    public static final String i(AudioPlayerService audioPlayerService, f1 f1Var) {
        t0 t0Var;
        Bundle bundle;
        q0 currentMediaItem = f1Var.getCurrentMediaItem();
        if (currentMediaItem == null || (t0Var = currentMediaItem.d) == null || (bundle = t0Var.I) == null) {
            return null;
        }
        int i = bundle.getInt("reciterId", -1);
        int i2 = bundle.getInt("surahNumber", -1);
        if (i < 0 || i2 < 0) {
            return null;
        }
        return w.c.h(i, i2, "surah/", "/");
    }

    public static final b2 j(AudioPlayerService audioPlayerService, f1 f1Var) {
        int mediaItemCount = f1Var.getMediaItemCount();
        ArrayList arrayList = new ArrayList(mediaItemCount);
        for (int i = 0; i < mediaItemCount; i++) {
            arrayList.add(f1Var.getMediaItemAt(i));
        }
        int currentMediaItemIndex = f1Var.getCurrentMediaItemIndex();
        int i2 = currentMediaItemIndex >= 0 ? currentMediaItemIndex : 0;
        long currentPosition = f1Var.getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        return new b2(arrayList, i2, currentPosition);
    }

    public static final Object k(AudioPlayerService audioPlayerService, List list, int i, long j, m00.c cVar) {
        b bVar;
        String str;
        long j2;
        List list2;
        rv.q qVar;
        ArrayList arrayList;
        Iterator it;
        int i2;
        long j3;
        uu.a aVarW;
        List list3;
        int i3;
        rv.q qVar2;
        long j4;
        int i4 = i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.G;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.G = i5 - Integer.MIN_VALUE;
            } else {
                bVar = new b(audioPlayerService, cVar);
            }
        } else {
            bVar = new b(audioPlayerService, cVar);
        }
        Object objV = bVar.E;
        l00.a aVar = l00.a.A;
        int i6 = bVar.G;
        if (i6 == 0) {
            t1.O(objV);
            q0 q0Var = (q0) h00.q.O0(i4, list);
            if (q0Var == null || (str = q0Var.a) == null) {
                q0 q0Var2 = (q0) h00.q.N0(list);
                str = q0Var2 != null ? q0Var2.a : null;
            }
            if (str != null) {
                g gVarY = audioPlayerService.y();
                bVar.A = list;
                bVar.B = null;
                bVar.C = i4;
                j2 = j;
                bVar.D = j2;
                bVar.G = 1;
                o oVar = gVarY.i;
                if (r.x0(str, "pltt/", false)) {
                    objV = ((rv.i) oVar.C).c(str, bVar);
                } else {
                    objV = r.x0(str, "dl/", false) ? oVar.v(str, bVar) : gVarY.c.a(str, bVar);
                }
                if (objV != aVar) {
                    list2 = list;
                }
            } else {
                j2 = j;
                list2 = list;
                qVar = null;
                if (qVar != null) {
                    aVarW = audioPlayerService.w();
                    list3 = qVar.c;
                    i3 = qVar.b;
                    bVar.A = null;
                    bVar.B = qVar;
                    bVar.C = i4;
                    bVar.D = j2;
                    bVar.G = 2;
                    if (((w) aVarW).B(list3, i3, bVar) != aVar) {
                        qVar2 = qVar;
                        j4 = j2;
                        return new b2(qVar2.a, qVar2.b, j4);
                    }
                } else {
                    g gVarY2 = audioPlayerService.y();
                    arrayList = new ArrayList(h00.r.q0(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        String mediaId = ((q0) it.next()).a;
                        kotlin.jvm.internal.m.d(mediaId, "mediaId");
                        arrayList.add(mediaId);
                    }
                    bVar.A = null;
                    bVar.B = null;
                    bVar.C = i4;
                    bVar.D = j2;
                    bVar.G = 3;
                    objV = gVarY2.e(arrayList, bVar);
                    if (objV != aVar) {
                        i2 = i4;
                        j3 = j2;
                        List list4 = (List) objV;
                        return new b2(list4, a0.y(i2, 0, Math.max(0, va.a.M(list4))), j3);
                    }
                }
            }
            return aVar;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                j4 = bVar.D;
                qVar2 = bVar.B;
                t1.O(objV);
                return new b2(qVar2.a, qVar2.b, j4);
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = bVar.D;
            i2 = bVar.C;
            t1.O(objV);
            List list5 = (List) objV;
            return new b2(list5, a0.y(i2, 0, Math.max(0, va.a.M(list5))), j3);
        }
        long j5 = bVar.D;
        int i7 = bVar.C;
        List list6 = bVar.A;
        t1.O(objV);
        j2 = j5;
        i4 = i7;
        list2 = list6;
        qVar = (rv.q) objV;
        if (qVar != null) {
            aVarW = audioPlayerService.w();
            list3 = qVar.c;
            i3 = qVar.b;
            bVar.A = null;
            bVar.B = qVar;
            bVar.C = i4;
            bVar.D = j2;
            bVar.G = 2;
            if (((w) aVarW).B(list3, i3, bVar) != aVar) {
                qVar2 = qVar;
                j4 = j2;
                return new b2(qVar2.a, qVar2.b, j4);
            }
        } else {
            g gVarY3 = audioPlayerService.y();
            arrayList = new ArrayList(h00.r.q0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                String mediaId2 = ((q0) it.next()).a;
                kotlin.jvm.internal.m.d(mediaId2, "mediaId");
                arrayList.add(mediaId2);
            }
            bVar.A = null;
            bVar.B = null;
            bVar.C = i4;
            bVar.D = j2;
            bVar.G = 3;
            objV = gVarY3.e(arrayList, bVar);
            if (objV != aVar) {
                i2 = i4;
                j3 = j2;
                List list7 = (List) objV;
                return new b2(list7, a0.y(i2, 0, Math.max(0, va.a.M(list7))), j3);
            }
        }
        return aVar;
    }

    public static final b0 l(AudioPlayerService audioPlayerService, k kVar) {
        audioPlayerService.getClass();
        b0 b0Var = new b0();
        ta.c0.M(audioPlayerService.e0, (k00.i) null, new lu.w(b0Var, null, 6), (k) null, new g6.a(kVar, b0Var, (k00.c) null), 27);
        return b0Var;
    }

    public static final t m(AudioPlayerService audioPlayerService, boolean z, e1 e1Var) {
        q0 q0VarI;
        dh.o oVar = audioPlayerService.y().b;
        Context context = oVar.A;
        if (z) {
            String string = context.getString(2131886121);
            kotlin.jvm.internal.m.d(string, "getString(...)");
            q0VarI = dh.o.d(oVar, "premium_required", string, (String) null, (String) null, (Integer) null, (String) null, (qv.a) null, (qv.a) null, 508);
        } else {
            s0 s0Var = new s0();
            s0Var.a = context.getString(2131886229);
            s0Var.q = Boolean.FALSE;
            s0Var.r = Boolean.TRUE;
            s0Var.G = 1;
            q0VarI = dh.o.i("premium_required", new t0(s0Var));
        }
        return b5.x(k9.q.c(fh.t0.s(q0VarI), e1Var));
    }

    public static final boolean n(AudioPlayerService audioPlayerService, a2 a2Var) {
        return (audioPlayerService.x().k() || kotlin.jvm.internal.m.a(a2Var.a(), audioPlayerService.getApplicationContext().getPackageName())) ? false : true;
    }

    public static final Object o(AudioPlayerService audioPlayerService, String str, a2 a2Var, m00.c cVar) {
        nv.r rVar;
        AudioPlayerService audioPlayerService2;
        a2 a2Var2;
        if (cVar instanceof nv.r) {
            rVar = (nv.r) cVar;
            int i = rVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.D = i - Integer.MIN_VALUE;
            } else {
                rVar = new nv.r(audioPlayerService, cVar);
            }
        } else {
            rVar = new nv.r(audioPlayerService, cVar);
        }
        Object objD = rVar.B;
        Object obj = l00.a.A;
        int i2 = rVar.D;
        g00.b0 b0Var = g00.b0.a;
        if (i2 == 0) {
            t1.O(objD);
            g gVarY = audioPlayerService.y();
            rVar.A = a2Var;
            rVar.D = 1;
            objD = gVarY.g.D(str, rVar);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            a2Var = rVar.A;
            t1.O(objD);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2Var2 = rVar.A;
            t1.O(objD);
            audioPlayerService2 = audioPlayerService;
        }
        if (C(a2Var2)) {
            audioPlayerService2.u().logEvent(new AndroidAutoEvent.AndroidAutoPlaybackStarted("audio_story"));
            return b0Var;
        }
        return b0Var;
        g00.k kVar = (g00.k) objD;
        if (kVar != null) {
            ho.a aVar = (ho.a) kVar.A;
            ho.g gVar = (ho.g) kVar.B;
            e eVar = m0.a;
            b40.c cVar2 = m.a;
            audioPlayerService2 = audioPlayerService;
            f2 f2Var = new f2(audioPlayerService2, aVar, gVar, (k00.c) null, 18);
            rVar.A = a2Var;
            rVar.D = 2;
            if (c0.J(f2Var, cVar2, rVar) != obj) {
                a2Var2 = a2Var;
                if (C(a2Var2)) {
                    audioPlayerService2.u().logEvent(new AndroidAutoEvent.AndroidAutoPlaybackStarted("audio_story"));
                    return b0Var;
                }
            }
            return obj;
        }
        return b0Var;
    }

    public static final void p(AudioPlayerService audioPlayerService) {
        CastPlayer castPlayer = audioPlayerService.H;
        if (castPlayer != null) {
            castPlayer.release();
        }
        audioPlayerService.H = null;
        z zVar = audioPlayerService.G;
        if (zVar != null) {
            zVar.A();
            if (zVar.l0) {
                Context applicationContext = audioPlayerService.getApplicationContext();
                kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
                l lVar = new l(applicationContext);
                lVar.b(kh.o.C());
                z zVarA = lVar.a();
                kh.o.t(zVarA);
                audioPlayerService.G = zVarA;
            }
        } else {
            Context applicationContext2 = audioPlayerService.getApplicationContext();
            kotlin.jvm.internal.m.d(applicationContext2, "getApplicationContext(...)");
            l lVar2 = new l(applicationContext2);
            lVar2.b(kh.o.C());
            z zVarA2 = lVar2.a();
            kh.o.t(zVarA2);
            audioPlayerService.G = zVarA2;
        }
        z zVar2 = audioPlayerService.G;
        if (zVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        audioPlayerService.J(zVar2);
    }

    public static final void q(AudioPlayerService audioPlayerService, a2 a2Var) {
        if (kotlin.jvm.internal.m.a(a2Var.a(), audioPlayerService.getApplicationContext().getPackageName())) {
            return;
        }
        audioPlayerService.B().b(ru.a.A);
    }

    public static final Object r(AudioPlayerService audioPlayerService, m00.c cVar) {
        s sVar;
        PlayerItem playerItem;
        Object next;
        bx.c cVar2;
        boolean z;
        tq.k kVarZ;
        zq.a aVar;
        Integer collectionId;
        bx.b bVarA;
        u30.b bVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.D = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(audioPlayerService, cVar);
            }
        } else {
            sVar = new s(audioPlayerService, cVar);
        }
        Object objD = sVar.B;
        l00.a aVar2 = l00.a.A;
        int i2 = sVar.D;
        g00.b0 b0Var = g00.b0.a;
        if (i2 == 0) {
            t1.O(objD);
            PlayerItem playerItem2 = (PlayerItem) ((w) audioPlayerService.w()).C.getValue();
            if (playerItem2 != null) {
                y1 y1VarC = audioPlayerService.z().c();
                sVar.A = playerItem2;
                sVar.D = 1;
                Object objS = d40.o.s(y1VarC, sVar);
                if (objS != aVar2) {
                    playerItem = playerItem2;
                    objD = objS;
                }
                return aVar2;
            }
            return b0Var;
        }
        if (i2 == 1) {
            playerItem = sVar.A;
            t1.O(objD);
        } else {
            if (i2 == 2) {
                t1.O(objD);
                return b0Var;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objD);
                return b0Var;
            }
            playerItem = sVar.A;
            t1.O(objD);
        }
        cVar2 = (bx.c) objD;
        if (cVar2 != null && (bVarA = cVar2.a()) != null && (bVar = bVarA.e) != null && !bVar.isEmpty()) {
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((f) it.next()).a == playerItem.getSurahId()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        kVarZ = audioPlayerService.z();
        long surahId = playerItem.getSurahId();
        int reciterId = playerItem.getReciterId();
        if (z) {
            collectionId = null;
        } else {
            collectionId = playerItem.getCollectionId();
        }
        aVar = new zq.a(surahId, reciterId, z, collectionId);
        sVar.A = null;
        sVar.D = 4;
        if (kVarZ.e(aVar, sVar) != aVar2) {
            return aVar2;
        }
        return b0Var;
        Iterator it2 = ((Iterable) objD).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((zq.a) next).a != playerItem.getSurahId());
        zq.a aVar3 = (zq.a) next;
        if (aVar3 != null) {
            tq.k kVarZ2 = audioPlayerService.z();
            sVar.A = null;
            sVar.D = 2;
            if (kVarZ2.e(aVar3, sVar) != aVar2) {
                return b0Var;
            }
        } else {
            xw.k kVar = (xw.k) audioPlayerService.P.getValue();
            int reciterId2 = playerItem.getReciterId();
            sVar.A = playerItem;
            sVar.D = 3;
            objD = kVar.d(reciterId2, sVar);
            if (objD != aVar2) {
                cVar2 = (bx.c) objD;
                if (cVar2 != null) {
                    z = false;
                    break;
                }
                z = false;
                break;
                kVarZ = audioPlayerService.z();
                long surahId2 = playerItem.getSurahId();
                int reciterId3 = playerItem.getReciterId();
                if (z) {
                    collectionId = null;
                } else {
                    collectionId = playerItem.getCollectionId();
                }
                aVar = new zq.a(surahId2, reciterId3, z, collectionId);
                sVar.A = null;
                sVar.D = 4;
                if (kVarZ.e(aVar, sVar) != aVar2) {
                    return b0Var;
                }
            }
        }
        return aVar2;
    }

    public final br.i A() {
        return (br.i) this.K.getValue();
    }

    public final zu.a B() {
        return (zu.a) this.X.getValue();
    }

    public final boolean D() {
        return B().a() && ((xu.f) this.b0.getValue()).f.getValue() != null;
    }

    public final boolean E() {
        return x().k() && !D();
    }

    public final List F(g1 g1Var, a2 a2Var) {
        int i;
        if (!B().a()) {
            z3 z3Var = nv.t.a;
            if (I(g1Var, a2Var)) {
                k9.a aVar = new k9.a(57399);
                aVar.c(1);
                aVar.f(new int[]{1});
                return va.a.R(aVar.a());
            }
            k9.a aVar2 = new k9.a(57433);
            aVar2.f = getString(2131886764);
            aVar2.c(11);
            aVar2.f(new int[]{2});
            k9.b bVarA = aVar2.a();
            k9.a aVar3 = new k9.a(57430);
            aVar3.f = getString(2131886766);
            aVar3.c(12);
            aVar3.f(new int[]{3});
            return va.a.S(new k9.b[]{bVarA, aVar3.a()});
        }
        z3 z3Var2 = nv.t.a;
        boolean z = this.f0;
        int repeatMode = g1Var.a().getRepeatMode();
        boolean zI = I(g1Var, a2Var);
        boolean zE = E();
        i00.b bVarS = va.a.s();
        if (zI) {
            k9.a aVar4 = new k9.a(57399);
            aVar4.c(1);
            aVar4.f(new int[]{1});
            bVarS.add(aVar4.a());
        }
        if (zE) {
            if (repeatMode != 1) {
                i = repeatMode != 2 ? 2131231199 : 2131231200;
            } else {
                i = 2131231201;
            }
            k9.a aVar5 = new k9.a(0);
            aVar5.d = i;
            aVar5.f = getString(2131886767);
            aVar5.d(nv.t.b);
            aVar5.f(new int[]{6});
            bVarS.add(aVar5.a());
        }
        k9.a aVar6 = new k9.a(z ? 1042557 : 59517);
        aVar6.f = getString(2131886508);
        aVar6.d(nv.t.a);
        aVar6.f(new int[]{6});
        bVarS.add(aVar6.a());
        return va.a.k(bVarS);
    }

    public final b1 G(g1 g1Var, a2 a2Var) {
        a1 a1Var;
        if (I(g1Var, a2Var)) {
            b1 b1Var = k9.y1.f;
            b1Var.getClass();
            a1Var = new a1(b1Var);
            a1Var.c(8);
            a1Var.c(6);
            a1Var.c(9);
            a1Var.c(7);
        } else {
            b1 b1Var2 = k9.y1.f;
            b1Var2.getClass();
            a1Var = new a1(b1Var2);
        }
        if ((g1Var.a.n(a2Var) || !kotlin.jvm.internal.m.a(a2Var.a(), getApplicationContext().getPackageName())) && (!x().k() || D())) {
            a1Var.c(5);
            a1Var.c(4);
            a1Var.c(11);
            a1Var.c(12);
        }
        return a1Var.b();
    }

    public final d H(f1 player) {
        p pVar = this.g0;
        tv.b bVar = (tv.b) pVar.getValue();
        bVar.getClass();
        kotlin.jvm.internal.m.e(player, "player");
        if (bVar.c != player) {
            bVar.e();
            bVar.c = player;
            player.addListener(bVar.m);
            xu.f fVar = bVar.a;
            fVar.h = bVar;
            su.s sVarD = fVar.d();
            bVar.a(sVarD != null ? sVarD.c : null);
            bVar.i();
        }
        d dVar = this.h0;
        if (dVar != null) {
            d dVar2 = dVar.getWrappedPlayer() == player ? dVar : null;
            if (dVar2 != null) {
                return dVar2;
            }
        }
        d dVar3 = new d(player, (tv.b) pVar.getValue());
        this.h0 = dVar3;
        return dVar3;
    }

    public final boolean I(g1 g1Var, a2 a2Var) {
        if (x().k()) {
            return false;
        }
        return g1Var.a.n(a2Var) || !kotlin.jvm.internal.m.a(a2Var.a(), getApplicationContext().getPackageName());
    }

    public final void J(f1 f1Var) {
        f1 f1VarA;
        f1 wrappedPlayer;
        if (B().a()) {
            g1 g1Var = this.I;
            uv.a aVar = null;
            if (g1Var == null || (f1VarA = g1Var.a()) == null) {
                f1VarA = null;
            } else {
                d dVar = f1VarA instanceof d ? (d) f1VarA : null;
                if (dVar != null && (wrappedPlayer = dVar.getWrappedPlayer()) != null) {
                    f1VarA = wrappedPlayer;
                }
            }
            if (f1VarA == f1Var) {
                return;
            }
            g1 g1Var2 = this.I;
            f1 f1VarA2 = g1Var2 != null ? g1Var2.a() : null;
            if (f1VarA2 != null && f1VarA2.getMediaItemCount() != 0) {
                int mediaItemCount = f1VarA2.getMediaItemCount();
                ArrayList arrayList = new ArrayList(mediaItemCount);
                for (int i = 0; i < mediaItemCount; i++) {
                    q0 mediaItemAt = f1VarA2.getMediaItemAt(i);
                    kotlin.jvm.internal.m.d(mediaItemAt, "getMediaItemAt(...)");
                    arrayList.add(mediaItemAt);
                }
                aVar = new uv.a(arrayList, f1VarA2.getCurrentMediaItemIndex(), f1VarA2.getCurrentPosition(), f1VarA2.getPlayWhenReady(), f1VarA2.getRepeatMode(), f1VarA2.getShuffleModeEnabled());
            }
            g1 g1Var3 = this.I;
            if (g1Var3 != null) {
                g1Var3.d();
            }
            this.I = t(f1Var);
            if (aVar == null) {
                return;
            }
            f1Var.setMediaItems(aVar.a, aVar.b, aVar.c);
            f1Var.setRepeatMode(aVar.e);
            f1Var.setShuffleModeEnabled(aVar.f);
            f1Var.prepare();
            f1Var.setPlayWhenReady(aVar.d);
        }
    }

    public final void K() {
        z zVar = this.G;
        if (zVar != null && this.H == null) {
            this.H = new CastPlayer.Builder(getApplicationContext()).setLocalPlayer(zVar).build();
        }
        CastPlayer castPlayer = this.H;
        if (castPlayer == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        J(castPlayer);
    }

    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
        l lVar = new l(applicationContext);
        lVar.b(kh.o.C());
        z zVarA = lVar.a();
        kh.o.t(zVarA);
        this.G = zVarA;
        if (this.I == null) {
            this.I = t(zVarA);
        } else {
            J(zVarA);
        }
        j jVar = (j) this.J.getValue();
        int i = 1;
        nv.a aVar = new nv.a(this, i);
        int i2 = 2;
        nv.a aVar2 = new nv.a(this, i2);
        int i3 = 3;
        nv.a aVar3 = new nv.a(this, i3);
        jVar.getClass();
        c scope = this.d0;
        kotlin.jvm.internal.m.e(scope, "scope");
        jVar.k = aVar;
        jVar.l = aVar2;
        jVar.m = aVar3;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        jVar.o = string;
        k00.c cVar = null;
        jVar.p = null;
        jVar.q = 0L;
        int i4 = 0;
        jVar.t = false;
        jVar.s = 0;
        jVar.u = false;
        jVar.r = SystemClock.elapsedRealtime();
        e eVar = m0.a;
        b40.c cVar2 = m.a;
        int i5 = 4;
        List list = (List) jVar.i.getAndSet(va.a.S(new a40.e1[]{ta.c0.M(scope, cVar2.F, (n) null, (k) null, new ns.i(jVar, cVar, i2), 30), ta.c0.M(scope, cVar2.F, (n) null, (k) null, new ns.i(jVar, cVar, i3), 30), ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new ns.i(jVar, cVar, i5), 31)}));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a40.e1) it.next()).i(null);
            }
        }
        jVar.i();
        ta.c0.M(jVar.g, (k00.i) null, (n) null, (k) null, new ns.i(jVar, cVar, i), 31);
        if (x().k()) {
            ((hq.b) v()).c();
        }
        super.onCreate();
        f4 f4Var = new f4(this, 3);
        ta.c0.A(!f4Var.B);
        oe.o oVar = new oe.o(f4Var);
        f4Var.B = true;
        oVar.A = 2131230842;
        i0.M(((h1) this).B, new ji.a(this, oVar, 20));
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, 9), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, 10), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, i4), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, i), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, i2), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, i3), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, i5), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, 5), 31);
        ta.c0.M(scope, (k00.i) null, (n) null, (k) null, new nv.e(this, cVar, 6), 31);
        ta.c0.M(scope, (k00.i) null, new l1(2, null, 3), (k) null, new nv.e(this, cVar, 7), 27);
        ta.c0.M(scope, (k00.i) null, new l1(2, null, 6), (k) null, new nv.e(this, cVar, 12), 27);
        ta.c0.M(scope, (k00.i) null, new l1(2, null, 5), (k) null, new nv.e(this, cVar, 11), 27);
        ta.c0.M(scope, (k00.i) null, new l1(2, null, 4), (k) null, new nv.e(this, cVar, 8), 27);
        zu.a aVarB = B();
        gz.e1 e1Var = new gz.e1(1, this, AudioPlayerService.class, "onPlaybackOwnerChanged", "onPlaybackOwnerChanged(Lcom/mchutov/quranify/player/domain/model/PlaybackOwner;)V", 0, 8);
        aVarB.getClass();
        aVarB.d = e1Var;
        e1Var.invoke(aVarB.b.getValue());
    }

    public final void onDestroy() {
        B().d = null;
        z zVar = ((no.e) this.Y.getValue()).b;
        if (zVar != null) {
            zVar.pause();
        }
        j jVar = (j) this.J.getValue();
        List list = (List) jVar.i.getAndSet(x.A);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a40.e1) it.next()).i(null);
            }
        }
        f1 f1Var = jVar.n;
        if (f1Var == null) {
            nv.a aVar = jVar.k;
            f1Var = aVar != null ? (f1) aVar.invoke() : null;
        }
        ss.d dVarF = (jVar.p == null || f1Var == null) ? null : jVar.f(f1Var, ss.f.STOP, null);
        jVar.t = false;
        try {
            f1 f1Var2 = jVar.n;
            if (f1Var2 != null) {
                f1Var2.removeListener(jVar.v);
            }
        } catch (Throwable th) {
            t1.s(th);
        }
        jVar.n = null;
        jVar.k(va.a.T(dVarF), ns.k.C);
        if (jVar.e.a.isAuthorized()) {
            jVar.c.b();
        }
        A().i();
        ((nn.k) this.V.getValue()).a(null, false);
        ((tv.b) this.g0.getValue()).e();
        this.c0.i(null);
        g1 g1Var = this.I;
        if (g1Var != null) {
            g1Var.d();
        }
        this.I = null;
        CastPlayer castPlayer = this.H;
        if (castPlayer != null) {
            castPlayer.release();
        }
        this.H = null;
        z zVar2 = this.G;
        if (zVar2 != null) {
            zVar2.release();
        }
        this.G = null;
        super.onDestroy();
    }

    public final void s() {
        g1 g1Var = this.I;
        if (g1Var == null) {
            return;
        }
        s1 s1Var = g1Var.a;
        z3 z3Var = nv.t.a;
        a4 a4VarA = nv.t.a(E());
        r0 r0VarQ = s1Var.g().q(0);
        while (r0VarQ.hasNext()) {
            Object next = r0VarQ.next();
            kotlin.jvm.internal.m.d(next, "next(...)");
            a2 a2Var = (a2) next;
            b1 b1VarG = G(g1Var, a2Var);
            t2 t2Var = s1Var.h;
            oj.q qVar = s1Var.g.f;
            if (qVar.M(a2Var)) {
                if (s1Var.n(a2Var)) {
                    t2Var.L(a4VarA, b1VarG);
                    a2 a2VarJ = s1Var.j();
                    if (a2VarJ != null) {
                        (a2VarJ.b == 0 ? t2Var.e : qVar).V(a2VarJ, a4VarA, b1VarG);
                    }
                }
                qVar.V(a2Var, a4VarA, b1VarG);
                b1 b1VarA = qVar.A(a2Var);
                if (b1VarA != null) {
                    s1Var.e(a2Var, new k9.b1(a4VarA, b1VarA));
                    s1Var.c.a(false, false);
                }
            } else if (a2Var.b == 0) {
                t2Var.e.V(a2Var, a4VarA, b1VarG);
            }
            if (s1Var.n(a2Var)) {
                g1Var.e(a2Var, F(g1Var, a2Var));
            }
        }
    }

    public final g1 t(f1 f1Var) {
        f1Var.addListener(this.i0);
        d dVarH = H(f1Var);
        nv.p pVar = new nv.p(this);
        ta.c0.s(dVarH.canAdvertiseSession());
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        r0 r0Var = fh.t0.B;
        d2 d2Var = d2.E;
        Intent intent = new Intent((Context) this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        kotlin.jvm.internal.m.d(activity, "getActivity(...)");
        ta.c0.s(activity.isActivity());
        Object obj = g1.b;
        int iIntValue = ((Integer) s1.K.get()).intValue();
        c7.g gVar = new c7.g(this);
        gVar.a = iIntValue;
        gVar.b = true;
        return new g1(this, dVarH, activity, d2Var, d2Var, d2Var, pVar, bundle, bundle2, new h1.l(new g7.g(gVar)));
    }

    public final AndroidAutoAnalytics u() {
        return (AndroidAutoAnalytics) this.U.getValue();
    }

    public final gq.a v() {
        return (gq.a) this.M.getValue();
    }

    public final uu.a w() {
        return (uu.a) this.T.getValue();
    }

    public final vp.x x() {
        return (vp.x) this.L.getValue();
    }

    public final g y() {
        return (g) this.N.getValue();
    }

    public final tq.k z() {
        return (tq.k) this.O.getValue();
    }
}
