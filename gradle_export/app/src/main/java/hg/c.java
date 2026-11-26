package hg;

import ab.a0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k9.x0;
import ng.j;
import p.p;
import p30.f;
import p4.i;
import ua.d;
import ua.e;

public final class c extends p {

    public static final int[] f7059b0 = {2130969851};

    public static final int[] f7060c0 = {2130969850};

    public static final int[][] f7061d0 = {new int[]{R.attr.state_enabled, 2130969850}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public static final int f7062e0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", CredentialsData.CREDENTIALS_TYPE_ANDROID);
    public final LinkedHashSet E;
    public final LinkedHashSet F;
    public ColorStateList G;
    public boolean H;
    public boolean I;
    public boolean J;
    public CharSequence K;
    public Drawable L;
    public Drawable M;
    public boolean N;
    public ColorStateList O;
    public ColorStateList P;
    public PorterDuff.Mode Q;
    public int R;
    public int[] S;
    public boolean T;
    public CharSequence U;
    public CompoundButton.OnCheckedChangeListener V;
    public final e W;

    public final a f7063a0;

    public c(Context context, AttributeSet attributeSet) {
        super(xg.a.a(context, attributeSet, 2130968817, 2131952882), attributeSet, 2130968817);
        this.E = new LinkedHashSet();
        this.F = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = i.f12335a;
        Drawable drawable = resources.getDrawable(2131231566, theme);
        eVar.A = drawable;
        drawable.setCallback(eVar.F);
        new d(eVar.A.getConstantState());
        this.W = eVar;
        this.f7063a0 = new a(this);
        Context context3 = getContext();
        this.L = getButtonDrawable();
        this.O = getSuperButtonTintList();
        setSupportButtonTintList(null);
        j.a(context3, attributeSet, 2130968817, 2131952882);
        int[] iArr = zf.a.f17439o;
        j.b(context3, attributeSet, iArr, 2130968817, 2131952882, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, 2130968817, 2131952882);
        x0 x0Var = new x0(context3, typedArrayObtainStyledAttributes);
        this.M = x0Var.v(2);
        if (this.L != null && z3.O(context3, 2130969299, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f7062e0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.L = f.f0(context3, 2131231565);
                this.N = true;
                if (this.M == null) {
                    this.M = f.f0(context3, 2131231567);
                }
            }
        }
        this.P = g4.K(context3, x0Var, 3);
        this.Q = j.f(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.H = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.I = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.J = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.K = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        x0Var.O();
        a();
    }

    private String getButtonStateDescription() {
        int i10 = this.R;
        if (i10 == 1) {
            return getResources().getString(2131886851);
        }
        return i10 == 0 ? getResources().getString(2131886853) : getResources().getString(2131886852);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.G == null) {
            int iE0 = a0.e0(this, 2130968894);
            int iE1 = a0.e0(this, 2130968897);
            int iE2 = a0.e0(this, 2130968937);
            int iE3 = a0.e0(this, 2130968914);
            this.G = new ColorStateList(f7061d0, new int[]{a0.k0(1.0f, iE2, iE1), a0.k0(1.0f, iE2, iE0), a0.k0(0.54f, iE2, iE3), a0.k0(0.38f, iE2, iE3), a0.k0(0.38f, iE2, iE3)});
        }
        return this.G;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.O;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        cg.b bVar;
        Drawable drawableMutate = this.L;
        ColorStateList colorStateList3 = this.O;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.L = drawableMutate;
        Drawable drawableMutate2 = this.M;
        ColorStateList colorStateList4 = this.P;
        PorterDuff.Mode mode = this.Q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.M = drawableMutate2;
        if (this.N) {
            e eVar = this.W;
            if (eVar != null) {
                ua.c cVar = eVar.B;
                Drawable drawable = eVar.A;
                a aVar = this.f7063a0;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f7057a == null) {
                        aVar.f7057a = new ua.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f7057a);
                }
                ArrayList arrayList = eVar.E;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.E.size() == 0 && (bVar = eVar.D) != null) {
                        cVar.f15177b.removeListener(bVar);
                        eVar.D = null;
                    }
                }
                Drawable drawable2 = eVar.A;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f7057a == null) {
                        aVar.f7057a = new ua.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f7057a);
                } else if (aVar != null) {
                    if (eVar.E == null) {
                        eVar.E = new ArrayList();
                    }
                    if (!eVar.E.contains(aVar)) {
                        eVar.E.add(aVar);
                        if (eVar.D == null) {
                            eVar.D = new cg.b(eVar, 7);
                        }
                        cVar.f15177b.addListener(eVar.D);
                    }
                }
            }
            Drawable drawable3 = this.L;
            if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(2131361959, 2131363118, eVar, false);
                ((AnimatedStateListDrawable) this.L).addTransition(2131362744, 2131363118, eVar, false);
            }
        }
        Drawable drawable4 = this.L;
        if (drawable4 != null && (colorStateList2 = this.O) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.M;
        if (drawable5 != null && (colorStateList = this.P) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.L;
        Drawable drawable7 = this.M;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f3 = intrinsicWidth / intrinsicHeight;
                if (f3 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f3);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f3 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override
    public Drawable getButtonDrawable() {
        return this.L;
    }

    public Drawable getButtonIconDrawable() {
        return this.M;
    }

    public ColorStateList getButtonIconTintList() {
        return this.P;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.Q;
    }

    @Override
    public ColorStateList getButtonTintList() {
        return this.O;
    }

    public int getCheckedState() {
        return this.R;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.K;
    }

    @Override
    public final boolean isChecked() {
        return this.R == 1;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H && this.O == null && this.P == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7059b0);
        }
        if (this.J) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7060c0);
        }
        for (int i11 = 0; i11 < iArrOnCreateDrawableState.length; i11++) {
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
            }
            this.S = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.S = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.I || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.J) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.K));
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.A);
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.A = getCheckedState();
        return bVar;
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(f.f0(getContext(), i10));
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        this.L = drawable;
        this.N = false;
        a();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.M = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(f.f0(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.P == colorStateList) {
            return;
        }
        this.P = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.Q == mode) {
            return;
        }
        this.Q = mode;
        a();
    }

    @Override
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.O == colorStateList) {
            return;
        }
        this.O = colorStateList;
        a();
    }

    @Override
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.I = z10;
    }

    @Override
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.R != i10) {
            this.R = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            if (this.U == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.T) {
                return;
            }
            this.T = true;
            LinkedHashSet linkedHashSet = this.F;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw a1.b.j(it);
                }
            }
            if (this.R != 2 && (onCheckedChangeListener = this.V) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.T = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.K = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.J == z10) {
            return;
        }
        this.J = z10;
        refreshDrawableState();
        Iterator it = this.E.iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
    }

    @Override
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.V = onCheckedChangeListener;
    }

    @Override
    public void setStateDescription(CharSequence charSequence) {
        this.U = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.H = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override
    public final void toggle() {
        setChecked(!isChecked());
    }
}
