package h9;

import a8.l0;
import a8.n0;
import android.util.SparseArray;
import androidx.media3.common.x0;
import b3.i2;
import e7.i0;
import g1.c3;
import java.util.ArrayList;
import java.util.Arrays;

public final class q implements i {

    public final d0 f6828a;

    public final boolean f6829b;

    public final boolean f6830c;

    public long f6834g;

    public String f6836i;

    public l0 f6837j;

    public p f6838k;
    public boolean l;

    public boolean f6839n;

    public final boolean[] f6835h = new boolean[3];

    public final ba.s f6831d = new ba.s(7);

    public final ba.s f6832e = new ba.s(8);

    public final ba.s f6833f = new ba.s(6);
    public long m = -9223372036854775807L;

    public final e7.u f6840o = new e7.u();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.f6828a = d0Var;
        this.f6829b = z10;
        this.f6830c = z11;
    }

    @Override
    public final void a() {
        this.f6834g = 0L;
        this.f6839n = false;
        this.m = -9223372036854775807L;
        f7.p.a(this.f6835h);
        this.f6831d.g();
        this.f6832e.g();
        this.f6833f.g();
        this.f6828a.f6689d.i(0);
        p pVar = this.f6838k;
        if (pVar != null) {
            pVar.f6821k = false;
            pVar.f6823o = false;
            o oVar = pVar.f6822n;
            oVar.f6798b = false;
            oVar.f6797a = false;
        }
    }

    @Override
    public final void b(e7.u uVar) {
        int i10;
        this.f6837j.getClass();
        String str = i0.f5136a;
        int i11 = uVar.f5183b;
        int i12 = uVar.f5184c;
        byte[] bArr = uVar.f5182a;
        this.f6834g += (long) uVar.a();
        this.f6837j.g(uVar.a(), uVar);
        while (true) {
            int iB = f7.p.b(bArr, i11, i12, this.f6835h);
            if (iB == i12) {
                this.g(i11, i12, bArr);
                return;
            }
            int i13 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i10 = 3;
            } else {
                iB--;
                i10 = 4;
            }
            int i14 = iB - i11;
            if (i14 > 0) {
                this.g(i11, iB, bArr);
            }
            int i15 = i12 - iB;
            long j9 = this.f6834g - ((long) i15);
            q qVar = this;
            qVar.f(j9, i15, i14 < 0 ? -i14 : 0, this.m);
            qVar.h(i13, j9, qVar.m);
            i11 = iB + i10;
            this = qVar;
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6836i = (String) c3Var.E;
        c3Var.b();
        l0 l0VarW = sVar.w(c3Var.C, 2);
        this.f6837j = l0VarW;
        this.f6838k = new p(l0VarW, this.f6829b, this.f6830c);
        this.f6828a.b(sVar, c3Var);
    }

    @Override
    public final void d(boolean z10) {
        this.f6837j.getClass();
        String str = i0.f5136a;
        if (z10) {
            this.f6828a.f6689d.i(0);
            f(this.f6834g, 0, 0, this.m);
            h(9, this.f6834g, this.m);
            f(this.f6834g, 0, 0, this.m);
        }
    }

    @Override
    public final void e(int i10, long j9) {
        this.m = j9;
        this.f6839n = ((i10 & 2) != 0) | this.f6839n;
    }

    public final void f(long j9, int i10, int i11, long j10) {
        long j11;
        int i12;
        long j12;
        long j13;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        i2 i2Var = this.f6828a.f6689d;
        if (!this.l || this.f6838k.f6813c) {
            ba.s sVar = this.f6831d;
            sVar.e(i11);
            ba.s sVar2 = this.f6832e;
            sVar2.e(i11);
            if (this.l) {
                if (sVar.f2412d) {
                    f7.o oVarK = f7.p.k(3, sVar.f2413e, (byte[]) sVar.f2414f);
                    i2Var.w(oVarK.f5546s);
                    this.f6838k.f6814d.append(oVarK.f5533d, oVarK);
                    sVar.g();
                } else if (sVar2.f2412d) {
                    n0 n0Var = new n0((byte[]) sVar2.f2414f, 4, sVar2.f2413e);
                    int iM = n0Var.m();
                    int iM2 = n0Var.m();
                    n0Var.s();
                    this.f6838k.f6815e.append(iM, new f7.n(iM, iM2, n0Var.h()));
                    sVar2.g();
                }
            } else if (sVar.f2412d && sVar2.f2412d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) sVar.f2414f, sVar.f2413e));
                arrayList.add(Arrays.copyOf((byte[]) sVar2.f2414f, sVar2.f2413e));
                f7.o oVarK2 = f7.p.k(3, sVar.f2413e, (byte[]) sVar.f2414f);
                int i17 = oVarK2.f5546s;
                n0 n0Var2 = new n0((byte[]) sVar2.f2414f, 4, sVar2.f2413e);
                int iM3 = n0Var2.m();
                int iM4 = n0Var2.m();
                n0Var2.s();
                f7.n nVar = new f7.n(iM3, iM4, n0Var2.h());
                int i18 = oVarK2.f5530a;
                int i19 = oVarK2.f5531b;
                int i20 = oVarK2.f5532c;
                byte[] bArr = e7.e.f5121a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i20));
                l0 l0Var = this.f6837j;
                androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                sVar3.f1491a = this.f6836i;
                sVar3.l = x0.n("video/mp2t");
                sVar3.m = x0.n("video/avc");
                sVar3.f1500j = str;
                sVar3.f1508t = oVarK2.f5534e;
                sVar3.f1509u = oVarK2.f5535f;
                sVar3.C = new androidx.media3.common.i(oVarK2.f5543p, oVarK2.f5544q, oVarK2.f5545r, oVarK2.f5537h + 8, oVarK2.f5538i + 8, null);
                sVar3.f1514z = oVarK2.f5536g;
                sVar3.f1504p = arrayList;
                sVar3.f1503o = i17;
                oi.k.w(sVar3, l0Var);
                this.l = true;
                i2Var.w(i17);
                this.f6838k.f6814d.append(oVarK2.f5533d, oVarK2);
                this.f6838k.f6815e.append(iM3, nVar);
                sVar.g();
                sVar2.g();
            }
        }
        ba.s sVar4 = this.f6833f;
        if (sVar4.e(i11)) {
            int iN = f7.p.n(sVar4.f2413e, (byte[]) sVar4.f2414f);
            byte[] bArr2 = (byte[]) sVar4.f2414f;
            e7.u uVar = this.f6840o;
            uVar.L(iN, bArr2);
            uVar.N(4);
            i2Var.a(j10, uVar);
        }
        p pVar = this.f6838k;
        boolean z13 = this.l;
        if (pVar.f6819i == 9) {
            if (z13 && pVar.f6823o) {
                j11 = pVar.f6820j;
                i12 = i10 + ((int) (j9 - j11));
                j12 = pVar.f6825q;
                if (j12 != -9223372036854775807L) {
                    j13 = pVar.f6824p;
                    if (j11 != j13) {
                        pVar.f6811a.d(j12, pVar.f6826r ? 1 : 0, (int) (j11 - j13), i12, null);
                    }
                }
            }
            pVar.f6824p = pVar.f6820j;
            pVar.f6825q = pVar.l;
            pVar.f6826r = false;
            pVar.f6823o = true;
        } else if (pVar.f6813c) {
            o oVar = pVar.f6822n;
            o oVar2 = pVar.m;
            if (oVar.f6797a) {
                if (oVar2.f6797a) {
                    f7.o oVar3 = oVar.f6799c;
                    oVar3.getClass();
                    f7.o oVar4 = oVar2.f6799c;
                    oVar4.getClass();
                    int i21 = oVar4.m;
                    if (oVar.f6802f != oVar2.f6802f || oVar.f6803g != oVar2.f6803g || oVar.f6804h != oVar2.f6804h || ((oVar.f6805i && oVar2.f6805i && oVar.f6806j != oVar2.f6806j) || (((i14 = oVar.f6800d) != (i15 = oVar2.f6800d) && (i14 == 0 || i15 == 0)) || (((i16 = oVar3.m) == 0 && i21 == 0 && (oVar.m != oVar2.m || oVar.f6808n != oVar2.f6808n)) || ((i16 == 1 && i21 == 1 && (oVar.f6809o != oVar2.f6809o || oVar.f6810p != oVar2.f6810p)) || (z12 = oVar.f6807k) != oVar2.f6807k || (z12 && oVar.l != oVar2.l)))))) {
                        if (z13) {
                            j11 = pVar.f6820j;
                            i12 = i10 + ((int) (j9 - j11));
                            j12 = pVar.f6825q;
                            if (j12 != -9223372036854775807L) {
                                j13 = pVar.f6824p;
                                if (j11 != j13) {
                                    pVar.f6811a.d(j12, pVar.f6826r ? 1 : 0, (int) (j11 - j13), i12, null);
                                }
                            }
                        }
                        pVar.f6824p = pVar.f6820j;
                        pVar.f6825q = pVar.l;
                        pVar.f6826r = false;
                        pVar.f6823o = true;
                    }
                } else {
                    if (z13) {
                        j11 = pVar.f6820j;
                        i12 = i10 + ((int) (j9 - j11));
                        j12 = pVar.f6825q;
                        if (j12 != -9223372036854775807L) {
                            j13 = pVar.f6824p;
                            if (j11 != j13) {
                                pVar.f6811a.d(j12, pVar.f6826r ? 1 : 0, (int) (j11 - j13), i12, null);
                            }
                        }
                    }
                    pVar.f6824p = pVar.f6820j;
                    pVar.f6825q = pVar.l;
                    pVar.f6826r = false;
                    pVar.f6823o = true;
                }
            }
        }
        if (pVar.f6812b) {
            o oVar5 = pVar.f6822n;
            z10 = oVar5.f6798b && ((i13 = oVar5.f6801e) == 7 || i13 == 2);
        } else {
            z10 = pVar.f6827s;
        }
        boolean z14 = pVar.f6826r;
        int i22 = pVar.f6819i;
        if (i22 == 5) {
            z11 = true;
        } else if (z10) {
            z11 = true;
            if (i22 != 1) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        boolean z15 = z14 | z11;
        pVar.f6826r = z15;
        pVar.f6819i = 24;
        if (z15) {
            this.f6839n = false;
        }
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean zH;
        boolean zH2;
        boolean z10;
        boolean z11;
        int iM;
        int i12;
        int i13;
        int i14;
        int iN;
        int iN2;
        if (!this.l || this.f6838k.f6813c) {
            this.f6831d.a(i10, i11, bArr);
            this.f6832e.a(i10, i11, bArr);
        }
        this.f6833f.a(i10, i11, bArr);
        p pVar = this.f6838k;
        SparseArray sparseArray = pVar.f6815e;
        n0 n0Var = pVar.f6816f;
        if (pVar.f6821k) {
            int i15 = i11 - i10;
            byte[] bArr2 = pVar.f6817g;
            int length = bArr2.length;
            int i16 = pVar.f6818h + i15;
            if (length < i16) {
                pVar.f6817g = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i10, pVar.f6817g, pVar.f6818h, i15);
            int i17 = pVar.f6818h + i15;
            pVar.f6818h = i17;
            n0Var.f300b = pVar.f6817g;
            n0Var.f302d = 0;
            n0Var.f301c = i17;
            n0Var.f303e = 0;
            n0Var.a();
            if (n0Var.d(8)) {
                n0Var.s();
                int i18 = n0Var.i(2);
                n0Var.t(5);
                if (n0Var.e()) {
                    n0Var.m();
                    if (n0Var.e()) {
                        int iM2 = n0Var.m();
                        if (!pVar.f6813c) {
                            pVar.f6821k = false;
                            o oVar = pVar.f6822n;
                            oVar.f6801e = iM2;
                            oVar.f6798b = true;
                            return;
                        }
                        if (n0Var.e()) {
                            int iM3 = n0Var.m();
                            if (sparseArray.indexOfKey(iM3) < 0) {
                                pVar.f6821k = false;
                                return;
                            }
                            f7.n nVar = (f7.n) sparseArray.get(iM3);
                            SparseArray sparseArray2 = pVar.f6814d;
                            int i19 = nVar.f5528a;
                            boolean z12 = nVar.f5529b;
                            f7.o oVar2 = (f7.o) sparseArray2.get(i19);
                            boolean z13 = oVar2.f5539j;
                            int i20 = oVar2.f5541n;
                            int i21 = oVar2.l;
                            if (z13) {
                                if (!n0Var.d(2)) {
                                    return;
                                } else {
                                    n0Var.t(2);
                                }
                            }
                            if (n0Var.d(i21)) {
                                int i22 = n0Var.i(i21);
                                if (!oVar2.f5540k) {
                                    if (n0Var.d(1)) {
                                        zH = n0Var.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!n0Var.d(1)) {
                                                return;
                                            }
                                            zH2 = n0Var.h();
                                            z10 = true;
                                        }
                                        if (pVar.f6819i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iM = 0;
                                        } else if (!n0Var.e()) {
                                            return;
                                        } else {
                                            iM = n0Var.m();
                                        }
                                        i12 = oVar2.m;
                                        if (i12 != 0) {
                                            if (n0Var.d(i20)) {
                                                i13 = n0Var.i(i20);
                                                if (!z12 && !zH) {
                                                    if (!n0Var.e()) {
                                                        return;
                                                    }
                                                    iN2 = n0Var.n();
                                                    i14 = 0;
                                                }
                                                iN = 0;
                                                o oVar3 = pVar.f6822n;
                                                oVar3.f6799c = oVar2;
                                                oVar3.f6800d = i18;
                                                oVar3.f6801e = iM2;
                                                oVar3.f6802f = i22;
                                                oVar3.f6803g = iM3;
                                                oVar3.f6804h = zH;
                                                oVar3.f6805i = z10;
                                                oVar3.f6806j = zH2;
                                                oVar3.f6807k = z11;
                                                oVar3.l = iM;
                                                oVar3.m = i13;
                                                oVar3.f6808n = iN2;
                                                oVar3.f6809o = i14;
                                                oVar3.f6810p = iN;
                                                oVar3.f6797a = true;
                                                oVar3.f6798b = true;
                                                pVar.f6821k = false;
                                            }
                                            return;
                                        }
                                        if (i12 == 1 || oVar2.f5542o) {
                                            i13 = 0;
                                        } else {
                                            if (!n0Var.e()) {
                                                return;
                                            }
                                            int iN3 = n0Var.n();
                                            if (!z12 || zH) {
                                                i14 = iN3;
                                                i13 = 0;
                                                iN2 = 0;
                                                iN = 0;
                                            } else {
                                                if (!n0Var.e()) {
                                                    return;
                                                }
                                                iN = n0Var.n();
                                                iN2 = 0;
                                                i14 = iN3;
                                                i13 = 0;
                                            }
                                        }
                                        o oVar4 = pVar.f6822n;
                                        oVar4.f6799c = oVar2;
                                        oVar4.f6800d = i18;
                                        oVar4.f6801e = iM2;
                                        oVar4.f6802f = i22;
                                        oVar4.f6803g = iM3;
                                        oVar4.f6804h = zH;
                                        oVar4.f6805i = z10;
                                        oVar4.f6806j = zH2;
                                        oVar4.f6807k = z11;
                                        oVar4.l = iM;
                                        oVar4.m = i13;
                                        oVar4.f6808n = iN2;
                                        oVar4.f6809o = i14;
                                        oVar4.f6810p = iN;
                                        oVar4.f6797a = true;
                                        oVar4.f6798b = true;
                                        pVar.f6821k = false;
                                        i14 = 0;
                                        iN2 = 0;
                                        iN = 0;
                                        o oVar5 = pVar.f6822n;
                                        oVar5.f6799c = oVar2;
                                        oVar5.f6800d = i18;
                                        oVar5.f6801e = iM2;
                                        oVar5.f6802f = i22;
                                        oVar5.f6803g = iM3;
                                        oVar5.f6804h = zH;
                                        oVar5.f6805i = z10;
                                        oVar5.f6806j = zH2;
                                        oVar5.f6807k = z11;
                                        oVar5.l = iM;
                                        oVar5.m = i13;
                                        oVar5.f6808n = iN2;
                                        oVar5.f6809o = i14;
                                        oVar5.f6810p = iN;
                                        oVar5.f6797a = true;
                                        oVar5.f6798b = true;
                                        pVar.f6821k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z10 = zH2;
                                if (pVar.f6819i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iM = 0;
                                } else if (!n0Var.e()) {
                                    return;
                                } else {
                                    iM = n0Var.m();
                                }
                                i12 = oVar2.m;
                                if (i12 != 0) {
                                    if (i12 == 1) {
                                    }
                                    i13 = 0;
                                } else {
                                    if (n0Var.d(i20)) {
                                        return;
                                    }
                                    i13 = n0Var.i(i20);
                                    if (!z12) {
                                    }
                                }
                                i14 = 0;
                                iN2 = 0;
                                iN = 0;
                                o oVar6 = pVar.f6822n;
                                oVar6.f6799c = oVar2;
                                oVar6.f6800d = i18;
                                oVar6.f6801e = iM2;
                                oVar6.f6802f = i22;
                                oVar6.f6803g = iM3;
                                oVar6.f6804h = zH;
                                oVar6.f6805i = z10;
                                oVar6.f6806j = zH2;
                                oVar6.f6807k = z11;
                                oVar6.l = iM;
                                oVar6.m = i13;
                                oVar6.f6808n = iN2;
                                oVar6.f6809o = i14;
                                oVar6.f6810p = iN;
                                oVar6.f6797a = true;
                                oVar6.f6798b = true;
                                pVar.f6821k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i10, long j9, long j10) {
        if (!this.l || this.f6838k.f6813c) {
            this.f6831d.h(i10);
            this.f6832e.h(i10);
        }
        this.f6833f.h(i10);
        p pVar = this.f6838k;
        boolean z10 = this.f6839n;
        pVar.f6819i = i10;
        pVar.l = j10;
        pVar.f6820j = j9;
        pVar.f6827s = z10;
        if (!pVar.f6812b || i10 != 1) {
            if (!pVar.f6813c) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        o oVar = pVar.m;
        pVar.m = pVar.f6822n;
        pVar.f6822n = oVar;
        oVar.f6798b = false;
        oVar.f6797a = false;
        pVar.f6818h = 0;
        pVar.f6821k = true;
    }
}
