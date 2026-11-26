package k9;

import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;

public final class d implements Runnable {
    public final int A;
    public final s1 B;
    public final a2 C;

    public d(s1 s1Var, a2 a2Var, int i10) {
        this.A = i10;
        this.B = s1Var;
        this.C = a2Var;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        int i11 = 22;
        a2 a2Var = this.C;
        s1 s1Var = this.B;
        switch (i10) {
            case 0:
                if (!s1Var.o()) {
                    fh.j0 j0Var = s1Var.H;
                    z1 z1Var = a2Var.f9209d;
                    z1Var.getClass();
                    fh.s2 it = fh.e1.n(j0Var.l(z1Var)).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        z1 z1Var2 = a2Var.f9209d;
                        z1Var2.getClass();
                        s1Var.G.remove(str, a2Var);
                        j0Var.remove(z1Var2, str);
                    }
                    if (s1Var.A) {
                        if (!s1.p(a2Var)) {
                            if (s1Var.n(a2Var)) {
                                s1Var.A = false;
                            }
                        }
                    }
                    nv.p pVar = s1Var.f9417e;
                    g1 g1Var = s1Var.f9423k;
                    pVar.getClass();
                    kotlin.jvm.internal.m.e(g1Var, "session");
                    AudioPlayerService audioPlayerService = pVar.a;
                    int i12 = AudioPlayerService.j0;
                    if (kotlin.jvm.internal.m.a(a2Var.a(), "com.google.android.projection.gearhead")) {
                        audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoDisconnected.INSTANCE);
                    }
                    break;
                }
                break;
            case 1:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 7, p3.n2(new j7.e(26)));
                break;
            case 2:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 12, p3.n2(new j7.e(28)));
                break;
            case 3:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 11, p3.n2(new j7.e(25)));
                break;
            case 4:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 3, p3.n2(new b3(4)));
                break;
            case 5:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 1, p3.n2(new j7.e(i11)));
                break;
            case 6:
                s1Var.f9419g.j2(a2Var, Integer.MIN_VALUE);
                break;
            case 7:
                s1Var.f9419g.j2(a2Var, Integer.MIN_VALUE);
                break;
            case 8:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 1, p3.n2(new j7.e(i11)));
                break;
            default:
                s1Var.f9419g.l2(a2Var, Integer.MIN_VALUE, 9, p3.n2(new j7.e(29)));
                break;
        }
    }
}
