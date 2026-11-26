package ab;

import a1.e2;
import a40.e1;
import a40.f1;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.x5;
import h1.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import ri.t1;

public final class l0 {

    public final hb.p f386a;

    public final Context f387b;

    public final String f388c;

    public final jb.b f389d;

    public final za.b f390e;

    public final za.i f391f;

    public final gb.a f392g;

    public final WorkDatabase f393h;

    public final hb.x f394i;

    public final hb.c f395j;

    public final ArrayList f396k;
    public final String l;
    public final f1 m;

    public l0(ui.b bVar) {
        hb.p pVar = (hb.p) bVar.F;
        this.f386a = pVar;
        this.f387b = (Context) bVar.H;
        String str = pVar.f7004a;
        this.f388c = str;
        this.f389d = (jb.b) bVar.C;
        za.b bVar2 = (za.b) bVar.B;
        this.f390e = bVar2;
        this.f391f = bVar2.f17340d;
        this.f392g = (gb.a) bVar.D;
        WorkDatabase workDatabase = (WorkDatabase) bVar.E;
        this.f393h = workDatabase;
        this.f394i = workDatabase.w();
        this.f395j = workDatabase.r();
        ArrayList arrayList = (ArrayList) bVar.G;
        this.f396k = arrayList;
        this.l = x5.n(g4.c.n("Work [ id=", str, ", tags={ "), h00.q.R0(arrayList, ",", (String) null, (String) null, (u00.k) null, 62), " } ]");
        this.m = a40.c0.d();
    }

    public static final Object a(final l0 l0Var, m00.c cVar) {
        k0 k0Var;
        OverwritingInputMerger overwritingInputMerger;
        za.g gVarA;
        String str;
        Throwable th2;
        String str2;
        CancellationException e3;
        String str3;
        za.v vVarD;
        String strJ;
        String str4 = l0Var.l;
        String str5 = l0Var.f388c;
        jb.b bVar = l0Var.f389d;
        WorkDatabase workDatabase = l0Var.f393h;
        za.b bVar2 = l0Var.f390e;
        za.i iVar = bVar2.m;
        hb.p pVar = l0Var.f386a;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(l0Var, cVar);
            }
        } else {
            k0Var = new k0(l0Var, cVar);
        }
        Object objJ = k0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = k0Var.C;
        if (i11 == 0) {
            t1.O(objJ);
            za.i iVar2 = bVar2.f17341e;
            iVar.getClass();
            boolean zIsEnabled = Trace.isEnabled();
            String str6 = pVar.f7025x;
            String str7 = pVar.f7006c;
            String str8 = pVar.f7007d;
            if (zIsEnabled && str6 != null) {
                kh.o.m(pVar.hashCode(), str6);
            }
            final int i12 = 0;
            if (((Boolean) workDatabase.o(new a1.z(new Callable(l0Var) {

                public final l0 f361b;

                {
                    this.f361b = l0Var;
                }

                @Override
                public final Object call() {
                    switch (i12) {
                        case 0:
                            l0 l0Var2 = this.f361b;
                            hb.p pVar2 = l0Var2.f386a;
                            za.g0 g0Var = pVar2.f7005b;
                            String str9 = pVar2.f7006c;
                            za.g0 g0Var2 = za.g0.A;
                            if (g0Var != g0Var2) {
                                String str10 = m0.f398a;
                                za.v.d().a(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                return Boolean.TRUE;
                            }
                            if (pVar2.c() || (pVar2.f7005b == g0Var2 && pVar2.f7014k > 0)) {
                                l0Var2.f391f.getClass();
                                if (System.currentTimeMillis() < pVar2.a()) {
                                    za.v.d().a(m0.f398a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        default:
                            l0 l0Var3 = this.f361b;
                            hb.x xVar = l0Var3.f394i;
                            String str11 = l0Var3.f388c;
                            boolean z10 = false;
                            if (xVar.d(str11) == za.g0.A) {
                                xVar.j(za.g0.B, str11);
                                ((Number) rd.a.M(xVar.f7028a, false, true, new hb.u(str11, 3))).intValue();
                                xVar.k(-256, str11);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            }, 13))).booleanValue()) {
                return new g0();
            }
            if (pVar.c()) {
                gVarA = pVar.f7008e;
                zIsEnabled = zIsEnabled;
            } else {
                bVar2.f17342f.getClass();
                kotlin.jvm.internal.m.e(str8, "className");
                String str9 = za.n.f17394a;
                try {
                    Object objNewInstance = Class.forName(str8).getDeclaredConstructor(null).newInstance(null);
                    kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                    overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                } catch (Exception e10) {
                    za.v.d().c(za.n.f17394a, "Trouble instantiating ".concat(str8), e10);
                    overwritingInputMerger = null;
                }
                if (overwritingInputMerger == null) {
                    za.v.d().b(m0.f398a, "Could not create Input Merger ".concat(str8));
                    return new e0();
                }
                List listR = va.a.R(pVar.f7008e);
                hb.x xVar = l0Var.f394i;
                xVar.getClass();
                kotlin.jvm.internal.m.e(str5, "id");
                ArrayList arrayListY0 = h00.q.Y0((List) rd.a.M(xVar.f7028a, true, false, new hb.u(str5, 1)), listR);
                za.b0 b0Var = new za.b0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayListY0.iterator();
                while (it.hasNext()) {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(((za.g) it.next()).f17368a);
                    kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(...)");
                    linkedHashMap.putAll(mapUnmodifiableMap);
                }
                b0Var.c(linkedHashMap);
                gVarA = b0Var.a();
            }
            UUID uuidFromString = UUID.fromString(str5);
            ArrayList arrayList = l0Var.f396k;
            int i13 = pVar.f7014k;
            ExecutorService executorService = bVar2.f17337a;
            h40.e eVar = bVar2.f17338b;
            ib.o oVar = new ib.o(workDatabase, bVar);
            str = str4;
            ib.n nVar = new ib.n(workDatabase, l0Var.f392g, bVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f1902a = uuidFromString;
            workerParameters.f1903b = gVarA;
            new HashSet(arrayList);
            workerParameters.f1904c = i13;
            workerParameters.f1905d = executorService;
            workerParameters.f1906e = eVar;
            workerParameters.f1907f = oVar;
            workerParameters.f1908g = nVar;
            try {
                za.u uVarA = iVar2.a(l0Var.f387b, str7, workerParameters);
                final int i14 = 1;
                uVarA.f17400e = true;
                e1 e1Var = k0Var.getContext().get(a40.w.B);
                kotlin.jvm.internal.m.b(e1Var);
                e1 e1Var2 = e1Var;
                e1Var2.f0(new d0(uVarA, zIsEnabled, str6, l0Var, 0));
                Object objO = workDatabase.o(new a1.z(new Callable(l0Var) {

                    public final l0 f361b;

                    {
                        this.f361b = l0Var;
                    }

                    @Override
                    public final Object call() {
                        switch (i14) {
                            case 0:
                                l0 l0Var2 = this.f361b;
                                hb.p pVar2 = l0Var2.f386a;
                                za.g0 g0Var = pVar2.f7005b;
                                String str10 = pVar2.f7006c;
                                za.g0 g0Var2 = za.g0.A;
                                if (g0Var != g0Var2) {
                                    String str11 = m0.f398a;
                                    za.v.d().a(str11, str10 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (pVar2.c() || (pVar2.f7005b == g0Var2 && pVar2.f7014k > 0)) {
                                    l0Var2.f391f.getClass();
                                    if (System.currentTimeMillis() < pVar2.a()) {
                                        za.v.d().a(m0.f398a, "Delaying execution for " + str10 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                l0 l0Var3 = this.f361b;
                                hb.x xVar2 = l0Var3.f394i;
                                String str12 = l0Var3.f388c;
                                boolean z10 = false;
                                if (xVar2.d(str12) == za.g0.A) {
                                    xVar2.j(za.g0.B, str12);
                                    ((Number) rd.a.M(xVar2.f7028a, false, true, new hb.u(str12, 3))).intValue();
                                    xVar2.k(-256, str12);
                                    z10 = true;
                                }
                                return Boolean.valueOf(z10);
                        }
                    }
                }, 13));
                kotlin.jvm.internal.m.d(objO, "runInTransaction(...)");
                if (((Boolean) objO).booleanValue() && !e1Var2.isCancelled()) {
                    jb.a aVar2 = bVar.f8261d;
                    kotlin.jvm.internal.m.d(aVar2, "getMainThreadExecutor(...)");
                    a40.v vVarO = a40.c0.o(aVar2);
                    try {
                        e2 e2Var = new e2(l0Var, uVarA, nVar, null, 1);
                        k0Var.C = 1;
                        objJ = a40.c0.J(e2Var, vVarO, k0Var);
                        if (objJ == aVar) {
                            return aVar;
                        }
                    } catch (CancellationException e11) {
                        e3 = e11;
                        str2 = str;
                        str3 = m0.f398a;
                        vVarD = za.v.d();
                        strJ = w.c.j(str2, " was cancelled");
                        if (vVarD.f17403a <= 4) {
                            Log.i(str3, strJ, e3);
                        }
                        throw e3;
                    } catch (Throwable th3) {
                        th2 = th3;
                        String str10 = m0.f398a;
                        za.v.d().c(str10, str + " failed because it threw an exception/error", th2);
                        return new e0();
                    }
                }
                return new g0();
            } catch (Throwable unused) {
                String str11 = m0.f398a;
                za.v.d().b(str11, "Could not create Worker " + str7);
                return new e0();
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            t1.O(objJ);
            str = str4;
        } catch (CancellationException e12) {
            e3 = e12;
            str2 = str4;
            str3 = m0.f398a;
            vVarD = za.v.d();
            strJ = w.c.j(str2, " was cancelled");
            if (vVarD.f17403a <= 4) {
                Log.i(str3, strJ, e3);
            }
            throw e3;
        } catch (Throwable th4) {
            th2 = th4;
            str = str4;
            String str12 = m0.f398a;
            za.v.d().c(str12, str + " failed because it threw an exception/error", th2);
            return new e0();
        }
        za.t tVar = (za.t) objJ;
        kotlin.jvm.internal.m.b(tVar);
        return new f0(tVar);
    }

    public final void b(int i10) {
        za.g0 g0Var = za.g0.A;
        hb.x xVar = this.f394i;
        String str = this.f388c;
        xVar.j(g0Var, str);
        this.f391f.getClass();
        xVar.i(System.currentTimeMillis(), str);
        xVar.h(this.f386a.f7023v, str);
        xVar.g(-1L, str);
        xVar.k(i10, str);
    }

    public final void c() {
        this.f391f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hb.x xVar = this.f394i;
        String str = this.f388c;
        xVar.i(jCurrentTimeMillis, str);
        xVar.j(za.g0.A, str);
        xVar.getClass();
        ((Number) rd.a.M(xVar.f7028a, false, true, new b6.o(str, 29))).intValue();
        xVar.h(this.f386a.f7023v, str);
        xVar.getClass();
        rd.a.M(xVar.f7028a, false, true, new hb.u(str, 0));
        xVar.g(-1L, str);
    }

    public final void d(za.t tVar) {
        kotlin.jvm.internal.m.e(tVar, "result");
        String str = this.f388c;
        ArrayList arrayListW = va.a.W(str);
        while (true) {
            boolean zIsEmpty = arrayListW.isEmpty();
            hb.x xVar = this.f394i;
            if (zIsEmpty) {
                za.g gVar = ((za.q) tVar).f17395a;
                kotlin.jvm.internal.m.d(gVar, "getOutputData(...)");
                xVar.h(this.f386a.f7023v, str);
                xVar.getClass();
                rd.a.M(xVar.f7028a, false, true, new v0(gVar, str, 7));
                return;
            }
            String str2 = (String) h00.v.y0(arrayListW);
            if (xVar.d(str2) != za.g0.F) {
                xVar.j(za.g0.D, str2);
            }
            arrayListW.addAll(this.f395j.a(str2));
        }
    }
}
