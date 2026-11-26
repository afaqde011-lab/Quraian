package c4;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

public final class p {

    public static final p f2841a = new p();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsSides(i10);
    }

    public final void c(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsTypes(i10);
    }
}
