package ua;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class d extends Drawable.ConstantState {

    public final Drawable.ConstantState f15180a;

    public d(Drawable.ConstantState constantState) {
        this.f15180a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f15180a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f15180a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f15180a.newDrawable();
        eVar.A = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.F);
        return eVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f15180a.newDrawable(resources);
        eVar.A = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.F);
        return eVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f15180a.newDrawable(resources, theme);
        eVar.A = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.F);
        return eVar;
    }
}
