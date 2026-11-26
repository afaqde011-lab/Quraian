package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class t implements b0, x, AdapterView.OnItemClickListener {
    public Rect A;

    public static int l(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override
    public final void b(Context context, l lVar) {
    }

    @Override
    public final boolean g(n nVar) {
        return false;
    }

    @Override
    public final boolean j(n nVar) {
        return false;
    }

    public abstract void k(l lVar);

    public abstract void m(View view);

    public abstract void n(boolean z10);

    public abstract void o(int i10);

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (i) listAdapter).A.q((MenuItem) listAdapter.getItem(i10), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(int i10);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z10);

    public abstract void s(int i10);
}
