package com.mchutov.p000quranify.player.presentation.service;

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
import com.mchutov.Quranify.R;
import com.mchutov.p000quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.p000quranify.player.domain.model.PlayerItem;
import com.mchutov.p000quranify.player.presentation.analytics.AndroidAutoAnalytics;
import com.mchutov.p000quranify.player.presentation.analytics.AndroidAutoEvent;
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
import uu.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/player/presentation/service/AudioPlayerService;", "Lk9/h1;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPlayerService extends h1 {

    public static final int f5284j0 = 0;
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

    public final Object f5285a0;

    public final Object f5286b0;

    public final w1 f5287c0;

    public final c f5288d0;

    public final c f5289e0;

    public boolean f5290f0;

    public final p f5291g0;

    public d f5292h0;

    public final nv.c f5293i0;

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
        int i11 = 0;
        this.S = a.I(iVar, new q(this, i11));
        this.T = a.I(iVar, new q(this, 1));
        this.U = a.I(iVar, new q(this, 2));
        this.V = a.I(iVar, new q(this, 3));
        this.W = a.I(iVar, new q(this, 4));
        this.X = a.I(iVar, new q(this, 5));
        this.Y = a.I(iVar, new q(this, 6));
        this.Z = a.I(iVar, new q(this, 7));
        this.f5285a0 = a.I(iVar, new q(this, 8));
        this.f5286b0 = a.I(iVar, new q(this, 9));
        w1 w1VarE = c0.e();
        this.f5287c0 = w1VarE;
        e eVar = m0.f281a;
        this.f5288d0 = c0.c(a.P(w1VarE, m.f7417a.F));
        this.f5289e0 = c0.c(a.P(w1VarE, h40.d.C));
        this.f5291g0 = a.J(new nv.a(this, i11));
        this.f5293i0 = new nv.c(this);
    }

    public static boolean C(a2 a2Var) {
        return kotlin.jvm.internal.m.a(a2Var.a(), "com.google.android.projection.gearhead");
    }

    public static final String i(AudioPlayerService audioPlayerService, f1 f1Var) {
        t0 t0Var;
        Bundle bundle;
        q0 currentMediaItem = f1Var.getCurrentMediaItem();
        if (currentMediaItem == null || (t0Var = currentMediaItem.f1579d) == null || (bundle = t0Var.I) == null) {
            return null;
        }
        int i11 = bundle.getInt("reciterId", -1);
        int i12 = bundle.getInt("surahNumber", -1);
        if (i11 < 0 || i12 < 0) {
            return null;
        }
        return w.c.h(i11, i12, "surah/", "/");
    }

    public static final b2 j(AudioPlayerService audioPlayerService, f1 f1Var) {
        int mediaItemCount = f1Var.getMediaItemCount();
        ArrayList arrayList = new ArrayList(mediaItemCount);
        for (int i11 = 0; i11 < mediaItemCount; i11++) {
            arrayList.add(f1Var.getMediaItemAt(i11));
        }
        int currentMediaItemIndex = f1Var.getCurrentMediaItemIndex();
        int i12 = currentMediaItemIndex >= 0 ? currentMediaItemIndex : 0;
        long currentPosition = f1Var.getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        return new b2(arrayList, i12, currentPosition);
    }

    public static final Object k(AudioPlayerService audioPlayerService, List list, int i11, long j9, m00.c cVar) {
        b bVar;
        String str;
        long j11;
        List list2;
        rv.q qVar;
        ArrayList arrayList;
        Iterator it;
        int i12;
        long j12;
        uu.a aVarW;
        List list3;
        int i13;
        rv.q qVar2;
        long j13;
        int i14 = i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i15 = bVar.G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.G = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(audioPlayerService, cVar);
            }
        } else {
            bVar = new b(audioPlayerService, cVar);
        }
        Object objV = bVar.E;
        l00.a aVar = l00.a.A;
        int i16 = bVar.G;
        if (i16 == 0) {
            t1.O(objV);
            q0 q0Var = (q0) h00.q.O0(i14, list);
            if (q0Var == null || (str = q0Var.f1576a) == null) {
                q0 q0Var2 = (q0) h00.q.N0(list);
                str = q0Var2 != null ? q0Var2.f1576a : null;
            }
            if (str != null) {
                g gVarY = audioPlayerService.y();
                bVar.A = list;
                bVar.B = null;
                bVar.C = i14;
                j11 = j9;
                bVar.D = j11;
                bVar.G = 1;
                o oVar = gVarY.f16557i;
                if (r.x0(str, "pltt/", false)) {
                    objV = ((rv.i) oVar.C).c(str, bVar);
                } else {
                    objV = r.x0(str, "dl/", false) ? oVar.v(str, bVar) : gVarY.f16551c.a(str, bVar);
                }
                if (objV != aVar) {
                    list2 = list;
                }
            } else {
                j11 = j9;
                list2 = list;
                qVar = null;
                if (qVar != null) {
                    aVarW = audioPlayerService.w();
                    list3 = qVar.f18763c;
                    i13 = qVar.f18762b;
                    bVar.A = null;
                    bVar.B = qVar;
                    bVar.C = i14;
                    bVar.D = j11;
                    bVar.G = 2;
                    if (((w) aVarW).B(list3, i13, bVar) != aVar) {
                        qVar2 = qVar;
                        j13 = j11;
                        return new b2(qVar2.f18761a, qVar2.f18762b, j13);
                    }
                } else {
                    g gVarY2 = audioPlayerService.y();
                    arrayList = new ArrayList(h00.r.q0(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        String mediaId = ((q0) it.next()).f1576a;
                        kotlin.jvm.internal.m.d(mediaId, "mediaId");
                        arrayList.add(mediaId);
                    }
                    bVar.A = null;
                    bVar.B = null;
                    bVar.C = i14;
                    bVar.D = j11;
                    bVar.G = 3;
                    objV = gVarY2.e(arrayList, bVar);
                    if (objV != aVar) {
                        i12 = i14;
                        j12 = j11;
                        List list4 = (List) objV;
                        return new b2(list4, a0.y(i12, 0, Math.max(0, va.a.M(list4))), j12);
                    }
                }
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                j13 = bVar.D;
                qVar2 = bVar.B;
                t1.O(objV);
                return new b2(qVar2.f18761a, qVar2.f18762b, j13);
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j12 = bVar.D;
            i12 = bVar.C;
            t1.O(objV);
            List list5 = (List) objV;
            return new b2(list5, a0.y(i12, 0, Math.max(0, va.a.M(list5))), j12);
        }
        long j14 = bVar.D;
        int i17 = bVar.C;
        List list6 = bVar.A;
        t1.O(objV);
        j11 = j14;
        i14 = i17;
        list2 = list6;
        qVar = (rv.q) objV;
        if (qVar != null) {
            aVarW = audioPlayerService.w();
            list3 = qVar.f18763c;
            i13 = qVar.f18762b;
            bVar.A = null;
            bVar.B = qVar;
            bVar.C = i14;
            bVar.D = j11;
            bVar.G = 2;
            if (((w) aVarW).B(list3, i13, bVar) != aVar) {
                qVar2 = qVar;
                j13 = j11;
                return new b2(qVar2.f18761a, qVar2.f18762b, j13);
            }
        } else {
            g gVarY3 = audioPlayerService.y();
            arrayList = new ArrayList(h00.r.q0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                String mediaId2 = ((q0) it.next()).f1576a;
                kotlin.jvm.internal.m.d(mediaId2, "mediaId");
                arrayList.add(mediaId2);
            }
            bVar.A = null;
            bVar.B = null;
            bVar.C = i14;
            bVar.D = j11;
            bVar.G = 3;
            objV = gVarY3.e(arrayList, bVar);
            if (objV != aVar) {
                i12 = i14;
                j12 = j11;
                List list7 = (List) objV;
                return new b2(list7, a0.y(i12, 0, Math.max(0, va.a.M(list7))), j12);
            }
        }
        return aVar;
    }

    public static final b0 l(AudioPlayerService audioPlayerService, k kVar) {
        audioPlayerService.getClass();
        b0 b0Var = new b0();
        ta.c0.M(audioPlayerService.f5289e0, null, new lu.w(b0Var, null, 6), null, new g6.a(kVar, b0Var, (k00.c) null), 27);
        return b0Var;
    }

    public static final t m(AudioPlayerService audioPlayerService, boolean z11, e1 e1Var) {
        q0 q0VarI;
        dh.o oVar = audioPlayerService.y().f16550b;
        Context context = oVar.A;
        if (z11) {
            String string = context.getString(R.string.app_name);
            kotlin.jvm.internal.m.d(string, "getString(...)");
            q0VarI = dh.o.d(oVar, "premium_required", string, null, null, null, null, null, null, 508);
        } else {
            s0 s0Var = new s0();
            s0Var.f1678a = context.getString(R.string.auto_premium_required);
            s0Var.f1692q = Boolean.FALSE;
            s0Var.f1693r = Boolean.TRUE;
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
            int i11 = rVar.D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.D = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new nv.r(audioPlayerService, cVar);
            }
        } else {
            rVar = new nv.r(audioPlayerService, cVar);
        }
        Object objD = rVar.B;
        Object obj = l00.a.A;
        int i12 = rVar.D;
        g00.b0 b0Var = g00.b0.f7770a;
        if (i12 == 0) {
            t1.O(objD);
            g gVarY = audioPlayerService.y();
            rVar.A = a2Var;
            rVar.D = 1;
            objD = gVarY.f16555g.D(str, rVar);
            if (objD != obj) {
            }
            return obj;
        }
        if (i12 == 1) {
            a2Var = rVar.A;
            t1.O(objD);
        } else {
            if (i12 != 2) {
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
            e eVar = m0.f281a;
            b40.c cVar2 = m.f7417a;
            audioPlayerService2 = audioPlayerService;
            f2 f2Var = new f2(audioPlayerService2, aVar, gVar, null, 18);
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
            if (zVar.f10354l0) {
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
        boolean z11;
        tq.k kVarZ;
        zq.a aVar;
        Integer collectionId;
        bx.b bVarA;
        u30.b bVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.D = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(audioPlayerService, cVar);
            }
        } else {
            sVar = new s(audioPlayerService, cVar);
        }
        Object objD = sVar.B;
        l00.a aVar2 = l00.a.A;
        int i12 = sVar.D;
        g00.b0 b0Var = g00.b0.f7770a;
        if (i12 == 0) {
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
        if (i12 == 1) {
            playerItem = sVar.A;
            t1.O(objD);
        } else {
            if (i12 == 2) {
                t1.O(objD);
                return b0Var;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objD);
                return b0Var;
            }
            playerItem = sVar.A;
            t1.O(objD);
        }
        cVar2 = (bx.c) objD;
        if (cVar2 != null && (bVarA = cVar2.a()) != null && (bVar = bVarA.f3269e) != null && !bVar.isEmpty()) {
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (((f) it.next()).f3288a == playerItem.getSurahId()) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        kVarZ = audioPlayerService.z();
        long surahId = playerItem.getSurahId();
        int reciterId = playerItem.getReciterId();
        if (z11) {
            collectionId = null;
        } else {
            collectionId = playerItem.getCollectionId();
        }
        aVar = new zq.a(surahId, reciterId, z11, collectionId);
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
        } while (((zq.a) next).f24307a != playerItem.getSurahId());
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
                    z11 = false;
                    break;
                }
                z11 = false;
                break;
                kVarZ = audioPlayerService.z();
                long surahId2 = playerItem.getSurahId();
                int reciterId3 = playerItem.getReciterId();
                if (z11) {
                    collectionId = null;
                } else {
                    collectionId = playerItem.getCollectionId();
                }
                aVar = new zq.a(surahId2, reciterId3, z11, collectionId);
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
        return B().a() && ((xu.f) this.f5286b0.getValue()).f23118f.getValue() != null;
    }

    public final boolean E() {
        return x().k() && !D();
    }

    public final List F(g1 g1Var, a2 a2Var) {
        int i11;
        if (!B().a()) {
            z3 z3Var = nv.t.f15505a;
            if (I(g1Var, a2Var)) {
                k9.a aVar = new k9.a(57399);
                aVar.c(1);
                aVar.f(1);
                return va.a.R(aVar.a());
            }
            k9.a aVar2 = new k9.a(57433);
            aVar2.f12679f = getString(R.string.media_notification_back_10);
            aVar2.c(11);
            aVar2.f(2);
            k9.b bVarA = aVar2.a();
            k9.a aVar3 = new k9.a(57430);
            aVar3.f12679f = getString(R.string.media_notification_forward_10);
            aVar3.c(12);
            aVar3.f(3);
            return va.a.S(bVarA, aVar3.a());
        }
        z3 z3Var2 = nv.t.f15505a;
        boolean z11 = this.f5290f0;
        int repeatMode = g1Var.a().getRepeatMode();
        boolean zI = I(g1Var, a2Var);
        boolean zE = E();
        i00.b bVarS = va.a.s();
        if (zI) {
            k9.a aVar4 = new k9.a(57399);
            aVar4.c(1);
            aVar4.f(1);
            bVarS.add(aVar4.a());
        }
        if (zE) {
            if (repeatMode != 1) {
                i11 = repeatMode != 2 ? R.drawable.ic_media_repeat : R.drawable.ic_media_repeat_all;
            } else {
                i11 = R.drawable.ic_media_repeat_one;
            }
            k9.a aVar5 = new k9.a(0);
            aVar5.f12677d = i11;
            aVar5.f12679f = getString(R.string.media_notification_repeat);
            aVar5.d(nv.t.f15506b);
            aVar5.f(6);
            bVarS.add(aVar5.a());
        }
        k9.a aVar6 = new k9.a(z11 ? 1042557 : 59517);
        aVar6.f12679f = getString(R.string.favorite_title);
        aVar6.d(nv.t.f15505a);
        aVar6.f(6);
        bVarS.add(aVar6.a());
        return va.a.k(bVarS);
    }

    public final b1 G(g1 g1Var, a2 a2Var) {
        a1 a1Var;
        if (I(g1Var, a2Var)) {
            b1 b1Var = k9.y1.f13030f;
            b1Var.getClass();
            a1Var = new a1(b1Var);
            a1Var.c(8);
            a1Var.c(6);
            a1Var.c(9);
            a1Var.c(7);
        } else {
            b1 b1Var2 = k9.y1.f13030f;
            b1Var2.getClass();
            a1Var = new a1(b1Var2);
        }
        if ((g1Var.f12785a.n(a2Var) || !kotlin.jvm.internal.m.a(a2Var.a(), getApplicationContext().getPackageName())) && (!x().k() || D())) {
            a1Var.c(5);
            a1Var.c(4);
            a1Var.c(11);
            a1Var.c(12);
        }
        return a1Var.b();
    }

    public final d H(f1 player) {
        p pVar = this.f5291g0;
        tv.b bVar = (tv.b) pVar.getValue();
        bVar.getClass();
        kotlin.jvm.internal.m.e(player, "player");
        if (bVar.f20352c != player) {
            bVar.e();
            bVar.f20352c = player;
            player.addListener(bVar.m);
            xu.f fVar = bVar.f20350a;
            fVar.f23120h = bVar;
            su.s sVarD = fVar.d();
            bVar.a(sVarD != null ? sVarD.f19739c : null);
            bVar.i();
        }
        d dVar = this.f5292h0;
        if (dVar != null) {
            d dVar2 = dVar.getWrappedPlayer() == player ? dVar : null;
            if (dVar2 != null) {
                return dVar2;
            }
        }
        d dVar3 = new d(player, (tv.b) pVar.getValue());
        this.f5292h0 = dVar3;
        return dVar3;
    }

    public final boolean I(g1 g1Var, a2 a2Var) {
        if (x().k()) {
            return false;
        }
        return g1Var.f12785a.n(a2Var) || !kotlin.jvm.internal.m.a(a2Var.a(), getApplicationContext().getPackageName());
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
                for (int i11 = 0; i11 < mediaItemCount; i11++) {
                    q0 mediaItemAt = f1VarA2.getMediaItemAt(i11);
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
            f1Var.setMediaItems(aVar.f21122a, aVar.f21123b, aVar.f21124c);
            f1Var.setRepeatMode(aVar.f21126e);
            f1Var.setShuffleModeEnabled(aVar.f21127f);
            f1Var.prepare();
            f1Var.setPlayWhenReady(aVar.f21125d);
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

    @Override
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
        int i11 = 1;
        nv.a aVar = new nv.a(this, i11);
        int i12 = 2;
        nv.a aVar2 = new nv.a(this, i12);
        int i13 = 3;
        nv.a aVar3 = new nv.a(this, i13);
        jVar.getClass();
        c scope = this.f5288d0;
        kotlin.jvm.internal.m.e(scope, "scope");
        jVar.f15490k = aVar;
        jVar.l = aVar2;
        jVar.m = aVar3;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        jVar.f15492o = string;
        k00.c cVar = null;
        jVar.f15493p = null;
        jVar.f15494q = 0L;
        int i14 = 0;
        jVar.f15497t = false;
        jVar.f15496s = 0;
        jVar.f15498u = false;
        jVar.f15495r = SystemClock.elapsedRealtime();
        e eVar = m0.f281a;
        b40.c cVar2 = m.f7417a;
        int i15 = 4;
        List list = (List) jVar.f15488i.getAndSet(va.a.S(ta.c0.M(scope, cVar2.F, null, null, new ns.i(jVar, cVar, i12), 30), ta.c0.M(scope, cVar2.F, null, null, new ns.i(jVar, cVar, i13), 30), ta.c0.M(scope, null, null, null, new ns.i(jVar, cVar, i15), 31)));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a40.e1) it.next()).i(null);
            }
        }
        jVar.i();
        ta.c0.M(jVar.f15486g, null, null, null, new ns.i(jVar, cVar, i11), 31);
        if (x().k()) {
            ((hq.b) v()).c();
        }
        super.onCreate();
        f4 f4Var = new f4(this, 3);
        ta.c0.A(!f4Var.B);
        oe.o oVar = new oe.o(f4Var);
        f4Var.B = true;
        oVar.A = R.drawable.app_icon;
        i0.M(this.B, new ji.a(this, oVar, 20));
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, 9), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, 10), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i14), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i11), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i12), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i13), 31);
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i15), 31);
        int i16 = 5;
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i16), 31);
        int i17 = 6;
        ta.c0.M(scope, null, null, null, new nv.e(this, cVar, i17), 31);
        ta.c0.M(scope, null, new l1(i12, cVar, i13), null, new nv.e(this, cVar, 7), 27);
        ta.c0.M(scope, null, new l1(i12, cVar, i17), null, new nv.e(this, cVar, 12), 27);
        ta.c0.M(scope, null, new l1(i12, cVar, i16), null, new nv.e(this, cVar, 11), 27);
        ta.c0.M(scope, null, new l1(i12, cVar, i15), null, new nv.e(this, cVar, 8), 27);
        zu.a aVarB = B();
        gz.e1 e1Var = new gz.e1(1, this, AudioPlayerService.class, "onPlaybackOwnerChanged", "onPlaybackOwnerChanged(Lcom/mchutov/quranify/player/domain/model/PlaybackOwner;)V", 0, 8);
        aVarB.getClass();
        aVarB.f24322d = e1Var;
        e1Var.invoke(aVarB.f24320b.getValue());
    }

    @Override
    public final void onDestroy() {
        B().f24322d = null;
        z zVar = ((no.e) this.Y.getValue()).f15429b;
        if (zVar != null) {
            zVar.pause();
        }
        j jVar = (j) this.J.getValue();
        List list = (List) jVar.f15488i.getAndSet(x.A);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a40.e1) it.next()).i(null);
            }
        }
        f1 f1Var = jVar.f15491n;
        if (f1Var == null) {
            nv.a aVar = jVar.f15490k;
            f1Var = aVar != null ? (f1) aVar.invoke() : null;
        }
        ss.d dVarF = (jVar.f15493p == null || f1Var == null) ? null : jVar.f(f1Var, ss.f.STOP, null);
        jVar.f15497t = false;
        try {
            f1 f1Var2 = jVar.f15491n;
            if (f1Var2 != null) {
                f1Var2.removeListener(jVar.f15499v);
            }
        } catch (Throwable th2) {
            t1.s(th2);
        }
        jVar.f15491n = null;
        jVar.k(va.a.T(dVarF), ns.k.C);
        if (jVar.f15484e.f22412a.isAuthorized()) {
            jVar.f15482c.b();
        }
        A().i();
        ((nn.k) this.V.getValue()).a(null, false);
        ((tv.b) this.f5291g0.getValue()).e();
        this.f5287c0.i(null);
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
        s1 s1Var = g1Var.f12785a;
        z3 z3Var = nv.t.f15505a;
        a4 a4VarA = nv.t.a(E());
        r0 r0VarListIterator = s1Var.g().listIterator(0);
        while (r0VarListIterator.hasNext()) {
            Object next = r0VarListIterator.next();
            kotlin.jvm.internal.m.d(next, "next(...)");
            a2 a2Var = (a2) next;
            b1 b1VarG = G(g1Var, a2Var);
            t2 t2Var = s1Var.f12898h;
            oj.q qVar = s1Var.f12897g.f12862f;
            if (qVar.M(a2Var)) {
                if (s1Var.n(a2Var)) {
                    t2Var.L(a4VarA, b1VarG);
                    a2 a2VarJ = s1Var.j();
                    if (a2VarJ != null) {
                        (a2VarJ.f12685b == 0 ? t2Var.f12940e : qVar).V(a2VarJ, a4VarA, b1VarG);
                    }
                }
                qVar.V(a2Var, a4VarA, b1VarG);
                b1 b1VarA = qVar.A(a2Var);
                if (b1VarA != null) {
                    s1Var.e(a2Var, new k9.b1(a4VarA, b1VarA));
                    s1Var.f12893c.a(false, false);
                }
            } else if (a2Var.f12685b == 0) {
                t2Var.f12940e.V(a2Var, a4VarA, b1VarG);
            }
            if (s1Var.n(a2Var)) {
                g1Var.e(a2Var, F(g1Var, a2Var));
            }
        }
    }

    public final g1 t(f1 f1Var) {
        f1Var.addListener(this.f5293i0);
        d dVarH = H(f1Var);
        nv.p pVar = new nv.p(this);
        ta.c0.s(dVarH.canAdvertiseSession());
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        r0 r0Var = fh.t0.B;
        d2 d2Var = d2.E;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        kotlin.jvm.internal.m.d(activity, "getActivity(...)");
        ta.c0.s(activity.isActivity());
        Object obj = g1.f12783b;
        int iIntValue = ((Integer) s1.K.get()).intValue();
        c7.g gVar = new c7.g(this);
        gVar.f3768a = iIntValue;
        gVar.f3769b = true;
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
