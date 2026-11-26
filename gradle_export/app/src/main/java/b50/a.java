package b50;

import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import x40.b0;
import x40.r;
import x40.w;

public final class a implements r {
    public static final a b = new a();

    @Override
    public final b0 a(c50.f fVar) throws IOException {
        j jVar = (j) fVar.g;
        synchronized (jVar) {
            try {
                if (!jVar.L) {
                    throw new IllegalStateException("released");
                }
                if (jVar.K) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.J) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f finder = jVar.G;
        kotlin.jvm.internal.m.b(finder);
        w wVar = jVar.A;
        try {
            c50.d dVarJ = finder.a(fVar.c, fVar.d, fVar.e, wVar.F, !kotlin.jvm.internal.m.a((String) ((th.o) fVar.i).B, "GET")).j(wVar, fVar);
            kotlin.jvm.internal.m.e(finder, "finder");
            e eVar = new e();
            eVar.b = jVar;
            eVar.c = finder;
            eVar.d = dVarJ;
            eVar.e = dVarJ.e();
            jVar.I = eVar;
            jVar.N = eVar;
            synchronized (jVar) {
                jVar.J = true;
                jVar.K = true;
            }
            if (jVar.M) {
                throw new IOException("Canceled");
            }
            return c50.f.a(fVar, 0, eVar, null, 61).f((th.o) fVar.i);
        } catch (IOException e) {
            finder.c(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            finder.c(e2.B);
            throw e2;
        }
    }
}
