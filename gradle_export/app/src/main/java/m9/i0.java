package m9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

public final class i0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    public final float f10691a;

    public final float f10692b;

    public final float f10693c;

    public final float f10694d;

    public final float f10695e;

    public final TextPaint f10696f;

    public final Paint f10697g;

    public final Paint f10698h;

    public CharSequence f10699i;

    public Layout.Alignment f10700j;

    public Bitmap f10701k;
    public float l;
    public int m;

    public int f10702n;

    public float f10703o;

    public int f10704p;

    public float f10705q;

    public float f10706r;

    public int f10707s;

    public int f10708t;

    public int f10709u;

    public int f10710v;

    public int f10711w;

    public float f10712x;

    public float f10713y;

    public float f10714z;

    public i0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f10695e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10694d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f10691a = fRound;
        this.f10692b = fRound;
        this.f10693c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f10696f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f10697g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f10698h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        if (!z10) {
            this.J.getClass();
            this.f10701k.getClass();
            canvas.drawBitmap(this.f10701k, (Rect) null, this.J, this.f10698h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f10709u) > 0) {
            int i10 = this.f10709u;
            Paint paint = this.f10697g;
            paint.setColor(i10);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f10711w;
        TextPaint textPaint = this.f10696f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f10691a);
            textPaint.setColor(this.f10710v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f3 = this.f10692b;
            if (i11 == 2) {
                float f10 = this.f10693c;
                textPaint.setShadowLayer(f3, f10, f10, this.f10710v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z11 = i11 == 3;
                int i12 = z11 ? -1 : this.f10710v;
                int i13 = z11 ? this.f10710v : -1;
                float f11 = f3 / 2.0f;
                textPaint.setColor(this.f10707s);
                textPaint.setStyle(Paint.Style.FILL);
                float f12 = -f11;
                textPaint.setShadowLayer(f3, f12, f12, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f3, f11, f11, i13);
            }
        }
        textPaint.setColor(this.f10707s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
