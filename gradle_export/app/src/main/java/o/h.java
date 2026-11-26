package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

public final class h implements x, AdapterView.OnItemClickListener {
    public Context A;
    public LayoutInflater B;
    public l C;
    public ExpandedMenuView D;
    public w E;
    public g F;

    public h(Context context) {
        this.A = context;
        this.B = LayoutInflater.from(context);
    }

    @Override
    public final void b(Context context, l lVar) {
        if (this.A != null) {
            this.A = context;
            if (this.B == null) {
                this.B = LayoutInflater.from(context);
            }
        }
        this.C = lVar;
        g gVar = this.F;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void c(l lVar, boolean z10) {
        w wVar = this.E;
        if (wVar != null) {
            wVar.c(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e(d0 d0Var) {
        boolean zHasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f11402a;
        if (!zHasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.A = d0Var;
        k.h hVar = new k.h(context);
        h hVar2 = new h(hVar.getContext());
        mVar.C = hVar2;
        hVar2.E = mVar;
        d0Var.b(hVar2, context);
        h hVar3 = mVar.C;
        if (hVar3.F == null) {
            hVar3.F = new g(hVar3);
        }
        g gVar = hVar3.F;
        k.d dVar = hVar.f8410a;
        dVar.f8376k = gVar;
        dVar.l = mVar;
        View view = d0Var.f11414o;
        if (view != null) {
            dVar.f8370e = view;
        } else {
            dVar.f8368c = d0Var.f11413n;
            hVar.setTitle(d0Var.m);
        }
        dVar.f8375j = mVar;
        k.i iVarCreate = hVar.create();
        mVar.B = iVarCreate;
        iVarCreate.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.B.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.B.show();
        w wVar = this.E;
        if (wVar == null) {
            return true;
        }
        wVar.x(d0Var);
        return true;
    }

    @Override
    public final void f() {
        g gVar = this.F;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean g(n nVar) {
        return false;
    }

    @Override
    public final void i(w wVar) {
        throw null;
    }

    @Override
    public final boolean j(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        this.C.q(this.F.getItem(i10), this, 0);
    }
}
