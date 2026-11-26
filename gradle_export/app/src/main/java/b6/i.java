package b6;

public final class i implements h {

    public t f2173b;

    public u f2174c;

    public Float f2175d;

    public m f2172a = k.f2179a;

    public int f2176e = 1;

    @Override
    public final h a() {
        i iVar = new i();
        iVar.f2172a = this.f2172a;
        iVar.f2173b = this.f2173b;
        iVar.f2174c = this.f2174c;
        iVar.f2175d = this.f2175d;
        iVar.f2176e = this.f2176e;
        return iVar;
    }

    @Override
    public final m b() {
        return this.f2172a;
    }

    @Override
    public final void c(m mVar) {
        this.f2172a = mVar;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f2172a + ", provider=" + this.f2173b + ", colorFilterParams=" + this.f2174c + ", alpha=" + this.f2175d + ", contentScale=" + ((Object) j6.h.a(this.f2176e)) + ')';
    }
}
