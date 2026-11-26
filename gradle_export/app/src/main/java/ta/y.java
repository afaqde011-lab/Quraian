package ta;

public final class y extends u {

    public final int f14502a;

    public t f14503b;

    public y() {
        this.f14502a = 1;
    }

    public y(t tVar, int i10) {
        this.f14502a = i10;
        this.f14503b = tVar;
    }

    @Override
    public void b(t tVar) {
        switch (this.f14502a) {
            case 0:
                z zVar = (z) this.f14503b;
                zVar.f14504e0.remove(tVar);
                if (!zVar.v()) {
                    zVar.A(zVar, s.f14490u, false);
                    zVar.R = true;
                    zVar.A(zVar, s.f14489t, false);
                }
                break;
        }
    }

    @Override
    public void c(t tVar) {
        switch (this.f14502a) {
            case 1:
                z zVar = (z) this.f14503b;
                if (!zVar.f14507h0) {
                    zVar.O();
                    zVar.f14507h0 = true;
                }
                break;
        }
    }

    @Override
    public void d(t tVar) {
        switch (this.f14502a) {
            case 1:
                z zVar = (z) this.f14503b;
                int i10 = zVar.f14506g0 - 1;
                zVar.f14506g0 = i10;
                if (i10 == 0) {
                    zVar.f14507h0 = false;
                    zVar.o();
                }
                tVar.D(this);
                break;
            case 2:
                this.f14503b.G();
                tVar.D(this);
                break;
        }
    }
}
