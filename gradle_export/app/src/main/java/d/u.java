package d;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.b5;
import s10.w0;
import z4.k1;

public abstract class u extends t {
    @Override
    public void a(h0 h0Var, h0 h0Var2, Window window, View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.m.e(h0Var, "statusBarStyle");
        kotlin.jvm.internal.m.e(h0Var2, "navigationBarStyle");
        kotlin.jvm.internal.m.e(window, "window");
        kotlin.jvm.internal.m.e(view, "view");
        b5.M(window, false);
        window.setStatusBarColor(h0Var.a(z10));
        window.setNavigationBarColor(h0Var2.a(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(false);
        wb.o oVar = new wb.o(view);
        w0 k1Var = Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar);
        k1Var.t(!z10);
        k1Var.s(!z11);
    }
}
