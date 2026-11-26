package av;

import androidx.fragment.app.j0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g00.b0;

public final class m implements u00.a {
    public final int A;
    public final n B;

    public m(n nVar, int i) {
        this.A = i;
        this.B = nVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                j0 j0VarRequireParentFragment = this.B.requireParentFragment();
                kotlin.jvm.internal.m.d(j0VarRequireParentFragment, "requireParentFragment(...)");
                return j0VarRequireParentFragment;
            default:
                n nVar = this.B;
                eg.f dialog = nVar.getDialog();
                eg.f fVar = dialog instanceof eg.f ? dialog : null;
                BottomSheetBehavior bottomSheetBehaviorF = fVar != null ? fVar.f() : null;
                if (bottomSheetBehaviorF == null) {
                    nVar.dismissAllowingStateLoss();
                } else {
                    bottomSheetBehaviorF.K(5);
                }
                return b0.a;
        }
    }
}
