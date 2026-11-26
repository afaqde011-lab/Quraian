package d0;

public final class l2 extends m00.i implements u00.n {
    public int A;
    public final m2 B;
    public final float C;
    public final float D;

    public l2(m2 m2Var, float f3, float f10, k00.c cVar) {
        super(2, cVar);
        this.B = m2Var;
        this.C = f3;
        this.D = f10;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        return new l2(this.B, this.C, this.D, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            ri.t1.O(obj);
            u2 u2Var = this.B.f4454n0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) << 32) | (((long) Float.floatToRawIntBits(this.D)) & 4294967295L);
            this.A = 1;
            if (e2.a(u2Var, jFloatToRawIntBits, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        return g00.b0.a;
    }
}
