package k7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

public final class i0 extends c7.n {

    public int f9084i;

    public int f9085j;

    public boolean f9086k;
    public int l;
    public byte[] m;

    public int f9087n;

    public long f9088o;

    @Override
    public final boolean b() {
        return super.b() && this.f9087n == 0;
    }

    @Override
    public final ByteBuffer c() {
        int i10;
        if (super.b() && (i10 = this.f9087n) > 0) {
            l(i10).put(this.m, 0, this.f9087n).flip();
            this.f9087n = 0;
        }
        return super.c();
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.l);
        this.f9088o += (long) (iMin / this.f2926b.f2922d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f9087n + i11) - this.m.length;
        ByteBuffer byteBufferL = l(length);
        int iH = e7.i0.h(length, 0, this.f9087n);
        byteBufferL.put(this.m, 0, iH);
        int iH2 = e7.i0.h(length - iH, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iH2;
        int i13 = this.f9087n - iH;
        this.f9087n = i13;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iH, bArr, 0, i13);
        byteBuffer.get(this.m, this.f9087n, i12);
        this.f9087n += i12;
        byteBufferL.flip();
    }

    @Override
    public final long g(long j9) {
        return Math.max(0L, j9 - e7.i0.O(this.f2926b.f2919a, this.f9085j + this.f9084i));
    }

    @Override
    public final c7.k h(c7.k kVar) throws AudioProcessor$UnhandledAudioFormatException {
        if (!e7.i0.D(kVar.f2921c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(kVar);
        }
        this.f9086k = true;
        return (this.f9084i == 0 && this.f9085j == 0) ? c7.k.f2918e : kVar;
    }

    @Override
    public final void i() {
        if (this.f9086k) {
            this.f9086k = false;
            int i10 = this.f9085j;
            int i11 = this.f2926b.f2922d;
            this.m = new byte[i10 * i11];
            this.l = this.f9084i * i11;
        }
        this.f9087n = 0;
    }

    @Override
    public final void j() {
        if (this.f9086k) {
            int i10 = this.f9087n;
            if (i10 > 0) {
                this.f9088o += (long) (i10 / this.f2926b.f2922d);
            }
            this.f9087n = 0;
        }
    }

    @Override
    public final void k() {
        this.m = e7.i0.f5137b;
    }
}
