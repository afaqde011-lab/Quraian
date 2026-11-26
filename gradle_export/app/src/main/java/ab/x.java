package ab;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import g1.j7;
import java.util.ArrayList;
import java.util.Iterator;

public final class x implements u00.a {
    public final int A;
    public final y B;

    public x(y yVar, int i11) {
        this.A = i11;
        this.B = yVar;
    }

    @Override
    public final Object invoke() {
        int i11 = this.A;
        g00.b0 b0Var = g00.b0.f7770a;
        y yVar = this.B;
        switch (i11) {
            case 0:
                WorkDatabase workDatabase = yVar.f563c;
                Context context = yVar.f561a;
                String str = cb.d.F;
                if (Build.VERSION.SDK_INT >= 34) {
                    cb.a.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListE = cb.d.e(context, jobScheduler);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        cb.d.d(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) rd.a.M(workDatabase.w().f9457a, false, true, new j7(24))).intValue();
                l.b(yVar.f562b, workDatabase, yVar.f565e);
                break;
            default:
                WorkDatabase workDatabase2 = yVar.f563c;
                kotlin.jvm.internal.m.d(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.o(new a1.z(new f(workDatabase2, yVar, 21), 14));
                break;
        }
        return b0Var;
    }
}
