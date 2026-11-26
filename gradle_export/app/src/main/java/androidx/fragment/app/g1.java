package androidx.fragment.app;

import java.util.ArrayList;

public final class g1 implements f1 {

    public final int f731a;

    public final i1 f732b;

    public g1(i1 i1Var, int i10) {
        this.f732b = i1Var;
        this.f731a = i10;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i1 i1Var = this.f732b;
        j0 j0Var = i1Var.f772z;
        int i10 = this.f731a;
        if (j0Var == null || i10 >= 0 || !j0Var.getChildFragmentManager().S(-1, 0)) {
            return i1Var.T(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}
