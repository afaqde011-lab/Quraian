package m9;

import android.view.MotionEvent;
import android.webkit.WebView;

public final class n0 extends WebView {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
