package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import ba.f1;

public abstract class h0 extends f1 {

    public o9.b0 f1734u;

    public final ImageButton f1735v;

    public final MediaRouteVolumeSlider f1736w;

    public final q0 f1737x;

    public h0(q0 q0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int color;
        int color2;
        super(view);
        this.f1737x = q0Var;
        this.f1735v = imageButton;
        this.f1736w = mediaRouteVolumeSlider;
        Context context = q0Var.O;
        Drawable drawableF0 = p30.f.f0(context, 2131231544);
        if (f50.c.O(context)) {
            drawableF0.setTint(context.getColor(2131100616));
        }
        imageButton.setImageDrawable(drawableF0);
        if (f50.c.O(context)) {
            color = context.getColor(2131100608);
            color2 = context.getColor(2131100606);
        } else {
            color = context.getColor(2131100607);
            color2 = context.getColor(2131100605);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void q(o9.b0 b0Var) {
        this.f1734u = b0Var;
        int i10 = b0Var.f11750p;
        boolean z10 = i10 == 0;
        ImageButton imageButton = this.f1735v;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new g0(this, 0));
        o9.b0 b0Var2 = this.f1734u;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f1736w;
        mediaRouteVolumeSlider.setTag(b0Var2);
        mediaRouteVolumeSlider.setMax(b0Var.f11751q);
        mediaRouteVolumeSlider.setProgress(i10);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.f1737x.V);
    }

    public final void r(boolean z10) {
        ImageButton imageButton = this.f1735v;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        q0 q0Var = this.f1737x;
        if (z10) {
            q0Var.Y.put(this.f1734u.f11739c, Integer.valueOf(this.f1736w.getProgress()));
        } else {
            q0Var.Y.remove(this.f1734u.f11739c);
        }
    }
}
