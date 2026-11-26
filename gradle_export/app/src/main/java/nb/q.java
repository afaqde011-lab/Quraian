package nb;

import ab.a0;
import k50.v;
import k50.z;

public final class q extends o {
    public final a0 A;
    public boolean B;
    public final k50.k C;

    public q(k50.k kVar, a0 a0Var) {
        this.A = a0Var;
        this.C = kVar;
    }

    @Override
    public final a0 a() {
        return this.A;
    }

    @Override
    public final synchronized void close() {
        this.B = true;
        k50.k kVar = this.C;
        if (kVar != null) {
            bc.d.a(kVar);
        }
    }

    @Override
    public final synchronized k50.k i() {
        k50.k kVar;
        try {
            if (this.B) {
                throw new IllegalStateException("closed");
            }
            kVar = this.C;
            if (kVar == null) {
                v vVar = k50.o.a;
                kotlin.jvm.internal.m.b((Object) null);
                vVar.n((z) null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar;
    }
}
