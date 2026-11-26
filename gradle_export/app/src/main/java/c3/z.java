package c3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class z extends ViewGroup implements Owner, b3.h2, v2.f, DefaultLifecycleObserver, b3.y1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, g2.j {

    public static Class f2778m1;

    public static Method f2779n1;

    public static final u.d0 f2780o1 = new u.d0();

    public static l f2781p1;

    public static Method f2782q1;
    public final l1.i1 A;
    public final int[] A0;
    public long B;
    public final float[] B0;
    public final boolean C;
    public final float[] C0;
    public s2.a D;
    public final float[] D0;
    public final b3.o0 E;
    public long E0;
    public g2 F;
    public boolean F0;
    public h2 G;
    public long G0;
    public w1.d H;
    public final l1.i1 H0;
    public final h00.m I;
    public final l1.w I0;
    public final k J;
    public u00.k J0;
    public final l1.i1 K;
    public r3.z K0;
    public final View L;
    public r3.x L0;
    public final g2.n M;
    public final AtomicReference M0;
    public k00.i N;
    public p1 N0;
    public final e2.b O;
    public final q3.g O0;
    public final f2 P;
    public final l1.z0 P0;
    public final l1.i1 Q;
    public final l1.i1 Q0;
    public final l1.w R;
    public final q2.a R0;
    public final hf.c S;
    public final r2.c S0;
    public final y0 T;
    public final a3.b T0;
    public final z2.v U;
    public final r0 U0;
    public final b3.l0 V;
    public MotionEvent V0;
    public final u.w W;
    public long W0;
    public final a1.u0 X0;
    public final u.d0 Y0;
    public float Z0;

    public final k3.b f2783a0;

    public float f2784a1;

    public final j3.u f2785b0;

    public final a50.d f2786b1;

    public final f0 f2787c0;

    public final k f2788c1;

    public d2.d f2789d0;

    public boolean f2790d1;

    public final h f2791e0;

    public final x1 f2792e1;

    public final i2.c f2793f0;

    public final q f2794f1;

    public final c2.j f2795g0;

    public final d1 f2796g1;

    public final u.d0 f2797h0;

    public boolean f2798h1;

    public u.d0 f2799i0;

    public boolean f2800i1;

    public boolean f2801j0;

    public final hf.c f2802j1;

    public boolean f2803k0;

    public View f2804k1;

    public final v2.h f2805l0;

    public final v f2806l1;

    public final b50.e f2807m0;

    public final l1.i1 f2808n0;

    public final l1.w f2809o0;

    public final oj.q f2810p0;

    public final c2.c f2811q0;

    public boolean f2812r0;

    public final j f2813s0;

    public final i f2814t0;

    public final b3.b2 f2815u0;

    public z0 f2816v0;

    public y3.a f2817w0;

    public boolean f2818x0;

    public final b3.a1 f2819y0;

    public long f2820z0;

    public z(Context context, n1 n1Var) throws KotlinNothingValueException {
        super(context);
        this.A = l1.q.z(n1Var);
        this.B = 9205357640488583168L;
        int i10 = 1;
        this.C = true;
        this.E = n1Var.f2715r;
        this.H = w1.a.A;
        this.I = new h00.m();
        int i11 = 0;
        this.J = new k(this, 0);
        this.K = new l1.i1(z3.d(context), l1.c.E);
        this.M = new g2.n(this, this);
        this.N = n1Var.f2701b.k();
        this.O = new e2.b();
        this.P = new f2();
        this.Q = l1.q.z(Boolean.FALSE);
        this.R = l1.q.r(new q(this, i11));
        this.S = n1Var.f2717t;
        this.T = n1Var.f2714q;
        this.U = new z2.v();
        int i12 = 3;
        b3.l0 l0Var = new b3.l0(3);
        l0Var.e0(z2.o1.f17151b);
        l0Var.b0(getDensity());
        l0Var.g0(getViewConfiguration());
        l0Var.f0(new x(this).V(((g2.n) getFocusOwner()).f6075e).V(m18getDragAndDropManager().f5045c));
        this.V = l0Var;
        u.w wVar = u.m.f14876a;
        this.W = new u.w();
        getLayoutNodes();
        this.f2783a0 = new k3.b(this);
        this.f2785b0 = new j3.u(getRoot(), new j3.f(), getLayoutNodes());
        f0 f0Var = new f0(this);
        this.f2787c0 = f0Var;
        this.f2789d0 = new d2.d(this, new av.k(0, this, m0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 2));
        this.f2791e0 = n1Var.f2709j;
        this.f2793f0 = new i2.c(this);
        this.f2795g0 = new c2.j();
        this.f2797h0 = new u.d0();
        this.f2805l0 = new v2.h();
        b3.l0 root = getRoot();
        b50.e eVar = new b50.e();
        eVar.b = root;
        eVar.c = new v2.c((b3.u) root.f2059g0.D);
        eVar.d = new o10.b(27);
        eVar.e = new b3.s();
        this.f2807m0 = eVar;
        this.f2808n0 = l1.q.z(new Configuration(context.getResources().getConfiguration()));
        this.f2809o0 = l1.q.r(new q(this, i10));
        this.f2810p0 = new oj.q(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw a1.b.u("Autofill service could not be located.");
        }
        this.f2811q0 = new c2.c(new me.i(autofillManager, 12), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f2813s0 = n1Var.l;
        this.f2814t0 = n1Var.m;
        this.f2815u0 = new b3.b2(new u(this, i10));
        this.f2819y0 = new b3.a1(getRoot());
        long j9 = Integer.MAX_VALUE;
        this.f2820z0 = (j9 & 4294967295L) | (j9 << 32);
        this.A0 = new int[]{0, 0};
        this.B0 = i2.h0.a();
        this.C0 = i2.h0.a();
        this.D0 = i2.h0.a();
        this.E0 = -1L;
        this.G0 = 9187343241974906880L;
        y3.m mVar = null;
        this.H0 = l1.q.z(null);
        this.I0 = l1.q.r(new q(this, i12));
        this.M0 = new AtomicReference(null);
        this.O0 = n1Var.f2711n;
        this.P0 = n1Var.f2712o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = g2.h.f6064a;
        if (layoutDirection == 0) {
            mVar = y3.m.A;
        } else if (layoutDirection == 1) {
            mVar = y3.m.B;
        }
        this.Q0 = l1.q.z(mVar == null ? y3.m.A : mVar);
        this.R0 = n1Var.f2713p;
        int i13 = 2;
        this.S0 = new r2.c(isInTouchMode() ? 1 : 2);
        a3.b bVar = new a3.b();
        new m1.e(0, new b3.c[16]);
        new m1.e(0, new me.i[16]);
        new m1.e(0, new b3.l0[16]);
        new m1.e(0, new me.i[16]);
        this.T0 = bVar;
        r0 r0Var = new r0();
        new sg.f(new b3.j0(r0Var, 5));
        v2 v2Var = v2.A;
        this.U0 = r0Var;
        this.X0 = new a1.u0(11);
        this.Y0 = new u.d0();
        this.f2786b1 = new a50.d(this, 5);
        this.f2788c1 = new k(this, 1);
        this.f2792e1 = new x1(context, new u(this, i11));
        this.f2794f1 = new q(this, i13);
        this.f2796g1 = new d1();
        addOnAttachStateChangeListener(this.f2789d0);
        setWillNotDraw(false);
        setFocusable(true);
        l0.f2692a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        z4.j0.g(this, f0Var);
        setOnDragListener(m18getDragAndDropManager());
        getRoot().d(this);
        g0.f2673a.a(this);
        if (n()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131362728, Boolean.TRUE);
            this.L = view;
            addView(view, -1);
        }
        this.f2802j1 = new hf.c(3);
        this.f2806l1 = new v(this);
    }

    public static final void c(z zVar, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        f0 f0Var = zVar.f2787c0;
        if (kotlin.jvm.internal.m.a(str, f0Var.f2659d0)) {
            int iD2 = f0Var.f2657b0.d(i10, -1);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.m.a(str, f0Var.f2660e0) || (iD = f0Var.f2658c0.d(i10, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof z) {
                ((z) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    @g00.c
    public static void getFontLoader$annotations() {
    }

    public static void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final r3.z getLegacyTextInputServiceAndroid() {
        r3.z zVar = this.K0;
        if (zVar != null) {
            return zVar;
        }
        r3.z zVar2 = new r3.z(getView(), this);
        this.K0 = zVar2;
        return zVar2;
    }

    public static void m12getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static void getRoot$annotations() {
    }

    public static void getShowLayoutBounds$annotations() {
    }

    @g00.c
    public static void getTextInputService$annotations() {
    }

    public static void getWindowInfo$annotations() {
    }

    private final n1 get_composeViewContext() {
        return (n1) this.A.getValue();
    }

    public final o get_viewTreeOwners() {
        a1.b.x(this.H0.getValue());
        return null;
    }

    public static long h(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j9 = size;
        return j9 | (j9 << 32);
    }

    public static void l(b3.l0 l0Var) {
        l0Var.F();
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l((b3.l0) objArr[i11]);
        }
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || !k2.f2690a.a(motionEvent, i10);
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private final void setAttached(boolean z10) {
        this.Q.setValue(Boolean.valueOf(z10));
    }

    private void setDensity(y3.c cVar) {
        this.K.setValue(cVar);
    }

    private void setFontFamilyResolver(q3.h hVar) {
        this.P0.setValue(hVar);
    }

    private void setLayoutDirection(y3.m mVar) {
        this.Q0.setValue(mVar);
    }

    private final void set_composeViewContext(n1 n1Var) {
        this.A.setValue(n1Var);
    }

    private final void set_viewTreeOwners(o oVar) {
        this.H0.setValue(oVar);
    }

    public final void A(b3.l0 l0Var, boolean z10, boolean z11) throws NoWhenBranchMatchedException {
        b3.q0 q0Var = l0Var.f2060h0;
        b3.a1 a1Var = this.f2819y0;
        if (!z10) {
            a1Var.getClass();
            int iOrdinal = q0Var.f2112d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b3.l0 l0VarX = l0Var.x();
            boolean z12 = l0VarX == null || l0VarX.K();
            if (!z11) {
                if (l0Var.r()) {
                    return;
                }
                if (l0Var.q() && l0Var.K() == z12 && l0Var.K() == q0Var.f2122p.T) {
                    return;
                }
            }
            b3.c1 c1Var = q0Var.f2122p;
            c1Var.V = true;
            c1Var.W = true;
            if (!l0Var.f2070r0 && c1Var.T && z12) {
                if ((l0VarX == null || !l0VarX.q()) && (l0VarX == null || !l0VarX.r())) {
                    a1Var.f1990b.a(l0Var, b3.v.D);
                }
                if (a1Var.f1992d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        a1.i iVar = a1Var.f1990b;
        int iOrdinal2 = q0Var.f2112d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if ((q0Var.f2113e || q0Var.f2114f) && !z11) {
            return;
        }
        q0Var.f2114f = true;
        q0Var.f2115g = true;
        b3.c1 c1Var2 = q0Var.f2122p;
        c1Var2.V = true;
        c1Var2.W = true;
        if (l0Var.f2070r0) {
            return;
        }
        b3.l0 l0VarX2 = l0Var.x();
        if (kotlin.jvm.internal.m.a(l0Var.L(), Boolean.TRUE) && ((l0VarX2 == null || !l0VarX2.f2060h0.f2113e) && (l0VarX2 == null || !l0VarX2.f2060h0.f2114f))) {
            iVar.a(l0Var, b3.v.B);
        } else if (l0Var.K() && ((l0VarX2 == null || !l0VarX2.q()) && (l0VarX2 == null || !l0VarX2.r()))) {
            iVar.a(l0Var, b3.v.D);
        }
        if (a1Var.f1992d) {
            return;
        }
        F(null);
    }

    public final void B() {
        f0 f0Var = this.f2787c0;
        f0Var.X = true;
        Handler handler = f0Var.D.getHandler();
        if (f0Var.v() && !f0Var.f2664i0 && handler != null) {
            f0Var.f2664i0 = true;
            handler.post(f0Var.f2666k0);
        }
        d2.d dVar = this.f2789d0;
        dVar.G = true;
        Handler handler2 = dVar.A.getHandler();
        if (!dVar.f() || dVar.M || handler2 == null) {
            return;
        }
        dVar.M = true;
        handler2.post(dVar.N);
    }

    public final void C() {
        if (this.F0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.E0) {
            this.E0 = jCurrentAnimationTimeMillis;
            d1 d1Var = this.f2796g1;
            float[] fArr = this.C0;
            d1Var.a(this, fArr);
            m0.r(fArr, this.D0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.A0;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            this.G0 = (((long) Float.floatToRawIntBits(f3 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f10 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.E0 = AnimationUtils.currentAnimationTimeMillis();
        d1 d1Var = this.f2796g1;
        float[] fArr = this.C0;
        d1Var.a(this, fArr);
        m0.r(fArr, this.D0);
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jB = i2.h0.b(fArr, (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.G0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(b3.l0 l0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (l0Var != null) {
            while (l0Var != null && l0Var.s() == b3.h0.A) {
                if (!this.f2818x0) {
                    b3.l0 l0VarX = l0Var.x();
                    if (l0VarX == null) {
                        break;
                    }
                    long j9 = ((b3.u) l0VarX.f2059g0.D).D;
                    if (y3.a.f(j9) && y3.a.e(j9)) {
                        break;
                    }
                }
                l0Var = l0Var.x();
            }
            if (l0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j9) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (this.G0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (this.G0 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        return i2.h0.b(this.D0, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.f2798h1) {
            this.f2798h1 = false;
            f2 f2Var = getComposeViewContext().f2716s;
            int metaState = motionEvent.getMetaState();
            f2Var.getClass();
            h3.f2679a.setValue(new v2.z(metaState));
        }
        v2.h hVar = this.f2805l0;
        q3.e0 e0VarC = hVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        b50.e eVar = this.f2807m0;
        if (e0VarC == null) {
            if (!eVar.a) {
                ((u.q) ((o10.b) eVar.d).B).a();
                ((v2.c) eVar.c).c();
            }
            return 0;
        }
        List list = (List) e0VarC.B;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i10 = size - 1;
            obj = list.get(size);
            if (((v2.u) obj).f15421e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i10 < 0) {
                obj = null;
                break;
            }
            size = i10;
        }
        v2.u uVar = (v2.u) obj;
        if (uVar != null) {
            this.B = uVar.f15420d;
        }
        int iB = eVar.b(e0VarC, this, p(motionEvent));
        e0VarC.C = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iB & 1) != 0) {
            return iB;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        hVar.f15369c.delete(pointerId);
        hVar.f15368b.delete(pointerId);
        return iB;
    }

    public final void I(MotionEvent motionEvent, int i10, long j9, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f3 = pointerCoords.x;
            long jS = s((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jS >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jS & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j9 : motionEvent.getDownTime(), j9, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        q3.e0 e0VarC = this.f2805l0.c(motionEventObtain, this);
        kotlin.jvm.internal.m.b(e0VarC);
        this.f2807m0.b(e0VarC, this, true);
        motionEventObtain.recycle();
    }

    public final void J(u00.n nVar, m00.c cVar) throws KotlinNothingValueException {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.C = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.A;
        l00.a aVar = l00.a.A;
        int i11 = yVar.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            u uVar = new u(this, 2);
            yVar.C = 1;
            if (a40.c0.k(new a1.g(uVar, this.M0, nVar, (k00.c) null), yVar) == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void K(Configuration configuration) {
        l1.i1 i1Var;
        Configuration configuration2 = getConfiguration();
        if (kotlin.jvm.internal.m.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(z3.d(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (i1Var = this.P.f2670b) == null) {
            return;
        }
        i1Var.setValue(m0.g(this));
    }

    public final void L() {
        boolean z10;
        int i10;
        int[] iArr = this.A0;
        getLocationOnScreen(iArr);
        long j9 = this.f2820z0;
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        int i13 = iArr[0];
        if (i11 == i13 && i12 == iArr[1] && this.E0 >= 0) {
            z10 = false;
        } else {
            this.f2820z0 = (4294967295L & ((long) iArr[1])) | (((long) i13) << 32);
            if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                z10 = false;
            } else {
                m1.e eVarB = getRoot().B();
                Object[] objArr = eVarB.A;
                int i14 = eVarB.C;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((b3.l0) objArr[i15]).f2060h0.f2122p.W0();
                }
                z10 = true;
            }
        }
        C();
        View rootView = this.f2804k1;
        if (rootView == null) {
            rootView = getRootView();
            this.f2804k1 = rootView;
        }
        k3.b rectManager = getRectManager();
        long j10 = this.f2820z0;
        long jC = f50.k.C(this.G0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.C0;
        if (fArr.length < 16) {
            i10 = 0;
        } else {
            i10 = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        k3.e eVar = rectManager.f8933c;
        if ((i10 & 2) != 0) {
            fArr = null;
        }
        rectManager.f8936f = eVar.b(j10, jC, fArr, width, height) || rectManager.f8936f;
        this.f2819y0.c(z10);
        getRectManager().a();
    }

    public final void M(float f3) {
        if (n()) {
            if (f3 > 0.0f) {
                if (Float.isNaN(this.Z0) || f3 > this.Z0) {
                    this.Z0 = f3;
                    return;
                }
                return;
            }
            if (f3 < 0.0f) {
                if (Float.isNaN(this.f2784a1) || f3 < this.f2784a1) {
                    this.f2784a1 = f3;
                }
            }
        }
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        g2.a0 a0Var = ((g2.n) getFocusOwner()).f6073c;
        if (!a0Var.N) {
            return;
        }
        if (!a0Var.A.N) {
            y2.a.c("visitSubtreeIf called on an unattached node");
        }
        m1.e eVar = new m1.e(0, new b2.q[16]);
        b2.q qVar = a0Var.A;
        b2.q qVar2 = qVar.F;
        if (qVar2 == null) {
            b3.m.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        while (true) {
            int i12 = eVar.C;
            if (i12 == 0) {
                return;
            }
            b2.q qVar3 = (b2.q) eVar.k(i12 - 1);
            if ((qVar3.D & 1024) != 0) {
                for (b2.q qVar4 = qVar3; qVar4 != null && qVar4.N; qVar4 = qVar4.F) {
                    if ((qVar4.C & 1024) != 0) {
                        b2.q qVarE = qVar4;
                        m1.e eVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof g2.a0) {
                                g2.a0 a0Var2 = (g2.a0) qVarE;
                                if (a0Var2.N && a0Var2.D1().f6080a) {
                                    super.addFocusables(arrayList, i10, i11);
                                    g2.a0 a0Var3 = ((g2.n) getFocusOwner()).f6073c;
                                    if (a0Var3.N) {
                                        if (!a0Var3.A.N) {
                                            y2.a.c("visitSubtreeIf called on an unattached node");
                                        }
                                        m1.e eVar3 = new m1.e(0, new b2.q[16]);
                                        b2.q qVar5 = a0Var3.A;
                                        b2.q qVar6 = qVar5.F;
                                        if (qVar6 == null) {
                                            b3.m.b(eVar3, qVar5);
                                        } else {
                                            eVar3.b(qVar6);
                                        }
                                        while (true) {
                                            int i13 = eVar3.C;
                                            if (i13 == 0) {
                                                break;
                                            }
                                            b2.q qVar7 = (b2.q) eVar3.k(i13 - 1);
                                            if ((qVar7.D & 1024) != 0) {
                                                for (b2.q qVar8 = qVar7; qVar8 != null && qVar8.N; qVar8 = qVar8.F) {
                                                    if ((qVar8.C & 1024) != 0) {
                                                        b2.q qVarE2 = qVar8;
                                                        m1.e eVar4 = null;
                                                        while (qVarE2 != null) {
                                                            if (qVarE2 instanceof g2.a0) {
                                                                g2.a0 a0Var4 = (g2.a0) qVarE2;
                                                                if (a0Var4.N) {
                                                                    g2.r rVarD1 = a0Var4.D1();
                                                                    if (a0Var4.N && !a0Var4.O && rVarD1.f6080a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((qVarE2.C & 1024) != 0 && (qVarE2 instanceof b3.l)) {
                                                                int i14 = 0;
                                                                for (b2.q qVar9 = ((b3.l) qVarE2).P; qVar9 != null; qVar9 = qVar9.F) {
                                                                    if ((qVar9.C & 1024) != 0) {
                                                                        i14++;
                                                                        if (i14 == 1) {
                                                                            qVarE2 = qVar9;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new m1.e(0, new b2.q[16]);
                                                                            }
                                                                            if (qVarE2 != null) {
                                                                                eVar4.b(qVarE2);
                                                                                qVarE2 = null;
                                                                            }
                                                                            eVar4.b(qVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i14 == 1) {
                                                                }
                                                            }
                                                            qVarE2 = b3.m.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            b3.m.b(eVar3, qVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                int i15 = 0;
                                for (b2.q qVar10 = ((b3.l) qVarE).P; qVar10 != null; qVar10 = qVar10.F) {
                                    if ((qVar10.C & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            qVarE = qVar10;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar2.b(qVar10);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            qVarE = b3.m.e(eVar2);
                        }
                    }
                }
            }
            b3.m.b(eVar, qVar3);
        }
    }

    @Override
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override
    public final void addView(View view, int i10) {
        kotlin.jvm.internal.m.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override
    public final void autofill(SparseArray sparseArray) throws g00.j {
        j3.o oVarZ;
        u00.k kVar;
        u00.k kVar2;
        c2.c cVar = this.f2811q0;
        if (cVar != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                b3.l0 l0Var = (b3.l0) cVar.B.f7975c.b(iKeyAt);
                if (l0Var != null && (oVarZ = l0Var.z()) != null) {
                    u.i0 i0Var = oVarZ.A;
                    Object objG = i0Var.g(j3.n.f7946g);
                    if (objG == null) {
                        objG = null;
                    }
                    j3.a aVar = (j3.a) objG;
                    if (aVar != null && (kVar2 = aVar.f7927b) != null) {
                    }
                    Object objG2 = i0Var.g(j3.n.f7947h);
                    j3.a aVar2 = (j3.a) (objG2 != null ? objG2 : null);
                    if (aVar2 != null && (kVar = aVar2.f7927b) != null) {
                    }
                }
            }
        }
        oj.q qVar = this.f2810p0;
        if (qVar != null) {
            c2.j jVar = (c2.j) qVar.C;
            if (jVar.f2614a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iKeyAt2 = sparseArray.keyAt(i11);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (jVar.f2614a.get(Integer.valueOf(iKeyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new g00.j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new g00.j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new g00.j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override
    public final void b(g2.a0 a0Var, g2.a0 a0Var2) {
        a1.n nVar;
        boolean z10;
        a1.n nVar2;
        boolean z11;
        if (a0Var != null) {
            g2.a0 a0Var3 = a0Var;
            if (!a0Var3.A.N) {
                y2.a.c("visitAncestors called on an unattached node");
            }
            b2.q qVar = a0Var3.A;
            b3.l0 l0VarY = b3.m.y(a0Var);
            u.j0 j0Var = null;
            ArrayList arrayList = null;
            while (l0VarY != null) {
                if ((((b2.q) l0VarY.f2059g0.G).D & 2097152) != 0) {
                    while (qVar != null) {
                        if ((qVar.C & 2097152) != 0) {
                            b2.q qVarE = qVar;
                            m1.e eVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof s2.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(qVarE);
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11 && (qVarE.C & 2097152) != 0 && (qVarE instanceof b3.l)) {
                                    int i10 = 0;
                                    for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                        if ((qVar2.C & 2097152) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarE = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVarE = b3.m.e(eVar);
                            }
                        }
                        qVar = qVar.E;
                    }
                }
                l0VarY = l0VarY.x();
                qVar = (l0VarY == null || (nVar2 = l0VarY.f2059g0) == null) ? null : (b3.l2) nVar2.F;
            }
            if (arrayList == null) {
                return;
            }
            if (a0Var2 != null) {
                if (!a0Var2.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                b2.q qVar3 = a0Var2.A;
                b3.l0 l0VarY2 = b3.m.y(a0Var2);
                u.j0 j0Var2 = null;
                while (l0VarY2 != null) {
                    if ((((b2.q) l0VarY2.f2059g0.G).D & 2097152) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.C & 2097152) != 0) {
                                b2.q qVarE2 = qVar3;
                                m1.e eVar2 = null;
                                while (qVarE2 != null) {
                                    if (qVarE2 instanceof s2.c) {
                                        if (j0Var2 == null) {
                                            u.j0 j0Var3 = u.r0.f14890a;
                                            j0Var2 = new u.j0();
                                        }
                                        j0Var2.a(qVarE2);
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 && (qVarE2.C & 2097152) != 0 && (qVarE2 instanceof b3.l)) {
                                        int i11 = 0;
                                        for (b2.q qVar4 = ((b3.l) qVarE2).P; qVar4 != null; qVar4 = qVar4.F) {
                                            if ((qVar4.C & 2097152) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    qVarE2 = qVar4;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE2 != null) {
                                                        eVar2.b(qVarE2);
                                                        qVarE2 = null;
                                                    }
                                                    eVar2.b(qVar4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    qVarE2 = b3.m.e(eVar2);
                                }
                            }
                            qVar3 = qVar3.E;
                        }
                    }
                    l0VarY2 = l0VarY2.x();
                    qVar3 = (l0VarY2 == null || (nVar = l0VarY2.f2059g0) == null) ? null : (b3.l2) nVar.F;
                }
                j0Var = j0Var2;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                s2.c cVar = (s2.c) arrayList.get(i12);
                if (!(j0Var != null ? j0Var.c(cVar) : false)) {
                    cVar.C0();
                }
            }
        }
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        return this.f2787c0.m(i10, this.B, false);
    }

    @Override
    public final boolean canScrollVertically(int i10) {
        return this.f2787c0.m(i10, this.B, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u.d0 d0Var = this.f2797h0;
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        t(true);
        z1.l.j().m();
        this.f2801j0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            hf.c cVar = this.S;
            i2.a aVar = (i2.a) cVar.B;
            Canvas canvas2 = aVar.f7106a;
            aVar.f7106a = canvas;
            getRoot().j(aVar, null);
            ((i2.a) cVar.B).f7106a = canvas2;
            if (d0Var.i()) {
                int i10 = d0Var.f14838b;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((v1) ((b3.z1) d0Var.f(i11))).f();
                }
            }
            int i12 = e3.A;
            d0Var.d();
            this.f2801j0 = false;
            Trace.endSection();
            u.d0 d0Var2 = this.f2799i0;
            if (d0Var2 != null) {
                d0Var.c(d0Var2);
                d0Var2.d();
            }
            if (n()) {
                b1.a(this, this.Z0);
                View view = this.L;
                if (view != null) {
                    b1.a(view, this.f2784a1);
                    if (!Float.isNaN(this.f2784a1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.Z0 = Float.NaN;
                this.f2784a1 = Float.NaN;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        throw new UnsupportedOperationException("Method not decompiled: c3.z.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10 = this.f2790d1;
        k kVar = this.f2788c1;
        if (z10) {
            removeCallbacks(kVar);
            kVar.run();
        }
        if (!o(motionEvent) && isAttachedToWindow()) {
            f0 f0Var = this.f2787c0;
            z zVar = f0Var.D;
            AccessibilityManager accessibilityManager = f0Var.G;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x2 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    zVar.t(true);
                    b3.s sVar = new b3.s();
                    b3.l0 root = zVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
                    a1.n nVar = root.f2059g0;
                    b3.p1 p1Var = (b3.p1) nVar.E;
                    i2.q0 q0Var = b3.p1.f2089p0;
                    ((b3.p1) nVar.E).E1(b3.p1.f2093t0, p1Var.w1(true, jFloatToRawIntBits), sVar, 1, true);
                    int iM = va.a.M(sVar);
                    while (true) {
                        if (-1 < iM) {
                            Object objF = sVar.A.f(iM);
                            kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            b3.l0 l0VarY = b3.m.y((b2.q) objF);
                            if (zVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(l0VarY) == null) {
                                if (l0VarY.f2059g0.j(8)) {
                                    int iA = f0Var.A(l0VarY.B);
                                    j3.s sVarA = j3.v.a(l0VarY, false);
                                    if (j3.v.h(sVarA)) {
                                        if (!sVarA.k().A.c(j3.w.B)) {
                                            i10 = iA;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iM--;
                            }
                        }
                        i10 = Integer.MIN_VALUE;
                        break;
                    }
                    zVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i11 = f0Var.E;
                    if (i11 != i10) {
                        f0Var.E = i10;
                        f0.E(f0Var, i10, Cast.MAX_NAMESPACE_LENGTH, null, 12);
                        f0.E(f0Var, i11, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i12 = f0Var.E;
                    if (i12 == Integer.MIN_VALUE) {
                        zVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i12 != Integer.MIN_VALUE) {
                        f0Var.E = Integer.MIN_VALUE;
                        f0.E(f0Var, Integer.MIN_VALUE, Cast.MAX_NAMESPACE_LENGTH, null, 12);
                        f0.E(f0Var, i12, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && p(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.V0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.V0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f2790d1 = true;
                        postDelayed(kVar, 8L);
                        return false;
                    }
                } else if ((k(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (q(motionEvent)) {
                if ((k(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((g2.n) getFocusOwner()).e(keyEvent, new b3.k0(this, keyEvent, 3));
        }
        f2 f2Var = getComposeViewContext().f2716s;
        int metaState = keyEvent.getMetaState();
        f2Var.getClass();
        h3.f2679a.setValue(new v2.z(metaState));
        return ((g2.n) getFocusOwner()).e(keyEvent, g2.k.A) || super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        a1.n nVar;
        if (isFocused()) {
            g2.n nVar2 = (g2.n) getFocusOwner();
            if (nVar2.f6074d.f6070e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                g2.a0 a0VarF = g2.d.f(nVar2.f6073c);
                if (a0VarF != null) {
                    if (!a0VarF.A.N) {
                        y2.a.c("visitAncestors called on an unattached node");
                    }
                    b2.q qVar = a0VarF.A;
                    b3.l0 l0VarY = b3.m.y(a0VarF);
                    while (l0VarY != null) {
                        if ((((b2.q) l0VarY.f2059g0.G).D & 131072) != 0) {
                            while (qVar != null) {
                                if ((qVar.C & 131072) != 0) {
                                    b2.q qVarE = qVar;
                                    m1.e eVar = null;
                                    while (qVarE != null) {
                                        if ((qVarE.C & 131072) != 0 && (qVarE instanceof b3.l)) {
                                            int i10 = 0;
                                            for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                                if ((qVar2.C & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        qVarE = qVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new m1.e(0, new b2.q[16]);
                                                        }
                                                        if (qVarE != null) {
                                                            eVar.b(qVarE);
                                                            qVarE = null;
                                                        }
                                                        eVar.b(qVar2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        qVarE = b3.m.e(eVar);
                                    }
                                }
                                qVar = qVar.E;
                            }
                        }
                        l0VarY = l0VarY.x();
                        qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (b3.l2) nVar.F;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c1Var;
        g2.a0 a0VarG;
        if (this.f2790d1) {
            k kVar = this.f2788c1;
            removeCallbacks(kVar);
            MotionEvent motionEvent2 = this.V0;
            kotlin.jvm.internal.m.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f2790d1 = false;
            } else {
                kVar.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int iK = k(motionEvent);
            int i10 = 1;
            if ((iK & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z10 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z11 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z10 && z11) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c1Var = view.getTag(2131361900)) == null) {
                    c1Var = new c1(i10);
                }
                if (c1Var.equals(new c1(i10)) && (a0VarG = ((g2.n) getFocusOwner()).g()) != null) {
                    b3.p1 p1VarX = b3.m.x(a0VarG);
                    if (!z2.d0.i(p1VarX).F(p1VarX, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        g2.l.a(getFocusOwner());
                    }
                }
            }
            if ((iK & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override
    public final View focusSearch(View view, int i10) {
        h2.c cVarA;
        if (view == null || this.f2819y0.f1991c) {
            return super.focusSearch(view, i10);
        }
        View rootView = getRootView();
        kotlin.jvm.internal.m.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i10);
        if (viewFindNextFocus == null || !m0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            g2.a0 a0VarF = g2.d.f(((g2.n) getFocusOwner()).f6073c);
            cVarA = a0VarF != null ? g2.d.i(a0VarF) : null;
            if (cVarA == null) {
                cVarA = g2.h.a(view, this);
            }
        } else {
            cVarA = g2.h.a(view, this);
        }
        g2.f fVarD = g2.h.d(i10);
        int i11 = fVarD != null ? fVarD.f6063a : 6;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        if (((g2.n) getFocusOwner()).f(i11, cVarA, new s(zVar, 0)) == null) {
            return view;
        }
        Object obj = zVar.A;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i10);
            }
        } else if (viewFindNextFocus == null || i11 == 1 || i11 == 2 || g2.d.o(g2.d.i((g2.a0) obj), g2.h.a(viewFindNextFocus, this), cVarA, i11)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public h getAccessibilityManager() {
        return this.f2791e0;
    }

    public final z0 getAndroidViewsHandler$ui() {
        if (this.f2816v0 == null) {
            z0 z0Var = new z0(getContext());
            this.f2816v0 = z0Var;
            addView(z0Var, -1);
            requestLayout();
        }
        z0 z0Var2 = this.f2816v0;
        kotlin.jvm.internal.m.b(z0Var2);
        return z0Var2;
    }

    public c2.g getAutofill() {
        return this.f2810p0;
    }

    public c2.i getAutofillManager() {
        return this.f2811q0;
    }

    public c2.j getAutofillTree() {
        return this.f2795g0;
    }

    public i getClipboard() {
        return this.f2814t0;
    }

    public j getClipboardManager() {
        return this.f2813s0;
    }

    public final n1 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f2800i1;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f2808n0.getValue();
    }

    public final d2.d getContentCaptureManager$ui() {
        return this.f2789d0;
    }

    public k00.i getCoroutineContext() {
        return this.N;
    }

    public y3.c getDensity() {
        return (y3.c) this.K.getValue();
    }

    public e2.b m18getDragAndDropManager() {
        return this.O;
    }

    public h2.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            g2.a0 a0VarF = g2.d.f(((g2.n) getFocusOwner()).f6073c);
            if (a0VarF != null) {
                return g2.d.i(a0VarF);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return g2.h.a(viewFindFocus, this);
        }
        return null;
    }

    public g2.l getFocusOwner() {
        return this.M;
    }

    @Override
    public final void getFocusedRect(Rect rect) {
        h2.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f6546a);
            rect.top = Math.round(embeddedViewFocusRect.f6547b);
            rect.right = Math.round(embeddedViewFocusRect.f6548c);
            rect.bottom = Math.round(embeddedViewFocusRect.f6549d);
            return;
        }
        if (kotlin.jvm.internal.m.a(((g2.n) getFocusOwner()).f(6, null, t.B), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public q3.h getFontFamilyResolver() {
        return (q3.h) this.P0.getValue();
    }

    public q3.g getFontLoader() {
        return this.O0;
    }

    public final g2 getFrameEndScheduler$ui() {
        return this.F;
    }

    public i2.y getGraphicsContext() {
        return this.f2793f0;
    }

    public q2.a getHapticFeedBack() {
        return this.R0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f2819y0.f1990b.r() || !this.I.isEmpty();
    }

    @Override
    public int getImportantForAutofill() {
        return 1;
    }

    public r2.b getInputModeManager() {
        return this.S0;
    }

    public final z2.v getInsetsListener() {
        return this.U;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.E0;
    }

    @Override
    public y3.m getLayoutDirection() {
        return (y3.m) this.Q0.getValue();
    }

    public u.w getLayoutNodes() {
        return this.W;
    }

    public t3.b getLocaleList() {
        return (t3.b) this.f2809o0.getValue();
    }

    public long getMeasureIteration() {
        b3.a1 a1Var = this.f2819y0;
        if (!a1Var.f1991c) {
            y2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return a1Var.f1995g;
    }

    public a3.b getModifierLocalManager() {
        return this.T0;
    }

    public z getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public z2.k1 getPlacementScope() {
        int i10 = z2.n1.f17144b;
        return new z2.r0(this, 1);
    }

    public v2.q getPointerIconService() {
        return this.f2806l1;
    }

    public final s2.a m13getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.D;
    }

    public k3.b getRectManager() {
        return this.f2783a0;
    }

    public w1.d getRetainedValuesStore() {
        return this.H;
    }

    public b3.l0 getRoot() {
        return this.V;
    }

    public b3.h2 getRootForTest() {
        return this;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        hf.c cVar = this.f2802j1;
        if (cVar != null) {
            return ((Boolean) ((l1.i1) cVar.B).getValue()).booleanValue();
        }
        return false;
    }

    public j3.u getSemanticsOwner() {
        return this.f2785b0;
    }

    public b3.o0 getSharedDrawScope() {
        return this.E;
    }

    public boolean getShowLayoutBounds() {
        return a1.f2622a.a(this);
    }

    public b3.b2 getSnapshotObserver() {
        return this.f2815u0;
    }

    public t2 getSoftwareKeyboardController() {
        p1 p1Var = this.N0;
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = new p1(getTextInputService());
        this.N0 = p1Var2;
        return p1Var2;
    }

    public r3.x getTextInputService() {
        r3.x xVar = this.L0;
        if (xVar != null) {
            return xVar;
        }
        r3.x xVar2 = new r3.x(getLegacyTextInputServiceAndroid());
        this.L0 = xVar2;
        return xVar2;
    }

    public u2 getTextToolbar() {
        return this.U0;
    }

    public final b3.g2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    public c3 getViewConfiguration() {
        return this.T;
    }

    public final o getViewTreeOwners() {
        a1.b.x(this.I0.getValue());
        return null;
    }

    public g3 getWindowInfo() {
        return getComposeViewContext().f2716s;
    }

    public final c2.c get_autofillManager$ui() {
        return this.f2811q0;
    }

    public final b3.z1 i(u00.n nVar, b3.m1 m1Var, l2.b bVar) {
        m1.e eVar;
        Reference referencePoll;
        Object obj;
        if (bVar != null) {
            return new v1(bVar, null, this, nVar, m1Var);
        }
        do {
            a1.u0 u0Var = this.X0;
            ReferenceQueue referenceQueue = (ReferenceQueue) u0Var.C;
            eVar = (m1.e) u0Var.B;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i10 = eVar.C;
            if (i10 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.k(i10 - 1)).get();
        } while (obj == null);
        b3.z1 z1Var = (b3.z1) obj;
        if (z1Var == null) {
            return new v1(getGraphicsContext().c(), getGraphicsContext(), this, nVar, m1Var);
        }
        v1 v1Var = (v1) z1Var;
        i2.y yVar = v1Var.B;
        if (yVar == null) {
            throw a1.b.u("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!v1Var.A.f9989s) {
            y2.a.a("layer should have been released before reuse");
        }
        v1Var.A = yVar.c();
        v1Var.G = false;
        v1Var.D = nVar;
        v1Var.E = m1Var;
        v1Var.Q = false;
        v1Var.R = false;
        v1Var.S = true;
        i2.h0.d(v1Var.H);
        float[] fArr = v1Var.I;
        if (fArr != null) {
            i2.h0.d(fArr);
        }
        v1Var.O = i2.w0.f7175b;
        v1Var.T = false;
        long j9 = Integer.MAX_VALUE;
        v1Var.F = (j9 & 4294967295L) | (j9 << 32);
        v1Var.P = null;
        v1Var.N = 0;
        return z1Var;
    }

    public final void j(b3.l0 l0Var, boolean z10) {
        this.f2819y0.h(l0Var, z10);
    }

    public final int k(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        z zVar;
        removeCallbacks(this.f2786b1);
        try {
            D(motionEvent);
            this.F0 = true;
            t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.V0;
                boolean z10 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                b50.e eVar = this.f2807m0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!eVar.a) {
                                ((u.q) ((o10.b) eVar.d).B).a();
                                ((v2.c) eVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z10) {
                            motionEvent2 = motionEvent3;
                        } else {
                            I(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked2 == 3 || actionMasked2 == 9 || !p(motionEvent)) {
                    zVar = this;
                } else {
                    zVar = this;
                    zVar.I(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = zVar.V0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = zVar.V0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    v2.h hVar = zVar.f2805l0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            hVar.f15369c.delete(pointerId);
                            hVar.f15368b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = zVar.V0;
                        float x2 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = zVar.V0;
                        boolean z12 = (x2 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = zVar.V0;
                        boolean z13 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                hVar.f15369c.delete(pointerId);
                                hVar.f15368b.delete(pointerId);
                            }
                            v2.c cVar = (v2.c) eVar.c;
                            if (cVar.f15360d) {
                                cVar.f15360d = true;
                            } else {
                                cVar.f15363g.f15385a.g();
                            }
                        }
                    }
                }
                zVar.V0 = MotionEvent.obtainNoHistory(motionEvent);
                int iH = H(motionEvent);
                Trace.endSection();
                zVar.F0 = false;
                return iH;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.F0 = false;
            throw th4;
        }
    }

    public final void m(b3.l0 l0Var) {
        this.f2819y0.s(l0Var, false);
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            m((b3.l0) objArr[i11]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        w1.d dVar;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        this.U.onViewAttachedToWindow(this);
        int i10 = 0;
        if (f2781p1 == null) {
            l lVar = new l(0);
            f2781p1 = lVar;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (f2778m1 == null) {
                    f2778m1 = Class.forName("android.os.SystemProperties");
                }
                if (f2779n1 == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = f2778m1;
                    f2779n1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = f2779n1;
                if (method != null) {
                    method.invoke(null, lVar);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        u.d0 d0Var = f2780o1;
        synchronized (d0Var) {
            d0Var.a(this);
        }
        if (!this.f2800i1) {
            getComposeViewContext().c();
        }
        this.f2800i1 = false;
        m(getRoot());
        l(getRoot());
        getSnapshotObserver().f2003a.e();
        oj.q qVar = this.f2810p0;
        if (qVar != null) {
            c2.h hVar = c2.h.f2613a;
            hVar.getClass();
            ((AutofillManager) qVar.D).registerCallback(hVar);
        }
        androidx.lifecycle.w wVar = getComposeViewContext().f2702c;
        androidx.lifecycle.f1 f1Var = getComposeViewContext().f2704e;
        g2 g2Var = this.F;
        if (wVar == null || f1Var == null || g2Var == null) {
            dVar = null;
        } else {
            androidx.lifecycle.e1 viewModelStore = f1Var.getViewModelStore();
            androidx.lifecycle.d1 d1Var = new androidx.lifecycle.d1();
            t6.a aVar = t6.a.f14359b;
            kotlin.jvm.internal.m.e(viewModelStore, "store");
            kotlin.jvm.internal.m.e(aVar, "extras");
            p10.a aVar2 = new p10.a(viewModelStore, d1Var, aVar);
            a10.d dVarB = kotlin.jvm.internal.a0.a.b(i2.class);
            String strM = dVarB.m();
            if (strM == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            i2 i2Var = (i2) aVar2.o(dVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM));
            Object parent = getParent();
            kotlin.jvm.internal.m.c(parent, "null cannot be cast to non-null type android.view.View");
            int id2 = ((View) parent).getId();
            u.w wVar2 = i2Var.f2682c;
            Object objB = wVar2.b(id2);
            if (objB == null) {
                objB = new u.d0(1);
                wVar2.i(id2, objB);
            }
            u.d0 d0Var2 = (u.d0) objB;
            Object[] objArr = d0Var2.f14837a;
            int i11 = d0Var2.f14838b;
            while (true) {
                if (i10 >= i11) {
                    obj = null;
                    break;
                }
                obj = objArr[i10];
                if (!((h2) obj).f2677c) {
                    break;
                } else {
                    i10++;
                }
            }
            h2 h2Var = (h2) obj;
            if (h2Var == null) {
                h2Var = new h2();
                d0Var2.a(h2Var);
            }
            h2Var.f2677c = true;
            this.G = h2Var;
            dVar = h2Var.f2676b;
        }
        if (dVar == null) {
            dVar = w1.a.A;
        }
        this.H = dVar;
        u00.k kVar = this.J0;
        if (kVar != null) {
            kVar.invoke(getComposeViewContext());
            this.J0 = null;
        }
        androidx.lifecycle.q lifecycle = getComposeViewContext().f2702c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.f2789d0);
        this.S0.f13044a.setValue(new r2.a(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        j0.f2685a.b(this);
        c2.c cVar = this.f2811q0;
        if (cVar != null) {
            ((g2.n) getFocusOwner()).f6077g.a(cVar);
            getSemanticsOwner().f7976d.a(cVar);
        }
        ((g2.n) getFocusOwner()).f6077g.a(this);
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        b2.t tVar = (b2.t) this.M0.get();
        q0 q0Var = (q0) (tVar != null ? tVar.f1985b : null);
        if (q0Var == null) {
            return getLegacyTextInputServiceAndroid().f13107d;
        }
        b2.t tVar2 = (b2.t) q0Var.D.get();
        z1 z1Var = (z1) (tVar2 != null ? tVar2.f1985b : null);
        return z1Var != null && (z1Var.f2825e ^ true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        b2.t tVar = (b2.t) this.M0.get();
        q0 q0Var = (q0) (tVar != null ? tVar.f1985b : null);
        if (q0Var == null) {
            r3.z legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f13107d) {
                r3.j jVar = legacyTextInputServiceAndroid.f13111h;
                r3.w wVar = legacyTextInputServiceAndroid.f13110g;
                int i11 = jVar.f13077e;
                boolean z10 = jVar.f13073a;
                if (i11 == 1) {
                    i10 = z10 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = jVar.f13076d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z10) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = jVar.f13074b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (jVar.f13075c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j9 = wVar.f13100b;
                int i16 = m3.q0.f10519c;
                editorInfo.initialSelStart = (int) (j9 >> 32);
                editorInfo.initialSelEnd = (int) (j9 & 4294967295L);
                editorInfo.setInitialSurroundingSubText(wVar.f13099a.B, 0);
                editorInfo.imeOptions |= 33554432;
                if (v5.g.d()) {
                    v5.g.a().i(editorInfo);
                }
                r3.s sVar = new r3.s(legacyTextInputServiceAndroid.f13110g, new o9.q(legacyTextInputServiceAndroid, 11), legacyTextInputServiceAndroid.f13111h.f13075c);
                legacyTextInputServiceAndroid.f13112i.add(new WeakReference(sVar));
                return sVar;
            }
        } else {
            b2.t tVar2 = (b2.t) q0Var.D.get();
            z1 z1Var = (z1) (tVar2 != null ? tVar2.f1985b : null);
            if (z1Var != null) {
                synchronized (z1Var.f2823c) {
                    if (z1Var.f2825e) {
                        return null;
                    }
                    InputConnection inputConnectionA = z1Var.f2821a.a(editorInfo);
                    b3.a aVar = new b3.a(z1Var, 11);
                    InputConnection nVar = Build.VERSION.SDK_INT >= 34 ? new r3.n(inputConnectionA, aVar) : new r3.m(inputConnectionA, aVar);
                    z1Var.f2824d.b(new b3.q2(nVar));
                    return nVar;
                }
            }
        }
        return null;
    }

    @Override
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        j3.s sVar;
        String strA;
        d2.d dVar = this.f2789d0;
        dVar.getClass();
        for (long j9 : jArr) {
            j3.t tVar = (j3.t) dVar.e().b((int) j9);
            if (tVar != null && (sVar = tVar.f7971a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(dVar.A.getAutofillId(), sVar.f7970f);
                Object objG = sVar.f7968d.A.g(j3.w.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = a4.a.a(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new m3.h(strA)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.U.onViewDetachedFromWindow(this);
        View view = this.L;
        if (n() && view != null) {
            removeView(view);
        }
        u.d0 d0Var = f2780o1;
        synchronized (d0Var) {
            d0Var.j(this);
        }
        getComposeViewContext().b();
        z1.u uVar = getSnapshotObserver().f2003a;
        y8.g gVar = uVar.f17071h;
        if (gVar != null) {
            gVar.a();
        }
        uVar.a();
        androidx.lifecycle.q lifecycle = getComposeViewContext().f2702c.getLifecycle();
        lifecycle.d(this.f2789d0);
        lifecycle.d(this);
        oj.q qVar = this.f2810p0;
        if (qVar != null) {
            c2.h hVar = c2.h.f2613a;
            hVar.getClass();
            ((AutofillManager) qVar.D).unregisterCallback(hVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        h2 h2Var = this.G;
        if (h2Var != null) {
            h2Var.f2677c = false;
        }
        this.G = null;
        j0.f2685a.a(this);
        c2.c cVar = this.f2811q0;
        if (cVar != null) {
            getSemanticsOwner().f7976d.j(cVar);
            ((g2.n) getFocusOwner()).f6077g.j(cVar);
        }
        k3.b rectManager = getRectManager();
        rectManager.f8936f = rectManager.f8933c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        k3.b rectManager2 = getRectManager();
        b4.a aVar = rectManager2.f8938h;
        if (aVar != null) {
            rectManager2.f8931a.removeCallbacks(aVar);
            rectManager2.f8938h = null;
        }
        ((g2.n) getFocusOwner()).f6077g.j(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        g2.n nVar = (g2.n) getFocusOwner();
        g2.d.d(nVar.f6073c, true);
        if (nVar.g() != null) {
            g2.a0 a0VarG = nVar.g();
            nVar.j(null);
            if (a0VarG != null) {
                a0VarG.C1(g2.y.A, g2.y.C);
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.E0 = 0L;
        L();
        if (Build.VERSION.SDK_INT < 34) {
            K(getResources().getConfiguration());
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.E0 = 0L;
            this.f2819y0.m(this.f2794f1);
            this.f2817w0 = null;
            L();
            if (this.f2816v0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i12 - i10, i13 - i11);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b3.a1 a1Var = this.f2819y0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long jH = h(i10);
            long jH2 = h(i11);
            long jF = g4.F((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            y3.a aVar = this.f2817w0;
            if (aVar == null) {
                this.f2817w0 = new y3.a(jF);
                this.f2818x0 = false;
            } else if (!y3.a.b(aVar.f16587a, jF)) {
                this.f2818x0 = true;
            }
            a1Var.t(jF);
            a1Var.o();
            setMeasuredDimension(getRoot().f2060h0.f2122p.A, getRoot().f2060h0.f2122p.B);
            if (this.f2816v0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f2060h0.f2122p.A, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f2060h0.f2122p.B, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        if (viewStructure != null) {
            c2.c cVar = this.f2811q0;
            if (cVar != null) {
                b3.l0 l0Var = cVar.B.f7973a;
                AutofillId autofillId = cVar.G;
                String str = cVar.E;
                k3.b bVar = cVar.D;
                kh.o.I(viewStructure, l0Var, autofillId, str, bVar);
                Object[] objArr = u.o0.f14881a;
                u.d0 d0Var = new u.d0(2);
                d0Var.a(l0Var);
                d0Var.a(viewStructure);
                while (d0Var.i()) {
                    Object objK = d0Var.k(d0Var.f14838b - 1);
                    kotlin.jvm.internal.m.c(objK, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = d0Var.k(d0Var.f14838b - 1);
                    kotlin.jvm.internal.m.c(objK2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    m1.b bVar2 = (m1.b) ((b3.l0) objK2).o();
                    int i11 = ((m1.e) bVar2.B).C;
                    for (int i12 = 0; i12 < i11; i12++) {
                        b3.l0 l0Var2 = (b3.l0) bVar2.get(i12);
                        if (!l0Var2.f2070r0 && l0Var2.J() && l0Var2.K()) {
                            j3.o oVarZ = l0Var2.z();
                            if (oVarZ != null) {
                                u.i0 i0Var = oVarZ.A;
                                if (i0Var.b(j3.n.f7946g) || i0Var.b(j3.n.f7947h) || i0Var.b(j3.w.f7993r) || i0Var.b(j3.w.f7994s)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    kh.o.I(viewStructureNewChild, l0Var2, autofillId, str, bVar);
                                    d0Var.a(l0Var2);
                                    d0Var.a(viewStructureNewChild);
                                } else {
                                    d0Var.a(l0Var2);
                                    d0Var.a(viewStructure2);
                                }
                            } else {
                                d0Var.a(l0Var2);
                                d0Var.a(viewStructure2);
                            }
                        }
                    }
                }
            }
            oj.q qVar = this.f2810p0;
            if (qVar != null) {
                c2.j jVar = (c2.j) qVar.C;
                LinkedHashMap linkedHashMap = jVar.f2614a;
                LinkedHashMap linkedHashMap2 = jVar.f2614a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        throw new ClassCastException();
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) qVar.E, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((z) qVar.B).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        v2.p pVar;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (pVar = ((v) getPointerIconService()).f2765a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        return pVar instanceof v2.a ? PointerIcon.getSystemIcon(context, ((v2.a) pVar).f15350b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override
    public final void onResume(androidx.lifecycle.w wVar) {
        l1.d dVarV;
        h2 h2Var = this.G;
        if (h2Var != null) {
            g2 g2Var = this.F;
            kotlin.jvm.internal.m.b(g2Var);
            qj.c cVar = h2Var.f2675a;
            w1.c cVar2 = (w1.c) cVar.B;
            if (!cVar2.A || cVar2.C) {
                return;
            }
            try {
                dVarV = ((t3) g2Var).A.v(new b3.j0(h2Var, 7));
            } catch (CancellationException unused) {
                w1.c cVar3 = (w1.c) cVar.B;
                if (!cVar3.B) {
                    if (cVar3.C) {
                        x1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar3.a();
                    cVar3.C = true;
                }
                dVarV = null;
            }
            l1.d dVar = h2Var.f2678d;
            if (dVar != null) {
                dVar.cancel();
            }
            h2Var.f2678d = dVarV;
        }
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        y3.m mVar;
        if (this.C) {
            int[] iArr = g2.h.f6064a;
            if (i10 != 0) {
                mVar = i10 != 1 ? null : y3.m.B;
            } else {
                mVar = y3.m.A;
            }
            if (mVar == null) {
                mVar = y3.m.A;
            }
            setLayoutDirection(mVar);
        }
    }

    @Override
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        hf.c cVar = this.f2802j1;
        if (cVar != null) {
            j3.u semanticsOwner = getSemanticsOwner();
            k00.i coroutineContext = getCoroutineContext();
            m1.e eVar = new m1.e(0, new i3.g[16]);
            a10.h0.W(semanticsOwner.a(), 0, new a1.h2(1, eVar, m1.e.class, "add", "add(Ljava/lang/Object;)Z", 8, 1));
            eVar.n(p30.f.Y(new u00.k[]{i3.b.C, i3.b.D}));
            int i10 = eVar.C;
            i3.g gVar = (i3.g) (i10 == 0 ? null : eVar.A[i10 - 1]);
            if (gVar == null) {
                return;
            }
            y3.k kVar = gVar.f7190c;
            i3.c cVar2 = new i3.c(gVar.f7188a, kVar, a40.c0.c(coroutineContext), cVar, this);
            b3.p1 p1Var = gVar.f7191d;
            h2.c cVarF = z2.d0.i(p1Var).F(p1Var, true);
            long jC = kVar.c();
            ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, i2.b0.z(k00.f.Q(cVarF)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), cVar2);
            scrollCaptureTarget.setScrollBounds(i2.b0.z(kVar));
            consumer.accept(scrollCaptureTarget);
        }
    }

    @Override
    public final void onScrollChanged() {
        L();
    }

    @Override
    public final void onStop(androidx.lifecycle.w wVar) {
        h2 h2Var = this.G;
        if (h2Var != null) {
            w1.c cVar = (w1.c) h2Var.f2675a.B;
            if (cVar.A && !cVar.C) {
                l1.d dVar = h2Var.f2678d;
                if (dVar != null) {
                    dVar.cancel();
                }
                h2Var.f2678d = null;
                return;
            }
            if (cVar.B) {
                return;
            }
            if (!cVar.C) {
                x1.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.D.i()) {
                x1.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.C = false;
        }
    }

    @Override
    public final void onTouchModeChanged(boolean z10) {
        this.S0.f13044a.setValue(new r2.a(z10 ? 1 : 2));
    }

    @Override
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        d2.d dVar = this.f2789d0;
        dVar.getClass();
        if (kotlin.jvm.internal.m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            w50.c.y(dVar, longSparseArray);
        } else {
            dVar.A.post(new ab.f(dVar, longSparseArray, 10));
        }
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f2798h1 = true;
        super.onWindowFocusChanged(z10);
    }

    public final boolean p(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.V0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void r(float[] fArr) {
        C();
        i2.h0.e(fArr, this.C0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.G0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.G0 & 4294967295L));
        float[] fArr2 = this.B0;
        i2.h0.d(fArr2);
        i2.h0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fJ = m0.j(0, 0, fArr2, fArr);
        float fJ2 = m0.j(0, 1, fArr2, fArr);
        float fJ3 = m0.j(0, 2, fArr2, fArr);
        float fJ4 = m0.j(0, 3, fArr2, fArr);
        float fJ5 = m0.j(1, 0, fArr2, fArr);
        float fJ6 = m0.j(1, 1, fArr2, fArr);
        float fJ7 = m0.j(1, 2, fArr2, fArr);
        float fJ8 = m0.j(1, 3, fArr2, fArr);
        float fJ9 = m0.j(2, 0, fArr2, fArr);
        float fJ10 = m0.j(2, 1, fArr2, fArr);
        float fJ11 = m0.j(2, 2, fArr2, fArr);
        float fJ12 = m0.j(2, 3, fArr2, fArr);
        float fJ13 = m0.j(3, 0, fArr2, fArr);
        float fJ14 = m0.j(3, 1, fArr2, fArr);
        float fJ15 = m0.j(3, 2, fArr2, fArr);
        float fJ16 = m0.j(3, 3, fArr2, fArr);
        fArr[0] = fJ;
        fArr[1] = fJ2;
        fArr[2] = fJ3;
        fArr[3] = fJ4;
        fArr[4] = fJ5;
        fArr[5] = fJ6;
        fArr[6] = fJ7;
        fArr[7] = fJ8;
        fArr[8] = fJ9;
        fArr[9] = fJ10;
        fArr[10] = fJ11;
        fArr[11] = fJ12;
        fArr[12] = fJ13;
        fArr[13] = fJ14;
        fArr[14] = fJ15;
        fArr[15] = fJ16;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        if (!isFocused()) {
            g2.f fVarD = g2.h.d(i10);
            int i11 = fVarD != null ? fVarD.f6063a : 7;
            Boolean boolF = ((g2.n) getFocusOwner()).f(i11, rect != null ? new h2.c(rect.left, rect.top, rect.right, rect.bottom) : null, new w(i11, 0));
            Boolean bool = Boolean.TRUE;
            if (!kotlin.jvm.internal.m.a(boolF, bool)) {
                if (!kotlin.jvm.internal.m.a(((g2.n) getFocusOwner()).f(i11, null, new w(i11, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i11 == 1 || i11 == 2) {
                        return ((g2.n) getFocusOwner()).i(i11);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final long s(long j9) {
        C();
        long jB = i2.h0.b(this.C0, j9);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.G0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.G0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j9) {
        this.f2787c0.H = j9;
    }

    public final void setComposeViewContext(n1 n1Var) {
        if (getCoroutineContext() != n1Var.f2701b.k() && !((m1.b) getRoot().o()).isEmpty()) {
            y2.a.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            n1 n1Var2 = get_composeViewContext();
            z1.q.n(fVarF, fVarK, kVarE);
            if (n1Var.equals(n1Var2)) {
                return;
            }
            if (isAttachedToWindow()) {
                n1Var2.b();
                n1Var.c();
            }
            set_composeViewContext(n1Var);
            setCoroutineContext(n1Var.f2701b.k());
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z10) {
        this.f2800i1 = z10;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f2808n0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(d2.d dVar) {
        this.f2789d0 = dVar;
    }

    public void setCoroutineContext(k00.i iVar) {
        this.N = iVar;
    }

    public final void setFrameEndScheduler$ui(g2 g2Var) {
        this.F = g2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j9) {
        this.E0 = j9;
    }

    public final void setOnReadyForComposition(u00.k kVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f2800i1) {
            kVar.invoke(getComposeViewContext());
        } else {
            this.J0 = kVar;
        }
    }

    public final void m14setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(s2.a aVar) {
        this.D = aVar;
    }

    public void setShowLayoutBounds(boolean z10) {
    }

    public void setUncaughtExceptionHandler(b3.g2 g2Var) {
        this.f2819y0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(b3.g2 g2Var) {
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z10) {
        q qVar;
        b3.a1 a1Var = this.f2819y0;
        if (a1Var.f1990b.r() || ((m1.e) a1Var.f1993e.B).C != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    qVar = this.f2794f1;
                } finally {
                    Trace.endSection();
                }
            } else {
                qVar = null;
            }
            if (a1Var.m(qVar)) {
                requestLayout();
            }
            a1Var.c(false);
            getRectManager().a();
            if (this.f2803k0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f2803k0 = false;
            }
        }
    }

    public final void u(b3.l0 l0Var, long j9) {
        b3.a1 a1Var = this.f2819y0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            a1Var.n(l0Var, j9);
            if (!a1Var.f1990b.r()) {
                a1Var.c(false);
                getRectManager().a();
                if (this.f2803k0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f2803k0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean v(int i10) throws KotlinNothingValueException {
        if (i10 == 7 || i10 == 8) {
            return false;
        }
        Integer numC = g2.h.c(i10);
        if (numC == null) {
            throw a1.b.u("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        g2.a0 a0VarG = ((g2.n) getFocusOwner()).g();
        if (a0VarG == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = g2.h.c(i10);
        if (numC2 == null) {
            throw a1.b.u("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        b4.z zVar = b3.m.y(a0VarG).P;
        View interopView = zVar != null ? zVar.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        kotlin.jvm.internal.m.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !m0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return g2.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void w(b3.z1 z1Var, boolean z10) {
        u.d0 d0Var = this.f2797h0;
        if (!z10) {
            if (this.f2801j0) {
                return;
            }
            d0Var.j(z1Var);
            u.d0 d0Var2 = this.f2799i0;
            if (d0Var2 != null) {
                d0Var2.j(z1Var);
                return;
            }
            return;
        }
        if (!this.f2801j0) {
            d0Var.a(z1Var);
            return;
        }
        u.d0 d0Var3 = this.f2799i0;
        if (d0Var3 == null) {
            d0Var3 = new u.d0();
            this.f2799i0 = d0Var3;
        }
        d0Var3.a(z1Var);
    }

    public final void x() {
        if (this.f2812r0) {
            z1.u uVar = getSnapshotObserver().f2003a;
            synchronized (uVar.f17070g) {
                try {
                    m1.e eVar = uVar.f17069f;
                    int i10 = eVar.C;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        z1.t tVar = (z1.t) eVar.A[i12];
                        tVar.d();
                        if (!tVar.f17058f.j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.A;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(eVar.A, i13, i10, (Object) null);
                    eVar.C = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f2812r0 = false;
        }
        z0 z0Var = this.f2816v0;
        if (z0Var != null) {
            g(z0Var);
        }
        c2.c cVar = this.f2811q0;
        if (cVar != null) {
            u.x xVar = cVar.H;
            if (xVar.f14909d == 0 && cVar.I) {
                ((AutofillManager) cVar.A.B).commit();
                cVar.I = false;
            }
            if (xVar.f14909d != 0) {
                cVar.I = true;
            }
        }
        while (this.Y0.i() && this.Y0.f(0) != null) {
            int i14 = this.Y0.f14838b;
            for (int i15 = 0; i15 < i14; i15++) {
                u00.a aVar = (u00.a) this.Y0.f(i15);
                this.Y0.n(i15, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.Y0.l(0, i14);
        }
    }

    public final void y(b3.l0 l0Var) {
        f0 f0Var = this.f2787c0;
        f0Var.X = true;
        if (f0Var.v()) {
            f0Var.w(l0Var);
        }
        d2.d dVar = this.f2789d0;
        dVar.G = true;
        if (dVar.f()) {
            dVar.H.j(g00.b0.a);
        }
    }

    public final void z(b3.l0 l0Var, boolean z10, boolean z11, boolean z12) throws NoWhenBranchMatchedException {
        b3.l0 l0VarX;
        b3.l0 l0VarX2;
        b3.a1 a1Var = this.f2819y0;
        if (!z10) {
            if (a1Var.s(l0Var, z11) && z12) {
                F(l0Var);
                return;
            }
            return;
        }
        a1.i iVar = a1Var.f1990b;
        b3.l0 l0Var2 = l0Var.I;
        b3.q0 q0Var = l0Var.f2060h0;
        if (l0Var2 == null) {
            y2.a.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = q0Var.f2112d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!q0Var.f2113e || z11) {
                    q0Var.f2113e = true;
                    q0Var.f2122p.U = true;
                    if (l0Var.f2070r0) {
                        return;
                    }
                    if ((kotlin.jvm.internal.m.a(l0Var.L(), Boolean.TRUE) || b3.a1.j(l0Var)) && ((l0VarX = l0Var.x()) == null || !l0VarX.f2060h0.f2113e)) {
                        iVar.a(l0Var, b3.v.A);
                    } else if ((l0Var.K() || b3.a1.k(l0Var)) && ((l0VarX2 = l0Var.x()) == null || !l0VarX2.r())) {
                        iVar.a(l0Var, b3.v.C);
                    }
                    if (a1Var.f1992d || !z12) {
                        return;
                    }
                    F(l0Var);
                    return;
                }
                return;
            }
        }
        a1Var.f1996h.b(new b3.z0(l0Var, true, z11));
    }
}
