package k50;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

public final class u implements Closeable {
    public final boolean A;
    public boolean B;
    public int C;
    public final ReentrantLock D = new ReentrantLock();
    public final RandomAccessFile E;

    public u(boolean z, RandomAccessFile randomAccessFile) {
        this.A = z;
        this.E = randomAccessFile;
    }

    public static m a(u uVar) {
        if (!uVar.A) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = uVar.D;
        reentrantLock.lock();
        try {
            if (uVar.B) {
                throw new IllegalStateException("closed");
            }
            uVar.C++;
            reentrantLock.unlock();
            return new m(uVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override
    public final void close() {
        ReentrantLock reentrantLock = this.D;
        reentrantLock.lock();
        try {
            if (this.B) {
                reentrantLock.unlock();
                return;
            }
            this.B = true;
            if (this.C != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.E.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.A) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.D;
        reentrantLock.lock();
        try {
            if (this.B) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.E.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final n i(long j) {
        ReentrantLock reentrantLock = this.D;
        reentrantLock.lock();
        try {
            if (this.B) {
                throw new IllegalStateException("closed");
            }
            this.C++;
            reentrantLock.unlock();
            return new n(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.D;
        reentrantLock.lock();
        try {
            if (this.B) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.E.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
