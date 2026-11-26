package f8;

import a8.d0;
import a8.l0;
import a8.m;
import a8.n0;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import a8.w;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.MediaStatus;
import e7.i0;
import e7.u;
import fh.t0;
import java.util.Arrays;
import l9.f0;
import me.i;
import oi.k;

public final class c implements q {

    public s f5561e;

    public l0 f5562f;

    public v0 f5564h;

    public w f5565i;

    public int f5566j;

    public int f5567k;
    public b l;
    public int m;

    public long f5568n;

    public final byte[] f5557a = new byte[42];

    public final u f5558b = new u(0, new byte[32768]);

    public final boolean f5559c = false;

    public final a8.u f5560d = new a8.u();

    public int f5563g = 0;

    @Override
    public final void a(s sVar) {
        this.f5561e = sVar;
        this.f5562f = sVar.w(0, 1);
        sVar.q();
    }

    @Override
    public final void b(long j9, long j10) {
        if (j9 == 0) {
            this.f5563g = 0;
        } else {
            b bVar = this.l;
            if (bVar != null) {
                bVar.d(j10);
            }
        }
        this.f5568n = j10 != 0 ? -1L : 0L;
        this.m = 0;
        this.f5558b.K(0);
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        w wVar;
        d0 vVar;
        long j9;
        long j10;
        boolean zB;
        long j11;
        int i10 = this.f5563g;
        v0 v0Var = null;
        boolean z10 = true;
        int i11 = 0;
        if (i10 == 0) {
            rVar.t();
            long j12 = rVar.j();
            v0 v0VarH = new i(4).H(rVar, !this.f5559c ? null : o8.i.f11710g, 0);
            if (v0VarH != null && v0VarH.f1660a.length != 0) {
                v0Var = v0VarH;
            }
            rVar.u((int) (rVar.j() - j12));
            this.f5564h = v0Var;
            this.f5563g = 1;
            return 0;
        }
        byte[] bArr = this.f5557a;
        if (i10 == 1) {
            rVar.a(0, bArr.length, bArr);
            rVar.t();
            this.f5563g = 2;
            return 0;
        }
        int i12 = 3;
        if (i10 == 2) {
            u uVar2 = new u(4);
            rVar.readFully(uVar2.f5182a, 0, 4);
            if (uVar2.C() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.f5563g = 3;
            return 0;
        }
        int i13 = 7;
        if (i10 == 3) {
            int i14 = 0;
            w wVar2 = this.f5565i;
            boolean z11 = false;
            while (!z11) {
                rVar.t();
                byte[] bArr2 = new byte[4];
                n0 n0Var = new n0(4, bArr2);
                int i15 = i14;
                rVar.a(i15, 4, bArr2);
                boolean zH = n0Var.h();
                int i16 = n0Var.i(i13);
                int i17 = n0Var.i(24) + 4;
                if (i16 == 0) {
                    byte[] bArr3 = new byte[38];
                    rVar.readFully(bArr3, i15, 38);
                    wVar2 = new w(4, bArr3);
                } else {
                    if (wVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    v0 v0Var2 = wVar2.l;
                    if (i16 == i12) {
                        u uVar3 = new u(i17);
                        rVar.readFully(uVar3.f5182a, i15, i17);
                        wVar = new w(wVar2.f311a, wVar2.f312b, wVar2.f313c, wVar2.f314d, wVar2.f315e, wVar2.f317g, wVar2.f318h, wVar2.f320j, a8.b.v(uVar3), wVar2.l);
                    } else if (i16 == 4) {
                        u uVar4 = new u(i17);
                        rVar.readFully(uVar4.f5182a, 0, i17);
                        uVar4.O(4);
                        v0 v0VarT = a8.b.t(Arrays.asList((String[]) a8.b.w(uVar4, false, false).B));
                        if (v0Var2 != null) {
                            v0VarT = v0Var2.b(v0VarT);
                        }
                        wVar = new w(wVar2.f311a, wVar2.f312b, wVar2.f313c, wVar2.f314d, wVar2.f315e, wVar2.f317g, wVar2.f318h, wVar2.f320j, wVar2.f321k, v0VarT);
                    } else if (i16 == 6) {
                        u uVar5 = new u(i17);
                        rVar.readFully(uVar5.f5182a, 0, i17);
                        uVar5.O(4);
                        v0 v0Var3 = new v0(t0.s(m8.a.d(uVar5)));
                        if (v0Var2 != null) {
                            v0Var3 = v0Var2.b(v0Var3);
                        }
                        wVar = new w(wVar2.f311a, wVar2.f312b, wVar2.f313c, wVar2.f314d, wVar2.f315e, wVar2.f317g, wVar2.f318h, wVar2.f320j, wVar2.f321k, v0Var3);
                    } else {
                        rVar.u(i17);
                    }
                    wVar2 = wVar;
                }
                String str = i0.f5136a;
                this.f5565i = wVar2;
                z11 = zH;
                i12 = 3;
                i13 = 7;
                i14 = 0;
            }
            this.f5565i.getClass();
            this.f5566j = Math.max(this.f5565i.f313c, 6);
            t tVarC = this.f5565i.c(bArr, this.f5564h);
            l0 l0Var = this.f5562f;
            androidx.media3.common.s sVarA = tVarC.a();
            sVarA.l = x0.n("audio/flac");
            k.w(sVarA, l0Var);
            this.f5562f.c(this.f5565i.b());
            this.f5563g = 4;
            return 0;
        }
        if (i10 == 4) {
            rVar.t();
            u uVar6 = new u(2);
            rVar.a(0, 2, uVar6.f5182a);
            int iH = uVar6.H();
            if ((iH >> 2) != 16382) {
                rVar.t();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            rVar.t();
            this.f5567k = iH;
            s sVar = this.f5561e;
            String str2 = i0.f5136a;
            long position = rVar.getPosition();
            long length = rVar.getLength();
            this.f5565i.getClass();
            w wVar3 = this.f5565i;
            f0 f0Var = wVar3.f321k;
            if (f0Var != null && ((long[]) f0Var.B).length > 0) {
                vVar = new v(wVar3, position, 0);
                i11 = 0;
            } else if (length == -1 || wVar3.f320j <= 0) {
                i11 = 0;
                vVar = new v(wVar3.b());
            } else {
                int i18 = this.f5567k;
                int i19 = wVar3.f313c;
                ab.r rVar2 = new ab.r(wVar3, 12);
                a aVar = new a(wVar3, i18);
                long jB = wVar3.b();
                long j13 = wVar3.f320j;
                int i20 = wVar3.f314d;
                if (i20 > 0) {
                    j9 = ((((long) i20) + ((long) i19)) / 2) + 1;
                } else {
                    int i21 = wVar3.f311a;
                    j9 = 64 + (((((i21 != wVar3.f312b || i21 <= 0) ? MediaStatus.COMMAND_EDIT_TRACKS : i21) * ((long) wVar3.f317g)) * ((long) wVar3.f318h)) / 8);
                }
                b bVar = new b(rVar2, aVar, jB, j13, position, length, j9, Math.max(6, i19));
                this.l = bVar;
                vVar = bVar.f5553a;
            }
            sVar.b(vVar);
            this.f5563g = 5;
            return i11;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f5562f.getClass();
        this.f5565i.getClass();
        b bVar2 = this.l;
        if (bVar2 != null && bVar2.f5555c != null) {
            return bVar2.b(rVar, uVar);
        }
        if (this.f5568n == -1) {
            w wVar4 = this.f5565i;
            rVar.t();
            rVar.m(1);
            byte[] bArr4 = new byte[1];
            rVar.a(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            rVar.m(2);
            i13 = z12 ? 7 : 6;
            u uVar7 = new u(i13);
            byte[] bArr5 = uVar7.f5182a;
            int i22 = 0;
            while (i22 < i13) {
                int iF = rVar.f(i22, i13 - i22, bArr5);
                if (iF == -1) {
                    break;
                }
                i22 += iF;
            }
            uVar7.M(i22);
            rVar.t();
            try {
                long jI = uVar7.I();
                if (!z12) {
                    jI *= (long) wVar4.f312b;
                }
                long j14 = wVar4.f320j;
                if (j14 == 0 || jI <= j14) {
                    j11 = jI;
                } else {
                    z10 = false;
                    j11 = 0;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z10) {
                throw ParserException.a(null, null);
            }
            this.f5568n = j11;
        } else {
            u uVar8 = this.f5558b;
            int i23 = uVar8.f5184c;
            if (i23 < 32768) {
                int i24 = rVar.read(uVar8.f5182a, i23, 32768 - i23);
                z10 = i24 == -1;
                if (!z10) {
                    uVar8.M(i23 + i24);
                } else if (uVar8.a() == 0) {
                    long j15 = this.f5568n * 1000000;
                    w wVar5 = this.f5565i;
                    String str3 = i0.f5136a;
                    this.f5562f.d(j15 / ((long) wVar5.f315e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z10 = false;
            }
            int i25 = uVar8.f5183b;
            int i26 = this.m;
            int i27 = this.f5566j;
            if (i26 < i27) {
                uVar8.O(Math.min(i27 - i26, uVar8.a()));
            }
            this.f5565i.getClass();
            int i28 = uVar8.f5183b;
            while (true) {
                int i29 = uVar8.f5184c - 16;
                a8.u uVar9 = this.f5560d;
                if (i28 > i29) {
                    if (z10) {
                        while (true) {
                            int i30 = uVar8.f5184c;
                            if (i28 <= i30 - this.f5566j) {
                                uVar8.N(i28);
                                try {
                                    zB = a8.b.b(uVar8, this.f5565i, this.f5567k, uVar9);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zB = false;
                                }
                                if (uVar8.f5183b > uVar8.f5184c) {
                                    zB = false;
                                }
                                if (zB) {
                                    uVar8.N(i28);
                                    j10 = uVar9.f307a;
                                    break;
                                }
                                i28++;
                            } else {
                                uVar8.N(i30);
                            }
                        }
                    } else {
                        uVar8.N(i28);
                    }
                    j10 = -1;
                    break;
                }
                uVar8.N(i28);
                if (a8.b.b(uVar8, this.f5565i, this.f5567k, uVar9)) {
                    uVar8.N(i28);
                    j10 = uVar9.f307a;
                    break;
                }
                i28++;
            }
            int i31 = uVar8.f5183b - i25;
            uVar8.N(i25);
            this.f5562f.g(i31, uVar8);
            int i32 = this.m + i31;
            this.m = i32;
            if (j10 != -1) {
                long j16 = this.f5568n * 1000000;
                w wVar6 = this.f5565i;
                String str4 = i0.f5136a;
                this.f5562f.d(j16 / ((long) wVar6.f315e), 1, i32, 0, null);
                this.m = 0;
                this.f5568n = j10;
            }
            int length2 = uVar8.f5182a.length - uVar8.f5184c;
            if (uVar8.a() < 16 && length2 < 16) {
                int iA = uVar8.a();
                byte[] bArr6 = uVar8.f5182a;
                System.arraycopy(bArr6, uVar8.f5183b, bArr6, 0, iA);
                uVar8.N(0);
                uVar8.M(iA);
            }
        }
        return 0;
    }

    @Override
    public final boolean e(r rVar) {
        v0 v0VarH = new i(4).H(rVar, o8.i.f11710g, 0);
        if (v0VarH != null) {
            int length = v0VarH.f1660a.length;
        }
        u uVar = new u(4);
        ((m) rVar).i(uVar.f5182a, 0, 4, false);
        return uVar.C() == 1716281667;
    }

    @Override
    public final void release() {
    }
}
