package wb;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;

public final class g extends androidx.lifecycle.q {

    public static final g f15914b = new g();

    public static final f f15915c = new f();

    @Override
    public final void a(v vVar) {
        if (!(vVar instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((vVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) vVar;
        f fVar = f15915c;
        defaultLifecycleObserver.onCreate(fVar);
        defaultLifecycleObserver.onStart(fVar);
        defaultLifecycleObserver.onResume(fVar);
    }

    @Override
    public final androidx.lifecycle.p b() {
        return androidx.lifecycle.p.E;
    }

    @Override
    public final void d(v vVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
