package ba;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import b3.i2;
import java.util.ArrayList;

public final class h0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((x0) ((i0) ((Observable) this).mObservers.get(size))).f2460a;
            recyclerView.k(null);
            recyclerView.G0.f2243f = true;
            recyclerView.Y(true);
            if (!recyclerView.E.m()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) ((i0) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = x0Var.f2460a;
            recyclerView.k(null);
            i2 i2Var = recyclerView.E;
            ArrayList arrayList = (ArrayList) i2Var.f2046c;
            if (i10 != i11) {
                arrayList.add(i2Var.o(null, 8, i10, i11));
                i2Var.f2044a |= 8;
                if (arrayList.size() == 1) {
                    x0Var.a();
                }
            }
        }
    }

    public final void d(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) ((i0) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = x0Var.f2460a;
            recyclerView.k(null);
            i2 i2Var = recyclerView.E;
            ArrayList arrayList = (ArrayList) i2Var.f2046c;
            if (i11 >= 1) {
                arrayList.add(i2Var.o(obj, 4, i10, i11));
                i2Var.f2044a = 4 | i2Var.f2044a;
                if (arrayList.size() == 1) {
                    x0Var.a();
                }
            }
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) ((i0) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = x0Var.f2460a;
            recyclerView.k(null);
            i2 i2Var = recyclerView.E;
            ArrayList arrayList = (ArrayList) i2Var.f2046c;
            if (i11 >= 1) {
                arrayList.add(i2Var.o(null, 1, i10, i11));
                i2Var.f2044a |= 1;
                if (arrayList.size() == 1) {
                    x0Var.a();
                }
            }
        }
    }

    public final void f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) ((i0) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = x0Var.f2460a;
            recyclerView.k(null);
            i2 i2Var = recyclerView.E;
            ArrayList arrayList = (ArrayList) i2Var.f2046c;
            if (i11 >= 1) {
                arrayList.add(i2Var.o(null, 2, i10, i11));
                i2Var.f2044a |= 2;
                if (arrayList.size() == 1) {
                    x0Var.a();
                }
            }
        }
    }

    public final void g() {
        g0 g0Var;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((x0) ((i0) ((Observable) this).mObservers.get(size))).f2460a;
            if (recyclerView.D != null && (g0Var = recyclerView.M) != null && g0Var.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }
}
