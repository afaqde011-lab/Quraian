package kc;

public final class i implements b {

    public final int f9621a = 1;

    public final jc.b f9622b;

    public final boolean f9623c;

    public final jc.e f9624d;

    public final Object f9625e;

    public i(String str, jc.b bVar, jc.b bVar2, jc.d dVar, boolean z10) {
        this.f9622b = bVar;
        this.f9624d = bVar2;
        this.f9625e = dVar;
        this.f9623c = z10;
    }

    public i(String str, jc.e eVar, jc.a aVar, jc.b bVar, boolean z10) {
        this.f9624d = eVar;
        this.f9625e = aVar;
        this.f9622b = bVar;
        this.f9623c = z10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        switch (this.f9621a) {
            case 0:
                return new ec.l(iVar, bVar, this);
            default:
                return new ec.m(iVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f9621a) {
            case 0:
                return "RectangleShape{position=" + this.f9624d + ", size=" + ((jc.e) this.f9625e) + '}';
            default:
                return super.toString();
        }
    }
}
