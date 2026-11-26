package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c7.g;
import com.google.android.material.datepicker.l;
import j.a;
import n.b;
import o.z;
import p.j;
import p30.f;
import z4.j0;
import z4.n0;

public class ActionBarContextView extends ViewGroup {
    public final g A;
    public final Context B;
    public ActionMenuView C;
    public j D;
    public int E;
    public n0 F;
    public boolean G;
    public boolean H;
    public CharSequence I;
    public CharSequence J;
    public View K;
    public View L;
    public View M;
    public LinearLayout N;
    public TextView O;
    public TextView P;
    public final int Q;
    public final int R;
    public boolean S;
    public final int T;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 2130968607);
        g gVar = new g();
        gVar.f2906c = this;
        gVar.f2905b = false;
        this.A = gVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968581, typedValue, true) || typedValue.resourceId == 0) {
            this.B = context;
        } else {
            this.B = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7719d, 2130968607, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : f.f0(context, resourceId));
        this.Q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.R = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.E = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.T = typedArrayObtainStyledAttributes.getResourceId(2, 2131558405);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(b bVar) {
        View view = this.K;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.T, (ViewGroup) this, false);
            this.K = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.K);
        }
        View viewFindViewById = this.K.findViewById(2131361859);
        this.L = viewFindViewById;
        viewFindViewById.setOnClickListener(new l(bVar, 4));
        o.l lVarC = bVar.c();
        j jVar = this.D;
        if (jVar != null) {
            jVar.h();
            p.f fVar = jVar.T;
            if (fVar != null && fVar.b()) {
                fVar.f11464i.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.D = jVar2;
        jVar2.L = true;
        jVar2.M = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarC.b(this.D, this.B);
        j jVar3 = this.D;
        z zVar = jVar3.H;
        if (zVar == null) {
            z zVar2 = (z) jVar3.D.inflate(jVar3.F, (ViewGroup) this, false);
            jVar3.H = zVar2;
            zVar2.b(jVar3.C);
            jVar3.f();
        }
        z zVar3 = jVar3.H;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.C = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.C, layoutParams);
    }

    public final void d() {
        if (this.N == null) {
            LayoutInflater.from(getContext()).inflate(2131558400, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.N = linearLayout;
            this.O = (TextView) linearLayout.findViewById(2131361850);
            this.P = (TextView) this.N.findViewById(2131361849);
            int i10 = this.Q;
            if (i10 != 0) {
                this.O.setTextAppearance(getContext(), i10);
            }
            int i11 = this.R;
            if (i11 != 0) {
                this.P.setTextAppearance(getContext(), i11);
            }
        }
        this.O.setText(this.I);
        this.P.setText(this.J);
        boolean zIsEmpty = TextUtils.isEmpty(this.I);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.J);
        this.P.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.N.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.N.getParent() == null) {
            addView(this.N);
        }
    }

    public final void e() {
        removeAllViews();
        this.M = null;
        this.C = null;
        this.D = null;
        View view = this.L;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.F != null ? this.A.f2904a : getVisibility();
    }

    public int getContentHeight() {
        return this.E;
    }

    public CharSequence getSubtitle() {
        return this.J;
    }

    public CharSequence getTitle() {
        return this.I;
    }

    @Override
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            n0 n0Var = this.F;
            if (n0Var != null) {
                n0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final n0 i(int i10, long j9) {
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.b();
        }
        g gVar = this.A;
        if (i10 != 0) {
            n0 n0VarB = j0.b(this);
            n0VarB.a(0.0f);
            n0VarB.c(j9);
            ((ActionBarContextView) gVar.f2906c).F = n0VarB;
            gVar.f2904a = i10;
            n0VarB.d(gVar);
            return n0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        n0 n0VarB2 = j0.b(this);
        n0VarB2.a(1.0f);
        n0VarB2.c(j9);
        ((ActionBarContextView) gVar.f2906c).F = n0VarB2;
        gVar.f2904a = i10;
        n0VarB2.d(gVar);
        return n0VarB2;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f7716a, 2130968584, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        j jVar = this.D;
        if (jVar != null) {
            Configuration configuration2 = jVar.B.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            jVar.P = i10;
            o.l lVar = jVar.C;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.D;
        if (jVar != null) {
            jVar.h();
            p.f fVar = this.D.T;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f11464i.dismiss();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.K;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
            int i14 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z11 ? paddingRight - i14 : paddingRight + i14;
            int iG = g(this.K, i16, paddingTop, paddingTop2, z11) + i16;
            paddingRight = z11 ? iG - i15 : iG + i15;
        }
        LinearLayout linearLayout = this.N;
        if (linearLayout != null && this.M == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.N, paddingRight, paddingTop, paddingTop2, z11);
        }
        View view2 = this.M;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z11);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.C;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z11);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.E;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.K;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.C;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.C, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.N;
        if (linearLayout != null && this.M == null) {
            if (this.S) {
                this.N.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.N.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.N.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.M;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.M.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.E > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.E = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.M;
        if (view2 != null) {
            removeView(view2);
        }
        this.M = view;
        if (view != null && (linearLayout = this.N) != null) {
            removeView(linearLayout);
            this.N = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.J = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.I = charSequence;
        d();
        j0.h(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.S) {
            requestLayout();
        }
        this.S = z10;
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
