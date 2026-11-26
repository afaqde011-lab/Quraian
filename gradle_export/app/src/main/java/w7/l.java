package w7;

import android.os.Looper;
import android.os.SystemClock;
import e7.f0;
import e7.i0;
import java.io.IOException;
import java.util.concurrent.Executors;
import ta.c0;

public final class l implements m {

    public static final i9.d f15874d = new i9.d(2, -9223372036854775807L, false);

    public static final i9.d f15875e = new i9.d(3, -9223372036854775807L, false);

    public final x7.a f15876a;

    public i f15877b;

    public IOException f15878c;

    public l(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = i0.f5136a;
        this(new x7.a(Executors.newSingleThreadExecutor(new f0(strConcat, 0)), new uh.k(5)));
    }

    public l(x7.a aVar) {
        this.f15876a = aVar;
    }

    @Override
    public final void a() throws IOException {
        IOException iOException = this.f15878c;
        if (iOException != null) {
            throw iOException;
        }
        i iVar = this.f15877b;
        if (iVar != null) {
            int i10 = iVar.A;
            IOException iOException2 = iVar.E;
            if (iOException2 != null && iVar.F > i10) {
                throw iOException2;
            }
        }
    }

    public final boolean b() {
        return this.f15877b != null;
    }

    public final void c(k kVar) {
        i iVar = this.f15877b;
        if (iVar != null) {
            iVar.a(true);
        }
        x7.a aVar = this.f15876a;
        if (kVar != null) {
            aVar.execute(new a50.d(kVar, 28));
        }
        aVar.B.accept(aVar.A);
    }

    public final void d(j jVar, h hVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f15878c = null;
        i iVar = new i(this, looperMyLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        c0.A(this.f15877b == null);
        this.f15877b = iVar;
        iVar.b();
    }
}
