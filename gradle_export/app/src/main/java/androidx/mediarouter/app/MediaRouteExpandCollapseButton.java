package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

class MediaRouteExpandCollapseButton extends p.v {
    public final AnimationDrawable D;
    public final AnimationDrawable E;
    public final String F;
    public final String G;
    public boolean H;
    public View.OnClickListener I;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(2131231553);
        this.D = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(2131231552);
        this.E = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f50.c.B(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(2131886823);
        this.F = string;
        this.G = context.getString(2131886821);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new g0(this, 1));
    }

    @Override
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.I = onClickListener;
    }
}
