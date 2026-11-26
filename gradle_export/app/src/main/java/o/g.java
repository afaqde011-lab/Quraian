package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g extends BaseAdapter {
    public int A = -1;
    public final h B;

    public g(h hVar) {
        this.B = hVar;
        a();
    }

    public final void a() {
        l lVar = this.B.C;
        n nVar = lVar.f11421v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11411j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.A = i10;
                    return;
                }
            }
        }
        this.A = -1;
    }

    @Override
    public final n getItem(int i10) {
        h hVar = this.B;
        l lVar = hVar.C;
        lVar.i();
        ArrayList arrayList = lVar.f11411j;
        hVar.getClass();
        int i11 = this.A;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        h hVar = this.B;
        l lVar = hVar.C;
        lVar.i();
        int size = lVar.f11411j.size();
        hVar.getClass();
        return this.A < 0 ? size : size - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.B.B.inflate(2131558416, viewGroup, false);
        }
        ((y) view).a(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
