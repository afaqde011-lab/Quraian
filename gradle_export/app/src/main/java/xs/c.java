package xs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import rs.f;
import ss.v;

public final class c {
    public static Long a(String str) {
        try {
            return Long.valueOf(LocalDate.parse(str).atStartOfDay(ZoneId.systemDefault()).toEpochSecond());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ArrayList b(int i, List list) {
        LocalDate localDate;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ss.c cVar = (ss.c) it.next();
            f fVar = null;
            try {
                localDate = LocalDate.parse(cVar.a);
            } catch (Throwable unused) {
                localDate = null;
            }
            if (localDate != null) {
                long epochSecond = localDate.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
                String str = cVar.a;
                long j = cVar.b / 1000;
                int i2 = cVar.c;
                Integer numValueOf = i2 > 0 ? Integer.valueOf(i2) : null;
                int iIntValue = numValueOf != null ? numValueOf.intValue() : i;
                DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                m.d(dayOfWeek, "getDayOfWeek(...)");
                fVar = new f(str, epochSecond, j, iIntValue, epochSecond, dayOfWeek);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static ArrayList c(int i, v summary) {
        m.e(summary, "summary");
        int i2 = summary.a;
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i = numValueOf.intValue();
        }
        return b(i, summary.f);
    }
}
