package x8;

import e7.i0;
import fh.d2;
import fh.r0;
import fh.t0;
import fh.v;
import fh.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ta.c0;

public final class b implements d {
    public static final v C = new v(new uh.k(12), y1.B);
    public final t0 A;
    public final long[] B;

    public b(d2 d2Var) {
        int i10 = d2Var.D;
        long j9 = -9223372036854775807L;
        int i11 = 0;
        if (i10 == 1) {
            r0 r0VarListIterator = d2Var.listIterator(0);
            Object next = r0VarListIterator.next();
            if (r0VarListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i11 < 4 && r0VarListIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(r0VarListIterator.next());
                    i11++;
                }
                if (r0VarListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            a aVar = (a) next;
            long j10 = aVar.f16477b;
            t0 t0Var = aVar.f16476a;
            long j11 = aVar.f16478c;
            long j12 = j10 == -9223372036854775807L ? 0L : j10;
            if (j11 == -9223372036854775807L) {
                this.A = t0.s(t0Var);
                this.B = new long[]{j12};
                return;
            } else {
                r0 r0Var = t0.B;
                this.A = t0.t(t0Var, d2.E);
                this.B = new long[]{j12, j11 + j12};
                return;
            }
        }
        long[] jArr = new long[i10 * 2];
        this.B = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        d2 d2VarV = t0.v(C, d2Var);
        int i12 = 0;
        while (i11 < d2VarV.D) {
            a aVar2 = (a) d2VarV.get(i11);
            long j13 = aVar2.f16477b;
            long j14 = aVar2.f16478c;
            t0 t0Var2 = aVar2.f16476a;
            j13 = j13 == j9 ? 0L : j13;
            long j15 = j13 + j14;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j16 = this.B[i13];
                if (j16 < j13) {
                    this.B[i12] = j13;
                    arrayList.add(t0Var2);
                    i12++;
                } else if (j16 == j13 && ((t0) arrayList.get(i13)).isEmpty()) {
                    arrayList.set(i13, t0Var2);
                } else {
                    e7.a.m("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.B[i13] = j13;
                    arrayList.set(i13, t0Var2);
                }
            } else {
                this.B[i12] = j13;
                arrayList.add(t0Var2);
                i12++;
            }
            if (j14 != j9) {
                this.B[i12] = j15;
                arrayList.add(d2.E);
                i12++;
            }
            i11++;
            j9 = j9;
        }
        this.A = t0.o(arrayList);
    }

    @Override
    public final int d(long j9) {
        int iB = i0.b(this.B, j9, false);
        if (iB < this.A.size()) {
            return iB;
        }
        return -1;
    }

    @Override
    public final long e(int i10) {
        c0.s(i10 < this.A.size());
        return this.B[i10];
    }

    @Override
    public final List g(long j9) {
        int iE = i0.e(this.B, j9, false);
        if (iE != -1) {
            return (t0) this.A.get(iE);
        }
        r0 r0Var = t0.B;
        return d2.E;
    }

    @Override
    public final int i() {
        return this.A.size();
    }
}
