package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.w0;
import ba.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k4.a;
import l4.b;
import l4.d;
import l4.e;
import l4.f;
import l4.g;
import u.s0;
import y4.c;
import z4.d0;
import z4.j0;
import z4.j1;
import z4.p;
import z4.q;

public class CoordinatorLayout extends ViewGroup implements p, q {
    public static final String T;
    public static final Class[] U;
    public static final ThreadLocal V;
    public static final m W;

    public static final c f560a0;
    public final ArrayList A;
    public final oj.q B;
    public final ArrayList C;
    public final ArrayList D;
    public final int[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final int[] I;
    public View J;
    public View K;
    public e L;
    public boolean M;
    public j1 N;
    public boolean O;
    public Drawable P;
    public ViewGroup.OnHierarchyChangeListener Q;
    public gi.c R;
    public final w0 S;

    static {
        Package r4 = CoordinatorLayout.class.getPackage();
        T = r4 != null ? r4.getName() : null;
        W = new m(9);
        U = new Class[]{Context.class, AttributeSet.class};
        V = new ThreadLocal();
        f560a0 = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968997);
        this.A = new ArrayList();
        this.B = new oj.q(24);
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new int[2];
        this.F = new int[2];
        this.S = new w0();
        int[] iArr = a.f8964a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130968997, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 2130968997, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.I = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.I;
                iArr2[i10] = (int) (iArr2[i10] * f3);
            }
        }
        this.P = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new l4.c(this));
        WeakHashMap weakHashMap = j0.f17198a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f560a0.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i10, Rect rect, Rect rect2, d dVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = dVar.f10019c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = dVar.f10020d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f10018b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    l4.a aVar = (l4.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    l4.a aVar2 = dVar.f10017a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.i();
                        }
                        dVar.f10017a = aVar;
                        dVar.f10018b = true;
                        if (aVar != null) {
                            aVar.g(dVar);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            dVar.f10018b = true;
        }
        return dVar;
    }

    public static void u(View view, int i10) {
        d dVar = (d) view.getLayoutParams();
        int i11 = dVar.f10025i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = j0.f17198a;
            view.offsetLeftAndRight(i10 - i11);
            dVar.f10025i = i10;
        }
    }

    public static void v(View view, int i10) {
        d dVar = (d) view.getLayoutParams();
        int i11 = dVar.f10026j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = j0.f17198a;
            view.offsetTopAndBottom(i10 - i11);
            dVar.f10026j = i10;
        }
    }

    public final void b(d dVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    @Override
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        l4.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i14) && (aVar = dVar.f10017a) != null) {
                    int[] iArr2 = this.E;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.o(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            p(1);
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        c(view, i10, i11, i12, i13, 0, this.F);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        l4.a aVar = ((d) view.getLayoutParams()).f10017a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override
    public final boolean e(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                l4.a aVar = dVar.f10017a;
                if (aVar != null) {
                    boolean zS = aVar.s(childAt, i10, i11);
                    z10 |= zS;
                    if (i11 == 0) {
                        dVar.m = zS;
                    } else if (i11 == 1) {
                        dVar.f10028n = zS;
                    }
                } else if (i11 == 0) {
                    dVar.m = false;
                } else if (i11 == 1) {
                    dVar.f10028n = false;
                }
            }
        }
        return z10;
    }

    @Override
    public final void f(View view, View view2, int i10, int i11) {
        w0 w0Var = this.S;
        if (i11 == 1) {
            w0Var.f1664b = i10;
        } else {
            w0Var.f1663a = i10;
        }
        this.K = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override
    public final void g(View view, int i10) {
        w0 w0Var = this.S;
        if (i10 == 1) {
            w0Var.f1664b = 0;
        } else {
            w0Var.f1663a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i10)) {
                l4.a aVar = dVar.f10017a;
                if (aVar != null) {
                    aVar.t(childAt, view, i10);
                }
                if (i10 == 0) {
                    dVar.m = false;
                } else if (i10 == 1) {
                    dVar.f10028n = false;
                }
            }
        }
        this.K = null;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.A);
    }

    public final j1 getLastWindowInsets() {
        return this.N;
    }

    @Override
    public int getNestedScrollAxes() {
        w0 w0Var = this.S;
        return w0Var.f1664b | w0Var.f1663a;
    }

    public Drawable getStatusBarBackground() {
        return this.P;
    }

    @Override
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        l4.a aVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i12) && (aVar = dVar.f10017a) != null) {
                    int[] iArr2 = this.E;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.n(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            p(1);
        }
    }

    public final void i(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        s0 s0Var = (s0) this.B.C;
        int i10 = s0Var.C;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) s0Var.j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(s0Var.g(i11));
            }
        }
        ArrayList arrayList3 = this.D;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f10030a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f10030a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f10031b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i10) {
        int[] iArr = this.I;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i10, int i11) {
        c cVar = f560a0;
        Rect rectA = a();
        k(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            cVar.c(rectA);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.M) {
            if (this.L == null) {
                this.L = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.L);
        }
        if (this.N == null) {
            WeakHashMap weakHashMap = j0.f17198a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.H = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.M && this.L != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.L);
        }
        View view = this.K;
        if (view != null) {
            g(view, 0);
        }
        this.H = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.O || this.P == null) {
            return;
        }
        j1 j1Var = this.N;
        int iD = j1Var != null ? j1Var.d() : 0;
        if (iD > 0) {
            this.P.setBounds(0, 0, getWidth(), iD);
            this.P.draw(canvas);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        l4.a aVar;
        WeakHashMap weakHashMap = j0.f17198a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f10017a) == null || !aVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        l4.a aVar;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        ArrayList arrayList;
        int i19;
        View view;
        int i20;
        boolean zL;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i21 = 0;
        loop0: while (true) {
            if (i21 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i21);
            s0 s0Var = (s0) coordinatorLayout.B.C;
            int i22 = s0Var.C;
            for (int i23 = 0; i23 < i22; i23++) {
                ArrayList arrayList2 = (ArrayList) s0Var.j(i23);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z10 = true;
                    break loop0;
                }
            }
            i21++;
        }
        if (z10 != coordinatorLayout.M) {
            if (z10) {
                if (coordinatorLayout.H) {
                    if (coordinatorLayout.L == null) {
                        coordinatorLayout.L = new e(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.L);
                }
                coordinatorLayout.M = true;
            } else {
                if (coordinatorLayout.H && coordinatorLayout.L != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.L);
                }
                coordinatorLayout.M = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = j0.f17198a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z13 = coordinatorLayout.N != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.A;
        int size3 = arrayList3.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) arrayList3.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i13 = size3;
                i20 = i26;
                i15 = paddingLeft;
                suggestedMinimumWidth = i27;
                z11 = false;
                i17 = paddingRight;
            } else {
                d dVar = (d) view2.getLayoutParams();
                int i28 = dVar.f10021e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i28);
                    int i29 = dVar.f10019c;
                    if (i29 == 0) {
                        i29 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, layoutDirection) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z12) && !(absoluteGravity == 5 && z12)) {
                        if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z13 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iC = coordinatorLayout.N.c() + coordinatorLayout.N.b();
                            int iA = coordinatorLayout.N.a() + coordinatorLayout.N.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        aVar = dVar.f10017a;
                        if (aVar != null) {
                            z11 = false;
                            i15 = paddingLeft;
                            i16 = i27;
                            i17 = paddingRight;
                            i18 = i12;
                            arrayList = arrayList3;
                            int i30 = iMakeMeasureSpec;
                            i20 = i26;
                            int i31 = iMakeMeasureSpec2;
                            zL = aVar.l(this, view2, i30, i14, i31);
                            view = view2;
                            iMakeMeasureSpec = i30;
                            i19 = i31;
                            if (zL) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int iMax3 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i15 = paddingLeft;
                            i16 = i27;
                            z11 = false;
                            i17 = paddingRight;
                            i18 = i12;
                            arrayList = arrayList3;
                            i19 = iMakeMeasureSpec2;
                            view = view2;
                            i20 = i26;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i14, i19, 0);
                        int iMax4 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax5 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i32 = size3;
                    i14 = iMax;
                    i13 = i32;
                    if (z13) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    aVar = dVar.f10017a;
                    if (aVar != null) {
                        z11 = false;
                        i15 = paddingLeft;
                        i16 = i27;
                        i17 = paddingRight;
                        i18 = i12;
                        arrayList = arrayList3;
                        int i33 = iMakeMeasureSpec;
                        i20 = i26;
                        int i34 = iMakeMeasureSpec2;
                        zL = aVar.l(this, view2, i33, i14, i34);
                        view = view2;
                        iMakeMeasureSpec = i33;
                        i19 = i34;
                        if (zL) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax7 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i15 = paddingLeft;
                        i16 = i27;
                        z11 = false;
                        i17 = paddingRight;
                        i18 = i12;
                        arrayList = arrayList3;
                        i19 = iMakeMeasureSpec2;
                        view = view2;
                        i20 = i26;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i14, i19, 0);
                    int iMax8 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax9 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i13 = size3;
                i14 = 0;
                if (z13) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                aVar = dVar.f10017a;
                if (aVar != null) {
                    z11 = false;
                    i15 = paddingLeft;
                    i16 = i27;
                    i17 = paddingRight;
                    i18 = i12;
                    arrayList = arrayList3;
                    int i35 = iMakeMeasureSpec;
                    i20 = i26;
                    int i36 = iMakeMeasureSpec2;
                    zL = aVar.l(this, view2, i35, i14, i36);
                    view = view2;
                    iMakeMeasureSpec = i35;
                    i19 = i36;
                    if (zL) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax11 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i15 = paddingLeft;
                    i16 = i27;
                    z11 = false;
                    i17 = paddingRight;
                    i18 = i12;
                    arrayList = arrayList3;
                    i19 = iMakeMeasureSpec2;
                    view = view2;
                    i20 = i26;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i14, i19, 0);
                int iMax12 = Math.max(i16, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int iMax13 = Math.max(i18, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i26 = i20 + 1;
            paddingLeft = i15;
            paddingRight = i17;
            size3 = i13;
            arrayList3 = arrayList;
        }
        int i37 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i37), View.resolveSizeAndState(suggestedMinimumHeight, i11, i37 << 16));
    }

    @Override
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    l4.a aVar = dVar.f10017a;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        l4.a aVar;
        int childCount = getChildCount();
        boolean zM = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f10017a) != null) {
                    zM |= aVar.m(view);
                }
            }
        }
        return zM;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        h(view, i10, i11, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(view, i10, i11, i12, i13, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.A);
        SparseArray sparseArray = fVar.C;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            l4.a aVar = n(childAt).f10017a;
            if (id2 != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                aVar.q(childAt, parcelable2);
            }
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            l4.a aVar = ((d) childAt.getLayoutParams()).f10017a;
            if (id2 != -1 && aVar != null && (parcelableR = aVar.r(childAt)) != null) {
                sparseArray.append(id2, parcelableR);
            }
        }
        fVar.C = sparseArray;
        return fVar;
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
        boolean zR;
        boolean zU;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.J == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zU = false;
            }
            motionEventObtain = null;
            if (this.J == null) {
                zU |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zU;
            }
            t(false);
            return zU;
        }
        zR = false;
        l4.a aVar = ((d) this.J.getLayoutParams()).f10017a;
        if (aVar != null) {
            zU = aVar.u(this.J, motionEvent);
        } else {
            zU = false;
        }
        motionEventObtain = null;
        if (this.J == null) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        t(false);
        return zU;
    }

    public final void p(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        d dVar;
        int i19;
        View view;
        l4.a aVar;
        WeakHashMap weakHashMap = j0.f17198a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.A;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i20 = 0;
        while (true) {
            c cVar = f560a0;
            if (i20 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                cVar.c(rectA);
                rectA2.setEmpty();
                cVar.c(rectA2);
                rect2.setEmpty();
                cVar.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i20);
            d dVar2 = (d) view2.getLayoutParams();
            if (i10 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i12 = size;
                rect = rectA3;
                i11 = i20;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (dVar2.l == ((View) arrayList2.get(i21))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.f10027k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            d dVar4 = dVar2;
                            Rect rectA6 = a();
                            k(dVar3.f10027k, rectA4);
                            i(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            dVar = dVar4;
                            i19 = i21;
                            layoutDirection = layoutDirection;
                            view = view3;
                            l(layoutDirection, rectA4, rectA6, dVar3, measuredWidth, measuredHeight);
                            boolean z12 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(dVar3, rectA6, measuredWidth, measuredHeight);
                            int i22 = rectA6.left - rectA5.left;
                            int i23 = rectA6.top - rectA5.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = j0.f17198a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = j0.f17198a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z12 && (aVar = dVar3.f10017a) != null) {
                                aVar.h(this, view, dVar3.f10027k);
                            }
                            rectA4.setEmpty();
                            cVar.c(rectA4);
                            rectA5.setEmpty();
                            cVar.c(rectA5);
                            rectA6.setEmpty();
                            cVar.c(rectA6);
                        } else {
                            dVar = dVar2;
                            i19 = i21;
                            view = view2;
                        }
                    } else {
                        dVar = dVar2;
                        i19 = i21;
                        view = view2;
                    }
                    i21 = i19 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i20 = i20;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                d dVar5 = dVar2;
                int i24 = size;
                Rect rect3 = rectA3;
                i11 = i20;
                View view4 = view2;
                i(view4, rectA2, true);
                if (dVar5.f10023g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.f10023g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i25 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i26 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (dVar5.f10024h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = j0.f17198a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        d dVar6 = (d) view4.getLayoutParams();
                        l4.a aVar2 = dVar6.f10017a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (aVar2 == null || !aVar2.e(view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        cVar.c(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            cVar.c(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.f10024h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (rectA7.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.f10026j) >= (i18 = rectA.top)) {
                                z10 = false;
                            } else {
                                v(view4, i18 - i17);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.f10026j) < (i16 = rectA.bottom)) {
                                v(view4, height - i16);
                                z10 = true;
                            }
                            if (!z10) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (rectA7.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.f10025i) >= (i15 = rectA.left)) {
                                z11 = false;
                            } else {
                                u(view4, i15 - i14);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.f10025i) < (i13 = rectA.right)) {
                                u(view4, width - i13);
                                z11 = true;
                            }
                            if (!z11) {
                                u(view4, 0);
                            }
                            rectA7.setEmpty();
                            cVar.c(rectA7);
                        }
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((d) view4.getLayoutParams()).f10029o);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i12 = i24;
                    } else {
                        ((d) view4.getLayoutParams()).f10029o.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i27 = i11 + 1;
                i12 = i24;
                while (true) {
                    arrayList = arrayList3;
                    if (i27 < i12) {
                        View view5 = (View) arrayList.get(i27);
                        l4.a aVar3 = ((d) view5.getLayoutParams()).f10017a;
                        if (aVar3 != null) {
                            aVar3.f(view5);
                        }
                        i27++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i20 = i11 + 1;
            size = i12;
            rectA3 = rect;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i10) {
        int i11;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f10027k;
        if (view2 == null && dVar.f10022f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f560a0;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                k(view2, rectA);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i10, rectA, rectA2, dVar2, measuredWidth, measuredHeight);
                b(dVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                cVar.c(rectA);
                rectA2.setEmpty();
                cVar.c(rectA2);
            }
        }
        int i12 = dVar.f10021e;
        if (i12 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.N != null) {
                WeakHashMap weakHashMap = j0.f17198a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.N.b() + rectA3.left;
                    rectA3.top = this.N.d() + rectA3.top;
                    rectA3.right -= this.N.c();
                    rectA3.bottom -= this.N.a();
                }
            }
            Rect rectA4 = a();
            int i13 = dVar3.f10019c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i10);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            cVar.c(rectA3);
            rectA4.setEmpty();
            cVar.c(rectA4);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i14 = dVar4.f10019c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iM = m(i12) - measuredWidth2;
        if (i15 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iM += measuredWidth2;
        }
        if (i16 != 16) {
            i11 = i16 != 80 ? 0 : measuredHeight2;
        } else {
            i11 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.C;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        m mVar = W;
        if (mVar != null) {
            Collections.sort(arrayList, mVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zJ = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            l4.a aVar = ((d) view.getLayoutParams()).f10017a;
            if (zJ && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        aVar.j(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        aVar.u(view, motionEventObtain);
                    }
                }
            } else if (!zJ && aVar != null) {
                if (i10 == 0) {
                    zJ = aVar.j(this, view, motionEvent);
                } else if (i10 == 1) {
                    zJ = aVar.u(view, motionEvent);
                }
                if (zJ) {
                    this.J = view;
                }
            }
        }
        arrayList.clear();
        return zJ;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        l4.a aVar = ((d) view.getLayoutParams()).f10017a;
        if (aVar != null) {
            aVar.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.G) {
            return;
        }
        t(false);
        this.G = true;
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        w();
    }

    @Override
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.Q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.P = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.P.setState(getDrawableState());
                }
                Drawable drawable3 = this.P;
                WeakHashMap weakHashMap = j0.f17198a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.P.setVisible(getVisibility() == 0, false);
                this.P.setCallback(this);
            }
            WeakHashMap weakHashMap2 = j0.f17198a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? getContext().getDrawable(i10) : null);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.P;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.P.setVisible(z10, false);
    }

    public final void t(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            l4.a aVar = ((d) childAt.getLayoutParams()).f10017a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    aVar.j(this, childAt, motionEventObtain);
                } else {
                    aVar.u(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((d) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.J = null;
        this.G = false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P;
    }

    public final void w() {
        WeakHashMap weakHashMap = j0.f17198a;
        if (!getFitsSystemWindows()) {
            d0.b(this, null);
            return;
        }
        if (this.R == null) {
            this.R = new gi.c(this, 18);
        }
        d0.b(this, this.R);
        setSystemUiVisibility(1280);
    }
}
