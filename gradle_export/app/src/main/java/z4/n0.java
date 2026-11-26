package z4;

import android.view.View;
import java.lang.ref.WeakReference;

public final class n0 {

    public final WeakReference f17211a;

    public n0(View view) {
        this.f17211a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f17211a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f17211a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j9) {
        View view = (View) this.f17211a.get();
        if (view != null) {
            view.animate().setDuration(j9);
        }
    }

    public final void d(o0 o0Var) {
        View view = (View) this.f17211a.get();
        if (view != null) {
            if (o0Var != null) {
                view.animate().setListener(new ta.n(o0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f17211a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
