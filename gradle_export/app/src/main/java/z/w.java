package z;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class w {

    public static final long f16971a = ViewConfiguration.getTapTimeout();

    public static final boolean a(h hVar) {
        ViewParent parent = b3.m.A(hVar).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
