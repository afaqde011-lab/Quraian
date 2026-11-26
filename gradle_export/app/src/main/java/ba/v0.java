package ba;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import w.a2;
import w.f2;

public final class v0 {

    public Object f2437a;

    public int f2438b;

    public int f2439c;

    public final Object f2440d;

    public Object f2441e;

    public final Object f2442f;

    public Object f2443g;

    public final Object f2444h;

    public v0() {
        this.f2440d = null;
        this.f2441e = null;
        this.f2442f = null;
        this.f2437a = Collections.EMPTY_LIST;
        this.f2443g = null;
        this.f2438b = 0;
        this.f2439c = 0;
        this.f2444h = Bundle.EMPTY;
    }

    public v0(RecyclerView recyclerView) {
        this.f2444h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2440d = arrayList;
        this.f2441e = null;
        this.f2442f = new ArrayList();
        this.f2437a = Collections.unmodifiableList(arrayList);
        this.f2438b = 2;
        this.f2439c = 2;
    }

    public v0(n1 n1Var, l9.j0 j0Var, l9.y yVar, List list, CharSequence charSequence, int i10, int i11, Bundle bundle) {
        this.f2440d = n1Var;
        this.f2441e = j0Var;
        this.f2442f = yVar;
        list.getClass();
        this.f2437a = list;
        this.f2443g = charSequence;
        this.f2438b = i10;
        this.f2439c = i11;
        this.f2444h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public v0(v0 v0Var) {
        this.f2440d = (n1) v0Var.f2440d;
        this.f2441e = (l9.j0) v0Var.f2441e;
        this.f2442f = (l9.y) v0Var.f2442f;
        this.f2437a = (List) v0Var.f2437a;
        this.f2443g = (CharSequence) v0Var.f2443g;
        this.f2438b = v0Var.f2438b;
        this.f2439c = v0Var.f2439c;
        this.f2444h = (Bundle) v0Var.f2444h;
    }

    public v0(w.j1 j1Var) {
        this.f2440d = j1Var;
        this.f2441e = l1.q.z(w.c1.f15743a);
        this.f2442f = new l1.f1(0);
        this.f2437a = f2.A;
        this.f2444h = new l1.f1(0);
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.l(f1Var);
        View view = f1Var.f2275a;
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        h1 h1Var = recyclerView.N0;
        if (h1Var != null) {
            g1 g1Var = h1Var.E;
            z4.j0.g(view, g1Var != null ? (z4.b) g1Var.E.remove(view) : null);
        }
        if (z10) {
            ArrayList arrayList = recyclerView.O;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            g0 g0Var = recyclerView.M;
            if (g0Var != null) {
                g0Var.onViewRecycled(f1Var);
            }
            if (recyclerView.G0 != null) {
                recyclerView.G.T(f1Var);
            }
            if (RecyclerView.f1853c1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f1Var);
            }
        }
        f1Var.f2291s = null;
        f1Var.f2290r = null;
        u0 u0VarC = c();
        u0VarC.getClass();
        int i10 = f1Var.f2280f;
        ArrayList arrayList2 = u0VarC.a(i10).f2419a;
        if (((t0) u0VarC.f2434a.get(i10)).f2420b <= arrayList2.size()) {
            w00.a.l(view);
        } else {
            if (RecyclerView.f1852b1 && arrayList2.contains(f1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            f1Var.m();
            arrayList2.add(f1Var);
        }
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        if (i10 >= 0 && i10 < recyclerView.G0.b()) {
            return !recyclerView.G0.f2244g ? i10 : recyclerView.E.h(i10, 0);
        }
        StringBuilder sbQ = oi.k.q("invalid position ", i10, ". State item count is ");
        sbQ.append(recyclerView.G0.b());
        sbQ.append(recyclerView.B());
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public u0 c() {
        if (((u0) this.f2443g) == null) {
            u0 u0Var = new u0();
            u0Var.f2434a = new SparseArray();
            u0Var.f2435b = 0;
            u0Var.f2436c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2443g = u0Var;
            g();
        }
        return (u0) this.f2443g;
    }

    public a2 d() {
        return (a2) ((l1.i1) this.f2441e).getValue();
    }

    public View e(int i10) {
        return o(i10, Long.MAX_VALUE).f2275a;
    }

    public void f() {
        Object obj;
        List listC = ((w.j1) this.f2440d).c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i10);
            if (((w.k1) obj).a().b()) {
                break;
            } else {
                i10++;
            }
        }
        w.k1 k1Var = (w.k1) obj;
        if (k1Var == null && ((w.f1) this.f2443g) == null) {
            return;
        }
        if (kotlin.jvm.internal.m.a(k1Var != null ? k1Var.L : null, (w.f1) this.f2443g)) {
            return;
        }
        ((l1.f1) this.f2444h).i(this.f2439c + 1);
    }

    public void g() {
        RecyclerView recyclerView;
        g0 g0Var;
        u0 u0Var = (u0) this.f2443g;
        if (u0Var == null || (g0Var = (recyclerView = (RecyclerView) this.f2444h).M) == null || !recyclerView.S) {
            return;
        }
        u0Var.f2436c.add(g0Var);
    }

    public void h(g0 g0Var, boolean z10) {
        u0 u0Var = (u0) this.f2443g;
        if (u0Var != null) {
            SparseArray sparseArray = u0Var.f2434a;
            Set set = u0Var.f2436c;
            set.remove(g0Var);
            if (set.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ArrayList arrayList = ((t0) sparseArray.get(sparseArray.keyAt(i10))).f2419a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    w00.a.l(((f1) arrayList.get(i11)).f2275a);
                }
            }
        }
    }

    public void i() throws NoWhenBranchMatchedException {
        Object obj;
        Object obj2;
        a2 a2VarD;
        l1.f1 f1Var = (l1.f1) this.f2444h;
        w.j1 j1Var = (w.j1) this.f2440d;
        l1.f1 f1Var2 = (l1.f1) this.f2442f;
        int i10 = 0;
        if (f1Var2.h() != this.f2438b) {
            this.f2438b = f1Var2.h();
            int iOrdinal = ((f2) this.f2437a).ordinal();
            if (iOrdinal == 0) {
                a2VarD = d();
            } else if (iOrdinal != 1) {
                a2VarD = w.c1.f15743a;
                if (iOrdinal == 2) {
                    List listC = j1Var.c();
                    int size = listC.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            a2VarD = d().h();
                            break;
                        } else if (kotlin.jvm.internal.m.a(((w.k1) listC.get(i11)).L, (w.f1) this.f2443g)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                a2VarD = d().g((w.f1) this.f2443g);
            }
            ((l1.i1) this.f2441e).setValue(a2VarD);
            this.f2437a = f2.A;
        }
        if (f1Var.h() != this.f2439c) {
            w.f1 f1Var3 = null;
            if (j1Var.f15781b.b()) {
                List listC2 = j1Var.c();
                int size2 = listC2.size();
                while (true) {
                    if (i10 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i10);
                    if (((w.k1) obj2).a().b()) {
                        break;
                    } else {
                        i10++;
                    }
                }
                w.k1 k1Var = (w.k1) obj2;
                if (k1Var != null) {
                    f1Var3 = k1Var.L;
                }
            } else {
                List listB = j1Var.b();
                int size3 = listB.size();
                while (true) {
                    if (i10 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i10);
                    if (((w.k1) obj).a().b()) {
                        break;
                    } else {
                        i10++;
                    }
                }
                w.k1 k1Var2 = (w.k1) obj;
                if (k1Var2 != null) {
                    f1Var3 = k1Var2.L;
                }
            }
            if (!kotlin.jvm.internal.m.a(f1Var3, (w.f1) this.f2443g)) {
                this.f2443g = f1Var3;
            }
            this.f2439c = f1Var.h();
        }
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.f2442f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k(size);
        }
        arrayList.clear();
        if (RecyclerView.f1857g1) {
            n nVar = ((RecyclerView) this.f2444h).F0;
            int[] iArr = nVar.f2353a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            nVar.f2356d = 0;
        }
    }

    public void k(int i10) {
        ArrayList arrayList = (ArrayList) this.f2442f;
        if (RecyclerView.f1853c1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        f1 f1Var = (f1) arrayList.get(i10);
        if (RecyclerView.f1853c1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f1Var);
        }
        a(f1Var, true);
        arrayList.remove(i10);
    }

    public void l(View view) {
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        f1 f1VarM = RecyclerView.M(view);
        if (f1VarM.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (f1VarM.i()) {
            f1VarM.f2286n.p(f1VarM);
        } else if (f1VarM.p()) {
            f1VarM.f2284j &= -33;
        }
        m(f1VarM);
        if (recyclerView.f1876o0 == null || f1VarM.g()) {
            return;
        }
        recyclerView.f1876o0.d(f1VarM);
    }

    public void m(f1 f1Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = (ArrayList) this.f2442f;
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        n nVar = recyclerView.F0;
        boolean zI = f1Var.i();
        View view = f1Var.f2275a;
        boolean z12 = false;
        boolean z13 = true;
        if (zI || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(f1Var.i());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.B());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (f1Var.j()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(f1Var);
            throw new IllegalArgumentException(a1.b.l(recyclerView, sb3));
        }
        if (f1Var.o()) {
            throw new IllegalArgumentException(a1.b.l(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((f1Var.f2284j & 16) == 0) {
            WeakHashMap weakHashMap = z4.j0.f17198a;
            if (view.hasTransientState()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        g0 g0Var = recyclerView.M;
        boolean z14 = g0Var != null && z10 && g0Var.onFailedToRecycleView(f1Var);
        if (RecyclerView.f1852b1 && arrayList.contains(f1Var)) {
            StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
            sb4.append(f1Var);
            throw new IllegalArgumentException(a1.b.l(recyclerView, sb4));
        }
        if (z14 || f1Var.g()) {
            if (this.f2439c <= 0 || (f1Var.f2284j & 526) != 0) {
                z11 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f2439c && size > 0) {
                    k(0);
                    size--;
                }
                if (RecyclerView.f1857g1 && size > 0) {
                    int i14 = f1Var.f2277c;
                    if (nVar.f2353a != null) {
                        int i15 = nVar.f2356d * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((f1) arrayList.get(i10)).f2277c;
                                    if (nVar.f2353a != null) {
                                        break;
                                    }
                                    i12 = nVar.f2356d * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (nVar.f2353a[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (nVar.f2353a[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((f1) arrayList.get(i10)).f2277c;
                            if (nVar.f2353a != null) {
                                break;
                                break;
                            }
                            i12 = nVar.f2356d * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (nVar.f2353a[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, f1Var);
                z11 = true;
            }
            if (z11) {
                z13 = false;
            } else {
                a(f1Var, true);
            }
            z12 = z11;
        } else {
            if (RecyclerView.f1853c1) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
            }
            z13 = false;
        }
        recyclerView.G.T(f1Var);
        if (z12 || z13 || !z10) {
            return;
        }
        w00.a.l(view);
        f1Var.f2291s = null;
        f1Var.f2290r = null;
    }

    public void n(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        f1 f1VarM = RecyclerView.M(view);
        if ((f1VarM.f2284j & 12) == 0 && f1VarM.k() && (m0Var = recyclerView.f1876o0) != null) {
            h hVar = (h) m0Var;
            if (f1VarM.c().isEmpty() && hVar.f2298g && !f1VarM.f()) {
                if (((ArrayList) this.f2441e) == null) {
                    this.f2441e = new ArrayList();
                }
                f1VarM.f2286n = this;
                f1VarM.f2287o = true;
                ((ArrayList) this.f2441e).add(f1VarM);
                return;
            }
        }
        if (f1VarM.f() && !f1VarM.h() && !recyclerView.M.hasStableIds()) {
            throw new IllegalArgumentException(a1.b.l(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        f1VarM.f2286n = this;
        f1VarM.f2287o = false;
        ((ArrayList) this.f2440d).add(f1VarM);
    }

    public f1 o(int i10, long j9) {
        int i11;
        int i12;
        f1 f1VarCreateViewHolder;
        long j10;
        boolean z10;
        int i13;
        long nanoTime;
        long j11;
        AccessibilityManager accessibilityManager;
        int i14;
        int i15;
        int i16;
        h1 h1Var;
        g1 g1Var;
        View.AccessibilityDelegate accessibilityDelegateA;
        z4.b bVar;
        int i17;
        View view;
        ViewGroup.LayoutParams layoutParams;
        q0 q0Var;
        ?? r10;
        RecyclerView recyclerViewG;
        f1 f1Var;
        f1 f1Var2;
        View view2;
        f1 f1Var3;
        ?? r11;
        int size;
        int iH;
        ArrayList arrayList = (ArrayList) this.f2440d;
        ArrayList arrayList2 = (ArrayList) this.f2442f;
        RecyclerView recyclerView = (RecyclerView) this.f2444h;
        b1 b1Var = recyclerView.G0;
        if (i10 < 0 || i10 >= b1Var.b()) {
            StringBuilder sbP = oi.k.p(i10, i10, "Invalid item position ", "(", "). Item count:");
            sbP.append(b1Var.b());
            sbP.append(recyclerView.B());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (b1Var.f2244g) {
            ArrayList arrayList3 = (ArrayList) this.f2441e;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i18 = 0;
                while (true) {
                    if (i18 >= size) {
                        if (recyclerView.M.hasStableIds() && (iH = recyclerView.E.h(i10, 0)) > 0 && iH < recyclerView.M.getItemCount()) {
                            long itemId = recyclerView.M.getItemId(iH);
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size) {
                                    i11 = 1;
                                    f1VarCreateViewHolder = null;
                                    break;
                                }
                                f1 f1Var4 = (f1) ((ArrayList) this.f2441e).get(i19);
                                i11 = 1;
                                if (!f1Var4.p() && f1Var4.f2279e == itemId) {
                                    f1Var4.a(32);
                                    f1VarCreateViewHolder = f1Var4;
                                    break;
                                }
                                i19++;
                            }
                        } else {
                            i11 = 1;
                            f1VarCreateViewHolder = null;
                            break;
                        }
                    } else {
                        f1VarCreateViewHolder = (f1) ((ArrayList) this.f2441e).get(i18);
                        if (!f1VarCreateViewHolder.p() && f1VarCreateViewHolder.b() == i10) {
                            f1VarCreateViewHolder.a(32);
                            i11 = 1;
                            break;
                        }
                        i18++;
                    }
                }
            } else {
                i11 = 1;
                f1VarCreateViewHolder = null;
                break;
            }
            i12 = f1VarCreateViewHolder != null ? i11 : 0;
        } else {
            i11 = 1;
            i12 = 0;
            f1VarCreateViewHolder = null;
        }
        if (f1VarCreateViewHolder == null) {
            int size2 = arrayList.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    ArrayList arrayList4 = (ArrayList) recyclerView.F.E;
                    int size3 = arrayList4.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size3) {
                            view2 = null;
                            break;
                        }
                        View view3 = (View) arrayList4.get(i21);
                        f1 f1VarM = RecyclerView.M(view3);
                        if (f1VarM.b() == i10 && !f1VarM.f() && !f1VarM.h()) {
                            view2 = view3;
                            break;
                        }
                        i21++;
                    }
                    if (view2 == null) {
                        int size4 = arrayList2.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size4) {
                                f1Var3 = null;
                                break;
                            }
                            f1Var3 = (f1) arrayList2.get(i22);
                            if (!f1Var3.f() && f1Var3.b() == i10 && !f1Var3.d()) {
                                arrayList2.remove(i22);
                                if (!RecyclerView.f1853c1) {
                                    break;
                                }
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f1Var3);
                                break;
                            }
                            i22++;
                        }
                    } else {
                        f1 f1VarM2 = RecyclerView.M(view2);
                        a20.g gVar = recyclerView.F;
                        a8.i0 i0Var = (a8.i0) gVar.D;
                        int iIndexOfChild = ((d0) gVar.C).f2262a.indexOfChild(view2);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                        }
                        if (!i0Var.E(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        i0Var.A(iIndexOfChild);
                        gVar.L(view2);
                        a20.g gVar2 = recyclerView.F;
                        a8.i0 i0Var2 = (a8.i0) gVar2.D;
                        int iIndexOfChild2 = ((d0) gVar2.C).f2262a.indexOfChild(view2);
                        int iC = (iIndexOfChild2 == -1 || i0Var2.E(iIndexOfChild2)) ? -1 : iIndexOfChild2 - i0Var2.C(iIndexOfChild2);
                        if (iC == -1) {
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(f1VarM2);
                            throw new IllegalStateException(a1.b.l(recyclerView, sb2));
                        }
                        recyclerView.F.s(iC);
                        n(view2);
                        f1VarM2.a(8224);
                        f1Var3 = f1VarM2;
                        break;
                    }
                } else {
                    f1 f1Var5 = (f1) arrayList.get(i20);
                    if (!f1Var5.p() && f1Var5.b() == i10 && !f1Var5.f() && (b1Var.f2244g || !f1Var5.h())) {
                        f1Var5.a(32);
                        f1Var3 = f1Var5;
                        break;
                    }
                    i20++;
                }
            }
            if (f1Var3 != null) {
                if (!f1Var3.h()) {
                    int i23 = f1Var3.f2277c;
                    if (i23 < 0 || i23 >= recyclerView.M.getItemCount()) {
                        StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb3.append(f1Var3);
                        throw new IndexOutOfBoundsException(a1.b.l(recyclerView, sb3));
                    }
                    r11 = ((b1Var.f2244g || recyclerView.M.getItemViewType(f1Var3.f2277c) == f1Var3.f2280f) && (!recyclerView.M.hasStableIds() || f1Var3.f2279e == recyclerView.M.getItemId(f1Var3.f2277c))) ? i11 : 0;
                } else {
                    if (RecyclerView.f1852b1 && !b1Var.f2244g) {
                        throw new IllegalStateException(a1.b.l(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    r11 = b1Var.f2244g;
                }
                if (r11 == 0) {
                    f1Var3.a(4);
                    if (f1Var3.i()) {
                        recyclerView.removeDetachedView(f1Var3.f2275a, false);
                        f1Var3.f2286n.p(f1Var3);
                    } else if (f1Var3.p()) {
                        f1Var3.f2284j &= -33;
                    }
                    m(f1Var3);
                    f1VarCreateViewHolder = null;
                } else {
                    f1VarCreateViewHolder = f1Var3;
                    i12 = i11;
                }
            } else {
                f1VarCreateViewHolder = f1Var3;
            }
        }
        if (f1VarCreateViewHolder == null) {
            int iH2 = recyclerView.E.h(i10, 0);
            if (iH2 < 0 || iH2 >= recyclerView.M.getItemCount()) {
                StringBuilder sbP2 = oi.k.p(i10, iH2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbP2.append(b1Var.b());
                sbP2.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbP2.toString());
            }
            int itemViewType = recyclerView.M.getItemViewType(iH2);
            if (recyclerView.M.hasStableIds()) {
                long itemId2 = recyclerView.M.getItemId(iH2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        j10 = 3;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                f1Var2 = (f1) arrayList2.get(size6);
                                if (f1Var2.f2279e != itemId2 || f1Var2.d()) {
                                    size6--;
                                } else {
                                    if (itemViewType == f1Var2.f2280f) {
                                        arrayList2.remove(size6);
                                        break;
                                    }
                                    k(size6);
                                }
                            }
                            f1Var2 = null;
                            break;
                        }
                    }
                    f1 f1Var6 = (f1) arrayList.get(size5);
                    j10 = 3;
                    long j12 = f1Var6.f2279e;
                    View view4 = f1Var6.f2275a;
                    if (j12 == itemId2 && !f1Var6.p()) {
                        if (itemViewType == f1Var6.f2280f) {
                            f1Var6.a(32);
                            if (f1Var6.h() && !b1Var.f2244g) {
                                f1Var6.f2284j = (f1Var6.f2284j & (-15)) | 2;
                            }
                            f1Var2 = f1Var6;
                            break;
                        }
                        arrayList.remove(size5);
                        recyclerView.removeDetachedView(view4, false);
                        f1 f1VarM3 = RecyclerView.M(view4);
                        f1VarM3.f2286n = null;
                        f1VarM3.f2287o = false;
                        f1VarM3.f2284j &= -33;
                        m(f1VarM3);
                    }
                    size5--;
                }
                if (f1Var2 != null) {
                    f1Var2.f2277c = iH2;
                    f1VarCreateViewHolder = f1Var2;
                    i12 = i11;
                } else {
                    f1VarCreateViewHolder = f1Var2;
                }
            } else {
                j10 = 3;
            }
            if (f1VarCreateViewHolder == null) {
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                }
                t0 t0Var = (t0) c().f2434a.get(itemViewType);
                if (t0Var == null) {
                    f1Var = null;
                    break;
                }
                ArrayList arrayList5 = t0Var.f2419a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            f1Var = null;
                            break;
                        }
                        if (!((f1) arrayList5.get(size7)).d()) {
                            f1Var = (f1) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    f1Var = null;
                    break;
                }
                if (f1Var != null) {
                    f1Var.m();
                    boolean z11 = RecyclerView.f1852b1;
                }
                f1VarCreateViewHolder = f1Var;
            }
            if (f1VarCreateViewHolder == null) {
                long nanoTime2 = recyclerView.getNanoTime();
                if (j9 != Long.MAX_VALUE) {
                    long j13 = ((u0) this.f2443g).a(itemViewType).f2421c;
                    if (((j13 == 0 || j13 + nanoTime2 < j9) ? i11 : 0) == 0) {
                        return null;
                    }
                }
                f1VarCreateViewHolder = recyclerView.M.createViewHolder(recyclerView, itemViewType);
                if (RecyclerView.f1857g1 && (recyclerViewG = RecyclerView.G(f1VarCreateViewHolder.f2275a)) != null) {
                    f1VarCreateViewHolder.f2276b = new WeakReference(recyclerViewG);
                }
                long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                t0 t0VarA = ((u0) this.f2443g).a(itemViewType);
                long j14 = t0VarA.f2421c;
                if (j14 != 0) {
                    nanoTime3 = (nanoTime3 / 4) + ((j14 / 4) * j10);
                }
                t0VarA.f2421c = nanoTime3;
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                }
            }
        } else {
            j10 = 3;
        }
        if (i12 != 0 && !b1Var.f2244g) {
            int i24 = f1VarCreateViewHolder.f2284j;
            if (((i24 & 8192) != 0 ? i11 : 0) != 0) {
                f1VarCreateViewHolder.f2284j = i24 & (-8193);
                if (b1Var.f2247j) {
                    m0.b(f1VarCreateViewHolder);
                    m0 m0Var = recyclerView.f1876o0;
                    f1VarCreateViewHolder.c();
                    m0Var.getClass();
                    androidx.media3.common.w0 w0Var = new androidx.media3.common.w0();
                    w0Var.b(f1VarCreateViewHolder);
                    recyclerView.Z(f1VarCreateViewHolder, w0Var);
                }
            }
        }
        if (!b1Var.f2244g || !f1VarCreateViewHolder.e()) {
            if (f1VarCreateViewHolder.e()) {
                if (((f1VarCreateViewHolder.f2284j & 2) != 0 ? i11 : 0) != 0 || f1VarCreateViewHolder.f()) {
                }
                view = f1VarCreateViewHolder.f2275a;
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    q0Var = (q0) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(q0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    q0Var = (q0) layoutParams;
                } else {
                    q0Var = (q0) recyclerView.generateLayoutParams(layoutParams);
                    view.setLayoutParams(q0Var);
                }
                q0Var.f2392a = f1VarCreateViewHolder;
                if (i12 != 0 || i17 == 0) {
                    r10 = z10;
                } else {
                    r10 = i15;
                }
                q0Var.f2395d = r10;
                return f1VarCreateViewHolder;
            }
            if (RecyclerView.f1852b1 && f1VarCreateViewHolder.h()) {
                StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb4.append(f1VarCreateViewHolder);
                throw new IllegalStateException(a1.b.l(recyclerView, sb4));
            }
            z10 = false;
            int iH3 = recyclerView.E.h(i10, 0);
            f1VarCreateViewHolder.f2291s = null;
            View view5 = f1VarCreateViewHolder.f2275a;
            f1VarCreateViewHolder.f2290r = recyclerView;
            int i25 = f1VarCreateViewHolder.f2280f;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j9 != Long.MAX_VALUE) {
                long j15 = ((u0) this.f2443g).a(i25).f2422d;
                if (j15 == 0 || j15 + nanoTime4 < j9) {
                    if (f1VarCreateViewHolder.j()) {
                        recyclerView.attachViewToParent(view5, recyclerView.getChildCount(), view5.getLayoutParams());
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    recyclerView.M.bindViewHolder(f1VarCreateViewHolder, iH3);
                    if (i13 != 0) {
                        recyclerView.detachViewFromParent(view5);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    t0 t0VarA2 = ((u0) this.f2443g).a(f1VarCreateViewHolder.f2280f);
                    j11 = t0VarA2.f2422d;
                    if (j11 != 0) {
                        nanoTime = (nanoTime / 4) + ((j11 / 4) * j10);
                    }
                    t0VarA2.f2422d = nanoTime;
                    accessibilityManager = recyclerView.f1866e0;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        i14 = i11;
                    } else {
                        i14 = 0;
                    }
                    if (i14 != 0) {
                        if (view5.getImportantForAccessibility() == 0) {
                            i15 = i11;
                            view5.setImportantForAccessibility(i15);
                        } else {
                            i15 = i11;
                        }
                        h1Var = recyclerView.N0;
                        if (h1Var != null) {
                            g1Var = h1Var.E;
                            if (g1Var != null) {
                                WeakHashMap weakHashMap = z4.j0.f17198a;
                                accessibilityDelegateA = z4.h0.a(view5);
                                if (accessibilityDelegateA == null) {
                                    bVar = null;
                                } else if (accessibilityDelegateA instanceof z4.a) {
                                    bVar = ((z4.a) accessibilityDelegateA).f17174a;
                                } else {
                                    bVar = new z4.b(accessibilityDelegateA);
                                }
                                if (bVar != null && bVar != g1Var) {
                                    g1Var.E.put(view5, bVar);
                                }
                            }
                            z4.j0.g(view5, g1Var);
                        }
                    } else {
                        i15 = i11;
                    }
                    if (b1Var.f2244g) {
                        f1VarCreateViewHolder.f2281g = i10;
                    }
                    i16 = i15;
                } else {
                    i16 = 0;
                    i15 = i11;
                }
            } else {
                if (f1VarCreateViewHolder.j()) {
                    recyclerView.attachViewToParent(view5, recyclerView.getChildCount(), view5.getLayoutParams());
                    i13 = i11;
                } else {
                    i13 = 0;
                }
                recyclerView.M.bindViewHolder(f1VarCreateViewHolder, iH3);
                if (i13 != 0) {
                    recyclerView.detachViewFromParent(view5);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                t0 t0VarA3 = ((u0) this.f2443g).a(f1VarCreateViewHolder.f2280f);
                j11 = t0VarA3.f2422d;
                if (j11 != 0) {
                    nanoTime = (nanoTime / 4) + ((j11 / 4) * j10);
                }
                t0VarA3.f2422d = nanoTime;
                accessibilityManager = recyclerView.f1866e0;
                if (accessibilityManager == null) {
                    i14 = 0;
                } else {
                    i14 = 0;
                }
                if (i14 != 0) {
                    if (view5.getImportantForAccessibility() == 0) {
                        i15 = i11;
                        view5.setImportantForAccessibility(i15);
                    } else {
                        i15 = i11;
                    }
                    h1Var = recyclerView.N0;
                    if (h1Var != null) {
                        g1Var = h1Var.E;
                        if (g1Var != null) {
                            WeakHashMap weakHashMap2 = z4.j0.f17198a;
                            accessibilityDelegateA = z4.h0.a(view5);
                            if (accessibilityDelegateA == null) {
                                bVar = null;
                            } else if (accessibilityDelegateA instanceof z4.a) {
                                bVar = ((z4.a) accessibilityDelegateA).f17174a;
                            } else {
                                bVar = new z4.b(accessibilityDelegateA);
                            }
                            if (bVar != null) {
                                g1Var.E.put(view5, bVar);
                            }
                        }
                        z4.j0.g(view5, g1Var);
                    }
                } else {
                    i15 = i11;
                }
                if (b1Var.f2244g) {
                    f1VarCreateViewHolder.f2281g = i10;
                }
                i16 = i15;
            }
            i17 = i16;
            view = f1VarCreateViewHolder.f2275a;
            layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                q0Var = (q0) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(q0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                q0Var = (q0) recyclerView.generateLayoutParams(layoutParams);
                view.setLayoutParams(q0Var);
            } else {
                q0Var = (q0) layoutParams;
            }
            q0Var.f2392a = f1VarCreateViewHolder;
            if (i12 != 0) {
                r10 = z10;
            } else {
                r10 = z10;
            }
            q0Var.f2395d = r10;
            return f1VarCreateViewHolder;
        }
        f1VarCreateViewHolder.f2281g = i10;
        i15 = i11;
        z10 = false;
        i17 = 0;
        view = f1VarCreateViewHolder.f2275a;
        layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            q0Var = (q0) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(q0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            q0Var = (q0) recyclerView.generateLayoutParams(layoutParams);
            view.setLayoutParams(q0Var);
        } else {
            q0Var = (q0) layoutParams;
        }
        q0Var.f2392a = f1VarCreateViewHolder;
        if (i12 != 0) {
            r10 = z10;
        } else {
            r10 = z10;
        }
        q0Var.f2395d = r10;
        return f1VarCreateViewHolder;
    }

    public void p(f1 f1Var) {
        if (f1Var.f2287o) {
            ((ArrayList) this.f2441e).remove(f1Var);
        } else {
            ((ArrayList) this.f2440d).remove(f1Var);
        }
        f1Var.f2286n = null;
        f1Var.f2287o = false;
        f1Var.f2284j &= -33;
    }

    public void q() {
        ArrayList arrayList = (ArrayList) this.f2442f;
        p0 p0Var = ((RecyclerView) this.f2444h).N;
        this.f2439c = this.f2438b + (p0Var != null ? p0Var.f2386j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2439c; size--) {
            k(size);
        }
    }
}
