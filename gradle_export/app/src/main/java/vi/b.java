package vi;

import android.os.SystemClock;
import android.util.Log;
import ce.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ud.d;
import xf.g;

public final class b {

    public final double f15703a;

    public final double f15704b;

    public final long f15705c;

    public final long f15706d;

    public final int f15707e;

    public final ArrayBlockingQueue f15708f;

    public final ThreadPoolExecutor f15709g;

    public final c f15710h;

    public final h7.b f15711i;

    public int f15712j;

    public long f15713k;

    public b(c cVar, wi.a aVar, h7.b bVar) {
        double d3 = aVar.f16091d;
        double d5 = aVar.f16092e;
        long j9 = ((long) aVar.f16093f) * 1000;
        this.f15703a = d3;
        this.f15704b = d5;
        this.f15705c = j9;
        this.f15710h = cVar;
        this.f15711i = bVar;
        this.f15706d = SystemClock.elapsedRealtime();
        int i10 = (int) d3;
        this.f15707e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f15708f = arrayBlockingQueue;
        this.f15709g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f15712j = 0;
        this.f15713k = 0L;
    }

    public final int a() {
        if (this.f15713k == 0) {
            this.f15713k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f15713k) / this.f15705c);
        int iMin = this.f15708f.size() == this.f15707e ? Math.min(100, this.f15712j + iCurrentTimeMillis) : Math.max(0, this.f15712j - iCurrentTimeMillis);
        if (this.f15712j != iMin) {
            this.f15712j = iMin;
            this.f15713k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(oi.b bVar, g gVar) {
        String str = "Sending report through Google DataTransport: " + bVar.f11988b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.f15710h.D(new ud.a(null, bVar.f11987a, d.C, null), new v7.d(SystemClock.elapsedRealtime() - this.f15706d < 2000, this, gVar, bVar));
    }
}
