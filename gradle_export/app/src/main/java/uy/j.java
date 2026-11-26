package uy;

import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$SettingsScreen;
import com.mchutov.quranify.settings.presentation.screen.benefits.CancellationBenefitsEffect$CloseScreen;
import g00.b0;
import h00.q;
import h00.v;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import u00.n;
import z1.p;

public final class j extends m00.i implements n {
    public final int A;
    public Object B;
    public final u00.a C;
    public final sy.c D;

    public j(u00.a aVar, sy.c cVar, k00.c cVar2, int i) {
        super(2, cVar2);
        this.A = i;
        this.C = aVar;
        this.D = cVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                j jVar = new j(this.C, this.D, cVar, 0);
                jVar.B = obj;
                return jVar;
            default:
                j jVar2 = new j(this.C, this.D, cVar, 1);
                jVar2.B = obj;
                return jVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                j jVar = (j) create((i) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                jVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                j jVar2 = (j) create((zy.h) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                jVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        sy.c cVar = this.D;
        u00.a aVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                i iVar = (i) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (iVar instanceof CancellationBenefitsEffect$CloseScreen) {
                    aVar.invoke();
                } else {
                    if (!(iVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.b.add(SettingsRoute$CancellationQuestionnaireScreen.INSTANCE);
                }
                return b0Var;
            default:
                zy.h hVar = (zy.h) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (kotlin.jvm.internal.m.a(hVar, zy.g.a)) {
                    aVar.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(hVar, zy.f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p pVar = cVar.b;
                    while (pVar.size() > 1 && !kotlin.jvm.internal.m.a(q.U0(pVar), SettingsRoute$SettingsScreen.INSTANCE)) {
                        v.z0(pVar);
                    }
                }
                return b0Var;
        }
    }
}
