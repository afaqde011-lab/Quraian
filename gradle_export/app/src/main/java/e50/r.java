package e50;

import java.io.InterruptedIOException;
import k50.g0;
import k50.k0;

public final class r implements g0 {
    public final boolean A;
    public final k50.i B = new k50.i();
    public boolean C;
    public final u D;

    public r(u uVar, boolean z) {
        this.D = uVar;
        this.A = z;
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        u uVar = this.D;
        synchronized (uVar) {
            uVar.l.h();
            while (uVar.e >= uVar.f && !this.A && !this.C) {
                try {
                    synchronized (uVar) {
                        int i = uVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            uVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    uVar.l.k();
                    throw th;
                }
            }
            uVar.l.k();
            uVar.b();
            jMin = Math.min(uVar.f - uVar.e, this.B.B);
            uVar.e += jMin;
            z2 = z && jMin == this.B.B;
        }
        this.D.l.h();
        try {
            u uVar2 = this.D;
            uVar2.b.x(uVar2.a, z2, this.B, jMin);
        } finally {
            this.D.l.k();
        }
    }

    @Override
    public final k0 c() {
        return this.D.l;
    }

    @Override
    public final void c0(k50.i iVar, long j) {
        byte[] bArr = y40.b.a;
        k50.i iVar2 = this.B;
        iVar2.c0(iVar, j);
        while (iVar2.B >= 16384) {
            a(false);
        }
    }

    @Override
    public final void close() {
        boolean z;
        u uVar = this.D;
        byte[] bArr = y40.b.a;
        synchronized (uVar) {
            if (this.C) {
                return;
            }
            synchronized (uVar) {
                z = uVar.m == 0;
            }
            u uVar2 = this.D;
            if (!uVar2.j.A) {
                if (this.B.B > 0) {
                    while (this.B.B > 0) {
                        a(true);
                    }
                } else if (z) {
                    uVar2.b.x(uVar2.a, true, null, 0L);
                }
            }
            synchronized (this.D) {
                this.C = true;
            }
            this.D.b.flush();
            this.D.a();
        }
    }

    @Override
    public final void flush() {
        u uVar = this.D;
        byte[] bArr = y40.b.a;
        synchronized (uVar) {
            uVar.b();
        }
        while (this.B.B > 0) {
            a(false);
            this.D.b.flush();
        }
    }
}
