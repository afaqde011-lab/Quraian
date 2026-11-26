package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.k1;
import c3.x1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import i7.a0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l4.a;
import l4.d;
import og.b;
import og.g;
import og.h;
import p5.c;
import sg.i;
import sg.l;
import sg.m;
import z4.g0;
import z4.j0;

public class SideSheetBehavior<V extends View> extends a implements b {

    public a.a f4178a;

    public final i f4179b;

    public final ColorStateList f4180c;

    public final m f4181d;

    public final x1 f4182e;

    public final float f4183f;

    public final boolean f4184g;

    public int f4185h;

    public c f4186i;

    public boolean f4187j;

    public final float f4188k;
    public int l;
    public int m;

    public int f4189n;

    public int f4190o;

    public WeakReference f4191p;

    public WeakReference f4192q;

    public final int f4193r;

    public VelocityTracker f4194s;

    public h f4195t;

    public int f4196u;

    public final LinkedHashSet f4197v;

    public final eg.a f4198w;

    public SideSheetBehavior() {
        this.f4182e = new x1(this);
        this.f4184g = true;
        this.f4185h = 5;
        this.f4188k = 0.1f;
        this.f4193r = -1;
        this.f4197v = new LinkedHashSet();
        this.f4198w = new eg.a(this, 1);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f4182e = new x1(this);
        this.f4184g = true;
        this.f4185h = 5;
        this.f4188k = 0.1f;
        this.f4193r = -1;
        this.f4197v = new LinkedHashSet();
        this.f4198w = new eg.a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17450z);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f4180c = g4.J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f4181d = m.b(context, attributeSet, 0, 2131952803).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f4193r = resourceId;
            WeakReference weakReference = this.f4192q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f4192q = null;
            WeakReference weakReference2 = this.f4191p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        m mVar = this.f4181d;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f4179b = iVar;
            iVar.j(context);
            ColorStateList colorStateList = this.f4180c;
            if (colorStateList != null) {
                this.f4179b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f4179b.setTint(typedValue.data);
            }
        }
        this.f4183f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f4184g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override
    public final void a(d.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f4195t;
        if (hVar == null) {
            return;
        }
        a.a aVar = this.f4178a;
        int i10 = (aVar == null || aVar.H() == 0) ? 5 : 3;
        if (hVar.f11961f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        d.b bVar2 = hVar.f11961f;
        hVar.f11961f = bVar;
        if (bVar2 != null) {
            hVar.a(bVar.f4377c, i10, bVar.f4378d == 0);
        }
        WeakReference weakReference = this.f4191p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f4191p.get();
        WeakReference weakReference2 = this.f4192q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f4178a.i0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.f4190o));
        view2.requestLayout();
    }

    @Override
    public final void b() {
        int i10;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f4195t;
        if (hVar == null) {
            return;
        }
        d.b bVar = hVar.f11961f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f11961f = null;
        int i11 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        a.a aVar = this.f4178a;
        if (aVar != null && aVar.H() != 0) {
            i11 = 3;
        }
        cg.b bVar2 = new cg.b(this, 6);
        WeakReference weakReference = this.f4192q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iY = this.f4178a.y(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f14786a.f4178a.i0(marginLayoutParams, ag.a.c(valueAnimator.getAnimatedFraction(), iY, 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = hVar.f11957b;
        boolean z10 = bVar.f4378d == 0;
        boolean z11 = (Gravity.getAbsoluteGravity(i11, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i10 = z11 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i10 = 0;
        }
        float f3 = scaleX + i10;
        Property property = View.TRANSLATION_X;
        if (z11) {
            f3 = -f3;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f3);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new p6.a(1));
        objectAnimatorOfFloat.setDuration(ag.a.c(bVar.f4377c, hVar.f11958c, hVar.f11959d));
        objectAnimatorOfFloat.addListener(new g(hVar, z10, i11));
        objectAnimatorOfFloat.addListener(bVar2);
        objectAnimatorOfFloat.start();
    }

    @Override
    public final void c(d.b bVar) {
        h hVar = this.f4195t;
        if (hVar == null) {
            return;
        }
        hVar.f11961f = bVar;
    }

    @Override
    public final void d() {
        h hVar = this.f4195t;
        if (hVar == null) {
            return;
        }
        View view = hVar.f11957b;
        if (hVar.f11961f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        d.b bVar = hVar.f11961f;
        hVar.f11961f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(hVar.f11960e);
        animatorSet.start();
    }

    @Override
    public final void g(d dVar) {
        this.f4191p = null;
        this.f4186i = null;
        this.f4195t = null;
    }

    @Override
    public final void i() {
        this.f4191p = null;
        this.f4186i = null;
        this.f4195t = null;
    }

    @Override
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked;
        c cVar;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = j0.f17198a;
            if (g0.a(view) != null) {
                if (this.f4184g) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.f4194s) != null) {
                        velocityTracker.recycle();
                        this.f4194s = null;
                    }
                    if (this.f4194s == null) {
                        this.f4194s = VelocityTracker.obtain();
                    }
                    this.f4194s.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.f4196u = (int) motionEvent.getX();
                    } else if ((actionMasked != 1 || actionMasked == 3) && this.f4187j) {
                        this.f4187j = false;
                        return false;
                    }
                    return this.f4187j && (cVar = this.f4186i) != null && cVar.p(motionEvent);
                }
            }
        } else if (this.f4184g) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                velocityTracker.recycle();
                this.f4194s = null;
            }
            if (this.f4194s == null) {
                this.f4194s = VelocityTracker.obtain();
            }
            this.f4194s.addMovement(motionEvent);
            if (actionMasked == 0) {
                if (actionMasked != 1) {
                    this.f4187j = false;
                    return false;
                }
                this.f4187j = false;
                return false;
            }
            this.f4196u = (int) motionEvent.getX();
            if (this.f4187j) {
            }
        }
        this.f4187j = true;
        return false;
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View view2;
        View view3;
        int i11;
        View viewFindViewById;
        int i12 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f4191p;
        i iVar = this.f4179b;
        int iF = 0;
        if (weakReference == null) {
            this.f4191p = new WeakReference(view);
            this.f4195t = new h(view);
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.f4183f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.l(elevation);
            } else {
                ColorStateList colorStateList = this.f4180c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = j0.f17198a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i13 = this.f4185h == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            WeakHashMap weakHashMap2 = j0.f17198a;
            if (g0.a(view) == null) {
                j0.h(view, view.getResources().getString(2131887270));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).f10019c, i10) == 3 ? 1 : 0;
        a.a aVar = this.f4178a;
        if (aVar == null || aVar.H() != i14) {
            d dVar = null;
            m mVar = this.f4181d;
            if (i14 == 0) {
                this.f4178a = new tg.a(this, i12);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f4191p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        l lVarF = mVar.f();
                        lVarF.f14175f = new sg.a(0.0f);
                        lVarF.f14176g = new sg.a(0.0f);
                        m mVarA = lVarF.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(g4.c.i("Invalid sheet edge position value: ", i14, ". Must be 0 or 1."));
                }
                this.f4178a = new tg.a(this, iF);
                if (mVar != null) {
                    WeakReference weakReference3 = this.f4191p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        l lVarF2 = mVar.f();
                        lVarF2.f14174e = new sg.a(0.0f);
                        lVarF2.f14177h = new sg.a(0.0f);
                        m mVarA2 = lVarF2.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(mVarA2);
                        }
                    }
                }
            }
        }
        if (this.f4186i == null) {
            this.f4186i = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f4198w);
        }
        int iF2 = this.f4178a.F(view);
        coordinatorLayout.q(view, i10);
        this.m = coordinatorLayout.getWidth();
        this.f4189n = this.f4178a.G(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f4190o = marginLayoutParams != null ? this.f4178a.h(marginLayoutParams) : 0;
        int i15 = this.f4185h;
        if (i15 == 1 || i15 == 2) {
            iF = iF2 - this.f4178a.F(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f4185h);
            }
            iF = this.f4178a.B();
        }
        WeakHashMap weakHashMap3 = j0.f17198a;
        view.offsetLeftAndRight(iF);
        if (this.f4192q == null && (i11 = this.f4193r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f4192q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f4197v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override
    public final void q(View view, Parcelable parcelable) {
        int i10 = ((tg.c) parcelable).C;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f4185h = i10;
    }

    @Override
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new tg.c(this);
    }

    @Override
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4185h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.f4186i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f4194s) != null) {
            velocityTracker.recycle();
            this.f4194s = null;
        }
        if (this.f4194s == null) {
            this.f4194s = VelocityTracker.obtain();
        }
        this.f4194s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.f4187j && x()) {
            float fAbs = Math.abs(this.f4196u - motionEvent.getX());
            c cVar = this.f4186i;
            if (fAbs > cVar.f12351b) {
                cVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4187j;
    }

    public final void v(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(x5.n(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f4191p;
        if (weakReference == null || weakReference.get() == null) {
            w(i10);
            return;
        }
        View view = (View) this.f4191p.get();
        a0 a0Var = new a0(this, i10, 4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(a0Var);
        } else {
            a0Var.run();
        }
    }

    public final void w(int i10) {
        View view;
        if (this.f4185h == i10) {
            return;
        }
        this.f4185h = i10;
        WeakReference weakReference = this.f4191p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f4185h == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f4197v.iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        z();
    }

    public final boolean x() {
        if (this.f4186i != null) {
            return this.f4184g || this.f4185h == 1;
        }
        return false;
    }

    public final void y(android.view.View r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.y(android.view.View, int, boolean):void");
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f4191p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j0.e(view, 262144);
        j0.d(view, 0);
        j0.e(view, 1048576);
        j0.d(view, 0);
        int i10 = 5;
        if (this.f4185h != 5) {
            j0.f(view, a5.c.l, new k1(this, i10, 6));
        }
        int i11 = 3;
        if (this.f4185h != 3) {
            j0.f(view, a5.c.f176j, new k1(this, i11, 6));
        }
    }
}
