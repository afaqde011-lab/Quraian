package androidx.recyclerview.widget;

import a1.b;
import a1.u0;
import a20.g;
import a8.i0;
import aa.a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.media3.common.w0;
import b3.i2;
import ba.a0;
import ba.a1;
import ba.b0;
import ba.b1;
import ba.c0;
import ba.c1;
import ba.d0;
import ba.d1;
import ba.e0;
import ba.e1;
import ba.f1;
import ba.g0;
import ba.h;
import ba.h1;
import ba.k0;
import ba.l;
import ba.l0;
import ba.m0;
import ba.n;
import ba.n0;
import ba.p;
import ba.p0;
import ba.q0;
import ba.q1;
import ba.r0;
import ba.s0;
import ba.t0;
import ba.v0;
import ba.w;
import ba.x0;
import ba.y;
import ba.y0;
import ba.z;
import c3.a3;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import me.i;
import oi.k;
import u.q;
import z4.d;
import z4.f0;
import z4.h0;
import z4.j0;
import z4.o;

public class RecyclerView extends ViewGroup {

    public static boolean f1852b1 = false;

    public static boolean f1853c1 = false;

    public static final int[] f1854d1 = {R.attr.nestedScrollingEnabled};

    public static final float f1855e1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    public static final boolean f1856f1 = true;

    public static final boolean f1857g1 = true;

    public static final Class[] f1858h1;

    public static final c0 f1859i1;

    public static final c1 f1860j1;
    public final float A;
    public final float A0;
    public final x0 B;
    public final float B0;
    public final v0 C;
    public boolean C0;
    public y0 D;
    public final e1 D0;
    public final i2 E;
    public p E0;
    public final g F;
    public final n F0;
    public final u0 G;
    public final b1 G0;
    public boolean H;
    public s0 H0;
    public final b0 I;
    public ArrayList I0;
    public final Rect J;
    public boolean J0;
    public final Rect K;
    public boolean K0;
    public final RectF L;
    public final d0 L0;
    public g0 M;
    public boolean M0;
    public p0 N;
    public h1 N0;
    public final ArrayList O;
    public final int[] O0;
    public final ArrayList P;
    public o P0;
    public final ArrayList Q;
    public final int[] Q0;
    public l R;
    public final int[] R0;
    public boolean S;
    public final int[] S0;
    public boolean T;
    public final ArrayList T0;
    public boolean U;
    public final b0 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public int X0;
    public final boolean Y0;
    public final d0 Z0;

    public boolean f1861a0;

    public final d f1862a1;

    public boolean f1863b0;

    public int f1864c0;

    public boolean f1865d0;

    public final AccessibilityManager f1866e0;

    public boolean f1867f0;

    public boolean f1868g0;

    public int f1869h0;

    public int f1870i0;

    public l0 f1871j0;

    public EdgeEffect f1872k0;

    public EdgeEffect f1873l0;

    public EdgeEffect f1874m0;

    public EdgeEffect f1875n0;

    public m0 f1876o0;

    public int f1877p0;

    public int f1878q0;

    public VelocityTracker f1879r0;

    public int f1880s0;

    public int f1881t0;

    public int f1882u0;

    public int f1883v0;

    public int f1884w0;

    public r0 f1885x0;

    public final int f1886y0;

    public final int f1887z0;

    static {
        Class cls = Integer.TYPE;
        f1858h1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1859i1 = new c0(0);
        f1860j1 = new c1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969713);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        Constructor constructor;
        super(context, attributeSet, i10);
        this.B = new x0(this);
        this.C = new v0(this);
        int i12 = 9;
        this.G = new u0(9);
        this.I = new b0(this, 0);
        this.J = new Rect();
        this.K = new Rect();
        this.L = new RectF();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = 0;
        this.f1867f0 = false;
        this.f1868g0 = false;
        this.f1869h0 = 0;
        this.f1870i0 = 0;
        this.f1871j0 = f1860j1;
        h hVar = new h();
        Object[] objArr = null;
        hVar.f2347a = null;
        hVar.f2348b = new ArrayList();
        hVar.f2349c = 120L;
        hVar.f2350d = 120L;
        hVar.f2351e = 250L;
        hVar.f2352f = 250L;
        int i13 = 1;
        hVar.f2298g = true;
        hVar.f2299h = new ArrayList();
        hVar.f2300i = new ArrayList();
        hVar.f2301j = new ArrayList();
        hVar.f2302k = new ArrayList();
        hVar.l = new ArrayList();
        hVar.m = new ArrayList();
        hVar.f2303n = new ArrayList();
        hVar.f2304o = new ArrayList();
        hVar.f2305p = new ArrayList();
        hVar.f2306q = new ArrayList();
        hVar.f2307r = new ArrayList();
        this.f1876o0 = hVar;
        this.f1877p0 = 0;
        this.f1878q0 = -1;
        this.A0 = Float.MIN_VALUE;
        this.B0 = Float.MIN_VALUE;
        this.C0 = true;
        this.D0 = new e1(this);
        this.F0 = f1857g1 ? new n() : null;
        b1 b1Var = new b1();
        b1Var.f2238a = -1;
        b1Var.f2239b = 0;
        b1Var.f2240c = 0;
        b1Var.f2241d = 1;
        b1Var.f2242e = 0;
        b1Var.f2243f = false;
        b1Var.f2244g = false;
        b1Var.f2245h = false;
        b1Var.f2246i = false;
        b1Var.f2247j = false;
        b1Var.f2248k = false;
        this.G0 = b1Var;
        this.J0 = false;
        this.K0 = false;
        d0 d0Var = new d0(this);
        this.L0 = d0Var;
        this.M0 = false;
        this.O0 = new int[2];
        this.Q0 = new int[2];
        this.R0 = new int[2];
        this.S0 = new int[2];
        this.T0 = new ArrayList();
        this.U0 = new b0(this, i13);
        this.W0 = 0;
        this.X0 = 0;
        this.Z0 = new d0(this);
        this.f1862a1 = new d(getContext(), new e0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1884w0 = viewConfiguration.getScaledTouchSlop();
        this.A0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.B0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f1886y0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1887z0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1876o0.f2347a = d0Var;
        e0 e0Var = new e0(this);
        i2 i2Var = new i2();
        i2Var.f2045b = new e4.d(30);
        i2Var.f2046c = new ArrayList();
        i2Var.f2047d = new ArrayList();
        i2Var.f2044a = 0;
        i2Var.f2048e = e0Var;
        i2Var.f2049f = new i(i2Var, i12);
        this.E = i2Var;
        this.F = new g(new d0(this));
        WeakHashMap weakHashMap = j0.f17198a;
        if (f0.a(this) == 0) {
            f0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1866e0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h1(this));
        int[] iArr = a.f348a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        h0.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.H = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(b.l(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i11 = 4;
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131165403), resources.getDimensionPixelSize(2131165405), resources.getDimensionPixelOffset(2131165404));
        } else {
            i11 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.Y0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1858h1);
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = context;
                        objArr2[i13] = attributeSet;
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e3) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e3);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p0) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int[] iArr2 = f1854d1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        h0.b(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(2131362749, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewG = G(viewGroup.getChildAt(i10));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static f1 M(View view) {
        if (view == null) {
            return null;
        }
        return ((q0) view.getLayoutParams()).f2392a;
    }

    private o getScrollingChildHelper() {
        if (this.P0 == null) {
            this.P0 = new o(this);
        }
        return this.P0;
    }

    public static void l(f1 f1Var) {
        WeakReference weakReference = f1Var.f2276b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f1Var.f2275a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f1Var.f2276b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && e5.b.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(e5.b.c(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || e5.b.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f3 = i11;
        int iRound2 = Math.round(e5.b.c(edgeEffect2, (i10 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f1852b1 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f1853c1 = z10;
    }

    public final void A() {
        if (this.f1873l0 != null) {
            return;
        }
        ((c1) this.f1871j0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1873l0 = edgeEffect;
        if (this.H) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.M + ", layout:" + this.N + ", context:" + getContext();
    }

    public final void C(b1 b1Var) {
        if (getScrollState() != 2) {
            b1Var.getClass();
            return;
        }
        OverScroller overScroller = this.D0.C;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) arrayList.get(i10);
            int i11 = lVar.f2342v;
            if (i11 == 1) {
                boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        lVar.f2343w = 1;
                        lVar.f2336p = (int) motionEvent.getX();
                    } else if (zD) {
                        lVar.f2343w = 2;
                        lVar.m = (int) motionEvent.getY();
                    }
                    lVar.f(2);
                    if (action != 3) {
                        this.R = lVar;
                        return true;
                    }
                }
            } else if (i11 != 2) {
                continue;
            } else if (action != 3) {
                this.R = lVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int iZ = this.F.z();
        if (iZ == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iZ; i12++) {
            f1 f1VarM = M(this.F.y(i12));
            if (!f1VarM.o()) {
                int iB = f1VarM.b();
                if (iB < i10) {
                    i10 = iB;
                }
                if (iB > i11) {
                    i11 = iB;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final f1 H(int i10) {
        f1 f1Var = null;
        if (this.f1867f0) {
            return null;
        }
        int iC = this.F.C();
        for (int i11 = 0; i11 < iC; i11++) {
            f1 f1VarM = M(this.F.B(i11));
            if (f1VarM != null && !f1VarM.h() && J(f1VarM) == i10) {
                if (!((ArrayList) this.F.E).contains(f1VarM.f2275a)) {
                    return f1VarM;
                }
                f1Var = f1VarM;
            }
        }
        return f1Var;
    }

    public final boolean I(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        int minFlingVelocity;
        boolean z13;
        y yVarD;
        int iG;
        PointF pointFA;
        int i15;
        p0 p0Var = this.N;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f1861a0) {
            boolean zD = p0Var.d();
            boolean zE = this.N.e();
            int i16 = (!zD || Math.abs(i10) < i12) ? 0 : i10;
            int iMax2 = (!zE || Math.abs(i11) < i12) ? 0 : i11;
            if (i16 != 0 || iMax2 != 0) {
                if (i16 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f1872k0;
                    if (edgeEffect == null || e5.b.b(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f1874m0;
                        if (edgeEffect2 == null || e5.b.b(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (h0(this.f1874m0, i16, getWidth())) {
                            this.f1874m0.onAbsorb(i16);
                            i16 = 0;
                        }
                    } else {
                        int i17 = -i16;
                        if (h0(this.f1872k0, i17, getWidth())) {
                            this.f1872k0.onAbsorb(i17);
                            i16 = 0;
                        }
                    }
                    iMax = i16;
                    i16 = 0;
                }
                if (iMax2 == 0) {
                    i14 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.f1873l0;
                    if (edgeEffect3 == null || e5.b.b(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f1875n0;
                        if (edgeEffect4 == null || e5.b.b(edgeEffect4) == 0.0f) {
                            i14 = iMax2;
                            iMax2 = 0;
                        } else if (h0(this.f1875n0, iMax2, getHeight())) {
                            this.f1875n0.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i18 = -iMax2;
                        if (h0(this.f1873l0, i18, getHeight())) {
                            this.f1873l0.onAbsorb(i18);
                            iMax2 = 0;
                        }
                    }
                    i14 = 0;
                }
                e1 e1Var = this.D0;
                if (iMax != 0 || iMax2 != 0) {
                    int i19 = -i13;
                    iMax = Math.max(i19, Math.min(iMax, i13));
                    iMax2 = Math.max(i19, Math.min(iMax2, i13));
                    l0(1);
                    e1Var.a(iMax, iMax2);
                }
                if (i16 != 0 || i14 != 0) {
                    float f3 = i16;
                    float f10 = i14;
                    if (!dispatchNestedPreFling(f3, f10)) {
                        boolean z14 = zD || zE;
                        dispatchNestedFling(f3, f10, z14);
                        r0 r0Var = this.f1885x0;
                        if (r0Var != null) {
                            a0 a0Var = (a0) r0Var;
                            p0 layoutManager = a0Var.f2234a.getLayoutManager();
                            if (layoutManager == 0 || a0Var.f2234a.getAdapter() == null || ((Math.abs(i14) <= (minFlingVelocity = a0Var.f2234a.getMinFlingVelocity()) && Math.abs(i16) <= minFlingVelocity) || !((z13 = layoutManager instanceof a1)))) {
                                z10 = z14;
                                z11 = false;
                                z12 = true;
                            } else {
                                View view = null;
                                z zVar = !z13 ? null : new z(a0Var, a0Var.f2234a.getContext());
                                if (zVar == null) {
                                    z10 = z14;
                                    z11 = false;
                                    z12 = true;
                                } else {
                                    int iB = layoutManager.B();
                                    if (iB != 0) {
                                        if (layoutManager.e()) {
                                            yVarD = a0Var.e(layoutManager);
                                        } else {
                                            yVarD = layoutManager.d() ? a0Var.d(layoutManager) : null;
                                        }
                                        if (yVarD == null) {
                                            z10 = z14;
                                            z11 = false;
                                            z12 = true;
                                        } else {
                                            z11 = false;
                                            int iV = layoutManager.v();
                                            z12 = true;
                                            int i20 = 0;
                                            int i21 = Integer.MIN_VALUE;
                                            int i22 = Integer.MAX_VALUE;
                                            View view2 = null;
                                            while (i20 < iV) {
                                                boolean z15 = z14;
                                                View viewU = layoutManager.u(i20);
                                                if (viewU == null) {
                                                    i15 = iV;
                                                } else {
                                                    i15 = iV;
                                                    int iB2 = a0.b(viewU, yVarD);
                                                    if (iB2 <= 0 && iB2 > i21) {
                                                        view2 = viewU;
                                                        i21 = iB2;
                                                    }
                                                    if (iB2 >= 0 && iB2 < i22) {
                                                        view = viewU;
                                                        i22 = iB2;
                                                    }
                                                }
                                                i20++;
                                                z14 = z15;
                                                iV = i15;
                                            }
                                            z10 = z14;
                                            Object[] objArr = !layoutManager.d() ? i14 <= 0 : i16 <= 0;
                                            if (objArr == true && view != null) {
                                                iG = p0.G(view);
                                            } else if (objArr == true || view2 == null) {
                                                if (objArr != false) {
                                                    view = view2;
                                                }
                                                if (view != null) {
                                                    iG = ((z13 && (pointFA = ((a1) layoutManager).a(layoutManager.B() + (-1))) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + p0.G(view);
                                                    if (iG < 0 || iG >= iB) {
                                                    }
                                                }
                                            } else {
                                                iG = p0.G(view2);
                                            }
                                        }
                                        iG = -1;
                                    } else {
                                        z10 = z14;
                                        z11 = false;
                                        z12 = true;
                                        iG = -1;
                                    }
                                    if (iG != -1) {
                                        zVar.f2445a = iG;
                                        layoutManager.B0(zVar);
                                        return z12;
                                    }
                                }
                            }
                        } else {
                            z10 = z14;
                            z11 = false;
                            z12 = true;
                        }
                        if (!z10) {
                            return z11;
                        }
                        boolean z16 = z12;
                        l0(z16 ? 1 : 0);
                        int i23 = -i13;
                        e1Var.a(Math.max(i23, Math.min(i16, i13)), Math.max(i23, Math.min(i14, i13)));
                        return z16;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int J(f1 f1Var) {
        if ((f1Var.f2284j & 524) == 0 && f1Var.e()) {
            int i10 = f1Var.f2277c;
            ArrayList arrayList = (ArrayList) this.E.f2046c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ba.a aVar = (ba.a) arrayList.get(i11);
                int i12 = aVar.f2230a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = aVar.f2231b;
                        if (i13 <= i10) {
                            int i14 = aVar.f2233d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = aVar.f2231b;
                        if (i15 == i10) {
                            i10 = aVar.f2233d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (aVar.f2233d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (aVar.f2231b <= i10) {
                    i10 += aVar.f2233d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long K(f1 f1Var) {
        return this.M.hasStableIds() ? f1Var.f2279e : f1Var.f2277c;
    }

    public final f1 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        q0 q0Var = (q0) view.getLayoutParams();
        boolean z10 = q0Var.f2394c;
        Rect rect = q0Var.f2393b;
        if (!z10 || (this.G0.f2244g && (q0Var.f2392a.k() || q0Var.f2392a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.J;
            rect2.set(0, 0, 0, 0);
            ((n0) arrayList.get(i10)).getClass();
            ((q0) view.getLayoutParams()).f2392a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        q0Var.f2394c = false;
        return rect;
    }

    public final boolean O() {
        return !this.U || this.f1867f0 || this.E.m();
    }

    public final boolean P() {
        return this.f1869h0 > 0;
    }

    public final void Q(int i10) {
        if (this.N == null) {
            return;
        }
        setScrollState(2);
        this.N.q0(i10);
        awakenScrollBars();
    }

    public final void R() {
        int iC = this.F.C();
        for (int i10 = 0; i10 < iC; i10++) {
            ((q0) this.F.B(i10).getLayoutParams()).f2394c = true;
        }
        ArrayList arrayList = (ArrayList) this.C.f2442f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q0 q0Var = (q0) ((f1) arrayList.get(i11)).f2275a.getLayoutParams();
            if (q0Var != null) {
                q0Var.f2394c = true;
            }
        }
    }

    public final void S(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iC = this.F.C();
        for (int i13 = 0; i13 < iC; i13++) {
            f1 f1VarM = M(this.F.B(i13));
            if (f1VarM != null && !f1VarM.o()) {
                int i14 = f1VarM.f2277c;
                b1 b1Var = this.G0;
                if (i14 >= i12) {
                    if (f1853c1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f1VarM + " now at position " + (f1VarM.f2277c - i11));
                    }
                    f1VarM.l(-i11, z10);
                    b1Var.f2243f = true;
                } else if (i14 >= i10) {
                    if (f1853c1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f1VarM + " now REMOVED");
                    }
                    f1VarM.a(8);
                    f1VarM.l(-i11, z10);
                    f1VarM.f2277c = i10 - 1;
                    b1Var.f2243f = true;
                }
            }
        }
        v0 v0Var = this.C;
        ArrayList arrayList = (ArrayList) v0Var.f2442f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f1 f1Var = (f1) arrayList.get(size);
            if (f1Var != null) {
                int i15 = f1Var.f2277c;
                if (i15 >= i12) {
                    if (f1853c1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f1Var + " now at position " + (f1Var.f2277c - i11));
                    }
                    f1Var.l(-i11, z10);
                } else if (i15 >= i10) {
                    f1Var.a(8);
                    v0Var.k(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.f1869h0++;
    }

    public final void U(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f1869h0 - 1;
        this.f1869h0 = i11;
        if (i11 < 1) {
            if (f1852b1 && i11 < 0) {
                throw new IllegalStateException(b.l(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1869h0 = 0;
            if (z10) {
                int i12 = this.f1864c0;
                this.f1864c0 = 0;
                if (i12 != 0 && (accessibilityManager = this.f1866e0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.T0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f1 f1Var = (f1) arrayList.get(size);
                    if (f1Var.f2275a.getParent() == this && !f1Var.o() && (i10 = f1Var.f2289q) != -1) {
                        f1Var.f2275a.setImportantForAccessibility(i10);
                        f1Var.f2289q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1878q0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1878q0 = motionEvent.getPointerId(i10);
            int x2 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1882u0 = x2;
            this.f1880s0 = x2;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1883v0 = y10;
            this.f1881t0 = y10;
        }
    }

    public final void W() {
        if (this.M0 || !this.S) {
            return;
        }
        WeakHashMap weakHashMap = j0.f17198a;
        postOnAnimation(this.U0);
        this.M0 = true;
    }

    public final void X() {
        boolean z10;
        boolean z11 = false;
        if (this.f1867f0) {
            i2 i2Var = this.E;
            i2Var.t((ArrayList) i2Var.f2046c);
            i2Var.t((ArrayList) i2Var.f2047d);
            i2Var.f2044a = 0;
            if (this.f1868g0) {
                this.N.Z();
            }
        }
        if (this.f1876o0 == null || !this.N.C0()) {
            this.E.e();
        } else {
            this.E.s();
        }
        boolean z12 = this.J0 || this.K0;
        boolean z13 = this.U && this.f1876o0 != null && ((z10 = this.f1867f0) || z12 || this.N.f2382f) && (!z10 || this.M.hasStableIds());
        b1 b1Var = this.G0;
        b1Var.f2247j = z13;
        if (z13 && z12 && !this.f1867f0 && this.f1876o0 != null && this.N.C0()) {
            z11 = true;
        }
        b1Var.f2248k = z11;
    }

    public final void Y(boolean z10) {
        this.f1868g0 = z10 | this.f1868g0;
        this.f1867f0 = true;
        int iC = this.F.C();
        for (int i10 = 0; i10 < iC; i10++) {
            f1 f1VarM = M(this.F.B(i10));
            if (f1VarM != null && !f1VarM.o()) {
                f1VarM.a(6);
            }
        }
        R();
        v0 v0Var = this.C;
        ArrayList arrayList = (ArrayList) v0Var.f2442f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            if (f1Var != null) {
                f1Var.a(6);
                f1Var.a(1024);
            }
        }
        g0 g0Var = ((RecyclerView) v0Var.f2444h).M;
        if (g0Var == null || !g0Var.hasStableIds()) {
            v0Var.j();
        }
    }

    public final void Z(f1 f1Var, w0 w0Var) {
        f1Var.f2284j &= -8193;
        boolean z10 = this.G0.f2245h;
        u0 u0Var = this.G;
        if (z10 && f1Var.k() && !f1Var.h() && !f1Var.o()) {
            ((q) u0Var.C).e(f1Var, K(f1Var));
        }
        u.s0 s0Var = (u.s0) u0Var.B;
        q1 q1VarA = (q1) s0Var.get(f1Var);
        if (q1VarA == null) {
            q1VarA = q1.a();
            s0Var.put(f1Var, q1VarA);
        }
        q1VarA.f2398b = w0Var;
        q1VarA.f2397a |= 4;
    }

    public final void a0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1872k0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1872k0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f1873l0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1873l0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1874m0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1874m0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1875n0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1875n0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        p0 p0Var = this.N;
        if (p0Var != null) {
            p0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final int b0(float f3, int i10) {
        float height = f3 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f1872k0;
        float f10 = 0.0f;
        if (edgeEffect == null || e5.b.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1874m0;
            if (edgeEffect2 != null && e5.b.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1874m0.onRelease();
                } else {
                    float fC = e5.b.c(this.f1874m0, width, height);
                    if (e5.b.b(this.f1874m0) == 0.0f) {
                        this.f1874m0.onRelease();
                    }
                    f10 = fC;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1872k0.onRelease();
            } else {
                float f11 = -e5.b.c(this.f1872k0, -width, 1.0f - height);
                if (e5.b.b(this.f1872k0) == 0.0f) {
                    this.f1872k0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    public final int c0(float f3, int i10) {
        float width = f3 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f1873l0;
        float f10 = 0.0f;
        if (edgeEffect == null || e5.b.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1875n0;
            if (edgeEffect2 != null && e5.b.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1875n0.onRelease();
                } else {
                    float fC = e5.b.c(this.f1875n0, height, 1.0f - width);
                    if (e5.b.b(this.f1875n0) == 0.0f) {
                        this.f1875n0.onRelease();
                    }
                    f10 = fC;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1873l0.onRelease();
            } else {
                float f11 = -e5.b.c(this.f1873l0, -height, width);
                if (e5.b.b(this.f1873l0) == 0.0f) {
                    this.f1873l0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q0) && this.N.f((q0) layoutParams);
    }

    @Override
    public final int computeHorizontalScrollExtent() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.d()) {
            return this.N.j(this.G0);
        }
        return 0;
    }

    @Override
    public final int computeHorizontalScrollOffset() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.d()) {
            return this.N.k(this.G0);
        }
        return 0;
    }

    @Override
    public final int computeHorizontalScrollRange() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.d()) {
            return this.N.l(this.G0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollExtent() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.e()) {
            return this.N.m(this.G0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollOffset() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.e()) {
            return this.N.n(this.G0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollRange() {
        p0 p0Var = this.N;
        if (p0Var != null && p0Var.e()) {
            return this.N.o(this.G0);
        }
        return 0;
    }

    public final void d0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.J;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q0) {
            q0 q0Var = (q0) layoutParams;
            if (!q0Var.f2394c) {
                Rect rect2 = q0Var.f2393b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.N.n0(this, view, this.J, !this.U, view2 == null);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        p0 layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        i0(0, measuredHeight, false);
                        return true;
                    }
                    i0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zL = layoutManager.L();
                    if (keyCode == 122) {
                        if (zL) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zL) {
                        itemCount = getAdapter().getItemCount();
                    }
                    j0(itemCount);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        i0(measuredWidth, 0, false);
                        return true;
                    }
                    i0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zL2 = layoutManager.L();
                    if (keyCode2 == 122) {
                        if (zL2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zL2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    j0(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return getScrollingChildHelper().a(f3, f10, z10);
    }

    @Override
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return getScrollingChildHelper().b(f3, f10);
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, 0, iArr, null);
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1872k0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.H ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1872k0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1873l0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.H) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1873l0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1874m0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.H ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1874m0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1875n0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.H) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1875n0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f1876o0 == null || arrayList.size() <= 0 || !this.f1876o0.f()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        return super.drawChild(canvas, view, j9);
    }

    public final boolean e0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        boolean z12;
        p();
        g0 g0Var = this.M;
        int[] iArr = this.S0;
        if (g0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(iArr, i10, i11);
            i13 = iArr[0];
            i14 = iArr[1];
            i15 = i10 - i13;
            i16 = i11 - i14;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.P.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i13, i14, i15, i16, i12, this.Q0, iArr);
        int i17 = iArr[0];
        int i18 = i15 - i17;
        int i19 = iArr[1];
        int i20 = i16 - i19;
        boolean z13 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f1882u0;
        int[] iArr2 = this.Q0;
        int i22 = iArr2[0];
        this.f1882u0 = i21 - i22;
        int i23 = this.f1883v0;
        int i24 = iArr2[1];
        this.f1883v0 = i23 - i24;
        int[] iArr3 = this.R0;
        iArr3[0] = iArr3[0] + i22;
        iArr3[1] = iArr3[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || z3.I(motionEvent, 8194)) {
                z10 = true;
                z11 = false;
            } else {
                float x2 = motionEvent.getX();
                float f3 = i18;
                float y10 = motionEvent.getY();
                float f10 = i20;
                if (f3 < 0.0f) {
                    y();
                    z10 = true;
                    z11 = false;
                    e5.b.c(this.f1872k0, (-f3) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    z10 = true;
                    z11 = false;
                    if (f3 > 0.0f) {
                        z();
                        e5.b.c(this.f1874m0, f3 / getWidth(), y10 / getHeight());
                    } else {
                        z12 = false;
                    }
                    if (f10 < 0.0f) {
                        A();
                        e5.b.c(this.f1873l0, (-f10) / getHeight(), x2 / getWidth());
                    } else if (f10 > 0.0f) {
                        x();
                        e5.b.c(this.f1875n0, f10 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        if (z12 || f3 != 0.0f || f10 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (z3.I(motionEvent, 4194304)) {
                            a0();
                        }
                    }
                    z12 = z10;
                    if (z12) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (z3.I(motionEvent, 4194304)) {
                        a0();
                    }
                }
                z12 = z10;
                if (f10 < 0.0f) {
                    A();
                    e5.b.c(this.f1873l0, (-f10) / getHeight(), x2 / getWidth());
                } else if (f10 > 0.0f) {
                    x();
                    e5.b.c(this.f1875n0, f10 / getHeight(), 1.0f - (x2 / getWidth()));
                } else {
                    if (z12) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (z3.I(motionEvent, 4194304)) {
                        a0();
                    }
                }
                z12 = z10;
                if (z12) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (z3.I(motionEvent, 4194304)) {
                    a0();
                }
            }
            n(i10, i11);
        } else {
            z10 = true;
            z11 = false;
        }
        if (i13 != 0 || i14 != 0) {
            w(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z13 && i13 == 0 && i14 == 0) ? z11 : z10;
    }

    public final void f0(int[] iArr, int i10, int i11) {
        f1 f1Var;
        k0();
        T();
        Trace.beginSection("RV Scroll");
        b1 b1Var = this.G0;
        C(b1Var);
        v0 v0Var = this.C;
        int iP0 = i10 != 0 ? this.N.p0(i10, v0Var, b1Var) : 0;
        int iR0 = i11 != 0 ? this.N.r0(i11, v0Var, b1Var) : 0;
        Trace.endSection();
        int iZ = this.F.z();
        for (int i12 = 0; i12 < iZ; i12++) {
            View viewY = this.F.y(i12);
            f1 f1VarL = L(viewY);
            if (f1VarL != null && (f1Var = f1VarL.f2283i) != null) {
                View view = f1Var.f2275a;
                int left = viewY.getLeft();
                int top = viewY.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        m0(false);
        if (iArr != null) {
            iArr[0] = iP0;
            iArr[1] = iR0;
        }
    }

    @Override
    public final View focusSearch(View view, int i10) {
        View viewT;
        int i11;
        byte b7;
        boolean z10;
        this.N.getClass();
        boolean z11 = true;
        boolean z12 = (this.M == null || this.N == null || P() || this.f1861a0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        b1 b1Var = this.G0;
        v0 v0Var = this.C;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.N.e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.N.d()) {
                z10 = focusFinder.findNextFocus(this, view, (this.N.f2378b.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                p();
                if (D(view) != null) {
                    k0();
                    this.N.T(view, i10, v0Var, b1Var);
                    m0(false);
                }
                return null;
            }
            viewT = focusFinder.findNextFocus(this, view, i10);
            if (viewT == null) {
            }
            if (viewT != null) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                return viewT;
            }
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
        if (viewFindNextFocus == null && z12) {
            p();
            if (D(view) != null) {
                k0();
                viewT = this.N.T(view, i10, v0Var, b1Var);
                m0(false);
            }
            return null;
        }
        viewT = viewFindNextFocus;
        if (viewT == null && !viewT.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            d0(viewT, null);
            return view;
        }
        if (viewT != null || viewT == this || viewT == view) {
            z11 = false;
        } else if (D(viewT) == null) {
            z11 = false;
        } else if (view != null && D(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.J;
            rect.set(0, 0, width, height);
            int width2 = viewT.getWidth();
            int height2 = viewT.getHeight();
            Rect rect2 = this.K;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewT, rect2);
            int i12 = this.N.f2378b.getLayoutDirection() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b7 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b7 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i10);
                                    throw new IllegalArgumentException(b.l(this, sb2));
                                }
                                if (b7 <= 0) {
                                    z11 = false;
                                }
                            } else if (i11 <= 0) {
                                z11 = false;
                            }
                        } else if (b7 >= 0) {
                            z11 = false;
                        }
                    } else if (i11 >= 0) {
                        z11 = false;
                    }
                } else if (b7 <= 0 && (b7 != 0 || i11 * i12 <= 0)) {
                    z11 = false;
                }
            } else if (b7 >= 0 && (b7 != 0 || i11 * i12 >= 0)) {
                z11 = false;
            }
        }
        if (z11) {
            return viewT;
        }
        return super.focusSearch(view, i10);
    }

    public final void g0(int i10) {
        if (this.f1861a0) {
            return;
        }
        o0();
        p0 p0Var = this.N;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            p0Var.q0(i10);
            awakenScrollBars();
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p0 p0Var = this.N;
        if (p0Var != null) {
            return p0Var.r();
        }
        throw new IllegalStateException(b.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p0 p0Var = this.N;
        if (p0Var != null) {
            return p0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(b.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p0 p0Var = this.N;
        if (p0Var != null) {
            return p0Var.t(layoutParams);
        }
        throw new IllegalStateException(b.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g0 getAdapter() {
        return this.M;
    }

    @Override
    public int getBaseline() {
        p0 p0Var = this.N;
        if (p0Var == null) {
            return super.getBaseline();
        }
        p0Var.getClass();
        return -1;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override
    public boolean getClipToPadding() {
        return this.H;
    }

    public h1 getCompatAccessibilityDelegate() {
        return this.N0;
    }

    public l0 getEdgeEffectFactory() {
        return this.f1871j0;
    }

    public m0 getItemAnimator() {
        return this.f1876o0;
    }

    public int getItemDecorationCount() {
        return this.P.size();
    }

    public p0 getLayoutManager() {
        return this.N;
    }

    public int getMaxFlingVelocity() {
        return this.f1887z0;
    }

    public int getMinFlingVelocity() {
        return this.f1886y0;
    }

    public long getNanoTime() {
        if (f1857g1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r0 getOnFlingListener() {
        return this.f1885x0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.C0;
    }

    public ba.u0 getRecycledViewPool() {
        return this.C.c();
    }

    public int getScrollState() {
        return this.f1877p0;
    }

    public final void h(f1 f1Var) {
        View view = f1Var.f2275a;
        boolean z10 = view.getParent() == this;
        this.C.p(L(view));
        if (f1Var.j()) {
            this.F.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.F.e(view, -1, true);
            return;
        }
        g gVar = this.F;
        int iIndexOfChild = ((d0) gVar.C).f2262a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((i0) gVar.D).L(iIndexOfChild);
            gVar.D(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fB = e5.b.b(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.A * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d3 = f1855e1;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f3))) < fB;
    }

    @Override
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(n0 n0Var) {
        p0 p0Var = this.N;
        if (p0Var != null) {
            p0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(n0Var);
        R();
        requestLayout();
    }

    public final void i0(int i10, int i11, boolean z10) {
        p0 p0Var = this.N;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1861a0) {
            return;
        }
        if (!p0Var.d()) {
            i10 = 0;
        }
        if (!this.N.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.D0.c(i10, i11, Integer.MIN_VALUE, null);
    }

    @Override
    public final boolean isAttachedToWindow() {
        return this.S;
    }

    @Override
    public final boolean isLayoutSuppressed() {
        return this.f1861a0;
    }

    @Override
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f17215d;
    }

    public final void j(s0 s0Var) {
        if (this.I0 == null) {
            this.I0 = new ArrayList();
        }
        this.I0.add(s0Var);
    }

    public final void j0(int i10) {
        if (this.f1861a0) {
            return;
        }
        p0 p0Var = this.N;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            p0Var.A0(this, i10);
        }
    }

    public final void k(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(b.l(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1870i0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.l(this, new StringBuilder(RuntimeVersion.SUFFIX))));
        }
    }

    public final void k0() {
        int i10 = this.V + 1;
        this.V = i10;
        if (i10 != 1 || this.f1861a0) {
            return;
        }
        this.W = false;
    }

    public final void l0(int i10) {
        boolean zD = this.N.d();
        int i11 = zD;
        if (this.N.e()) {
            i11 = (zD ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i11, i10);
    }

    public final void m() {
        int iC = this.F.C();
        for (int i10 = 0; i10 < iC; i10++) {
            f1 f1VarM = M(this.F.B(i10));
            if (!f1VarM.o()) {
                f1VarM.f2278d = -1;
                f1VarM.f2281g = -1;
            }
        }
        v0 v0Var = this.C;
        ArrayList arrayList = (ArrayList) v0Var.f2440d;
        ArrayList arrayList2 = (ArrayList) v0Var.f2442f;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            f1 f1Var = (f1) arrayList2.get(i11);
            f1Var.f2278d = -1;
            f1Var.f2281g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            f1 f1Var2 = (f1) arrayList.get(i12);
            f1Var2.f2278d = -1;
            f1Var2.f2281g = -1;
        }
        ArrayList arrayList3 = (ArrayList) v0Var.f2441e;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                f1 f1Var3 = (f1) ((ArrayList) v0Var.f2441e).get(i13);
                f1Var3.f2278d = -1;
                f1Var3.f2281g = -1;
            }
        }
    }

    public final void m0(boolean z10) {
        if (this.V < 1) {
            if (f1852b1) {
                throw new IllegalStateException(b.l(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.V = 1;
        }
        if (!z10 && !this.f1861a0) {
            this.W = false;
        }
        if (this.V == 1) {
            if (z10 && this.W && !this.f1861a0 && this.N != null && this.M != null) {
                r();
            }
            if (!this.f1861a0) {
                this.W = false;
            }
        }
        this.V--;
    }

    public final void n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1872k0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f1872k0.onRelease();
            zIsFinished = this.f1872k0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1874m0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f1874m0.onRelease();
            zIsFinished |= this.f1874m0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1873l0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f1873l0.onRelease();
            zIsFinished |= this.f1873l0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1875n0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f1875n0.onRelease();
            zIsFinished |= this.f1875n0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void o0() {
        w wVar;
        setScrollState(0);
        e1 e1Var = this.D0;
        e1Var.G.removeCallbacks(e1Var);
        e1Var.C.abortAnimation();
        p0 p0Var = this.N;
        if (p0Var == null || (wVar = p0Var.f2381e) == null) {
            return;
        }
        wVar.i();
    }

    @Override
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f1869h0 = 0;
        this.S = true;
        this.U = this.U && !isLayoutRequested();
        this.C.g();
        p0 p0Var = this.N;
        if (p0Var != null) {
            p0Var.f2383g = true;
            p0Var.R(this);
        }
        this.M0 = false;
        if (f1857g1) {
            ThreadLocal threadLocal = p.E;
            p pVar = (p) threadLocal.get();
            this.E0 = pVar;
            if (pVar == null) {
                this.E0 = new p();
                WeakHashMap weakHashMap = j0.f17198a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                p pVar2 = this.E0;
                pVar2.C = (long) (1.0E9f / refreshRate);
                threadLocal.set(pVar2);
            }
            ArrayList arrayList = this.E0.A;
            if (f1852b1 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        p pVar;
        super.onDetachedFromWindow();
        m0 m0Var = this.f1876o0;
        if (m0Var != null) {
            m0Var.e();
        }
        o0();
        int i10 = 0;
        this.S = false;
        p0 p0Var = this.N;
        if (p0Var != null) {
            p0Var.f2383g = false;
            p0Var.S(this);
        }
        this.T0.clear();
        removeCallbacks(this.U0);
        this.G.getClass();
        while (q1.f2396d.a() != null) {
        }
        v0 v0Var = this.C;
        ArrayList arrayList = (ArrayList) v0Var.f2442f;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w00.a.l(((f1) arrayList.get(i11)).f2275a);
        }
        v0Var.h(((RecyclerView) v0Var.f2444h).M, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = w00.a.w(childAt).f11107a;
            for (int iM = va.a.M(arrayList2); -1 < iM; iM--) {
                ((a3) arrayList2.get(iM)).f2623a.e();
            }
            i10 = i12;
        }
        if (!f1857g1 || (pVar = this.E0) == null) {
            return;
        }
        boolean zRemove = pVar.A.remove(this);
        if (f1852b1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.E0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).a(this);
        }
    }

    @Override
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        boolean z10;
        if (this.N != null && !this.f1861a0 && motionEvent.getAction() == 8) {
            float f3 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f10 = this.N.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.N.d() ? motionEvent.getAxisValue(10) : 0.0f;
                i10 = 0;
                z10 = false;
                f3 = f10;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.N.e()) {
                    float f11 = -axisValue;
                    axisValue = 0.0f;
                    f3 = f11;
                } else if (!this.N.d()) {
                    axisValue = 0.0f;
                }
                i10 = 26;
                z10 = this.Y0;
            } else {
                axisValue = 0.0f;
                i10 = 0;
                z10 = false;
            }
            int i11 = (int) (f3 * this.B0);
            int i12 = (int) (axisValue * this.A0);
            if (z10) {
                OverScroller overScroller = this.D0.C;
                i0((overScroller.getFinalX() - overScroller.getCurrX()) + i12, (overScroller.getFinalY() - overScroller.getCurrY()) + i11, true);
            } else {
                p0 p0Var = this.N;
                if (p0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f1861a0) {
                    int[] iArr = this.S0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = p0Var.d();
                    boolean zE = this.N.e();
                    int i13 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x2 = motionEvent.getX();
                    int iB0 = i12 - b0(y10, i12);
                    int iC0 = i11 - c0(x2, i11);
                    getScrollingChildHelper().g(i13, 1);
                    if (u(zD ? iB0 : 0, zE ? iC0 : 0, 1, this.S0, this.Q0)) {
                        iB0 -= iArr[0];
                        iC0 -= iArr[1];
                    }
                    e0(zD ? iB0 : 0, zE ? iC0 : 0, motionEvent, 1);
                    p pVar = this.E0;
                    if (pVar != null && (iB0 != 0 || iC0 != 0)) {
                        pVar.a(this, iB0, iC0);
                    }
                    n0(1);
                }
            }
            if (i10 != 0 && !z10) {
                this.f1862a1.a(motionEvent, i10);
            }
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.f1861a0) {
            this.R = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.f1879r0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            p0 p0Var = this.N;
            if (p0Var != null) {
                boolean zD = p0Var.d();
                boolean zE = this.N.e();
                if (this.f1879r0 == null) {
                    this.f1879r0 = VelocityTracker.obtain();
                }
                this.f1879r0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1863b0) {
                        this.f1863b0 = false;
                    }
                    this.f1878q0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1882u0 = x2;
                    this.f1880s0 = x2;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f1883v0 = y10;
                    this.f1881t0 = y10;
                    EdgeEffect edgeEffect = this.f1872k0;
                    if (edgeEffect == null || e5.b.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z10 = false;
                    } else {
                        e5.b.c(this.f1872k0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f1874m0;
                    if (edgeEffect2 != null && e5.b.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        e5.b.c(this.f1874m0, 0.0f, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f1873l0;
                    if (edgeEffect3 != null && e5.b.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        e5.b.c(this.f1873l0, 0.0f, motionEvent.getX() / getWidth());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f1875n0;
                    if (edgeEffect4 != null && e5.b.b(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        e5.b.c(this.f1875n0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z10 = true;
                    }
                    if (z10 || this.f1877p0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        n0(1);
                    }
                    int[] iArr = this.R0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    l0(0);
                } else if (actionMasked == 1) {
                    this.f1879r0.clear();
                    n0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1878q0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1878q0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f1877p0 != 1) {
                        int i10 = x10 - this.f1880s0;
                        int i11 = y11 - this.f1881t0;
                        if (!zD || Math.abs(i10) <= this.f1884w0) {
                            z11 = false;
                        } else {
                            this.f1882u0 = x10;
                            z11 = true;
                        }
                        if (zE && Math.abs(i11) > this.f1884w0) {
                            this.f1883v0 = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f1879r0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    n0(0);
                    a0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1878q0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1882u0 = x11;
                    this.f1880s0 = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1883v0 = y12;
                    this.f1881t0 = y12;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.f1877p0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.U = true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        p0 p0Var = this.N;
        if (p0Var == null) {
            q(i10, i11);
            return;
        }
        boolean zK = p0Var.K();
        boolean z10 = false;
        b1 b1Var = this.G0;
        if (zK) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.N.f2378b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.V0 = z10;
            if (z10 || this.M == null) {
                return;
            }
            if (b1Var.f2241d == 1) {
                s();
            }
            this.N.t0(i10, i11);
            b1Var.f2246i = true;
            t();
            this.N.v0(i10, i11);
            if (this.N.y0()) {
                this.N.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                b1Var.f2246i = true;
                t();
                this.N.v0(i10, i11);
            }
            this.W0 = getMeasuredWidth();
            this.X0 = getMeasuredHeight();
            return;
        }
        if (this.T) {
            this.N.f2378b.q(i10, i11);
            return;
        }
        if (this.f1865d0) {
            k0();
            T();
            X();
            U(true);
            if (b1Var.f2248k) {
                b1Var.f2244g = true;
            } else {
                this.E.e();
                b1Var.f2244g = false;
            }
            this.f1865d0 = false;
            m0(false);
        } else if (b1Var.f2248k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g0 g0Var = this.M;
        if (g0Var != null) {
            b1Var.f2242e = g0Var.getItemCount();
        } else {
            b1Var.f2242e = 0;
        }
        k0();
        this.N.f2378b.q(i10, i11);
        m0(false);
        b1Var.f2244g = false;
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y0 y0Var = (y0) parcelable;
        this.D = y0Var;
        super.onRestoreInstanceState(y0Var.A);
        requestLayout();
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        y0 y0Var = new y0(super.onSaveInstanceState());
        y0 y0Var2 = this.D;
        if (y0Var2 != null) {
            y0Var.C = y0Var2.C;
            return y0Var;
        }
        p0 p0Var = this.N;
        if (p0Var != null) {
            y0Var.C = p0Var.g0();
            return y0Var;
        }
        y0Var.C = null;
        return y0Var;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f1875n0 = null;
        this.f1873l0 = null;
        this.f1874m0 = null;
        this.f1872k0 = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE;
        boolean z10;
        if (!this.f1861a0 && !this.f1863b0) {
            l lVar = this.R;
            if (lVar == null) {
                zE = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                int i10 = lVar.f2324b;
                if (lVar.f2342v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                        if (zD || zC) {
                            if (zC) {
                                lVar.f2343w = 1;
                                lVar.f2336p = (int) motionEvent.getX();
                            } else if (zD) {
                                lVar.f2343w = 2;
                                lVar.m = (int) motionEvent.getY();
                            }
                            lVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && lVar.f2342v == 2) {
                        lVar.m = 0.0f;
                        lVar.f2336p = 0.0f;
                        lVar.f(1);
                        lVar.f2343w = 0;
                    } else if (motionEvent.getAction() == 2 && lVar.f2342v == 2) {
                        lVar.g();
                        if (lVar.f2343w == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = lVar.f2345y;
                            iArr[0] = i10;
                            int i11 = lVar.f2337q - i10;
                            iArr[1] = i11;
                            float fMax = Math.max(i10, Math.min(i11, x2));
                            if (Math.abs(lVar.f2335o - fMax) >= 2.0f) {
                                int iE = l.e(lVar.f2336p, fMax, iArr, lVar.f2339s.computeHorizontalScrollRange(), lVar.f2339s.computeHorizontalScrollOffset(), lVar.f2337q);
                                if (iE != 0) {
                                    lVar.f2339s.scrollBy(iE, 0);
                                }
                                lVar.f2336p = fMax;
                            }
                        }
                        if (lVar.f2343w == 2) {
                            float y10 = motionEvent.getY();
                            int[] iArr2 = lVar.f2344x;
                            iArr2[0] = i10;
                            int i12 = lVar.f2338r - i10;
                            iArr2[1] = i12;
                            float fMax2 = Math.max(i10, Math.min(i12, y10));
                            if (Math.abs(lVar.l - fMax2) >= 2.0f) {
                                int iE2 = l.e(lVar.m, fMax2, iArr2, lVar.f2339s.computeVerticalScrollRange(), lVar.f2339s.computeVerticalScrollOffset(), lVar.f2338r);
                                if (iE2 != 0) {
                                    lVar.f2339s.scrollBy(0, iE2);
                                }
                                lVar.m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.R = null;
                }
                zE = true;
            }
            if (zE) {
                VelocityTracker velocityTracker = this.f1879r0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            p0 p0Var = this.N;
            if (p0Var != null) {
                boolean zD2 = p0Var.d();
                boolean zE2 = this.N.e();
                if (this.f1879r0 == null) {
                    this.f1879r0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.R0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f1879r0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f1879r0;
                        int i13 = this.f1887z0;
                        velocityTracker2.computeCurrentVelocity(1000, i13);
                        float f3 = zD2 ? -this.f1879r0.getXVelocity(this.f1878q0) : 0.0f;
                        float f10 = zE2 ? -this.f1879r0.getYVelocity(this.f1878q0) : 0.0f;
                        if ((f3 == 0.0f && f10 == 0.0f) || !I((int) f3, (int) f10, this.f1886y0, i13)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f1879r0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        n0(0);
                        a0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1878q0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1878q0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f1882u0 - x10;
                        int iMax2 = this.f1883v0 - y11;
                        if (this.f1877p0 != 1) {
                            if (zD2) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.f1884w0) : Math.min(0, iMax + this.f1884w0);
                                if (iMax != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            if (zE2) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f1884w0) : Math.min(0, iMax2 + this.f1884w0);
                                if (iMax2 != 0) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                        if (this.f1877p0 == 1) {
                            int[] iArr4 = this.S0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iB0 = iMax - b0(motionEvent.getY(), iMax);
                            int iC0 = iMax2 - c0(motionEvent.getX(), iMax2);
                            boolean zU = u(zD2 ? iB0 : 0, zE2 ? iC0 : 0, 0, this.S0, this.Q0);
                            int[] iArr5 = this.Q0;
                            if (zU) {
                                iB0 -= iArr4[0];
                                iC0 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i14 = iB0;
                            int i15 = iC0;
                            this.f1882u0 = x10 - iArr5[0];
                            this.f1883v0 = y11 - iArr5[1];
                            if (e0(zD2 ? i14 : 0, zE2 ? i15 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            p pVar = this.E0;
                            if (pVar != null && (i14 != 0 || i15 != 0)) {
                                pVar.a(this, i14, i15);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f1879r0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        n0(0);
                        a0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f1878q0 = motionEvent.getPointerId(actionIndex);
                        int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f1882u0 = x11;
                        this.f1880s0 = x11;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f1883v0 = y12;
                        this.f1881t0 = y12;
                    } else if (actionMasked == 6) {
                        V(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f1878q0 = motionEvent.getPointerId(0);
                int x12 = (int) (motionEvent.getX() + 0.5f);
                this.f1882u0 = x12;
                this.f1880s0 = x12;
                int y13 = (int) (motionEvent.getY() + 0.5f);
                this.f1883v0 = y13;
                this.f1881t0 = y13;
                l0(0);
                this.f1879r0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.U || this.f1867f0) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (this.E.m()) {
            i2 i2Var = this.E;
            int i10 = i2Var.f2044a;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (i2Var.m()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            k0();
            T();
            this.E.s();
            if (!this.W) {
                int iZ = this.F.z();
                for (int i11 = 0; i11 < iZ; i11++) {
                    f1 f1VarM = M(this.F.y(i11));
                    if (f1VarM != null && !f1VarM.o() && f1VarM.k()) {
                        r();
                    }
                }
                this.E.d();
            }
            m0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = j0.f17198a;
        setMeasuredDimension(p0.g(i10, paddingRight, getMinimumWidth()), p0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r() {
        boolean z10;
        f1 f1Var;
        int i10;
        int iB;
        int i11;
        int iMin;
        f1 f1VarH;
        View view;
        f1 f1VarH2;
        View view2;
        int i12;
        View viewFindViewById;
        View view3;
        w0 w0Var;
        ?? r4;
        boolean zG;
        boolean z11;
        if (this.M == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.N == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        b1 b1Var = this.G0;
        boolean z12 = false;
        b1Var.f2246i = false;
        boolean z13 = true;
        boolean z14 = this.V0 && !(this.W0 == getWidth() && this.X0 == getHeight());
        this.W0 = 0;
        this.X0 = 0;
        this.V0 = false;
        if (b1Var.f2241d == 1) {
            s();
            this.N.s0(this);
            t();
        } else {
            i2 i2Var = this.E;
            if ((((ArrayList) i2Var.f2047d).isEmpty() || ((ArrayList) i2Var.f2046c).isEmpty()) && !z14 && this.N.f2388n == getWidth() && this.N.f2389o == getHeight()) {
                this.N.s0(this);
            } else {
                this.N.s0(this);
                t();
            }
        }
        b1Var.a(4);
        k0();
        T();
        b1Var.f2241d = 1;
        boolean z15 = b1Var.f2247j;
        v0 v0Var = this.C;
        u0 u0Var = this.G;
        if (z15) {
            int iZ = this.F.z() - 1;
            while (iZ >= 0) {
                f1 f1VarM = M(this.F.y(iZ));
                if (f1VarM.o()) {
                    z11 = z13;
                } else {
                    long jK = K(f1VarM);
                    this.f1876o0.getClass();
                    w0 w0Var2 = new w0();
                    w0Var2.b(f1VarM);
                    q qVar = (q) u0Var.C;
                    u.s0 s0Var = (u.s0) u0Var.B;
                    f1 f1Var2 = (f1) qVar.b(jK);
                    if (f1Var2 == null || f1Var2.o()) {
                        z11 = z13;
                        u0Var.r(f1VarM, w0Var2);
                    } else {
                        z11 = z13;
                        q1 q1Var = (q1) s0Var.get(f1Var2);
                        boolean z16 = (q1Var == null || (q1Var.f2397a & 1) == 0) ? false : z11;
                        q1 q1Var2 = (q1) s0Var.get(f1VarM);
                        boolean z17 = (q1Var2 == null || (q1Var2.f2397a & 1) == 0) ? false : z11;
                        if (z16 && f1Var2 == f1VarM) {
                            u0Var.r(f1VarM, w0Var2);
                        } else {
                            w0 w0VarP = u0Var.P(f1Var2, 4);
                            u0Var.r(f1VarM, w0Var2);
                            w0 w0VarP2 = u0Var.P(f1VarM, 8);
                            if (w0VarP == null) {
                                int iZ2 = this.F.z();
                                for (int i13 = 0; i13 < iZ2; i13++) {
                                    f1 f1VarM2 = M(this.F.y(i13));
                                    if (f1VarM2 != f1VarM && K(f1VarM2) == jK) {
                                        g0 g0Var = this.M;
                                        if (g0Var == null || !g0Var.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(f1VarM2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(f1VarM);
                                            throw new IllegalStateException(b.l(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(f1VarM2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(f1VarM);
                                        throw new IllegalStateException(b.l(this, sb3));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f1Var2 + " cannot be found but it is necessary for " + f1VarM + B());
                            } else {
                                f1Var2.n(false);
                                if (z16) {
                                    h(f1Var2);
                                }
                                if (f1Var2 != f1VarM) {
                                    if (z17) {
                                        h(f1VarM);
                                    }
                                    f1Var2.f2282h = f1VarM;
                                    h(f1Var2);
                                    v0Var.p(f1Var2);
                                    f1VarM.n(false);
                                    f1VarM.f2283i = f1Var2;
                                }
                                if (this.f1876o0.a(f1Var2, f1VarM, w0VarP, w0VarP2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
                iZ--;
                z13 = z11;
            }
            z10 = z13;
            u.s0 s0Var2 = (u.s0) u0Var.B;
            int i14 = s0Var2.C - 1;
            while (i14 >= 0) {
                f1 f1Var3 = (f1) s0Var2.g(i14);
                q1 q1Var3 = (q1) s0Var2.h(i14);
                int i15 = q1Var3.f2397a;
                int i16 = i15 & 3;
                d0 d0Var = this.Z0;
                if (i16 == 3) {
                    RecyclerView recyclerView = d0Var.f2262a;
                    recyclerView.N.l0(f1Var3.f2275a, recyclerView.C);
                    r4 = z12;
                } else if ((i15 & 1) != 0) {
                    w0 w0Var3 = q1Var3.f2398b;
                    if (w0Var3 == null) {
                        RecyclerView recyclerView2 = d0Var.f2262a;
                        recyclerView2.N.l0(f1Var3.f2275a, recyclerView2.C);
                        r4 = z12;
                    } else {
                        d0Var.b(f1Var3, w0Var3, q1Var3.f2399c);
                        r4 = z12;
                    }
                } else if ((i15 & 14) == 14) {
                    d0Var.a(f1Var3, q1Var3.f2398b, q1Var3.f2399c);
                    r4 = z12;
                } else {
                    if ((i15 & 12) == 12) {
                        w0 w0Var4 = q1Var3.f2398b;
                        w0 w0Var5 = q1Var3.f2399c;
                        d0Var.getClass();
                        f1Var3.n(z12);
                        RecyclerView recyclerView3 = d0Var.f2262a;
                        if (!recyclerView3.f1867f0) {
                            h hVar = (h) recyclerView3.f1876o0;
                            hVar.getClass();
                            int i17 = w0Var4.f1663a;
                            int i18 = w0Var5.f1663a;
                            if (i17 == i18 && w0Var4.f1664b == w0Var5.f1664b) {
                                hVar.c(f1Var3);
                                zG = false;
                            } else {
                                zG = hVar.g(f1Var3, i17, w0Var4.f1664b, i18, w0Var5.f1664b);
                            }
                            if (zG) {
                                recyclerView3.W();
                            }
                        } else if (recyclerView3.f1876o0.a(f1Var3, f1Var3, w0Var4, w0Var5)) {
                            recyclerView3.W();
                        }
                        r4 = 0;
                    } else {
                        if ((i15 & 4) != 0) {
                            w0Var = null;
                            d0Var.b(f1Var3, q1Var3.f2398b, null);
                        } else {
                            w0Var = null;
                            if ((i15 & 8) != 0) {
                                d0Var.a(f1Var3, q1Var3.f2398b, q1Var3.f2399c);
                            }
                        }
                        r4 = 0;
                    }
                    q1Var3.f2397a = r4;
                    q1Var3.f2398b = w0Var;
                    q1Var3.f2399c = w0Var;
                    q1.f2396d.c(q1Var3);
                    i14--;
                    z12 = false;
                }
                w0Var = null;
                q1Var3.f2397a = r4;
                q1Var3.f2398b = w0Var;
                q1Var3.f2399c = w0Var;
                q1.f2396d.c(q1Var3);
                i14--;
                z12 = false;
            }
        } else {
            z10 = true;
        }
        View view4 = null;
        this.N.k0(v0Var);
        b1Var.f2239b = b1Var.f2242e;
        this.f1867f0 = false;
        this.f1868g0 = false;
        b1Var.f2247j = false;
        b1Var.f2248k = false;
        this.N.f2382f = false;
        ArrayList arrayList = (ArrayList) v0Var.f2441e;
        if (arrayList != null) {
            arrayList.clear();
        }
        p0 p0Var = this.N;
        if (p0Var.f2387k) {
            p0Var.f2386j = 0;
            p0Var.f2387k = false;
            v0Var.q();
        }
        this.N.e0(b1Var);
        boolean z18 = z10;
        U(z18);
        m0(false);
        ((u.s0) u0Var.B).clear();
        ((q) u0Var.C).a();
        int[] iArr = this.O0;
        int i19 = iArr[0];
        int i20 = iArr[z18 ? 1 : 0];
        F(iArr);
        if ((iArr[0] == i19 && iArr[z18 ? 1 : 0] == i20) ? false : true) {
            w(0, 0);
        }
        if (this.C0 && this.M != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (b1Var.m == -1) {
                    f1Var = null;
                } else {
                    f1Var = null;
                }
                if (f1Var != null) {
                    view3 = f1Var.f2275a;
                    if (!((ArrayList) this.F.E).contains(view3)) {
                        if (this.F.z() > 0) {
                            int i21 = b1Var.l;
                            if (i21 != -1) {
                            }
                            iB = b1Var.b();
                            i11 = i10;
                            while (true) {
                                if (i11 < iB) {
                                    f1VarH2 = H(i11);
                                    if (f1VarH2 != null) {
                                        view2 = f1VarH2.f2275a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i10) - 1; iMin >= 0; iMin--) {
                                    f1VarH = H(iMin);
                                    if (f1VarH == null) {
                                        break;
                                        break;
                                    }
                                    view = f1VarH.f2275a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.F.z() > 0) {
                        int i22 = b1Var.l;
                        if (i22 != -1) {
                        }
                        iB = b1Var.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                f1VarH2 = H(i11);
                                if (f1VarH2 != null) {
                                    view2 = f1VarH2.f2275a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                f1VarH = H(iMin);
                                if (f1VarH == null) {
                                    break;
                                    break;
                                }
                                view = f1VarH.f2275a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.F.z() > 0) {
                    int i23 = b1Var.l;
                    if (i23 != -1) {
                    }
                    iB = b1Var.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            f1VarH2 = H(i11);
                            if (f1VarH2 != null) {
                                view2 = f1VarH2.f2275a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            f1VarH = H(iMin);
                            if (f1VarH == null) {
                                break;
                                break;
                            }
                            view = f1VarH.f2275a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = b1Var.f2249n;
                    if (i12 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.F.E).contains(getFocusedChild())) {
                if (b1Var.m == -1 && this.M.hasStableIds()) {
                    long j9 = b1Var.m;
                    g0 g0Var2 = this.M;
                    if (g0Var2 == null || !g0Var2.hasStableIds()) {
                        f1Var = null;
                    } else {
                        int iC = this.F.C();
                        f1Var = null;
                        for (int i24 = 0; i24 < iC; i24++) {
                            f1 f1VarM3 = M(this.F.B(i24));
                            if (f1VarM3 != null && !f1VarM3.h() && f1VarM3.f2279e == j9) {
                                if (!((ArrayList) this.F.E).contains(f1VarM3.f2275a)) {
                                    f1Var = f1VarM3;
                                    break;
                                }
                                f1Var = f1VarM3;
                            }
                        }
                    }
                } else {
                    f1Var = null;
                }
                if (f1Var != null) {
                    view3 = f1Var.f2275a;
                    if (!((ArrayList) this.F.E).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.F.z() > 0) {
                        int i25 = b1Var.l;
                        i10 = i25 != -1 ? i25 : 0;
                        iB = b1Var.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                f1VarH2 = H(i11);
                                if (f1VarH2 != null) {
                                    view2 = f1VarH2.f2275a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                f1VarH = H(iMin);
                                if (f1VarH == null) {
                                    break;
                                }
                                view = f1VarH.f2275a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.F.z() > 0) {
                    int i26 = b1Var.l;
                    if (i26 != -1) {
                    }
                    iB = b1Var.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            f1VarH2 = H(i11);
                            if (f1VarH2 != null) {
                                view2 = f1VarH2.f2275a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            f1VarH = H(iMin);
                            if (f1VarH == null) {
                                break;
                                break;
                            }
                            view = f1VarH.f2275a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = b1Var.f2249n;
                    if (i12 != -1 && (viewFindViewById = view4.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        b1Var.m = -1L;
        b1Var.l = -1;
        b1Var.f2249n = -1;
    }

    @Override
    public final void removeDetachedView(View view, boolean z10) {
        f1 f1VarM = M(view);
        if (f1VarM != null) {
            if (f1VarM.j()) {
                f1VarM.f2284j &= -257;
            } else if (!f1VarM.o()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(f1VarM);
                throw new IllegalArgumentException(b.l(this, sb2));
            }
        } else if (f1852b1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(b.l(this, sb3));
        }
        view.clearAnimation();
        f1 f1VarM2 = M(view);
        g0 g0Var = this.M;
        if (g0Var != null && f1VarM2 != null) {
            g0Var.onViewDetachedFromWindow(f1VarM2);
        }
        super.removeDetachedView(view, z10);
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        w wVar = this.N.f2381e;
        if ((wVar == null || !wVar.f2449e) && !P() && view2 != null) {
            d0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.N.n0(this, view, rect, z10, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void requestLayout() {
        if (this.V != 0 || this.f1861a0) {
            this.W = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        int iJ;
        q1 q1Var;
        View viewD;
        b1 b1Var = this.G0;
        b1Var.a(1);
        C(b1Var);
        b1Var.f2246i = false;
        k0();
        u0 u0Var = this.G;
        u.s0 s0Var = (u.s0) u0Var.B;
        u.s0 s0Var2 = (u.s0) u0Var.B;
        s0Var.clear();
        q qVar = (q) u0Var.C;
        qVar.a();
        T();
        X();
        f1 f1VarL = null;
        View focusedChild = (this.C0 && hasFocus() && this.M != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewD = D(focusedChild)) != null) {
            f1VarL = L(viewD);
        }
        if (f1VarL == null) {
            b1Var.m = -1L;
            b1Var.l = -1;
            b1Var.f2249n = -1;
        } else {
            b1Var.m = this.M.hasStableIds() ? f1VarL.f2279e : -1L;
            if (this.f1867f0) {
                iJ = -1;
            } else if (f1VarL.h()) {
                iJ = f1VarL.f2278d;
            } else {
                RecyclerView recyclerView = f1VarL.f2290r;
                if (recyclerView == null) {
                    iJ = -1;
                } else {
                    iJ = recyclerView.J(f1VarL);
                }
            }
            b1Var.l = iJ;
            View focusedChild2 = f1VarL.f2275a;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            b1Var.f2249n = id2;
        }
        b1Var.f2245h = b1Var.f2247j && this.K0;
        this.K0 = false;
        this.J0 = false;
        b1Var.f2244g = b1Var.f2248k;
        b1Var.f2242e = this.M.getItemCount();
        F(this.O0);
        if (b1Var.f2247j) {
            int iZ = this.F.z();
            for (int i10 = 0; i10 < iZ; i10++) {
                f1 f1VarM = M(this.F.y(i10));
                if (!f1VarM.o() && (!f1VarM.f() || this.M.hasStableIds())) {
                    m0 m0Var = this.f1876o0;
                    m0.b(f1VarM);
                    f1VarM.c();
                    m0Var.getClass();
                    w0 w0Var = new w0();
                    w0Var.b(f1VarM);
                    q1 q1VarA = (q1) s0Var2.get(f1VarM);
                    if (q1VarA == null) {
                        q1VarA = q1.a();
                        s0Var2.put(f1VarM, q1VarA);
                    }
                    q1VarA.f2398b = w0Var;
                    q1VarA.f2397a |= 4;
                    if (b1Var.f2245h && f1VarM.k() && !f1VarM.h() && !f1VarM.o() && !f1VarM.f()) {
                        qVar.e(f1VarM, K(f1VarM));
                    }
                }
            }
        }
        if (b1Var.f2248k) {
            int iC = this.F.C();
            for (int i11 = 0; i11 < iC; i11++) {
                f1 f1VarM2 = M(this.F.B(i11));
                if (f1852b1 && f1VarM2.f2277c == -1 && !f1VarM2.h()) {
                    throw new IllegalStateException(b.l(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!f1VarM2.o() && f1VarM2.f2278d == -1) {
                    f1VarM2.f2278d = f1VarM2.f2277c;
                }
            }
            boolean z10 = b1Var.f2243f;
            b1Var.f2243f = false;
            this.N.d0(this.C, b1Var);
            b1Var.f2243f = z10;
            for (int i12 = 0; i12 < this.F.z(); i12++) {
                f1 f1VarM3 = M(this.F.y(i12));
                if (!f1VarM3.o() && ((q1Var = (q1) s0Var2.get(f1VarM3)) == null || (q1Var.f2397a & 4) == 0)) {
                    m0.b(f1VarM3);
                    boolean z11 = (f1VarM3.f2284j & 8192) != 0;
                    m0 m0Var2 = this.f1876o0;
                    f1VarM3.c();
                    m0Var2.getClass();
                    w0 w0Var2 = new w0();
                    w0Var2.b(f1VarM3);
                    if (z11) {
                        Z(f1VarM3, w0Var2);
                    } else {
                        q1 q1VarA2 = (q1) s0Var2.get(f1VarM3);
                        if (q1VarA2 == null) {
                            q1VarA2 = q1.a();
                            s0Var2.put(f1VarM3, q1VarA2);
                        }
                        q1VarA2.f2397a |= 2;
                        q1VarA2.f2398b = w0Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        m0(false);
        b1Var.f2241d = 2;
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        p0 p0Var = this.N;
        if (p0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1861a0) {
            return;
        }
        boolean zD = p0Var.d();
        boolean zE = this.N.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            e0(i10, i11, null, 0);
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1864c0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(h1 h1Var) {
        this.N0 = h1Var;
        j0.g(this, h1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.M;
        x0 x0Var = this.B;
        if (g0Var2 != null) {
            g0Var2.unregisterAdapterDataObserver(x0Var);
            this.M.onDetachedFromRecyclerView(this);
        }
        m0 m0Var = this.f1876o0;
        if (m0Var != null) {
            m0Var.e();
        }
        p0 p0Var = this.N;
        v0 v0Var = this.C;
        if (p0Var != null) {
            p0Var.j0(v0Var);
            this.N.k0(v0Var);
        }
        ((ArrayList) v0Var.f2440d).clear();
        v0Var.j();
        i2 i2Var = this.E;
        i2Var.t((ArrayList) i2Var.f2046c);
        i2Var.t((ArrayList) i2Var.f2047d);
        i2Var.f2044a = 0;
        g0 g0Var3 = this.M;
        this.M = g0Var;
        if (g0Var != null) {
            g0Var.registerAdapterDataObserver(x0Var);
            g0Var.onAttachedToRecyclerView(this);
        }
        p0 p0Var2 = this.N;
        if (p0Var2 != null) {
            p0Var2.Q();
        }
        g0 g0Var4 = this.M;
        ((ArrayList) v0Var.f2440d).clear();
        v0Var.j();
        v0Var.h(g0Var3, true);
        ba.u0 u0VarC = v0Var.c();
        if (g0Var3 != null) {
            u0VarC.f2435b--;
        }
        if (u0VarC.f2435b == 0) {
            SparseArray sparseArray = u0VarC.f2434a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                t0 t0Var = (t0) sparseArray.valueAt(i10);
                Iterator it = t0Var.f2419a.iterator();
                while (it.hasNext()) {
                    w00.a.l(((f1) it.next()).f2275a);
                }
                t0Var.f2419a.clear();
            }
        }
        if (g0Var4 != null) {
            u0VarC.f2435b++;
        }
        v0Var.g();
        this.G0.f2243f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override
    public void setClipToPadding(boolean z10) {
        if (z10 != this.H) {
            this.f1875n0 = null;
            this.f1873l0 = null;
            this.f1874m0 = null;
            this.f1872k0 = null;
        }
        this.H = z10;
        super.setClipToPadding(z10);
        if (this.U) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l0 l0Var) {
        l0Var.getClass();
        this.f1871j0 = l0Var;
        this.f1875n0 = null;
        this.f1873l0 = null;
        this.f1874m0 = null;
        this.f1872k0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.T = z10;
    }

    public void setItemAnimator(m0 m0Var) {
        m0 m0Var2 = this.f1876o0;
        if (m0Var2 != null) {
            m0Var2.e();
            this.f1876o0.f2347a = null;
        }
        this.f1876o0 = m0Var;
        if (m0Var != null) {
            m0Var.f2347a = this.L0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        v0 v0Var = this.C;
        v0Var.f2438b = i10;
        v0Var.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p0 p0Var) {
        if (p0Var == this.N) {
            return;
        }
        o0();
        p0 p0Var2 = this.N;
        v0 v0Var = this.C;
        if (p0Var2 != null) {
            m0 m0Var = this.f1876o0;
            if (m0Var != null) {
                m0Var.e();
            }
            this.N.j0(v0Var);
            this.N.k0(v0Var);
            ((ArrayList) v0Var.f2440d).clear();
            v0Var.j();
            if (this.S) {
                p0 p0Var3 = this.N;
                p0Var3.f2383g = false;
                p0Var3.S(this);
            }
            this.N.w0(null);
            this.N = null;
        } else {
            ((ArrayList) v0Var.f2440d).clear();
            v0Var.j();
        }
        g gVar = this.F;
        RecyclerView recyclerView = ((d0) gVar.C).f2262a;
        ((i0) gVar.D).K();
        ArrayList arrayList = (ArrayList) gVar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f1 f1VarM = M((View) arrayList.get(size));
            if (f1VarM != null) {
                int i10 = f1VarM.f2288p;
                if (recyclerView.P()) {
                    f1VarM.f2289q = i10;
                    recyclerView.T0.add(f1VarM);
                } else {
                    f1VarM.f2275a.setImportantForAccessibility(i10);
                }
                f1VarM.f2288p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            f1 f1VarM2 = M(childAt);
            g0 g0Var = recyclerView.M;
            if (g0Var != null && f1VarM2 != null) {
                g0Var.onViewDetachedFromWindow(f1VarM2);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.N = p0Var;
        if (p0Var != null) {
            if (p0Var.f2378b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(p0Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(b.l(p0Var.f2378b, sb2));
            }
            p0Var.w0(this);
            if (this.S) {
                p0 p0Var4 = this.N;
                p0Var4.f2383g = true;
                p0Var4.R(this);
            }
        }
        v0Var.q();
        requestLayout();
    }

    @Override
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override
    public void setNestedScrollingEnabled(boolean z10) {
        o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f17215d) {
            View view = scrollingChildHelper.f17214c;
            WeakHashMap weakHashMap = j0.f17198a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f17215d = z10;
    }

    public void setOnFlingListener(r0 r0Var) {
        this.f1885x0 = r0Var;
    }

    @Deprecated
    public void setOnScrollListener(s0 s0Var) {
        this.H0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.C0 = z10;
    }

    public void setRecycledViewPool(ba.u0 u0Var) {
        v0 v0Var = this.C;
        RecyclerView recyclerView = (RecyclerView) v0Var.f2444h;
        v0Var.h(recyclerView.M, false);
        ba.u0 u0Var2 = (ba.u0) v0Var.f2443g;
        if (u0Var2 != null) {
            u0Var2.f2435b--;
        }
        v0Var.f2443g = u0Var;
        if (u0Var != null && recyclerView.getAdapter() != null) {
            ((ba.u0) v0Var.f2443g).f2435b++;
        }
        v0Var.g();
    }

    @Deprecated
    public void setRecyclerListener(ba.w0 w0Var) {
    }

    public void setScrollState(int i10) {
        w wVar;
        if (i10 == this.f1877p0) {
            return;
        }
        if (f1853c1) {
            StringBuilder sbQ = k.q("setting scroll state to ", i10, " from ");
            sbQ.append(this.f1877p0);
            Log.d("RecyclerView", sbQ.toString(), new Exception());
        }
        this.f1877p0 = i10;
        if (i10 != 2) {
            e1 e1Var = this.D0;
            e1Var.G.removeCallbacks(e1Var);
            e1Var.C.abortAnimation();
            p0 p0Var = this.N;
            if (p0Var != null && (wVar = p0Var.f2381e) != null) {
                wVar.i();
            }
        }
        p0 p0Var2 = this.N;
        if (p0Var2 != null) {
            p0Var2.h0(i10);
        }
        s0 s0Var = this.H0;
        if (s0Var != null) {
            s0Var.a(i10);
        }
        ArrayList arrayList = this.I0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.I0.get(size)).a(i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f1884w0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f1884w0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d1 d1Var) {
        this.C.getClass();
    }

    @Override
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f1861a0) {
            k("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1861a0 = true;
                this.f1863b0 = true;
                o0();
                return;
            }
            this.f1861a0 = false;
            if (this.W && this.N != null && this.M != null) {
                requestLayout();
            }
            this.W = false;
        }
    }

    public final void t() {
        k0();
        T();
        b1 b1Var = this.G0;
        b1Var.a(6);
        this.E.e();
        b1Var.f2242e = this.M.getItemCount();
        b1Var.f2240c = 0;
        if (this.D != null && this.M.canRestoreState()) {
            Parcelable parcelable = this.D.C;
            if (parcelable != null) {
                this.N.f0(parcelable);
            }
            this.D = null;
        }
        b1Var.f2244g = false;
        this.N.d0(this.C, b1Var);
        b1Var.f2243f = false;
        b1Var.f2247j = b1Var.f2247j && this.f1876o0 != null;
        b1Var.f2241d = 4;
        U(true);
        m0(false);
    }

    public final boolean u(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v(int i10, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, i14, iArr, iArr2);
    }

    public final void w(int i10, int i11) {
        this.f1870i0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        s0 s0Var = this.H0;
        if (s0Var != null) {
            s0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.I0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s0) this.I0.get(size)).b(this, i10, i11);
            }
        }
        this.f1870i0--;
    }

    public final void x() {
        if (this.f1875n0 != null) {
            return;
        }
        ((c1) this.f1871j0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1875n0 = edgeEffect;
        if (this.H) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f1872k0 != null) {
            return;
        }
        ((c1) this.f1871j0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1872k0 = edgeEffect;
        if (this.H) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1874m0 != null) {
            return;
        }
        ((c1) this.f1871j0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1874m0 = edgeEffect;
        if (this.H) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }
}
