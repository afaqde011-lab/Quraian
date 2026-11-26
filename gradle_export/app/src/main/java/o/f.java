package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import c3.j3;
import java.util.ArrayList;
import java.util.Iterator;
import p.b2;
import p.j1;
import p.y1;
import p.z1;

public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context B;
    public final int C;
    public final int D;
    public final boolean E;
    public final Handler F;
    public View N;
    public View O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean V;
    public w W;
    public ViewTreeObserver X;
    public PopupWindow.OnDismissListener Y;
    public boolean Z;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final d I = new d(this, 0);
    public final j3 J = new j3(this, 4);
    public final gi.c K = new gi.c(this, 29);
    public int L = 0;
    public int M = 0;
    public boolean U = false;

    public f(Context context, View view, int i10, boolean z10) {
        this.B = context;
        this.N = view;
        this.D = i10;
        this.E = z10;
        this.P = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.C = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.F = new Handler();
    }

    @Override
    public final boolean a() {
        ArrayList arrayList = this.H;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f11398a.Z.isShowing();
    }

    @Override
    public final void c(l lVar, boolean z10) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).f11399b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((e) arrayList.get(i11)).f11399b.c(false);
        }
        e eVar = (e) arrayList.remove(i10);
        l lVar2 = eVar.f11399b;
        b2 b2Var = eVar.f11398a;
        p.y yVar = b2Var.Z;
        lVar2.r(this);
        if (this.Z) {
            y1.b(yVar, null);
            yVar.setAnimationStyle(0);
        }
        b2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.P = ((e) arrayList.get(size2 - 1)).f11400c;
        } else {
            this.P = this.N.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((e) arrayList.get(0)).f11399b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.W;
        if (wVar != null) {
            wVar.c(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.X;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.X.removeGlobalOnLayoutListener(this.I);
            }
            this.X = null;
        }
        this.O.removeOnAttachStateChangeListener(this.J);
        this.Y.onDismiss();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.f11398a.Z.isShowing()) {
                    eVar.f11398a.dismiss();
                }
            }
        }
    }

    @Override
    public final boolean e(d0 d0Var) {
        for (e eVar : this.H) {
            if (d0Var == eVar.f11399b) {
                eVar.f11398a.C.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        k(d0Var);
        w wVar = this.W;
        if (wVar != null) {
            wVar.x(d0Var);
        }
        return true;
    }

    @Override
    public final void f() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f11398a.C.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override
    public final j1 h() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) g4.c.d(1, arrayList)).f11398a.C;
    }

    @Override
    public final void i(w wVar) {
        this.W = wVar;
    }

    @Override
    public final void k(l lVar) {
        lVar.b(this, this.B);
        if (a()) {
            t(lVar);
        } else {
            this.G.add(lVar);
        }
    }

    @Override
    public final void m(View view) {
        if (this.N != view) {
            this.N = view;
            this.M = Gravity.getAbsoluteGravity(this.L, view.getLayoutDirection());
        }
    }

    @Override
    public final void n(boolean z10) {
        this.U = z10;
    }

    @Override
    public final void o(int i10) {
        if (this.L != i10) {
            this.L = i10;
            this.M = Gravity.getAbsoluteGravity(i10, this.N.getLayoutDirection());
        }
    }

    @Override
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i10);
            if (!eVar.f11398a.Z.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (eVar != null) {
            eVar.f11399b.c(false);
        }
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override
    public final void p(int i10) {
        this.Q = true;
        this.S = i10;
    }

    @Override
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.Y = onDismissListener;
    }

    @Override
    public final void r(boolean z10) {
        this.V = z10;
    }

    @Override
    public final void s(int i10) {
        this.R = true;
        this.T = i10;
    }

    @Override
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.G;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t((l) it.next());
        }
        arrayList.clear();
        View view = this.N;
        this.O = view;
        if (view != null) {
            boolean z10 = this.X == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.X = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.I);
            }
            this.O.addOnAttachStateChangeListener(this.J);
        }
    }

    public final void t(l lVar) {
        boolean z10;
        int i10;
        e eVar;
        View childAt;
        Rect rect;
        Rect rect2;
        j1 j1Var;
        int[] iArr;
        Rect rect3;
        int i11;
        int i12;
        boolean z11;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.B;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.E, 2131558411);
        if (!a() && this.U) {
            iVar2.C = true;
        } else if (a()) {
            int size = lVar.f11407f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = lVar.getItem(i13);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            iVar2.C = z10;
        }
        int iL = t.l(iVar2, context, this.C);
        b2 b2Var = new b2(context, null, this.D, 0);
        b2Var.f12139a0 = this.K;
        b2Var.P = this;
        b2Var.Z.setOnDismissListener(this);
        b2Var.O = this.N;
        b2Var.L = this.M;
        b2Var.Y = true;
        b2Var.Z.setFocusable(true);
        b2Var.Z.setInputMethodMode(2);
        b2Var.o(iVar2);
        b2Var.q(iL);
        b2Var.L = this.M;
        ArrayList arrayList = this.H;
        if (arrayList.size() > 0) {
            eVar = (e) g4.c.d(1, arrayList);
            l lVar2 = eVar.f11399b;
            int size2 = lVar2.f11407f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i14);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                i10 = 1;
                childAt = null;
            } else {
                j1 j1Var2 = eVar.f11398a.C;
                ListAdapter adapter = j1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                i10 = 1;
                int i15 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == iVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - j1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < j1Var2.getChildCount()) {
                    childAt = j1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                z1.a(b2Var.Z, false);
                y1.a(b2Var.Z, null);
                j1Var = ((e) arrayList.get(arrayList.size() - 1)).f11398a.C;
                iArr = new int[2];
                j1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.O.getWindowVisibleDisplayFrame(rect3);
                if (this.P == i10) {
                    if (j1Var.getWidth() + iArr[0] + iL > rect3.right) {
                        i12 = 0;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        i12 = 1;
                    }
                } else if (iArr[0] - iL < 0) {
                    i11 = 1;
                    i12 = 1;
                } else {
                    i12 = 0;
                    i11 = 1;
                }
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.P = i12;
                b2Var.O = childAt;
                if ((this.M & 5) == 5) {
                    if (!z11) {
                        iL = 0 - childAt.getWidth();
                    }
                } else if (z11) {
                    iL = childAt.getWidth();
                } else {
                    iL = 0 - iL;
                }
                b2Var.F = iL;
                b2Var.K = true;
                b2Var.J = true;
                b2Var.k(0);
            } else {
                if (this.Q) {
                    b2Var.F = this.S;
                }
                if (this.R) {
                    b2Var.k(this.T);
                }
                rect = this.A;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                b2Var.X = rect2;
            }
            arrayList.add(new e(b2Var, lVar, this.P));
            b2Var.show();
            j1 j1Var3 = b2Var.C;
            j1Var3.setOnKeyListener(this);
            if (eVar == null || !this.V || lVar.m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131558418, (ViewGroup) j1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.m);
            j1Var3.addHeaderView(frameLayout, null, false);
            b2Var.show();
            return;
        }
        i10 = 1;
        eVar = null;
        childAt = null;
        if (childAt != null) {
            z1.a(b2Var.Z, false);
            y1.a(b2Var.Z, null);
            j1Var = ((e) arrayList.get(arrayList.size() - 1)).f11398a.C;
            iArr = new int[2];
            j1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.O.getWindowVisibleDisplayFrame(rect3);
            if (this.P == i10) {
                if (j1Var.getWidth() + iArr[0] + iL > rect3.right) {
                    i12 = 0;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = 1;
                }
            } else if (iArr[0] - iL < 0) {
                i11 = 1;
                i12 = 1;
            } else {
                i12 = 0;
                i11 = 1;
            }
            if (i12 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.P = i12;
            b2Var.O = childAt;
            if ((this.M & 5) == 5) {
                if (!z11) {
                    iL = 0 - childAt.getWidth();
                }
            } else if (z11) {
                iL = childAt.getWidth();
            } else {
                iL = 0 - iL;
            }
            b2Var.F = iL;
            b2Var.K = true;
            b2Var.J = true;
            b2Var.k(0);
        } else {
            if (this.Q) {
                b2Var.F = this.S;
            }
            if (this.R) {
                b2Var.k(this.T);
            }
            rect = this.A;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            b2Var.X = rect2;
        }
        arrayList.add(new e(b2Var, lVar, this.P));
        b2Var.show();
        j1 j1Var4 = b2Var.C;
        j1Var4.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
