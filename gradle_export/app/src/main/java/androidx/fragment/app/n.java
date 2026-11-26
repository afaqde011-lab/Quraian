package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public final class n extends kotlin.jvm.internal.n implements u00.a {
    public final int A = 0;
    public final p B;
    public final Object C;
    public final ViewGroup D;

    public n(p pVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.B = pVar;
        this.D = viewGroup;
        this.C = obj;
    }

    public n(p pVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.B = pVar;
        this.C = obj;
        this.D = viewGroup;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.f791f.e(this.D, this.C);
                break;
            default:
                p pVar = this.B;
                ArrayList arrayList = pVar.f788c;
                b2 b2Var = pVar.f791f;
                if (arrayList.isEmpty()) {
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj = pVar.f800q;
                    kotlin.jvm.internal.m.b(obj);
                    b2Var.d(obj, new m(pVar, this.D));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((q) it.next()).f774a.f739g) {
                            if (i1.K(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            u4.b bVar = new u4.b();
                            b2Var.u(((q) arrayList.get(0)).f774a.f735c, this.C, bVar, new y(pVar, 3));
                            bVar.a();
                        }
                    }
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj2 = pVar.f800q;
                    kotlin.jvm.internal.m.b(obj2);
                    b2Var.d(obj2, new m(pVar, this.D));
                }
                break;
        }
        return g00.b0.a;
    }
}
