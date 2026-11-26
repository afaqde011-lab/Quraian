package ba;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class p0 {

    public a20.g f2377a;

    public RecyclerView f2378b;

    public final l9.f0 f2379c;

    public final l9.f0 f2380d;

    public w f2381e;

    public boolean f2382f;

    public boolean f2383g;

    public final boolean f2384h;

    public final boolean f2385i;

    public int f2386j;

    public boolean f2387k;
    public int l;
    public int m;

    public int f2388n;

    public int f2389o;

    public p0() {
        me.i iVar = new me.i(this, 10);
        qj.c cVar = new qj.c(this, 8);
        this.f2379c = new l9.f0((p1) iVar);
        this.f2380d = new l9.f0((p1) cVar);
        this.f2382f = false;
        this.f2383g = false;
        this.f2384h = true;
        this.f2385i = true;
    }

    public static int A(View view) {
        Rect rect = ((q0) view.getLayoutParams()).f2393b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((q0) view.getLayoutParams()).f2392a.b();
    }

    public static o0 H(Context context, AttributeSet attributeSet, int i10, int i11) {
        o0 o0Var = new o0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aa.a.f348a, i10, i11);
        o0Var.f2368a = typedArrayObtainStyledAttributes.getInt(0, 1);
        o0Var.f2369b = typedArrayObtainStyledAttributes.getInt(10, 1);
        o0Var.f2370c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        o0Var.f2371d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return o0Var;
    }

    public static boolean M(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void N(View view, int i10, int i11, int i12, int i13) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect = q0Var.f2393b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) q0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static int w(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public static int z(View view) {
        Rect rect = ((q0) view.getLayoutParams()).f2393b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i10);

    public final int B() {
        RecyclerView recyclerView = this.f2378b;
        g0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public final void B0(w wVar) {
        w wVar2 = this.f2381e;
        if (wVar2 != null && wVar != wVar2 && wVar2.f2449e) {
            wVar2.i();
        }
        this.f2381e = wVar;
        RecyclerView recyclerView = this.f2378b;
        e1 e1Var = recyclerView.D0;
        e1Var.G.removeCallbacks(e1Var);
        e1Var.C.abortAnimation();
        if (wVar.f2452h) {
            Log.w("RecyclerView", "An instance of " + wVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wVar.f2446b = recyclerView;
        wVar.f2447c = this;
        int i10 = wVar.f2445a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.G0.f2238a = i10;
        wVar.f2449e = true;
        wVar.f2448d = true;
        wVar.f2450f = recyclerView.N.q(i10);
        wVar.f2446b.D0.b();
        wVar.f2452h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(v0 v0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView == null || recyclerView.M == null || !e()) {
            return 1;
        }
        return this.f2378b.M.getItemCount();
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((q0) view.getLayoutParams()).f2393b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2378b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2378b.L;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i10) {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            int iZ = recyclerView.F.z();
            for (int i11 = 0; i11 < iZ; i11++) {
                recyclerView.F.y(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void P(int i10) {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            int iZ = recyclerView.F.z();
            for (int i11 = 0; i11 < iZ; i11++) {
                recyclerView.F.y(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i10, v0 v0Var, b1 b1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2378b;
        v0 v0Var = recyclerView.C;
        b1 b1Var = recyclerView.G0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2378b.canScrollVertically(-1) && !this.f2378b.canScrollHorizontally(-1) && !this.f2378b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        g0 g0Var = this.f2378b.M;
        if (g0Var != null) {
            accessibilityEvent.setItemCount(g0Var.getItemCount());
        }
    }

    public void V(v0 v0Var, b1 b1Var, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        if (this.f2378b.canScrollVertically(-1) || this.f2378b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.j(true);
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        if (this.f2378b.canScrollVertically(1) || this.f2378b.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.j(true);
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(v0Var, b1Var), x(v0Var, b1Var), false, 0));
    }

    public final void W(View view, a5.g gVar) {
        f1 f1VarM = RecyclerView.M(view);
        if (f1VarM == null || f1VarM.h()) {
            return;
        }
        a20.g gVar2 = this.f2377a;
        if (((ArrayList) gVar2.E).contains(f1VarM.f2275a)) {
            return;
        }
        RecyclerView recyclerView = this.f2378b;
        X(recyclerView.C, recyclerView.G0, view, gVar);
    }

    public void X(v0 v0Var, b1 b1Var, View view, a5.g gVar) {
        gVar.i(a5.f.a(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public void Y(int i10, int i11) {
    }

    public void Z() {
    }

    public void a0(int i10, int i11) {
    }

    public final void b(View view, int i10, boolean z10) {
        f1 f1VarM = RecyclerView.M(view);
        if (z10 || f1VarM.h()) {
            u.s0 s0Var = (u.s0) this.f2378b.G.B;
            q1 q1VarA = (q1) s0Var.get(f1VarM);
            if (q1VarA == null) {
                q1VarA = q1.a();
                s0Var.put(f1VarM, q1VarA);
            }
            q1VarA.f2397a |= 1;
        } else {
            this.f2378b.G.S(f1VarM);
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (f1VarM.p() || f1VarM.i()) {
            if (f1VarM.i()) {
                f1VarM.f2286n.p(f1VarM);
            } else {
                f1VarM.f2284j &= -33;
            }
            this.f2377a.g(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2378b) {
                a20.g gVar = this.f2377a;
                a8.i0 i0Var = (a8.i0) gVar.D;
                int iIndexOfChild = ((d0) gVar.C).f2262a.indexOfChild(view);
                int iC = (iIndexOfChild == -1 || i0Var.E(iIndexOfChild)) ? -1 : iIndexOfChild - i0Var.C(iIndexOfChild);
                if (i10 == -1) {
                    i10 = this.f2377a.z();
                }
                if (iC == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f2378b.indexOfChild(view));
                    throw new IllegalStateException(a1.b.l(this.f2378b, sb2));
                }
                if (iC != i10) {
                    p0 p0Var = this.f2378b.N;
                    View viewU = p0Var.u(iC);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + p0Var.f2378b.toString());
                    }
                    p0Var.u(iC);
                    p0Var.f2377a.s(iC);
                    q0 q0Var2 = (q0) viewU.getLayoutParams();
                    f1 f1VarM2 = RecyclerView.M(viewU);
                    if (f1VarM2.h()) {
                        u.s0 s0Var2 = (u.s0) p0Var.f2378b.G.B;
                        q1 q1VarA2 = (q1) s0Var2.get(f1VarM2);
                        if (q1VarA2 == null) {
                            q1VarA2 = q1.a();
                            s0Var2.put(f1VarM2, q1VarA2);
                        }
                        q1VarA2.f2397a = 1 | q1VarA2.f2397a;
                    } else {
                        p0Var.f2378b.G.S(f1VarM2);
                    }
                    p0Var.f2377a.g(viewU, i10, q0Var2, f1VarM2.h());
                }
            } else {
                this.f2377a.e(view, i10, false);
                q0Var.f2394c = true;
                w wVar = this.f2381e;
                if (wVar != null && wVar.f2449e) {
                    wVar.f2446b.getClass();
                    f1 f1VarM3 = RecyclerView.M(view);
                    if ((f1VarM3 != null ? f1VarM3.b() : -1) == wVar.f2445a) {
                        wVar.f2450f = view;
                        if (RecyclerView.f1853c1) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (q0Var.f2395d) {
            if (RecyclerView.f1853c1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + q0Var.f2392a);
            }
            f1VarM.f2275a.invalidate();
            q0Var.f2395d = false;
        }
    }

    public void b0(int i10, int i11) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i10, int i11) {
    }

    public abstract boolean d();

    public abstract void d0(v0 v0Var, b1 b1Var);

    public abstract boolean e();

    public abstract void e0(b1 b1Var);

    public boolean f(q0 q0Var) {
        return q0Var != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i10, int i11, b1 b1Var, n nVar) {
    }

    public void h0(int i10) {
    }

    public void i(int i10, n nVar) {
    }

    public boolean i0(int i10, Bundle bundle) {
        int iF;
        int iD;
        float f3;
        v0 v0Var = this.f2378b.C;
        int iHeight = this.f2389o;
        int iWidth = this.f2388n;
        Rect rect = new Rect();
        if (this.f2378b.getMatrix().isIdentity() && this.f2378b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i10 == 4096) {
            iF = this.f2378b.canScrollVertically(1) ? (iHeight - F()) - C() : 0;
            if (this.f2378b.canScrollHorizontally(1)) {
                iD = (iWidth - D()) - E();
            } else {
                iD = 0;
            }
        } else if (i10 != 8192) {
            iF = 0;
            iD = 0;
        } else {
            iF = this.f2378b.canScrollVertically(-1) ? -((iHeight - F()) - C()) : 0;
            if (this.f2378b.canScrollHorizontally(-1)) {
                iD = -((iWidth - D()) - E());
            } else {
                iD = 0;
            }
        }
        if (iF != 0 || iD != 0) {
            if (bundle != null) {
                f3 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f3 < 0.0f) {
                    if (RecyclerView.f1852b1) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f3 + ")");
                    }
                }
            } else {
                f3 = 1.0f;
            }
            if (Float.compare(f3, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f3) != 0 && Float.compare(0.0f, f3) != 0) {
                    iD = (int) (iD * f3);
                    iF = (int) (iF * f3);
                }
                this.f2378b.i0(iD, iF, true);
                return true;
            }
            RecyclerView recyclerView = this.f2378b;
            g0 g0Var = recyclerView.M;
            if (g0Var != null) {
                if (i10 == 4096) {
                    recyclerView.j0(g0Var.getItemCount() - 1);
                    return true;
                }
                if (i10 != 8192) {
                    return true;
                }
                recyclerView.j0(0);
                return true;
            }
        }
        return false;
    }

    public abstract int j(b1 b1Var);

    public final void j0(v0 v0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).o()) {
                View viewU = u(iV);
                m0(iV);
                v0Var.l(viewU);
            }
        }
    }

    public abstract int k(b1 b1Var);

    public final void k0(v0 v0Var) {
        ArrayList arrayList = (ArrayList) v0Var.f2440d;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((f1) arrayList.get(i10)).f2275a;
            f1 f1VarM = RecyclerView.M(view);
            if (!f1VarM.o()) {
                f1VarM.n(false);
                if (f1VarM.j()) {
                    this.f2378b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f2378b.f1876o0;
                if (m0Var != null) {
                    m0Var.d(f1VarM);
                }
                f1VarM.n(true);
                f1 f1VarM2 = RecyclerView.M(view);
                f1VarM2.f2286n = null;
                f1VarM2.f2287o = false;
                f1VarM2.f2284j &= -33;
                v0Var.m(f1VarM2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) v0Var.f2441e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2378b.invalidate();
        }
    }

    public abstract int l(b1 b1Var);

    public final void l0(View view, v0 v0Var) {
        a20.g gVar = this.f2377a;
        d0 d0Var = (d0) gVar.C;
        int i10 = gVar.B;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            gVar.B = 1;
            gVar.F = view;
            int iIndexOfChild = d0Var.f2262a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((a8.i0) gVar.D).J(iIndexOfChild)) {
                    gVar.L(view);
                }
                d0Var.c(iIndexOfChild);
            }
            gVar.B = 0;
            gVar.F = null;
            v0Var.l(view);
        } catch (Throwable th2) {
            gVar.B = 0;
            gVar.F = null;
            throw th2;
        }
    }

    public abstract int m(b1 b1Var);

    public final void m0(int i10) {
        if (u(i10) != null) {
            a20.g gVar = this.f2377a;
            d0 d0Var = (d0) gVar.C;
            int i11 = gVar.B;
            if (i11 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iA = gVar.A(i10);
                View childAt = d0Var.f2262a.getChildAt(iA);
                if (childAt != null) {
                    gVar.B = 1;
                    gVar.F = childAt;
                    if (((a8.i0) gVar.D).J(iA)) {
                        gVar.L(childAt);
                    }
                    d0Var.c(iA);
                }
            } finally {
                gVar.B = 0;
                gVar.F = null;
            }
        }
    }

    public abstract int n(b1 b1Var);

    public boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iD = D();
        int iF = F();
        int iE = this.f2388n - E();
        int iC = this.f2389o - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iD;
        int iMin = Math.min(0, i10);
        int i11 = top - iF;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iE;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iC);
        if (this.f2378b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iD2 = D();
                int iF2 = F();
                int iE2 = this.f2388n - E();
                int iC2 = this.f2389o - C();
                Rect rect2 = this.f2378b.J;
                y(focusedChild, rect2);
                if (rect2.left - i13 < iE2 && rect2.right - i13 > iD2 && rect2.top - i14 < iC2 && rect2.bottom - i14 > iF2) {
                    if (i13 == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(i13, i14);
                        return true;
                    }
                    recyclerView.i0(i13, i14, false);
                    return true;
                }
            }
        } else if (i13 == 0 || i14 != 0) {
            if (z10) {
                recyclerView.scrollBy(i13, i14);
                return true;
            }
            recyclerView.i0(i13, i14, false);
            return true;
        }
        return false;
    }

    public abstract int o(b1 b1Var);

    public final void o0() {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(v0 v0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            f1 f1VarM = RecyclerView.M(viewU);
            if (f1VarM.o()) {
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "ignoring view " + f1VarM);
                }
            } else if (!f1VarM.f() || f1VarM.h() || this.f2378b.M.hasStableIds()) {
                u(iV);
                this.f2377a.s(iV);
                v0Var.n(viewU);
                this.f2378b.G.S(f1VarM);
            } else {
                m0(iV);
                v0Var.m(f1VarM);
            }
        }
    }

    public abstract int p0(int i10, v0 v0Var, b1 b1Var);

    public View q(int i10) {
        int iV = v();
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            f1 f1VarM = RecyclerView.M(viewU);
            if (f1VarM != null && f1VarM.b() == i10 && !f1VarM.o() && (this.f2378b.G0.f2244g || !f1VarM.h())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract void q0(int i10);

    public abstract q0 r();

    public abstract int r0(int i10, v0 v0Var, b1 b1Var);

    public q0 s(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public q0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof q0) {
            return new q0((q0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q0((ViewGroup.MarginLayoutParams) layoutParams) : new q0(layoutParams);
    }

    public final void t0(int i10, int i11) {
        this.f2388n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.l = mode;
        if (mode == 0 && !RecyclerView.f1856f1) {
            this.f2388n = 0;
        }
        this.f2389o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.f1856f1) {
            return;
        }
        this.f2389o = 0;
    }

    public final View u(int i10) {
        a20.g gVar = this.f2377a;
        if (gVar != null) {
            return gVar.y(i10);
        }
        return null;
    }

    public void u0(Rect rect, int i10, int i11) {
        int iE = E() + D() + rect.width();
        int iC = C() + F() + rect.height();
        RecyclerView recyclerView = this.f2378b;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        this.f2378b.setMeasuredDimension(g(i10, iE, recyclerView.getMinimumWidth()), g(i11, iC, this.f2378b.getMinimumHeight()));
    }

    public final int v() {
        a20.g gVar = this.f2377a;
        if (gVar != null) {
            return gVar.z();
        }
        return 0;
    }

    public final void v0(int i10, int i11) {
        int iV = v();
        if (iV == 0) {
            this.f2378b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iV; i16++) {
            View viewU = u(i16);
            Rect rect = this.f2378b.J;
            y(viewU, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f2378b.J.set(i15, i13, i12, i14);
        u0(this.f2378b.J, i10, i11);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2378b = null;
            this.f2377a = null;
            this.f2388n = 0;
            this.f2389o = 0;
        } else {
            this.f2378b = recyclerView;
            this.f2377a = recyclerView.F;
            this.f2388n = recyclerView.getWidth();
            this.f2389o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(v0 v0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f2378b;
        if (recyclerView == null || recyclerView.M == null || !d()) {
            return 1;
        }
        return this.f2378b.M.getItemCount();
    }

    public final boolean x0(View view, int i10, int i11, q0 q0Var) {
        return (!view.isLayoutRequested() && this.f2384h && M(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && M(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z10 = RecyclerView.f1852b1;
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect2 = q0Var.f2393b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i10, int i11, q0 q0Var) {
        return (this.f2384h && M(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && M(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true;
    }
}
