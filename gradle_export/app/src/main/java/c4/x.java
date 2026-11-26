package c4;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.u0;
import c3.d3;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.y3;
import d.e0;
import d.f0;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

public final class x extends d.p {
    public u00.a E;
    public v F;
    public final View G;
    public final u H;
    public boolean I;

    public x(u00.a aVar, v vVar, View view, y3.m mVar, y3.c cVar, UUID uuid) throws NoWhenBranchMatchedException {
        super(new ContextThemeWrapper(view.getContext(), vVar.f2850e ? 2131951925 : 2131951960), 0);
        this.E = aVar;
        this.F = vVar;
        this.G = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        v vVar2 = this.F;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = vVar2.f2852g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        b5.M(window, this.F.f2850e);
        window.setGravity(17);
        if (!this.F.f2850e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            o.f2840a.a(attributes2);
            p pVar = p.f2841a;
            pVar.b(attributes2, 0);
            pVar.c(attributes2, 0);
            window.setAttributes(attributes2);
        }
        u uVar = new u(getContext(), window);
        setTitle(this.F.f2851f);
        uVar.setTag(2131362061, "Dialog:" + uuid);
        uVar.setClipChildren(false);
        uVar.setElevation(cVar.A0(f3));
        uVar.setOutlineProvider(new d3(1));
        this.H = uVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(uVar);
        u0.k(uVar, u0.e(view));
        u0.l(uVar, u0.f(view));
        y3.X(uVar, y3.E(view));
        d(this.E, this.F, mVar);
        e0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        a aVar2 = new a(this, 1);
        kotlin.jvm.internal.m.e(onBackPressedDispatcher, "<this>");
        onBackPressedDispatcher.a(this, new f0(aVar2));
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof u) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override
    public final void cancel() {
    }

    public final void d(u00.a aVar, v vVar, y3.m mVar) throws NoWhenBranchMatchedException {
        int i10;
        this.E = aVar;
        this.F = vVar;
        d0 d0Var = vVar.f2848c;
        boolean zB = n.b(this.G);
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        u uVar = this.H;
        uVar.setLayoutDirection(i10);
        boolean z10 = vVar.f2850e;
        boolean z11 = vVar.f2849d;
        Window window2 = uVar.J;
        boolean z12 = (uVar.N && z11 == uVar.L && z10 == uVar.M) ? false : true;
        uVar.L = z11;
        uVar.M = z10;
        if (z12) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z11 ? -2 : -1;
            if (i11 != attributes.width || !uVar.N) {
                window2.setLayout(i11, -2);
                uVar.N = true;
            }
        }
        setCanceledOnTouchOutside(vVar.f2847b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z10 ? 0 : 48);
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.F.f2846a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.E.invoke();
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iF;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.F.f2847b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.I = false;
            return zOnTouchEvent;
        }
        u uVar = this.H;
        uVar.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = uVar.getChildAt(0)) != null) {
            int left = childAt.getLeft() + uVar.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + uVar.getTop();
            int height = childAt.getHeight() + top;
            int iF2 = w00.a.F(motionEvent.getX());
            if (left <= iF2 && iF2 <= width && top <= (iF = w00.a.F(motionEvent.getY())) && iF <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.I = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.I = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.I = false;
                return zOnTouchEvent;
            }
        } else if (this.I) {
            this.E.invoke();
            this.I = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
