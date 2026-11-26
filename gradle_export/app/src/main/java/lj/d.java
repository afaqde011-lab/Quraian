package lj;

import gj.e;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import jj.i;

public final class d {

    public static final long f10311d = TimeUnit.HOURS.toMillis(24);

    public static final long f10312e = TimeUnit.MINUTES.toMillis(30);

    public final i f10313a;

    public long f10314b;

    public int f10315c;

    public d() {
        if (e.D == null) {
            Pattern pattern = i.f8310c;
            e.D = new e(21);
        }
        e eVar = e.D;
        if (i.f8311d == null) {
            i.f8311d = new i(eVar);
        }
        this.f10313a = i.f8311d;
    }

    public final synchronized boolean a() {
        boolean z10;
        if (this.f10315c != 0) {
            this.f10313a.f8312a.getClass();
            if (System.currentTimeMillis() > this.f10314b) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f10315c = 0;
            }
            return;
        }
        this.f10315c++;
        synchronized (this) {
            try {
                if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                    double dPow = Math.pow(2.0d, this.f10315c);
                    this.f10313a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f10312e);
                } else {
                    jMin = f10311d;
                }
                this.f10313a.f8312a.getClass();
                this.f10314b = System.currentTimeMillis() + jMin;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return;
        throw th;
    }
}
