package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.i1;
import java.util.WeakHashMap;
import p.t2;

public class MediaRouteButton extends View {
    public static final SparseArray P = new SparseArray(2);
    public static final int[] Q = {R.attr.state_checked};
    public static final int[] R = {R.attr.state_checkable};
    public final o9.c0 A;
    public final i0 B;
    public o9.u C;
    public x D;
    public boolean E;
    public boolean F;
    public b G;
    public Drawable H;
    public int I;
    public int J;
    public int K;
    public final ColorStateList L;
    public final int M;
    public final int N;
    public boolean O;

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f50.c.E(context));
        int I = f50.c.I(contextThemeWrapper, 2130969554);
        super(I != 0 ? new ContextThemeWrapper(contextThemeWrapper, I) : contextThemeWrapper, attributeSet, 2130969542);
        this.C = o9.u.f11876c;
        this.D = x.f1836a;
        Context context2 = getContext();
        int[] iArr = n9.a.f11197a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969542, 0);
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(this, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 2130969542, 0);
        if (isInEditMode()) {
            this.A = null;
            this.B = null;
            this.H = p30.f.f0(context2, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.A = o9.c0.d(context2);
        this.B = new i0(this, 1);
        o9.b0 b0VarF = o9.c0.f();
        int i10 = !b0VarF.d() ? b0VarF.f11745i : 0;
        this.K = i10;
        this.J = i10;
        this.L = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i11 = this.I;
        SparseArray sparseArray = P;
        if (i11 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i11)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.H == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    b bVar = new b(resourceId, getContext(), this);
                    this.G = bVar;
                    bVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        d();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private i1 getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.o0) {
            return ((androidx.fragment.app.o0) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.I > 0) {
            b bVar = this.G;
            if (bVar != null) {
                bVar.cancel(false);
            }
            b bVar2 = new b(this.I, getContext(), this);
            this.G = bVar2;
            this.I = 0;
            bVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.A.getClass();
        o9.b0 b0VarF = o9.c0.f();
        int i10 = !b0VarF.d() ? b0VarF.f11745i : 0;
        if (this.K != i10) {
            this.K = i10;
            d();
            refreshDrawableState();
        }
        if (i10 == 1) {
            a();
        }
    }

    public final boolean c() {
        i1 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.A.getClass();
        if (o9.c0.f().d()) {
            if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.D.getClass();
            i iVar = new i();
            o9.u uVar = this.C;
            if (uVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            iVar.j();
            if (!iVar.C.equals(uVar)) {
                iVar.C = uVar;
                Bundle arguments = iVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle("selector", uVar.f11877a);
                iVar.setArguments(arguments);
                k.d0 d0Var = iVar.B;
                if (d0Var != null) {
                    if (iVar.A) {
                        ((d0) d0Var).f(uVar);
                    } else {
                        ((h) d0Var).g(uVar);
                    }
                }
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.c(0, iVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            aVar.f(true, true);
            return true;
        }
        if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.D.getClass();
        w wVar = new w();
        o9.u uVar2 = this.C;
        if (uVar2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (wVar.C == null) {
            Bundle arguments2 = wVar.getArguments();
            if (arguments2 != null) {
                wVar.C = o9.u.b(arguments2.getBundle("selector"));
            }
            if (wVar.C == null) {
                wVar.C = o9.u.f11876c;
            }
        }
        if (!wVar.C.equals(uVar2)) {
            wVar.C = uVar2;
            Bundle arguments3 = wVar.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putBundle("selector", uVar2.f11877a);
            wVar.setArguments(arguments3);
            k.d0 d0Var2 = wVar.B;
            if (d0Var2 != null && wVar.A) {
                ((q0) d0Var2).h(uVar2);
            }
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.c(0, wVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        aVar2.f(true, true);
        return true;
    }

    public final void d() {
        int i10;
        int i11 = this.K;
        if (i11 != 1) {
            i10 = i11 != 2 ? 2131886805 : 2131886803;
        } else {
            i10 = 2131886804;
        }
        String string = getContext().getString(i10);
        setContentDescription(string);
        if (!this.O || TextUtils.isEmpty(string)) {
            string = null;
        }
        t2.a(this, string);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.H != null) {
            this.H.setState(getDrawableState());
            if (this.H.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.H.getCurrent();
                int i10 = this.K;
                if (i10 == 1 || this.J != i10) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i10 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.J = this.K;
    }

    public x getDialogFactory() {
        return this.D;
    }

    public o9.u getRouteSelector() {
        return this.C;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.E = true;
        if (!this.C.d()) {
            this.A.a(this.C, this.B, 0);
        }
        b();
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.A != null && !this.F) {
            int i11 = this.K;
            if (i11 == 1) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, R);
                return iArrOnCreateDrawableState;
            }
            if (i11 == 2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, Q);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.E = false;
            if (!this.C.d()) {
                this.A.h(this.B);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.H != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.H.getIntrinsicWidth();
            int intrinsicHeight = this.H.getIntrinsicHeight();
            int i10 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i11 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.H.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.H.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Drawable drawable = this.H;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.M, paddingRight);
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.N, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final boolean performClick() {
        boolean zC;
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        a();
        if (this.E) {
            this.A.getClass();
            o9.c0.b();
            o9.e0 e0Var = o9.c0.c().f11797v;
            if (e0Var == null || !e0Var.f11774b) {
                zC = c();
            } else {
                if ((o9.c0.f11757c == null ? false : o9.c0.c().i()) && f50.k.E(getContext())) {
                    zC = true;
                } else {
                    zC = c();
                }
            }
        } else {
            zC = false;
        }
        return zC || zPerformClick;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z10) {
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            d();
        }
    }

    public void setDialogFactory(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.D = xVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.I = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        b bVar = this.G;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.H);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.L;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.H = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(o9.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.C.equals(uVar)) {
            return;
        }
        if (this.E) {
            boolean zD = this.C.d();
            i0 i0Var = this.B;
            o9.c0 c0Var = this.A;
            if (!zD) {
                c0Var.h(i0Var);
            }
            if (!uVar.d()) {
                c0Var.a(uVar, i0Var, 0);
            }
        }
        this.C = uVar;
        b();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setVisible(i10 == 0, false);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H;
    }
}
