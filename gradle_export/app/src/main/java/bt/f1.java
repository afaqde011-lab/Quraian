package bt;

import java.util.List;

public final class f1 extends m00.i implements u00.o {
    public final int A;
    public m2 B;
    public List C;
    public final j2 D;

    public f1(int i, j2 j2Var, k00.c cVar) {
        super(3, cVar);
        this.A = i;
        this.D = j2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m2 m2Var = (m2) obj;
        List list = (List) obj2;
        k00.c cVar = (k00.c) obj3;
        switch (this.A) {
            case 0:
                f1 f1Var = new f1(0, this.D, cVar);
                f1Var.B = m2Var;
                f1Var.C = list;
                return f1Var.invokeSuspend(g00.b0.a);
            case 1:
                f1 f1Var2 = new f1(1, this.D, cVar);
                f1Var2.B = m2Var;
                f1Var2.C = list;
                return f1Var2.invokeSuspend(g00.b0.a);
            default:
                f1 f1Var3 = new f1(2, this.D, cVar);
                f1Var3.B = m2Var;
                f1Var3.C = list;
                return f1Var3.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        j2 j2Var = this.D;
        switch (i) {
            case 0:
                m2 m2Var = this.B;
                List list = this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                int i2 = m2Var.a;
                ss.v vVar = m2Var.b;
                return new l2(i2, j2.m(j2Var, vVar, list, new a40.g1(1, j2Var.s, xs.c.class, "toDayReciterStats", "toDayReciterStats(Lcom/mchutov/quranify/insights/domain/model/listening/ListeningSummary;)Ljava/util/List;", 0, 16)), vVar != null);
            case 1:
                m2 m2Var2 = this.B;
                List list2 = this.C;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                int i3 = m2Var2.a;
                ss.v vVar2 = m2Var2.b;
                return new l2(i3, j2.m(j2Var, vVar2, list2, new a40.g1(1, j2Var.s, xs.c.class, "toDaySurahStats", "toDaySurahStats(Lcom/mchutov/quranify/insights/domain/model/listening/ListeningSummary;)Ljava/util/List;", 0, 17)), vVar2 != null);
            default:
                m2 m2Var3 = this.B;
                List list3 = this.C;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                int i4 = m2Var3.a;
                ss.v vVar3 = m2Var3.b;
                return new l2(i4, j2.m(j2Var, vVar3, list3, new a40.g1(1, j2Var.s, xs.c.class, "toHourStats", "toHourStats(Lcom/mchutov/quranify/insights/domain/model/listening/ListeningSummary;)Ljava/util/List;", 0, 18)), vVar3 != null);
        }
    }
}
