package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;

class MediaRouteVolumeSlider extends p.c0 {
    public final float B;
    public boolean C;
    public Drawable D;
    public int E;
    public int F;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = f50.c.C(context);
    }

    public final void a(int i10, int i11) {
        if (this.E != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.E = i10;
        }
        if (this.F != i11) {
            if (Color.alpha(i11) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i11));
            }
            this.F = i11;
        }
    }

    public final void b(boolean z10) {
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        super.setThumb(z10 ? null : this.D);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i10 = isEnabled() ? 255 : (int) (this.B * 255.0f);
        Drawable drawable = this.D;
        int i11 = this.E;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i11, mode);
        this.D.setAlpha(i10);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.F, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.E, mode);
        progressDrawable.setAlpha(i10);
    }

    @Override
    public final void setThumb(Drawable drawable) {
        this.D = drawable;
        if (this.C) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
