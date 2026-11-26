package ba;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

public final class b implements Runnable {
    public final int A;
    public final ArrayList B;
    public final h C;

    public b(h hVar, ArrayList arrayList, int i10) {
        this.A = i10;
        this.C = hVar;
        this.B = arrayList;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ArrayList arrayList = this.B;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    h hVar = this.C;
                    if (!zHasNext) {
                        arrayList.clear();
                        hVar.m.remove(arrayList);
                    } else {
                        g gVar = (g) it.next();
                        f1 f1Var = gVar.f2292a;
                        int i10 = gVar.f2293b;
                        int i11 = gVar.f2294c;
                        int i12 = gVar.f2295d;
                        int i13 = gVar.f2296e;
                        hVar.getClass();
                        View view = f1Var.f2275a;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i15 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        hVar.f2305p.add(f1Var);
                        viewPropertyAnimatorAnimate.setDuration(hVar.f2351e).setListener(new d(hVar, f1Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = this.B;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    h hVar2 = this.C;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        hVar2.l.remove(arrayList2);
                    } else {
                        f1 f1Var2 = (f1) it2.next();
                        hVar2.getClass();
                        View view2 = f1Var2.f2275a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        hVar2.f2304o.add(f1Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(hVar2.f2349c).setListener(new c(hVar2, f1Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
