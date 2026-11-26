package c3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

public final class m1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final n1 A;

    public m1(n1 n1Var) {
        this.A = n1Var;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.A.d(configuration);
    }

    @Override
    public final void onLowMemory() {
        n1 n1Var = this.A;
        n1Var.f2705f.f6563a.clear();
        h3.d dVar = n1Var.f2706g;
        synchronized (dVar) {
            dVar.f6564a.c();
        }
    }

    @Override
    public final void onTrimMemory(int i10) {
        n1 n1Var = this.A;
        n1Var.f2705f.f6563a.clear();
        h3.d dVar = n1Var.f2706g;
        synchronized (dVar) {
            dVar.f6564a.c();
        }
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.A.f2716s.f2671c.setValue(Boolean.valueOf(z10));
    }
}
