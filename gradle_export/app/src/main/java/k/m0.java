package k;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.measurement.g4;
import java.util.WeakHashMap;

public final class m0 extends g4 {

    public final int f8424i;

    public final o0 f8425j;

    public m0(o0 o0Var, int i10) {
        this.f8424i = i10;
        this.f8425j = o0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f8424i;
        o0 o0Var = this.f8425j;
        switch (i10) {
            case 0:
                if (o0Var.f8440o && (view = o0Var.f8434g) != null) {
                    view.setTranslationY(0.0f);
                    o0Var.f8431d.setTranslationY(0.0f);
                }
                o0Var.f8431d.setVisibility(8);
                o0Var.f8431d.setTransitioning(false);
                o0Var.f8444s = null;
                h1.l lVar = o0Var.f8438k;
                if (lVar != null) {
                    lVar.n0(o0Var.f8437j);
                    o0Var.f8437j = null;
                    o0Var.f8438k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = o0Var.f8430c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = z4.j0.f17198a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                o0Var.f8444s = null;
                o0Var.f8431d.requestLayout();
                break;
        }
    }
}
