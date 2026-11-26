package t8;

import a8.b0;
import a8.l0;
import a8.p;
import a8.q;
import a8.r;
import a8.s;
import a8.y;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.internal.measurement.z3;
import e7.i0;
import e7.u;
import eh.t;
import java.io.EOFException;
import java.math.RoundingMode;
import me.i;
import o8.m;
import o8.o;

public final class d implements q {

    public final p f14390e;

    public s f14391f;

    public l0 f14392g;

    public l0 f14393h;

    public int f14394i;

    public v0 f14395j;
    public long l;
    public long m;

    public long f14397n;

    public int f14398o;

    public f f14399p;

    public boolean f14400q;

    public boolean f14401r;

    public long f14402s;

    public final u f14386a = new u(10);

    public final b0 f14387b = new b0();

    public final y f14388c = new y();

    public long f14396k = -9223372036854775807L;

    public final i f14389d = new i(4);

    public d() {
        p pVar = new p();
        this.f14390e = pVar;
        this.f14393h = pVar;
        this.f14397n = -1L;
    }

    @Override
    public final void a(s sVar) {
        this.f14391f = sVar;
        l0 l0VarW = sVar.w(0, 1);
        this.f14392g = l0VarW;
        this.f14393h = l0VarW;
        this.f14391f.q();
    }

    @Override
    public final void b(long j9, long j10) {
        this.f14394i = 0;
        this.f14396k = -9223372036854775807L;
        this.l = 0L;
        this.f14398o = 0;
        this.f14397n = -1L;
        this.f14402s = j10;
        if (this.f14399p instanceof b) {
            throw null;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws Throwable {
        b0 b0Var;
        Throwable th2;
        int i10;
        long j9;
        f fVar;
        u uVar2;
        u uVar3;
        boolean z10;
        long j10;
        long position;
        long j11;
        ?? r4;
        int iA;
        int i11;
        int iM;
        u uVar4;
        int i12;
        long j12;
        int iM2;
        y yVar;
        u uVar5;
        b0 b0Var2;
        int iM3;
        int iE;
        long jC;
        long[] jArr;
        int i13;
        int i14;
        long j13;
        int i15;
        int i16;
        y yVar2;
        long position2;
        int i17;
        long length;
        long jO;
        long j14;
        f aVar;
        long jO2;
        long[] jArr2;
        int i18;
        v0 v0Var;
        long position3;
        u0[] u0VarArr;
        int length2;
        int i19;
        u0 u0Var;
        m mVar;
        int[] iArr;
        u0[] u0VarArr2;
        int length3;
        int i20;
        u0 u0Var2;
        o oVar;
        char c10;
        long jH;
        int length4;
        long[] jArr3;
        long[] jArr4;
        int i21;
        b0 b0Var3;
        c cVar;
        u0 u0Var3;
        u0 u0Var4;
        boolean z11;
        f aVar2;
        boolean z12;
        androidx.media3.common.s sVar;
        long length5;
        long position4;
        long j15;
        long jMax;
        int iM4;
        y yVar3;
        long jO3;
        int iH;
        int iH2;
        int iH3;
        long j16;
        long[] jArr5;
        long[] jArr6;
        int i22;
        b0 b0Var4;
        int iA2;
        this.f14392g.getClass();
        String str = i0.f5136a;
        int i23 = this.f14394i;
        int i24 = 0;
        b0 b0Var5 = this.f14387b;
        if (i23 == 0) {
            try {
                h(rVar, false);
                fVar = this.f14399p;
                uVar2 = this.f14386a;
                if (fVar == null) {
                    uVar4 = new u(b0Var5.f223b);
                    j9 = 1000000;
                    rVar.a(0, b0Var5.f223b, uVar4.f5182a);
                    if ((b0Var5.f222a & 1) != 0) {
                        if (b0Var5.f225d != 1) {
                            i12 = 36;
                        } else {
                            i12 = 21;
                        }
                    } else if (b0Var5.f225d != 1) {
                        i12 = 21;
                    } else {
                        i12 = 13;
                    }
                    th2 = null;
                    j12 = 0;
                    j10 = -9223372036854775807L;
                    if (uVar4.f5184c >= i12 + 4) {
                        uVar4.N(i12);
                        iM2 = uVar4.m();
                        if (iM2 != 1483304551 && iM2 != 1231971951) {
                            if (uVar4.f5184c >= 40) {
                                uVar4.N(36);
                                if (uVar4.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (uVar4.f5184c >= 40) {
                        uVar4.N(36);
                        if (uVar4.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    yVar = this.f14388c;
                    if (iM2 == 1231971951) {
                        uVar5 = uVar2;
                        b0Var2 = b0Var5;
                        iM3 = uVar4.m();
                        if ((iM3 & 1) != 0) {
                            iE = uVar4.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = uVar4.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            for (i18 = 0; i18 < 100; i18++) {
                                jArr2[i18] = uVar4.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            uVar4.O(4);
                        }
                        if (uVar4.a() >= 24) {
                            uVar4.O(21);
                            int iD = uVar4.D();
                            i14 = (16773120 & iD) >> 12;
                            i13 = iD & 4095;
                        } else {
                            i13 = -1;
                            i14 = -1;
                        }
                        j13 = iE;
                        i15 = b0Var2.f223b;
                        int i25 = b0Var2.f224c;
                        i16 = b0Var2.f226e;
                        int i26 = b0Var2.f227f;
                        yVar2 = yVar;
                        if ((yVar2.f324a != -1 || yVar2.f325b == -1) && i14 != -1 && i13 != -1) {
                            yVar2.f324a = i14;
                            yVar2.f325b = i13;
                        }
                        position2 = rVar.getPosition();
                        if (rVar.getLength() != -1 || jC == -1) {
                            i17 = i16;
                        } else {
                            i17 = i16;
                            long j17 = position2 + jC;
                            if (rVar.getLength() != j17) {
                                e7.a.h("Mp3Extractor", "Data size mismatch between stream (" + rVar.getLength() + ") and Xing frame (" + j17 + "), using Xing value.");
                            }
                        }
                        rVar.u(b0Var2.f223b);
                        if (iM2 == 1483304551) {
                            if (j13 != -1 || j13 == 0) {
                                jO2 = -9223372036854775807L;
                            } else {
                                jO2 = i0.O(i25, (j13 * ((long) i26)) - 1);
                            }
                            if (jO2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                aVar = new h(position2, i15, jO2, i17, jC, jArr);
                            }
                        } else {
                            length = rVar.getLength();
                            if (j13 != -1 || j13 == 0) {
                                jO = -9223372036854775807L;
                            } else {
                                jO = i0.O(i25, (((long) i26) * j13) - 1);
                            }
                            if (jO != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j14 = jC - ((long) i15);
                                } else if (length != -1) {
                                    j14 = (length - position2) - ((long) i15);
                                } else {
                                    aVar = null;
                                }
                                long j18 = length;
                                long j19 = j14;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                aVar = new a(j18, position2 + ((long) i15), bi.b.s(i0.Q(j19, 8000000L, jO, roundingMode)), bi.b.s(z3.w(j19, j13, roundingMode)), false);
                            } else {
                                aVar = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length5 = rVar.getLength();
                        position4 = rVar.getPosition();
                        uVar4.O(6);
                        int iM5 = uVar4.m();
                        uVar5 = uVar2;
                        j15 = position4 + ((long) b0Var5.f223b);
                        jMax = j15 + ((long) iM5);
                        iM4 = uVar4.m();
                        if (iM4 <= 0) {
                            yVar3 = yVar;
                            jO3 = i0.O(b0Var5.f224c, (((long) iM4) * ((long) b0Var5.f227f)) - 1);
                            iH = uVar4.H();
                            iH2 = uVar4.H();
                            iH3 = uVar4.H();
                            uVar4.O(2);
                            j16 = position4 + ((long) b0Var5.f223b);
                            jArr5 = new long[iH];
                            jArr6 = new long[iH];
                            i22 = 0;
                            while (true) {
                                if (i22 < iH) {
                                    long[] jArr7 = jArr5;
                                    b0 b0Var6 = b0Var5;
                                    if (length5 != -1 && length5 != jMax) {
                                        StringBuilder sbN = w.c.n("VBRI data size mismatch: ", length5, ", ");
                                        sbN.append(jMax);
                                        e7.a.m("VbriSeeker", sbN.toString());
                                    }
                                    if (jMax != j16) {
                                        StringBuilder sbN2 = w.c.n("VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                                        sbN2.append(j16);
                                        sbN2.append("\nSeeking will be inaccurate.");
                                        e7.a.m("VbriSeeker", sbN2.toString());
                                        jMax = Math.max(jMax, j16);
                                    }
                                    b0Var2 = b0Var6;
                                    aVar = new g(jArr7, jArr6, jO3, j15, jMax, b0Var2.f226e);
                                    break;
                                }
                                b0Var4 = b0Var5;
                                long[] jArr8 = jArr5;
                                jArr8[i22] = (((long) i22) * jO3) / ((long) iH);
                                jArr6[i22] = j16;
                                if (iH3 != 1) {
                                    iA2 = uVar4.A();
                                } else if (iH3 != 2) {
                                    iA2 = uVar4.H();
                                } else if (iH3 != 3) {
                                    iA2 = uVar4.D();
                                } else {
                                    if (iH3 != 4) {
                                        aVar = null;
                                        b0Var2 = b0Var4;
                                        break;
                                    }
                                    iA2 = uVar4.E();
                                }
                                j16 += ((long) iA2) * ((long) iH2);
                                i22++;
                                jArr5 = jArr8;
                                b0Var5 = b0Var4;
                            }
                        } else {
                            aVar = null;
                            yVar3 = yVar;
                            b0Var2 = b0Var5;
                        }
                        rVar.u(b0Var2.f223b);
                        yVar2 = yVar3;
                    } else if (iM2 != 1483304551) {
                        rVar.t();
                        aVar = null;
                        uVar5 = uVar2;
                        b0Var2 = b0Var5;
                        yVar2 = yVar;
                    } else {
                        uVar5 = uVar2;
                        b0Var2 = b0Var5;
                        iM3 = uVar4.m();
                        if ((iM3 & 1) != 0) {
                            iE = uVar4.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = uVar4.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i18 < 100) {
                                jArr2[i18] = uVar4.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            uVar4.O(4);
                        }
                        if (uVar4.a() >= 24) {
                            uVar4.O(21);
                            int iD2 = uVar4.D();
                            i14 = (16773120 & iD2) >> 12;
                            i13 = iD2 & 4095;
                        } else {
                            i13 = -1;
                            i14 = -1;
                        }
                        j13 = iE;
                        i15 = b0Var2.f223b;
                        int i27 = b0Var2.f224c;
                        i16 = b0Var2.f226e;
                        int i28 = b0Var2.f227f;
                        yVar2 = yVar;
                        if (yVar2.f324a != -1) {
                            yVar2.f324a = i14;
                            yVar2.f325b = i13;
                        } else {
                            yVar2.f324a = i14;
                            yVar2.f325b = i13;
                        }
                        position2 = rVar.getPosition();
                        if (rVar.getLength() != -1) {
                            i17 = i16;
                        } else {
                            i17 = i16;
                        }
                        rVar.u(b0Var2.f223b);
                        if (iM2 == 1483304551) {
                            if (j13 != -1) {
                                jO2 = -9223372036854775807L;
                            } else {
                                jO2 = -9223372036854775807L;
                            }
                            if (jO2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                aVar = new h(position2, i15, jO2, i17, jC, jArr);
                            }
                        } else {
                            length = rVar.getLength();
                            if (j13 != -1) {
                                jO = -9223372036854775807L;
                            } else {
                                jO = -9223372036854775807L;
                            }
                            if (jO != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j14 = jC - ((long) i15);
                                } else if (length != -1) {
                                    j14 = (length - position2) - ((long) i15);
                                } else {
                                    aVar = null;
                                }
                                long j110 = length;
                                long j111 = j14;
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                aVar = new a(j110, position2 + ((long) i15), bi.b.s(i0.Q(j111, 8000000L, jO, roundingMode2)), bi.b.s(z3.w(j111, j13, roundingMode2)), false);
                            } else {
                                aVar = null;
                            }
                        }
                    }
                    v0Var = this.f14395j;
                    position3 = rVar.getPosition();
                    if (v0Var == null) {
                        cVar = null;
                        b0Var3 = b0Var2;
                    } else {
                        u0VarArr = v0Var.f1660a;
                        length2 = u0VarArr.length;
                        i19 = 0;
                        while (true) {
                            if (i19 < length2) {
                                u0Var = null;
                                break;
                            }
                            u0Var4 = u0VarArr[i19];
                            if (m.class.isAssignableFrom(u0Var4.getClass())) {
                                u0Var = (u0) m.class.cast(u0Var4);
                                if (!t.A.apply(u0Var)) {
                                    u0Var = null;
                                }
                            } else {
                                u0Var = null;
                            }
                            if (u0Var != null) {
                                break;
                            }
                            i19++;
                        }
                        mVar = (m) u0Var;
                        if (mVar == null) {
                            cVar = null;
                            b0Var3 = b0Var2;
                        } else {
                            iArr = mVar.f11720e;
                            u0VarArr2 = v0Var.f1660a;
                            length3 = u0VarArr2.length;
                            i20 = 0;
                            while (true) {
                                if (i20 < length3) {
                                    u0Var2 = null;
                                    break;
                                }
                                u0Var3 = u0VarArr2[i20];
                                if (o.class.isAssignableFrom(u0Var3.getClass())) {
                                    u0Var2 = (u0) o.class.cast(u0Var3);
                                    if (!((o) u0Var2).f11712a.equals("TLEN")) {
                                        u0Var2 = null;
                                    }
                                } else {
                                    u0Var2 = null;
                                }
                                if (u0Var2 != null) {
                                    break;
                                }
                                i20++;
                            }
                            oVar = (o) u0Var2;
                            if (oVar == null) {
                                jH = -9223372036854775807L;
                                c10 = 0;
                            } else {
                                c10 = 0;
                                jH = i0.H(Long.parseLong((String) oVar.f11725c.get(0)));
                            }
                            length4 = iArr.length;
                            int i29 = length4 + 1;
                            jArr3 = new long[i29];
                            jArr4 = new long[i29];
                            jArr3[c10] = position3;
                            jArr4[c10] = 0;
                            i21 = 1;
                            while (i21 <= length4) {
                                int i30 = i21 - 1;
                                position3 += (long) (mVar.f11718c + iArr[i30]);
                                j12 += (long) (mVar.f11719d + mVar.f11721f[i30]);
                                jArr3[i21] = position3;
                                jArr4[i21] = j12;
                                i21++;
                                b0Var2 = b0Var2;
                            }
                            b0Var3 = b0Var2;
                            cVar = new c(jH, jArr3, jArr4);
                        }
                    }
                    if (this.f14400q) {
                        aVar2 = new e(-9223372036854775807L);
                        uVar3 = uVar5;
                        b0Var = b0Var3;
                        z12 = true;
                        i24 = 0;
                    } else {
                        j10 = -9223372036854775807L;
                        if (cVar != null) {
                            aVar = cVar;
                        } else if (aVar == null) {
                            aVar = null;
                        }
                        if (aVar == null) {
                            uVar3 = uVar5;
                            rVar.a(0, 4, uVar3.f5182a);
                            uVar3.N(0);
                            b0Var = b0Var3;
                            b0Var.a(uVar3.m());
                            z11 = true;
                            i24 = 0;
                            aVar2 = new a(rVar.getLength(), rVar.getPosition(), b0Var.f226e, b0Var.f223b, false);
                        } else {
                            uVar3 = uVar5;
                            b0Var = b0Var3;
                            z11 = true;
                            i24 = 0;
                            aVar2 = aVar;
                        }
                        aVar2.b();
                        aVar2.b();
                        this.f14392g.c(aVar2.f());
                        z12 = z11;
                    }
                    this.f14399p = aVar2;
                    this.f14391f.b(aVar2);
                    sVar = new androidx.media3.common.s();
                    sVar.l = x0.n("audio/mpeg");
                    sVar.m = x0.n((String) b0Var.f228g);
                    sVar.f1502n = 4096;
                    sVar.E = b0Var.f225d;
                    sVar.F = b0Var.f224c;
                    sVar.H = yVar2.f324a;
                    sVar.I = yVar2.f325b;
                    sVar.f1501k = this.f14395j;
                    if (this.f14399p.e() != -2147483647) {
                        sVar.f1498h = this.f14399p.e();
                    }
                    this.f14393h.f(new androidx.media3.common.t(sVar));
                    this.m = rVar.getPosition();
                    r4 = z12;
                } else {
                    uVar3 = uVar2;
                    z10 = true;
                    b0Var = b0Var5;
                    th2 = null;
                    j9 = 1000000;
                    j10 = -9223372036854775807L;
                    r4 = z10;
                    if (this.m != 0) {
                        position = rVar.getPosition();
                        j11 = this.m;
                        r4 = z10;
                        if (position < j11) {
                            rVar.u((int) (j11 - position));
                            r4 = z10;
                        }
                    }
                }
                if (this.f14398o == 0) {
                    rVar.t();
                    if (g(rVar)) {
                        i10 = -1;
                        i24 = -1;
                    } else {
                        uVar3.N(i24);
                        iM = uVar3.m();
                        if (((-128000) & iM) == (((long) this.f14394i) & (-128000)) || a8.b.i(iM) == -1) {
                            rVar.u(r4);
                            this.f14394i = i24;
                        } else {
                            b0Var.a(iM);
                            if (this.f14396k == j10) {
                                this.f14396k = this.f14399p.c(rVar.getPosition());
                            }
                            this.f14398o = b0Var.f223b;
                            this.f14397n = rVar.getPosition() + ((long) b0Var.f223b);
                            if (this.f14399p instanceof b) {
                                long j20 = ((this.l + ((long) b0Var.f227f)) * j9) / ((long) b0Var.f224c);
                                throw th2;
                            }
                            iA = this.f14393h.a(rVar, this.f14398o, r4);
                            if (iA == -1) {
                                i10 = -1;
                                i24 = -1;
                            } else {
                                i11 = this.f14398o - iA;
                                this.f14398o = i11;
                                if (i11 <= 0) {
                                    this.f14393h.d(((this.l * j9) / ((long) b0Var.f224c)) + this.f14396k, 1, b0Var.f223b, 0, null);
                                    this.l += (long) b0Var.f227f;
                                    this.f14398o = i24;
                                }
                            }
                        }
                        i10 = -1;
                    }
                } else {
                    iA = this.f14393h.a(rVar, this.f14398o, r4);
                    if (iA == -1) {
                        i10 = -1;
                        i24 = -1;
                    } else {
                        i11 = this.f14398o - iA;
                        this.f14398o = i11;
                        if (i11 <= 0) {
                            this.f14393h.d(((this.l * j9) / ((long) b0Var.f224c)) + this.f14396k, 1, b0Var.f223b, 0, null);
                            this.l += (long) b0Var.f227f;
                            this.f14398o = i24;
                        }
                        i10 = -1;
                    }
                }
            } catch (EOFException unused) {
                b0Var = b0Var5;
                th2 = null;
                i10 = -1;
                i24 = -1;
                j9 = 1000000;
            }
        } else {
            fVar = this.f14399p;
            uVar2 = this.f14386a;
            if (fVar == null) {
                uVar4 = new u(b0Var5.f223b);
                j9 = 1000000;
                rVar.a(0, b0Var5.f223b, uVar4.f5182a);
                if ((b0Var5.f222a & 1) != 0) {
                    if (b0Var5.f225d != 1) {
                        i12 = 36;
                    } else {
                        i12 = 21;
                    }
                } else if (b0Var5.f225d != 1) {
                    i12 = 21;
                } else {
                    i12 = 13;
                }
                th2 = null;
                j12 = 0;
                j10 = -9223372036854775807L;
                if (uVar4.f5184c >= i12 + 4) {
                    uVar4.N(i12);
                    iM2 = uVar4.m();
                    if (iM2 != 1483304551) {
                        if (uVar4.f5184c >= 40) {
                            uVar4.N(36);
                            if (uVar4.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (uVar4.f5184c >= 40) {
                    uVar4.N(36);
                    if (uVar4.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                yVar = this.f14388c;
                if (iM2 == 1231971951) {
                    uVar5 = uVar2;
                    b0Var2 = b0Var5;
                    iM3 = uVar4.m();
                    if ((iM3 & 1) != 0) {
                        iE = uVar4.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jC = uVar4.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i18 < 100) {
                            jArr2[i18] = uVar4.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        uVar4.O(4);
                    }
                    if (uVar4.a() >= 24) {
                        uVar4.O(21);
                        int iD3 = uVar4.D();
                        i14 = (16773120 & iD3) >> 12;
                        i13 = iD3 & 4095;
                    } else {
                        i13 = -1;
                        i14 = -1;
                    }
                    j13 = iE;
                    i15 = b0Var2.f223b;
                    int i210 = b0Var2.f224c;
                    i16 = b0Var2.f226e;
                    int i211 = b0Var2.f227f;
                    yVar2 = yVar;
                    if (yVar2.f324a != -1) {
                        yVar2.f324a = i14;
                        yVar2.f325b = i13;
                    } else {
                        yVar2.f324a = i14;
                        yVar2.f325b = i13;
                    }
                    position2 = rVar.getPosition();
                    if (rVar.getLength() != -1) {
                        i17 = i16;
                    } else {
                        i17 = i16;
                    }
                    rVar.u(b0Var2.f223b);
                    if (iM2 == 1483304551) {
                        if (j13 != -1) {
                            jO2 = -9223372036854775807L;
                        } else {
                            jO2 = -9223372036854775807L;
                        }
                        if (jO2 == -9223372036854775807L) {
                            aVar = null;
                        } else {
                            aVar = new h(position2, i15, jO2, i17, jC, jArr);
                        }
                    } else {
                        length = rVar.getLength();
                        if (j13 != -1) {
                            jO = -9223372036854775807L;
                        } else {
                            jO = -9223372036854775807L;
                        }
                        if (jO != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position2 + jC;
                                j14 = jC - ((long) i15);
                            } else if (length != -1) {
                                j14 = (length - position2) - ((long) i15);
                            } else {
                                aVar = null;
                            }
                            long j112 = length;
                            long j113 = j14;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            aVar = new a(j112, position2 + ((long) i15), bi.b.s(i0.Q(j113, 8000000L, jO, roundingMode3)), bi.b.s(z3.w(j113, j13, roundingMode3)), false);
                        } else {
                            aVar = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    length5 = rVar.getLength();
                    position4 = rVar.getPosition();
                    uVar4.O(6);
                    int iM6 = uVar4.m();
                    uVar5 = uVar2;
                    j15 = position4 + ((long) b0Var5.f223b);
                    jMax = j15 + ((long) iM6);
                    iM4 = uVar4.m();
                    if (iM4 <= 0) {
                        yVar3 = yVar;
                        jO3 = i0.O(b0Var5.f224c, (((long) iM4) * ((long) b0Var5.f227f)) - 1);
                        iH = uVar4.H();
                        iH2 = uVar4.H();
                        iH3 = uVar4.H();
                        uVar4.O(2);
                        j16 = position4 + ((long) b0Var5.f223b);
                        jArr5 = new long[iH];
                        jArr6 = new long[iH];
                        i22 = 0;
                        while (true) {
                            if (i22 < iH) {
                                long[] jArr9 = jArr5;
                                b0 b0Var7 = b0Var5;
                                if (length5 != -1) {
                                    StringBuilder sbN3 = w.c.n("VBRI data size mismatch: ", length5, ", ");
                                    sbN3.append(jMax);
                                    e7.a.m("VbriSeeker", sbN3.toString());
                                }
                                if (jMax != j16) {
                                    StringBuilder sbN4 = w.c.n("VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                                    sbN4.append(j16);
                                    sbN4.append("\nSeeking will be inaccurate.");
                                    e7.a.m("VbriSeeker", sbN4.toString());
                                    jMax = Math.max(jMax, j16);
                                }
                                b0Var2 = b0Var7;
                                aVar = new g(jArr9, jArr6, jO3, j15, jMax, b0Var2.f226e);
                                break;
                            }
                            b0Var4 = b0Var5;
                            long[] jArr10 = jArr5;
                            jArr10[i22] = (((long) i22) * jO3) / ((long) iH);
                            jArr6[i22] = j16;
                            if (iH3 != 1) {
                                iA2 = uVar4.A();
                            } else if (iH3 != 2) {
                                iA2 = uVar4.H();
                            } else if (iH3 != 3) {
                                iA2 = uVar4.D();
                            } else {
                                if (iH3 != 4) {
                                    aVar = null;
                                    b0Var2 = b0Var4;
                                    break;
                                }
                                iA2 = uVar4.E();
                            }
                            j16 += ((long) iA2) * ((long) iH2);
                            i22++;
                            jArr5 = jArr10;
                            b0Var5 = b0Var4;
                        }
                    } else {
                        aVar = null;
                        yVar3 = yVar;
                        b0Var2 = b0Var5;
                    }
                    rVar.u(b0Var2.f223b);
                    yVar2 = yVar3;
                } else if (iM2 != 1483304551) {
                    rVar.t();
                    aVar = null;
                    uVar5 = uVar2;
                    b0Var2 = b0Var5;
                    yVar2 = yVar;
                } else {
                    uVar5 = uVar2;
                    b0Var2 = b0Var5;
                    iM3 = uVar4.m();
                    if ((iM3 & 1) != 0) {
                        iE = uVar4.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jC = uVar4.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i18 < 100) {
                            jArr2[i18] = uVar4.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        uVar4.O(4);
                    }
                    if (uVar4.a() >= 24) {
                        uVar4.O(21);
                        int iD4 = uVar4.D();
                        i14 = (16773120 & iD4) >> 12;
                        i13 = iD4 & 4095;
                    } else {
                        i13 = -1;
                        i14 = -1;
                    }
                    j13 = iE;
                    i15 = b0Var2.f223b;
                    int i212 = b0Var2.f224c;
                    i16 = b0Var2.f226e;
                    int i213 = b0Var2.f227f;
                    yVar2 = yVar;
                    if (yVar2.f324a != -1) {
                        yVar2.f324a = i14;
                        yVar2.f325b = i13;
                    } else {
                        yVar2.f324a = i14;
                        yVar2.f325b = i13;
                    }
                    position2 = rVar.getPosition();
                    if (rVar.getLength() != -1) {
                        i17 = i16;
                    } else {
                        i17 = i16;
                    }
                    rVar.u(b0Var2.f223b);
                    if (iM2 == 1483304551) {
                        if (j13 != -1) {
                            jO2 = -9223372036854775807L;
                        } else {
                            jO2 = -9223372036854775807L;
                        }
                        if (jO2 == -9223372036854775807L) {
                            aVar = null;
                        } else {
                            aVar = new h(position2, i15, jO2, i17, jC, jArr);
                        }
                    } else {
                        length = rVar.getLength();
                        if (j13 != -1) {
                            jO = -9223372036854775807L;
                        } else {
                            jO = -9223372036854775807L;
                        }
                        if (jO != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position2 + jC;
                                j14 = jC - ((long) i15);
                            } else if (length != -1) {
                                j14 = (length - position2) - ((long) i15);
                            } else {
                                aVar = null;
                            }
                            long j114 = length;
                            long j115 = j14;
                            RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                            aVar = new a(j114, position2 + ((long) i15), bi.b.s(i0.Q(j115, 8000000L, jO, roundingMode4)), bi.b.s(z3.w(j115, j13, roundingMode4)), false);
                        } else {
                            aVar = null;
                        }
                    }
                }
                v0Var = this.f14395j;
                position3 = rVar.getPosition();
                if (v0Var == null) {
                    cVar = null;
                    b0Var3 = b0Var2;
                } else {
                    u0VarArr = v0Var.f1660a;
                    length2 = u0VarArr.length;
                    i19 = 0;
                    while (true) {
                        if (i19 < length2) {
                            u0Var = null;
                            break;
                        }
                        u0Var4 = u0VarArr[i19];
                        if (m.class.isAssignableFrom(u0Var4.getClass())) {
                            u0Var = (u0) m.class.cast(u0Var4);
                            if (!t.A.apply(u0Var)) {
                                u0Var = null;
                            }
                        } else {
                            u0Var = null;
                        }
                        if (u0Var != null) {
                            break;
                            break;
                        }
                        i19++;
                    }
                    mVar = (m) u0Var;
                    if (mVar == null) {
                        cVar = null;
                        b0Var3 = b0Var2;
                    } else {
                        iArr = mVar.f11720e;
                        u0VarArr2 = v0Var.f1660a;
                        length3 = u0VarArr2.length;
                        i20 = 0;
                        while (true) {
                            if (i20 < length3) {
                                u0Var2 = null;
                                break;
                            }
                            u0Var3 = u0VarArr2[i20];
                            if (o.class.isAssignableFrom(u0Var3.getClass())) {
                                u0Var2 = (u0) o.class.cast(u0Var3);
                                if (!((o) u0Var2).f11712a.equals("TLEN")) {
                                    u0Var2 = null;
                                }
                            } else {
                                u0Var2 = null;
                            }
                            if (u0Var2 != null) {
                                break;
                                break;
                            }
                            i20++;
                        }
                        oVar = (o) u0Var2;
                        if (oVar == null) {
                            jH = -9223372036854775807L;
                            c10 = 0;
                        } else {
                            c10 = 0;
                            jH = i0.H(Long.parseLong((String) oVar.f11725c.get(0)));
                        }
                        length4 = iArr.length;
                        int i214 = length4 + 1;
                        jArr3 = new long[i214];
                        jArr4 = new long[i214];
                        jArr3[c10] = position3;
                        jArr4[c10] = 0;
                        i21 = 1;
                        while (i21 <= length4) {
                            int i31 = i21 - 1;
                            position3 += (long) (mVar.f11718c + iArr[i31]);
                            j12 += (long) (mVar.f11719d + mVar.f11721f[i31]);
                            jArr3[i21] = position3;
                            jArr4[i21] = j12;
                            i21++;
                            b0Var2 = b0Var2;
                        }
                        b0Var3 = b0Var2;
                        cVar = new c(jH, jArr3, jArr4);
                    }
                }
                if (this.f14400q) {
                    aVar2 = new e(-9223372036854775807L);
                    uVar3 = uVar5;
                    b0Var = b0Var3;
                    z12 = true;
                    i24 = 0;
                } else {
                    j10 = -9223372036854775807L;
                    if (cVar != null) {
                        aVar = cVar;
                    } else if (aVar == null) {
                        aVar = null;
                    }
                    if (aVar == null) {
                        uVar3 = uVar5;
                        rVar.a(0, 4, uVar3.f5182a);
                        uVar3.N(0);
                        b0Var = b0Var3;
                        b0Var.a(uVar3.m());
                        z11 = true;
                        i24 = 0;
                        aVar2 = new a(rVar.getLength(), rVar.getPosition(), b0Var.f226e, b0Var.f223b, false);
                    } else {
                        uVar3 = uVar5;
                        b0Var = b0Var3;
                        z11 = true;
                        i24 = 0;
                        aVar2 = aVar;
                    }
                    aVar2.b();
                    aVar2.b();
                    this.f14392g.c(aVar2.f());
                    z12 = z11;
                }
                this.f14399p = aVar2;
                this.f14391f.b(aVar2);
                sVar = new androidx.media3.common.s();
                sVar.l = x0.n("audio/mpeg");
                sVar.m = x0.n((String) b0Var.f228g);
                sVar.f1502n = 4096;
                sVar.E = b0Var.f225d;
                sVar.F = b0Var.f224c;
                sVar.H = yVar2.f324a;
                sVar.I = yVar2.f325b;
                sVar.f1501k = this.f14395j;
                if (this.f14399p.e() != -2147483647) {
                    sVar.f1498h = this.f14399p.e();
                }
                this.f14393h.f(new androidx.media3.common.t(sVar));
                this.m = rVar.getPosition();
                r4 = z12;
            } else {
                uVar3 = uVar2;
                z10 = true;
                b0Var = b0Var5;
                th2 = null;
                j9 = 1000000;
                j10 = -9223372036854775807L;
                r4 = z10;
                if (this.m != 0) {
                    position = rVar.getPosition();
                    j11 = this.m;
                    r4 = z10;
                    if (position < j11) {
                        rVar.u((int) (j11 - position));
                        r4 = z10;
                    }
                }
            }
            if (this.f14398o == 0) {
                rVar.t();
                if (g(rVar)) {
                    i10 = -1;
                    i24 = -1;
                } else {
                    uVar3.N(i24);
                    iM = uVar3.m();
                    if (((-128000) & iM) == (((long) this.f14394i) & (-128000))) {
                    }
                    rVar.u(r4);
                    this.f14394i = i24;
                    i10 = -1;
                }
            } else {
                iA = this.f14393h.a(rVar, this.f14398o, r4);
                if (iA == -1) {
                    i10 = -1;
                    i24 = -1;
                } else {
                    i11 = this.f14398o - iA;
                    this.f14398o = i11;
                    if (i11 <= 0) {
                        this.f14393h.d(((this.l * j9) / ((long) b0Var.f224c)) + this.f14396k, 1, b0Var.f223b, 0, null);
                        this.l += (long) b0Var.f227f;
                        this.f14398o = i24;
                    }
                    i10 = -1;
                }
            }
        }
        if (i24 == i10) {
            f fVar2 = this.f14399p;
            if (fVar2 instanceof b) {
                if (fVar2.f() != ((this.l * j9) / ((long) b0Var.f224c)) + this.f14396k) {
                    ((b) this.f14399p).getClass();
                    throw th2;
                }
            }
        }
        return i24;
    }

    @Override
    public final boolean e(r rVar) {
        return h(rVar, true);
    }

    public final void f() {
        f fVar = this.f14399p;
        if ((fVar instanceof a) && ((a) fVar).b()) {
            long j9 = this.f14397n;
            if (j9 == -1 || j9 == this.f14399p.a()) {
                return;
            }
            a aVar = (a) this.f14399p;
            this.f14399p = new a(this.f14397n, aVar.f14379h, aVar.f14380i, aVar.f14381j, aVar.f14382k);
            s sVar = this.f14391f;
            sVar.getClass();
            sVar.b(this.f14399p);
            l0 l0Var = this.f14392g;
            l0Var.getClass();
            l0Var.c(this.f14399p.f());
        }
    }

    public final boolean g(r rVar) {
        f fVar = this.f14399p;
        if (fVar != null) {
            long jA = fVar.a();
            if (jA == -1 || rVar.j() <= jA - 4) {
            }
            return true;
        }
        try {
            return !rVar.i(this.f14386a.f5182a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean h(r rVar, boolean z10) throws EOFException {
        int iJ;
        int i10;
        int i11;
        rVar.t();
        if (rVar.getPosition() == 0) {
            v0 v0VarH = this.f14389d.H(rVar, null, 131072);
            this.f14395j = v0VarH;
            if (v0VarH != null) {
                this.f14388c.b(v0VarH);
            }
            iJ = (int) rVar.j();
            if (!z10) {
                rVar.u(iJ);
            }
            i10 = 0;
        } else {
            iJ = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (g(rVar)) {
                if (i12 > 0) {
                    break;
                }
                f();
                throw new EOFException();
            }
            u uVar = this.f14386a;
            uVar.N(0);
            int iM = uVar.m();
            if ((i10 == 0 || ((-128000) & iM) == (((long) i10) & (-128000))) && (i11 = a8.b.i(iM)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f14387b.a(iM);
                    i10 = iM;
                }
                rVar.m(i11 - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == 131072) {
                    if (z10) {
                        return false;
                    }
                    f();
                    throw new EOFException();
                }
                if (z10) {
                    rVar.t();
                    rVar.m(iJ + i14);
                } else {
                    rVar.u(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            rVar.u(iJ + i13);
        } else {
            rVar.t();
        }
        this.f14394i = i10;
        return true;
    }

    @Override
    public final void release() {
    }
}
