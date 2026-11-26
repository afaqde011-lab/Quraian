package g7;

import android.os.SystemClock;
import e7.i0;
import fh.d2;
import java.util.ArrayList;
import ta.c0;

public abstract class b implements f {
    public final boolean A;
    public final ArrayList B = new ArrayList(1);
    public int C;
    public j D;

    public b(boolean z10) {
        this.A = z10;
    }

    public final void b(int i10) {
        j jVar = this.D;
        String str = i0.f5136a;
        for (int i11 = 0; i11 < this.C; i11++) {
            s sVar = (s) this.B.get(i11);
            boolean z10 = this.A;
            w7.g gVar = (w7.g) sVar;
            synchronized (gVar) {
                d2 d2Var = w7.g.f15854p;
                if (z10 && (jVar.f6225h & 8) != 8) {
                    gVar.f15869i += (long) i10;
                }
            }
        }
    }

    public final void c() {
        j jVar = this.D;
        String str = i0.f5136a;
        for (int i10 = 0; i10 < this.C; i10++) {
            s sVar = (s) this.B.get(i10);
            boolean z10 = this.A;
            w7.g gVar = (w7.g) sVar;
            synchronized (gVar) {
                try {
                    d2 d2Var = w7.g.f15854p;
                    if (z10 && (jVar.f6225h & 8) != 8) {
                        c0.A(gVar.f15867g > 0);
                        gVar.f15864d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (jElapsedRealtime - gVar.f15868h);
                        gVar.f15870j += (long) i11;
                        long j9 = gVar.f15871k;
                        long j10 = gVar.f15869i;
                        gVar.f15871k = j9 + j10;
                        if (i11 > 0) {
                            gVar.f15866f.a((j10 * 8000.0f) / i11, (int) Math.sqrt(j10));
                            if (gVar.f15870j >= 2000 || gVar.f15871k >= 524288) {
                                gVar.l = (long) gVar.f15866f.b();
                            }
                            gVar.b(i11, gVar.f15869i, gVar.l);
                            gVar.f15868h = jElapsedRealtime;
                            gVar.f15869i = 0L;
                        }
                        gVar.f15867g--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.D = null;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.C; i10++) {
            ((s) this.B.get(i10)).getClass();
        }
    }

    public final void h(j jVar) {
        this.D = jVar;
        for (int i10 = 0; i10 < this.C; i10++) {
            s sVar = (s) this.B.get(i10);
            boolean z10 = this.A;
            w7.g gVar = (w7.g) sVar;
            synchronized (gVar) {
                try {
                    d2 d2Var = w7.g.f15854p;
                    if (z10 && (jVar.f6225h & 8) != 8) {
                        if (gVar.f15867g == 0) {
                            gVar.f15864d.getClass();
                            gVar.f15868h = SystemClock.elapsedRealtime();
                        }
                        gVar.f15867g++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void s(s sVar) {
        sVar.getClass();
        ArrayList arrayList = this.B;
        if (arrayList.contains(sVar)) {
            return;
        }
        arrayList.add(sVar);
        this.C++;
    }
}
