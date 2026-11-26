package ib;

import ab.l0;
import ab.q;
import ab.y;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import g1.j7;
import h00.v;
import hb.p;
import hb.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import za.b0;
import za.g0;
import za.k0;

public abstract class g {

    public static final int[] f7572a = {13, 15, 14};

    public static final void a(y yVar, String str) {
        l0 l0VarB;
        WorkDatabase workDatabase = yVar.f420c;
        kotlin.jvm.internal.m.d(workDatabase, "getWorkDatabase(...)");
        x xVarW = workDatabase.w();
        hb.c cVarR = workDatabase.r();
        ArrayList arrayListW = va.a.W(str);
        while (!arrayListW.isEmpty()) {
            String str2 = (String) v.y0(arrayListW);
            g0 g0VarD = xVarW.d(str2);
            if (g0VarD != g0.C && g0VarD != g0.D) {
                ((Number) rd.a.M(xVarW.f7028a, false, true, new b6.o(str2, 28))).intValue();
            }
            arrayListW.addAll(cVarR.a(str2));
        }
        ab.g gVar = yVar.f423f;
        kotlin.jvm.internal.m.d(gVar, "getProcessor(...)");
        synchronized (gVar.f378k) {
            za.v.d().a(ab.g.l, "Processor cancelling " + str);
            gVar.f376i.add(str);
            l0VarB = gVar.b(str);
        }
        ab.g.d(str, l0VarB, 1);
        Iterator it = yVar.f422e.iterator();
        while (it.hasNext()) {
            ((ab.i) it.next()).c(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, za.b bVar, q qVar) {
        int i10;
        kotlin.jvm.internal.m.e(workDatabase, "workDatabase");
        kotlin.jvm.internal.m.e(bVar, "configuration");
        ArrayList arrayListW = va.a.W(qVar);
        int i11 = 0;
        while (!arrayListW.isEmpty()) {
            List list = ((q) v.y0(arrayListW)).f405d;
            kotlin.jvm.internal.m.d(list, "getWork(...)");
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((k0) it.next()).f17388b.f7013j.b() && (i10 = i10 + 1) < 0) {
                        va.a.j0();
                        throw null;
                    }
                }
            }
            i11 += i10;
        }
        if (i11 == 0) {
            return;
        }
        int iIntValue = ((Number) rd.a.M(workDatabase.w().f7028a, true, false, new j7(21))).intValue();
        int i12 = bVar.f17346j;
        if (iIntValue + i11 > i12) {
            throw new IllegalArgumentException(g4.c.g(i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", oi.k.p(i12, iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    public static f c(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : iArr) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e3) {
                za.v vVarD = za.v.d();
                String str = f.f7570b;
                String str2 = f.f7570b;
                String strH = oi.k.h("Ignoring adding capability '", i10, '\'');
                if (vVarD.f17403a <= 5) {
                    Log.w(str2, strH, e3);
                }
            }
        }
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = f7572a[i11];
            if (!h00.n.n0(iArr, i12)) {
                try {
                    builder.removeCapability(i12);
                } catch (IllegalArgumentException e10) {
                    za.v vVarD2 = za.v.d();
                    String str3 = f.f7570b;
                    String str4 = f.f7570b;
                    String strH2 = oi.k.h("Ignoring removing default capability '", i12, '\'');
                    if (vVarD2.f17403a <= 5) {
                        Log.w(str4, strH2, e10);
                    }
                }
            }
        }
        for (int i13 : iArr2) {
            builder.addTransportType(i13);
        }
        NetworkRequest networkRequestBuild = builder.build();
        kotlin.jvm.internal.m.d(networkRequestBuild, "build(...)");
        return new f(networkRequestBuild);
    }

    public static final p d(List list, p pVar) {
        kotlin.jvm.internal.m.e(list, "schedulers");
        kotlin.jvm.internal.m.e(pVar, "workSpec");
        boolean zD = pVar.f7008e.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zD2 = pVar.f7008e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zD3 = pVar.f7008e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zD || !zD2 || !zD3) {
            return pVar;
        }
        String str = pVar.f7006c;
        b0 b0Var = new b0();
        za.g gVar = pVar.f7008e;
        kotlin.jvm.internal.m.e(gVar, "data");
        b0Var.c(gVar.f17368a);
        ((LinkedHashMap) b0Var.f17350a).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return p.b(pVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", b0Var.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
