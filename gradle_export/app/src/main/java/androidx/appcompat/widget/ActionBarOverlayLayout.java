package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.media3.common.w0;
import cg.b;
import java.util.WeakHashMap;
import k.o0;
import n.k;
import o.l;
import o.w;
import p.c;
import p.c1;
import p.d;
import p.d1;
import p.e;
import p.j;
import p.n2;
import p.s2;
import p30.f;
import z4.d0;
import z4.g1;
import z4.i0;
import z4.j0;
import z4.j1;
import z4.p;
import z4.q;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.x0;

public class ActionBarOverlayLayout extends ViewGroup implements c1, p, q {

    public static final int[] f525f0 = {2130968582, R.attr.windowContentOverlay};

    public static final j1 f526g0;

    public static final Rect f527h0;
    public int A;
    public int B;
    public ContentFrameLayout C;
    public ActionBarContainer D;
    public d1 E;
    public Drawable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public final Rect M;
    public final Rect N;
    public final Rect O;
    public final Rect P;
    public j1 Q;
    public j1 R;
    public j1 S;
    public j1 T;
    public c U;
    public OverScroller V;
    public ViewPropertyAnimator W;

    public final b f528a0;

    public final p.b f529b0;

    public final p.b f530c0;

    public final w0 f531d0;

    public final e f532e0;

    static {
        x0 u0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            u0Var = new z4.w0();
        } else if (i10 >= 35) {
            u0Var = new v0();
        } else {
            u0Var = i10 >= 34 ? new u0() : new t0();
        }
        u0Var.g(q4.b.c(0, 1, 0, 1));
        f526g0 = u0Var.b();
        f527h0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.M = new Rect();
        this.N = new Rect();
        this.O = new Rect();
        this.P = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        j1 j1Var = j1.f17201b;
        this.Q = j1Var;
        this.R = j1Var;
        this.S = j1Var;
        this.T = j1Var;
        this.f528a0 = new b(this, 4);
        this.f529b0 = new p.b(this, 0);
        this.f530c0 = new p.b(this, 1);
        i(context);
        this.f531d0 = new w0();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.f532e0 = eVar;
        addView(eVar);
    }

    public static boolean a(View view, Rect rect, boolean z10) {
        boolean z11;
        d dVar = (d) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.f529b0);
        removeCallbacks(this.f530c0);
        ViewPropertyAnimator viewPropertyAnimator = this.W;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        d(view, i10, i11, i12, i13, i14);
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.F != null) {
            if (this.D.getVisibility() == 0) {
                translationY = (int) (this.D.getTranslationY() + this.D.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.F.setBounds(0, translationY, getWidth(), this.F.getIntrinsicHeight() + translationY);
            this.F.draw(canvas);
        }
    }

    @Override
    public final boolean e(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override
    public final void f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override
    public final void g(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.D;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override
    public int getNestedScrollAxes() {
        w0 w0Var = this.f531d0;
        return w0Var.f1664b | w0Var.f1663a;
    }

    public CharSequence getTitle() {
        k();
        return ((s2) this.E).f12208a.getTitle();
    }

    @Override
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f525f0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.F = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.V = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 == 2) {
            ((s2) this.E).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((s2) this.E).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        d1 wrapper;
        if (this.C == null) {
            this.C = (ContentFrameLayout) findViewById(2131361845);
            this.D = (ActionBarContainer) findViewById(2131361846);
            KeyEvent.Callback callbackFindViewById = findViewById(2131361844);
            if (callbackFindViewById instanceof d1) {
                wrapper = (d1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.E = wrapper;
        }
    }

    public final void l(Menu menu, w wVar) {
        k();
        s2 s2Var = (s2) this.E;
        Toolbar toolbar = s2Var.f12208a;
        if (s2Var.m == null) {
            s2Var.m = new j(toolbar.getContext());
        }
        j jVar = s2Var.m;
        jVar.E = wVar;
        l lVar = (l) menu;
        if (lVar == null && toolbar.A == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.A.P;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f551o0);
            lVar2.r(toolbar.f552p0);
        }
        if (toolbar.f552p0 == null) {
            toolbar.f552p0 = new n2(toolbar);
        }
        jVar.Q = true;
        if (lVar != null) {
            lVar.b(jVar, toolbar.J);
            lVar.b(toolbar.f552p0, toolbar.J);
        } else {
            jVar.b(toolbar.J, null);
            toolbar.f552p0.b(toolbar.J, null);
            jVar.f();
            toolbar.f552p0.f();
        }
        toolbar.A.setPopupTheme(toolbar.K);
        toolbar.A.setPresenter(jVar);
        toolbar.f551o0 = jVar;
        toolbar.v();
    }

    @Override
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        j1 j1VarG = j1.g(this, windowInsets);
        boolean zA = a(this.D, new Rect(j1VarG.b(), j1VarG.d(), j1VarG.c(), j1VarG.a()), false);
        WeakHashMap weakHashMap = j0.f17198a;
        Rect rect = this.M;
        d0.a(this, j1VarG, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        g1 g1Var = j1VarG.f17202a;
        j1 j1VarR = g1Var.r(i10, i11, i12, i13);
        this.Q = j1VarR;
        boolean z10 = true;
        if (!this.R.equals(j1VarR)) {
            this.R = this.Q;
            zA = true;
        }
        Rect rect2 = this.N;
        if (rect2.equals(rect)) {
            z10 = zA;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return g1Var.a().f17202a.c().f17202a.b().f();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = j0.f17198a;
        requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        j1 j1Var;
        int i12;
        x0 t0Var;
        k();
        measureChildWithMargins(this.D, i10, 0, i11, 0);
        d dVar = (d) this.D.getLayoutParams();
        int iMax = Math.max(0, this.D.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int iMax2 = Math.max(0, this.D.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.D.getMeasuredState());
        WeakHashMap weakHashMap = j0.f17198a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.A;
            if (this.H && this.D.getTabContainer() != null) {
                measuredHeight += this.A;
            }
        } else {
            measuredHeight = this.D.getVisibility() != 8 ? this.D.getMeasuredHeight() : 0;
        }
        Rect rect = this.M;
        Rect rect2 = this.O;
        rect2.set(rect);
        this.S = this.Q;
        if (this.G || z10) {
            q4.b bVarC = q4.b.c(this.S.b(), this.S.d() + measuredHeight, this.S.c(), this.S.a());
            j1Var = this.S;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 36) {
                t0Var = new z4.w0(j1Var);
            } else if (i12 >= 35) {
                t0Var = new v0(j1Var);
            } else if (i12 >= 34) {
                t0Var = new u0(j1Var);
            } else {
                t0Var = new t0(j1Var);
            }
            t0Var.g(bVarC);
            this.S = t0Var.b();
        } else {
            e eVar = this.f532e0;
            j1 j1Var2 = f526g0;
            Rect rect3 = this.P;
            d0.a(eVar, j1Var2, rect3);
            if (rect3.equals(f527h0)) {
                q4.b bVarC2 = q4.b.c(this.S.b(), this.S.d() + measuredHeight, this.S.c(), this.S.a());
                j1Var = this.S;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 36) {
                    t0Var = new z4.w0(j1Var);
                } else if (i12 >= 35) {
                    t0Var = new v0(j1Var);
                } else if (i12 >= 34) {
                    t0Var = new u0(j1Var);
                } else {
                    t0Var = new t0(j1Var);
                }
                t0Var.g(bVarC2);
                this.S = t0Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.S = this.S.f17202a.r(0, measuredHeight, 0, 0);
            }
        }
        a(this.C, rect2, true);
        if (!this.T.equals(this.S)) {
            j1 j1Var3 = this.S;
            this.T = j1Var3;
            ContentFrameLayout contentFrameLayout = this.C;
            WindowInsets windowInsetsF = j1Var3.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = i0.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    j1.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.C, i10, 0, i11, 0);
        d dVar2 = (d) this.C.getLayoutParams();
        int iMax3 = Math.max(iMax, this.C.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.C.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.C.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (!this.I || !z10) {
            return false;
        }
        this.V.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.V.getFinalY() > this.D.getHeight()) {
            b();
            this.f530c0.run();
        } else {
            b();
            this.f529b0.run();
        }
        this.J = true;
        return true;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.K + i11;
        this.K = i14;
        setActionBarHideOffset(i14);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        o0 o0Var;
        k kVar;
        this.f531d0.f1663a = i10;
        this.K = getActionBarHideOffset();
        b();
        c cVar = this.U;
        if (cVar == null || (kVar = (o0Var = (o0) cVar).f8444s) == null) {
            return;
        }
        kVar.a();
        o0Var.f8444s = null;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.D.getVisibility() != 0) {
            return false;
        }
        return this.I;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        if (!this.I || this.J) {
            return;
        }
        if (this.K <= this.D.getHeight()) {
            b();
            postDelayed(this.f529b0, 600L);
        } else {
            b();
            postDelayed(this.f530c0, 600L);
        }
    }

    @Override
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.L ^ i10;
        this.L = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        c cVar = this.U;
        if (cVar != null) {
            o0 o0Var = (o0) cVar;
            o0Var.f8440o = !z11;
            if (z10 || !z11) {
                if (o0Var.f8441p) {
                    o0Var.f8441p = false;
                    o0Var.w(true);
                }
            } else if (!o0Var.f8441p) {
                o0Var.f8441p = true;
                o0Var.w(true);
            }
        }
        if ((i11 & 256) == 0 || this.U == null) {
            return;
        }
        WeakHashMap weakHashMap = j0.f17198a;
        requestApplyInsets();
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.B = i10;
        c cVar = this.U;
        if (cVar != null) {
            ((o0) cVar).f8439n = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.D.setTranslationY(-Math.max(0, Math.min(i10, this.D.getHeight())));
    }

    public void setActionBarVisibilityCallback(c cVar) {
        this.U = cVar;
        if (getWindowToken() != null) {
            ((o0) this.U).f8439n = this.B;
            int i10 = this.L;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = j0.f17198a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.H = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.I) {
            this.I = z10;
            if (z10) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        s2 s2Var = (s2) this.E;
        s2Var.f12211d = i10 != 0 ? f.f0(s2Var.f12208a.getContext(), i10) : null;
        s2Var.d();
    }

    public void setIcon(Drawable drawable) {
        k();
        s2 s2Var = (s2) this.E;
        s2Var.f12211d = drawable;
        s2Var.d();
    }

    public void setLogo(int i10) {
        k();
        s2 s2Var = (s2) this.E;
        s2Var.f12212e = i10 != 0 ? f.f0(s2Var.f12208a.getContext(), i10) : null;
        s2Var.d();
    }

    public void setOverlayMode(boolean z10) {
        this.G = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((s2) this.E).f12218k = callback;
    }

    @Override
    public void setWindowTitle(CharSequence charSequence) {
        k();
        s2 s2Var = (s2) this.E;
        if (s2Var.f12214g) {
            return;
        }
        Toolbar toolbar = s2Var.f12208a;
        s2Var.f12215h = charSequence;
        if ((s2Var.f12209b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s2Var.f12214g) {
                j0.h(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
