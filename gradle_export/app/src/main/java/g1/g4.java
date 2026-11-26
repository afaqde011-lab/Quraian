package g1;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

public final class g4 extends d.p {
    public u00.a E;
    public u4 F;
    public long G;
    public final View H;
    public final d4 I;

    public g4(u00.a aVar, u4 u4Var, long j9, View view, y3.m mVar, y3.c cVar, UUID uuid, x.b bVar, a40.z zVar) throws NoWhenBranchMatchedException {
        super(new ContextThemeWrapper(view.getContext(), 2131951927), 0);
        this.E = aVar;
        this.F = u4Var;
        this.G = j9;
        this.H = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        com.google.android.gms.internal.measurement.b5.M(window, false);
        d4 d4Var = new d4(getContext(), window);
        d4Var.setTag(2131362061, "Dialog:" + uuid);
        d4Var.setClipChildren(false);
        d4Var.setElevation(cVar.A0(f3));
        d4Var.setOutlineProvider(new c3.d3(3));
        this.I = d4Var;
        setContentView(d4Var);
        androidx.lifecycle.u0.k(d4Var, androidx.lifecycle.u0.e(view));
        androidx.lifecycle.u0.l(d4Var, androidx.lifecycle.u0.f(view));
        com.google.android.gms.internal.measurement.y3.X(d4Var, com.google.android.gms.internal.measurement.y3.E(view));
        c(this.E, this.F, this.G, mVar);
        wb.o oVar = new wb.o(window.getDecorView());
        s10.w0 k1Var = Build.VERSION.SDK_INT >= 35 ? new z4.k1(window, oVar) : new s10.w0(window, oVar);
        this.F.getClass();
        k1Var.t(x5.n(this.G));
        this.F.getClass();
        k1Var.s(x5.n(this.G));
        getOnBackPressedDispatcher().a(this, new f4(this.F.f6001b, zVar, bVar, new l0(this, 1)));
    }

    public final void c(u00.a aVar, u4 u4Var, long j9, y3.m mVar) throws NoWhenBranchMatchedException {
        this.E = aVar;
        this.F = u4Var;
        this.G = j9;
        c4.d0 d0Var = u4Var.f6000a;
        ViewGroup.LayoutParams layoutParams = this.H.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 1;
        boolean z10 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z10 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        window.setFlags(z10 ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.I.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(48);
        }
    }

    @Override
    public final void cancel() {
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.E.invoke();
        }
        return zOnTouchEvent;
    }
}
