package z4;

import android.view.View;
import android.view.WindowInsets;

public abstract class e0 {
    public static j1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        j1 j1VarG = j1.g(null, rootWindowInsets);
        g1 g1Var = j1VarG.f17202a;
        g1Var.y(j1VarG);
        View rootView = view.getRootView();
        g1Var.d(rootView);
        g1Var.p(rootView);
        g1Var.q();
        return j1VarG;
    }
}
