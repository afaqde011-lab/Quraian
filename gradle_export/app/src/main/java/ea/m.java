package ea;

public final class m implements e0, ca.n {

    public final int f5222a;

    public final Object f5223b;

    public m(Object obj, int i10) {
        this.f5222a = i10;
        this.f5223b = obj;
    }

    @Override
    public final Object c(String str, u00.k kVar, m00.c cVar) {
        switch (this.f5222a) {
            case 0:
                return ((r) this.f5223b).c(str, kVar, cVar);
            default:
                return ((d0) this.f5223b).c(str, kVar, cVar);
        }
    }

    @Override
    public final ma.a d() {
        switch (this.f5222a) {
            case 0:
                return ((r) this.f5223b).f5225b;
            default:
                return ((d0) this.f5223b).f5216b;
        }
    }
}
