package c5;

import ab.r;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import c3.l3;
import java.util.ArrayList;
import java.util.WeakHashMap;
import z4.d0;
import z4.j0;

public final class g {

    public final e f2882a;

    public final ArrayList f2883b = new ArrayList();

    public q4.b f2884c;

    public q4.b f2885d;

    public int f2886e;

    public g(ViewGroup viewGroup) {
        View childAt;
        q4.b bVar = q4.b.f12754e;
        this.f2884c = bVar;
        this.f2885d = bVar;
        Drawable background = viewGroup.getBackground();
        this.f2886e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f2882a = eVar;
        eVar.setVisibility(8);
        int i10 = 1;
        eVar.setWillNotDraw(true);
        r rVar = new r(this, 2);
        WeakHashMap weakHashMap = j0.f17198a;
        d0.b(eVar, rVar);
        j0.i(eVar, new f(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(eVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new l3(viewGroup, eVar, i10));
        }
    }
}
