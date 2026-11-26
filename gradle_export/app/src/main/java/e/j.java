package e;

public final class j extends h.c {

    public final a f4940a;

    public j(a aVar) {
        this.f4940a = aVar;
    }

    @Override
    public final void a(Object obj, hf.c cVar) {
        h.h hVar = this.f4940a.f4929a;
        if (hVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        hVar.a(obj, cVar);
    }
}
