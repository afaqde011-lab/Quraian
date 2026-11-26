package av;

import a40.z;
import g00.b0;
import ri.t1;

public final class e extends m00.i implements u00.n {
    public final i A;
    public final boolean B;
    public final boolean C;

    public e(i iVar, boolean z, boolean z2, k00.c cVar) {
        super(2, cVar);
        this.A = iVar;
        this.B = z;
        this.C = z2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new e(this.A, this.B, this.C, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((z) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        eVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        i iVar = this.A;
        n nVarD = iVar.getChildFragmentManager().D("MemorizationBottomSheetComposeFragment");
        n nVar = nVarD instanceof n ? nVarD : null;
        if (this.B) {
            if (this.C && nVar == null) {
                new n().show(iVar.getChildFragmentManager(), "MemorizationBottomSheetComposeFragment");
            }
        } else if (nVar != null) {
            nVar.E = true;
            nVar.dismissAllowingStateLoss();
        }
        return b0.a;
    }
}
