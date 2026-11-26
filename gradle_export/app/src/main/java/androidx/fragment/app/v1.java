package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class v1 extends Transition.EpicenterCallback {

    public final int f848a;

    public final Rect f849b;

    public v1(int i10, Rect rect) {
        this.f848a = i10;
        this.f849b = rect;
    }

    @Override
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f848a) {
            case 0:
                return this.f849b;
            default:
                Rect rect = this.f849b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
