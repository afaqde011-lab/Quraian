package wb;

import a40.e1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.w;
import java.util.concurrent.CancellationException;

public final class a implements DefaultLifecycleObserver {
    public final androidx.lifecycle.q A;
    public final e1 B;

    public a(androidx.lifecycle.q qVar, e1 e1Var) {
        this.A = qVar;
        this.B = e1Var;
    }

    @Override
    public final void onDestroy(w wVar) {
        this.B.i((CancellationException) null);
    }
}
