package androidx.work;

import a40.c0;
import a40.v;
import ab.a0;
import android.content.Context;
import d4.k;
import g00.b0;
import ib.n;
import k00.c;
import kh.o;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l00.a;
import l6.d;
import za.f;
import za.g;
import za.u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lza/u;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "za/f", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends u {

    public final WorkerParameters f1899f;

    public final f f1900g;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "appContext");
        m.e(workerParameters, "params");
        this.f1899f = workerParameters;
        this.f1900g = f.C;
    }

    @Override
    public final k d() {
        v f971k = !m.a(getF971k(), f.C) ? getF971k() : this.f1899f.f1906e;
        m.b(f971k);
        return o.B(f971k.plus(c0.d()), new d(this, null, 28));
    }

    public abstract Object e(c cVar);

    public v getF971k() {
        return this.f1900g;
    }

    public final Object g(za.m mVar, m00.c cVar) throws Throwable {
        WorkerParameters workerParameters = this.f17398c;
        n nVar = workerParameters.f1908g;
        Object objQ = a0.q(o.v(nVar.f7577a.f8258a, "setForegroundAsync", new ct.m(nVar, workerParameters.f1902a, mVar, this.f17397b, 6)), cVar);
        return objQ == a.A ? objQ : b0.a;
    }

    public final Object h(g gVar, m00.c cVar) throws Throwable {
        WorkerParameters workerParameters = this.f17398c;
        ib.o oVar = workerParameters.f1907f;
        Object objQ = a0.q(o.v(oVar.f7582b.f8258a, "updateProgress", new d0.g(oVar, workerParameters.f1902a, gVar, 4)), cVar);
        return objQ == a.A ? objQ : b0.a;
    }
}
