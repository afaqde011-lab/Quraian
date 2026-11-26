package jb;

import a40.c0;
import a40.v;
import android.os.Handler;
import android.os.Looper;
import ca.z;
import java.util.concurrent.ExecutorService;

public final class b {

    public final z f8258a;

    public final v f8259b;

    public final Handler f8260c = new Handler(Looper.getMainLooper());

    public final a f8261d = new a(this, 0);

    public b(ExecutorService executorService) {
        z zVar = new z(executorService, 1);
        this.f8258a = zVar;
        this.f8259b = c0.o(zVar);
    }
}
