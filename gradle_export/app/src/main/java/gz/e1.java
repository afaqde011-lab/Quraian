package gz;

import android.os.Looper;
import android.view.KeyEvent;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k9.s1;
import k9.v3;
import kotlin.NoWhenBranchMatchedException;
import q0.i2;
import q0.t1;
import q0.v1;
import ur.r1;

public final class e1 extends kotlin.jvm.internal.j implements u00.k {
    public final int A;

    public e1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.A = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        ExoPlayer exoPlayerH;
        Integer numA;
        q0.e1 e1VarB;
        switch (this.A) {
            case 0:
                m0 p0 = (m0) obj;
                kotlin.jvm.internal.m.e(p0, "p0");
                ((m1) this.receiver).l(p0);
                return g00.b0.a;
            case 1:
                CastContext p1 = (CastContext) obj;
                kotlin.jvm.internal.m.e(p1, "p0");
                ((hq.b) this.receiver).a(p1);
                return g00.b0.a;
            case 2:
                hx.l p2 = (hx.l) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                ((hx.e0) this.receiver).k(p2);
                return g00.b0.a;
            case 3:
                jp.t p3 = (jp.t) obj;
                kotlin.jvm.internal.m.e(p3, "p0");
                ((jp.e0) this.receiver).l(p3);
                return g00.b0.a;
            case 4:
                jx.j p4 = (jx.j) obj;
                kotlin.jvm.internal.m.e(p4, "p0");
                ((jx.x) this.receiver).j(p4);
                return g00.b0.a;
            case 5:
                jz.k p5 = (jz.k) obj;
                kotlin.jvm.internal.m.e(p5, "p0");
                ((jz.d0) this.receiver).h(p5);
                return g00.b0.a;
            case 6:
                String p6 = (String) obj;
                kotlin.jvm.internal.m.e(p6, "p0");
                ((lq.a) this.receiver).getClass();
                return lq.a.a(p6);
            case 7:
                lu.p p7 = (lu.p) obj;
                kotlin.jvm.internal.m.e(p7, "p0");
                ((lu.e0) this.receiver).k(p7);
                return g00.b0.a;
            case 8:
                ru.a p8 = (ru.a) obj;
                kotlin.jvm.internal.m.e(p8, "p0");
                AudioPlayerService audioPlayerService = (AudioPlayerService) this.receiver;
                k9.g1 g1Var = audioPlayerService.I;
                if (g1Var != null) {
                    int iOrdinal = p8.ordinal();
                    if (iOrdinal == 0) {
                        i7.z zVar = audioPlayerService.H;
                        if (zVar == null) {
                            zVar = audioPlayerService.G;
                        }
                        if (zVar != null) {
                            exoPlayerH = audioPlayerService.H(zVar);
                        }
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        exoPlayerH = ((no.e) audioPlayerService.Y.getValue()).a();
                    }
                    if (g1Var.a() != exoPlayerH) {
                        g1Var.a().pause();
                        ta.c0.s(exoPlayerH.canAdvertiseSession());
                        ta.c0.s(exoPlayerH.getApplicationLooper() == g1Var.a().getApplicationLooper());
                        ta.c0.A(exoPlayerH.getApplicationLooper() == Looper.myLooper());
                        s1 s1Var = g1Var.a;
                        if (exoPlayerH != s1Var.t.getWrappedPlayer()) {
                            s1Var.H(s1Var.t, new v3(exoPlayerH));
                        }
                    }
                    if (p8 == ru.a.A && audioPlayerService.H == null && audioPlayerService.x().k() && ((Boolean) ((hq.b) audioPlayerService.v()).c.getValue()).booleanValue()) {
                        audioPlayerService.K();
                    }
                    audioPlayerService.s();
                }
                return g00.b0.a;
            case 9:
                nx.x p9 = (nx.x) obj;
                kotlin.jvm.internal.m.e(p9, "p0");
                ((nx.p0) this.receiver).j(p9);
                return g00.b0.a;
            case 10:
                nx.x p11 = (nx.x) obj;
                kotlin.jvm.internal.m.e(p11, "p0");
                ((nx.p0) this.receiver).j(p11);
                return g00.b0.a;
            case 11:
                nz.h p12 = (nz.h) obj;
                kotlin.jvm.internal.m.e(p12, "p0");
                ((nz.n) this.receiver).j(p12);
                return g00.b0.a;
            case 12:
                oo.a0 p13 = (oo.a0) obj;
                kotlin.jvm.internal.m.e(p13, "p0");
                ((oo.g1) this.receiver).j(p13);
                return g00.b0.a;
            case 13:
                String p14 = (String) obj;
                kotlin.jvm.internal.m.e(p14, "p0");
                return ((p20.h) this.receiver).o(p14);
            case 14:
                pz.f p15 = (pz.f) obj;
                kotlin.jvm.internal.m.e(p15, "p0");
                ((pz.l) this.receiver).j(p15);
                return g00.b0.a;
            case 15:
                pz.f p16 = (pz.f) obj;
                kotlin.jvm.internal.m.e(p16, "p0");
                ((pz.l) this.receiver).j(p16);
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                KeyEvent keyEvent = ((t2.b) obj).a;
                v1 v1Var = (v1) this.receiver;
                e1.z0 z0Var = v1Var.f;
                boolean z = v1Var.d;
                boolean z2 = true;
                r3.a aVar = (q0.q.A(keyEvent) && (numA = v1Var.i.a(keyEvent)) != null) ? new r3.a(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
                if (aVar != null) {
                    if (z) {
                        v1Var.a(va.a.R(aVar));
                        z0Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (t2.d.c(keyEvent) != 2 || (e1VarB = v1Var.j.b(keyEvent)) == null || (e1VarB.A && !z)) {
                    z2 = false;
                } else {
                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                    vVar.A = true;
                    t1 t1Var = new t1(e1VarB, v1Var, vVar, 1);
                    r3.w wVar = v1Var.c;
                    e1.n0 n0Var = new e1.n0(wVar, v1Var.g, v1Var.a.d(), z0Var);
                    t1Var.invoke(n0Var);
                    if (!m3.q0.c(n0Var.f, wVar.b) || !kotlin.jvm.internal.m.a(n0Var.g, wVar.a)) {
                        v1Var.k.invoke(r3.w.b(wVar, n0Var.g, n0Var.f, 4));
                    }
                    i2 i2Var = v1Var.h;
                    if (i2Var != null) {
                        i2Var.e = true;
                    }
                    z2 = vVar.A;
                }
                return Boolean.valueOf(z2);
            case 17:
                qo.l p17 = (qo.l) obj;
                kotlin.jvm.internal.m.e(p17, "p0");
                ((qo.y) this.receiver).j(p17);
                return g00.b0.a;
            case 18:
                qx.j p18 = (qx.j) obj;
                kotlin.jvm.internal.m.e(p18, "p0");
                ((qx.t) this.receiver).j(p18);
                return g00.b0.a;
            case 19:
                ur.p0 p19 = (ur.p0) obj;
                kotlin.jvm.internal.m.e(p19, "p0");
                ((r1) this.receiver).l(p19);
                return g00.b0.a;
            case 20:
                ur.p0 p21 = (ur.p0) obj;
                kotlin.jvm.internal.m.e(p21, "p0");
                ((r1) this.receiver).l(p21);
                return g00.b0.a;
            case 21:
                uy.g p22 = (uy.g) obj;
                kotlin.jvm.internal.m.e(p22, "p0");
                ((uy.l) this.receiver).j(p22);
                return g00.b0.a;
            case 22:
                uy.g p23 = (uy.g) obj;
                kotlin.jvm.internal.m.e(p23, "p0");
                ((uy.l) this.receiver).j(p23);
                return g00.b0.a;
            case 23:
                long j = ((h2.b) obj).a;
                w0.g gVar = (w0.g) this.receiver;
                gVar.getClass();
                x0.f fVar = (x0.f) b3.m.h(gVar, x0.g.a);
                if (fVar != null) {
                    a40.c0.y(gVar.p1(), null, null, new b1.w(gVar, j, fVar, new w0.f(gVar, j), (k00.c) null), 3);
                }
                return g00.b0.a;
            case 24:
                ((s0.a) this.receiver).b.a((u00.k) obj);
                return g00.b0.a;
            case 25:
                wy.f p24 = (wy.f) obj;
                kotlin.jvm.internal.m.e(p24, "p0");
                wy.p pVar = (wy.p) this.receiver;
                pm.b bVar = pVar.c;
                if (p24 instanceof wy.d) {
                    pVar.i(wy.o.a((wy.o) bVar.d.getValue(), ((wy.d) p24).a, null, null, null, false, null, 0, 92));
                } else if (p24 instanceof wy.e) {
                    pVar.i(wy.o.a((wy.o) bVar.d.getValue(), null, null, ((wy.e) p24).a, null, false, null, 0, 91));
                } else if (p24 instanceof wy.c) {
                    pVar.i(wy.o.a((wy.o) bVar.d.getValue(), null, null, null, ((wy.c) p24).a, false, null, 0, 87));
                } else if (p24 instanceof wy.b) {
                    wy.o oVar = (wy.o) bVar.d.getValue();
                    Map mapC = oVar.c();
                    String str = oVar.d;
                    String str2 = oVar.c;
                    Collection collectionG = ((h00.g) mapC).g();
                    boolean z3 = true;
                    if (!collectionG.isEmpty()) {
                        Iterator it = collectionG.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z3 = false;
                            }
                        }
                    }
                    if (!r30.k.L0(oVar.a) && z3 && !z3.E(str2) && !r30.k.L0(str) && str2.equals(str) && !oVar.b() && !oVar.e) {
                        k00.c cVar = null;
                        ta.c0.M(androidx.lifecycle.u0.i(pVar), (k00.i) null, new lu.w(pVar, cVar, 20), new a1.r1(pVar, (k00.c) null, 11), new rm.c(pVar, oVar, cVar, 23), 19);
                    }
                } else {
                    if (!(p24 instanceof wy.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ab.a0.A0(pVar, wy.h.a);
                }
                return g00.b0.a;
            case 26:
                xy.j p25 = (xy.j) obj;
                kotlin.jvm.internal.m.e(p25, "p0");
                ((xy.o) this.receiver).j(p25);
                return g00.b0.a;
            case 27:
                long jLongValue = ((Number) obj).longValue();
                yc.e eVar = (yc.e) this.receiver;
                synchronized (eVar) {
                    eVar.F(jLongValue, "events");
                }
                return g00.b0.a;
            case 28:
                long jLongValue2 = ((Number) obj).longValue();
                yc.e eVar2 = (yc.e) this.receiver;
                synchronized (eVar2) {
                    eVar2.F(jLongValue2, "identifys");
                }
                return g00.b0.a;
            default:
                long jLongValue3 = ((Number) obj).longValue();
                yc.e eVar3 = (yc.e) this.receiver;
                synchronized (eVar3) {
                    if (eVar3.D >= 4) {
                        eVar3.F(jLongValue3, "identify_interceptor");
                    }
                }
                return g00.b0.a;
        }
    }
}
