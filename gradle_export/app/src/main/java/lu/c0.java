package lu;

import ri.t1;

public final class c0 extends m00.i implements u00.n {
    public final int A;
    public final e0 B;

    public c0(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c0(this.B, cVar, 0);
            case 1:
                return new c0(this.B, cVar, 1);
            default:
                return new c0(this.B, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                c0 c0Var = (c0) create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                c0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                c0 c0Var2 = (c0) create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                c0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                c0 c0Var3 = (c0) create(zVar, cVar);
                g00.b0 b0Var3 = g00.b0.a;
                c0Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        e0 e0Var = this.B;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                ku.a aVar2 = e0Var.o;
                i7.z zVar = aVar2.a;
                zVar.setPlayWhenReady(false);
                zVar.pause();
                i7.z zVar2 = aVar2.b;
                zVar2.setPlayWhenReady(false);
                zVar2.pause();
                break;
            case 1:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                ku.a aVar4 = e0Var.o;
                if (aVar4.c && aVar4.d) {
                    aVar4.a.setPlayWhenReady(true);
                    aVar4.b.setPlayWhenReady(true);
                }
                break;
            default:
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                ku.a aVar6 = e0Var.o;
                i7.z zVar3 = aVar6.a;
                zVar3.setPlayWhenReady(false);
                zVar3.pause();
                i7.z zVar4 = aVar6.b;
                zVar4.setPlayWhenReady(false);
                zVar4.pause();
                zVar3.clearMediaItems();
                zVar4.clearMediaItems();
                aVar6.c = false;
                aVar6.d = false;
                z zVar5 = (z) ((a0) e0Var.c.d.getValue()).b.get("ambient_sounds");
                if (zVar5 != null) {
                    e0Var.m("ambient_sounds", z.a(zVar5, false, false, false, null, null, null, null, null, 0, null, 3967));
                }
                break;
        }
        return b0Var;
    }
}
