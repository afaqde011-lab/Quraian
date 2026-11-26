package g1;

public final class m0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final o0 C;
    public final h2.b D;

    public m0(o0 o0Var, h2.b bVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = o0Var;
        this.D = bVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m0(this.C, this.D, cVar, 0);
            default:
                return new m0(this.C, this.D, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        o0 o0Var = this.C;
        h2.b bVar = this.D;
        switch (i10) {
            case 0:
                l1.i1 i1Var = o0Var.W;
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    o0Var.U = Float.intBitsToFloat((int) (bVar.f6544a >> 32)) + o0Var.U;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f6544a & 4294967295L)) + o0Var.V;
                    o0Var.V = fIntBitsToFloat;
                    h hVar = o0Var.Q;
                    float f3 = fIntBitsToFloat - ((int) (4294967295L & ((y3.j) i1Var.getValue()).f16590a));
                    float f10 = o0Var.U - ((int) (((y3.j) i1Var.getValue()).f16590a >> 32));
                    float f11 = z7.f6046a;
                    float fAtan2 = ((float) Math.atan2(f3, f10)) - 1.5707964f;
                    if (fAtan2 < 0.0f) {
                        fAtan2 += 6.2831855f;
                    }
                    float f12 = fAtan2;
                    x.b1 b1Var = o0Var.T;
                    this.B = 1;
                    hVar.f5808b.f2025a = Boolean.FALSE;
                    z.e1 e1Var = hVar.f5813g;
                    z.b1 b1Var2 = z.b1.B;
                    g gVar = new g(hVar, f12, false, b1Var, null);
                    e1Var.getClass();
                    Object objK = a40.c0.k(new c3.o3(b1Var2, e1Var, gVar, (k00.c) null), this);
                    if (objK != aVar) {
                        objK = b0Var;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                z7.x(o0Var.Q, o0Var.U, o0Var.V, o0.E1(o0Var), ((y3.j) i1Var.getValue()).f16590a);
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                h hVar2 = o0Var.Q;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.f6544a >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & bVar.f6544a));
                float fE1 = o0.E1(o0Var);
                boolean z10 = o0Var.R;
                long j9 = ((y3.j) o0Var.W.getValue()).f16590a;
                x.b1 b1Var3 = o0Var.T;
                this.B = 1;
                return z7.s(hVar2, fIntBitsToFloat2, fIntBitsToFloat3, fE1, z10, j9, b1Var3, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
