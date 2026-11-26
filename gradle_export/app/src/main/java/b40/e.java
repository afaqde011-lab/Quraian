package b40;

import a40.k;
import a40.m0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g00.m;
import java.lang.reflect.InvocationTargetException;
import qd.s0;
import ri.t1;

public abstract class e {
    public static final int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objS;
        try {
            objS = new c(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof m) {
            objS = null;
        }
    }

    public static final void a(k kVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            kotlin.jvm.internal.m.b(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new d(kVar));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final Object c(m00.c cVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            k kVar = new k(1, s0.j0(cVar));
            kVar.r();
            choreographer2.postFrameCallback(new d(kVar));
            Object objQ = kVar.q();
            l00.a aVar = l00.a.A;
            return objQ;
        }
        k kVar2 = new k(1, s0.j0(cVar));
        kVar2.r();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(kVar2);
        } else {
            h40.e eVar = m0.a;
            f40.m.a.n0(kVar2.E, new a50.d(kVar2, 2));
        }
        Object objQ2 = kVar2.q();
        l00.a aVar2 = l00.a.A;
        return objQ2;
    }
}
