package is;

import a40.u1;
import java.time.LocalDateTime;
import ri.t1;

public final class q extends m00.i implements u00.n {
    public j40.a A;
    public y B;
    public LocalDateTime C;
    public rs.e D;
    public int E;
    public boolean F;
    public int G;
    public final y H;
    public final int I;
    public final LocalDateTime J;
    public final rs.e K;
    public final boolean L;

    public q(y yVar, int i, LocalDateTime localDateTime, rs.e eVar, boolean z, k00.c cVar) {
        super(2, cVar);
        this.H = yVar;
        this.I = i;
        this.J = localDateTime;
        this.K = eVar;
        this.L = z;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new q(this.H, this.I, this.J, this.K, this.L, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        y yVar;
        j40.a aVar;
        LocalDateTime localDateTime;
        rs.e eVar;
        int i;
        boolean z;
        j40.a aVar2;
        l00.a aVar3 = l00.a.A;
        int i2 = this.G;
        try {
            if (i2 == 0) {
                t1.O(obj);
                yVar = this.H;
                aVar = yVar.r;
                this.A = aVar;
                this.B = yVar;
                localDateTime = this.J;
                this.C = localDateTime;
                eVar = this.K;
                this.D = eVar;
                i = this.I;
                this.E = i;
                z = this.L;
                this.F = z;
                this.G = 1;
                if (aVar.l(this) != aVar3) {
                }
                return aVar3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = this.A;
                try {
                    t1.O(obj);
                    aVar = aVar2;
                    aVar.i(null);
                    return g00.b0.a;
                } catch (Throwable th) {
                    th = th;
                    aVar2.i(null);
                    throw th;
                }
            }
            boolean z2 = this.F;
            i = this.E;
            eVar = this.D;
            localDateTime = this.C;
            yVar = this.B;
            j40.a aVar4 = this.A;
            t1.O(obj);
            z = z2;
            aVar = aVar4;
            if (!yVar.k.a.isAuthorized()) {
                long j = yVar.s + ((long) i);
                int i3 = (int) (j / 1000);
                yVar.s = j % 1000;
                if (i3 > 0) {
                    int iMin = Math.min(i3, localDateTime.toLocalTime().toSecondOfDay());
                    int i4 = i3 - iMin;
                    if (i4 > 0) {
                        LocalDateTime localDateTimeMinusSeconds = localDateTime.toLocalDate().atStartOfDay().minusSeconds(1L);
                        kotlin.jvm.internal.m.d(localDateTimeMinusSeconds, "minusSeconds(...)");
                        y.a(yVar, i4, localDateTimeMinusSeconds, eVar);
                    }
                    if (iMin > 0) {
                        y.a(yVar, iMin, localDateTime, eVar);
                    }
                    if (z) {
                        this.A = aVar;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = 0;
                        this.G = 2;
                        if (y.b(yVar, this) != aVar3) {
                            aVar2 = aVar;
                            aVar = aVar2;
                        }
                        return aVar3;
                    }
                    u1 u1Var = yVar.u;
                    if (u1Var == null || !u1Var.a()) {
                        yVar.u = a40.c0.y(yVar.m, null, null, new d6.e(yVar, (k00.c) null, 5), 3);
                    }
                }
            }
            aVar.i(null);
            return g00.b0.a;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }
}
