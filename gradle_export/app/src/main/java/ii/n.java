package ii;

import du.w;

public final class n implements ij.b {

    public static final w f7710c = new w(23);

    public static final f f7711d = new f(1);

    public ij.a f7712a;

    public volatile ij.b f7713b;

    public n(w wVar, ij.b bVar) {
        this.f7712a = wVar;
        this.f7713b = bVar;
    }

    public final void a(ij.a aVar) {
        ij.b bVar;
        ij.b bVar2;
        ij.b bVar3 = this.f7713b;
        f fVar = f7711d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f7713b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f7712a = new ak.a(this.f7712a, aVar, 5);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f7713b.get();
    }
}
