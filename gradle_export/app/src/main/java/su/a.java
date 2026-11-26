package su;

import java.util.ArrayList;

public final class a {
    public final ArrayList a;

    public a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final z00.e a() {
        ArrayList arrayList = this.a;
        return new z00.e(((ot.a) h00.q.L0(arrayList)).a, ((ot.a) h00.q.T0(arrayList)).a, 1);
    }

    public final ot.a b(int i) {
        z00.e eVarA = a();
        int i2 = eVarA.A;
        if (i > eVarA.B || i2 > i) {
            return null;
        }
        ArrayList arrayList = this.a;
        return (ot.a) arrayList.get(i - ((ot.a) h00.q.L0(arrayList)).a);
    }

    public final t c(b bVar, Long l) {
        long jLongValue;
        Long lValueOf;
        ot.a aVarB = b(bVar.a);
        Long lValueOf2 = aVarB != null ? Long.valueOf(aVarB.b) : null;
        if (lValueOf2 != null) {
            long jLongValue2 = lValueOf2.longValue();
            int i = bVar.b;
            ot.a aVarB2 = b(i);
            if (aVarB2 == null) {
                lValueOf = null;
            } else {
                long j = aVarB2.b;
                long j2 = aVarB2.c;
                ot.a aVarB3 = b(i + 1);
                if (aVarB3 != null) {
                    jLongValue = aVarB3.b;
                } else {
                    Long l2 = (l == null || l.longValue() <= j) ? null : l;
                    jLongValue = l2 != null ? l2.longValue() : Math.max(j2, j + 1000);
                }
                lValueOf = (j2 <= j || jLongValue - j2 <= 3000) ? Long.valueOf(jLongValue - Math.min(100L, (jLongValue - j) / ((long) 2))) : Long.valueOf(j2 + 1000);
            }
            if (lValueOf != null) {
                long jLongValue3 = lValueOf.longValue();
                if (jLongValue3 > jLongValue2) {
                    return new t(jLongValue2, jLongValue3);
                }
            }
        }
        return null;
    }
}
