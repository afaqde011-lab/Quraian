package e1;

import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import ri.t1;

public final class p extends m00.i implements u00.n {
    public j40.c A;
    public q B;
    public CharSequence C;
    public long D;
    public int E;
    public Object F;
    public final CharSequence G;
    public final long H;
    public final q I;

    public p(long j9, q qVar, CharSequence charSequence, k00.c cVar) {
        super(2, cVar);
        this.G = charSequence;
        this.H = j9;
        this.I = qVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        p pVar = new p(this.H, this.I, this.G, cVar);
        pVar.F = obj;
        return pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((TextClassifier) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j9;
        TextSelection textSelection;
        q qVar;
        CharSequence charSequence;
        j40.c cVar;
        l00.a aVar = l00.a.A;
        int i10 = this.E;
        if (i10 == 0) {
            t1.O(obj);
            TextClassifier textClassifier = (TextClassifier) this.F;
            long j10 = this.H;
            int iG = m3.q0.g(j10);
            int iF = m3.q0.f(j10);
            CharSequence charSequence2 = this.G;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iG, iF);
            q qVar2 = this.I;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(qVar2.b());
            defaultLocales.setIncludeTextClassification(true);
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jB = m3.h0.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (textSelectionSuggestSelection.getTextClassification() != null) {
                j40.c cVar2 = qVar2.f4988e;
                this.F = textSelectionSuggestSelection;
                this.A = cVar2;
                this.B = qVar2;
                this.C = charSequence2;
                this.D = jB;
                this.E = 1;
                if (cVar2.l(this) != aVar) {
                    textSelection = textSelectionSuggestSelection;
                    qVar = qVar2;
                    charSequence = charSequence2;
                    cVar = cVar2;
                    j9 = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    kotlin.jvm.internal.m.b(textClassification);
                    qVar.f4990g.setValue(new m0(charSequence, j9, textClassification));
                }
            } else {
                this.D = jB;
                this.E = 2;
                if (q.a(qVar2, this.G, jB, textClassifier, this) != aVar) {
                    j9 = jB;
                }
            }
            return aVar;
        }
        if (i10 == 1) {
            j9 = this.D;
            charSequence = this.C;
            qVar = this.B;
            cVar = this.A;
            textSelection = (TextSelection) this.F;
            t1.O(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                kotlin.jvm.internal.m.b(textClassification2);
                qVar.f4990g.setValue(new m0(charSequence, j9, textClassification2));
            } finally {
                cVar.i((Object) null);
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j9 = this.D;
            t1.O(obj);
        }
        return new m3.q0(j9);
    }
}
