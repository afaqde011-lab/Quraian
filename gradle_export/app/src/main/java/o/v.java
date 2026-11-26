package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class v {

    public final Context f11456a;

    public final l f11457b;

    public final boolean f11458c;

    public final int f11459d;

    public View f11460e;

    public boolean f11462g;

    public w f11463h;

    public t f11464i;

    public PopupWindow.OnDismissListener f11465j;

    public int f11461f = 8388611;

    public final u f11466k = new u(this);

    public v(Context context, l lVar, View view, boolean z10, int i10, int i11) {
        this.f11456a = context;
        this.f11457b = lVar;
        this.f11460e = view;
        this.f11458c = z10;
        this.f11459d = i10;
    }

    public final t a() {
        t c0Var;
        if (this.f11464i == null) {
            Context context = this.f11456a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new f(context, this.f11460e, this.f11459d, this.f11458c);
            } else {
                c0Var = new c0(this.f11456a, this.f11457b, this.f11460e, this.f11459d, this.f11458c);
            }
            c0Var.k(this.f11457b);
            c0Var.q(this.f11466k);
            c0Var.m(this.f11460e);
            c0Var.i(this.f11463h);
            c0Var.n(this.f11462g);
            c0Var.o(this.f11461f);
            this.f11464i = c0Var;
        }
        return this.f11464i;
    }

    public final boolean b() {
        t tVar = this.f11464i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f11464i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11465j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        t tVarA = a();
        tVarA.r(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f11461f, this.f11460e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f11460e.getWidth();
            }
            tVarA.p(i10);
            tVarA.s(i11);
            int i12 = (int) ((this.f11456a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.A = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        tVarA.show();
    }
}
