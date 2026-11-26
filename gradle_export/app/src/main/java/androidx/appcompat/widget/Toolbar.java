package androidx.appcompat.widget;

import a50.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a1;
import com.google.android.material.datepicker.l;
import hf.c;
import j.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k9.x0;
import n.i;
import o10.b;
import o9.q;
import p.d1;
import p.f2;
import p.j;
import p.l2;
import p.m2;
import p.n2;
import p.o2;
import p.p2;
import p.q2;
import p.s2;
import p.t2;
import p.v;
import p.v0;
import p.w;
import p30.f;
import z4.h0;
import z4.j0;
import z4.k;
import z4.m;
import z4.n;

public class Toolbar extends ViewGroup implements k {
    public ActionMenuView A;
    public v0 B;
    public v0 C;
    public v D;
    public w E;
    public final Drawable F;
    public final CharSequence G;
    public v H;
    public View I;
    public Context J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public f2 T;
    public int U;
    public int V;
    public final int W;

    public CharSequence f537a0;

    public CharSequence f538b0;

    public ColorStateList f539c0;

    public ColorStateList f540d0;

    public boolean f541e0;

    public boolean f542f0;

    public final ArrayList f543g0;

    public final ArrayList f544h0;

    public final int[] f545i0;

    public final m f546j0;

    public ArrayList f547k0;

    public p2 f548l0;

    public final q f549m0;

    public s2 f550n0;

    public j f551o0;

    public n2 f552p0;

    public androidx.media3.common.q f553q0;

    public c f554r0;

    public boolean f555s0;

    public OnBackInvokedCallback f556t0;

    public OnBackInvokedDispatcher f557u0;

    public boolean f558v0;

    public final d f559w0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 2130970053);
        this.W = 8388627;
        this.f543g0 = new ArrayList();
        this.f544h0 = new ArrayList();
        this.f545i0 = new int[2];
        this.f546j0 = new m(new l2(this, 1));
        this.f547k0 = new ArrayList();
        this.f549m0 = new q(this, 5);
        this.f559w0 = new d(this, 16);
        Context context2 = getContext();
        int[] iArr = a.f7736w;
        x0 x0VarK = x0.K(context2, attributeSet, iArr, 2130970053);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = j0.f17198a;
        h0.b(this, context, iArr, attributeSet, typedArray, 2130970053, 0);
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        this.L = typedArray2.getResourceId(28, 0);
        this.M = typedArray2.getResourceId(19, 0);
        this.W = typedArray2.getInteger(0, 8388627);
        this.N = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.S = dimensionPixelOffset;
        this.R = dimensionPixelOffset;
        this.Q = dimensionPixelOffset;
        this.P = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.P = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.Q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.R = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.S = dimensionPixelOffset5;
        }
        this.O = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        d();
        f2 f2Var = this.T;
        f2Var.f12162h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            f2Var.f12159e = dimensionPixelSize;
            f2Var.f12155a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            f2Var.f12160f = dimensionPixelSize2;
            f2Var.f12156b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            f2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.U = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.V = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.F = x0VarK.v(4);
        this.G = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.J = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawableV = x0VarK.v(16);
        if (drawableV != null) {
            setNavigationIcon(drawableV);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableV2 = x0VarK.v(11);
        if (drawableV2 != null) {
            setLogo(drawableV2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(x0VarK.t(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(x0VarK.t(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        x0VarK.O();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i(getContext());
    }

    public static o2 h() {
        o2 o2Var = new o2(-2, -2);
        o2Var.f12192b = 0;
        o2Var.f12191a = 8388627;
        return o2Var;
    }

    public static o2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof o2;
        if (z10) {
            o2 o2Var = (o2) layoutParams;
            o2 o2Var2 = new o2(o2Var);
            o2Var2.f12192b = 0;
            o2Var2.f12192b = o2Var.f12192b;
            return o2Var2;
        }
        if (z10) {
            o2 o2Var3 = new o2((o2) layoutParams);
            o2Var3.f12192b = 0;
            return o2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            o2 o2Var4 = new o2(layoutParams);
            o2Var4.f12192b = 0;
            return o2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        o2 o2Var5 = new o2(marginLayoutParams);
        o2Var5.f12192b = 0;
        ((ViewGroup.MarginLayoutParams) o2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return o2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                o2 o2Var = (o2) childAt.getLayoutParams();
                if (o2Var.f12192b == 0 && t(childAt)) {
                    int i12 = o2Var.f12191a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            o2 o2Var2 = (o2) childAt2.getLayoutParams();
            if (o2Var2.f12192b == 0 && t(childAt2)) {
                int i14 = o2Var2.f12191a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override
    public final void addMenuProvider(n nVar) {
        m mVar = this.f546j0;
        mVar.f17207b.add(nVar);
        mVar.f17206a.run();
    }

    public final void b(View view, boolean z10) {
        o2 o2VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            o2VarI = h();
        } else {
            o2VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (o2) layoutParams;
        }
        o2VarI.f12192b = 1;
        if (!z10 || this.I == null) {
            addView(view, o2VarI);
        } else {
            view.setLayoutParams(o2VarI);
            this.f544h0.add(view);
        }
    }

    public final void c() {
        if (this.H == null) {
            v vVar = new v(getContext(), null, 2130970052);
            this.H = vVar;
            vVar.setImageDrawable(this.F);
            this.H.setContentDescription(this.G);
            o2 o2VarH = h();
            o2VarH.f12191a = (this.N & 112) | 8388611;
            o2VarH.f12192b = 2;
            this.H.setLayoutParams(o2VarH);
            this.H.setOnClickListener(new l(this, 5));
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o2);
    }

    public final void d() {
        if (this.T == null) {
            f2 f2Var = new f2();
            f2Var.f12155a = 0;
            f2Var.f12156b = 0;
            f2Var.f12157c = Integer.MIN_VALUE;
            f2Var.f12158d = Integer.MIN_VALUE;
            f2Var.f12159e = 0;
            f2Var.f12160f = 0;
            f2Var.f12161g = false;
            f2Var.f12162h = false;
            this.T = f2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.A;
        if (actionMenuView.P == null) {
            o.l lVar = (o.l) actionMenuView.getMenu();
            if (this.f552p0 == null) {
                this.f552p0 = new n2(this);
            }
            this.A.setExpandedActionViewsExclusive(true);
            lVar.b(this.f552p0, this.J);
            v();
        }
    }

    public final void f() {
        if (this.A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A = actionMenuView;
            actionMenuView.setPopupTheme(this.K);
            this.A.setOnMenuItemClickListener(this.f549m0);
            ActionMenuView actionMenuView2 = this.A;
            androidx.media3.common.q qVar = this.f553q0;
            b bVar = new b(this, 7);
            actionMenuView2.U = qVar;
            actionMenuView2.V = bVar;
            o2 o2VarH = h();
            o2VarH.f12191a = (this.N & 112) | 8388613;
            this.A.setLayoutParams(o2VarH);
            b(this.A, false);
        }
    }

    public final void g() {
        if (this.D == null) {
            this.D = new v(getContext(), null, 2130970052);
            o2 o2VarH = h();
            o2VarH.f12191a = (this.N & 112) | 8388611;
            this.D.setLayoutParams(o2VarH);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        o2 o2Var = new o2(context, attributeSet);
        o2Var.f12191a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7717b);
        o2Var.f12191a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        o2Var.f12192b = 0;
        return o2Var;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.H;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.H;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        f2 f2Var = this.T;
        if (f2Var != null) {
            return f2Var.f12161g ? f2Var.f12155a : f2Var.f12156b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.V;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        f2 f2Var = this.T;
        if (f2Var != null) {
            return f2Var.f12155a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        f2 f2Var = this.T;
        if (f2Var != null) {
            return f2Var.f12156b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        f2 f2Var = this.T;
        if (f2Var != null) {
            return f2Var.f12161g ? f2Var.f12156b : f2Var.f12155a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.U;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o.l lVar;
        ActionMenuView actionMenuView = this.A;
        return (actionMenuView == null || (lVar = actionMenuView.P) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.V, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.U, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.A.getMenu();
    }

    public View getNavButtonView() {
        return this.D;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.D;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.D;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.f551o0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.A.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.J;
    }

    public int getPopupTheme() {
        return this.K;
    }

    public CharSequence getSubtitle() {
        return this.f538b0;
    }

    public final TextView getSubtitleTextView() {
        return this.C;
    }

    public CharSequence getTitle() {
        return this.f537a0;
    }

    public int getTitleMarginBottom() {
        return this.S;
    }

    public int getTitleMarginEnd() {
        return this.Q;
    }

    public int getTitleMarginStart() {
        return this.P;
    }

    public int getTitleMarginTop() {
        return this.R;
    }

    public final TextView getTitleTextView() {
        return this.B;
    }

    public d1 getWrapper() {
        if (this.f550n0 == null) {
            this.f550n0 = new s2(this, true);
        }
        return this.f550n0;
    }

    public final int j(View view, int i10) {
        o2 o2Var = (o2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = o2Var.f12191a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.W & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) o2Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f547k0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f546j0.f17207b.iterator();
        while (it2.hasNext()) {
            ((a1) ((n) it2.next())).f689a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f547k0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f544h0.contains(view);
    }

    public final boolean o() {
        j jVar;
        ActionMenuView actionMenuView = this.A;
        return (actionMenuView == null || (jVar = actionMenuView.T) == null || !jVar.k()) ? false : true;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f559w0);
        v();
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f542f0 = false;
        }
        if (!this.f542f0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f542f0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f542f0 = false;
        return true;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        v0 v0Var;
        v0 v0Var2;
        o2 o2Var;
        o2 o2Var2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList;
        int size;
        int iP2;
        int i27;
        int size2;
        int i28;
        int i29;
        int size3;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f545i0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = j0.f17198a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (t(this.D)) {
            if (z12) {
                iQ = q(this.D, i35, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(this.D, paddingLeft, iMin2, iArr);
            }
            if (t(this.H)) {
                if (z12) {
                    iQ = q(this.H, iQ, iMin2, iArr);
                } else {
                    iP = p(this.H, iP, iMin2, iArr);
                }
            }
            if (t(this.A)) {
                if (z12) {
                    iP = p(this.A, iP, iMin2, iArr);
                } else {
                    iQ = q(this.A, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i35 - currentContentInsetRight);
            if (t(this.I)) {
                if (z12) {
                    iMin = q(this.I, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.I, iMax, iMin2, iArr);
                }
            }
            if (t(this.E)) {
                if (z12) {
                    iMin = q(this.E, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.E, iMax, iMin2, iArr);
                }
            }
            zT = t(this.B);
            zT2 = t(this.C);
            if (zT) {
                o2 o2Var3 = (o2) this.B.getLayoutParams();
                measuredHeight = this.B.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o2Var3).topMargin + ((ViewGroup.MarginLayoutParams) o2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                o2 o2Var4 = (o2) this.C.getLayoutParams();
                measuredHeight = this.C.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o2Var4).topMargin + ((ViewGroup.MarginLayoutParams) o2Var4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    v0Var = this.B;
                } else {
                    v0Var = this.C;
                }
                if (zT2) {
                    v0Var2 = this.C;
                } else {
                    v0Var2 = this.B;
                }
                o2Var = (o2) v0Var.getLayoutParams();
                o2Var2 = (o2) v0Var2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zT && this.B.getMeasuredWidth() > 0) || (zT2 && this.C.getMeasuredWidth() > 0);
                i15 = this.W & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
                    if (iMax2 < i23) {
                        iMax2 = i23;
                    } else {
                        i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin;
                        i26 = this.S;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin) - this.S) - i14;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.P;
                    } else {
                        i20 = 0;
                    }
                    int i36 = i20 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zT) {
                        o2 o2Var5 = (o2) this.B.getLayoutParams();
                        int measuredWidth2 = iMin - this.B.getMeasuredWidth();
                        int measuredHeight2 = this.B.getMeasuredHeight() + paddingTop;
                        this.B.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth2 - this.Q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) o2Var5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zT2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                        this.C.layout(iMin - this.C.getMeasuredWidth(), i37, iMin, this.C.getMeasuredHeight() + i37);
                        i22 = iMin - this.Q;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = i16;
                } else {
                    if (z11) {
                        i17 = this.P;
                    } else {
                        i17 = 0;
                    }
                    int i38 = i17 - iArr[0];
                    iMax = Math.max(0, i38) + i16;
                    iArr[0] = Math.max(0, -i38);
                    if (zT) {
                        o2 o2Var6 = (o2) this.B.getLayoutParams();
                        int measuredWidth3 = this.B.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.B.getMeasuredHeight() + paddingTop;
                        this.B.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i18 = measuredWidth3 + this.Q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) o2Var6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zT2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.C.getMeasuredWidth() + iMax;
                        this.C.layout(iMax, i39, measuredWidth4, this.C.getMeasuredHeight() + i39);
                        i19 = measuredWidth4 + this.Q;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
            }
            arrayList = this.f543g0;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i27 = 0; i27 < size; i27++) {
                iP2 = p((View) arrayList.get(i27), iP2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = q((View) arrayList.get(i28), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i40 = iArr[0];
            i29 = iArr[1];
            size3 = arrayList.size();
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                o2 o2Var7 = (o2) view.getLayoutParams();
                int i41 = i29;
                int i42 = ((ViewGroup.MarginLayoutParams) o2Var7).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) o2Var7).rightMargin - i41;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i30 = iMax5;
                i29 = iMax6;
            }
            i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iP2) {
                if (i34 > iMin) {
                    iP2 = i33 - (i34 - iMin);
                } else {
                    iP2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iP2 = p((View) arrayList.get(i32), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i35;
        if (t(this.H)) {
            if (z12) {
                iQ = q(this.H, iQ, iMin2, iArr);
            } else {
                iP = p(this.H, iP, iMin2, iArr);
            }
        }
        if (t(this.A)) {
            if (z12) {
                iP = p(this.A, iP, iMin2, iArr);
            } else {
                iQ = q(this.A, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i35 - currentContentInsetRight2);
        if (t(this.I)) {
            if (z12) {
                iMin = q(this.I, iMin, iMin2, iArr);
            } else {
                iMax = p(this.I, iMax, iMin2, iArr);
            }
        }
        if (t(this.E)) {
            if (z12) {
                iMin = q(this.E, iMin, iMin2, iArr);
            } else {
                iMax = p(this.E, iMax, iMin2, iArr);
            }
        }
        zT = t(this.B);
        zT2 = t(this.C);
        if (zT) {
            o2 o2Var8 = (o2) this.B.getLayoutParams();
            measuredHeight = this.B.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o2Var8).topMargin + ((ViewGroup.MarginLayoutParams) o2Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            o2 o2Var9 = (o2) this.C.getLayoutParams();
            measuredHeight = this.C.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o2Var9).topMargin + ((ViewGroup.MarginLayoutParams) o2Var9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                v0Var = this.B;
            } else {
                v0Var = this.C;
            }
            if (zT2) {
                v0Var2 = this.C;
            } else {
                v0Var2 = this.B;
            }
            o2Var = (o2) v0Var.getLayoutParams();
            o2Var2 = (o2) v0Var2.getLayoutParams();
            i14 = measuredHeight;
            if (zT) {
            }
            i15 = this.W & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin;
                    i26 = this.S;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin) - this.S) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.P;
                } else {
                    i20 = 0;
                }
                int i310 = i20 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zT) {
                    o2 o2Var10 = (o2) this.B.getLayoutParams();
                    int measuredWidth5 = iMin - this.B.getMeasuredWidth();
                    int measuredHeight4 = this.B.getMeasuredHeight() + paddingTop;
                    this.B.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth5 - this.Q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) o2Var10).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zT2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                    this.C.layout(iMin - this.C.getMeasuredWidth(), i311, iMin, this.C.getMeasuredHeight() + i311);
                    i22 = iMin - this.Q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.P;
                } else {
                    i17 = 0;
                }
                int i312 = i17 - iArr[0];
                iMax = Math.max(0, i312) + i16;
                iArr[0] = Math.max(0, -i312);
                if (zT) {
                    o2 o2Var11 = (o2) this.B.getLayoutParams();
                    int measuredWidth6 = this.B.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.B.getMeasuredHeight() + paddingTop;
                    this.B.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i18 = measuredWidth6 + this.Q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) o2Var11).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zT2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.C.getMeasuredWidth() + iMax;
                    this.C.layout(iMax, i313, measuredWidth7, this.C.getMeasuredHeight() + i313);
                    i19 = measuredWidth7 + this.Q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zT) {
                v0Var = this.B;
            } else {
                v0Var = this.C;
            }
            if (zT2) {
                v0Var2 = this.C;
            } else {
                v0Var2 = this.B;
            }
            o2Var = (o2) v0Var.getLayoutParams();
            o2Var2 = (o2) v0Var2.getLayoutParams();
            i14 = measuredHeight;
            if (zT) {
            }
            i15 = this.W & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) o2Var).topMargin + this.R;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin;
                    i26 = this.S;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o2Var2).bottomMargin) - this.S) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.P;
                } else {
                    i20 = 0;
                }
                int i314 = i20 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zT) {
                    o2 o2Var12 = (o2) this.B.getLayoutParams();
                    int measuredWidth8 = iMin - this.B.getMeasuredWidth();
                    int measuredHeight6 = this.B.getMeasuredHeight() + paddingTop;
                    this.B.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth8 - this.Q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) o2Var12).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zT2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                    this.C.layout(iMin - this.C.getMeasuredWidth(), i315, iMin, this.C.getMeasuredHeight() + i315);
                    i22 = iMin - this.Q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.P;
                } else {
                    i17 = 0;
                }
                int i316 = i17 - iArr[0];
                iMax = Math.max(0, i316) + i16;
                iArr[0] = Math.max(0, -i316);
                if (zT) {
                    o2 o2Var13 = (o2) this.B.getLayoutParams();
                    int measuredWidth9 = this.B.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.B.getMeasuredHeight() + paddingTop;
                    this.B.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i18 = measuredWidth9 + this.Q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) o2Var13).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zT2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o2) this.C.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.C.getMeasuredWidth() + iMax;
                    this.C.layout(iMax, i317, measuredWidth10, this.C.getMeasuredHeight() + i317);
                    i19 = measuredWidth10 + this.Q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        arrayList = this.f543g0;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i27 < size) {
            iP2 = p((View) arrayList.get(i27), iP2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = q((View) arrayList.get(i28), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i44 = iArr[0];
        i29 = iArr[1];
        size3 = arrayList.size();
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            o2 o2Var14 = (o2) view2.getLayoutParams();
            int i45 = i29;
            int i46 = ((ViewGroup.MarginLayoutParams) o2Var14).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) o2Var14).rightMargin - i45;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i30 = iMax9;
            i29 = iMax10;
        }
        i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iP2) {
            if (i34 > iMin) {
                iP2 = i33 - (i34 - iMin);
            } else {
                iP2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iP2 = p((View) arrayList.get(i32), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        char c10;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c10 = 0;
        } else {
            c10 = 1;
            objArr = false;
        }
        if (t(this.D)) {
            s(this.D, i10, 0, i11, this.O);
            iK = k(this.D) + this.D.getMeasuredWidth();
            iMax = Math.max(0, l(this.D) + this.D.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.H)) {
            s(this.H, i10, 0, i11, this.O);
            iK = k(this.H) + this.H.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.H) + this.H.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f545i0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.A)) {
            s(this.A, i10, iMax3, i11, this.O);
            iK2 = k(this.A) + this.A.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c10] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.I)) {
            iMax5 += r(this.I, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.I) + this.I.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I.getMeasuredState());
        }
        if (t(this.E)) {
            iMax5 += r(this.E, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((o2) childAt.getLayoutParams()).f12192b == 0 && t(childAt)) {
                iMax5 += r(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.R + this.S;
        int i16 = this.P + this.Q;
        if (t(this.B)) {
            r(this.B, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.B) + this.B.getMeasuredWidth();
            iL = l(this.B) + this.B.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.B.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.C)) {
            iMax2 = Math.max(iMax2, r(this.C, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.C) + this.C.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.C.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f555s0) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof q2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q2 q2Var = (q2) parcelable;
        super.onRestoreInstanceState(q2Var.A);
        ActionMenuView actionMenuView = this.A;
        o.l lVar = actionMenuView != null ? actionMenuView.P : null;
        int i10 = q2Var.C;
        if (i10 != 0 && this.f552p0 != null && lVar != null && (menuItemFindItem = lVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (q2Var.D) {
            d dVar = this.f559w0;
            removeCallbacks(dVar);
            post(dVar);
        }
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        f2 f2Var = this.T;
        boolean z10 = i10 == 1;
        if (z10 == f2Var.f12161g) {
            return;
        }
        f2Var.f12161g = z10;
        if (!f2Var.f12162h) {
            f2Var.f12155a = f2Var.f12159e;
            f2Var.f12156b = f2Var.f12160f;
            return;
        }
        if (z10) {
            int i11 = f2Var.f12158d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = f2Var.f12159e;
            }
            f2Var.f12155a = i11;
            int i12 = f2Var.f12157c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = f2Var.f12160f;
            }
            f2Var.f12156b = i12;
            return;
        }
        int i13 = f2Var.f12157c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = f2Var.f12159e;
        }
        f2Var.f12155a = i13;
        int i14 = f2Var.f12158d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = f2Var.f12160f;
        }
        f2Var.f12156b = i14;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        o.n nVar;
        q2 q2Var = new q2(super.onSaveInstanceState());
        n2 n2Var = this.f552p0;
        if (n2Var != null && (nVar = n2Var.B) != null) {
            q2Var.C = nVar.f11424a;
        }
        q2Var.D = o();
        return q2Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f541e0 = false;
        }
        if (!this.f541e0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f541e0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f541e0 = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        o2 o2Var = (o2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) o2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o2Var).rightMargin + iMax;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        o2 o2Var = (o2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) o2Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) o2Var).leftMargin);
    }

    public final int r(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override
    public final void removeMenuProvider(n nVar) {
        this.f546j0.b(nVar);
    }

    public final void s(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f558v0 != z10) {
            this.f558v0 = z10;
            v();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.H;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(f.f0(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.H.setImageDrawable(drawable);
        } else {
            v vVar = this.H;
            if (vVar != null) {
                vVar.setImageDrawable(this.F);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f555s0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.V) {
            this.V = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.U) {
            this.U = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(f.f0(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.E == null) {
                this.E = new w(getContext(), null, 0);
            }
            if (!n(this.E)) {
                b(this.E, true);
            }
        } else {
            w wVar = this.E;
            if (wVar != null && n(wVar)) {
                removeView(this.E);
                this.f544h0.remove(this.E);
            }
        }
        w wVar2 = this.E;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.E == null) {
            this.E = new w(getContext(), null, 0);
        }
        w wVar = this.E;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        v vVar = this.D;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            t2.a(this.D, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(f.f0(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.D)) {
                b(this.D, true);
            }
        } else {
            v vVar = this.D;
            if (vVar != null && n(vVar)) {
                removeView(this.D);
                this.f544h0.remove(this.D);
            }
        }
        v vVar2 = this.D;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.D.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(p2 p2Var) {
        this.f548l0 = p2Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.A.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.K != i10) {
            this.K = i10;
            if (i10 == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            v0 v0Var = this.C;
            if (v0Var != null && n(v0Var)) {
                removeView(this.C);
                this.f544h0.remove(this.C);
            }
        } else {
            if (this.C == null) {
                Context context = getContext();
                v0 v0Var2 = new v0(context, null);
                this.C = v0Var2;
                v0Var2.setSingleLine();
                this.C.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.M;
                if (i10 != 0) {
                    this.C.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f540d0;
                if (colorStateList != null) {
                    this.C.setTextColor(colorStateList);
                }
            }
            if (!n(this.C)) {
                b(this.C, true);
            }
        }
        v0 v0Var3 = this.C;
        if (v0Var3 != null) {
            v0Var3.setText(charSequence);
        }
        this.f538b0 = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f540d0 = colorStateList;
        v0 v0Var = this.C;
        if (v0Var != null) {
            v0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            v0 v0Var = this.B;
            if (v0Var != null && n(v0Var)) {
                removeView(this.B);
                this.f544h0.remove(this.B);
            }
        } else {
            if (this.B == null) {
                Context context = getContext();
                v0 v0Var2 = new v0(context, null);
                this.B = v0Var2;
                v0Var2.setSingleLine();
                this.B.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.L;
                if (i10 != 0) {
                    this.B.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f539c0;
                if (colorStateList != null) {
                    this.B.setTextColor(colorStateList);
                }
            }
            if (!n(this.B)) {
                b(this.B, true);
            }
        }
        v0 v0Var3 = this.B;
        if (v0Var3 != null) {
            v0Var3.setText(charSequence);
        }
        this.f537a0 = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.S = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.Q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.P = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.R = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f539c0 = colorStateList;
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        j jVar;
        ActionMenuView actionMenuView = this.A;
        return (actionMenuView == null || (jVar = actionMenuView.T) == null || !jVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcherA = m2.a(this);
        n2 n2Var = this.f552p0;
        boolean z10 = (n2Var == null || n2Var.B == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f558v0) ? false : true;
        if (z10 && this.f557u0 == null) {
            if (this.f556t0 == null) {
                this.f556t0 = m2.b(new l2(this, 0));
            }
            m2.c(onBackInvokedDispatcherA, this.f556t0);
            this.f557u0 = onBackInvokedDispatcherA;
            return;
        }
        if (z10 || (onBackInvokedDispatcher = this.f557u0) == null) {
            return;
        }
        m2.d(onBackInvokedDispatcher, this.f556t0);
        this.f557u0 = null;
    }
}
