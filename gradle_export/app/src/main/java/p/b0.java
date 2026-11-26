package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class b0 extends RatingBar {
    public final z A;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969706);
        i2.a(this, getContext());
        z zVar = new z(this);
        this.A = zVar;
        zVar.e(attributeSet, 2130969706);
    }

    @Override
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.A.f12230c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
