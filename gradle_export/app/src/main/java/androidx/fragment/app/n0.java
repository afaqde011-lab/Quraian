package androidx.fragment.app;

import android.view.View;
import android.view.Window;

public final class n0 extends t0 implements o4.b, o4.c, n4.q, n4.r, androidx.lifecycle.f1, d.g0, h.j, ia.g, n1, z4.k {
    public final o0 E;

    public n0(o0 o0Var) {
        super(o0Var);
        this.E = o0Var;
    }

    @Override
    public final void a(j0 j0Var) {
        this.E.onAttachFragment(j0Var);
    }

    @Override
    public final void addMenuProvider(z4.n nVar) {
        this.E.addMenuProvider(nVar);
    }

    @Override
    public final void addOnConfigurationChangedListener(y4.a aVar) {
        this.E.addOnConfigurationChangedListener(aVar);
    }

    @Override
    public final void addOnMultiWindowModeChangedListener(y4.a aVar) {
        this.E.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override
    public final void addOnPictureInPictureModeChangedListener(y4.a aVar) {
        this.E.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override
    public final void addOnTrimMemoryListener(y4.a aVar) {
        this.E.addOnTrimMemoryListener(aVar);
    }

    @Override
    public final View b(int i10) {
        return this.E.findViewById(i10);
    }

    @Override
    public final boolean c() {
        Window window = this.E.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override
    public final h.i getActivityResultRegistry() {
        return this.E.getActivityResultRegistry();
    }

    @Override
    public final androidx.lifecycle.q getLifecycle() {
        return this.E.mFragmentLifecycleRegistry;
    }

    @Override
    public final d.e0 getOnBackPressedDispatcher() {
        return this.E.getOnBackPressedDispatcher();
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        return this.E.getSavedStateRegistry();
    }

    @Override
    public final androidx.lifecycle.e1 getViewModelStore() {
        return this.E.getViewModelStore();
    }

    @Override
    public final void removeMenuProvider(z4.n nVar) {
        this.E.removeMenuProvider(nVar);
    }

    @Override
    public final void removeOnConfigurationChangedListener(y4.a aVar) {
        this.E.removeOnConfigurationChangedListener(aVar);
    }

    @Override
    public final void removeOnMultiWindowModeChangedListener(y4.a aVar) {
        this.E.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override
    public final void removeOnPictureInPictureModeChangedListener(y4.a aVar) {
        this.E.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override
    public final void removeOnTrimMemoryListener(y4.a aVar) {
        this.E.removeOnTrimMemoryListener(aVar);
    }
}
