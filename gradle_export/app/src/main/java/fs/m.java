package fs;

import h00.x;
import hs.c0;
import java.util.ArrayList;
import java.util.List;
import ss.z;

public final class m {
    public static z a(c0 c0Var, int i) {
        ss.c cVar;
        Integer year;
        if (c0Var != null && (year = c0Var.getYear()) != null) {
            i = year.intValue();
        }
        List<hs.c> days = c0Var != null ? c0Var.getDays() : null;
        if (days == null) {
            days = x.A;
        }
        ArrayList arrayList = new ArrayList();
        for (hs.c cVar2 : days) {
            if (cVar2 == null) {
                cVar = null;
            } else {
                String strM = k00.f.M(cVar2.getDate(), cVar2.getDay());
                if (r30.k.L0(strM)) {
                    strM = null;
                }
                if (strM == null) {
                    cVar = null;
                } else {
                    Long listenedMs = cVar2.getListenedMs();
                    long jLongValue = listenedMs != null ? listenedMs.longValue() : 0L;
                    long j = jLongValue >= 0 ? jLongValue : 0L;
                    Integer dailyGoalMinutes = cVar2.getDailyGoalMinutes();
                    cVar = new ss.c(strM, j, dailyGoalMinutes != null ? dailyGoalMinutes.intValue() : 0);
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new z(i, arrayList);
    }
}
