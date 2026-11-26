package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k9.x0;
import o.k;
import o.l;
import o.n;
import o.z;

public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {
    public static final int[] B = {R.attr.background, R.attr.divider};
    public l A;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        x0 x0VarK = x0.K(context, attributeSet, B, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(x0VarK.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(x0VarK.v(1));
        }
        x0VarK.O();
    }

    @Override
    public final void b(l lVar) {
        this.A = lVar;
    }

    @Override
    public final boolean c(n nVar) {
        return this.A.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        c((n) getAdapter().getItem(i10));
    }
}
