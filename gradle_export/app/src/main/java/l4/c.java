package l4;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import kotlin.jvm.internal.m;
import tf.x;

public final class c implements ViewGroup.OnHierarchyChangeListener {
    public final int A = 0;
    public final KeyEvent.Callback B;

    public c(CoordinatorLayout coordinatorLayout) {
        this.B = coordinatorLayout;
    }

    public c(x xVar, MainActivity mainActivity) {
        this.B = mainActivity;
    }

    private final void a(View view, View view2) {
    }

    @Override
    public final void onChildViewAdded(View view, View view2) {
        switch (this.A) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.B).Q;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
            default:
                if (view2 instanceof SplashScreenView) {
                    WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
                    m.d(windowInsetsBuild, "build(...)");
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (windowInsetsBuild == ((SplashScreenView) view2).getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                        rect.isEmpty();
                    }
                    View decorView = this.B.getWindow().getDecorView();
                    m.c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
                break;
        }
    }

    @Override
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.A) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.B;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.Q;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
        }
    }
}
