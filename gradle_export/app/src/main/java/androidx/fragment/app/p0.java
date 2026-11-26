package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p0 {

    public final Object f802a;

    public final Cloneable f803b;

    public p0(Animator animator) {
        this.f802a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f803b = animatorSet;
        animatorSet.play(animator);
    }

    public p0(Animation animation) {
        this.f802a = animation;
        this.f803b = null;
    }

    public p0(i1 i1Var) {
        this.f802a = i1Var;
        this.f803b = new CopyOnWriteArrayList();
    }

    public void a(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.a(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void b(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        i1 i1Var = (i1) this.f802a;
        o0 o0Var = i1Var.f769w.B;
        j0 j0Var2 = i1Var.f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.b(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void c(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.c(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void d(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        i1 i1Var = (i1) this.f802a;
        j0 j0Var2 = i1Var.f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.d(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                w0Var.f850a.J(i1Var, j0Var);
            }
        }
    }

    public void e(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.e(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void f(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.f(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void g(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        i1 i1Var = (i1) this.f802a;
        o0 o0Var = i1Var.f769w.B;
        j0 j0Var2 = i1Var.f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.g(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void h(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.h(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void i(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        i1 i1Var = (i1) this.f802a;
        j0 j0Var2 = i1Var.f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.i(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                w0Var.f850a.K(i1Var, j0Var);
            }
        }
    }

    public void j(j0 j0Var, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.j(j0Var, bundle, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void k(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.k(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void l(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.l(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void m(j0 j0Var, View view, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        kotlin.jvm.internal.m.e(view, "v");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.m(j0Var, view, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }

    public void n(j0 j0Var, boolean z10) {
        kotlin.jvm.internal.m.e(j0Var, "f");
        j0 j0Var2 = ((i1) this.f802a).f771y;
        if (j0Var2 != null) {
            i1 parentFragmentManager = j0Var2.getParentFragmentManager();
            kotlin.jvm.internal.m.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f761o.n(j0Var, true);
        }
        for (w0 w0Var : (CopyOnWriteArrayList) this.f803b) {
            if (!z10 || w0Var.f851b) {
                a10.h0 h0Var = w0Var.f850a;
            }
        }
    }
}
