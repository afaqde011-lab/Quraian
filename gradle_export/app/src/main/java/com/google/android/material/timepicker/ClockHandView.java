package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Iterator;

class ClockHandView extends View {
    public static final int N = 0;
    public final ValueAnimator A;
    public boolean B;
    public final ArrayList C;
    public final int D;
    public final float E;
    public final Paint F;
    public final RectF G;
    public final int H;
    public float I;
    public boolean J;
    public double K;
    public int L;
    public int M;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969504);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A = valueAnimator;
        this.C = new ArrayList();
        Paint paint = new Paint();
        this.F = paint;
        this.G = new RectF();
        this.M = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17431e, 2130969504, 2131952950);
        ze.d.P(context, 2130969578, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        ze.d.Q(context, 2130969594, ag.a.f466b);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.H = resources.getDimensionPixelSize(2131166042);
        this.E = resources.getDimensionPixelSize(2131166040);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = ClockHandView.N;
                this.f4243a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i10) {
        int i11 = this.L;
        return i10 == 2 ? Math.round(i11 * 0.66f) : i11;
    }

    public final void b(float f3) {
        this.A.cancel();
        c(f3);
    }

    public final void c(float f3) {
        float f10 = f3 % 360.0f;
        this.I = f10;
        this.K = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.M);
        float fCos = (((float) Math.cos(this.K)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.K))) + height;
        float f11 = this.D;
        this.G.set(fCos - f11, fSin - f11, fCos + f11, fSin + f11);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.f4241l0 - f10) > 0.001f) {
                clockFaceView.f4241l0 = f10;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.M);
        float f3 = width;
        float f10 = iA;
        float fCos = (((float) Math.cos(this.K)) * f10) + f3;
        float f11 = height;
        float fSin = (f10 * ((float) Math.sin(this.K))) + f11;
        Paint paint = this.F;
        paint.setStrokeWidth(0.0f);
        int i10 = this.D;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.K);
        double d3 = iA - i10;
        paint.setStrokeWidth(this.H);
        canvas.drawLine(f3, f11, width + ((int) (Math.cos(this.K) * d3)), height + ((int) (d3 * dSin)), paint);
        canvas.drawCircle(f3, f11, this.E, paint);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A.isRunning()) {
            return;
        }
        b(this.I);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.J = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.J;
            if (this.B) {
                this.M = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.J;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f3 = i10;
        boolean z14 = this.I != f3;
        if (z10 && z14) {
            z12 = true;
        } else if (z14 || z11) {
            b(f3);
            z12 = true;
        }
        this.J = z13 | z12;
        return true;
    }
}
