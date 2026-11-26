package c7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.android.gms.cast.MediaStatus;
import e7.i0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ta.c0;

public final class s implements m {

    public int f2964b;

    public float f2965c;

    public float f2966d;

    public k f2967e;

    public k f2968f;

    public k f2969g;

    public k f2970h;

    public boolean f2971i;

    public r f2972j;

    public ByteBuffer f2973k;
    public ByteBuffer l;
    public long m;

    public long f2974n;

    public boolean f2975o;

    @Override
    public final boolean a() {
        if (this.f2968f.f2919a != -1) {
            return Math.abs(this.f2965c - 1.0f) >= 1.0E-4f || Math.abs(this.f2966d - 1.0f) >= 1.0E-4f || this.f2968f.f2919a != this.f2967e.f2919a;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (this.f2975o) {
            r rVar = this.f2972j;
            if (rVar != null) {
                c0.A(rVar.f2959k >= 0);
                if (rVar.f2957i.o() * rVar.f2959k * rVar.f2950b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer c() {
        r rVar = this.f2972j;
        if (rVar != null) {
            p pVar = rVar.f2957i;
            int i10 = rVar.f2950b;
            c0.A(rVar.f2959k >= 0);
            int iO = pVar.o() * rVar.f2959k * i10;
            if (iO > 0) {
                if (this.f2973k.capacity() < iO) {
                    this.f2973k = ByteBuffer.allocateDirect(iO).order(ByteOrder.nativeOrder());
                } else {
                    this.f2973k.clear();
                }
                ByteBuffer byteBuffer = this.f2973k;
                c0.A(rVar.f2959k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (pVar.o() * i10), rVar.f2959k);
                pVar.b(iMin, byteBuffer);
                rVar.f2959k -= iMin;
                System.arraycopy(pVar.i(), iMin * i10, pVar.i(), 0, rVar.f2959k * i10);
                this.f2973k.flip();
                this.f2974n += (long) iO;
                this.l = this.f2973k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m.f2925a;
        return byteBuffer2;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = this.f2972j;
            rVar.getClass();
            this.m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i10 = rVar.f2950b;
            p pVar = rVar.f2957i;
            int iO = iRemaining / (pVar.o() * i10);
            pVar.p(iO);
            pVar.a(iRemaining, byteBuffer);
            rVar.f2958j += iO;
            rVar.b();
        }
    }

    @Override
    public final k e(k kVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i10 = kVar.f2921c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(kVar);
        }
        int i11 = this.f2964b;
        if (i11 == -1) {
            i11 = kVar.f2919a;
        }
        this.f2967e = kVar;
        k kVar2 = new k(i11, kVar.f2920b, i10);
        this.f2968f = kVar2;
        this.f2971i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f2972j;
        if (rVar != null) {
            int i10 = rVar.f2958j;
            float f3 = rVar.f2951c;
            float f10 = rVar.f2952d;
            double d3 = f3 / f10;
            double d5 = rVar.f2953e * f10;
            int i11 = rVar.f2961o;
            int i12 = rVar.f2959k + ((int) ((((((((double) (i10 - i11)) / d3) + ((double) i11)) + rVar.f2963q) + ((double) rVar.l)) / d5) + 0.5d));
            rVar.f2963q = 0.0d;
            p pVar = rVar.f2957i;
            int i13 = rVar.f2956h * 2;
            pVar.p(i13 + i10);
            pVar.d(i10 * rVar.f2950b, i13);
            rVar.f2958j = i13 + rVar.f2958j;
            rVar.b();
            if (rVar.f2959k > i12) {
                rVar.f2959k = Math.max(i12, 0);
            }
            rVar.f2958j = 0;
            rVar.f2961o = 0;
            rVar.l = 0;
        }
        this.f2975o = true;
    }

    @Override
    public final void flush() {
        if (a()) {
            k kVar = this.f2967e;
            this.f2969g = kVar;
            k kVar2 = this.f2968f;
            this.f2970h = kVar2;
            if (this.f2971i) {
                this.f2972j = new r(kVar.f2919a, kVar.f2920b, this.f2965c, this.f2966d, kVar2.f2919a, kVar.f2921c == 4);
            } else {
                r rVar = this.f2972j;
                if (rVar != null) {
                    rVar.f2958j = 0;
                    rVar.f2959k = 0;
                    rVar.l = 0;
                    rVar.m = 0;
                    rVar.f2960n = 0;
                    rVar.f2961o = 0;
                    rVar.f2962p = 0;
                    rVar.f2963q = 0.0d;
                    rVar.f2957i.flush();
                }
            }
        }
        this.l = m.f2925a;
        this.m = 0L;
        this.f2974n = 0L;
        this.f2975o = false;
    }

    @Override
    public final long g(long j9) {
        if (this.f2974n < MediaStatus.COMMAND_QUEUE_REPEAT_ALL) {
            return (long) (j9 / ((double) this.f2965c));
        }
        long j10 = this.m;
        r rVar = this.f2972j;
        rVar.getClass();
        long jO = j10 - ((long) (rVar.f2957i.o() * (rVar.f2958j * rVar.f2950b)));
        int i10 = this.f2970h.f2919a;
        int i11 = this.f2969g.f2919a;
        return i10 == i11 ? i0.Q(j9, this.f2974n, jO, RoundingMode.DOWN) : i0.Q(j9, this.f2974n * ((long) i11), jO * ((long) i10), RoundingMode.DOWN);
    }

    @Override
    public final void reset() {
        this.f2965c = 1.0f;
        this.f2966d = 1.0f;
        k kVar = k.f2918e;
        this.f2967e = kVar;
        this.f2968f = kVar;
        this.f2969g = kVar;
        this.f2970h = kVar;
        ByteBuffer byteBuffer = m.f2925a;
        this.f2973k = byteBuffer;
        this.l = byteBuffer;
        this.f2964b = -1;
        this.f2971i = false;
        this.f2972j = null;
        this.m = 0L;
        this.f2974n = 0L;
        this.f2975o = false;
    }
}
