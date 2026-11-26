package dq;

import a40.u1;
import android.content.SharedPreferences;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import g00.b0;
import java.io.IOException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import ta.c0;

public final class u extends vm.a {
    public final aq.a d;
    public final tq.k e;
    public final xw.k f;
    public final xw.e g;
    public final uu.a h;
    public final au.a i;
    public Integer j;
    public u1 k;
    public Integer l;

    public u(aq.a aVar, tq.k kVar, xw.k kVar2, xw.e eVar, uu.a aVar2, au.a aVar3) throws IOException {
        super(new m(true, false, true, null, false));
        this.d = aVar;
        this.e = kVar;
        this.f = kVar2;
        this.g = eVar;
        this.h = aVar2;
        this.i = aVar3;
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, 0 == true ? 1 : 0, 0), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, 0 == true ? 1 : 0, 1), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, 0 == true ? 1 : 0, 2), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, 0 == true ? 1 : 0, 3), 31);
        SharedPreferences sharedPreferences = eVar.a;
        if (sharedPreferences.getBoolean("skipReciterEventCelebrationAfterOnboardingOnce", false)) {
            oi.k.v(sharedPreferences, "skipReciterEventCelebrationAfterOnboardingOnce", false);
            u1 u1Var = this.k;
            if (u1Var != null) {
                u1Var.i(null);
            }
            this.k = null;
            this.j = null;
            i(m.a((m) this.c.d.getValue(), false, false, null, false, 7));
            ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) eVar.e.getValue();
            if (reciterCollectionEvent != null) {
                String strR0 = h00.q.R0(h00.q.h1(reciterCollectionEvent.getReciterIds()), ",", null, null, null, 62);
                Long releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis();
                String strValueOf = releaseAtEpochMillis != null ? String.valueOf(releaseAtEpochMillis.longValue()) : null;
                String key = strR0 + "|" + (strValueOf == null ? "" : strValueOf);
                kotlin.jvm.internal.m.e(key, "key");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("lastSeenReciterEventCelebrationKey", key);
                editorEdit.apply();
            }
        }
    }

    public static final Object j(u uVar, PlayerItem playerItem, m00.c cVar) {
        q qVar;
        boolean z;
        bx.b bVarA;
        u30.b bVar;
        uVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.D = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(uVar, cVar);
            }
        } else {
            qVar = new q(uVar, cVar);
        }
        Object objD = qVar.B;
        l00.a aVar = l00.a.A;
        int i2 = qVar.D;
        if (i2 == 0) {
            t1.O(objD);
            xw.k kVar = uVar.f;
            int reciterId = playerItem.getReciterId();
            qVar.A = playerItem;
            qVar.D = 1;
            objD = kVar.d(reciterId, qVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playerItem = qVar.A;
            t1.O(objD);
        }
        bx.c cVar2 = (bx.c) objD;
        if (cVar2 != null && (bVarA = cVar2.a()) != null && (bVar = bVarA.e) != null && !bVar.isEmpty()) {
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((bx.f) it.next()).a == playerItem.getSurahId()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        return new zq.a(playerItem.getSurahId(), playerItem.getReciterId(), z, z ? null : playerItem.getCollectionId());
    }

    public static final Object k(u uVar, ReciterCollectionEvent event, m00.c cVar) throws IOException {
        r rVar;
        pm.b bVar = uVar.c;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.D = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(uVar, cVar);
            }
        } else {
            rVar = new r(uVar, cVar);
        }
        Object obj = rVar.B;
        l00.a aVar = l00.a.A;
        int i2 = rVar.D;
        if (i2 == 0) {
            t1.O(obj);
            uVar.i(m.a((m) bVar.d.getValue(), false, false, null, true, 15));
            rVar.A = event;
            rVar.D = 1;
            if (a40.c0.l(3000L, rVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            event = rVar.A;
            t1.O(obj);
        }
        uVar.i(m.a((m) bVar.d.getValue(), false, false, null, false, 15));
        xw.e eVar = uVar.g;
        kotlin.jvm.internal.m.e(event, "event");
        String strR0 = h00.q.R0(h00.q.h1(event.getReciterIds()), ",", null, null, null, 62);
        Long releaseAtEpochMillis = event.getReleaseAtEpochMillis();
        String strValueOf = releaseAtEpochMillis != null ? String.valueOf(releaseAtEpochMillis.longValue()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        String key = x5.m(strR0, "|", strValueOf);
        eVar.getClass();
        kotlin.jvm.internal.m.e(key, "key");
        SharedPreferences.Editor editorEdit = eVar.a.edit();
        editorEdit.putString("lastSeenReciterEventCelebrationKey", key);
        editorEdit.apply();
        return b0.a;
    }

    public final void l(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new t(this, bVar.a, bVar.b, (k00.c) null), 31);
            return;
        }
        if (dVar instanceof a) {
            i(m.a((m) this.c.d.getValue(), false, false, null, false, 29));
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d6.e(((c) dVar).a, this, (k00.c) null), 31);
        }
    }

    public final void m(Integer num) {
        i(m.a((m) this.c.d.getValue(), false, false, num, false, 23));
    }
}
