package d4;

public final class e extends a.a {
    @Override
    public final void V(f fVar, f fVar2) {
        fVar.f4608b = fVar2;
    }

    @Override
    public final void W(f fVar, Thread thread) {
        fVar.f4607a = thread;
    }

    @Override
    public final boolean j(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.B != cVar) {
                    return false;
                }
                gVar.B = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean k(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.A != obj) {
                    return false;
                }
                gVar.A = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean l(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.C != fVar) {
                    return false;
                }
                gVar.C = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
