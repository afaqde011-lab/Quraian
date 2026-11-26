package b3;

import androidx.compose.ui.node.Owner;
import com.google.android.gms.internal.measurement.b5;

public abstract class p0 {

    public static final y3.d f2088a = b5.d();

    public static final Owner a(l0 l0Var) {
        Owner owner = l0Var.O;
        if (owner != null) {
            return owner;
        }
        throw a1.b.u("LayoutNode should be attached to an owner");
    }
}
