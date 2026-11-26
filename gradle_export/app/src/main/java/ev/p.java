package ev;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import androidx.media3.exoplayer.ExoPlayer;
import b3.k0;
import b3.p1;
import c3.t2;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d40.x0;
import g1.k8;
import g1.m6;
import gz.m1;
import h1.n0;
import java.util.Locale;
import jp.e0;
import k9.b3;
import l1.o1;
import l1.q0;
import l1.w1;
import l1.z0;
import nx.i0;
import nx.p0;

public final class p extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public final Object E;

    public p(Object obj, Object obj2, Object obj3, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public p(Object obj, Object obj2, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.E = obj2;
    }

    public p(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.E = obj;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new p((j0.v) this.C, (t2) this.D, (g2.l) this.E, cVar, 0);
            case 1:
                return new p((ez.t) this.C, (q2.a) this.D, (xk.d) this.E, cVar, 1);
            case 2:
                return new p((fy.c0) this.C, (cq.a) this.D, (aq.a) this.E, cVar, 2);
            case 3:
                return new p((c00.x) this.C, (ExoPlayer) this.D, (u00.a) this.E, cVar, 3);
            case 4:
                return new p((m6) this.C, (m1) this.D, (ep.e) this.E, cVar, 4);
            case 5:
                p pVar = new p((m1) this.D, (String) this.E, cVar, 5);
                pVar.C = obj;
                return pVar;
            case 6:
                return new p((m1) this.D, (ep.a) this.E, cVar, 6);
            case 7:
                return new p((m1) this.D, (ep.m) this.E, cVar, 7);
            case 8:
                return new p((u00.n) this.C, this.D, (a40.z) this.E, cVar, 8);
            case 9:
                p pVar2 = new p((u00.a) this.D, (u00.n) this.E, cVar, 9);
                pVar2.C = obj;
                return pVar2;
            case 10:
                p pVar3 = new p((u00.o) this.D, (fc.n) this.E, cVar, 10);
                pVar3.C = obj;
                return pVar3;
            case 11:
                p pVar4 = new p((u00.p) this.D, (fc.n) this.E, cVar, 11);
                pVar4.C = obj;
                return pVar4;
            case 12:
                return new p((x0) this.D, (k8) this.E, cVar, 12);
            case 13:
                p pVar5 = new p((Context) this.E, cVar, 13);
                pVar5.D = obj;
                return pVar5;
            case 14:
                return new p((x.b) this.C, (z0) this.D, (z0) this.E, cVar, 14);
            case 15:
                return new p((e0) this.C, (hp.a) this.D, (ol.b) this.E, cVar, 15);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                p pVar6 = new p((jw.b) this.D, (ep.k) this.E, cVar, 16);
                pVar6.C = obj;
                return pVar6;
            case 17:
                return new p((jx.x) this.C, (u00.a) this.D, (cq.a) this.E, cVar, 17);
            case 18:
                return new p((l0.z) this.C, (x.y) this.D, (l2.b) this.E, cVar, 18);
            case 19:
                p pVar7 = new p((w1) this.D, (q0) this.E, cVar, 19);
                pVar7.C = obj;
                return pVar7;
            case 20:
                p pVar8 = new p((k00.i) this.D, (d40.i) this.E, cVar, 20);
                pVar8.C = obj;
                return pVar8;
            case 21:
                p pVar9 = new p((SessionWorker) this.D, (d6.r) this.E, cVar, 21);
                pVar9.C = obj;
                return pVar9;
            case 22:
                p pVar10 = new p((u00.n) this.D, (b3) this.E, cVar, 22);
                pVar10.C = obj;
                return pVar10;
            case 23:
                p pVar11 = new p((wb.i) this.D, (lb.j) this.E, cVar, 23);
                pVar11.C = obj;
                return pVar11;
            case 24:
                return new p((lu.e0) this.C, (cu.a) this.D, (e.j) this.E, cVar, 24);
            case 25:
                p pVar12 = new p((Locale) this.E, cVar, 25);
                pVar12.D = obj;
                return pVar12;
            case 26:
                return new p((n0.g) this.C, (p1) this.D, (k0) this.E, cVar, 26);
            case 27:
                return new p((p0) this.C, (u00.a) this.D, (Context) this.E, cVar, 27);
            case 28:
                return new p((i0) this.C, (p0) this.D, (PlayerItem) this.E, cVar, 28);
            default:
                return new p((bl.a) this.D, (ol.b) this.E, cVar, 29);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                return ((p) create((Throwable) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 6:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 7:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 8:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 9:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 10:
                return ((p) create((n0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 11:
                return ((p) create((g00.k) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 12:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 13:
                return ((p) create((o1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 14:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 15:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 17:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 18:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 19:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 20:
                return ((p) create((o1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 21:
                return ((p) create((l6.y) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 22:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 23:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 24:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 25:
                return ((p) create((o1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 26:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 27:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 28:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((p) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ev.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
