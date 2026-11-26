package e1;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.List;
import l1.q2;

public abstract class r {

    public static final q2 f4992a = new q2(new e00.g(3));

    public static final ax.a f4993b = new ax.a(9);

    public static final void a(s0.a aVar, Context context, boolean z10, CharSequence charSequence, m3.q0 q0Var, q qVar, u00.k kVar) {
        if (charSequence == null || q0Var == null || qVar == null || !(qVar instanceof q)) {
            kVar.invoke(aVar);
            if (charSequence == null || q0Var == null) {
                return;
            }
            r0.b.a(aVar, context, z10, charSequence, q0Var.f10520a);
            return;
        }
        long j9 = q0Var.f10520a;
        Object obj = qVar.f4991h;
        j40.c cVar = qVar.f4988e;
        TextClassification textClassification = null;
        if (cVar.a((Object) null)) {
            m0 m0Var = (m0) qVar.f4990g.getValue();
            TextClassification textClassification2 = (m0Var != null && m3.q0.c(j9, m0Var.f4973b) && kotlin.jvm.internal.m.a(charSequence, m0Var.f4972a)) ? m0Var.f4974c : null;
            cVar.i((Object) null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            kVar.invoke(aVar);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                aVar.f13618a.a(new t0.h(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                aVar.f13618a.a(new t0.h(obj, textClassification, -1));
            }
            kVar.invoke(aVar);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                actions.get(i10);
                if (i10 > 0) {
                    aVar.f13618a.a(new t0.h(obj, textClassification, i10));
                }
            }
        }
        r0.b.a(aVar, context, z10, charSequence, q0Var.f10520a);
    }

    public static final q b(t3.b bVar, l1.j jVar) {
        s sVar = s.A;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(430530635);
        Context context = (Context) g0Var.k(c3.o0.f2722b);
        k00.i iVar = (k00.i) g0Var.k(f4992a);
        boolean zG = g0Var.g(iVar) | g0Var.g(context) | g0Var.g(bVar);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            f4993b.getClass();
            objN = new q(iVar, context, sVar, bVar);
            g0Var.n0(objN);
        }
        q qVar = (q) objN;
        g0Var.r(false);
        return qVar;
    }
}
