package ev;

import a40.e1;
import jp.e0;

public final class x extends m00.i implements u00.n {
    public final int A;
    public int B;
    public int C;
    public int D;
    public Object E;
    public final Object F;

    public x(int i, e1 e1Var, int i2, gc.g gVar, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = i;
        this.E = e1Var;
        this.D = i2;
        this.F = gVar;
    }

    public x(int i, j0.v vVar, qo.y yVar, k00.c cVar) {
        super(2, cVar);
        this.A = 4;
        this.D = i;
        this.E = vVar;
        this.F = yVar;
    }

    public x(c0 c0Var, int i, int i2, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.F = c0Var;
        this.C = i;
        this.D = i2;
    }

    public x(fy.c0 c0Var, int i, Integer num, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.E = c0Var;
        this.D = i;
        this.F = num;
    }

    public x(vm.a aVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.F = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new x((c0) this.F, this.C, this.D, cVar);
            case 1:
                return new x((fy.c0) this.E, this.D, (Integer) this.F, cVar);
            case 2:
                return new x(this.C, (e1) this.E, this.D, (gc.g) this.F, cVar);
            case 3:
                return new x((e0) this.F, cVar, 3);
            case 4:
                return new x(this.D, (j0.v) this.E, (qo.y) this.F, cVar);
            default:
                return new x((zy.p) this.F, cVar, 5);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((x) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        throw new UnsupportedOperationException("Method not decompiled: ev.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
