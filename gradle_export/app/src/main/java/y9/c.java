package y9;

import a40.c0;
import a40.k;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import g00.b0;
import kotlin.jvm.internal.m;
import lu.w;
import qd.s0;

public abstract class c {

    public final MeasurementManager f16846a;

    public c(MeasurementManager measurementManager) {
        m.e(measurementManager, "mMeasurementManager");
        this.f16846a = measurementManager;
    }

    public static Object b(c cVar, a aVar, k00.c<? super b0> cVar2) {
        new k(1, s0.j0(cVar2)).r();
        MeasurementManager measurementManager = cVar.f16846a;
        throw null;
    }

    public static Object d(c cVar, k00.c<? super Integer> cVar2) {
        k kVar = new k(1, s0.j0(cVar2));
        kVar.r();
        cVar.f16846a.getMeasurementApiStatus(new f5.d(0), new u4.c(kVar));
        Object objQ = kVar.q();
        l00.a aVar = l00.a.A;
        return objQ;
    }

    public static Object g(c cVar, Uri uri, InputEvent inputEvent, k00.c<? super b0> cVar2) {
        k kVar = new k(1, s0.j0(cVar2));
        kVar.r();
        cVar.f16846a.registerSource(uri, inputEvent, new f5.d(0), new u4.c(kVar));
        Object objQ = kVar.q();
        return objQ == l00.a.A ? objQ : b0.a;
    }

    public static Object h(c cVar, d dVar, k00.c<? super b0> cVar2) {
        Object objK = c0.k(new w(cVar, (k00.c) null, 24), cVar2);
        return objK == l00.a.A ? objK : b0.a;
    }

    public static Object j(c cVar, Uri uri, k00.c<? super b0> cVar2) {
        k kVar = new k(1, s0.j0(cVar2));
        kVar.r();
        cVar.f16846a.registerTrigger(uri, new f5.d(0), new u4.c(kVar));
        Object objQ = kVar.q();
        return objQ == l00.a.A ? objQ : b0.a;
    }

    public static Object l(c cVar, e eVar, k00.c<? super b0> cVar2) {
        new k(1, s0.j0(cVar2)).r();
        MeasurementManager measurementManager = cVar.f16846a;
        throw null;
    }

    public static Object n(c cVar, f fVar, k00.c<? super b0> cVar2) {
        new k(1, s0.j0(cVar2)).r();
        MeasurementManager measurementManager = cVar.f16846a;
        throw null;
    }

    public Object a(a aVar, k00.c<? super b0> cVar) {
        return b(this, aVar, cVar);
    }

    public Object c(k00.c<? super Integer> cVar) {
        return d(this, cVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, k00.c<? super b0> cVar) {
        return g(this, uri, inputEvent, cVar);
    }

    public Object f(d dVar, k00.c<? super b0> cVar) {
        return h(this, dVar, cVar);
    }

    public Object i(Uri uri, k00.c<? super b0> cVar) {
        return j(this, uri, cVar);
    }

    public Object k(e eVar, k00.c<? super b0> cVar) {
        return l(this, eVar, cVar);
    }

    public Object m(f fVar, k00.c<? super b0> cVar) {
        return n(this, fVar, cVar);
    }
}
