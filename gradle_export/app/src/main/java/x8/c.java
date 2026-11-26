package x8;

import java.util.List;

public final class c extends h7.f implements d {
    public d E;
    public long F;
    public final int G = 1;
    public Object H;

    public c() {
    }

    public c(u7.b bVar) {
        this.H = bVar;
    }

    @Override
    public final int d(long j9) {
        d dVar = this.E;
        dVar.getClass();
        return dVar.d(j9 - this.F);
    }

    @Override
    public final long e(int i10) {
        d dVar = this.E;
        dVar.getClass();
        return dVar.e(i10) + this.F;
    }

    @Override
    public final List g(long j9) {
        d dVar = this.E;
        dVar.getClass();
        return dVar.g(j9 - this.F);
    }

    @Override
    public final int i() {
        d dVar = this.E;
        dVar.getClass();
        return dVar.i();
    }

    @Override
    public final void q() {
        this.B = 0;
        this.C = 0L;
        this.D = false;
        this.E = null;
    }

    @Override
    public final void r() {
        switch (this.G) {
            case 0:
                ((u7.b) this.H).m(this);
                break;
            default:
                y8.i iVar = (y8.i) ((y8.g) this.H).f16838b;
                iVar.getClass();
                q();
                iVar.f16840b.add(this);
                break;
        }
    }
}
