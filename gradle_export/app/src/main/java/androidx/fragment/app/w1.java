package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class w1 implements Transition.TransitionListener {

    public final View f852a;

    public final ArrayList f853b;

    public w1(View view, ArrayList arrayList) {
        this.f852a = view;
        this.f853b = arrayList;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f852a.setVisibility(8);
        ArrayList arrayList = this.f853b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
