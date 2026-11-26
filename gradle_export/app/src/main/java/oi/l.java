package oi;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class l implements Callable {

    public final long f12008a;

    public final Throwable f12009b;

    public final Thread f12010c;

    public final a30.k f12011d;

    public final n f12012e;

    public l(n nVar, long j9, Throwable th2, Thread thread, a30.k kVar) {
        this.f12012e = nVar;
        this.f12008a = j9;
        this.f12009b = th2;
        this.f12010c = thread;
        this.f12011d = kVar;
    }

    @Override
    public final Object call() throws Throwable {
        long j9 = this.f12008a;
        long j10 = j9 / 1000;
        n nVar = this.f12012e;
        String strE = nVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.d(null);
        }
        nVar.f12019c.M0();
        ui.b bVar = nVar.m;
        bVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        bVar.s(this.f12009b, this.f12010c, "crash", new qi.c(strE, j10, h00.y.A), true);
        try {
            ui.b bVar2 = nVar.f12023g;
            String str = ".ae" + j9;
            bVar2.getClass();
            if (!new File((File) bVar2.D, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e3) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e3);
        }
        a30.k kVar = this.f12011d;
        nVar.b(false, kVar, false);
        nVar.c(new e().f11998a, Boolean.FALSE);
        return !nVar.f12018b.c() ? Tasks.d(null) : ((xf.g) ((AtomicReference) kVar.i).get()).f16565a.p(nVar.f12021e.f12529a, new o9.q(this, strE));
    }
}
