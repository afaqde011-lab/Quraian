package cb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.m;
import za.v;

public abstract class a {

    public static final String f3101a;

    static {
        String strF = v.f("SystemJobScheduler");
        m.d(strF, "tagWithPrefix(...)");
        f3101a = strF;
    }

    public static final List a(JobScheduler jobScheduler) {
        m.e(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            m.d(allPendingJobs, "getAllPendingJobs(...)");
            return allPendingJobs;
        } catch (Throwable th2) {
            v.d().c(f3101a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        m.e(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        m.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        m.d(jobSchedulerForNamespace, "forNamespace(...)");
        return jobSchedulerForNamespace;
    }
}
