package jx;

import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersEffect$CloseScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersEffect$OpenReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterEffect$CloseScreen;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterEffect$OpenReciterScreen;
import g00.b0;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final u00.a C;
    public final cq.a D;

    public r(u00.a aVar, cq.a aVar2, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = aVar;
        this.D = aVar2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                r rVar = new r(this.C, this.D, cVar, 0);
                rVar.B = obj;
                return rVar;
            default:
                r rVar2 = new r(this.C, this.D, cVar, 1);
                rVar2.B = obj;
                return rVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                r rVar = (r) create((k) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                rVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                r rVar2 = (r) create((qx.k) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                rVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        cq.a aVar = this.D;
        u00.a aVar2 = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                k kVar = (k) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (kotlin.jvm.internal.m.a(kVar, TopRecitersEffect$CloseScreen.INSTANCE)) {
                    aVar2.invoke();
                } else {
                    if (!(kVar instanceof TopRecitersEffect$OpenReciterScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.d(new ReciterRoute$ReciterScreen(((TopRecitersEffect$OpenReciterScreen) kVar).getLauncher()));
                }
                return b0Var;
            default:
                qx.k kVar2 = (qx.k) obj2;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                if (kotlin.jvm.internal.m.a(kVar2, SearchReciterEffect$CloseScreen.INSTANCE)) {
                    aVar2.invoke();
                } else {
                    if (!(kVar2 instanceof SearchReciterEffect$OpenReciterScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.d(new ReciterRoute$ReciterScreen(((SearchReciterEffect$OpenReciterScreen) kVar2).getLauncher()));
                }
                return b0Var;
        }
    }
}
