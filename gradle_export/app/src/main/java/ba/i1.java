package ba;

import androidx.recyclerview.widget.RecyclerView;

public final class i1 extends s0 {

    public boolean f2309a = false;

    public final a0 f2310b;

    public i1(a0 a0Var) {
        this.f2310b = a0Var;
    }

    @Override
    public final void a(int i10) {
        if (i10 == 0 && this.f2309a) {
            this.f2309a = false;
            this.f2310b.f();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f2309a = true;
    }
}
