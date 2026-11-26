package androidx.mediarouter.app;

import android.view.animation.Animation;

public final class p implements Animation.AnimationListener {

    public final int f1763a;

    public final Object f1764b;

    public p(Object obj, int i10) {
        this.f1763a = i10;
        this.f1764b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        switch (this.f1763a) {
            case 0:
                break;
            case 1:
                ((v) this.f1764b).i(true);
                break;
            default:
                q0 q0Var = ((o0) this.f1764b).f1762j;
                q0Var.Z = false;
                q0Var.m();
                break;
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.f1763a;
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        switch (this.f1763a) {
            case 0:
                v vVar = (v) this.f1764b;
                OverlayListView overlayListView = vVar.f1815f0;
                for (r0 r0Var : overlayListView.A) {
                    if (!r0Var.f1801j) {
                        r0Var.f1800i = overlayListView.getDrawingTime();
                        r0Var.f1801j = true;
                    }
                }
                vVar.f1815f0.postDelayed(vVar.P0, vVar.I0);
                break;
            case 1:
                break;
            default:
                ((o0) this.f1764b).f1762j.Z = true;
                break;
        }
    }
}
