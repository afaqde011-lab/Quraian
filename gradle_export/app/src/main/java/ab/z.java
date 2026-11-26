package ab;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

public final class z extends kotlin.jvm.internal.j implements u00.r {
    public static final z A = new z(6, a0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        za.b bVar = (za.b) obj2;
        jb.b bVar2 = (jb.b) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        fb.g gVar = (fb.g) obj5;
        g gVar2 = (g) obj6;
        kotlin.jvm.internal.m.e(context, "p0");
        kotlin.jvm.internal.m.e(bVar, "p1");
        kotlin.jvm.internal.m.e(bVar2, "p2");
        kotlin.jvm.internal.m.e(workDatabase, "p3");
        kotlin.jvm.internal.m.e(gVar, "p4");
        String str = l.f385a;
        cb.d dVar = new cb.d(context, workDatabase, bVar);
        ib.h.a(context, SystemJobService.class, true);
        za.v.d().a(l.f385a, "Created SystemJobScheduler and enabled SystemJobService");
        return va.a.S(dVar, new bb.c(context, bVar, gVar, gVar2, new l9.f0(gVar2, bVar2), bVar2));
    }
}
