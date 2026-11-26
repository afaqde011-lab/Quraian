package ec;

import java.util.List;

public final class n implements fc.a, c {

    public final cc.i f5338a;

    public final fc.e f5339b;

    public kc.k f5340c;

    public n(cc.i iVar, lc.b bVar, kc.j jVar) {
        this.f5338a = iVar;
        fc.e eVarM0 = jVar.f9626a.m0();
        this.f5339b = eVarM0;
        bVar.f(eVarM0);
        eVarM0.a(this);
    }

    public static int f(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override
    public final void a() {
        this.f5338a.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
    }
}
