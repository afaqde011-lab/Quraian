package androidx.glance.session;

import a40.m0;
import a40.v;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import f40.m;
import h40.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l6.h;
import l6.o;
import l6.x;
import za.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Ll6/h;", "sessionManager", "Ll6/x;", "timeouts", "La40/v;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ll6/h;Ll6/x;La40/v;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionWorker extends CoroutineWorker {

    public final WorkerParameters f968h;

    public final h f969i;

    public final x f970j;

    public final v f971k;
    public final String l;

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, o.f10044a, null, null, 24, null);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, h hVar, x xVar, v vVar) {
        super(context, workerParameters);
        this.f968h = workerParameters;
        this.f969i = hVar;
        this.f970j = xVar;
        this.f971k = vVar;
        g gVar = this.f17398c.f1903b;
        hVar.getClass();
        String strC = gVar.c("KEY");
        if (strC == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.l = strC;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, h hVar, x xVar, v vVar, int i10, f fVar) {
        h hVar2 = (i10 & 4) != 0 ? o.f10044a : hVar;
        x xVar2 = (i10 & 8) != 0 ? new x() : xVar;
        if ((i10 & 16) != 0) {
            e eVar = m0.a;
            vVar = m.a;
        }
        this(context, workerParameters, hVar2, xVar2, vVar);
    }

    @Override
    public final java.lang.Object e(k00.c r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.e(k00.c):java.lang.Object");
    }

    @Override
    public final v getF971k() {
        return this.f971k;
    }
}
