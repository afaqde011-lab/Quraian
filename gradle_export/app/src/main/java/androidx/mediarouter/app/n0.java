package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class n0 extends h0 {
    public final ProgressBar A;
    public final TextView B;
    public final RelativeLayout C;
    public final CheckBox D;
    public final float E;
    public final int F;
    public final g0 G;
    public final o0 H;

    public final View f1751y;

    public final ImageView f1752z;

    public n0(o0 o0Var, View view) {
        this.H = o0Var;
        q0 q0Var = o0Var.f1762j;
        super(q0Var, view, (ImageButton) view.findViewById(2131362825), (MediaRouteVolumeSlider) view.findViewById(2131362831));
        this.G = new g0(this, 4);
        this.f1751y = view;
        this.f1752z = (ImageView) view.findViewById(2131362826);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131362828);
        this.A = progressBar;
        this.B = (TextView) view.findViewById(2131362827);
        this.C = (RelativeLayout) view.findViewById(2131362830);
        CheckBox checkBox = (CheckBox) view.findViewById(2131362812);
        this.D = checkBox;
        Context context = q0Var.O;
        Drawable drawableF0 = p30.f.f0(context, 2131231542);
        if (f50.c.O(context)) {
            drawableF0.setTint(context.getColor(2131100616));
        }
        checkBox.setButtonDrawable(drawableF0);
        f50.c.X(context, progressBar);
        this.E = f50.c.C(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(2131166090, typedValue, true);
        this.F = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean s(o9.b0 b0Var) {
        if (b0Var.g()) {
            return true;
        }
        o9.x xVarA = this.H.f1762j.J.a();
        if (xVarA == null) {
            return false;
        }
        o9.o oVar = (o9.o) xVarA.f11892x.get(b0Var.f11739c);
        return (oVar != null ? oVar.f11838b : 4) == 3;
    }

    public final void t(boolean z10, boolean z11) {
        CheckBox checkBox = this.D;
        checkBox.setEnabled(false);
        this.f1751y.setEnabled(false);
        checkBox.setChecked(z10);
        if (z10) {
            this.f1752z.setVisibility(4);
            this.A.setVisibility(0);
        }
        if (z11) {
            this.H.a(this.C, z10 ? this.F : 0);
        }
    }
}
