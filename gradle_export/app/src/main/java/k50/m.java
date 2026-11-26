package k50;

import java.util.concurrent.locks.ReentrantLock;

public final class m implements g0 {
    public final u A;
    public long B;
    public boolean C;

    public m(u fileHandle) {
        kotlin.jvm.internal.m.e(fileHandle, "fileHandle");
        this.A = fileHandle;
        this.B = 0L;
    }

    @Override
    public final k0 c() {
        return k0.d;
    }

    @Override
    public final void c0(i iVar, long j) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.A;
        long j2 = this.B;
        uVar.getClass();
        ab.a0.u(iVar.B, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            d0 d0Var = iVar.A;
            kotlin.jvm.internal.m.b(d0Var);
            int iMin = (int) Math.min(j3 - j2, d0Var.c - d0Var.b);
            byte[] array = d0Var.a;
            int i = d0Var.b;
            synchronized (uVar) {
                kotlin.jvm.internal.m.e(array, "array");
                uVar.E.seek(j2);
                uVar.E.write(array, i, iMin);
            }
            int i2 = d0Var.b + iMin;
            d0Var.b = i2;
            long j4 = iMin;
            j2 += j4;
            iVar.B -= j4;
            if (i2 == d0Var.c) {
                iVar.A = d0Var.a();
                e0.a(d0Var);
            }
        }
        this.B += j;
    }

    @Override
    public final void close() {
        u uVar = this.A;
        if (this.C) {
            return;
        }
        this.C = true;
        ReentrantLock reentrantLock = uVar.D;
        reentrantLock.lock();
        try {
            int i = uVar.C - 1;
            uVar.C = i;
            if (i == 0 && uVar.B) {
                reentrantLock.unlock();
                synchronized (uVar) {
                    uVar.E.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void flush() {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.A;
        synchronized (uVar) {
            uVar.E.getFD().sync();
        }
    }
}
