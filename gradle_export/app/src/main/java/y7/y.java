package y7;

import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.w2;
import androidx.media3.common.x0;
import b3.g1;
import com.google.android.gms.internal.play_billing.q1;
import e7.i0;
import java.util.NoSuchElementException;
import q3.e0;

public final class y {

    public final e0 f16763a;

    public final u f16764b;

    public final l50.d f16765c = new l50.d();

    public final q1 f16766d = new q1();

    public final q1 f16767e = new q1();

    public final com.google.android.material.datepicker.n f16768f;

    public final v f16769g;

    public long f16770h;

    public long f16771i;

    public long f16772j;

    public w2 f16773k;
    public long l;

    public y(e0 e0Var, u uVar, v vVar) {
        this.f16763a = e0Var;
        this.f16764b = uVar;
        this.f16769g = vVar;
        com.google.android.material.datepicker.n nVar = new com.google.android.material.datepicker.n(1);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        nVar.B = 0;
        nVar.C = -1;
        nVar.D = 0;
        nVar.F = new long[iHighestOneBit];
        nVar.E = iHighestOneBit - 1;
        this.f16768f = nVar;
        this.f16770h = -9223372036854775807L;
        this.f16773k = w2.f1669d;
        this.f16771i = -9223372036854775807L;
        this.f16772j = -9223372036854775807L;
    }

    public final void a(long j9, long j10) {
        final e0 e0Var = this.f16763a;
        c cVar = (c) e0Var.C;
        while (true) {
            com.google.android.material.datepicker.n nVar = this.f16768f;
            int i10 = nVar.D;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j11 = ((long[]) nVar.F)[nVar.B];
            Long l = (Long) this.f16767e.U(j11);
            u uVar = this.f16764b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                uVar.e(2);
            }
            long j12 = this.l;
            u uVar2 = this.f16764b;
            l50.d dVar = this.f16765c;
            int iA = uVar2.a(j11, j9, j10, j12, false, false, dVar);
            if (iA != 5 && iA != 4) {
                this.f16769g.a(j11, dVar.a);
            }
            if (iA == 0 || iA == 1) {
                this.f16771i = j11;
                boolean z10 = iA == 0;
                long jD = nVar.d();
                w2 w2Var = (w2) this.f16766d.U(jD);
                if (w2Var != null && !w2Var.equals(w2.f1669d) && !w2Var.equals(this.f16773k)) {
                    this.f16773k = w2Var;
                    androidx.media3.common.s sVar = new androidx.media3.common.s();
                    sVar.f1508t = w2Var.f1673a;
                    sVar.f1509u = w2Var.f1674b;
                    sVar.m = x0.n("video/raw");
                    e0Var.B = new androidx.media3.common.t(sVar);
                    cVar.f16651i.execute(new oi.p(e0Var, w2Var, 11));
                }
                long jNanoTime = z10 ? System.nanoTime() : dVar.b;
                boolean z11 = uVar.f16729e != 3;
                uVar.f16729e = 3;
                uVar.l.getClass();
                uVar.f16731g = i0.H(SystemClock.elapsedRealtime());
                if (z11 && cVar.f16647e != null) {
                    final int i11 = 0;
                    cVar.f16651i.execute(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = i11;
                            e0 e0Var2 = e0Var;
                            switch (i12) {
                                case 0:
                                    ((c) e0Var2.C).f16650h.b();
                                    break;
                                default:
                                    ((c) e0Var2.C).f16650h.c();
                                    break;
                            }
                        }
                    });
                }
                androidx.media3.common.t tVar = (androidx.media3.common.t) e0Var.B;
                cVar.f16652j.b(jD, jNanoTime, tVar == null ? new androidx.media3.common.t(new androidx.media3.common.s()) : tVar, null);
                f fVar = (f) cVar.f16646d.remove();
                fVar.f16664c.L0(fVar.f16662a, fVar.f16663b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.f16771i = j11;
                nVar.d();
                final int i12 = 1;
                cVar.f16651i.execute(new Runnable() {
                    @Override
                    public final void run() {
                        int i13 = i12;
                        e0 e0Var2 = e0Var;
                        switch (i13) {
                            case 0:
                                ((c) e0Var2.C).f16650h.b();
                                break;
                            default:
                                ((c) e0Var2.C).f16650h.c();
                                break;
                        }
                    }
                });
                f fVar2 = (f) cVar.f16646d.remove();
                h hVar = fVar2.f16664c;
                g1 g1Var = fVar2.f16662a;
                int i13 = fVar2.f16663b;
                Trace.beginSection("dropVideoBuffer");
                g1Var.i(i13);
                Trace.endSection();
                hVar.Q0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.f16771i = j11;
            }
        }
    }
}
