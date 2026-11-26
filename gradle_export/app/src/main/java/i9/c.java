package i9;

import a8.l0;
import a8.q;
import a8.r;
import a8.s;
import a8.u;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.material.datepicker.n;
import e7.i0;
import g7.i;
import java.nio.ByteOrder;
import java.util.Arrays;
import ta.c0;

public final class c implements q {

    public s f7545a;

    public l0 f7546b;

    public b f7549e;

    public int f7547c = 0;

    public long f7548d = -1;

    public int f7550f = -1;

    public long f7551g = -1;

    @Override
    public final void a(s sVar) {
        this.f7545a = sVar;
        this.f7546b = sVar.w(0, 1);
        sVar.q();
    }

    @Override
    public final void b(long j9, long j10) {
        this.f7547c = j9 == 0 ? 0 : 4;
        b bVar = this.f7549e;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    @Override
    public final int d(r rVar, u uVar) throws ParserException {
        byte[] bArr;
        int i10;
        this.f7546b.getClass();
        String str = i0.f5136a;
        int i11 = this.f7547c;
        int iW = 4;
        if (i11 == 0) {
            c0.A(rVar.getPosition() == 0);
            int i12 = this.f7550f;
            if (i12 != -1) {
                rVar.u(i12);
                this.f7547c = 4;
                return 0;
            }
            if (!e.a(rVar)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            rVar.u((int) (rVar.j() - rVar.getPosition()));
            this.f7547c = 1;
            return 0;
        }
        long jP = -1;
        if (i11 == 1) {
            e7.u uVar2 = new e7.u(8);
            d dVarB = d.b(rVar, uVar2);
            if (dVarB.f7552a != 1685272116) {
                rVar.t();
            } else {
                rVar.m(8);
                uVar2.N(0);
                rVar.a(0, 8, uVar2.f5182a);
                jP = uVar2.p();
                rVar.u(((int) dVarB.f7553b) + 8);
            }
            this.f7548d = jP;
            this.f7547c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                c0.A(this.f7551g != -1);
                long position = this.f7551g - rVar.getPosition();
                b bVar = this.f7549e;
                bVar.getClass();
                return bVar.c(rVar, position) ? -1 : 0;
            }
            rVar.t();
            d dVarB2 = e.b(1684108385, rVar, new e7.u(8));
            rVar.u(8);
            Pair pairCreate = Pair.create(Long.valueOf(rVar.getPosition()), Long.valueOf(dVarB2.f7553b));
            this.f7550f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j9 = this.f7548d;
            if (j9 != -1 && jLongValue == 4294967295L) {
                jLongValue = j9;
            }
            this.f7551g = ((long) this.f7550f) + jLongValue;
            long length = rVar.getLength();
            if (length != -1 && this.f7551g > length) {
                e7.a.m("WavExtractor", "Data exceeds input length: " + this.f7551g + ", " + length);
                this.f7551g = length;
            }
            b bVar2 = this.f7549e;
            bVar2.getClass();
            bVar2.b(this.f7550f, this.f7551g);
            this.f7547c = 4;
            return 0;
        }
        e7.u uVar3 = new e7.u(16);
        long j10 = e.b(1718449184, rVar, uVar3).f7553b;
        c0.A(j10 >= 16);
        rVar.a(0, 16, uVar3.f5182a);
        uVar3.N(0);
        int iT = uVar3.t();
        int iT2 = uVar3.t();
        int iS = uVar3.s();
        uVar3.s();
        int iT3 = uVar3.t();
        int iT4 = uVar3.t();
        int i13 = ((int) j10) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            rVar.a(0, i13, bArr);
            if (iT == 65534 && i13 == 24) {
                e7.u uVar4 = new e7.u(bArr);
                uVar4.t();
                int iT5 = uVar4.t();
                if (iT5 != 0 && iT5 != iT4) {
                    throw ParserException.c("validBits ( " + iT5 + ")  != bitsPerSample( " + iT4 + ") are not supported");
                }
                int iS2 = uVar4.s();
                if ((iS2 >> 18) != 0) {
                    throw ParserException.c("invalid channel mask " + iS2);
                }
                if (iS2 != 0 && Integer.bitCount(iS2) != iT2) {
                    throw ParserException.c("invalid number of channels (" + Integer.bitCount(iS2) + ") in channel mask " + iS2);
                }
                iT = uVar4.t();
                byte[] bArr2 = new byte[14];
                uVar4.k(0, 14, bArr2);
                if (!Arrays.equals(bArr2, e.f7554a) && !Arrays.equals(bArr2, e.f7555b)) {
                    throw ParserException.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = i0.f5137b;
        }
        byte[] bArr3 = bArr;
        int i14 = iT;
        rVar.u((int) (rVar.j() - rVar.getPosition()));
        n nVar = new n(i14, iT2, iS, iT3, iT4, bArr3);
        if (i14 == 17) {
            this.f7549e = new a(this.f7545a, this.f7546b, nVar);
        } else if (i14 == 6) {
            this.f7549e = new i(this.f7545a, this.f7546b, nVar, "audio/g711-alaw", -1);
        } else if (i14 == 7) {
            this.f7549e = new i(this.f7545a, this.f7546b, nVar, "audio/g711-mlaw", -1);
        } else {
            if (i14 == 1) {
                iW = i0.w(iT4, ByteOrder.LITTLE_ENDIAN);
                i10 = iW;
            } else {
                if (i14 != 3) {
                    if (i14 == 65534) {
                        iW = i0.w(iT4, ByteOrder.LITTLE_ENDIAN);
                        i10 = iW;
                    }
                } else if (iT4 == 32) {
                    i10 = iW;
                }
                i10 = 0;
            }
            if (i10 == 0) {
                throw ParserException.c("Unsupported WAV format type: " + i14);
            }
            this.f7549e = new i(this.f7545a, this.f7546b, nVar, "audio/raw", i10);
        }
        this.f7547c = 3;
        return 0;
    }

    @Override
    public final boolean e(r rVar) {
        return e.a(rVar);
    }

    @Override
    public final void release() {
    }
}
