package n;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import z4.n0;
import z4.o0;

public final class k {

    public Interpolator f10993c;

    public o0 f10994d;

    public boolean f10995e;

    public long f10992b = -1;

    public final j f10996f = new j(this);

    public final ArrayList f10991a = new ArrayList();

    public final void a() {
        if (this.f10995e) {
            Iterator it = this.f10991a.iterator();
            while (it.hasNext()) {
                ((n0) it.next()).b();
            }
            this.f10995e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f10995e) {
            return;
        }
        for (n0 n0Var : this.f10991a) {
            long j9 = this.f10992b;
            if (j9 >= 0) {
                n0Var.c(j9);
            }
            Interpolator interpolator = this.f10993c;
            if (interpolator != null && (view = (View) n0Var.f17211a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f10994d != null) {
                n0Var.d(this.f10996f);
            }
            View view2 = (View) n0Var.f17211a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10995e = true;
    }
}
