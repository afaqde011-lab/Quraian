package ya;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.m;

public final class b implements a, c {

    public static final b f16847a = new b();

    public static final b f16848b = new b();

    public static final b f16849c = new b();

    @Override
    public xa.a a(ContextWrapper contextWrapper, a aVar) {
        m.e(aVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f3 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        m.d(bounds, "getBounds(...)");
        return new xa.a(bounds, f3);
    }
}
