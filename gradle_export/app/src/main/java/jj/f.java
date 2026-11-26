package jj;

public final class f implements h {

    public final xf.g f8306a;

    public f(xf.g gVar) {
        this.f8306a = gVar;
    }

    @Override
    public final boolean a(kj.b bVar) {
        int i10 = bVar.f9693b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f8306a.d(bVar.f9692a);
        return true;
    }

    @Override
    public final boolean b(Exception exc) {
        return false;
    }
}
