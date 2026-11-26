package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.media3.common.w0;
import b5.a;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.datepicker.g;
import e5.b;
import e5.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import qj.c;
import z4.d;
import z4.j0;
import z4.o;
import z4.q;
import z4.w;

public class NestedScrollView extends FrameLayout implements q {

    public static final float f578f0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    public static final g f579g0 = new g(3);

    public static final int[] f580h0 = {R.attr.fillViewport};
    public final float A;
    public long B;
    public final Rect C;
    public final OverScroller D;
    public final EdgeEffect E;
    public final EdgeEffect F;
    public w G;
    public int H;
    public boolean I;
    public boolean J;
    public View K;
    public boolean L;
    public VelocityTracker M;
    public boolean N;
    public boolean O;
    public final int P;
    public final int Q;
    public final int R;
    public int S;
    public final int[] T;
    public final int[] U;
    public int V;
    public int W;

    public e f581a0;

    public final w0 f582b0;

    public final o f583c0;

    public float f584d0;

    public final d f585e0;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969632);
        this.C = new Rect();
        this.I = true;
        this.J = false;
        this.K = null;
        this.L = false;
        this.O = true;
        this.S = -1;
        this.T = new int[2];
        this.U = new int[2];
        this.f585e0 = new d(getContext(), new c(this, 20));
        this.E = b.a(context, attributeSet);
        this.F = b.a(context, attributeSet);
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.D = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.P = viewConfiguration.getScaledTouchSlop();
        this.Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.R = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f580h0, 2130969632, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f582b0 = new w0();
        this.f583c0 = new o(this);
        setNestedScrollingEnabled(true);
        j0.g(this, f579g0);
    }

    private w getScrollFeedbackProvider() {
        if (this.G == null) {
            this.G = new w(this);
        }
        return this.G;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    public final boolean a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.C;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override
    public final void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(iArr, i13, i14);
    }

    @Override
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.D.isFinished()) {
            return;
        }
        this.D.computeScrollOffset();
        int currY = this.D.getCurrY();
        int i11 = currY - this.W;
        int height = getHeight();
        EdgeEffect edgeEffect = this.E;
        EdgeEffect edgeEffect2 = this.F;
        if (i11 <= 0 || b.b(edgeEffect) == 0.0f) {
            if (i11 < 0 && b.b(edgeEffect2) != 0.0f) {
                float f3 = height;
                iRound = Math.round(b.c(edgeEffect2, (i11 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (iRound != i11) {
                    edgeEffect2.finish();
                }
            }
            int i12 = i11;
            this.W = currY;
            iArr = this.U;
            iArr[1] = 0;
            this.f583c0.c(0, i12, 1, iArr, null);
            i10 = i12 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.D.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                this.f583c0.d(0, scrollY2, 0, i13, 1, this.T, iArr);
                i10 = i13 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.D.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.D.getCurrVelocity());
                    }
                }
                this.D.abortAnimation();
                w(1);
            }
            if (this.D.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(b.c(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect.finish();
        }
        i11 -= iRound;
        int i14 = i11;
        this.W = currY;
        iArr = this.U;
        iArr[1] = 0;
        this.f583c0.c(0, i14, 1, iArr, null);
        i10 = i14 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            a.a(this, Math.abs(this.D.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            p(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i15 = i10 - scrollY4;
            iArr[1] = 0;
            this.f583c0.d(0, scrollY4, 0, i15, 1, this.T, iArr);
            i10 = i15 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.D.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.D.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.D.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.D.getCurrVelocity());
            }
            this.D.abortAnimation();
            w(1);
        }
        if (this.D.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        n(null, i13, i14);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return this.f583c0.a(f3, f10, z10);
    }

    @Override
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return this.f583c0.b(f3, f10);
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f583c0.c(i10, i11, 0, iArr, iArr2);
    }

    @Override
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f583c0.d(i10, i11, i12, i13, 0, iArr, null);
    }

    @Override
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.E;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override
    public final boolean e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override
    public final void f(View view, View view2, int i10, int i11) {
        w0 w0Var = this.f582b0;
        if (i11 == 1) {
            w0Var.f1664b = i10;
        } else {
            w0Var.f1663a = i10;
        }
        this.f583c0.g(2, i11);
    }

    @Override
    public final void g(View view, int i10) {
        w0 w0Var = this.f582b0;
        if (i10 == 1) {
            w0Var.f1664b = 0;
        } else {
            w0Var.f1663a = 0;
        }
        w(i10);
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override
    public int getNestedScrollAxes() {
        w0 w0Var = this.f582b0;
        return w0Var.f1664b | w0Var.f1663a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f584d0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f584d0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f584d0;
    }

    @Override
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        this.f583c0.c(i10, i11, i12, iArr, null);
    }

    @Override
    public final boolean hasNestedScrollingParent() {
        return this.f583c0.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.C.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : a(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override
    public final boolean isNestedScrollingEnabled() {
        return this.f583c0.f17215d;
    }

    public final void j(int i10) {
        if (getChildCount() > 0) {
            this.D.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f583c0.g(2, 1);
            this.W = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.D.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.C;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.C;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int[] iArr, int i10, int i11) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f583c0.d(0, scrollY2, 0, i10 - scrollY2, i11, null, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.H = (int) motionEvent.getY(i10);
            this.S = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = false;
    }

    @Override
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.L) {
            if (z3.I(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (z3.I(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * axisValue)), i10, motionEvent, width, 1, z3.I(motionEvent, 8194));
                if (i10 == 0) {
                    return true;
                }
                this.f585e0.a(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.L) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.D.isFinished()) {
                        z10 = false;
                    }
                    this.L = z10;
                    velocityTracker = this.M;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.M = null;
                    }
                } else {
                    this.H = y10;
                    this.S = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.M;
                    if (velocityTracker3 == null) {
                        this.M = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.M.addMovement(motionEvent);
                    this.D.computeScrollOffset();
                    if (!v(motionEvent) && this.D.isFinished()) {
                        z10 = false;
                    }
                    this.L = z10;
                    this.f583c0.g(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z10 = false;
                }
                this.L = z10;
                velocityTracker = this.M;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.M = null;
                }
            }
        } else if (i10 == 1) {
            this.L = false;
            this.S = -1;
            velocityTracker2 = this.M;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.M = null;
            }
            if (this.D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 2) {
            int i11 = this.S;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.H) > this.P && (2 & getNestedScrollAxes()) == 0) {
                        this.L = true;
                        this.H = y11;
                        if (this.M == null) {
                            this.M = VelocityTracker.obtain();
                        }
                        this.M.addMovement(motionEvent);
                        this.V = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.L = false;
            this.S = -1;
            velocityTracker2 = this.M;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.M = null;
            }
            if (this.D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 6) {
            o(motionEvent);
        }
        return this.L;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.I = false;
        View view = this.K;
        if (view != null && l(view, this)) {
            View view2 = this.K;
            Rect rect = this.C;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.K = null;
        if (!this.J) {
            if (this.f581a0 != null) {
                scrollTo(getScrollX(), this.f581a0.A);
                this.f581a0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.J = true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.N && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        j((int) f10);
        return true;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return this.f583c0.b(f3, f10);
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f583c0.c(i10, i11, 0, iArr, null);
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(null, i13, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f581a0 = eVar;
        requestLayout();
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.A = getScrollY();
        return eVar;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.C;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.O) {
                u(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fC;
        int iRound;
        int i10;
        ViewParent parent2;
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.V);
        o oVar = this.f583c0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.E;
            EdgeEffect edgeEffect2 = this.F;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.M;
                velocityTracker.computeCurrentVelocity(1000, this.R);
                int yVelocity = (int) velocityTracker.getYVelocity(this.S);
                if (Math.abs(yVelocity) >= this.Q) {
                    if (b.b(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (b.b(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (t(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            j(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f10 = i12;
                        if (!oVar.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            j(i12);
                        }
                    }
                } else if (this.D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.S = -1;
                this.L = false;
                VelocityTracker velocityTracker2 = this.M;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.M = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.S);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.S + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.H - y10;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (b.b(edgeEffect) != 0.0f) {
                        fC = -b.c(edgeEffect, -height, x2);
                        if (b.b(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (b.b(edgeEffect2) != 0.0f) {
                        fC = b.c(edgeEffect2, height, 1.0f - x2);
                        if (b.b(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f3 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.L && Math.abs(i10) > this.P) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.L = true;
                            if (i10 > 0) {
                                i10 -= this.P;
                            } else {
                                i10 += this.P;
                            }
                        }
                        if (this.L) {
                            int iS = s(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.H = y10 - iS;
                            this.V += iS;
                        }
                    }
                    f3 = fC;
                    iRound = Math.round(f3 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i10 = i13 - iRound;
                    if (!this.L) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.L = true;
                        if (i10 > 0) {
                            i10 -= this.P;
                        } else {
                            i10 += this.P;
                        }
                    }
                    if (this.L) {
                        int iS2 = s(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.H = y10 - iS2;
                        this.V += iS2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.L && getChildCount() > 0) {
                    if (this.D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.S = -1;
                this.L = false;
                VelocityTracker velocityTracker3 = this.M;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.M = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.H = (int) motionEvent.getY(actionIndex);
                this.S = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.H = (int) motionEvent.getY(motionEvent.findPointerIndex(this.S));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.L && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.D.isFinished()) {
                this.D.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.H = y11;
            this.S = pointerId;
            oVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.M;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 <= i13) {
            if (i16 < 0) {
                i15 = 0;
            } else {
                i15 = i16;
                z11 = false;
            }
            if (z11 && !this.f583c0.f(1)) {
                this.D.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i14, i15);
            return !z10 || z11;
        }
        i15 = i13;
        z11 = true;
        if (z11) {
            this.D.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    public final void q(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.C;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            s(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (this.I) {
            this.K = view2;
        } else {
            Rect rect = this.C;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z11 = iB != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iB);
                return z11;
            }
            u(0, iB, false);
        }
        return z11;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.M) != null) {
            velocityTracker.recycle();
            this.M = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void requestLayout() {
        this.I = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        o oVar = this.f583c0;
        if (i13 == 1) {
            oVar.g(2, i13);
        }
        boolean zC = this.f583c0.c(0, i10, i13, this.U, this.T);
        int[] iArr = this.T;
        int[] iArr2 = this.U;
        if (zC) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = p(i14, 0, scrollY, scrollRange) && !oVar.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f17226a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        this.f583c0.d(0, scrollY2, 0, i14 - scrollY2, i13, this.T, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.F;
        EdgeEffect edgeEffect2 = this.E;
        if (i18 >= 0) {
            if (i18 > scrollRange && z13) {
                b.c(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
                if (motionEvent != null) {
                    z11 = false;
                    getScrollFeedbackProvider().f17226a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
                } else {
                    z11 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.M) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                w(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (z13) {
            b.c(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f17226a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z12 = z11;
        } else {
            postInvalidateOnAnimation();
            z12 = z11;
        }
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            w(i13);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i16;
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.N) {
            this.N = z10;
            requestLayout();
        }
    }

    @Override
    public void setNestedScrollingEnabled(boolean z10) {
        o oVar = this.f583c0;
        if (oVar.f17215d) {
            View view = oVar.f17214c;
            WeakHashMap weakHashMap = j0.f17198a;
            view.stopNestedScroll();
        }
        oVar.f17215d = z10;
    }

    public void setOnScrollChangeListener(e5.d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.O = z10;
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override
    public final boolean startNestedScroll(int i10) {
        return this.f583c0.g(i10, 0);
    }

    @Override
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fB = b.b(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.A * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d3 = f578f0;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f3))) < fB;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.B > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.D.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z10) {
                this.f583c0.g(2, 1);
            } else {
                w(1);
            }
            this.W = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.D.isFinished()) {
                this.D.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.B = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.E;
        if (b.b(edgeEffect) != 0.0f) {
            b.c(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.F;
        if (b.b(edgeEffect2) == 0.0f) {
            return z10;
        }
        b.c(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        this.f583c0.h(i10);
    }
}
