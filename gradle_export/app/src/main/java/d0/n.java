package d0;

public final class n implements n2 {

    public final u00.k f4462a;

    public final m f4463b = new m(this);

    public final z.e1 f4464c = new z.e1();

    public final l1.i1 f4465d;

    public final l1.i1 f4466e;

    public final l1.i1 f4467f;

    public n(u00.k kVar) {
        this.f4462a = kVar;
        Boolean bool = Boolean.FALSE;
        this.f4465d = l1.q.z(bool);
        this.f4466e = l1.q.z(bool);
        this.f4467f = l1.q.z(bool);
    }

    @Override
    public final boolean a() {
        return ((Boolean) this.f4465d.getValue()).booleanValue();
    }

    @Override
    public final Object c(z.b1 b1Var, u00.n nVar, m00.c cVar) {
        Object objK = a40.c0.k(new a1.e2(this, b1Var, nVar, null, 13), cVar);
        return objK == l00.a.A ? objK : g00.b0.a;
    }

    @Override
    public final float e(float f3) {
        return ((Number) this.f4462a.invoke(Float.valueOf(f3))).floatValue();
    }
}
