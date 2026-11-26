package a8;

import androidx.media3.common.r0;
import com.google.android.gms.cast.Cast;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class m implements r {
    public final androidx.media3.common.j B;
    public final long C;
    public long D;
    public int F;
    public int G;
    public byte[] E = new byte[Cast.MAX_MESSAGE_LENGTH];
    public final byte[] A = new byte[4096];

    static {
        r0.a("media3.extractor");
    }

    public m(androidx.media3.common.j jVar, long j9, long j10) {
        this.B = jVar;
        this.D = j9;
        this.C = j10;
    }

    @Override
    public final void a(int i10, int i11, byte[] bArr) {
        i(bArr, i10, i11, false);
    }

    public final boolean b(int i10, boolean z10) {
        c(i10);
        int iE = this.G - this.F;
        while (iE < i10) {
            m mVar = this;
            int i11 = i10;
            boolean z11 = z10;
            iE = mVar.e(this.E, this.F, i11, iE, z11);
            if (iE == -1) {
                return false;
            }
            mVar.G = mVar.F + iE;
            this = mVar;
            i10 = i11;
            z10 = z11;
        }
        this.F += i10;
        return true;
    }

    public final void c(int i10) {
        int i11 = this.F + i10;
        byte[] bArr = this.E;
        if (i11 > bArr.length) {
            this.E = Arrays.copyOf(this.E, e7.i0.h(bArr.length * 2, Cast.MAX_MESSAGE_LENGTH + i11, i11 + 524288));
        }
    }

    @Override
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.G;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.E, 0, bArr, i10, iMin);
            h(iMin);
        }
        int iE = iMin;
        while (iE < i11 && iE != -1) {
            iE = e(bArr, i10, i11, iE, z10);
        }
        if (iE != -1) {
            this.D += (long) iE;
        }
        return iE != -1;
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.B.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final int f(int i10, int i11, byte[] bArr) throws EOFException, InterruptedIOException {
        m mVar;
        int iMin;
        c(i11);
        int i12 = this.G;
        int i13 = this.F;
        int i14 = i12 - i13;
        if (i14 == 0) {
            mVar = this;
            iMin = mVar.e(this.E, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            mVar.G += iMin;
        } else {
            mVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(mVar.E, mVar.F, bArr, i10, iMin);
        mVar.F += iMin;
        return iMin;
    }

    @Override
    public final boolean g(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.G, i10);
        h(iMin);
        int iE = iMin;
        while (iE < i10 && iE != -1) {
            byte[] bArr = this.A;
            iE = e(bArr, -iE, Math.min(i10, bArr.length + iE), iE, z10);
        }
        if (iE != -1) {
            this.D += (long) iE;
        }
        return iE != -1;
    }

    @Override
    public final long getLength() {
        return this.C;
    }

    @Override
    public final long getPosition() {
        return this.D;
    }

    public final void h(int i10) {
        int i11 = this.G - i10;
        this.G = i11;
        this.F = 0;
        byte[] bArr = this.E;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[Cast.MAX_MESSAGE_LENGTH + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.E = bArr2;
    }

    @Override
    public final boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        if (!b(i11, z10)) {
            return false;
        }
        System.arraycopy(this.E, this.F - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public final long j() {
        return this.D + ((long) this.F);
    }

    @Override
    public final void m(int i10) {
        b(i10, false);
    }

    @Override
    public final int n(int i10) throws EOFException, InterruptedIOException {
        m mVar;
        int iMin = Math.min(this.G, i10);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.A;
            mVar = this;
            iMin = mVar.e(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            mVar = this;
        }
        if (iMin != -1) {
            mVar.D += (long) iMin;
        }
        return iMin;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        m mVar;
        int i12 = this.G;
        int iE = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.E, 0, bArr, i10, iMin);
            h(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            mVar = this;
            iE = mVar.e(bArr, i10, i11, 0, true);
        } else {
            mVar = this;
        }
        if (iE != -1) {
            mVar.D += (long) iE;
        }
        return iE;
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        d(bArr, i10, i11, false);
    }

    @Override
    public final void t() {
        this.F = 0;
    }

    @Override
    public final void u(int i10) throws EOFException, InterruptedIOException {
        g(i10, false);
    }
}
