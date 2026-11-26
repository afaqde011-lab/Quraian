package ta;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import z4.j0;

public final class f0 extends AnimatorListenerAdapter implements r {

    public final ViewGroup f14453a;

    public final View f14454b;

    public final View f14455c;

    public boolean f14456d = true;

    public final h f14457e;

    public f0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f14457e = hVar;
        this.f14453a = viewGroup;
        this.f14454b = view;
        this.f14455c = view2;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b(t tVar) {
        if (this.f14456d) {
            g();
        }
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
    }

    public final void g() {
        this.f14455c.setTag(2131362979, null);
        this.f14453a.getOverlay().remove(this.f14454b);
        this.f14456d = false;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        g();
    }

    @Override
    public final void onAnimationPause(Animator animator) {
        this.f14453a.getOverlay().remove(this.f14454b);
    }

    @Override
    public final void onAnimationResume(Animator animator) {
        View view = this.f14454b;
        if (view.getParent() == null) {
            j0.a(this.f14453a, view);
        } else {
            this.f14457e.cancel();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f14455c;
            View view2 = this.f14454b;
            view.setTag(2131362979, view2);
            j0.a(this.f14453a, view2);
            this.f14456d = true;
        }
    }
}
