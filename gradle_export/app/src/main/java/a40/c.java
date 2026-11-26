package a40;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

public final class c extends h1 {
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    public final k E;
    public o0 F;
    public final e G;
    private volatile Object _disposer$volatile;

    public c(e eVar, k kVar) {
        this.G = eVar;
        this.E = kVar;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void k(Throwable th) throws DispatchException {
        k kVar = this.E;
        if (th != null) {
            kVar.getClass();
            eh.l lVarF = kVar.F(new s(th, false), null);
            if (lVarF != null) {
                kVar.s(lVarF);
                d dVar = (d) H.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.b;
        e eVar = this.G;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            f0[] f0VarArr = eVar.a;
            ArrayList arrayList = new ArrayList(f0VarArr.length);
            for (f0 f0Var : f0VarArr) {
                arrayList.add(f0Var.l());
            }
            kVar.resumeWith(arrayList);
        }
    }
}
