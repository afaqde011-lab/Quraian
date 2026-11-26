package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class a extends Drawable {

    public final ActionBarContainer f12138a;

    public a(ActionBarContainer actionBarContainer) {
        this.f12138a = actionBarContainer;
    }

    @Override
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f12138a;
        if (actionBarContainer.G) {
            Drawable drawable = actionBarContainer.F;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.D;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.E;
        if (drawable3 == null || !actionBarContainer.H) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f12138a;
        if (actionBarContainer.G) {
            if (actionBarContainer.F != null) {
                actionBarContainer.D.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.D;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
