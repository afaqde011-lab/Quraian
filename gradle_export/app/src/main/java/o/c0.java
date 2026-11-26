package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import c3.j3;
import p.b2;
import p.j1;

public final class c0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context B;
    public final l C;
    public final i D;
    public final boolean E;
    public final int F;
    public final int G;
    public final b2 H;
    public PopupWindow.OnDismissListener K;
    public View L;
    public View M;
    public w N;
    public ViewTreeObserver O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean T;
    public final d I = new d(this, 1);
    public final j3 J = new j3(this, 5);
    public int S = 0;

    public c0(Context context, l lVar, View view, int i10, boolean z10) {
        this.B = context;
        this.C = lVar;
        this.E = z10;
        this.D = new i(lVar, LayoutInflater.from(context), z10, 2131558419);
        this.G = i10;
        Resources resources = context.getResources();
        this.F = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.L = view;
        this.H = new b2(context, null, i10, 0);
        lVar.b(this, context);
    }

    @Override
    public final boolean a() {
        return !this.P && this.H.Z.isShowing();
    }

    @Override
    public final void c(l lVar, boolean z10) {
        if (lVar != this.C) {
            return;
        }
        dismiss();
        w wVar = this.N;
        if (wVar != null) {
            wVar.c(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void dismiss() {
        if (a()) {
            this.H.dismiss();
        }
    }

    @Override
    public final boolean e(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.B, d0Var, this.M, this.E, this.G, 0);
            w wVar = this.N;
            vVar.f11463h = wVar;
            t tVar = vVar.f11464i;
            if (tVar != null) {
                tVar.i(wVar);
            }
            int size = d0Var.f11407f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            vVar.f11462g = z10;
            t tVar2 = vVar.f11464i;
            if (tVar2 != null) {
                tVar2.n(z10);
            }
            vVar.f11465j = this.K;
            this.K = null;
            this.C.c(false);
            b2 b2Var = this.H;
            int width = b2Var.F;
            int iN = b2Var.n();
            if ((Gravity.getAbsoluteGravity(this.S, this.L.getLayoutDirection()) & 7) == 5) {
                width += this.L.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f11460e != null) {
                    vVar.d(width, iN, true, true);
                }
            }
            w wVar2 = this.N;
            if (wVar2 != null) {
                wVar2.x(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        this.Q = false;
        i iVar = this.D;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override
    public final j1 h() {
        return this.H.C;
    }

    @Override
    public final void i(w wVar) {
        this.N = wVar;
    }

    @Override
    public final void k(l lVar) {
    }

    @Override
    public final void m(View view) {
        this.L = view;
    }

    @Override
    public final void n(boolean z10) {
        this.D.C = z10;
    }

    @Override
    public final void o(int i10) {
        this.S = i10;
    }

    @Override
    public final void onDismiss() {
        this.P = true;
        this.C.c(true);
        ViewTreeObserver viewTreeObserver = this.O;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.O = this.M.getViewTreeObserver();
            }
            this.O.removeGlobalOnLayoutListener(this.I);
            this.O = null;
        }
        this.M.removeOnAttachStateChangeListener(this.J);
        PopupWindow.OnDismissListener onDismissListener = this.K;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.H.F = i10;
    }

    @Override
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override
    public final void r(boolean z10) {
        this.T = z10;
    }

    @Override
    public final void s(int i10) {
        this.H.k(i10);
    }

    @Override
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.P || (view = this.L) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.M = view;
        b2 b2Var = this.H;
        p.y yVar = b2Var.Z;
        p.y yVar2 = b2Var.Z;
        yVar.setOnDismissListener(this);
        b2Var.P = this;
        b2Var.Y = true;
        yVar2.setFocusable(true);
        View view2 = this.M;
        boolean z10 = this.O == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.O = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.I);
        }
        view2.addOnAttachStateChangeListener(this.J);
        b2Var.O = view2;
        b2Var.L = this.S;
        boolean z11 = this.Q;
        Context context = this.B;
        i iVar = this.D;
        if (!z11) {
            this.R = t.l(iVar, context, this.F);
            this.Q = true;
        }
        b2Var.q(this.R);
        yVar2.setInputMethodMode(2);
        Rect rect = this.A;
        b2Var.X = rect != null ? new Rect(rect) : null;
        b2Var.show();
        j1 j1Var = b2Var.C;
        j1Var.setOnKeyListener(this);
        if (this.T) {
            l lVar = this.C;
            if (lVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131558418, (ViewGroup) j1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(lVar.m);
                }
                frameLayout.setEnabled(false);
                j1Var.addHeaderView(frameLayout, null, false);
            }
        }
        b2Var.o(iVar);
        b2Var.show();
    }
}
