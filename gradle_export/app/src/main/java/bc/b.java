package bc;

import a40.k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.w;
import g00.b0;

public final class b implements DefaultLifecycleObserver {
    public final k A;

    public b(k kVar) {
        this.A = kVar;
    }

    @Override
    public final void onStart(w wVar) {
        this.A.resumeWith(b0.a);
    }
}
