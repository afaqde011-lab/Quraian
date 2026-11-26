package g1;

import kotlin.NoWhenBranchMatchedException;

public abstract class g6 {

    public static final l1.q2 f5806a = new l1.q2(new e00.g(24));

    public static final i2.t0 a(k1.w wVar, l1.j jVar) {
        f6 f6Var = (f6) ((l1.g0) jVar).k(f5806a);
        switch (wVar.ordinal()) {
            case 0:
                return f6Var.f5798h;
            case 1:
                return f6Var.f5795e;
            case 2:
                return f6Var.f5797g;
            case 3:
                return b(f6Var.f5795e);
            case 4:
                return f6Var.f5791a;
            case 5:
                return b(f6Var.f5791a);
            case 6:
                return p0.f.f12243a;
            case 7:
                return f6Var.f5794d;
            case 8:
                p0.a aVar = f6Var.f5794d;
                p0.c cVar = e6.f5783i;
                return p0.a.c(aVar, cVar, null, null, cVar, 6);
            case 9:
                return f6Var.f5796f;
            case 10:
                p0.a aVar2 = f6Var.f5794d;
                p0.c cVar2 = e6.f5783i;
                return p0.a.c(aVar2, null, cVar2, cVar2, null, 9);
            case 11:
                return b(f6Var.f5794d);
            case 12:
                return f6Var.f5793c;
            case 13:
                return i2.b0.f7111b;
            case 14:
                return f6Var.f5792b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static p0.a b(p0.a aVar) {
        p0.c cVar = e6.f5783i;
        return p0.a.c(aVar, null, null, cVar, cVar, 3);
    }
}
