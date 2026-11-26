package y8;

import e7.i0;
import java.util.ArrayDeque;
import m10.z;
import ta.c0;

public abstract class i implements x8.e {

    public final ArrayDeque f16839a = new ArrayDeque();

    public final ArrayDeque f16840b;

    public final ArrayDeque f16841c;

    public h f16842d;

    public long f16843e;

    public long f16844f;

    public long f16845g;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f16839a.add(new h(1));
        }
        this.f16840b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f16840b;
            g gVar = new g(this, 0);
            x8.c cVar = new x8.c();
            cVar.H = gVar;
            arrayDeque.add(cVar);
        }
        this.f16841c = new ArrayDeque();
        this.f16845g = -9223372036854775807L;
    }

    @Override
    public final void a(long j9) {
        this.f16845g = j9;
    }

    @Override
    public final void b(long j9) {
        this.f16843e = j9;
    }

    @Override
    public final void c(x8.h hVar) {
        c0.s(hVar == this.f16842d);
        h hVar2 = (h) hVar;
        if (hVar2.c(4)) {
            long j9 = this.f16844f;
            this.f16844f = 1 + j9;
            hVar2.K = j9;
            this.f16841c.add(hVar2);
        } else {
            long j10 = hVar2.G;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f16845g;
                if (j11 == -9223372036854775807L || j10 >= j11) {
                    long j12 = this.f16844f;
                    this.f16844f = 1 + j12;
                    hVar2.K = j12;
                    this.f16841c.add(hVar2);
                } else {
                    hVar2.q();
                    this.f16839a.add(hVar2);
                }
            } else {
                long j13 = this.f16844f;
                this.f16844f = 1 + j13;
                hVar2.K = j13;
                this.f16841c.add(hVar2);
            }
        }
        this.f16842d = null;
    }

    @Override
    public final Object e() {
        c0.A(this.f16842d == null);
        ArrayDeque arrayDeque = this.f16839a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f16842d = hVar;
        return hVar;
    }

    public abstract z f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f16844f = 0L;
        this.f16843e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f16841c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f16839a;
            if (zIsEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            String str = i0.f5136a;
            hVar.q();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f16842d;
        if (hVar2 != null) {
            hVar2.q();
            arrayDeque.add(hVar2);
            this.f16842d = null;
        }
    }

    public abstract void g(h hVar);

    @Override
    public x8.c d() {
        ArrayDeque arrayDeque = this.f16840b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f16841c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            h hVar = (h) arrayDeque2.peek();
            String str = i0.f5136a;
            if (hVar.G > this.f16843e) {
                return null;
            }
            h hVar2 = (h) arrayDeque2.poll();
            boolean zC = hVar2.c(4);
            ArrayDeque arrayDeque3 = this.f16839a;
            if (zC) {
                x8.c cVar = (x8.c) arrayDeque.pollFirst();
                cVar.a(4);
                hVar2.q();
                arrayDeque3.add(hVar2);
                return cVar;
            }
            g(hVar2);
            if (i()) {
                z zVarF = f();
                x8.c cVar2 = (x8.c) arrayDeque.pollFirst();
                long j9 = hVar2.G;
                cVar2.C = j9;
                cVar2.E = zVarF;
                cVar2.F = j9;
                hVar2.q();
                arrayDeque3.add(hVar2);
                return cVar2;
            }
            hVar2.q();
            arrayDeque3.add(hVar2);
        }
    }

    public abstract boolean i();

    @Override
    public void release() {
    }
}
