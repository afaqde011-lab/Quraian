package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

public final class c2 implements androidx.lifecycle.j, ia.g, androidx.lifecycle.f1 {
    public final j0 A;
    public final androidx.lifecycle.e1 B;
    public final y C;
    public androidx.lifecycle.y D = null;
    public ia.f E = null;

    public c2(j0 j0Var, androidx.lifecycle.e1 e1Var, y yVar) {
        this.A = j0Var;
        this.B = e1Var;
        this.C = yVar;
    }

    public final void a(androidx.lifecycle.o oVar) {
        this.D.g(oVar);
    }

    public final void b() {
        if (this.D == null) {
            this.D = new androidx.lifecycle.y(this, true);
            androidx.media3.common.h0 h0Var = new androidx.media3.common.h0(this, new g1.l0(this, 10));
            this.E = new ia.f(h0Var);
            h0Var.a();
            this.C.run();
        }
    }

    @Override
    public final t6.b getDefaultViewModelCreationExtras() {
        Application application;
        j0 j0Var = this.A;
        Context applicationContext = j0Var.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        t6.d dVar = new t6.d(0);
        LinkedHashMap linkedHashMap = dVar.f14360a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.b1.f978d, application);
        }
        linkedHashMap.put(androidx.lifecycle.u0.f1003a, j0Var);
        linkedHashMap.put(androidx.lifecycle.u0.f1004b, this);
        if (j0Var.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.u0.f1005c, j0Var.getArguments());
        }
        return dVar;
    }

    @Override
    public final androidx.lifecycle.q getLifecycle() {
        b();
        return this.D;
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        b();
        return this.E.f7566b;
    }

    @Override
    public final androidx.lifecycle.e1 getViewModelStore() {
        b();
        return this.B;
    }
}
