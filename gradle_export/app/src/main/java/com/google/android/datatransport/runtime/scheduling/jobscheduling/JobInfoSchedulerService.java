package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a30.k;
import ab.f;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import de.d;
import he.a;
import java.util.concurrent.Executor;
import sd.p1;
import xd.i;
import xd.p;

public class JobInfoSchedulerService extends JobService {
    public static final int A = 0;

    @Override
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        p1 p1VarA = i.a();
        p1VarA.G(string);
        p1VarA.D = a.b(i10);
        if (string2 != null) {
            p1VarA.C = Base64.decode(string2, 0);
        }
        k kVar = p.a().f16561d;
        ((Executor) kVar.e).execute(new d(kVar, p1VarA.i(), i11, new f(this, jobParameters, 11)));
        return true;
    }

    @Override
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
