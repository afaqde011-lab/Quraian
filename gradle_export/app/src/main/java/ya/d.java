package ya;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.m;

public final class d implements c {

    public static final d f16850a = new d();

    @Override
    public final xa.a a(ContextWrapper contextWrapper, a aVar) {
        m.e(aVar, "densityCompatHelper");
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        m.d(bounds, "getBounds(...)");
        return new xa.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
