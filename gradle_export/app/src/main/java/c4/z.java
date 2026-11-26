package c4;

import android.R;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.u0;
import b3.j0;
import c3.d3;
import com.google.android.gms.internal.measurement.y3;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.i1;
import l1.r1;

public final class z extends c3.a {
    public u00.a J;
    public c0 K;
    public String L;
    public final View M;
    public final boolean N;
    public final a0 O;
    public final WindowManager P;
    public final WindowManager.LayoutParams Q;
    public b0 R;
    public y3.m S;
    public final i1 T;
    public final i1 U;
    public y3.k V;
    public final l1.w W;

    public final Rect f2853a0;

    public final z1.u f2854b0;

    public q f2855c0;

    public final i1 f2856d0;

    public boolean f2857e0;

    public final int[] f2858f0;

    public z(u00.a aVar, c0 c0Var, String str, View view, y3.c cVar, b0 b0Var, UUID uuid, boolean z10) {
        a0 a0Var = new a0();
        super(view.getContext(), null);
        this.J = aVar;
        this.K = c0Var;
        this.L = str;
        this.M = view;
        this.N = z10;
        this.O = a0Var;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.P = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        c0 c0Var2 = this.K;
        boolean zB = n.b(view);
        boolean z11 = c0Var2.f2827b;
        int i10 = c0Var2.f2826a;
        if (z11 && zB) {
            i10 |= 8192;
        } else if (z11 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = this.K.f2831f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(2131886406));
        this.Q = layoutParams;
        this.R = b0Var;
        this.S = y3.m.A;
        this.T = l1.q.z(null);
        this.U = l1.q.z(null);
        this.W = l1.q.r(new j0(this, 8));
        this.f2853a0 = new Rect();
        this.f2854b0 = new z1.u(new j(this, 2));
        setId(R.id.content);
        u0.k(this, u0.e(view));
        u0.l(this, u0.f(view));
        y3.X(this, y3.E(view));
        setTag(2131362061, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.A0((float) 8));
        setOutlineProvider(new d3(2));
        this.f2856d0 = l1.q.z(t.f2845a);
        this.f2858f0 = new int[2];
    }

    private final u00.n getContent() {
        return (u00.n) this.f2856d0.getValue();
    }

    private final y3.k getDisplayBounds() {
        int i10 = this.K.f2826a & 512;
        View view = this.M;
        a0 a0Var = this.O;
        Rect rect = this.f2853a0;
        if (i10 == 0) {
            a0Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            a0Var.getClass();
            Object systemService = view.getContext().getSystemService("window");
            kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
        }
        return new y3.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void getParams$ui$annotations() {
    }

    public final z2.a0 getParentLayoutCoordinates() {
        return (z2.a0) this.U.getValue();
    }

    private final void setContent(u00.n nVar) {
        this.f2856d0.setValue(nVar);
    }

    private final void setParentLayoutCoordinates(z2.a0 a0Var) {
        this.U.setValue(a0Var);
    }

    @Override
    public final void a(l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-857613600);
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            getContent().invoke(g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b2.n(this, i10, 5);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.K.f2828c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                u00.a aVar = this.J;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void g(boolean z10, int i10, int i11, int i12, int i13) {
        super.g(z10, i10, i11, i12, i13);
        this.K.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.Q;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.O.getClass();
        this.P.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.W.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.Q;
    }

    public final y3.m getParentLayoutDirection() {
        return this.S;
    }

    public final y3.l m21getPopupContentSizebOM6tXw() {
        return (y3.l) this.T.getValue();
    }

    public final b0 getPositionProvider() {
        return this.R;
    }

    @Override
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2857e0;
    }

    public c3.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.L;
    }

    public View getViewRoot() {
        return null;
    }

    @Override
    public final void h(int i10, int i11) {
        this.K.getClass();
        y3.k displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void m(l1.n nVar, u00.n nVar2) {
        setParentCompositionContext(nVar);
        setContent(nVar2);
        this.f2857e0 = true;
    }

    public final void n(u00.a aVar, c0 c0Var, String str, y3.m mVar) throws NoWhenBranchMatchedException {
        int i10;
        this.J = aVar;
        this.L = str;
        if (!kotlin.jvm.internal.m.a(this.K, c0Var)) {
            c0Var.getClass();
            this.K = c0Var;
            boolean zB = n.b(this.M);
            boolean z10 = c0Var.f2827b;
            int i11 = c0Var.f2826a;
            if (z10 && zB) {
                i11 |= 8192;
            } else if (z10 && !zB) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.Q;
            layoutParams.flags = i11;
            this.O.getClass();
            this.P.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void o() {
        z2.a0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.A()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jP = parentLayoutCoordinates.p();
            long jG = this.N ? parentLayoutCoordinates.G(0L) : parentLayoutCoordinates.e(0L);
            y3.k kVarC = k00.f.c((((long) Math.round(Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jG & 4294967295L))))), jP);
            if (kVarC.equals(this.V)) {
                return;
            }
            this.V = kVarC;
            q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onAttachedToWindow();
        this.f2854b0.e();
        if (this.K.f2828c) {
            if (this.f2855c0 == null) {
                this.f2855c0 = new q(this.J, 0);
            }
            q qVar = this.f2855c0;
            if (qVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, qVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        z1.u uVar = this.f2854b0;
        y8.g gVar = uVar.f17071h;
        if (gVar != null) {
            gVar.a();
        }
        uVar.a();
        q qVar = this.f2855c0;
        if (qVar != null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(qVar);
        }
        this.f2855c0 = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.K.f2829d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            u00.a aVar = this.J;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        u00.a aVar2 = this.J;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p(z2.a0 a0Var) {
        setParentLayoutCoordinates(a0Var);
        o();
    }

    public final void q() {
        y3.l lVarM21getPopupContentSizebOM6tXw;
        y3.k kVar = this.V;
        if (kVar == null || (lVarM21getPopupContentSizebOM6tXw = m21getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j9 = lVarM21getPopupContentSizebOM6tXw.f16596a;
        y3.k displayBounds = getDisplayBounds();
        long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.A = 0L;
        this.f2854b0.d(this, b.G, new y(yVar, this, kVar, jB, j9));
        long j10 = yVar.A;
        WindowManager.LayoutParams layoutParams = this.Q;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        boolean z10 = this.K.f2830e;
        a0 a0Var = this.O;
        if (z10) {
            a0Var.getClass();
            setSystemGestureExclusionRects(va.a.W(new Rect(0, 0, (int) (jB >> 32), (int) (jB & 4294967295L))));
        }
        a0Var.getClass();
        this.P.updateViewLayout(this, layoutParams);
    }

    @Override
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(y3.m mVar) {
        this.S = mVar;
    }

    public final void m22setPopupContentSizefhxjrPA(y3.l lVar) {
        this.T.setValue(lVar);
    }

    public final void setPositionProvider(b0 b0Var) {
        this.R = b0Var;
    }

    public final void setTestTag(String str) {
        this.L = str;
    }
}
