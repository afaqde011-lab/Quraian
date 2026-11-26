package ua;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class n extends Drawable.ConstantState {

    public final Drawable.ConstantState f15229a;

    public n(Drawable.ConstantState constantState) {
        this.f15229a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f15229a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f15229a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.A = (VectorDrawable) this.f15229a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.A = (VectorDrawable) this.f15229a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.A = (VectorDrawable) this.f15229a.newDrawable(resources, theme);
        return oVar;
    }
}
