package g1;

public final class k6 implements u00.n {
    public final int A;
    public final h1.j B;
    public final kotlin.jvm.internal.w C;

    public k6(h1.j jVar, kotlin.jvm.internal.w wVar, int i10) {
        this.A = i10;
        this.B = jVar;
        this.C = wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i10) {
            case 0:
                fc.n nVar = this.B.f6516a;
                ((l1.e1) nVar.f5635j).i(fFloatValue);
                ((l1.e1) nVar.f5636k).i(fFloatValue2);
                this.C.A = fFloatValue;
                break;
            default:
                fc.n nVar2 = this.B.f6516a;
                ((l1.e1) nVar2.f5635j).i(fFloatValue);
                ((l1.e1) nVar2.f5636k).i(fFloatValue2);
                this.C.A = fFloatValue;
                break;
        }
        return g00.b0.a;
    }
}
