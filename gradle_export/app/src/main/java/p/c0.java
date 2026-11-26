package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class c0 extends SeekBar {
    public final d0 A;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969748);
        i2.a(this, getContext());
        d0 d0Var = new d0(this);
        this.A = d0Var;
        d0Var.e(attributeSet, 2130969748);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.A;
        c0 c0Var = d0Var.f12140e;
        Drawable drawable = d0Var.f12141f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0Var.getDrawableState())) {
            c0Var.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A.f12141f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A.j(canvas);
    }
}
