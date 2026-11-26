package bh;

public final class j extends g {
    public final int B;
    public final Object C;

    public j(Object obj, int i10) {
        this.B = i10;
        this.C = obj;
    }

    @Override
    public final void a() {
        switch (this.B) {
            case 0:
                synchronized (((l) this.C).f2512f) {
                    try {
                        if (((l) this.C).f2517k.get() > 0 && ((l) this.C).f2517k.decrementAndGet() > 0) {
                            ((l) this.C).f2508b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        l lVar = (l) this.C;
                        if (lVar.m != null) {
                            lVar.f2508b.g("Unbind from service.", new Object[0]);
                            l lVar2 = (l) this.C;
                            lVar2.f2507a.unbindService(lVar2.l);
                            l lVar3 = (l) this.C;
                            lVar3.f2513g = false;
                            lVar3.m = null;
                            lVar3.l = null;
                        }
                        ((l) this.C).c();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                l lVar4 = (l) ((k) this.C).B;
                lVar4.f2508b.g("unlinkToDeath", new Object[0]);
                ((c) lVar4.m).f2502e.unlinkToDeath(lVar4.f2516j, 0);
                lVar4.m = null;
                lVar4.f2513g = false;
                return;
        }
    }
}
