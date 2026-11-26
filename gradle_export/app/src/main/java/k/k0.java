package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.n2;
import p.s2;

public final class k0 extends a {

    public final s2 f8414a;

    public final Window.Callback f8415b;

    public final j0 f8416c;

    public boolean f8417d;

    public boolean f8418e;

    public boolean f8419f;

    public final ArrayList f8420g = new ArrayList();

    public final a50.d f8421h = new a50.d(this, 11);

    public k0(Toolbar toolbar, CharSequence charSequence, x xVar) {
        j0 j0Var = new j0(this);
        s2 s2Var = new s2(toolbar, false);
        this.f8414a = s2Var;
        xVar.getClass();
        this.f8415b = xVar;
        s2Var.f12218k = xVar;
        toolbar.setOnMenuItemClickListener(j0Var);
        if (!s2Var.f12214g) {
            s2Var.f12215h = charSequence;
            if ((s2Var.f12209b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (s2Var.f12214g) {
                    z4.j0.h(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f8416c = new j0(this);
    }

    @Override
    public final boolean a() {
        p.j jVar;
        ActionMenuView actionMenuView = this.f8414a.f12208a.A;
        return (actionMenuView == null || (jVar = actionMenuView.T) == null || !jVar.h()) ? false : true;
    }

    @Override
    public final boolean b() {
        o.n nVar;
        n2 n2Var = this.f8414a.f12208a.f552p0;
        if (n2Var == null || (nVar = n2Var.B) == null) {
            return false;
        }
        if (n2Var == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override
    public final void c(boolean z10) {
        if (z10 == this.f8419f) {
            return;
        }
        this.f8419f = z10;
        ArrayList arrayList = this.f8420g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override
    public final int d() {
        return this.f8414a.f12209b;
    }

    @Override
    public final Context e() {
        return this.f8414a.f12208a.getContext();
    }

    @Override
    public final boolean f() {
        s2 s2Var = this.f8414a;
        Toolbar toolbar = s2Var.f12208a;
        Runnable runnable = this.f8421h;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = s2Var.f12208a;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void h() {
        this.f8414a.f12208a.removeCallbacks(this.f8421h);
    }

    @Override
    public final boolean i(int i10, KeyEvent keyEvent) {
        Menu menuT = t();
        if (menuT == null) {
            return false;
        }
        menuT.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuT.performShortcut(i10, keyEvent, 0);
    }

    @Override
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override
    public final boolean k() {
        return this.f8414a.f12208a.u();
    }

    @Override
    public final void l(boolean z10) {
    }

    @Override
    public final void m(boolean z10) {
        s2 s2Var = this.f8414a;
        s2Var.a((s2Var.f12209b & (-5)) | 4);
    }

    @Override
    public final void n(int i10) {
        s2 s2Var = this.f8414a;
        Toolbar toolbar = s2Var.f12208a;
        Drawable drawableF0 = i10 != 0 ? p30.f.f0(toolbar.getContext(), i10) : null;
        s2Var.f12213f = drawableF0;
        if ((s2Var.f12209b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableF0 == null) {
            drawableF0 = s2Var.f12220o;
        }
        toolbar.setNavigationIcon(drawableF0);
    }

    @Override
    public final void o(boolean z10) {
    }

    @Override
    public final void p(String str) {
        this.f8414a.b(str);
    }

    @Override
    public final void q(String str) {
        s2 s2Var = this.f8414a;
        s2Var.f12214g = true;
        Toolbar toolbar = s2Var.f12208a;
        s2Var.f12215h = str;
        if ((s2Var.f12209b & 8) != 0) {
            toolbar.setTitle(str);
            if (s2Var.f12214g) {
                z4.j0.h(toolbar.getRootView(), str);
            }
        }
    }

    @Override
    public final void r(CharSequence charSequence) {
        s2 s2Var = this.f8414a;
        if (s2Var.f12214g) {
            return;
        }
        Toolbar toolbar = s2Var.f12208a;
        s2Var.f12215h = charSequence;
        if ((s2Var.f12209b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s2Var.f12214g) {
                z4.j0.h(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu t() {
        boolean z10 = this.f8418e;
        s2 s2Var = this.f8414a;
        if (!z10) {
            androidx.media3.common.q qVar = new androidx.media3.common.q(this, 7);
            hf.c cVar = new hf.c(this, 9);
            Toolbar toolbar = s2Var.f12208a;
            toolbar.f553q0 = qVar;
            toolbar.f554r0 = cVar;
            ActionMenuView actionMenuView = toolbar.A;
            if (actionMenuView != null) {
                actionMenuView.U = qVar;
                actionMenuView.V = cVar;
            }
            this.f8418e = true;
        }
        return s2Var.f12208a.getMenu();
    }
}
