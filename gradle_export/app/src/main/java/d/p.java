package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.y3;
import g1.l0;

public class p extends Dialog implements androidx.lifecycle.w, g0, s9.d, ia.g {
    public androidx.lifecycle.y A;
    public final ia.f B;
    public final g00.p C;
    public final g00.p D;

    public p(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.m.e(context, "context");
        this.B = new ia.f(new androidx.media3.common.h0(this, new l0(this, 10)));
        final int i11 = 0;
        this.C = rd.a.J(new u00.a(this) {
            public final p B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i11) {
                    case 0:
                        s9.a aVar = new s9.a();
                        this.B.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new e0(new i0(this.B, 11));
                }
            }
        });
        final int i12 = 1;
        this.D = rd.a.J(new u00.a(this) {
            public final p B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i12) {
                    case 0:
                        s9.a aVar = new s9.a();
                        this.B.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new e0(new i0(this.B, 11));
                }
            }
        });
    }

    public static void a(p pVar) {
        super.onBackPressed();
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        u0.k(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.m.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "getDecorView(...)");
        decorView2.setTag(2131363130, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.m.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "getDecorView(...)");
        y3.X(decorView3, this);
        Window window4 = getWindow();
        kotlin.jvm.internal.m.b(window4);
        View decorView4 = window4.getDecorView();
        kotlin.jvm.internal.m.d(decorView4, "getDecorView(...)");
        decorView4.setTag(2131363129, this);
    }

    @Override
    public final androidx.lifecycle.q getLifecycle() {
        androidx.lifecycle.y yVar = this.A;
        if (yVar != null) {
            return yVar;
        }
        androidx.lifecycle.y yVar2 = new androidx.lifecycle.y(this, true);
        this.A = yVar2;
        return yVar2;
    }

    @Override
    public final s9.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().f4380c;
    }

    @Override
    public final e0 getOnBackPressedDispatcher() {
        return (e0) this.D.getValue();
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        return this.B.f7566b;
    }

    @Override
    public final void onBackPressed() {
        ((s9.a) this.C.getValue()).a();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
        onBackPressedDispatcher.c(onBackInvokedDispatcher);
        this.B.a(bundle);
        androidx.lifecycle.y yVar = this.A;
        if (yVar == null) {
            yVar = new androidx.lifecycle.y(this, true);
            this.A = yVar;
        }
        yVar.g(androidx.lifecycle.o.ON_CREATE);
    }

    @Override
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.m.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.B.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override
    public void onStart() {
        super.onStart();
        androidx.lifecycle.y yVar = this.A;
        if (yVar == null) {
            yVar = new androidx.lifecycle.y(this, true);
            this.A = yVar;
        }
        yVar.g(androidx.lifecycle.o.ON_RESUME);
    }

    @Override
    public void onStop() {
        androidx.lifecycle.y yVar = this.A;
        if (yVar == null) {
            yVar = new androidx.lifecycle.y(this, true);
            this.A = yVar;
        }
        yVar.g(androidx.lifecycle.o.ON_DESTROY);
        this.A = null;
        super.onStop();
    }

    @Override
    public void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override
    public void setContentView(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
