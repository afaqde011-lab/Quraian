package b40;

import a40.k;
import a40.m0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f40.m;
import java.util.Random;
import kotlinx.coroutines.DispatchException;

public final class d implements Choreographer.FrameCallback {
    public final int A = 0;
    public final Object B;

    public d(k kVar) {
        this.B = kVar;
    }

    @Override
    public final void doFrame(long j) throws DispatchException {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                h40.e eVar = m0.a;
                ((k) obj).D(m.a, Long.valueOf(j));
                break;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new k.m((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
