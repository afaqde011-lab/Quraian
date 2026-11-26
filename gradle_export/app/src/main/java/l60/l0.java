package l60;

public final class l0 extends x40.z {
    public final int a = 1;
    public final x40.s b;
    public final Object c;

    public l0(x40.s sVar, k50.l lVar) {
        this.b = sVar;
        this.c = lVar;
    }

    public l0(x40.z zVar, x40.s sVar) {
        this.c = zVar;
        this.b = sVar;
    }

    @Override
    public final long a() {
        switch (this.a) {
            case 0:
                return ((x40.z) this.c).a();
            default:
                return ((k50.l) this.c).d();
        }
    }

    @Override
    public final x40.s b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override
    public final void c(k50.j jVar) {
        switch (this.a) {
            case 0:
                ((x40.z) this.c).c(jVar);
                break;
            default:
                jVar.V((k50.l) this.c);
                break;
        }
    }
}
