package gv;

import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerEffect$CloseScreen;

public final class e1 extends m00.i implements u00.n {
    public final int A;
    public final qt.k B;

    public e1(qt.k kVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e1(this.B, cVar, 0);
            default:
                return new e1(this.B, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                e1 e1Var = (e1) create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                e1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                e1 e1Var2 = (e1) create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                e1Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        qt.k kVar = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                kVar.k(qt.c.a);
                break;
            default:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                kVar.f.e(kVar.d, ((qt.j) kVar.c.d.getValue()).c);
                ab.a0.A0(kVar, TafsirPickerEffect$CloseScreen.INSTANCE);
                break;
        }
        return b0Var;
    }
}
