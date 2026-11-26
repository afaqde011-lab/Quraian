package q0;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import l1.q2;

public abstract class j0 {

    public static final q2 f12636a = new q2(new h.e(21));

    public static Boolean f12637b;

    public static final void a(final m3.h hVar, final m3.r0 r0Var, final q3.h hVar2, final List list, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        Executor executor = (Executor) g0Var.k(f12636a);
        if (executor == null || !b(hVar.B.length())) {
            g0Var.c0(-517090505);
            g0Var.r(false);
            return;
        }
        g0Var.c0(-518737659);
        final y3.m mVar = (y3.m) g0Var.k(c3.o1.f2738n);
        final y3.c cVar = (y3.c) g0Var.k(c3.o1.f2734h);
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    z1.b bVarC;
                    m3.r0 r0Var2 = r0Var;
                    y3.m mVar2 = mVar;
                    m3.h hVar3 = hVar;
                    y3.c cVar2 = cVar;
                    q3.h hVar4 = hVar2;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        z1.f fVarJ = z1.l.j();
                        z1.b bVar = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
                        if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            z1.f fVarJ2 = bVarC.j();
                            try {
                                m3.r0 r0VarJ = m3.h0.j(r0Var2, mVar2);
                                h00.x xVar = list;
                                if (xVar == null) {
                                    xVar = h00.x.A;
                                }
                                ce.c cVar3 = new ce.c(hVar3, r0VarJ, (List) xVar, cVar2, hVar4);
                                cVar3.l();
                                cVar3.c();
                                z1.f.q(fVarJ2);
                                bVarC.w().e();
                                bVarC.c();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                z1.f.q(fVarJ2);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bVarC.c();
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        g0Var.r(false);
    }

    public static final boolean b(int i10) {
        if (i10 >= 8 && i10 < 1000) {
            if (f12637b == null) {
                f12637b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f12637b;
            kotlin.jvm.internal.m.b(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
