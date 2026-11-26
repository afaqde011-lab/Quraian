package ib;

import ab.l0;
import java.util.Set;
import za.v;

public final class j implements Runnable {
    public final ab.g A;
    public final ab.m B;
    public final boolean C;
    public final int D;

    public j(ab.g gVar, ab.m mVar, boolean z10, int i10) {
        kotlin.jvm.internal.m.e(gVar, "processor");
        kotlin.jvm.internal.m.e(mVar, "token");
        this.A = gVar;
        this.B = mVar;
        this.C = z10;
        this.D = i10;
    }

    @Override
    public final void run() {
        boolean zD;
        l0 l0VarB;
        if (this.C) {
            ab.g gVar = this.A;
            ab.m mVar = this.B;
            int i10 = this.D;
            gVar.getClass();
            String str = mVar.f397a.f6976a;
            synchronized (gVar.f378k) {
                l0VarB = gVar.b(str);
            }
            zD = ab.g.d(str, l0VarB, i10);
        } else {
            ab.g gVar2 = this.A;
            ab.m mVar2 = this.B;
            int i11 = this.D;
            gVar2.getClass();
            String str2 = mVar2.f397a.f6976a;
            synchronized (gVar2.f378k) {
                try {
                    if (gVar2.f373f.get(str2) != null) {
                        v.d().a(ab.g.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) gVar2.f375h.get(str2);
                        if (set != null && set.contains(mVar2)) {
                            zD = ab.g.d(str2, gVar2.b(str2), i11);
                        }
                    }
                    zD = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        v.d().a(v.f("StopWorkRunnable"), "StopWorkRunnable for " + this.B.f397a.f6976a + "; Processor.stopWork = " + zD);
    }
}
