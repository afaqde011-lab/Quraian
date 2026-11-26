package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.b2;
import p.k0;
import p.n0;

public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A;
    public final Object B;

    public d(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                ArrayList arrayList = fVar.H;
                if (fVar.a() && arrayList.size() > 0 && !((e) arrayList.get(0)).f11398a.Y) {
                    View view = fVar.O;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).f11398a.show();
                        }
                    } else {
                        fVar.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                c0 c0Var = (c0) this.B;
                b2 b2Var = c0Var.H;
                if (c0Var.a() && !b2Var.Y) {
                    View view2 = c0Var.M;
                    if (view2 != null && view2.isShown()) {
                        b2Var.show();
                    } else {
                        c0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                n0 n0Var = (n0) this.B;
                if (!n0Var.getInternalPopup().a()) {
                    n0Var.F.m(n0Var.getTextDirection(), n0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = n0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 3:
                k0 k0Var = (k0) this.B;
                n0 n0Var2 = k0Var.f12180e0;
                k0Var.getClass();
                if (n0Var2.isAttachedToWindow() && n0Var2.getGlobalVisibleRect(k0Var.f12178c0)) {
                    k0Var.r();
                    k0Var.show();
                } else {
                    k0Var.dismiss();
                }
                break;
            default:
                View view3 = (View) this.B;
                view3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                view3.getLayoutParams().height = -1;
                view3.getLayoutParams().width = -1;
                Object parent = view3.getParent();
                kotlin.jvm.internal.m.c(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).requestLayout();
                break;
        }
    }
}
