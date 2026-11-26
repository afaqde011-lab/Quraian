package c3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

public abstract class u3 {

    public static final ViewGroup.LayoutParams f2764a = new ViewGroup.LayoutParams(-2, -2);

    public static final s3 a(a aVar, n1 n1Var, v1.c cVar) {
        z zVar;
        s3 s3Var = null;
        if (u1.f2762a.compareAndSet(false, true)) {
            c40.h hVarB = ri.t1.b(1, 6, null);
            a40.c0.y(a40.c0.c((k00.i) u0.M.getValue()), (k00.i) null, (a40.a0) null, new a1.e2((Object) hVarB, (k00.c) s3Var, 10), 3);
            b3.a aVar2 = new b3.a(hVarB, 9);
            synchronized (z1.l.f17038c) {
                z1.l.f17044i = h00.q.Z0(aVar2, (Collection) z1.l.f17044i);
            }
            z1.l.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            zVar = childAt instanceof z ? (z) childAt : null;
            if (zVar != null) {
                zVar.setComposeViewContext(n1Var);
            }
            if (zVar == null) {
                zVar = new z(aVar.getContext(), n1Var);
                aVar.addView(zVar.getView(), f2764a);
            }
            zVar.setComposeViewContext(n1Var);
            if (aVar.getComposeViewContext$ui() != null) {
                n1Var.c();
                zVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = zVar.getTag(2131363145);
            s3Var = tag instanceof s3 ? (s3) tag : null;
            if (s3Var == null) {
                s3Var = new s3(zVar, new l1.p(n1Var.f2701b, new b3.p2(zVar.getRoot())));
                zVar.setTag(2131363145, s3Var);
            }
            s3Var.b(cVar);
            zVar.setFrameEndScheduler$ui(new t3(n1Var.f2701b));
            return s3Var;
        }
        aVar.removeAllViews();
        zVar = null;
        if (zVar == null) {
            zVar = new z(aVar.getContext(), n1Var);
            aVar.addView(zVar.getView(), f2764a);
        }
        zVar.setComposeViewContext(n1Var);
        if (aVar.getComposeViewContext$ui() != null) {
            n1Var.c();
            zVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = zVar.getTag(2131363145);
        if (tag2 instanceof s3) {
        }
        if (s3Var == null) {
            s3Var = new s3(zVar, new l1.p(n1Var.f2701b, new b3.p2(zVar.getRoot())));
            zVar.setTag(2131363145, s3Var);
        }
        s3Var.b(cVar);
        zVar.setFrameEndScheduler$ui(new t3(n1Var.f2701b));
        return s3Var;
    }
}
