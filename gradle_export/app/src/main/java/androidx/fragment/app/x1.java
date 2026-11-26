package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

public final class x1 implements Transition.TransitionListener {

    public final Object f856a;

    public final ArrayList f857b;

    public final Object f858c;

    public final ArrayList f859d;

    public final z1 f860e;

    public x1(z1 z1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f860e = z1Var;
        this.f856a = obj;
        this.f857b = arrayList;
        this.f858c = obj2;
        this.f859d = arrayList2;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        z1 z1Var = this.f860e;
        Object obj = this.f856a;
        if (obj != null) {
            z1Var.A(obj, this.f857b, null);
        }
        Object obj2 = this.f858c;
        if (obj2 != null) {
            z1Var.A(obj2, this.f859d, null);
        }
    }
}
