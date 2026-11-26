package c3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public final class d3 extends ViewOutlineProvider {

    public final int f2647a;

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f2647a) {
            case 0:
                kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                a1.b.x(view);
                throw null;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
