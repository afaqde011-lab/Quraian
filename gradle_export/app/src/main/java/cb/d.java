package cb;

import a1.z;
import ab.i;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b6.o;
import g1.j7;
import h00.n;
import h00.q;
import h1.v0;
import hb.g;
import hb.h;
import hb.p;
import hb.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m;
import u00.k;
import za.c0;
import za.e;
import za.g0;
import za.v;
import za.w;

public final class d implements i {
    public static final String F = v.f("SystemJobScheduler");
    public final Context A;
    public final JobScheduler B;
    public final c C;
    public final WorkDatabase D;
    public final za.b E;

    public d(Context context, WorkDatabase workDatabase, za.b bVar) {
        JobScheduler jobSchedulerB = a.b(context);
        c cVar = new c(context, bVar.f17340d, bVar.l);
        this.A = context;
        this.B = jobSchedulerB;
        this.C = cVar;
        this.D = workDatabase;
        this.E = bVar;
    }

    public static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            v.d().c(F, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = a.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static hb.i f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new hb.i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override
    public final void a(p... pVarArr) {
        int iIntValue;
        za.b bVar = this.E;
        WorkDatabase workDatabase = this.D;
        final hf.c cVar = new hf.c(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.b();
            try {
                x xVarW = workDatabase.w();
                String str = pVar.f7004a;
                p pVarE = xVarW.e(str);
                String str2 = F;
                if (pVarE == null) {
                    v.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (pVarE.f7005b != g0.A) {
                    v.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    hb.i iVarC = bi.b.C(pVar);
                    g gVarA = workDatabase.t().a(iVarC);
                    if (gVarA != null) {
                        iIntValue = gVarA.f6973c;
                    } else {
                        bVar.getClass();
                        final int i10 = bVar.f17345i;
                        WorkDatabase workDatabase2 = (WorkDatabase) cVar.B;
                        Callable callable = new Callable() {
                            @Override
                            public final Object call() {
                                WorkDatabase workDatabase3 = (WorkDatabase) cVar.B;
                                Long lA = workDatabase3.s().a("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase3.s().b(new hb.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase3.s().b(new hb.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        };
                        workDatabase2.getClass();
                        Object objO = workDatabase2.o(new z(callable, 13));
                        m.d(objO, "runInTransaction(...)");
                        iIntValue = ((Number) objO).intValue();
                    }
                    if (gVarA == null) {
                        g gVar = new g(iVarC.f6976a, iVarC.f6977b, iIntValue);
                        h hVarT = workDatabase.t();
                        hVarT.getClass();
                        rd.a.M(hVarT.f6974a, false, true, new v0(hVarT, gVar, 3));
                    }
                    g(pVar, iIntValue);
                    workDatabase.p();
                }
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.A;
        JobScheduler jobScheduler = this.B;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListE) {
                hb.i iVarF = f(jobInfo);
                if (iVarF != null && str.equals(iVarF.f6976a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d(jobScheduler, ((Integer) it.next()).intValue());
        }
        h hVarT = this.D.t();
        hVarT.getClass();
        m.e(str, "workSpecId");
        rd.a.M(hVarT.f6974a, false, true, new o(str, 22));
    }

    public final void g(p pVar, int i10) {
        int i11;
        String str;
        c cVar = this.C;
        cVar.getClass();
        e eVar = pVar.f7013j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = pVar.f7004a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f7021t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, cVar.f3103a).setRequiresCharging(eVar.f17358c);
        boolean z10 = eVar.f17359d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z10).setExtras(persistableBundle);
        NetworkRequest networkRequestA = eVar.a();
        if (networkRequestA != null) {
            m.e(extras, "builder");
            extras.setRequiredNetwork(networkRequestA);
        } else {
            w wVar = eVar.f17356a;
            if (wVar == w.F) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int iOrdinal = wVar.ordinal();
                if (iOrdinal == 0) {
                    i11 = 0;
                } else if (iOrdinal != 1) {
                    i11 = 2;
                    if (iOrdinal != 2) {
                        i11 = 3;
                        if (iOrdinal != 3) {
                            i11 = 4;
                            if (iOrdinal != 4) {
                                v.d().a(c.f3102d, "API version too low. Cannot convert network type value " + wVar);
                                i11 = 1;
                            }
                        }
                    }
                } else {
                    i11 = 1;
                }
                extras.setRequiredNetworkType(i11);
            }
        }
        if (!z10) {
            extras.setBackoffCriteria(pVar.m, pVar.l == za.a.B ? 0 : 1);
        }
        long jA = pVar.a();
        cVar.f3104b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f7018q && cVar.f3105c) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.b()) {
            for (za.d dVar : eVar.f17364i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f17353a, dVar.f17354b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f17362g);
            extras.setTriggerContentMaxDelay(eVar.f17363h);
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(eVar.f17360e);
        extras.setRequiresStorageNotLow(eVar.f17361f);
        Object[] objArr = pVar.f7014k > 0;
        Object[] objArr2 = jMax > 0;
        if (pVar.f7018q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (str = pVar.f7025x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = F;
        v.d().a(str3, "Scheduling work ID " + str2 + "Job ID " + i10);
        try {
            if (this.B.schedule(jobInfoBuild) == 0) {
                v.d().g(str3, "Unable to schedule work ID " + str2);
                if (pVar.f7018q && pVar.f7019r == c0.A) {
                    pVar.f7018q = false;
                    v.d().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(pVar, i10);
                }
            }
        } catch (IllegalStateException e3) {
            String str4 = a.f3101a;
            Context context = this.A;
            m.e(context, "context");
            WorkDatabase workDatabase = this.D;
            m.e(workDatabase, "workDatabase");
            za.b bVar = this.E;
            m.e(bVar, "configuration");
            int i13 = Build.VERSION.SDK_INT;
            int size = ((List) rd.a.M(workDatabase.w().f7028a, true, false, new j7(16))).size();
            String strR0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i13 >= 34) {
                JobScheduler jobSchedulerB = a.b(context);
                List listA = a.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListE = e(context, jobSchedulerB);
                    int size2 = arrayListE != null ? listA.size() - arrayListE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    m.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListE2 = e(context, (JobScheduler) systemService);
                    int size3 = arrayListE2 != null ? arrayListE2.size() : 0;
                    strR0 = q.R0(n.C0(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", (String) null, (String) null, (k) null, 62);
                }
            } else {
                ArrayList arrayListE3 = e(context, a.b(context));
                if (arrayListE3 != null) {
                    strR0 = arrayListE3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler 150 job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strR0);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strL = oi.k.l(sb2, bVar.f17347k, '.');
            v.d().b(str3, strL);
            throw new IllegalStateException(strL, e3);
        } catch (Throwable th2) {
            v.d().c(str3, "Unable to schedule " + pVar, th2);
        }
    }
}
