package g7;

import a8.l0;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import e7.i0;
import java.math.RoundingMode;

public final class i implements i9.b {

    public int f6209a;

    public long f6210b;

    public int f6211c;

    public long f6212d;

    public Object f6213e;

    public Object f6214f;

    public Object f6215g;

    public Object f6216h;

    public i(a8.s sVar, l0 l0Var, com.google.android.material.datepicker.n nVar, String str, int i10) throws ParserException {
        this.f6213e = sVar;
        this.f6214f = l0Var;
        this.f6215g = nVar;
        int i11 = nVar.B;
        int i12 = nVar.C;
        int i13 = (nVar.E * i11) / 8;
        int i14 = nVar.D;
        if (i14 != i13) {
            throw ParserException.a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int iMax = Math.max(i13, i15 / 10);
        this.f6209a = iMax;
        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
        sVar2.l = x0.n("audio/wav");
        sVar2.m = x0.n(str);
        sVar2.f1498h = i16;
        sVar2.f1499i = i16;
        sVar2.f1502n = iMax;
        sVar2.E = i11;
        sVar2.F = i12;
        sVar2.G = i10;
        this.f6216h = new androidx.media3.common.t(sVar2);
    }

    @Override
    public void a(long j9) {
        this.f6210b = j9;
        this.f6211c = 0;
        this.f6212d = 0L;
    }

    @Override
    public void b(int i10, long j9) {
        i9.f fVar = new i9.f((com.google.android.material.datepicker.n) this.f6215g, 1, i10, j9);
        ((a8.s) this.f6213e).b(fVar);
        l0 l0Var = (l0) this.f6214f;
        l0Var.f((androidx.media3.common.t) this.f6216h);
        l0Var.c(fVar.f7560e);
    }

    @Override
    public boolean c(a8.r rVar, long j9) {
        int i10;
        int i11;
        long j10 = j9;
        while (j10 > 0 && (i10 = this.f6211c) < (i11 = this.f6209a)) {
            int iA = ((l0) this.f6214f).a(rVar, (int) Math.min(i11 - i10, j10), true);
            if (iA == -1) {
                j10 = 0;
            } else {
                this.f6211c += iA;
                j10 -= (long) iA;
            }
        }
        com.google.android.material.datepicker.n nVar = (com.google.android.material.datepicker.n) this.f6215g;
        int i12 = nVar.D;
        int i13 = this.f6211c / i12;
        if (i13 > 0) {
            long j11 = this.f6210b;
            long j12 = this.f6212d;
            long j13 = nVar.C;
            String str = i0.f5136a;
            long jQ = j11 + i0.Q(j12, 1000000L, j13, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.f6211c - i14;
            ((l0) this.f6214f).d(jQ, 1, i14, i15, null);
            this.f6212d += (long) i13;
            this.f6211c = i15;
        }
        return j10 <= 0;
    }
}
