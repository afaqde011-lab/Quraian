package e1;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l1.i1;
import l1.q2;
import ri.t1;

public final class q {

    public final k00.i f4984a;

    public final Context f4985b;

    public final s f4986c;

    public final t3.b f4987d;

    public TextClassifier f4989f;

    public final j40.c f4988e = j40.d.a();

    public final i1 f4990g = l1.q.z(null);

    public final Object f4991h = new Object();

    public q(k00.i iVar, Context context, s sVar, t3.b bVar) {
        this.f4984a = iVar;
        this.f4985b = context;
        this.f4986c = sVar;
        this.f4987d = bVar;
    }

    public static final Object a(q qVar, CharSequence charSequence, long j9, TextClassifier textClassifier, m00.c cVar) {
        o oVar;
        long j10;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        j40.c cVar2;
        TextClassification textClassificationClassifyText;
        long j11;
        CharSequence charSequence3;
        i1 i1Var = qVar.f4990g;
        j40.c cVar3 = qVar.f4988e;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.G = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(qVar, cVar);
            }
        } else {
            oVar = new o(qVar, cVar);
        }
        Object obj = oVar.E;
        l00.a aVar = l00.a.A;
        int i11 = oVar.G;
        g00.b0 b0Var = g00.b0.a;
        try {
            if (i11 == 0) {
                t1.O(obj);
                oVar.A = charSequence;
                oVar.B = textClassifier;
                oVar.C = cVar3;
                j10 = j9;
                oVar.D = j10;
                oVar.G = 1;
                if (cVar3.l(oVar) != aVar) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    cVar2 = cVar3;
                }
                return aVar;
            }
            if (i11 == 1) {
                j10 = oVar.D;
                cVar2 = oVar.C;
                textClassifier2 = (TextClassifier) oVar.B;
                charSequence2 = oVar.A;
                t1.O(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = oVar.D;
                cVar3 = oVar.C;
                textClassificationClassifyText = (TextClassification) oVar.B;
                charSequence3 = oVar.A;
                t1.O(obj);
            }
            try {
                i1Var.setValue(new m0(charSequence3, j11, textClassificationClassifyText));
                return b0Var;
            } finally {
                cVar3.i((Object) null);
            }
            m0 m0Var = (m0) i1Var.getValue();
            if (m0Var != null) {
                q2 q2Var = r.f4992a;
                if (m3.q0.c(j10, m0Var.f4973b) && kotlin.jvm.internal.m.a(charSequence2, m0Var.f4972a)) {
                    cVar2.i((Object) null);
                    return b0Var;
                }
            }
            cVar2.i((Object) null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, m3.q0.g(j10), m3.q0.f(j10)).setDefaultLocales(qVar.b()).build());
            oVar.A = charSequence2;
            oVar.B = textClassificationClassifyText;
            oVar.C = cVar3;
            oVar.D = j10;
            oVar.G = 2;
            if (cVar3.l(oVar) != aVar) {
                j11 = j10;
                charSequence3 = charSequence2;
                i1Var.setValue(new m0(charSequence3, j11, textClassificationClassifyText));
                return b0Var;
            }
            return aVar;
        } catch (Throwable th2) {
            cVar2.i((Object) null);
            throw th2;
        }
    }

    public final LocaleList b() {
        t3.b bVar = this.f4987d;
        if (bVar == null) {
            return new LocaleList(((t3.a) t3.c.f14353a.q().A.get(0)).f14352a);
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        Iterator it = bVar.A.iterator();
        while (it.hasNext()) {
            arrayList.add(((t3.a) it.next()).f14352a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object c(CharSequence charSequence, long j9, m00.i iVar) {
        return (charSequence.length() == 0 || m3.q0.d(j9)) ? g00.b0.a : a40.c0.J(new a1.g(this, new b1.w(j9, this, charSequence, (k00.c) null), (k00.c) null), this.f4984a, iVar);
    }
}
