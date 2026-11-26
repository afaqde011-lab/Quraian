package u7;

import fh.d2;
import fh.h0;
import fh.q0;
import fh.r0;
import fh.t0;
import fh.v;
import fh.y1;
import java.util.ArrayList;
import oj.l;
import ta.c0;

public final class c implements a {
    public static final h0 B = new h0(new v(new l(23), y1.B), new v(new l(24), y1.C));
    public final ArrayList A = new ArrayList();

    @Override
    public final void B(long j9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.A;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j10 = ((x8.a) arrayList.get(i10)).f16477b;
            if (j9 > j10 && j9 > ((x8.a) arrayList.get(i10)).f16479d) {
                arrayList.remove(i10);
                i10--;
            } else if (j9 < j10) {
                return;
            }
            i10++;
        }
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final long f(long j9) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.A;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j10 = ((x8.a) arrayList.get(i10)).f16477b;
            long j11 = ((x8.a) arrayList.get(i10)).f16479d;
            if (j9 < j10) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j10);
                    break;
                }
                jMin = j10;
                break;
            }
            if (j9 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            }
            i10++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final t0 l(long j9) {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            if (j9 >= ((x8.a) arrayList.get(0)).f16477b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    x8.a aVar = (x8.a) arrayList.get(i10);
                    if (j9 >= aVar.f16477b && j9 < aVar.f16479d) {
                        arrayList2.add(aVar);
                    }
                    if (j9 < aVar.f16477b) {
                        break;
                    }
                }
                d2 d2VarV = t0.v(B, arrayList2);
                q0 q0VarM = t0.m();
                for (int i11 = 0; i11 < d2VarV.D; i11++) {
                    q0VarM.e(((x8.a) d2VarV.get(i11)).f16476a);
                }
                return q0VarM.g();
            }
        }
        r0 r0Var = t0.B;
        return d2.E;
    }

    @Override
    public final boolean w(x8.a aVar, long j9) {
        long j10 = aVar.f16477b;
        c0.s(j10 != -9223372036854775807L);
        c0.s(aVar.f16478c != -9223372036854775807L);
        boolean z10 = j10 <= j9 && j9 < aVar.f16479d;
        ArrayList arrayList = this.A;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((x8.a) arrayList.get(size)).f16477b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override
    public final long z(long j9) {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j9 < ((x8.a) arrayList.get(0)).f16477b) {
            return -9223372036854775807L;
        }
        long jMax = ((x8.a) arrayList.get(0)).f16477b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j10 = ((x8.a) arrayList.get(i10)).f16477b;
            long j11 = ((x8.a) arrayList.get(i10)).f16479d;
            if (j11 > j9) {
                if (j10 > j9) {
                    break;
                }
                jMax = Math.max(jMax, j10);
            } else {
                jMax = Math.max(jMax, j11);
            }
        }
        return jMax;
    }
}
