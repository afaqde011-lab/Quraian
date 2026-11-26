package h9;

import a8.n0;
import g1.c3;

public final class x implements g0 {

    public final i f6915a;

    public final n0 f6916b = new n0(10, new byte[10]);

    public int f6917c = 0;

    public int f6918d;

    public e7.e0 f6919e;

    public boolean f6920f;

    public boolean f6921g;

    public boolean f6922h;

    public int f6923i;

    public int f6924j;

    public boolean f6925k;
    public long l;

    public x(i iVar) {
        this.f6915a = iVar;
    }

    @Override
    public final void a() {
        this.f6917c = 0;
        this.f6918d = 0;
        this.f6922h = false;
        this.f6915a.a();
    }

    @Override
    public final void b(int i10, e7.u uVar) {
        int i11;
        int i12;
        this.f6919e.getClass();
        int i13 = i10 & 1;
        int i14 = -1;
        int i15 = 2;
        i iVar = this.f6915a;
        if (i13 != 0) {
            int i16 = this.f6917c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    e7.a.m("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f6924j != -1) {
                        e7.a.m("PesReader", "Unexpected start indicator: expected " + this.f6924j + " more bytes");
                    }
                    iVar.d(uVar.f5184c == 0);
                }
            }
            this.f6917c = 1;
            this.f6918d = 0;
        }
        int i17 = i10;
        while (uVar.a() > 0) {
            int i18 = this.f6917c;
            if (i18 != 0) {
                n0 n0Var = this.f6916b;
                if (i18 != 1) {
                    if (i18 == i15) {
                        if (d(uVar, n0Var.f300b, Math.min(10, this.f6923i)) && d(uVar, null, this.f6923i)) {
                            n0Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f6920f) {
                                n0Var.t(4);
                                long jI = ((long) n0Var.i(3)) << 30;
                                n0Var.t(1);
                                long jI2 = ((long) (n0Var.i(15) << 15)) | jI;
                                n0Var.t(1);
                                long jI3 = jI2 | ((long) n0Var.i(15));
                                n0Var.t(1);
                                if (!this.f6922h && this.f6921g) {
                                    n0Var.t(4);
                                    long jI4 = ((long) n0Var.i(3)) << 30;
                                    n0Var.t(1);
                                    long jI5 = jI4 | ((long) (n0Var.i(15) << 15));
                                    n0Var.t(1);
                                    long jI6 = jI5 | ((long) n0Var.i(15));
                                    n0Var.t(1);
                                    this.f6919e.b(jI6);
                                    this.f6922h = true;
                                }
                                this.l = this.f6919e.b(jI3);
                            }
                            i17 |= this.f6925k ? 4 : 0;
                            iVar.e(i17, this.l);
                            this.f6917c = 3;
                            this.f6918d = 0;
                            i14 = -1;
                            i15 = 2;
                        }
                    } else {
                        if (i18 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = uVar.a();
                        int i19 = this.f6924j;
                        int i20 = i19 == i14 ? 0 : iA - i19;
                        if (i20 > 0) {
                            iA -= i20;
                            uVar.M(uVar.f5183b + iA);
                        }
                        iVar.b(uVar);
                        int i21 = this.f6924j;
                        if (i21 != i14) {
                            int i22 = i21 - iA;
                            this.f6924j = i22;
                            if (i22 == 0) {
                                iVar.d(false);
                                this.f6917c = 1;
                                this.f6918d = 0;
                            }
                        }
                    }
                    i11 = i15;
                } else if (d(uVar, n0Var.f300b, 9)) {
                    n0Var.q(0);
                    int i23 = n0Var.i(24);
                    if (i23 != 1) {
                        a1.b.y("Unexpected start code prefix: ", i23, "PesReader");
                        i14 = -1;
                        this.f6924j = -1;
                        i12 = 0;
                        i11 = 2;
                    } else {
                        n0Var.t(8);
                        int i24 = n0Var.i(16);
                        n0Var.t(5);
                        this.f6925k = n0Var.h();
                        i11 = 2;
                        n0Var.t(2);
                        this.f6920f = n0Var.h();
                        this.f6921g = n0Var.h();
                        n0Var.t(6);
                        int i25 = n0Var.i(8);
                        this.f6923i = i25;
                        if (i24 == 0) {
                            this.f6924j = -1;
                            i14 = -1;
                        } else {
                            int i26 = (i24 - 3) - i25;
                            this.f6924j = i26;
                            if (i26 < 0) {
                                e7.a.m("PesReader", "Found negative packet payload size: " + this.f6924j);
                                i14 = -1;
                                this.f6924j = -1;
                            } else {
                                i14 = -1;
                            }
                        }
                        i12 = 2;
                    }
                    this.f6917c = i12;
                    this.f6918d = 0;
                } else {
                    i14 = -1;
                    i11 = 2;
                }
            } else {
                i11 = i15;
                uVar.O(uVar.a());
            }
            i15 = i11;
        }
    }

    @Override
    public final void c(e7.e0 e0Var, a8.s sVar, c3 c3Var) {
        this.f6919e = e0Var;
        this.f6915a.c(sVar, c3Var);
    }

    public final boolean d(e7.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f6918d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.O(iMin);
        } else {
            uVar.k(this.f6918d, iMin, bArr);
        }
        int i11 = this.f6918d + iMin;
        this.f6918d = i11;
        return i11 == i10;
    }
}
