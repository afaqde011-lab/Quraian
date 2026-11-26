package s7;

import fh.d2;
import java.util.List;

public final class l implements c1 {
    public final d2 A;
    public long B;

    public l(List list, List list2) {
        fh.q0 q0VarM = fh.t0.m();
        ta.c0.s(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            q0VarM.c(new k((c1) list.get(i10), (List) list2.get(i10)));
        }
        this.A = q0VarM.g();
        this.B = -9223372036854775807L;
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        boolean zE;
        boolean z10 = false;
        do {
            long jG = g();
            if (jG == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            zE = false;
            while (true) {
                d2 d2Var = this.A;
                if (i10 >= d2Var.D) {
                    break;
                }
                long jG2 = ((k) d2Var.get(i10)).A.g();
                boolean z11 = jG2 != Long.MIN_VALUE && jG2 <= m0Var.f7421a;
                if (jG2 == jG || z11) {
                    zE |= ((k) d2Var.get(i10)).A.e(m0Var);
                }
                i10++;
            }
            z10 |= zE;
        } while (zE);
        return z10;
    }

    @Override
    public final long g() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            d2 d2Var = this.A;
            if (i10 >= d2Var.D) {
                break;
            }
            long jG = ((k) d2Var.get(i10)).A.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override
    public final boolean isLoading() {
        int i10 = 0;
        while (true) {
            d2 d2Var = this.A;
            if (i10 >= d2Var.D) {
                return false;
            }
            if (((k) d2Var.get(i10)).A.isLoading()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final long t() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            d2 d2Var = this.A;
            if (i10 >= d2Var.D) {
                break;
            }
            k kVar = (k) d2Var.get(i10);
            long jT = kVar.A.t();
            fh.t0 t0Var = kVar.B;
            if ((t0Var.contains(1) || t0Var.contains(2) || t0Var.contains(4)) && jT != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jT);
            }
            if (jT != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jT);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.B = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j9 = this.B;
        return j9 != -9223372036854775807L ? j9 : jMin2;
    }

    @Override
    public final void v(long j9) {
        int i10 = 0;
        while (true) {
            d2 d2Var = this.A;
            if (i10 >= d2Var.D) {
                return;
            }
            ((k) d2Var.get(i10)).v(j9);
            i10++;
        }
    }
}
