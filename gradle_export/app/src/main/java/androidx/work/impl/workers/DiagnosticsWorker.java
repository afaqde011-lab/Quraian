package androidx.work.impl.workers;

import ab.y;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import g1.j7;
import hb.h;
import hb.k;
import hb.x;
import hb.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import rd.a;
import za.s;
import za.t;
import za.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "context");
        m.e(workerParameters, "parameters");
    }

    @Override
    public final s e() {
        y yVarL0 = y.l0(this.f17397b);
        WorkDatabase workDatabase = yVarL0.f420c;
        m.d(workDatabase, "getWorkDatabase(...)");
        x xVarW = workDatabase.w();
        k kVarU = workDatabase.u();
        z zVarX = workDatabase.x();
        h hVarT = workDatabase.t();
        yVarL0.f419b.f17340d.getClass();
        List list = (List) a.M(xVarW.f7028a, true, false, new gj.h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L), 1));
        List list2 = (List) a.M(xVarW.f7028a, true, false, new j7(17));
        List list3 = (List) a.M(xVarW.f7028a, true, false, new j7(23));
        if (!list.isEmpty()) {
            v vVarD = v.d();
            String str = kb.a.f9581a;
            vVarD.e(str, "Recently completed work:\n\n");
            v.d().e(str, kb.a.a(kVarU, zVarX, hVarT, list));
        }
        if (!list2.isEmpty()) {
            v vVarD2 = v.d();
            String str2 = kb.a.f9581a;
            vVarD2.e(str2, "Running work:\n\n");
            v.d().e(str2, kb.a.a(kVarU, zVarX, hVarT, list2));
        }
        if (!list3.isEmpty()) {
            v vVarD3 = v.d();
            String str3 = kb.a.f9581a;
            vVarD3.e(str3, "Enqueued work:\n\n");
            v.d().e(str3, kb.a.a(kVarU, zVarX, hVarT, list3));
        }
        return t.a();
    }
}
