package l7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k0;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import e7.i0;
import java.util.List;
import ta.c0;

public final class e extends k2 {

    public final long f10059a;

    public final long f10060b;

    public final long f10061c;

    public final int f10062d;

    public final long f10063e;

    public final long f10064f;

    public final long f10065g;

    public final m7.c f10066h;

    public final q0 f10067i;

    public final k0 f10068j;

    public e(long j9, long j10, long j11, int i10, long j12, long j13, long j14, m7.c cVar, q0 q0Var, k0 k0Var) {
        c0.A(cVar.f10583d == (k0Var != null));
        this.f10059a = j9;
        this.f10060b = j10;
        this.f10061c = j11;
        this.f10062d = i10;
        this.f10063e = j12;
        this.f10064f = j13;
        this.f10065g = j14;
        this.f10066h = cVar;
        this.f10067i = q0Var;
        this.f10068j = k0Var;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f10062d) >= 0 && iIntValue < getPeriodCount()) {
            return iIntValue;
        }
        return -1;
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        c0.u(i10, getPeriodCount());
        m7.c cVar = this.f10066h;
        h2Var.i(z10 ? cVar.a(i10).f10606a : null, z10 ? Integer.valueOf(this.f10062d + i10) : null, 0, cVar.c(i10), i0.H(cVar.a(i10).f10607b - cVar.a(0).f10607b) - this.f10063e);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return this.f10066h.m.size();
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        c0.u(i10, getPeriodCount());
        return Integer.valueOf(this.f10062d + i10);
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        boolean z10;
        long j10;
        boolean z11;
        long j11;
        j jVarB;
        c0.u(i10, 1);
        m7.c cVar = this.f10066h;
        boolean z12 = cVar.f10583d;
        long jC = this.f10065g;
        if (z12 && cVar.f10584e != -9223372036854775807L && cVar.f10581b == -9223372036854775807L) {
            long j12 = 0;
            if (j9 > 0) {
                jC += j9;
                if (jC > this.f10064f) {
                    z10 = true;
                    jC = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                }
                Object obj = j2.f1273q;
                if (cVar.f10583d || cVar.f10584e == j10 || cVar.f10581b != j10) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                j2Var.b(obj, this.f10067i, cVar, this.f10059a, this.f10060b, this.f10061c, true, z11, this.f10068j, jC, this.f10064f, 0, getPeriodCount() - 1, this.f10063e);
                return j2Var;
            }
            long j13 = this.f10063e + jC;
            long jC2 = cVar.c(0);
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j13 >= jC2) {
                j13 -= jC2;
                i11++;
                jC2 = cVar.c(i11);
            }
            m7.h hVarA = cVar.a(i11);
            List list = hVarA.f10608c;
            z10 = true;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j11 = j12;
                    i12 = -1;
                    break;
                }
                j11 = j12;
                if (((m7.a) list.get(i12)).f10571b == 2) {
                    break;
                }
                i12++;
                j12 = j11;
            }
            if (i12 != -1 && (jVarB = ((m7.m) ((m7.a) hVarA.f10608c.get(i12)).f10572c.get(0)).b()) != null && jVarB.z(jC2) != j11) {
                jC = (jVarB.c(jVarB.o(j13, jC2)) + jC) - j13;
            }
        } else {
            z10 = true;
            j10 = -9223372036854775807L;
        }
        Object obj2 = j2.f1273q;
        if (cVar.f10583d) {
            z11 = false;
        } else {
            z11 = false;
        }
        j2Var.b(obj2, this.f10067i, cVar, this.f10059a, this.f10060b, this.f10061c, true, z11, this.f10068j, jC, this.f10064f, 0, getPeriodCount() - 1, this.f10063e);
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return 1;
    }
}
