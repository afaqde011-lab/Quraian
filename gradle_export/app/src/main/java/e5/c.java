package e5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.google.android.gms.cast.MediaError;
import p.j1;

public final class c implements View.OnTouchListener {
    public static final int R = ViewConfiguration.getTapTimeout();
    public final a A;
    public final AccelerateInterpolator B;
    public final j1 C;
    public a50.d D;
    public final float[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final j1 Q;

    public c(j1 j1Var) {
        a aVar = new a();
        aVar.f5092e = Long.MIN_VALUE;
        aVar.f5094g = -1L;
        aVar.f5093f = 0L;
        this.A = aVar;
        this.B = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.E = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.F = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.I = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.J = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.K = fArr5;
        this.C = j1Var;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.G = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.H = R;
        aVar.f5088a = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        aVar.f5089b = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        this.Q = j1Var;
    }

    public static float b(float f3, float f10, float f11) {
        if (f3 > f11) {
            return f11;
        }
        return f3 < f10 ? f10 : f3;
    }

    public final float a(float f3, float f10, float f11, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.E[i10] * f10, 0.0f, this.F[i10]);
        float fC = c(f10 - f3, fB2) - c(f3, fB2);
        AccelerateInterpolator accelerateInterpolator = this.B;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f12 = this.I[i10];
            float f13 = this.J[i10];
            float f14 = this.K[i10];
            float f15 = f12 * f11;
            return fB > 0.0f ? b(fB * f15, f13, f14) : -b((-fB) * f15, f13, f14);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f16 = this.I[i10];
        float f17 = this.J[i10];
        float f18 = this.K[i10];
        float f19 = f16 * f11;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f3, float f10) {
        if (f10 != 0.0f) {
            int i10 = this.G;
            if (i10 == 0 || i10 == 1) {
                if (f3 < f10) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f10);
                    }
                    if (this.O && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f3 < 0.0f) {
                return f3 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.M) {
            this.O = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.A;
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f5092e);
        int i12 = aVar.f5089b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f5096i = i10;
        aVar.f5095h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f5094g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        j1 j1Var;
        int count;
        a aVar = this.A;
        float f3 = aVar.f5091d;
        int iAbs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f5090c);
        if (iAbs != 0 && (count = (j1Var = this.Q).getCount()) != 0) {
            int childCount = j1Var.getChildCount();
            int firstVisiblePosition = j1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && j1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && j1Var.getChildAt(childCount - 1).getBottom() <= j1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: e5.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
