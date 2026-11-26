package w;

import kotlin.NoWhenBranchMatchedException;

public final class s1 implements n1 {

    public final p0.e f15810a;

    public final i2.g f15811b = i2.j.a();

    public s1(p0.e eVar) {
        this.f15810a = eVar;
    }

    @Override
    public final i2.g a(r1 r1Var, h2.c cVar, y3.m mVar, y3.c cVar2) throws NoWhenBranchMatchedException {
        i2.g gVar = this.f15811b;
        gVar.h();
        i2.l0 l0VarA = this.f15810a.a(cVar.d(), mVar, cVar2);
        if (l0VarA instanceof i2.j0) {
            i2.g.b(gVar, ((i2.j0) l0VarA).f7140a);
        } else if (l0VarA instanceof i2.k0) {
            i2.g.c(gVar, ((i2.k0) l0VarA).f7142a);
        } else {
            if (!(l0VarA instanceof i2.i0)) {
                throw new NoWhenBranchMatchedException();
            }
            i2.g.a(gVar, ((i2.i0) l0VarA).f7139a);
        }
        gVar.k(cVar.e());
        return gVar;
    }
}
