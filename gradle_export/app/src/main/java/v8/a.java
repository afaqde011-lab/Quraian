package v8;

import a8.c0;
import a8.d0;
import a8.e0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import e7.i0;
import java.math.BigInteger;

public final class a implements d0 {

    public final b f15533a;

    public a(b bVar) {
        this.f15533a = bVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final c0 d(long j9) {
        b bVar = this.f15533a;
        long j10 = (((long) bVar.D.f15562i) * j9) / 1000000;
        long j11 = bVar.B;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        long j12 = bVar.C;
        e0 e0Var = new e0(j9, i0.i((bigIntegerValueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.F)).longValue() + j11) - NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, bVar.B, j12 - 1));
        return new c0(e0Var, e0Var);
    }

    @Override
    public final long f() {
        b bVar = this.f15533a;
        return (bVar.F * 1000000) / ((long) bVar.D.f15562i);
    }
}
