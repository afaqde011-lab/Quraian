package no;

import a40.u1;
import ab.a0;
import android.os.SystemClock;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.q0;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryPaywallTrigger;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import h00.q;
import ho.p;
import ta.c0;

public final class i implements d1 {
    public final int A;
    public final Object B;

    public i(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public final void U(e1 oldPosition, e1 newPosition, int i) {
        int i2;
        f1 f1Var;
        int i3 = this.A;
        Object obj = this.B;
        switch (i3) {
            case 0:
                n nVar = (n) obj;
                kotlin.jvm.internal.m.e(oldPosition, "oldPosition");
                kotlin.jvm.internal.m.e(newPosition, "newPosition");
                if (i == 1 && (i2 = nVar.u) > 0) {
                    nVar.u = i2 - 1;
                    break;
                } else if (i == 1 && oldPosition.b == newPosition.b) {
                    nVar.s(!nVar.b.a().getPlayWhenReady());
                    d dVar = nVar.m;
                    long j = oldPosition.f;
                    long j2 = newPosition.f;
                    if (dVar.f != null) {
                        d.b(dVar, ho.l.SEEK, j2, null, Long.valueOf(j), 0, 52);
                        break;
                    }
                }
                break;
            default:
                ns.j jVar = (ns.j) obj;
                kotlin.jvm.internal.m.e(oldPosition, "oldPosition");
                kotlin.jvm.internal.m.e(newPosition, "newPosition");
                if (oldPosition.b == newPosition.b) {
                    if (i == 1 && (f1Var = jVar.n) != null) {
                        ss.f fVar = ss.f.SEEK;
                        long j3 = newPosition.f;
                        ss.d dVarF = jVar.f(f1Var, fVar, Long.valueOf(j3 >= 0 ? j3 : 0L));
                        if (dVarF != null) {
                            jVar.k(va.a.R(dVarF), ns.k.A);
                            break;
                        }
                    }
                } else {
                    long j4 = oldPosition.f;
                    jVar.q = j4 >= 0 ? j4 : 0L;
                    break;
                }
                break;
        }
    }

    public final void V(boolean z) {
        h hVar;
        ho.g gVarD;
        switch (this.A) {
            case 0:
                n nVar = (n) this.B;
                d dVar = nVar.m;
                e eVar = nVar.b;
                long currentPosition = eVar.a().getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                k00.c cVar = null;
                if (z) {
                    u1 u1Var = nVar.E;
                    if (u1Var != null) {
                        u1Var.i(null);
                    }
                    nVar.E = c0.M(nVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new m(nVar, cVar, 6), 31);
                    ho.a aVar = nVar.s;
                    if (aVar == null || (gVarD = nVar.d()) == null) {
                        hVar = null;
                    } else {
                        int i = aVar.a;
                        int i2 = gVarD.a;
                        String strA = gVarD.c;
                        if (r30.k.L0(strA)) {
                            strA = nVar.e.a();
                        }
                        hVar = new h(i, strA, i2);
                    }
                    if (hVar != null) {
                        float f = ((p) nVar.r.getValue()).f;
                        dVar.getClass();
                        if (dVar.f == null) {
                            dVar.f(hVar, ho.o.CONTINUE, currentPosition, f);
                        } else if (dVar.j) {
                            dVar.j = false;
                            d.b(dVar, ho.l.RESUME, currentPosition, null, null, 0, 60);
                        }
                        if (!dVar.k) {
                            dVar.k = true;
                            dVar.l = SystemClock.elapsedRealtime();
                        }
                    }
                } else {
                    u1 u1Var2 = nVar.E;
                    if (u1Var2 != null) {
                        u1Var2.i(null);
                    }
                    if (eVar.a().getPlayWhenReady()) {
                        dVar.d();
                    } else {
                        nVar.s(true);
                        dVar.d();
                        if (dVar.f != null && !dVar.j) {
                            dVar.j = true;
                            d.b(dVar, ho.l.PAUSE, currentPosition, null, null, 0, 60);
                            dVar.c();
                        }
                    }
                }
                nVar.n();
                break;
            default:
                ns.j jVar = (ns.j) this.B;
                f1 f1Var = jVar.n;
                if (f1Var != null) {
                    if (z) {
                        jVar.u = false;
                        jVar.h(f1Var);
                        jVar.t = true;
                        jVar.r = SystemClock.elapsedRealtime();
                    } else if (jVar.u || f1Var.getPlaybackState() == 4) {
                        jVar.u = true;
                        jVar.t = false;
                    } else {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jVar.t) {
                            jVar.s = (int) a0.A(((long) jVar.s) + a0.A(jElapsedRealtime - jVar.r, 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS), 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
                        }
                        jVar.t = false;
                        jVar.r = jElapsedRealtime;
                    }
                    break;
                }
                break;
        }
    }

    public final void m(int i, boolean z) {
        f1 f1Var;
        switch (this.A) {
            case 0:
                n nVar = (n) this.B;
                if (i == 5) {
                    ho.g gVarD = nVar.d();
                    if (gVarD != null) {
                        n.a(nVar, gVarD);
                    }
                    nVar.u(ru.d.OFF);
                }
                break;
            default:
                if (!z) {
                    ns.j jVar = (ns.j) this.B;
                    if (!jVar.u) {
                        if ((i == 1 || i == 2 || i == 3) && (f1Var = jVar.n) != null && f1Var.getPlaybackState() != 4) {
                            ss.d dVarF = jVar.f(f1Var, f1Var.getPlaybackState() == 1 ? ss.f.STOP : ss.f.PAUSE, null);
                            if (dVarF != null) {
                                jVar.t = false;
                                jVar.s = 0;
                                jVar.k(va.a.R(dVarF), ns.k.B);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public final void r(int i) {
        ho.g gVarD;
        f1 f1Var;
        switch (this.A) {
            case 0:
                n nVar = (n) this.B;
                if (i == 4 && (gVarD = nVar.d()) != null) {
                    n.a(nVar, gVarD);
                }
                nVar.n();
                break;
            default:
                if (i == 4) {
                    ns.j jVar = (ns.j) this.B;
                    if (!jVar.u && (f1Var = jVar.n) != null) {
                        jVar.u = true;
                        ss.d dVarF = jVar.f(f1Var, ss.f.AUDIO_END, null);
                        if (dVarF != null) {
                            jVar.t = false;
                            jVar.k(va.a.R(dVarF), ns.k.A);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void u(int i, q0 q0Var) {
        ho.o oVar;
        ho.o oVar2;
        ho.a aVar;
        h hVar;
        ho.a aVar2;
        boolean z;
        long currentPosition;
        long currentPosition2;
        long j;
        long currentPosition3;
        ho.g gVarD;
        String strA;
        switch (this.A) {
            case 0:
                n nVar = (n) this.B;
                e eVar = nVar.b;
                ho.a aVar3 = nVar.s;
                ho.g gVar = aVar3 != null ? (ho.g) q.O0(nVar.C, aVar3.g) : null;
                if (i == 1 && gVar != null) {
                    n.a(nVar, gVar);
                }
                nVar.C = eVar.a().getCurrentMediaItemIndex();
                nVar.p();
                ho.g gVarD2 = nVar.d();
                if (i != 1) {
                    if (i != 2) {
                        oVar2 = null;
                    } else {
                        oVar = ho.o.STORY_SCREEN;
                    }
                    aVar = nVar.s;
                    if (aVar == null && (gVarD = nVar.d()) != null) {
                        int i2 = aVar.a;
                        int i3 = gVarD.a;
                        strA = gVarD.c;
                        if (r30.k.L0(strA)) {
                            strA = nVar.e.a();
                        }
                        hVar = new h(i2, strA, i3);
                    } else {
                        hVar = null;
                    }
                    aVar2 = nVar.s;
                    if (gVarD2 == null && nVar.g(gVarD2, eVar.a().getCurrentPosition())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (oVar2 != null && hVar != null) {
                        d dVar = nVar.m;
                        currentPosition3 = eVar.a().getCurrentPosition();
                        if (currentPosition3 < 0) {
                            currentPosition3 = 0;
                        }
                        dVar.f(hVar, oVar2, currentPosition3, ((p) nVar.r.getValue()).f);
                        if (aVar2 != null && gVarD2 != null && !z) {
                            nVar.j(aVar2, gVarD2);
                        }
                    }
                    if (aVar2 != null && gVarD2 != null && z) {
                        d dVar2 = nVar.m;
                        currentPosition = eVar.a().getCurrentPosition();
                        if (currentPosition < 0) {
                            currentPosition = 0;
                        }
                        dVar2.getClass();
                        dVar2.a(ho.l.PREVIEW_LIMIT_REACHED, currentPosition);
                        eVar.a().pause();
                        AudioStoryPaywallTrigger audioStoryPaywallTrigger = AudioStoryPaywallTrigger.LOCKED_EPISODE;
                        currentPosition2 = nVar.b.a().getCurrentPosition();
                        if (currentPosition2 < 0) {
                            j = 0;
                        } else {
                            j = currentPosition2;
                        }
                        nVar.q(aVar2, gVarD2, audioStoryPaywallTrigger, j);
                    }
                    nVar.n();
                } else {
                    oVar = ho.o.AUTOPLAY_NEXT;
                }
                oVar2 = oVar;
                aVar = nVar.s;
                if (aVar == null) {
                    hVar = null;
                } else {
                    int i4 = aVar.a;
                    int i5 = gVarD.a;
                    strA = gVarD.c;
                    if (r30.k.L0(strA)) {
                        strA = nVar.e.a();
                    }
                    hVar = new h(i4, strA, i5);
                }
                aVar2 = nVar.s;
                if (gVarD2 == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (oVar2 != null) {
                    d dVar3 = nVar.m;
                    currentPosition3 = eVar.a().getCurrentPosition();
                    if (currentPosition3 < 0) {
                        currentPosition3 = 0;
                    }
                    dVar3.f(hVar, oVar2, currentPosition3, ((p) nVar.r.getValue()).f);
                    if (aVar2 != null) {
                        nVar.j(aVar2, gVarD2);
                    }
                }
                if (aVar2 != null) {
                    d dVar4 = nVar.m;
                    currentPosition = eVar.a().getCurrentPosition();
                    if (currentPosition < 0) {
                        currentPosition = 0;
                    }
                    dVar4.getClass();
                    dVar4.a(ho.l.PREVIEW_LIMIT_REACHED, currentPosition);
                    eVar.a().pause();
                    AudioStoryPaywallTrigger audioStoryPaywallTrigger2 = AudioStoryPaywallTrigger.LOCKED_EPISODE;
                    currentPosition2 = nVar.b.a().getCurrentPosition();
                    if (currentPosition2 < 0) {
                        j = 0;
                    } else {
                        j = currentPosition2;
                    }
                    nVar.q(aVar2, gVarD2, audioStoryPaywallTrigger2, j);
                }
                nVar.n();
                break;
            default:
                ns.j jVar = (ns.j) this.B;
                f1 f1Var = jVar.n;
                if (f1Var != null) {
                    boolean z2 = true;
                    if (i != 1 && i != 0) {
                        z2 = false;
                    }
                    if (f1Var.isPlaying() || z2) {
                        jVar.h(f1Var);
                    }
                    break;
                }
                break;
        }
    }
}
