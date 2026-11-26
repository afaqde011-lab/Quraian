package ua;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public final class b extends Animatable2.AnimationCallback {

    public final hg.a f15175a;

    public b(hg.a aVar) {
        this.f15175a = aVar;
    }

    @Override
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f15175a.f7058b.O;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override
    public final void onAnimationStart(Drawable drawable) {
        this.f15175a.a(drawable);
    }
}
