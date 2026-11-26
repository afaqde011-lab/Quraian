package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.q;
import ba.k;
import c3.x1;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.cast.t0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import eg.h;
import h1.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l4.a;
import l4.d;
import og.b;
import og.f;
import p5.c;
import sg.g;
import sg.i;
import sg.m;
import z4.d0;
import z4.h0;
import z4.j0;

public class BottomSheetBehavior<V extends View> extends a implements b {
    public final x1 A;
    public final ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public c O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    public final int f4106a;

    public f f4107a0;

    public boolean f4108b;

    public int f4109b0;

    public final float f4110c;

    public int f4111c0;

    public final int f4112d;

    public boolean f4113d0;

    public int f4114e;

    public HashMap f4115e0;

    public boolean f4116f;

    public final SparseIntArray f4117f0;

    public int f4118g;

    public final eg.a f4119g0;

    public final int f4120h;

    public final i f4121i;

    public final ColorStateList f4122j;

    public final int f4123k;
    public final int l;
    public int m;

    public final boolean f4124n;

    public final boolean f4125o;

    public final boolean f4126p;

    public final boolean f4127q;

    public final boolean f4128r;

    public final boolean f4129s;

    public final boolean f4130t;

    public final boolean f4131u;

    public int f4132v;

    public int f4133w;

    public final boolean f4134x;

    public final m f4135y;

    public boolean f4136z;

    public BottomSheetBehavior() {
        this.f4106a = 0;
        this.f4108b = true;
        this.f4123k = -1;
        this.l = -1;
        this.A = new x1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f4111c0 = -1;
        this.f4117f0 = new SparseIntArray();
        this.f4119g0 = new eg.a(this, 0);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        this.f4106a = 0;
        this.f4108b = true;
        this.f4123k = -1;
        this.l = -1;
        this.A = new x1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f4111c0 = -1;
        this.f4117f0 = new SparseIntArray();
        this.f4119g0 = new eg.a(this, 0);
        this.f4120h = context.getResources().getDimensionPixelSize(2131166215);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17427a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f4122j = g4.J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f4135y = m.b(context, attributeSet, 2130968715, 2131952627).a();
        }
        m mVar = this.f4135y;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f4121i = iVar;
            iVar.j(context);
            ColorStateList colorStateList = this.f4122j;
            if (colorStateList != null) {
                this.f4121i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f4121i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new k(this, 2));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f4123k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            J(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            J(i10);
        }
        I(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.f4124n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        G(typedArrayObtainStyledAttributes.getBoolean(7, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f4106a = typedArrayObtainStyledAttributes.getInt(11, 0);
        H(typedArrayObtainStyledAttributes.getFloat(8, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            F(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
        } else {
            F(typedValuePeekValue2.data);
        }
        this.f4112d = typedArrayObtainStyledAttributes.getInt(12, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        this.f4125o = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f4126p = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f4127q = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f4128r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.f4129s = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f4130t = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f4131u = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f4134x = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f4110c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        a aVar = ((d) layoutParams).f10017a;
        if (aVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) aVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewZ = z(viewGroup.getChildAt(i10));
            if (viewZ != null) {
                return viewZ;
            }
        }
        return null;
    }

    public final int C() {
        if (this.f4108b) {
            return this.D;
        }
        return Math.max(this.C, this.f4128r ? 0 : this.f4133w);
    }

    public final int D(int i10) {
        if (i10 == 3) {
            return C();
        }
        if (i10 == 4) {
            return this.G;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(g4.c.f(i10, "Invalid state to get top offset: "));
    }

    public final boolean E() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void F(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.C = i10;
        P(this.N, true);
    }

    public final void G(boolean z10) {
        if (this.f4108b == z10) {
            return;
        }
        this.f4108b = z10;
        if (this.W != null) {
            v();
        }
        L((this.f4108b && this.N == 6) ? 3 : this.N);
        P(this.N, true);
        O();
    }

    public final void H(float f3) {
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f3;
        if (this.W != null) {
            this.E = (int) ((1.0f - f3) * this.V);
        }
    }

    public final void I(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.N == 5) {
                K(4);
            }
            O();
        }
    }

    public final void J(int i10) {
        if (i10 == -1) {
            if (this.f4116f) {
                return;
            } else {
                this.f4116f = true;
            }
        } else {
            if (!this.f4116f && this.f4114e == i10) {
                return;
            }
            this.f4116f = false;
            this.f4114e = Math.max(0, i10);
        }
        R();
    }

    public final void K(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(x5.n(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f4108b && D(i10) <= this.D) ? 3 : i10;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            L(i10);
            return;
        }
        View view = (View) this.W.get();
        t0 t0Var = new t0(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(t0Var);
        } else {
            t0Var.run();
        }
    }

    public final void L(int i10) {
        View view;
        if (this.N == i10) {
            return;
        }
        this.N = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            Q(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            Q(false);
        }
        P(i10, true);
        while (true) {
            ArrayList arrayList = this.Y;
            if (i11 >= arrayList.size()) {
                O();
                return;
            } else {
                ((eg.b) arrayList.get(i11)).c(view, i10);
                i11++;
            }
        }
    }

    public final boolean M(View view, float f3) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f3 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) x()) > 0.5f;
    }

    public final void N(android.view.View r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.N(android.view.View, int, boolean):void");
    }

    public final void O() {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j0.e(view, 524288);
        j0.d(view, 0);
        j0.e(view, 262144);
        j0.d(view, 0);
        j0.e(view, 1048576);
        j0.d(view, 0);
        SparseIntArray sparseIntArray = this.f4117f0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            j0.e(view, i10);
            j0.d(view, 0);
            sparseIntArray.delete(0);
        }
        int i11 = 6;
        if (!this.f4108b && this.N != 6) {
            String string = view.getResources().getString(2131886237);
            qd.j0 j0Var = new qd.j0(this, i11, 4);
            ArrayList arrayListC = j0.c(view);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayListC.size()) {
                    int i13 = 0;
                    int i14 = -1;
                    while (true) {
                        int[] iArr = j0.f17199b;
                        if (i13 >= 32 || i14 != -1) {
                            break;
                        }
                        int i15 = iArr[i13];
                        boolean z10 = true;
                        for (int i16 = 0; i16 < arrayListC.size(); i16++) {
                            z10 &= ((a5.c) arrayListC.get(i16)).a() != i15;
                        }
                        if (z10) {
                            i14 = i15;
                        }
                        i13++;
                    }
                    iA = i14;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a5.c) arrayListC.get(i12)).f183a).getLabel())) {
                    iA = ((a5.c) arrayListC.get(i12)).a();
                    break;
                }
                i12++;
            }
            if (iA != -1) {
                a5.c cVar = new a5.c(null, iA, string, j0Var, null);
                View.AccessibilityDelegate accessibilityDelegateA = h0.a(view);
                z4.b bVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof z4.a ? ((z4.a) accessibilityDelegateA).f17174a : new z4.b(accessibilityDelegateA);
                if (bVar == null) {
                    bVar = new z4.b();
                }
                j0.g(view, bVar);
                j0.e(view, cVar.a());
                j0.c(view).add(cVar);
                j0.d(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i17 = 5;
            if (this.N != 5) {
                j0.f(view, a5.c.l, new qd.j0(this, i17, 4));
            }
        }
        int i18 = this.N;
        int i19 = 4;
        int i20 = 3;
        if (i18 == 3) {
            j0.f(view, a5.c.f177k, new qd.j0(this, this.f4108b ? 4 : 6, 4));
            return;
        }
        if (i18 == 4) {
            j0.f(view, a5.c.f176j, new qd.j0(this, this.f4108b ? 3 : 6, 4));
        } else {
            if (i18 != 6) {
                return;
            }
            j0.f(view, a5.c.f177k, new qd.j0(this, i19, 4));
            j0.f(view, a5.c.f176j, new qd.j0(this, i20, 4));
        }
    }

    public final void P(int i10, boolean z10) {
        i iVar;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.N == 3 && (this.f4134x || E());
        if (this.f4136z == z11 || (iVar = this.f4121i) == null) {
            return;
        }
        this.f4136z = z11;
        ValueAnimator valueAnimator = this.B;
        if (z10 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(iVar.B.f14159j, z11 ? w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fW = this.f4136z ? w() : 1.0f;
        g gVar = iVar.B;
        if (gVar.f14159j != fW) {
            gVar.f14159j = fW;
            iVar.F = true;
            iVar.G = true;
            iVar.invalidateSelf();
        }
    }

    public final void Q(boolean z10) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f4115e0 != null) {
                    return;
                } else {
                    this.f4115e0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get() && z10) {
                    this.f4115e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.f4115e0 = null;
        }
    }

    public final void R() {
        View view;
        if (this.W != null) {
            v();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override
    public final void a(d.b bVar) {
        f fVar = this.f4107a0;
        if (fVar == null) {
            return;
        }
        if (fVar.f11961f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        d.b bVar2 = fVar.f11961f;
        fVar.f11961f = bVar;
        if (bVar2 == null) {
            return;
        }
        fVar.b(bVar.f4377c);
    }

    @Override
    public final void b() {
        f fVar = this.f4107a0;
        if (fVar == null) {
            return;
        }
        int i10 = fVar.f11959d;
        int i11 = fVar.f11958c;
        d.b bVar = fVar.f11961f;
        fVar.f11961f = null;
        if (bVar != null) {
            float f3 = bVar.f4377c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.I) {
                    AnimatorSet animatorSetA = fVar.a();
                    animatorSetA.setDuration(ag.a.c(f3, i11, i10));
                    animatorSetA.start();
                    K(4);
                    return;
                }
                cg.b bVar2 = new cg.b(this, 2);
                View view = fVar.f11957b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new p6.a(1));
                objectAnimatorOfFloat.setDuration(ag.a.c(f3, i11, i10));
                objectAnimatorOfFloat.addListener(new cg.b(fVar, 3));
                objectAnimatorOfFloat.addListener(bVar2);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        K(this.I ? 5 : 4);
    }

    @Override
    public final void c(d.b bVar) {
        f fVar = this.f4107a0;
        if (fVar == null) {
            return;
        }
        fVar.f11961f = bVar;
    }

    @Override
    public final void d() {
        f fVar = this.f4107a0;
        if (fVar == null) {
            return;
        }
        if (fVar.f11961f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        d.b bVar = fVar.f11961f;
        fVar.f11961f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSetA = fVar.a();
        animatorSetA.setDuration(fVar.f11960e);
        animatorSetA.start();
    }

    @Override
    public final void g(d dVar) {
        this.W = null;
        this.O = null;
        this.f4107a0 = null;
    }

    @Override
    public final void i() {
        this.W = null;
        this.O = null;
        this.f4107a0 = null;
    }

    @Override
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        c cVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4109b0 = -1;
            this.f4111c0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f4111c0 = y10;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, y10)) {
                    this.f4109b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f4113d0 = true;
                }
            }
            this.P = this.f4109b0 == -1 && !coordinatorLayout.o(view, x2, this.f4111c0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4113d0 = false;
            this.f4109b0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (cVar = this.O) == null || !cVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f4111c0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.O.f12351b) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 6;
        int i12 = 0;
        Object[] objArr = 0;
        if (this.W == null) {
            this.f4118g = coordinatorLayout.getResources().getDimensionPixelSize(2131165333);
            boolean z10 = (this.f4124n || this.f4116f) ? false : true;
            if (this.f4125o || this.f4126p || this.f4127q || this.f4129s || this.f4130t || this.f4131u || z10) {
                q qVar = new q(this, z10, i11);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                a8.d dVar = new a8.d();
                dVar.f238a = paddingStart;
                dVar.f239b = paddingEnd;
                dVar.f240c = paddingBottom;
                l lVar = new l(qVar, dVar, objArr == true ? 1 : 0);
                WeakHashMap weakHashMap = j0.f17198a;
                d0.b(view, lVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ng.l());
                }
            }
            j0.i(view, new h(view));
            this.W = new WeakReference(view);
            this.f4107a0 = new f(view);
            i iVar = this.f4121i;
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.l(elevation);
            } else {
                ColorStateList colorStateList = this.f4122j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            O();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f4119g0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i13 = iMin - height;
        int i14 = this.f4133w;
        if (i13 < i14) {
            boolean z11 = this.f4128r;
            int i15 = this.l;
            if (z11) {
                if (i15 != -1) {
                    iMin = Math.min(iMin, i15);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        v();
        int i16 = this.N;
        if (i16 == 3) {
            int iC = C();
            WeakHashMap weakHashMap2 = j0.f17198a;
            view.offsetTopAndBottom(iC);
        } else if (i16 == 6) {
            int i17 = this.E;
            WeakHashMap weakHashMap3 = j0.f17198a;
            view.offsetTopAndBottom(i17);
        } else if (this.I && i16 == 5) {
            int i18 = this.V;
            WeakHashMap weakHashMap4 = j0.f17198a;
            view.offsetTopAndBottom(i18);
        } else if (i16 == 4) {
            int i19 = this.G;
            WeakHashMap weakHashMap5 = j0.f17198a;
            view.offsetTopAndBottom(i19);
        } else if (i16 == 1 || i16 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = j0.f17198a;
            view.offsetTopAndBottom(top2);
        }
        P(this.N, false);
        this.X = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((eg.b) arrayList.get(i12)).a(view);
            i12++;
        }
    }

    @Override
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f4123k, marginLayoutParams.width), B(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override
    public final boolean m(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        boolean z10 = this.L;
        if (i11 > 0) {
            if (!this.R && !z10 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i13 < C()) {
                int iC = top - C();
                iArr[1] = iC;
                WeakHashMap weakHashMap = j0.f17198a;
                view.offsetTopAndBottom(-iC);
                L(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = j0.f17198a;
                view.offsetTopAndBottom(-i11);
                L(1);
            }
        } else if (i11 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z10 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i14 = this.G;
                if (i13 > i14 && !this.I) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    WeakHashMap weakHashMap3 = j0.f17198a;
                    view.offsetTopAndBottom(-i15);
                    L(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i11;
                    WeakHashMap weakHashMap4 = j0.f17198a;
                    view.offsetTopAndBottom(-i11);
                    L(1);
                }
            }
        }
        y(view.getTop());
        this.Q = i11;
        this.R = true;
        this.M = false;
    }

    @Override
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override
    public final void q(View view, Parcelable parcelable) {
        eg.c cVar = (eg.c) parcelable;
        int i10 = this.f4106a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f4114e = cVar.D;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f4108b = cVar.E;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = cVar.F;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = cVar.G;
            }
        }
        int i11 = cVar.C;
        if (i11 == 1 || i11 == 2) {
            this.N = 4;
        } else {
            this.N = i11;
        }
    }

    @Override
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new eg.c(this);
    }

    @Override
    public final boolean s(View view, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    @Override
    public final void t(View view, View view2, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (view.getTop() == C()) {
            L(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.f4108b && view.getTop() > this.E) {
                    i12 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f4110c);
                    yVelocity = this.Z.getYVelocity(this.f4109b0);
                }
                if (M(view, yVelocity)) {
                    i12 = 5;
                } else if (this.Q == 0) {
                    top2 = view.getTop();
                    if (this.f4108b) {
                        i11 = this.E;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.G)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f4108b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.Q == 0) {
                top2 = view.getTop();
                if (this.f4108b) {
                    i11 = this.E;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.G)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i12 = 4;
                }
            } else {
                if (!this.f4108b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            N(view, i12, false);
            this.R = false;
        }
    }

    @Override
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.N;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        c cVar = this.O;
        if (cVar != null && (this.K || i10 == 1)) {
            cVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f4109b0 = -1;
            this.f4111c0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f4111c0 - motionEvent.getY());
            c cVar2 = this.O;
            if (fAbs > cVar2.f12351b) {
                cVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void v() {
        int iX = x();
        if (this.f4108b) {
            this.G = Math.max(this.V - iX, this.D);
        } else {
            this.G = this.V - iX;
        }
    }

    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f3;
        float f10 = 0.0f;
        if (this.f4121i != null && (weakReference = this.W) != null && weakReference.get() != null) {
            View view = (View) this.W.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                i iVar = this.f4121i;
                float[] fArr = iVar.Z;
                float fA = fArr != null ? fArr[3] : iVar.B.f14150a.f14185e.a(iVar.f());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f3 = 0.0f;
                    } else {
                        f3 = radius / fA;
                    }
                } else {
                    f3 = 0.0f;
                }
                i iVar2 = this.f4121i;
                float[] fArr2 = iVar2.Z;
                float fA2 = fArr2 != null ? fArr2[0] : iVar2.B.f14150a.f14186f.a(iVar2.f());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f10 = radius2 / fA2;
                    }
                }
                return Math.max(f3, f10);
            }
        }
        return 0.0f;
    }

    public final int x() {
        int iMin;
        int i10;
        int i11;
        if (this.f4116f) {
            iMin = Math.min(Math.max(this.f4118g, this.V - ((this.U * 9) / 16)), this.T);
            i10 = this.f4132v;
        } else {
            if (!this.f4124n && !this.f4125o && (i11 = this.m) > 0) {
                return Math.max(this.f4114e, i11 + this.f4120h);
            }
            iMin = this.f4114e;
            i10 = this.f4132v;
        }
        return iMin + i10;
    }

    public final void y(int i10) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.G;
            if (i10 <= i11 && i11 != C()) {
                C();
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((eg.b) arrayList.get(i12)).b(view);
            }
        }
    }
}
