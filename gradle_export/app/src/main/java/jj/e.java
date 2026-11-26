package jj;

public final class e implements h {

    public final i f8304a;

    public final xf.g f8305b;

    public e(i iVar, xf.g gVar) {
        this.f8304a = iVar;
        this.f8305b = gVar;
    }

    @Override
    public final boolean a(kj.b bVar) {
        if (bVar.f9693b != 4 || this.f8304a.a(bVar)) {
            return false;
        }
        String str = bVar.f9694c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f8305b.b(new a(bVar.f9696e, bVar.f9697f, str));
        return true;
    }

    @Override
    public final boolean b(Exception exc) {
        this.f8305b.c(exc);
        return true;
    }
}
