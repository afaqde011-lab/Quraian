package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class i extends BaseAdapter {
    public final l A;
    public int B = -1;
    public boolean C;
    public final boolean D;
    public final LayoutInflater E;
    public final int F;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.D = z10;
        this.E = layoutInflater;
        this.A = lVar;
        this.F = i10;
        a();
    }

    public final void a() {
        l lVar = this.A;
        n nVar = lVar.f11421v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11411j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.B = i10;
                    return;
                }
            }
        }
        this.B = -1;
    }

    @Override
    public final n getItem(int i10) {
        ArrayList arrayListL;
        boolean z10 = this.D;
        l lVar = this.A;
        if (z10) {
            lVar.i();
            arrayListL = lVar.f11411j;
        } else {
            arrayListL = lVar.l();
        }
        int i11 = this.B;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayListL.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.D;
        l lVar = this.A;
        if (z10) {
            lVar.i();
            arrayListL = lVar.f11411j;
        } else {
            arrayListL = lVar.l();
        }
        return this.B < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.E.inflate(this.F, viewGroup, false);
        }
        int i11 = getItem(i10).f11425b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f11425b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.A.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.C) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
