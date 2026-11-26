package b3;

import androidx.compose.ui.node.Owner;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class p2 extends a30.x {
    public final void d(int i10, Object obj) {
        ((l0) ((a30.x) this).D).D(i10, (l0) obj);
    }

    public final void f() {
        ((l0) ((a30.x) this).D).i();
    }

    public final void g(int i10, int i11, int i12) {
        ((l0) ((a30.x) this).D).N(i10, i11, i12);
    }

    public final void h(int i10, int i11) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ((l0) ((a30.x) this).D).S(i10, i11);
    }

    public final void n(int i10, Object obj) {
    }

    public final void o() {
        Owner owner = ((l0) ((a30.x) this).B).O;
        if (owner != null) {
            ((c3.z) owner).x();
        }
    }

    public final void r() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ((l0) ((a30.x) this).B).R();
    }
}
