package ac;

import mb.k;
import wb.j;
import wb.p;

public final class b implements f {

    public final k f429a;

    public final j f430b;

    public final int f431c;

    public b(k kVar, j jVar, int i10) {
        this.f429a = kVar;
        this.f430b = jVar;
        this.f431c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override
    public final void a() {
        this.f429a.getClass();
        j jVar = this.f430b;
        new pb.a(jVar.a(), jVar.b().f15957y, this.f431c, ((jVar instanceof p) && ((p) jVar).f15981g) ? false : true);
    }
}
