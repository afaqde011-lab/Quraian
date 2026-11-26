package p7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i7.c0;
import java.util.ArrayDeque;

public final class e extends MediaCodec.Callback {

    public final HandlerThread f12382b;

    public Handler f12383c;

    public MediaFormat f12388h;

    public MediaFormat f12389i;

    public MediaCodec.CodecException f12390j;

    public MediaCodec.CryptoException f12391k;
    public long l;
    public boolean m;

    public IllegalStateException f12392n;

    public o10.b f12393o;

    public final Object f12381a = new Object();

    public final ba.n f12384d = new ba.n();

    public final ba.n f12385e = new ba.n();

    public final ArrayDeque f12386f = new ArrayDeque();

    public final ArrayDeque f12387g = new ArrayDeque();

    public e(HandlerThread handlerThread) {
        this.f12382b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f12387g;
        if (!arrayDeque.isEmpty()) {
            this.f12389i = (MediaFormat) arrayDeque.getLast();
        }
        ba.n nVar = this.f12384d;
        nVar.f2355c = nVar.f2354b;
        ba.n nVar2 = this.f12385e;
        nVar2.f2355c = nVar2.f2354b;
        this.f12386f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f12392n;
        if (illegalStateException != null) {
            this.f12392n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f12390j;
        if (codecException != null) {
            this.f12390j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f12391k;
        if (cryptoException == null) {
            return;
        }
        this.f12391k = null;
        throw cryptoException;
    }

    @Override
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f12381a) {
            this.f12391k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f12381a) {
            this.f12390j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        c0 c0Var;
        synchronized (this.f12381a) {
            this.f12384d.a(i10);
            o10.b bVar = this.f12393o;
            if (bVar != null && (c0Var = ((m) bVar.B).f12424i0) != null) {
                c0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        c0 c0Var;
        synchronized (this.f12381a) {
            try {
                MediaFormat mediaFormat = this.f12389i;
                if (mediaFormat != null) {
                    this.f12385e.a(-2);
                    this.f12387g.add(mediaFormat);
                    this.f12389i = null;
                }
                this.f12385e.a(i10);
                this.f12386f.add(bufferInfo);
                o10.b bVar = this.f12393o;
                if (bVar != null && (c0Var = ((m) bVar.B).f12424i0) != null) {
                    c0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f12381a) {
            this.f12385e.a(-2);
            this.f12387g.add(mediaFormat);
            this.f12389i = null;
        }
    }
}
