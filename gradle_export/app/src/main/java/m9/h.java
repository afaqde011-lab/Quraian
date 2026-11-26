package m9;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.media3.common.f1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public final class h extends View implements k0 {
    public final Rect A;
    public final Rect B;
    public final Rect C;
    public final Rect D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Drawable K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final StringBuilder U;
    public final Formatter V;
    public final f W;

    public final CopyOnWriteArraySet f10668a0;

    public final Point f10669b0;

    public final float f10670c0;

    public int f10671d0;

    public long f10672e0;

    public int f10673f0;

    public Rect f10674g0;

    public final ValueAnimator f10675h0;

    public float f10676i0;

    public boolean f10677j0;

    public boolean f10678k0;

    public long f10679l0;

    public long f10680m0;

    public long f10681n0;

    public long f10682o0;

    public int f10683p0;

    public long[] f10684q0;

    public boolean[] f10685r0;

    public h(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        Paint paint = new Paint();
        this.E = paint;
        Paint paint2 = new Paint();
        this.F = paint2;
        Paint paint3 = new Paint();
        this.G = paint3;
        Paint paint4 = new Paint();
        this.H = paint4;
        Paint paint5 = new Paint();
        this.I = paint5;
        Paint paint6 = new Paint();
        this.J = paint6;
        paint6.setAntiAlias(true);
        this.f10668a0 = new CopyOnWriteArraySet();
        this.f10669b0 = new Point();
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f10670c0 = f3;
        this.T = a(f3, -50);
        int iA = a(f3, 4);
        int iA2 = a(f3, 26);
        int iA3 = a(f3, 4);
        int iA4 = a(f3, 12);
        int iA5 = a(f3, 0);
        int iA6 = a(f3, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e0.f10655b, 0, 2131951955);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.K = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.N = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i12 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i13 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i14 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i15 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.L = iA;
            this.M = iA2;
            this.N = 0;
            this.O = iA3;
            this.P = iA4;
            this.Q = iA5;
            this.R = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.K = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.U = sb2;
        this.V = new Formatter(sb2, Locale.getDefault());
        this.W = new f(this, 0);
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            this.S = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.S = (Math.max(this.Q, Math.max(this.P, this.R)) + 1) / 2;
        }
        this.f10676i0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f10675h0 = valueAnimator;
        valueAnimator.addUpdateListener(new g(this, 0));
        this.f10680m0 = -9223372036854775807L;
        this.f10672e0 = -9223372036854775807L;
        this.f10671d0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f3, int i10) {
        return (int) ((i10 * f3) + 0.5f);
    }

    private long getPositionIncrement() {
        long j9 = this.f10672e0;
        if (j9 != -9223372036854775807L) {
            return j9;
        }
        long j10 = this.f10680m0;
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10 / ((long) this.f10671d0);
    }

    private String getProgressText() {
        return e7.i0.y(this.U, this.V, this.f10681n0);
    }

    private long getScrubberPosition() {
        Rect rect = this.B;
        if (rect.width() <= 0 || this.f10680m0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.D.width()) * this.f10680m0) / ((long) rect.width());
    }

    public final boolean b(long j9) {
        long j10 = this.f10680m0;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.f10678k0 ? this.f10679l0 : this.f10681n0;
        long jI = e7.i0.i(j11 + j9, 0L, j10);
        if (jI == j11) {
            return false;
        }
        if (this.f10678k0) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j9) {
        this.f10679l0 = j9;
        this.f10678k0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f10668a0.iterator();
        while (it.hasNext()) {
            u uVar = ((j) it.next()).A;
            uVar.W0 = true;
            TextView textView = uVar.f10756n0;
            if (textView != null) {
                textView.setText(e7.i0.y(uVar.f10758p0, uVar.f10759q0, j9));
            }
            uVar.A.f();
            f1 f1Var = uVar.Q0;
            if (f1Var != null && uVar.Y0) {
                if (uVar.i(f1Var)) {
                    try {
                        Method method = uVar.F;
                        method.getClass();
                        method.invoke(uVar.Q0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e3) {
                        throw new RuntimeException(e3);
                    }
                } else if (uVar.h(uVar.Q0)) {
                    try {
                        Method method2 = uVar.I;
                        method2.getClass();
                        method2.invoke(uVar.Q0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    f1 f1Var2 = uVar.Q0;
                    f1Var2.getClass();
                    sb2.append(f1Var2.getClass());
                    e7.a.m("PlayerControlView", sb2.toString());
                }
            }
            if (uVar.k(uVar.Q0)) {
                u.a(uVar, uVar.Q0, j9);
            }
        }
    }

    public final void d(boolean z10) {
        removeCallbacks(this.W);
        this.f10678k0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (j jVar : this.f10668a0) {
            long j9 = this.f10679l0;
            u uVar = jVar.A;
            uVar.W0 = false;
            f1 f1Var = uVar.Q0;
            if (f1Var != null) {
                if (!z10) {
                    u.a(uVar, f1Var, j9);
                }
                if (uVar.i(uVar.Q0)) {
                    try {
                        Method method = uVar.F;
                        method.getClass();
                        method.invoke(uVar.Q0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e3) {
                        throw new RuntimeException(e3);
                    }
                } else if (uVar.h(uVar.Q0)) {
                    try {
                        Method method2 = uVar.I;
                        method2.getClass();
                        method2.invoke(uVar.Q0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    continue;
                }
            }
            uVar.A.g();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.C;
        Rect rect2 = this.B;
        rect.set(rect2);
        Rect rect3 = this.D;
        rect3.set(rect2);
        long j9 = this.f10678k0 ? this.f10679l0 : this.f10681n0;
        if (this.f10680m0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f10682o0) / this.f10680m0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j9) / this.f10680m0)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.A);
    }

    public final void f(long j9) {
        if (this.f10679l0 == j9) {
            return;
        }
        this.f10679l0 = j9;
        Iterator it = this.f10668a0.iterator();
        while (it.hasNext()) {
            u uVar = ((j) it.next()).A;
            TextView textView = uVar.f10756n0;
            if (textView != null) {
                textView.setText(e7.i0.y(uVar.f10758p0, uVar.f10759q0, j9));
            }
            if (uVar.k(uVar.Q0)) {
                u.a(uVar, uVar.Q0, j9);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.B.width() / this.f10670c0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j9 = this.f10680m0;
        if (j9 == 0 || j9 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j9 / ((long) iWidth);
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        canvas.save();
        Rect rect = this.B;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i11 = iCenterY + iHeight;
        long j9 = this.f10680m0;
        Paint paint = this.G;
        Rect rect2 = this.D;
        if (j9 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i11, paint);
        } else {
            Rect rect3 = this.C;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (iMax < i14) {
                canvas.drawRect(iMax, iCenterY, i14, i11, paint);
            }
            int iMax2 = Math.max(i12, rect2.right);
            if (i13 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i13, i11, this.F);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i11, this.E);
            }
            if (this.f10683p0 != 0) {
                long[] jArr = this.f10684q0;
                jArr.getClass();
                boolean[] zArr = this.f10685r0;
                zArr.getClass();
                int i15 = this.O;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f10683p0) {
                    int iMin = Math.min(rect.width() - i15, Math.max(i17, ((int) ((((long) rect.width()) * e7.i0.i(jArr[i18], 0L, this.f10680m0)) / this.f10680m0)) - i16)) + rect.left;
                    int i19 = i18;
                    canvas.drawRect(iMin, iCenterY, iMin + i15, i11, zArr[i18] ? this.I : this.H);
                    i18 = i19 + 1;
                    i17 = i17;
                }
            }
            canvas2 = canvas;
        }
        if (this.f10680m0 > 0) {
            int iH = e7.i0.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.K;
            if (drawable == null) {
                if (this.f10678k0 || isFocused()) {
                    i10 = this.R;
                } else {
                    i10 = isEnabled() ? this.P : this.Q;
                }
                canvas2.drawCircle(iH, iCenterY2, (int) ((i10 * this.f10676i0) / 2.0f), this.J);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f10676i0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f10676i0)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f10678k0 || z10) {
            return;
        }
        d(false);
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f10680m0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            f fVar = this.W;
                            removeCallbacks(fVar);
                            postDelayed(fVar, 1000L);
                            return true;
                        }
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        if (b(positionIncrement)) {
                            f fVar2 = this.W;
                            removeCallbacks(fVar2);
                            postDelayed(fVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f10678k0) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f10678k0) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int paddingBottom2;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f10677j0 ? 0 : this.S;
        int i17 = this.N;
        int i18 = this.L;
        int i19 = this.M;
        if (i17 == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - i19;
            paddingBottom2 = ((i15 - getPaddingBottom()) - i18) - Math.max(i16 - (i18 / 2), 0);
        } else {
            paddingBottom = (i15 - i19) / 2;
            paddingBottom2 = (i15 - i18) / 2;
        }
        Rect rect = this.A;
        rect.set(paddingLeft, paddingBottom, paddingRight, i19 + paddingBottom);
        this.B.set(rect.left + i16, paddingBottom2, rect.right - i16, i18 + paddingBottom2);
        Rect rect2 = this.f10674g0;
        if (rect2 == null || rect2.width() != i14 || this.f10674g0.height() != i15) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f10674g0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.M;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.K;
        if (drawable == null || !drawable.setLayoutDirection(i10)) {
            return;
        }
        invalidate();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f10680m0 > 0) {
            int x2 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            Point point = this.f10669b0;
            point.set(x2, y10);
            int i10 = point.x;
            int i11 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.B;
            Rect rect2 = this.D;
            if (action == 0) {
                int i12 = i10;
                if (this.A.contains(i12, i11)) {
                    rect2.right = e7.i0.h(i12, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f10678k0) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f10678k0) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f10678k0) {
                if (i11 < this.T) {
                    int i13 = this.f10673f0;
                    rect2.right = e7.i0.h(((i10 - i13) / 3) + i13, rect.left, rect.right);
                } else {
                    this.f10673f0 = i10;
                    rect2.right = e7.i0.h(i10, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f10680m0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.H.setColor(i10);
        invalidate(this.A);
    }

    public void setBufferedColor(int i10) {
        this.F.setColor(i10);
        invalidate(this.A);
    }

    public void setBufferedPosition(long j9) {
        if (this.f10682o0 == j9) {
            return;
        }
        this.f10682o0 = j9;
        e();
    }

    public void setDuration(long j9) {
        if (this.f10680m0 == j9) {
            return;
        }
        this.f10680m0 = j9;
        if (this.f10678k0 && j9 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f10678k0 || z10) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i10) {
        ta.c0.s(i10 > 0);
        this.f10671d0 = i10;
        this.f10672e0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j9) {
        ta.c0.s(j9 > 0);
        this.f10671d0 = -1;
        this.f10672e0 = j9;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.I.setColor(i10);
        invalidate(this.A);
    }

    public void setPlayedColor(int i10) {
        this.E.setColor(i10);
        invalidate(this.A);
    }

    public void setPosition(long j9) {
        if (this.f10681n0 == j9) {
            return;
        }
        this.f10681n0 = j9;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.J.setColor(i10);
        invalidate(this.A);
    }

    public void setUnplayedColor(int i10) {
        this.G.setColor(i10);
        invalidate(this.A);
    }
}
