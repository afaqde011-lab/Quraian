package p7;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import e7.i0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements j {
    public static final ArrayDeque G = new ArrayDeque();
    public static final Object H = new Object();
    public final MediaCodec A;
    public final HandlerThread B;
    public androidx.mediarouter.app.d C;
    public final AtomicReference D;
    public final e7.g E;
    public boolean F;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e7.g gVar = new e7.g();
        this.A = mediaCodec;
        this.B = handlerThread;
        this.E = gVar;
        this.D = new AtomicReference();
    }

    public static c a() {
        ArrayDeque arrayDeque = G;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void flush() {
        if (this.F) {
            try {
                androidx.mediarouter.app.d dVar = this.C;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                e7.g gVar = this.E;
                synchronized (gVar) {
                    gVar.f5135b = false;
                }
                androidx.mediarouter.app.d dVar2 = this.C;
                dVar2.getClass();
                dVar2.obtainMessage(3).sendToTarget();
                gVar.a();
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    @Override
    public final void g(int i10, h7.c cVar, long j9, int i11) {
        t();
        c cVarA = a();
        cVarA.f12376a = i10;
        cVarA.f12377b = 0;
        cVarA.f12379d = j9;
        cVarA.f12380e = i11;
        MediaCodec.CryptoInfo cryptoInfo = cVarA.f12378c;
        cryptoInfo.numSubSamples = cVar.f6613f;
        int[] iArr = cVar.f6611d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cVar.f6612e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cVar.f6609b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cVar.f6608a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cVar.f6610c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f6614g, cVar.f6615h));
        androidx.mediarouter.app.d dVar = this.C;
        String str = i0.f5136a;
        dVar.obtainMessage(2, cVarA).sendToTarget();
    }

    @Override
    public final void j(Bundle bundle) {
        t();
        androidx.mediarouter.app.d dVar = this.C;
        String str = i0.f5136a;
        dVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void p(int i10, int i11, int i12, long j9) {
        t();
        c cVarA = a();
        cVarA.f12376a = i10;
        cVarA.f12377b = i11;
        cVarA.f12379d = j9;
        cVarA.f12380e = i12;
        androidx.mediarouter.app.d dVar = this.C;
        String str = i0.f5136a;
        dVar.obtainMessage(1, cVarA).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.F) {
            flush();
            this.B.quit();
        }
        this.F = false;
    }

    @Override
    public final void start() {
        if (this.F) {
            return;
        }
        HandlerThread handlerThread = this.B;
        handlerThread.start();
        this.C = new androidx.mediarouter.app.d(this, handlerThread.getLooper(), 10);
        this.F = true;
    }

    @Override
    public final void t() {
        RuntimeException runtimeException = (RuntimeException) this.D.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
