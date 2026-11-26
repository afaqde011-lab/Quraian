package ba;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class h extends m0 {

    public static TimeInterpolator f2297s;

    public boolean f2298g;

    public ArrayList f2299h;

    public ArrayList f2300i;

    public ArrayList f2301j;

    public ArrayList f2302k;
    public ArrayList l;
    public ArrayList m;

    public ArrayList f2303n;

    public ArrayList f2304o;

    public ArrayList f2305p;

    public ArrayList f2306q;

    public ArrayList f2307r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f1) arrayList.get(size)).f2275a.animate().cancel();
        }
    }

    @Override
    public final boolean a(f1 f1Var, f1 f1Var2, androidx.media3.common.w0 w0Var, androidx.media3.common.w0 w0Var2) {
        int i10;
        int i11;
        int i12 = w0Var.f1663a;
        int i13 = w0Var.f1664b;
        if (f1Var2.o()) {
            int i14 = w0Var.f1663a;
            i11 = w0Var.f1664b;
            i10 = i14;
        } else {
            i10 = w0Var2.f1663a;
            i11 = w0Var2.f1664b;
        }
        if (f1Var == f1Var2) {
            return g(f1Var, i12, i13, i10, i11);
        }
        View view = f1Var.f2275a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(f1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f1Var2.f2275a;
        l(f1Var2);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2302k;
        f fVar = new f();
        fVar.f2268a = f1Var;
        fVar.f2269b = f1Var2;
        fVar.f2270c = i12;
        fVar.f2271d = i13;
        fVar.f2272e = i10;
        fVar.f2273f = i11;
        arrayList.add(fVar);
        return true;
    }

    @Override
    public final void d(f1 f1Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.f2303n;
        View view = f1Var.f2275a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f2301j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((g) arrayList4.get(size)).f2292a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(f1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f2302k, f1Var);
        if (this.f2299h.remove(f1Var)) {
            view.setAlpha(1.0f);
            c(f1Var);
        }
        if (this.f2300i.remove(f1Var)) {
            view.setAlpha(1.0f);
            c(f1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, f1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((g) arrayList6.get(size4)).f2292a == f1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(f1Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(f1Var)) {
                view.setAlpha(1.0f);
                c(f1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f2306q.remove(f1Var);
        this.f2304o.remove(f1Var);
        this.f2307r.remove(f1Var);
        this.f2305p.remove(f1Var);
        i();
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.f2303n;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = this.m;
        ArrayList arrayList4 = this.f2302k;
        ArrayList arrayList5 = this.f2300i;
        ArrayList arrayList6 = this.f2299h;
        ArrayList arrayList7 = this.f2301j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            g gVar = (g) arrayList7.get(size);
            View view = gVar.f2292a.f2275a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(gVar.f2292a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((f1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f1 f1Var = (f1) arrayList5.get(size3);
            f1Var.f2275a.setAlpha(1.0f);
            c(f1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f fVar = (f) arrayList4.get(size4);
            f1 f1Var2 = fVar.f2268a;
            if (f1Var2 != null) {
                k(fVar, f1Var2);
            }
            f1 f1Var3 = fVar.f2269b;
            if (f1Var3 != null) {
                k(fVar, f1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = (g) arrayList8.get(size6);
                    View view2 = gVar2.f2292a.f2275a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(gVar2.f2292a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    f1 f1Var4 = (f1) arrayList9.get(size8);
                    f1Var4.f2275a.setAlpha(1.0f);
                    c(f1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    f fVar2 = (f) arrayList10.get(size10);
                    f1 f1Var5 = fVar2.f2268a;
                    if (f1Var5 != null) {
                        k(fVar2, f1Var5);
                    }
                    f1 f1Var6 = fVar2.f2269b;
                    if (f1Var6 != null) {
                        k(fVar2, f1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f2306q);
            h(this.f2305p);
            h(this.f2304o);
            h(this.f2307r);
            ArrayList arrayList11 = this.f2348b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override
    public final boolean f() {
        return (this.f2300i.isEmpty() && this.f2302k.isEmpty() && this.f2301j.isEmpty() && this.f2299h.isEmpty() && this.f2305p.isEmpty() && this.f2306q.isEmpty() && this.f2304o.isEmpty() && this.f2307r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.f2303n.isEmpty()) ? false : true;
    }

    public final boolean g(f1 f1Var, int i10, int i11, int i12, int i13) {
        View view = f1Var.f2275a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f1Var.f2275a.getTranslationY());
        l(f1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(f1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f2301j;
        g gVar = new g();
        gVar.f2292a = f1Var;
        gVar.f2293b = translationX;
        gVar.f2294c = translationY;
        gVar.f2295d = i12;
        gVar.f2296e = i13;
        arrayList.add(gVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2348b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (k(fVar, f1Var) && fVar.f2268a == null && fVar.f2269b == null) {
                arrayList.remove(fVar);
            }
        }
    }

    public final boolean k(f fVar, f1 f1Var) {
        if (fVar.f2269b == f1Var) {
            fVar.f2269b = null;
        } else {
            if (fVar.f2268a != f1Var) {
                return false;
            }
            fVar.f2268a = null;
        }
        View view = f1Var.f2275a;
        View view2 = f1Var.f2275a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(f1Var);
        return true;
    }

    public final void l(f1 f1Var) {
        if (f2297s == null) {
            f2297s = new ValueAnimator().getInterpolator();
        }
        f1Var.f2275a.animate().setInterpolator(f2297s);
        d(f1Var);
    }
}
