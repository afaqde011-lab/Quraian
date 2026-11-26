package a30;

import i20.j0;

public final class q implements u00.a {
    public final int A;
    public final u B;
    public final j0 C;
    public final c30.s D;

    public q(u uVar, j0 j0Var, c30.s sVar, int i) {
        this.A = i;
        this.B = uVar;
        this.C = j0Var;
        this.D = sVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                u uVar = this.B;
                d30.l lVar = ((i) uVar.a.a).a;
                q qVar = new q(uVar, this.C, this.D, 2);
                lVar.getClass();
                return new d30.h(lVar, qVar);
            case 1:
                u uVar2 = this.B;
                d30.l lVar2 = ((i) uVar2.a.a).a;
                q qVar2 = new q(uVar2, this.C, this.D, 3);
                lVar2.getClass();
                return new d30.h(lVar2, qVar2);
            case 2:
                u uVar3 = this.B;
                k kVar = uVar3.a;
                x xVarA = uVar3.a((j10.k) kVar.c);
                kotlin.jvm.internal.m.b(xVarA);
                a aVar = ((i) kVar.a).e;
                e30.w returnType = this.D.getReturnType();
                kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
                return (s20.g) aVar.a(xVarA, this.C, returnType);
            default:
                u uVar4 = this.B;
                k kVar2 = uVar4.a;
                x xVarA2 = uVar4.a((j10.k) kVar2.c);
                kotlin.jvm.internal.m.b(xVarA2);
                a aVar2 = ((i) kVar2.a).e;
                e30.w returnType2 = this.D.getReturnType();
                kotlin.jvm.internal.m.d(returnType2, "getReturnType(...)");
                return (s20.g) aVar2.n(xVarA2, this.C, returnType2);
        }
    }
}
