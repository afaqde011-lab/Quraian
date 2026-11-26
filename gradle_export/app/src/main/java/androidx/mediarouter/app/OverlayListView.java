package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

final class OverlayListView extends ListView {
    public final ArrayList A;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new ArrayList();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        ArrayList arrayList = this.A;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r0 r0Var = (r0) it.next();
                BitmapDrawable bitmapDrawable = r0Var.f1792a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = r0Var.f1792a;
                Rect rect = r0Var.f1794c;
                if (r0Var.f1802k) {
                    z10 = false;
                } else {
                    float fMax = r0Var.f1801j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - r0Var.f1800i) / r0Var.f1796e)) : 0.0f;
                    Interpolator interpolator = r0Var.f1795d;
                    float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                    int i10 = (int) (r0Var.f1798g * interpolation);
                    Rect rect2 = r0Var.f1797f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float fB = w.c.b(r0Var.f1799h, 1.0f, interpolation, 1.0f);
                    r0Var.f1793b = fB;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (fB * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (r0Var.f1801j && fMax >= 1.0f) {
                        r0Var.f1802k = true;
                        l9.f0 f0Var = r0Var.l;
                        if (f0Var != null) {
                            v vVar = (v) f0Var.C;
                            vVar.f1820k0.remove((o9.b0) f0Var.B);
                            vVar.f1816g0.notifyDataSetChanged();
                        }
                    }
                    z10 = !r0Var.f1802k;
                }
                if (!z10) {
                    it.remove();
                }
            }
        }
    }
}
