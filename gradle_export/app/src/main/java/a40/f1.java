package a40;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class f1 extends m1 {
    public final boolean C;

    public f1(e1 e1Var) {
        super(true);
        boolean z = true;
        N(e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.B;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null) {
            z = false;
            break;
        }
        m1 m1VarI = oVar.i();
        while (!m1VarI.H()) {
            n nVar2 = (n) atomicReferenceFieldUpdater.get(m1VarI);
            o oVar2 = nVar2 instanceof o ? (o) nVar2 : null;
            if (oVar2 == null) {
                z = false;
                break;
            }
            m1VarI = oVar2.i();
        }
        this.C = z;
    }

    @Override
    public final boolean H() {
        return this.C;
    }

    @Override
    public final boolean J() {
        return true;
    }
}
