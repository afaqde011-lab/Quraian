package vg;

import ab.a0;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c3.j3;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k9.x0;
import p.v0;

public final class n extends LinearLayout {
    public final TextInputLayout A;
    public final FrameLayout B;
    public final CheckableImageButton C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public View.OnLongClickListener F;
    public final CheckableImageButton G;
    public final q1 H;
    public int I;
    public final LinkedHashSet J;
    public ColorStateList K;
    public PorterDuff.Mode L;
    public int M;
    public ImageView.ScaleType N;
    public View.OnLongClickListener O;
    public CharSequence P;
    public final v0 Q;
    public boolean R;
    public EditText S;
    public final AccessibilityManager T;
    public AccessibilityManager.TouchExplorationStateChangeListener U;
    public final l V;

    public n(TextInputLayout textInputLayout, x0 x0Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.I = 0;
        this.J = new LinkedHashSet();
        this.V = new l(this);
        m mVar = new m(this);
        this.T = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.B = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, 2131363083);
        this.C = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, 2131363082);
        this.G = checkableImageButtonA2;
        this.H = new q1(this, x0Var);
        v0 v0Var = new v0(getContext(), null);
        this.Q = v0Var;
        TypedArray typedArray = (TypedArray) x0Var.C;
        if (typedArray.hasValue(38)) {
            this.D = g4.K(getContext(), x0Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.E = ng.j.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(x0Var.v(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(2131886430));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.K = g4.K(getContext(), x0Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.L = ng.j.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.K = g4.K(getContext(), x0Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.L = ng.j.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131166215));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.M) {
            this.M = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeG = a0.G(typedArray.getInt(31, -1));
            this.N = scaleTypeG;
            checkableImageButtonA2.setScaleType(scaleTypeG);
            checkableImageButtonA.setScaleType(scaleTypeG);
        }
        v0Var.setVisibility(8);
        v0Var.setId(2131363091);
        v0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        v0Var.setAccessibilityLiveRegion(1);
        v0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            v0Var.setTextColor(x0Var.t(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.P = TextUtils.isEmpty(text3) ? null : text3;
        v0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(v0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.F0.add(mVar);
        if (textInputLayout.E != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new j3(this, 6));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(2131558742, viewGroup, false);
        checkableImageButton.setId(i10);
        if (g4.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o eVar;
        int i10 = this.I;
        q1 q1Var = this.H;
        SparseArray sparseArray = (SparseArray) q1Var.f4032d;
        o oVar = (o) sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        n nVar = (n) q1Var.f4033e;
        if (i10 == -1) {
            eVar = new e(nVar, 0);
        } else if (i10 == 0) {
            eVar = new e(nVar, 1);
        } else if (i10 == 1) {
            eVar = new t(nVar, q1Var.f4031c);
        } else if (i10 == 2) {
            eVar = new d(nVar);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(g4.c.f(i10, "Invalid end icon mode: "));
            }
            eVar = new k(nVar);
        }
        sparseArray.append(i10, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.G;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.Q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.B.getVisibility() == 0 && this.G.getVisibility() == 0;
    }

    public final boolean e() {
        return this.C.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean z12;
        o oVarB = b();
        boolean zJ = oVarB.j();
        CheckableImageButton checkableImageButton = this.G;
        boolean z13 = true;
        if (!zJ || (z12 = checkableImageButton.D) == oVarB.k()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == ((k) oVarB).l) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z13) {
            a0.w0(this.A, checkableImageButton, this.K);
        }
    }

    public final void g(int i10) {
        if (this.I == i10) {
            return;
        }
        o oVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.U;
        AccessibilityManager accessibilityManager = this.T;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.U = null;
        oVarB.r();
        this.I = i10;
        Iterator it = this.J.iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        h(i10 != 0);
        o oVarB2 = b();
        int iD = this.H.f4030b;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableF0 = iD != 0 ? p30.f.f0(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.G;
        checkableImageButton.setImageDrawable(drawableF0);
        TextInputLayout textInputLayout = this.A;
        if (drawableF0 != null) {
            a0.n(textInputLayout, checkableImageButton, this.K, this.L);
            a0.w0(textInputLayout, checkableImageButton, this.K);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.j());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        oVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = oVarB2.h();
        this.U = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.U);
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.O;
        checkableImageButton.setOnClickListener(onClickListenerF);
        a0.B0(checkableImageButton, onLongClickListener);
        EditText editText = this.S;
        if (editText != null) {
            oVarB2.l(editText);
            j(oVarB2);
        }
        a0.n(textInputLayout, checkableImageButton, this.K, this.L);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.G.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.A.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.C;
        checkableImageButton.setImageDrawable(drawable);
        l();
        a0.n(this.A, checkableImageButton, this.D, this.E);
    }

    public final void j(o oVar) {
        if (this.S == null) {
            return;
        }
        if (oVar.e() != null) {
            this.S.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.G.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.B.setVisibility((this.G.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.P == null || this.R) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.C;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.A;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.K.f15685q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.I != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.A;
        if (textInputLayout.E == null) {
            return;
        }
        this.Q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(2131166065), textInputLayout.E.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.E.getPaddingEnd(), textInputLayout.E.getPaddingBottom());
    }

    public final void n() {
        v0 v0Var = this.Q;
        int visibility = v0Var.getVisibility();
        int i10 = (this.P == null || this.R) ? 8 : 0;
        if (visibility != i10) {
            b().o(i10 == 0);
        }
        k();
        v0Var.setVisibility(i10);
        this.A.s();
    }
}
