package ba;

import android.util.SparseArray;
import java.util.Set;

public final class u0 {

    public SparseArray f2434a;

    public int f2435b;

    public Set f2436c;

    public final t0 a(int i10) {
        SparseArray sparseArray = this.f2434a;
        t0 t0Var = (t0) sparseArray.get(i10);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0();
        sparseArray.put(i10, t0Var2);
        return t0Var2;
    }
}
