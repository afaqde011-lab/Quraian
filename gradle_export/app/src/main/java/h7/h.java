package h7;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;
import ta.c0;

public abstract class h implements d {

    public final g f6618a;

    public final e[] f6622e;

    public final f[] f6623f;

    public int f6624g;

    public int f6625h;

    public e f6626i;

    public DecoderException f6627j;

    public boolean f6628k;
    public boolean l;

    public final Object f6619b = new Object();
    public long m = -9223372036854775807L;

    public final ArrayDeque f6620c = new ArrayDeque();

    public final ArrayDeque f6621d = new ArrayDeque();

    public h(e[] eVarArr, f[] fVarArr) {
        this.f6622e = eVarArr;
        this.f6624g = eVarArr.length;
        for (int i10 = 0; i10 < this.f6624g; i10++) {
            this.f6622e[i10] = f();
        }
        this.f6623f = fVarArr;
        this.f6625h = fVarArr.length;
        for (int i11 = 0; i11 < this.f6625h; i11++) {
            this.f6623f[i11] = g();
        }
        g gVar = new g(this);
        this.f6618a = gVar;
        gVar.start();
    }

    @Override
    public final void a(long j9) {
        synchronized (this.f6619b) {
            try {
                c0.A(this.f6624g == this.f6622e.length || this.f6628k);
                this.m = j9;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object e() {
        e eVar;
        synchronized (this.f6619b) {
            try {
                DecoderException decoderException = this.f6627j;
                if (decoderException != null) {
                    throw decoderException;
                }
                c0.A(this.f6626i == null);
                int i10 = this.f6624g;
                if (i10 == 0) {
                    eVar = null;
                } else {
                    e[] eVarArr = this.f6622e;
                    int i11 = i10 - 1;
                    this.f6624g = i11;
                    eVar = eVarArr[i11];
                }
                this.f6626i = eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public abstract e f();

    @Override
    public final void flush() {
        synchronized (this.f6619b) {
            try {
                this.f6628k = true;
                e eVar = this.f6626i;
                if (eVar != null) {
                    eVar.q();
                    e[] eVarArr = this.f6622e;
                    int i10 = this.f6624g;
                    this.f6624g = i10 + 1;
                    eVarArr[i10] = eVar;
                    this.f6626i = null;
                }
                while (!this.f6620c.isEmpty()) {
                    e eVar2 = (e) this.f6620c.removeFirst();
                    eVar2.q();
                    e[] eVarArr2 = this.f6622e;
                    int i11 = this.f6624g;
                    this.f6624g = i11 + 1;
                    eVarArr2[i11] = eVar2;
                }
                while (!this.f6621d.isEmpty()) {
                    ((f) this.f6621d.removeFirst()).r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract f g();

    public abstract DecoderException h(Throwable th2);

    public abstract DecoderException i(e eVar, f fVar, boolean z10);

    public final boolean j() {
        boolean z10;
        DecoderException decoderExceptionH;
        synchronized (this.f6619b) {
            while (!this.l) {
                try {
                    if (!this.f6620c.isEmpty() && this.f6625h > 0) {
                        break;
                    }
                    this.f6619b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.l) {
                return false;
            }
            e eVar = (e) this.f6620c.removeFirst();
            f[] fVarArr = this.f6623f;
            int i10 = this.f6625h - 1;
            this.f6625h = i10;
            f fVar = fVarArr[i10];
            boolean z11 = this.f6628k;
            this.f6628k = false;
            if (eVar.c(4)) {
                fVar.a(4);
            } else {
                fVar.C = eVar.G;
                if (eVar.c(134217728)) {
                    fVar.a(134217728);
                }
                long j9 = eVar.G;
                synchronized (this.f6619b) {
                    long j10 = this.m;
                    z10 = j10 == -9223372036854775807L || j9 >= j10;
                }
                if (!z10) {
                    fVar.D = true;
                }
                try {
                    decoderExceptionH = i(eVar, fVar, z11);
                } catch (OutOfMemoryError e3) {
                    decoderExceptionH = h(e3);
                } catch (RuntimeException e10) {
                    decoderExceptionH = h(e10);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.f6619b) {
                        this.f6627j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.f6619b) {
                try {
                    if (this.f6628k || fVar.D) {
                        fVar.r();
                    } else {
                        this.f6621d.addLast(fVar);
                    }
                    eVar.q();
                    e[] eVarArr = this.f6622e;
                    int i11 = this.f6624g;
                    this.f6624g = i11 + 1;
                    eVarArr[i11] = eVar;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override
    public final f d() {
        synchronized (this.f6619b) {
            try {
                DecoderException decoderException = this.f6627j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f6621d.isEmpty()) {
                    return null;
                }
                return (f) this.f6621d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void c(e eVar) {
        synchronized (this.f6619b) {
            try {
                DecoderException decoderException = this.f6627j;
                if (decoderException != null) {
                    throw decoderException;
                }
                c0.s(eVar == this.f6626i);
                this.f6620c.addLast(eVar);
                if (!this.f6620c.isEmpty() && this.f6625h > 0) {
                    this.f6619b.notify();
                }
                this.f6626i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(f fVar) {
        synchronized (this.f6619b) {
            fVar.q();
            f[] fVarArr = this.f6623f;
            int i10 = this.f6625h;
            this.f6625h = i10 + 1;
            fVarArr[i10] = fVar;
            if (!this.f6620c.isEmpty() && this.f6625h > 0) {
                this.f6619b.notify();
            }
        }
    }

    @Override
    public final void release() {
        synchronized (this.f6619b) {
            this.l = true;
            this.f6619b.notify();
        }
        try {
            this.f6618a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
