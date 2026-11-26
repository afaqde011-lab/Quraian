package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

public final class a2 extends j1 {
    public final int M;
    public final int N;
    public x1 O;
    public o.n P;

    public a2(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.M = 21;
            this.N = 22;
        } else {
            this.M = 22;
            this.N = 21;
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.i iVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.O != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (o.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
                headersCount = 0;
            }
            o.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            o.n nVar = this.P;
            if (nVar != nVarB) {
                o.l lVar = iVar.A;
                if (nVar != null) {
                    this.O.c(lVar, nVar);
                }
                this.P = nVarB;
                if (nVarB != null) {
                    this.O.g(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.M) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.N) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.i) adapter).A.c(false);
        return true;
    }

    public void setHoverListener(x1 x1Var) {
        this.O = x1Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
