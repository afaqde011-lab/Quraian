package bt;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class g1 extends m00.i implements u00.o {
    public final int A;
    public ys.c B;
    public l2 C;
    public final j2 D;

    public g1(int i, j2 j2Var, k00.c cVar) {
        super(3, cVar);
        this.A = i;
        this.D = j2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ys.c cVar = (ys.c) obj;
        l2 l2Var = (l2) obj2;
        k00.c cVar2 = (k00.c) obj3;
        switch (this.A) {
            case 0:
                g1 g1Var = new g1(0, this.D, cVar2);
                g1Var.B = cVar;
                g1Var.C = l2Var;
                return g1Var.invokeSuspend(g00.b0.a);
            default:
                g1 g1Var2 = new g1(1, this.D, cVar2);
                g1Var2.B = cVar;
                g1Var2.C = l2Var;
                return g1Var2.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        LocalDate localDateMinusDays;
        k2 k2Var = null;
        switch (this.A) {
            case 0:
                ys.c cVar = this.B;
                l2 l2Var = this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                if (l2Var.a != cVar.b()) {
                    l2Var = null;
                }
                if (l2Var != null) {
                    boolean z = l2Var.b;
                    List list = l2Var.c;
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
                    int iOrdinal = cVar.ordinal();
                    if (iOrdinal == 0) {
                        localDateMinusDays = localDateNow;
                    } else if (iOrdinal == 1) {
                        localDateMinusDays = localDateNow.minusDays(6L);
                    } else if (iOrdinal == 2) {
                        localDateMinusDays = localDateNow.minusDays(29L);
                    } else if (iOrdinal == 3) {
                        localDateMinusDays = localDateNow.minusDays(89L);
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        localDateMinusDays = localDateNow.minusYears(1L).plusDays(1L);
                    }
                    long epochSecond = localDateMinusDays.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
                    long epochSecond2 = localDateNow.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        long j = ((rs.c) obj2).b;
                        if (epochSecond <= j && j <= epochSecond2) {
                            arrayList.add(obj2);
                        }
                    }
                    k2Var = new k2(cVar, z, arrayList);
                }
                return k2Var;
            default:
                ys.c cVar2 = this.B;
                l2 l2Var2 = this.C;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                if (l2Var2.a != cVar2.b()) {
                    l2Var2 = null;
                }
                if (l2Var2 == null) {
                    return null;
                }
                return new g00.k(cVar2, j2.k(this.D, l2Var2.c, cVar2, new a1.s0(25)));
        }
    }
}
