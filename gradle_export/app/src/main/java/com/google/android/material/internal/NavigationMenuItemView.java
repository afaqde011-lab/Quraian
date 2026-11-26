package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.j;
import ng.d;
import o.n;
import o.y;
import p.n1;
import p.t2;
import p4.i;
import z4.j0;

public class NavigationMenuItemView extends d implements y {

    public static final int[] f4168j0 = {R.attr.state_checked};
    public int V;
    public boolean W;

    public boolean f4169a0;

    public final boolean f4170b0;

    public final CheckedTextView f4171c0;

    public FrameLayout f4172d0;

    public n f4173e0;

    public ColorStateList f4174f0;

    public boolean f4175g0;

    public Drawable f4176h0;

    public final j f4177i0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4170b0 = true;
        j jVar = new j(this, 4);
        this.f4177i0 = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131558741, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165343));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131362094);
        this.f4171c0 = checkedTextView;
        j0.g(checkedTextView, jVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f4172d0 == null) {
                this.f4172d0 = (FrameLayout) ((ViewStub) findViewById(2131362093)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f4172d0.removeAllViews();
            this.f4172d0.addView(view);
        }
    }

    @Override
    public final void a(n nVar) {
        StateListDrawable stateListDrawable;
        this.f4173e0 = nVar;
        int i10 = nVar.f11424a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968895, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f4168j0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f11428e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f11438q);
        t2.a(this, nVar.f11439r);
        n nVar2 = this.f4173e0;
        CharSequence charSequence = nVar2.f11428e;
        CheckedTextView checkedTextView = this.f4171c0;
        if (charSequence == null && nVar2.getIcon() == null && this.f4173e0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f4172d0;
            if (frameLayout != null) {
                n1 n1Var = (n1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) n1Var).width = -1;
                this.f4172d0.setLayoutParams(n1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f4172d0;
        if (frameLayout2 != null) {
            n1 n1Var2 = (n1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) n1Var2).width = -2;
            this.f4172d0.setLayoutParams(n1Var2);
        }
    }

    @Override
    public n getItemData() {
        return this.f4173e0;
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        n nVar = this.f4173e0;
        if (nVar != null && nVar.isCheckable() && this.f4173e0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4168j0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f4169a0 != z10) {
            this.f4169a0 = z10;
            this.f4177i0.h(this.f4171c0, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f4171c0;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f4170b0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f4175g0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f4174f0);
            }
            int i10 = this.V;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.W) {
            if (this.f4176h0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = i.f12335a;
                Drawable drawable2 = resources.getDrawable(2131231601, theme);
                this.f4176h0 = drawable2;
                if (drawable2 != null) {
                    int i11 = this.V;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f4176h0;
        }
        this.f4171c0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f4171c0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.V = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f4174f0 = colorStateList;
        this.f4175g0 = colorStateList != null;
        n nVar = this.f4173e0;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f4171c0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.W = z10;
    }

    public void setTextAppearance(int i10) {
        this.f4171c0.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f4171c0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4171c0.setText(charSequence);
    }
}
