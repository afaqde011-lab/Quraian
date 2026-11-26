package k50;

import java.util.concurrent.locks.ReentrantLock;

public final class n implements i0 {
    public final u A;
    public long B;
    public boolean C;

    public n(u uVar, long j) {
        this.A = uVar;
        this.B = j;
    }

    @Override
    public final k0 c() {
        return k0.d;
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
    public final long s(i sink, long j) {
        long j2;
        long j3;
        int i;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.A;
        long j4 = this.B;
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                d0 d0VarN0 = sink.n0(1);
                byte[] array = d0VarN0.a;
                int i2 = d0VarN0.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (uVar) {
                    kotlin.jvm.internal.m.e(array, "array");
                    uVar.E.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = uVar.E.read(array, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (d0VarN0.b == d0VarN0.c) {
                        sink.A = d0VarN0.a();
                        e0.a(d0VarN0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    d0VarN0.c += i;
                    long j7 = i;
                    j6 += j7;
                    sink.B += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.B += j3;
        }
        return j3;
    }
}
