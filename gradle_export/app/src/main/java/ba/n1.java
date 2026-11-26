package ba;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class n1 {

    public int f2357a;

    public int f2358b;

    public int f2359c;

    public final int f2360d;

    public final Object f2361e;

    public final Object f2362f;

    public n1(int i10, androidx.media3.common.d dVar, int i11, int i12, int i13, String str) {
        this.f2357a = i10;
        this.f2361e = dVar;
        this.f2358b = i11;
        this.f2359c = i12;
        this.f2360d = i13;
        this.f2362f = str;
    }

    public n1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f2362f = staggeredGridLayoutManager;
        this.f2361e = new ArrayList();
        this.f2357a = Integer.MIN_VALUE;
        this.f2358b = Integer.MIN_VALUE;
        this.f2359c = 0;
        this.f2360d = i10;
    }

    public void a() {
        View view = (View) g4.c.d(1, (ArrayList) this.f2361e);
        k1 k1Var = (k1) view.getLayoutParams();
        this.f2358b = ((StaggeredGridLayoutManager) this.f2362f).f1890r.d(view);
        k1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f2361e).clear();
        this.f2357a = Integer.MIN_VALUE;
        this.f2358b = Integer.MIN_VALUE;
        this.f2359c = 0;
    }

    public int c() {
        ArrayList arrayList = (ArrayList) this.f2361e;
        return ((StaggeredGridLayoutManager) this.f2362f).f1895w ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public int d() {
        ArrayList arrayList = (ArrayList) this.f2361e;
        return ((StaggeredGridLayoutManager) this.f2362f).f1895w ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public int e(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2362f;
        int iM = staggeredGridLayoutManager.f1890r.m();
        int i12 = staggeredGridLayoutManager.f1890r.i();
        int i13 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f2361e).get(i10);
            int iG = staggeredGridLayoutManager.f1890r.g(view);
            int iD = staggeredGridLayoutManager.f1890r.d(view);
            boolean z10 = iG <= i12;
            boolean z11 = iD >= iM;
            if (z10 && z11 && (iG < iM || iD > i12)) {
                return p0.G(view);
            }
            i10 += i13;
        }
        return -1;
    }

    public int f(int i10) {
        int i11 = this.f2358b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f2361e).size() == 0) {
            return i10;
        }
        a();
        return this.f2358b;
    }

    public View g(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2362f;
        ArrayList arrayList = (ArrayList) this.f2361e;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1895w && p0.G(view2) >= i10) || ((!staggeredGridLayoutManager.f1895w && p0.G(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f1895w && p0.G(view3) <= i10) || ((!staggeredGridLayoutManager.f1895w && p0.G(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public int h(int i10) {
        ArrayList arrayList = (ArrayList) this.f2361e;
        int i11 = this.f2357a;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        k1 k1Var = (k1) view.getLayoutParams();
        this.f2357a = ((StaggeredGridLayoutManager) this.f2362f).f1890r.g(view);
        k1Var.getClass();
        return this.f2357a;
    }
}
