package kc;

public final class n implements b {

    public final String f9638a;

    public final int f9639b;

    public final jc.a f9640c;

    public final boolean f9641d;

    public n(String str, int i10, jc.a aVar, boolean z10) {
        this.f9638a = str;
        this.f9639b = i10;
        this.f9640c = aVar;
        this.f9641d = z10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        return new ec.o(iVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f9638a);
        sb2.append(", index=");
        return oi.k.l(sb2, this.f9639b, '}');
    }
}
