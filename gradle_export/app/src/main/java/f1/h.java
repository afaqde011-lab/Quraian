package f1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import i2.t;

public final class h extends RippleDrawable {
    public final boolean A;
    public t B;
    public Integer C;
    public boolean D;

    public h(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.A = z10;
    }

    @Override
    public final Rect getDirtyBounds() {
        if (!this.A) {
            this.D = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.D = false;
        return dirtyBounds;
    }

    @Override
    public final boolean isProjected() {
        return this.D;
    }
}
