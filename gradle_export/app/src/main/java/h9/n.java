package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import e7.i0;
import g1.c3;
import java.util.Arrays;
import java.util.Collections;

public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    public final d0 f6786a;

    public final e7.u f6787b;

    public final boolean[] f6788c = new boolean[4];

    public final l f6789d;

    public final ba.s f6790e;

    public m f6791f;

    public long f6792g;

    public String f6793h;

    public l0 f6794i;

    public boolean f6795j;

    public long f6796k;

    public n(d0 d0Var) {
        this.f6786a = d0Var;
        l lVar = new l();
        lVar.f6777e = new byte[Cast.MAX_NAMESPACE_LENGTH];
        this.f6789d = lVar;
        this.f6796k = -9223372036854775807L;
        this.f6790e = new ba.s(178);
        this.f6787b = new e7.u();
    }

    @Override
    public final void a() {
        f7.p.a(this.f6788c);
        l lVar = this.f6789d;
        lVar.f6773a = false;
        lVar.f6775c = 0;
        lVar.f6774b = 0;
        m mVar = this.f6791f;
        if (mVar != null) {
            mVar.f6779b = false;
            mVar.f6780c = false;
            mVar.f6781d = false;
            mVar.f6782e = -1;
        }
        ba.s sVar = this.f6790e;
        if (sVar != null) {
            sVar.g();
        }
        this.f6792g = 0L;
        this.f6796k = -9223372036854775807L;
    }

    @Override
    public final void b(e7.u uVar) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        float f3;
        this.f6791f.getClass();
        this.f6794i.getClass();
        int i14 = uVar.f5183b;
        int i15 = uVar.f5184c;
        byte[] bArr = uVar.f5182a;
        this.f6792g += (long) uVar.a();
        this.f6794i.g(uVar.a(), uVar);
        while (true) {
            int iB = f7.p.b(bArr, i14, i15, this.f6788c);
            l lVar = this.f6789d;
            ba.s sVar = this.f6790e;
            if (iB == i15) {
                if (!this.f6795j) {
                    lVar.a(i14, i15, bArr);
                }
                this.f6791f.a(i14, i15, bArr);
                if (sVar != null) {
                    sVar.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = iB + 3;
            byte b7 = uVar.f5182a[i16];
            int i17 = b7 & 255;
            int i18 = iB - i14;
            if (this.f6795j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    lVar.a(i14, iB, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = lVar.f6774b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            e7.a.m("H263Reader", "Unexpected start code value");
                            lVar.f6773a = false;
                            lVar.f6775c = 0;
                            lVar.f6774b = 0;
                        } else {
                            lVar.f6774b = 2;
                        }
                    } else if (i20 != 2) {
                        i11 = i16;
                        if (i20 != 3) {
                            if (i20 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i17 == 179 || i17 == 181) {
                                lVar.f6775c -= i19;
                                lVar.f6773a = false;
                                l0 l0Var = this.f6794i;
                                int i21 = lVar.f6776d;
                                String str = this.f6793h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(lVar.f6777e, lVar.f6775c);
                                n0 n0Var = new n0(bArrCopyOf.length, bArrCopyOf);
                                n0Var.u(i21);
                                n0Var.u(4);
                                n0Var.s();
                                n0Var.t(8);
                                if (n0Var.h()) {
                                    n0Var.t(4);
                                    n0Var.t(3);
                                }
                                int i22 = n0Var.i(4);
                                if (i22 == 15) {
                                    int i23 = n0Var.i(8);
                                    int i24 = n0Var.i(8);
                                    if (i24 == 0) {
                                        e7.a.m("H263Reader", "Invalid aspect ratio");
                                        f3 = 1.0f;
                                    } else {
                                        f3 = i23 / i24;
                                    }
                                } else if (i22 < 7) {
                                    f3 = l[i22];
                                } else {
                                    e7.a.m("H263Reader", "Invalid aspect ratio");
                                    f3 = 1.0f;
                                }
                                if (n0Var.h()) {
                                    n0Var.t(2);
                                    n0Var.t(1);
                                    if (n0Var.h()) {
                                        n0Var.t(15);
                                        n0Var.s();
                                        n0Var.t(15);
                                        n0Var.s();
                                        n0Var.t(15);
                                        n0Var.s();
                                        n0Var.t(3);
                                        n0Var.t(11);
                                        n0Var.s();
                                        n0Var.t(15);
                                        n0Var.s();
                                    }
                                }
                                if (n0Var.i(2) != 0) {
                                    e7.a.m("H263Reader", "Unhandled video object layer shape");
                                }
                                n0Var.s();
                                int i25 = n0Var.i(16);
                                n0Var.s();
                                if (n0Var.h()) {
                                    if (i25 == 0) {
                                        e7.a.m("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i26 = 0;
                                        for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                            i26++;
                                        }
                                        n0Var.t(i26);
                                    }
                                }
                                n0Var.s();
                                int i28 = n0Var.i(13);
                                n0Var.s();
                                int i29 = n0Var.i(13);
                                n0Var.s();
                                n0Var.s();
                                androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                                sVar2.f1491a = str;
                                sVar2.l = x0.n("video/mp2t");
                                sVar2.m = x0.n("video/mp4v-es");
                                sVar2.f1508t = i28;
                                sVar2.f1509u = i29;
                                sVar2.f1514z = f3;
                                sVar2.f1504p = Collections.singletonList(bArrCopyOf);
                                oi.k.w(sVar2, l0Var);
                                this.f6795j = true;
                            } else {
                                i13 = 0;
                            }
                        } else if ((b7 & 240) != 32) {
                            e7.a.m("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            lVar.f6773a = false;
                            lVar.f6775c = 0;
                            lVar.f6774b = 0;
                        } else {
                            i13 = 0;
                            lVar.f6776d = lVar.f6775c;
                            lVar.f6774b = 4;
                        }
                    } else {
                        i11 = i16;
                        i13 = 0;
                        if (i17 > 31) {
                            e7.a.m("H263Reader", "Unexpected start code value");
                            lVar.f6773a = false;
                            lVar.f6775c = 0;
                            lVar.f6774b = 0;
                        } else {
                            lVar.f6774b = 3;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i13 = 0;
                    if (i17 == 176) {
                        lVar.f6774b = 1;
                        lVar.f6773a = true;
                    }
                }
                lVar.a(i13, 3, l.f6772f);
            }
            this.f6791f.a(i14, iB, bArr);
            if (sVar == null) {
                z10 = true;
            } else {
                if (i18 > 0) {
                    sVar.a(i14, iB, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (sVar.e(i12)) {
                    int iN = f7.p.n(sVar.f2413e, (byte[]) sVar.f2414f);
                    String str2 = i0.f5136a;
                    byte[] bArr2 = (byte[]) sVar.f2414f;
                    e7.u uVar2 = this.f6787b;
                    uVar2.L(iN, bArr2);
                    this.f6786a.a(this.f6796k, uVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (uVar.f5182a[iB + 2] == 1) {
                        sVar.h(i17);
                    }
                } else {
                    z10 = true;
                }
            }
            int i30 = i10 - iB;
            this.f6791f.b(i30, this.f6792g - ((long) i30), this.f6795j);
            m mVar = this.f6791f;
            long j9 = this.f6796k;
            mVar.f6782e = i17;
            mVar.f6781d = false;
            mVar.f6779b = (i17 == 182 || i17 == 179) ? z10 : false;
            mVar.f6780c = i17 == 182 ? z10 : false;
            mVar.f6783f = 0;
            mVar.f6785h = j9;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6793h = (String) c3Var.E;
        c3Var.b();
        l0 l0VarW = sVar.w(c3Var.C, 2);
        this.f6794i = l0VarW;
        this.f6791f = new m(l0VarW);
        this.f6786a.b(sVar, c3Var);
    }

    @Override
    public final void d(boolean z10) {
        this.f6791f.getClass();
        if (z10) {
            this.f6791f.b(0, this.f6792g, this.f6795j);
            m mVar = this.f6791f;
            mVar.f6779b = false;
            mVar.f6780c = false;
            mVar.f6781d = false;
            mVar.f6782e = -1;
        }
    }

    @Override
    public final void e(int i10, long j9) {
        this.f6796k = j9;
    }
}
