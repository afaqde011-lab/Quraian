package wy;

import g00.b0;

public final class l implements u00.a {
    public final int A;
    public final u00.k B;

    public l(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        u00.k kVar = this.B;
        switch (i) {
            case 0:
                kVar.invoke(a.a);
                break;
            case 1:
                kVar.invoke(xy.g.a);
                break;
            case 2:
                kVar.invoke(xy.c.a);
                break;
            case 3:
                kVar.invoke(xy.e.a);
                break;
            case 4:
                kVar.invoke(xy.e.a);
                break;
            case 5:
                kVar.invoke(xy.d.a);
                break;
            case 6:
                kVar.invoke(zy.d.a);
                break;
            default:
                kVar.invoke(zy.c.a);
                break;
        }
        return b0.a;
    }
}
