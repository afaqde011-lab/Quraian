package d40;

public final class t0 implements i {
    public final int A = 0;
    public final i[] B;
    public final m00.i C;

    public t0(i[] iVarArr, u00.p pVar) {
        this.B = iVarArr;
        this.C = (m00.i) pVar;
    }

    public t0(i[] iVarArr, u00.q qVar) {
        this.B = iVarArr;
        this.C = (m00.i) qVar;
    }

    public t0(i[] iVarArr, u00.r rVar) {
        this.B = iVarArr;
        this.C = (m00.i) rVar;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) {
        switch (this.A) {
            case 0:
                Object objA = e40.b.a(jVar, cVar, v0.A, new s0((k00.c) null, (u00.p) this.C), this.B);
                return objA == l00.a.A ? objA : g00.b0.a;
            case 1:
                Object objA2 = e40.b.a(jVar, cVar, v0.A, new s0((k00.c) null, (u00.q) this.C), this.B);
                return objA2 == l00.a.A ? objA2 : g00.b0.a;
            default:
                Object objA3 = e40.b.a(jVar, cVar, v0.A, new s0((k00.c) null, (u00.r) this.C), this.B);
                return objA3 == l00.a.A ? objA3 : g00.b0.a;
        }
    }
}
