package f1;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import l9.f0;

public final class d extends ViewGroup {
    public final int A;
    public final ArrayList B;
    public final ArrayList C;
    public final f0 D;
    public int E;

    public d(Context context) {
        super(context);
        this.A = 5;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.C = arrayList2;
        this.D = new f0(24);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.E = 1;
        setTag(2131362728, Boolean.TRUE);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override
    public final void requestLayout() {
    }
}
