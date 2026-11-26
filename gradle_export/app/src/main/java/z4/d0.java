package z4;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

public abstract class d0 {
    public static j1 a(View view, j1 j1Var, Rect rect) {
        WindowInsets windowInsetsF = j1Var.f();
        if (windowInsetsF != null) {
            return j1.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return j1Var;
    }

    public static void b(View view, r rVar) {
        c0 c0Var = rVar != null ? new c0(view, rVar) : null;
        if (view.getTag(2131363063) != null) {
            return;
        }
        if (c0Var != null) {
            view.setOnApplyWindowInsetsListener(c0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131363073));
        }
    }
}
