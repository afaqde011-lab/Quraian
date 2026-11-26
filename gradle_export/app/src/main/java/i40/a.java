package i40;

import a40.c0;
import g00.b0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.o;

public final class a extends j implements o {
    public static final a A = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.a;
        b0 b0Var = b0.a;
        if (j <= 0) {
            ((e) fVar).E = b0Var;
            return b0Var;
        }
        Runnable fVar2 = new ab.f(fVar, bVar, 16);
        m.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        k00.i iVar = eVar.A;
        eVar.C = c0.p(iVar).S(j, fVar2, iVar);
        return b0Var;
    }
}
