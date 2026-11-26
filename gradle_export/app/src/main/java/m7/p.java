package m7;

import androidx.media3.common.t;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import k9.x0;

public final class p extends n {

    public final x0 f10626j;

    public final x0 f10627k;
    public final long l;

    public p(j jVar, long j9, long j10, long j11, long j12, long j13, List list, long j14, x0 x0Var, x0 x0Var2, long j15, long j16) {
        super(jVar, j9, j10, j11, j13, list, j14, j15, j16);
        this.f10626j = x0Var;
        this.f10627k = x0Var2;
        this.l = j12;
    }

    @Override
    public final j a(m mVar) {
        x0 x0Var = this.f10626j;
        if (x0Var == null) {
            return this.f10632a;
        }
        t tVar = mVar.A;
        return new j(0L, -1L, x0Var.k(tVar.f1583a, tVar.f1592j, 0L, 0L));
    }

    @Override
    public final long d(long j9) {
        List list = this.f10621f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.l;
        if (j10 != -1) {
            return (j10 - this.f10619d) + 1;
        }
        if (j9 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j9).multiply(BigInteger.valueOf(this.f10633b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f10620e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = hh.a.f7064a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j9) {
        long j10 = this.f10619d;
        List list = this.f10621f;
        long j11 = list != null ? ((q) list.get((int) (j9 - j10))).f10628a : (j9 - j10) * this.f10620e;
        t tVar = kVar.A;
        return new j(0L, -1L, this.f10627k.k(tVar.f1583a, tVar.f1592j, j9, j11));
    }
}
