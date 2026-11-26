package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public final class k0 extends h0 {
    public final o0 A;

    public final TextView f1746y;

    public final int f1747z;

    public k0(o0 o0Var, View view) {
        this.A = o0Var;
        q0 q0Var = o0Var.f1762j;
        super(q0Var, view, (ImageButton) view.findViewById(2131362825), (MediaRouteVolumeSlider) view.findViewById(2131362831));
        this.f1746y = (TextView) view.findViewById(2131362857);
        Resources resources = q0Var.O.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(2131166091, typedValue, true);
        this.f1747z = (int) typedValue.getDimension(displayMetrics);
    }
}
