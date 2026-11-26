package ez;

import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountQuestionnaireScreen;
import g00.b0;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class p extends m00.i implements u00.n {
    public Object A;
    public final boolean B;
    public final hp.a C;
    public final u00.a D;
    public final ol.b E;
    public final sy.c F;

    public p(boolean z, hp.a aVar, u00.a aVar2, ol.b bVar, sy.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
        this.E = bVar;
        this.F = cVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        p pVar = new p(this.B, this.C, this.D, this.E, this.F, cVar);
        pVar.A = obj;
        return pVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((l) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        pVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l lVar = (l) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        boolean z = lVar instanceof j;
        u00.a aVar2 = this.D;
        hp.a aVar3 = this.C;
        boolean z2 = this.B;
        if (z) {
            if (!z2) {
                aVar2.invoke();
            } else if (aVar3 != null) {
                aVar3.dismiss();
            }
        } else if (lVar instanceof i) {
            ol.b.a(this.E, ((i) lVar).a, null, 6);
            if (!z2) {
                aVar2.invoke();
            } else if (aVar3 != null) {
                aVar3.dismiss();
            }
        } else {
            if (!kotlin.jvm.internal.m.a(lVar, k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.F.b.add(SettingsRoute$DeleteAccountQuestionnaireScreen.INSTANCE);
            if (z2 && aVar3 != null) {
                aVar3.dismiss();
            }
        }
        return b0.a;
    }
}
