package ba;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class j1 {

    public int f2313a;

    public int f2314b;

    public boolean f2315c;

    public boolean f2316d;

    public boolean f2317e;

    public int[] f2318f;

    public final StaggeredGridLayoutManager f2319g;

    public j1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2319g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2313a = -1;
        this.f2314b = Integer.MIN_VALUE;
        this.f2315c = false;
        this.f2316d = false;
        this.f2317e = false;
        int[] iArr = this.f2318f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
