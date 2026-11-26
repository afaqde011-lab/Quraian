package ta;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class e0 extends AnimatorListenerAdapter implements r {

    public final View f14441a;

    public final int f14442b;

    public final ViewGroup f14443c;

    public boolean f14445e;

    public boolean f14446f = false;

    public final boolean f14444d = true;

    public e0(View view, int i10) {
        this.f14441a = view;
        this.f14442b = i10;
        this.f14443c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override
    public final void a() {
        g(false);
        if (this.f14446f) {
            return;
        }
        b bVar = b0.f14429a;
        this.f14441a.setTransitionVisibility(this.f14442b);
    }

    @Override
    public final void b(t tVar) {
    }

    @Override
    public final void c(t tVar) {
    }

    @Override
    public final void d(t tVar) {
        tVar.D(this);
    }

    @Override
    public final void e() {
        g(true);
        if (this.f14446f) {
            return;
        }
        b bVar = b0.f14429a;
        this.f14441a.setTransitionVisibility(0);
    }

    public final void g(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f14444d || this.f14445e == z10 || (viewGroup = this.f14443c) == null) {
            return;
        }
        this.f14445e = z10;
        viewGroup.suppressLayout(z10);
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f14446f = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f14446f) {
            b bVar = b0.f14429a;
            this.f14441a.setTransitionVisibility(this.f14442b);
            ViewGroup viewGroup = this.f14443c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        if (!this.f14446f) {
            b bVar = b0.f14429a;
            this.f14441a.setTransitionVisibility(this.f14442b);
            ViewGroup viewGroup = this.f14443c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            b bVar = b0.f14429a;
            this.f14441a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.f14443c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }
}
