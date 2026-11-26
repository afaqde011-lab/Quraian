package hg;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class a {

    public ua.b f7057a;

    public final c f7058b;

    public a(c cVar) {
        this.f7058b = cVar;
    }

    public final void a(Drawable drawable) {
        c cVar = this.f7058b;
        ColorStateList colorStateList = cVar.O;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.S, colorStateList.getDefaultColor()));
        }
    }
}
