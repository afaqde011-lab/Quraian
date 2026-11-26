package g8;

import a8.a0;
import a8.e;
import a8.l0;
import a8.m;
import a8.n0;
import a8.p;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import e7.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oi.k;

public final class b implements q {

    public final u f6228a = new u(4);

    public final u f6229b = new u(9);

    public final u f6230c = new u(11);

    public final u f6231d = new u();

    public final c f6232e;

    public s f6233f;

    public int f6234g;

    public boolean f6235h;

    public long f6236i;

    public int f6237j;

    public int f6238k;
    public int l;
    public long m;

    public boolean f6239n;

    public a f6240o;

    public d f6241p;

    public b() {
        c cVar = new c(new p(), 1);
        cVar.C = -9223372036854775807L;
        cVar.D = new long[0];
        cVar.E = new long[0];
        this.f6232e = cVar;
        this.f6234g = 1;
    }

    @Override
    public final void a(s sVar) {
        this.f6233f = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        if (j9 == 0) {
            this.f6234g = 1;
            this.f6235h = false;
        } else {
            this.f6234g = 3;
        }
        this.f6237j = 0;
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        long j9;
        long j10;
        int i10;
        int i11;
        long j11;
        boolean z10;
        boolean z11;
        long j12;
        boolean z12;
        this.f6233f.getClass();
        while (true) {
            int i12 = this.f6234g;
            if (i12 == 1) {
                u uVar2 = this.f6229b;
                if (!rVar.d(uVar2.f5182a, 0, 9, true)) {
                    return -1;
                }
                uVar2.N(0);
                uVar2.O(4);
                int iA = uVar2.A();
                boolean z13 = (iA & 4) != 0;
                boolean z14 = (iA & 1) != 0;
                if (z13 && this.f6240o == null) {
                    this.f6240o = new a(this.f6233f.w(8, 1), 1);
                }
                if (z14 && this.f6241p == null) {
                    this.f6241p = new d(this.f6233f.w(9, 2));
                }
                this.f6233f.q();
                this.f6237j = uVar2.m() - 5;
                this.f6234g = 2;
            } else if (i12 == 2) {
                rVar.u(this.f6237j);
                this.f6237j = 0;
                this.f6234g = 3;
            } else if (i12 == 3) {
                u uVar3 = this.f6230c;
                if (!rVar.d(uVar3.f5182a, 0, 11, true)) {
                    return -1;
                }
                uVar3.N(0);
                this.f6238k = uVar3.A();
                this.l = uVar3.D();
                this.m = uVar3.D();
                this.m = (((long) (uVar3.A() << 24)) | this.m) * 1000;
                uVar3.O(3);
                this.f6234g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.f6235h;
                c cVar = this.f6232e;
                if (z15) {
                    j9 = this.f6236i + this.m;
                } else {
                    if (cVar.C == -9223372036854775807L) {
                        j10 = 0;
                    } else {
                        j9 = this.m;
                    }
                    i10 = this.f6238k;
                    if (i10 == 8 || this.f6240o == null) {
                        i11 = 0;
                        if (i10 == 9 || this.f6241p == null) {
                            j11 = -9223372036854775807L;
                            if (i10 == 18 || this.f6239n) {
                                rVar.u(this.l);
                                z10 = false;
                                z11 = false;
                            } else {
                                u uVarF = f(rVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (uVarF.A() == 2 && "onMetaData".equals(c.Y0(uVarF)) && uVarF.a() != 0 && uVarF.A() == 8) {
                                    HashMap mapX0 = c.X0(uVarF);
                                    Object obj = mapX0.get("duration");
                                    double d3 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.C = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapX0.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.D = new long[size];
                                            cVar.E = new long[size];
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj5 = list.get(i13);
                                                Object obj6 = list2.get(i13);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.D = new long[0];
                                                    cVar.E = new long[0];
                                                    break;
                                                }
                                                double d5 = d3;
                                                cVar.D[i13] = (long) (((Double) obj6).doubleValue() * d5);
                                                cVar.E[i13] = ((Double) obj5).longValue();
                                                i13++;
                                                d3 = d5;
                                            }
                                        }
                                    }
                                }
                                long j13 = cVar.C;
                                if (j13 != -9223372036854775807L) {
                                    this.f6233f.b(new a0(j13, cVar.E, cVar.D));
                                    this.f6239n = true;
                                }
                            }
                        } else {
                            if (!this.f6239n) {
                                this.f6233f.b(new v(-9223372036854775807L));
                                this.f6239n = true;
                            }
                            d dVar = this.f6241p;
                            u uVarF2 = f(rVar);
                            dVar.getClass();
                            int iA2 = uVarF2.A();
                            int i14 = (iA2 >> 4) & 15;
                            int i15 = iA2 & 15;
                            if (i15 != 7) {
                                final String strF = g4.c.f(i15, "Video format not supported: ");
                                throw new ParserException(strF) {
                                };
                            }
                            dVar.H = i14;
                            if (i14 != 5) {
                                u uVar4 = dVar.C;
                                l0 l0Var = (l0) dVar.B;
                                u uVar5 = dVar.D;
                                int iA3 = uVarF2.A();
                                uVarF2.f(3);
                                byte[] bArr = uVarF2.f5182a;
                                j11 = -9223372036854775807L;
                                int i16 = uVarF2.f5183b;
                                int i17 = i16 + 1;
                                uVarF2.f5183b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                int i19 = i16 + 2;
                                uVarF2.f5183b = i19;
                                int i20 = ((bArr[i17] & 255) << 8) | i18;
                                uVarF2.f5183b = i16 + 3;
                                long j14 = (((long) ((bArr[i19] & 255) | i20)) * 1000) + j10;
                                boolean z16 = false;
                                if (iA3 == 0 && !dVar.F) {
                                    byte[] bArr2 = new byte[uVarF2.a()];
                                    u uVar6 = new u(bArr2);
                                    uVarF2.k(0, uVarF2.a(), bArr2);
                                    e eVarA = e.a(uVar6);
                                    dVar.E = eVarA.f242b;
                                    androidx.media3.common.s sVar = new androidx.media3.common.s();
                                    sVar.l = x0.n("video/x-flv");
                                    sVar.m = x0.n("video/avc");
                                    sVar.f1500j = eVarA.l;
                                    sVar.f1508t = eVarA.f243c;
                                    sVar.f1509u = eVarA.f244d;
                                    sVar.f1514z = eVarA.f251k;
                                    sVar.f1504p = eVarA.f241a;
                                    k.w(sVar, l0Var);
                                    dVar.F = true;
                                } else if (iA3 == 1 && dVar.F) {
                                    int i21 = dVar.H == 1 ? 1 : 0;
                                    if (dVar.G || i21 != 0) {
                                        byte[] bArr3 = uVar5.f5182a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i22 = 4 - dVar.E;
                                        int i23 = 0;
                                        while (uVarF2.a() > 0) {
                                            uVarF2.k(i22, dVar.E, uVar5.f5182a);
                                            uVar5.N(0);
                                            int iE = uVar5.E();
                                            uVar4.N(0);
                                            l0Var.g(4, uVar4);
                                            l0Var.g(iE, uVarF2);
                                            i23 = i23 + 4 + iE;
                                        }
                                        ((l0) dVar.B).d(j14, i21, i23, 0, null);
                                        dVar.G = true;
                                        z16 = true;
                                    }
                                }
                                if (z16) {
                                    z10 = true;
                                }
                                z11 = true;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        z10 = false;
                        z11 = true;
                    } else {
                        if (!this.f6239n) {
                            this.f6233f.b(new v(-9223372036854775807L));
                            this.f6239n = true;
                        }
                        a aVar = this.f6240o;
                        u uVarF3 = f(rVar);
                        l0 l0Var2 = (l0) aVar.B;
                        if (aVar.C) {
                            i11 = 0;
                            uVarF3.O(1);
                        } else {
                            int iA4 = uVarF3.A();
                            int i24 = (iA4 >> 4) & 15;
                            aVar.E = i24;
                            i11 = 0;
                            if (i24 == 2) {
                                int i25 = a.F[(iA4 >> 2) & 3];
                                androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                                sVar2.l = x0.n("video/x-flv");
                                sVar2.m = x0.n("audio/mpeg");
                                sVar2.E = 1;
                                sVar2.F = i25;
                                k.w(sVar2, l0Var2);
                                aVar.D = true;
                            } else if (i24 == 7 || i24 == 8) {
                                String str = i24 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                                sVar3.l = x0.n("video/x-flv");
                                sVar3.m = x0.n(str);
                                sVar3.E = 1;
                                sVar3.F = 8000;
                                k.w(sVar3, l0Var2);
                                aVar.D = true;
                            } else if (i24 != 10) {
                                final String str2 = "Audio format not supported: " + aVar.E;
                                throw new ParserException(str2) {
                                };
                            }
                            aVar.C = true;
                        }
                        l0 l0Var3 = (l0) aVar.B;
                        if (aVar.E == 2) {
                            int iA5 = uVarF3.a();
                            l0Var3.g(iA5, uVarF3);
                            ((l0) aVar.B).d(j10, 1, iA5, 0, null);
                        } else {
                            int iA6 = uVarF3.A();
                            z12 = false;
                            if (iA6 == 0 && !aVar.D) {
                                int iA7 = uVarF3.a();
                                byte[] bArr4 = new byte[iA7];
                                uVarF3.k(0, iA7, bArr4);
                                a8.a aVarP = a8.b.p(new n0(iA7, bArr4), false);
                                androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                                sVar4.l = x0.n("video/x-flv");
                                sVar4.m = x0.n("audio/mp4a-latm");
                                sVar4.f1500j = aVarP.f193a;
                                sVar4.E = aVarP.f195c;
                                sVar4.F = aVarP.f194b;
                                sVar4.f1504p = Collections.singletonList(bArr4);
                                k.w(sVar4, l0Var3);
                                aVar.D = true;
                            } else if (aVar.E != 10 || iA6 == 1) {
                                int iA8 = uVarF3.a();
                                l0Var3.g(iA8, uVarF3);
                                ((l0) aVar.B).d(j10, 1, iA8, 0, null);
                            }
                            z11 = true;
                            j11 = -9223372036854775807L;
                            z10 = z12;
                        }
                        z12 = true;
                        z11 = true;
                        j11 = -9223372036854775807L;
                        z10 = z12;
                    }
                    if (!this.f6235h && z10) {
                        this.f6235h = true;
                        if (cVar.C == j11) {
                            j12 = -this.m;
                        } else {
                            j12 = 0;
                        }
                        this.f6236i = j12;
                    }
                    this.f6237j = 4;
                    this.f6234g = 2;
                    if (z11) {
                        return i11;
                    }
                }
                j10 = j9;
                i10 = this.f6238k;
                if (i10 == 8) {
                    i11 = 0;
                    if (i10 == 9) {
                        j11 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        rVar.u(this.l);
                        z10 = false;
                        z11 = false;
                    } else {
                        j11 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        rVar.u(this.l);
                        z10 = false;
                        z11 = false;
                    }
                } else {
                    i11 = 0;
                    if (i10 == 9) {
                        j11 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        rVar.u(this.l);
                        z10 = false;
                        z11 = false;
                    } else {
                        j11 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        rVar.u(this.l);
                        z10 = false;
                        z11 = false;
                    }
                }
                if (!this.f6235h) {
                    this.f6235h = true;
                    if (cVar.C == j11) {
                        j12 = -this.m;
                    } else {
                        j12 = 0;
                    }
                    this.f6236i = j12;
                }
                this.f6237j = 4;
                this.f6234g = 2;
                if (z11) {
                    return i11;
                }
            }
        }
    }

    @Override
    public final boolean e(r rVar) {
        u uVar = this.f6228a;
        m mVar = (m) rVar;
        mVar.i(uVar.f5182a, 0, 3, false);
        uVar.N(0);
        if (uVar.D() == 4607062) {
            mVar.i(uVar.f5182a, 0, 2, false);
            uVar.N(0);
            if ((uVar.H() & 250) == 0) {
                mVar.i(uVar.f5182a, 0, 4, false);
                uVar.N(0);
                int iM = uVar.m();
                mVar.F = 0;
                mVar.b(iM, false);
                mVar.i(uVar.f5182a, 0, 4, false);
                uVar.N(0);
                if (uVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final u f(r rVar) {
        int i10 = this.l;
        u uVar = this.f6231d;
        byte[] bArr = uVar.f5182a;
        if (i10 > bArr.length) {
            uVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            uVar.N(0);
        }
        uVar.M(this.l);
        rVar.readFully(uVar.f5182a, 0, this.l);
        return uVar;
    }

    @Override
    public final void release() {
    }
}
