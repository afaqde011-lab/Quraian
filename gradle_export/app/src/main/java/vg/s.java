package vg;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.RuntimeVersion;
import java.util.List;
import java.util.Locale;
import p.i0;
import p.w1;

public final class s extends p.n {
    public final w1 E;
    public final AccessibilityManager F;
    public final Rect G;
    public final int H;
    public final float I;
    public ColorStateList J;
    public int K;
    public ColorStateList L;

    public s(Context context, AttributeSet attributeSet) {
        super(xg.a.a(context, attributeSet, 2130968647, 0), attributeSet);
        this.G = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = ng.j.e(context2, attributeSet, zf.a.f17435i, 2130968647, 2131952560, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.H = typedArrayE.getResourceId(3, 2131559109);
        this.I = typedArrayE.getDimensionPixelOffset(1, 2131166184);
        if (typedArrayE.hasValue(2)) {
            this.J = ColorStateList.valueOf(typedArrayE.getColor(2, 0));
        }
        this.K = typedArrayE.getColor(4, 0);
        this.L = g4.J(context2, typedArrayE, 5);
        this.F = (AccessibilityManager) context2.getSystemService("accessibility");
        w1 w1Var = new w1(context2, null, 2130969434, 0);
        this.E = w1Var;
        w1Var.Y = true;
        w1Var.Z.setFocusable(true);
        w1Var.O = this;
        w1Var.Z.setInputMethodMode(2);
        w1Var.o(getAdapter());
        w1Var.P = new i0(this, 1);
        if (typedArrayE.hasValue(6)) {
            setSimpleItems(typedArrayE.getResourceId(6, 0));
        }
        typedArrayE.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.F;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void dismissDropDown() {
        if (c()) {
            this.E.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.J;
    }

    @Override
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f4212i0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.I;
    }

    public int getSimpleItemSelectedColor() {
        return this.K;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.L;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f4212i0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : RuntimeVersion.SUFFIX).equals("meizu")) {
                setHint(RuntimeVersion.SUFFIX);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.dismiss();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                w1 w1Var = this.E;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !w1Var.Z.isShowing() ? -1 : w1Var.C.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = w1Var.Z.getBackground();
                if (background != null) {
                    Rect rect = this.G;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.E.o(getAdapter());
    }

    @Override
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        w1 w1Var = this.E;
        if (w1Var != null) {
            w1Var.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.J = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof sg.i) {
            ((sg.i) dropDownBackground).m(this.J);
        }
    }

    @Override
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.E.Q = getOnItemSelectedListener();
    }

    @Override
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.K = i10;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new r(this, getContext(), this.H, strArr));
    }

    @Override
    public final void showDropDown() {
        if (c()) {
            this.E.show();
        } else {
            super.showDropDown();
        }
    }
}
