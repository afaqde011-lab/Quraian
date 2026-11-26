package ba;

import android.view.View;
import java.util.List;

public final class u {

    public boolean f2423a;

    public int f2424b;

    public int f2425c;

    public int f2426d;

    public int f2427e;

    public int f2428f;

    public int f2429g;

    public int f2430h;

    public int f2431i;

    public int f2432j;

    public List f2433k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.f2433k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((f1) this.f2433k.get(i11)).f2275a;
            q0 q0Var = (q0) view3.getLayoutParams();
            if (view3 != view && !q0Var.f2392a.h() && (iB = (q0Var.f2392a.b() - this.f2426d) * this.f2427e) >= 0 && iB < i10) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i10 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f2426d = -1;
        } else {
            this.f2426d = ((q0) view2.getLayoutParams()).f2392a.b();
        }
    }

    public final View b(v0 v0Var) {
        List list = this.f2433k;
        if (list == null) {
            View viewE = v0Var.e(this.f2426d);
            this.f2426d += this.f2427e;
            return viewE;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = ((f1) this.f2433k.get(i10)).f2275a;
            q0 q0Var = (q0) view.getLayoutParams();
            if (!q0Var.f2392a.h() && this.f2426d == q0Var.f2392a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
