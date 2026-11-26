package tc;

import a40.c0;
import android.view.View;
import android.view.ViewGroup;
import g00.k;
import h00.m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k00.j;
import l6.v;

public final class a {
    public static final c a(View view, k kVar, List list, cd.b bVar) {
        boolean z10;
        b[] bVarArr = b.A;
        m mVar = new m();
        mVar.addLast(view);
        c cVar = null;
        while (!mVar.isEmpty()) {
            try {
                View view2 = (View) mVar.removeFirst();
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int i10 = 0;
                    while (i10 < viewGroup.getChildCount()) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        mVar.addLast(childAt);
                        i10 = i11;
                    }
                }
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                        }
                    } catch (ClassCastException e3) {
                        bVar.a("Error while locating target in view hierarchy: " + e3);
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVarA = ((xc.b) it.next()).a(view2, kVar);
                    if (cVarA != null) {
                        b[] bVarArr2 = b.A;
                        z10 = true;
                    } else {
                        cVarA = cVar;
                        z10 = false;
                    }
                    if (z10) {
                        cVar = cVarA;
                        break;
                    }
                    cVar = cVarA;
                }
            } catch (NoSuchElementException unused) {
                bVar.a("Unable to get view from queue");
            }
        }
        return cVar;
    }

    public static final c b(View view, k kVar, List list, cd.b bVar) {
        b[] bVarArr = b.A;
        kotlin.jvm.internal.m.e(list, "viewTargetLocators");
        kotlin.jvm.internal.m.e(bVar, "logger");
        return (c) c0.C(j.A, new v(view, bVar, kVar, list, (k00.c) null));
    }
}
