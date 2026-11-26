package ba;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class z0 {

    public int f2465a;

    public int f2466b;

    public int f2467c;

    public int f2468d;

    public Interpolator f2469e;

    public boolean f2470f;

    public int f2471g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f2468d;
        if (i10 >= 0) {
            this.f2468d = -1;
            recyclerView.Q(i10);
            this.f2470f = false;
            return;
        }
        if (!this.f2470f) {
            this.f2471g = 0;
            return;
        }
        Interpolator interpolator = this.f2469e;
        if (interpolator != null && this.f2467c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f2467c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.D0.c(this.f2465a, this.f2466b, i11, interpolator);
        int i12 = this.f2471g + 1;
        this.f2471g = i12;
        if (i12 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2470f = false;
    }
}
