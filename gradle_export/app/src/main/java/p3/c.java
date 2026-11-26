package p3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.m;

public final class c implements LeadingMarginSpan {
    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = n3.j.f11053a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fT = w00.a.t(layout, lineForOffset, paint) + w00.a.s(layout, lineForOffset, paint);
            if (fT == 0.0f) {
                return;
            }
            m.b(canvas);
            canvas.translate(fT, 0.0f);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
