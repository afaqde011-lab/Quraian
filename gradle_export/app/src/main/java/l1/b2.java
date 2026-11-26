package l1;

public final class b2 implements a40.z, y1 {
    public static final e D = new e();
    public final k00.i A;
    public final b2 B = this;
    public volatile k00.i C;

    public b2(k00.i iVar) {
        this.A = iVar;
    }

    public final k00.i A() {
        e eVarPlus;
        e eVar = this.C;
        if (eVar == null || eVar == D) {
            a2.e eVar2 = (a2.e) this.A.get(a2.e.B);
            a2 a2Var = eVar2 != null ? new a2(eVar2, this) : k00.j.A;
            synchronized (this.B) {
                try {
                    e eVar3 = this.C;
                    if (eVar3 == null) {
                        k00.i iVar = this.A;
                        eVarPlus = iVar.plus(new a40.f1(iVar.get(a40.w.B))).plus(k00.j.A).plus(a2Var);
                    } else if (eVar3 == D) {
                        k00.i iVar2 = this.A;
                        a40.f1 f1Var = new a40.f1(iVar2.get(a40.w.B));
                        f1Var.q(new b0(0));
                        eVarPlus = iVar2.plus(f1Var).plus(k00.j.A).plus(a2Var);
                    } else {
                        eVarPlus = eVar3;
                    }
                    this.C = eVarPlus;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar = eVarPlus;
        }
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }

    public final void a() {
        synchronized (this.B) {
            try {
                k00.i iVar = this.C;
                if (iVar == null) {
                    this.C = D;
                } else {
                    a40.c0.j(iVar, new b0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void b() {
        a();
    }

    @Override
    public final void c() {
        a();
    }

    @Override
    public final void d() {
    }
}
