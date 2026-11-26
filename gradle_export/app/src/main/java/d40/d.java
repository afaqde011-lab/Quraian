package d40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class d extends e40.d {
    public static final AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    public final c40.v D;
    public final boolean E;
    private volatile int consumed$volatile;

    public d(c40.v vVar, boolean z) {
        this(vVar, z, k00.j.A, -3, c40.a.A);
    }

    public d(c40.v vVar, boolean z, k00.i iVar, int i, c40.a aVar) {
        super(iVar, i, aVar);
        this.D = vVar;
        this.E = z;
    }

    @Override
    public final String c() {
        return "channel=" + this.D;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) throws Throwable {
        if (this.B == -3) {
            boolean z = this.E;
            if (z && F.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objR = o.r(jVar, this.D, z, cVar);
            if (objR == l00.a.A) {
                return objR;
            }
        } else {
            Object objCollect = super.collect(jVar, cVar);
            if (objCollect == l00.a.A) {
                return objCollect;
            }
        }
        return g00.b0.a;
    }

    @Override
    public final Object d(c40.t tVar, k00.c cVar) throws Throwable {
        Object objR = o.r(new e40.s(tVar), this.D, this.E, cVar);
        return objR == l00.a.A ? objR : g00.b0.a;
    }

    @Override
    public final e40.d e(k00.i iVar, int i, c40.a aVar) {
        return new d(this.D, this.E, iVar, i, aVar);
    }

    @Override
    public final i g() {
        return new d(this.D, this.E);
    }

    @Override
    public final c40.v h(a40.z zVar) {
        if (this.E && F.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.B == -3 ? this.D : super.h(zVar);
    }
}
