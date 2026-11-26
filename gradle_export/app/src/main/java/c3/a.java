package c3;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import com.google.android.gms.internal.measurement.y3;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;

public abstract class a extends ViewGroup {
    public WeakReference A;
    public IBinder B;
    public s3 C;
    public l1.n D;
    public n1 E;
    public u00.a F;
    public boolean G;
    public boolean H;
    public boolean I;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        z2 z2Var = new z2(this, 1);
        addOnAttachStateChangeListener(z2Var);
        a3 a3Var = new a3(this);
        w00.a.w(this).f11107a.add(a3Var);
        this.F = new b50.l(this, z2Var, a3Var, 1);
    }

    public static void getComposeViewContext$ui$annotations() {
    }

    private static void getDisposeViewCompositionStrategy$annotations() {
    }

    public static void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(l1.n nVar) {
        if (this.D != nVar) {
            this.D = nVar;
            if (nVar != null) {
                this.A = null;
            }
            s3 s3Var = this.C;
            if (s3Var != null) {
                s3Var.dispose();
                this.C = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.B != iBinder) {
            this.B = iBinder;
            this.A = null;
        }
    }

    public abstract void a(l1.j jVar, int i10);

    @Override
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override
    public final void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override
    public final void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }

    @Override
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @Override
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.E == null) {
                z zVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof z) {
                        zVar = (z) childAt;
                    }
                }
                if (zVar != null) {
                    zVar.setComposeViewContext(k(m0.l(this), zVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.H) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        n1 n1Var;
        View view;
        if (this.D == null && !isAttachedToWindow() && ((n1Var = this.E) == null || (view = n1Var.f2700a) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        View childAt = getChildAt(0);
        z zVar = childAt instanceof z ? (z) childAt : null;
        if (zVar != null && zVar.f2800i1) {
            zVar.getComposeViewContext().b();
            zVar.f2800i1 = false;
        }
        s3 s3Var = this.C;
        if (s3Var != null) {
            s3Var.dispose();
        }
        this.C = null;
        requestLayout();
    }

    public final void f() {
        if (this.C == null) {
            try {
                this.H = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    n1 n1VarI = this.E;
                    if (n1VarI == null) {
                        n1VarI = i();
                    }
                    this.C = u3.a(this, n1VarI, new v1.c(new b2.n(this, 1), 1003123809, true));
                    Trace.endSection();
                    this.H = false;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                this.H = false;
                throw th3;
            }
        }
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final int m10getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(2131361900);
        c1 c1Var = tag instanceof c1 ? (c1) tag : null;
        if (c1Var != null) {
            return c1Var.f2636a;
        }
        return 1;
    }

    public final n1 getComposeViewContext$ui() {
        return this.E;
    }

    public final boolean getHasComposition() {
        return this.C != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.G;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final n1 i() throws KotlinNothingValueException {
        n1 composeViewContext;
        androidx.lifecycle.f1 f1Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            z zVar = childAt instanceof z ? (z) childAt : null;
            if (zVar != null) {
                composeViewContext = zVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewL = m0.l(this);
        n1 n1VarM = m0.m(viewL);
        if (n1VarM != null) {
            return k(viewL, n1VarM);
        }
        l1.n nVarJ = j();
        androidx.lifecycle.w wVarE = androidx.lifecycle.u0.e(viewL);
        if (wVarE == null) {
            wVarE = composeViewContext != null ? composeViewContext.f2702c : null;
            if (wVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        androidx.lifecycle.w wVar = wVarE;
        ia.g gVarE = y3.E(viewL);
        if (gVarE == null) {
            gVarE = composeViewContext != null ? composeViewContext.f2703d : null;
            if (gVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
        }
        ia.g gVar = gVarE;
        androidx.lifecycle.f1 f1VarF = androidx.lifecycle.u0.f(viewL);
        if (f1VarF == null) {
            f1Var = composeViewContext != null ? composeViewContext.f2704e : null;
        } else {
            f1Var = f1VarF;
        }
        n1 n1Var = new n1(m0.m(m0.l(viewL)), viewL, nVarJ, wVar, gVar, f1Var);
        viewL.setTag(2131361882, new WeakReference(n1Var));
        return n1Var;
    }

    @Override
    public final boolean isTransitionGroup() {
        return !this.I || super.isTransitionGroup();
    }

    public final l1.n j() throws KotlinNothingValueException {
        l1.x1 x1Var;
        k00.i iVar;
        w0 w0Var;
        l1.n nVarA = this.D;
        if (nVarA == null) {
            nVarA = q3.a(this);
            if (nVarA == null) {
                Object parent = getParent();
                while (nVarA == null && (parent instanceof View)) {
                    View view = (View) parent;
                    nVarA = q3.a(view);
                    parent = bi.b.E(view);
                }
            }
            l1.x1 x1Var2 = null;
            if (nVarA != null) {
                l1.n nVar = (!(nVarA instanceof l1.x1) || ((l1.v1) ((l1.x1) nVarA).f9969w.getValue()).compareTo(l1.v1.B) > 0) ? nVarA : null;
                if (nVar != null) {
                    this.A = new WeakReference(nVar);
                }
            } else {
                nVarA = null;
            }
            if (nVarA == null) {
                WeakReference weakReference = this.A;
                if (weakReference == null || (nVarA = (l1.n) weakReference.get()) == null || ((nVarA instanceof l1.x1) && ((l1.v1) ((l1.x1) nVarA).f9969w.getValue()).compareTo(l1.v1.B) <= 0)) {
                    nVarA = null;
                }
                if (nVarA == null) {
                    if (!isAttachedToWindow()) {
                        y2.a.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objE = bi.b.E(this);
                    View view2 = this;
                    while (objE instanceof View) {
                        View view3 = (View) objE;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objE = view3.getParent();
                    }
                    k00.c cVarA = q3.a(view2);
                    if (cVarA == null) {
                        ((i3) k3.f2691a.get()).getClass();
                        w0 w0Var2 = k00.j.A;
                        g00.p pVar = u0.M;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (k00.i) u0.M.getValue();
                        } else {
                            iVar = (k00.i) u0.N.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        k00.i iVarPlus = iVar.plus(w0Var2);
                        l1.q0 q0Var = (l1.q0) iVarPlus.get(l1.c.C);
                        int i10 = 0;
                        if (q0Var != null) {
                            w0Var = new w0(q0Var);
                            c7.c cVar = (c7.c) w0Var.C;
                            synchronized (cVar.B) {
                                cVar.A = false;
                            }
                        } else {
                            w0Var = null;
                        }
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        k00.i j2Var = (b2.s) iVarPlus.get(b2.b.P);
                        if (j2Var == null) {
                            j2Var = new j2(view2.getContext().getApplicationContext());
                            zVar.A = j2Var;
                        }
                        if (w0Var != null) {
                            w0Var2 = w0Var;
                        }
                        k00.i iVarPlus2 = iVarPlus.plus(w0Var2).plus(j2Var);
                        x1Var = new l1.x1(iVarPlus2);
                        synchronized (x1Var.f9952d) {
                            x1Var.f9968v = true;
                        }
                        f40.c cVarC = a40.c0.c(iVarPlus2);
                        androidx.lifecycle.w wVarE = androidx.lifecycle.u0.e(view2);
                        androidx.lifecycle.q lifecycle = wVarE != null ? wVarE.getLifecycle() : null;
                        if (lifecycle == null) {
                            y2.a.d("ViewTreeLifecycleOwner not found from " + view2);
                            throw new KotlinNothingValueException();
                        }
                        view2.addOnAttachStateChangeListener(new l3(view2, x1Var, i10));
                        lifecycle.a(new n3(cVarC, w0Var, x1Var, zVar));
                        view2.setTag(2131361883, x1Var);
                        a40.z0 z0Var = a40.z0.A;
                        Handler handler = view2.getHandler();
                        int i11 = b40.e.a;
                        view2.addOnAttachStateChangeListener(new j3(a40.c0.y(z0Var, new b40.c(handler, "windowRecomposer cleanup", false).F, (a40.a0) null, new a1.d(x1Var, view2, x1Var2, 20), 2), i10));
                    } else {
                        if (!(cVarA instanceof l1.x1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        x1Var = (l1.x1) cVarA;
                    }
                    x1Var2 = ((l1.v1) x1Var.f9969w.getValue()).compareTo(l1.v1.B) > 0 ? x1Var : null;
                    if (x1Var2 != null) {
                        this.A = new WeakReference(x1Var2);
                    }
                    return x1Var;
                }
            }
        }
        return nVarA;
    }

    public final n1 k(View view, n1 n1Var) throws KotlinNothingValueException {
        l1.n nVarJ = j();
        androidx.lifecycle.w wVarE = androidx.lifecycle.u0.e(view);
        androidx.lifecycle.f1 f1VarF = androidx.lifecycle.u0.f(view);
        ia.g gVarE = y3.E(view);
        l1.n nVar = n1Var.f2701b;
        ia.g gVar = n1Var.f2703d;
        androidx.lifecycle.w wVar = n1Var.f2702c;
        if (nVarJ == nVar && wVarE == wVar && f1VarF == n1Var.f2704e && gVarE == gVar) {
            return n1Var;
        }
        if (nVarJ.k() != n1Var.f2701b.k()) {
            e();
        }
        if (wVarE == null) {
            wVarE = wVar;
        }
        n1 n1Var2 = new n1(n1Var, view, nVarJ, wVarE, gVarE == null ? gVar : gVarE, f1VarF);
        view.setTag(2131361882, new WeakReference(n1Var2));
        return n1Var2;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.i0 i0Var = q3.f2756a;
        Object objE = bi.b.E(this);
        View view = this;
        while (objE instanceof View) {
            View view2 = (View) objE;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objE = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new androidx.lifecycle.i0(this, 1));
        } else {
            b();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void m11setAutoClearFocusBehavior17tfJxM(int i10) {
        setTag(2131361900, new c1(i10));
    }

    public final void setComposeViewContext$ui(n1 n1Var) {
        if (this.E != n1Var) {
            if (n1Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                z zVar = childAt instanceof z ? (z) childAt : null;
                if (zVar != null) {
                    if (zVar.getCoroutineContext() != n1Var.f2701b.k()) {
                        e();
                    }
                    zVar.setComposeViewContext(n1Var);
                }
            }
            this.E = n1Var;
        }
    }

    public final void setParentCompositionContext(l1.n nVar) {
        setParentContext(nVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.G = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((z) ((Owner) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.I = true;
    }

    public final void setViewCompositionStrategy(b3 b3Var) {
        u00.a aVar = this.F;
        if (aVar != null) {
            aVar.invoke();
        }
        this.F = b3Var.a(this);
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
