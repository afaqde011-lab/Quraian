package j4;

import android.view.ViewGroup;

public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;

    public int f8016a;

    public boolean f8017a0;

    public int f8018b;

    public boolean f8019b0;

    public float f8020c;

    public boolean f8021c0;

    public int f8022d;

    public boolean f8023d0;

    public int f8024e;

    public int f8025e0;

    public int f8026f;

    public int f8027f0;

    public int f8028g;

    public int f8029g0;

    public int f8030h;

    public int f8031h0;

    public int f8032i;

    public int f8033i0;

    public int f8034j;

    public int f8035j0;

    public int f8036k;

    public float f8037k0;
    public int l;

    public int f8038l0;
    public int m;

    public int f8039m0;

    public int f8040n;

    public float f8041n0;

    public int f8042o;

    public g4.e f8043o0;

    public int f8044p;

    public float f8045q;

    public int f8046r;

    public int f8047s;

    public int f8048t;

    public int f8049u;

    public int f8050v;

    public int f8051w;

    public int f8052x;

    public int f8053y;

    public int f8054z;

    public final void a() {
        this.f8021c0 = false;
        this.Z = true;
        this.f8017a0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.W) {
            this.f8017a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.Z = false;
            if (i10 == 0 && this.K == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.V = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f8017a0 = false;
            if (i11 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.W = true;
            }
        }
        if (this.f8020c == -1.0f && this.f8016a == -1 && this.f8018b == -1) {
            return;
        }
        this.f8021c0 = true;
        this.Z = true;
        this.f8017a0 = true;
        if (!(this.f8043o0 instanceof g4.i)) {
            this.f8043o0 = new g4.i();
        }
        ((g4.i) this.f8043o0).N(this.U);
    }

    @Override
    public final void resolveLayoutDirection(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i10);
        boolean z10 = false;
        boolean z11 = 1 == getLayoutDirection();
        this.f8029g0 = -1;
        this.f8031h0 = -1;
        this.f8025e0 = -1;
        this.f8027f0 = -1;
        this.f8033i0 = this.f8050v;
        this.f8035j0 = this.f8052x;
        float f3 = this.D;
        this.f8037k0 = f3;
        int i17 = this.f8016a;
        this.f8038l0 = i17;
        int i18 = this.f8018b;
        this.f8039m0 = i18;
        float f10 = this.f8020c;
        this.f8041n0 = f10;
        if (z11) {
            int i19 = this.f8046r;
            if (i19 != -1) {
                this.f8029g0 = i19;
            } else {
                int i20 = this.f8047s;
                if (i20 != -1) {
                    this.f8031h0 = i20;
                } else {
                    i11 = this.f8048t;
                    if (i11 != -1) {
                        this.f8027f0 = i11;
                        z10 = true;
                    }
                    i12 = this.f8049u;
                    if (i12 != -1) {
                        this.f8025e0 = i12;
                        z10 = true;
                    }
                    i13 = this.f8054z;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f8035j0 = i13;
                    }
                    i14 = this.A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f8033i0 = i14;
                    }
                    if (z10) {
                        this.f8037k0 = 1.0f - f3;
                    }
                    if (this.f8021c0 && this.U == 1) {
                        if (f10 != -1.0f) {
                            this.f8041n0 = 1.0f - f10;
                            this.f8038l0 = -1;
                            this.f8039m0 = -1;
                        } else if (i17 != -1) {
                            this.f8039m0 = i17;
                            this.f8038l0 = -1;
                            this.f8041n0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f8038l0 = i18;
                            this.f8039m0 = -1;
                            this.f8041n0 = -1.0f;
                        }
                    }
                }
            }
            z10 = true;
            i11 = this.f8048t;
            if (i11 != -1) {
                this.f8027f0 = i11;
                z10 = true;
            }
            i12 = this.f8049u;
            if (i12 != -1) {
                this.f8025e0 = i12;
                z10 = true;
            }
            i13 = this.f8054z;
            if (i13 != Integer.MIN_VALUE) {
                this.f8035j0 = i13;
            }
            i14 = this.A;
            if (i14 != Integer.MIN_VALUE) {
                this.f8033i0 = i14;
            }
            if (z10) {
                this.f8037k0 = 1.0f - f3;
            }
            if (this.f8021c0) {
                if (f10 != -1.0f) {
                    this.f8041n0 = 1.0f - f10;
                    this.f8038l0 = -1;
                    this.f8039m0 = -1;
                } else if (i17 != -1) {
                    this.f8039m0 = i17;
                    this.f8038l0 = -1;
                    this.f8041n0 = -1.0f;
                } else if (i18 != -1) {
                    this.f8038l0 = i18;
                    this.f8039m0 = -1;
                    this.f8041n0 = -1.0f;
                }
            }
        } else {
            int i21 = this.f8046r;
            if (i21 != -1) {
                this.f8027f0 = i21;
            }
            int i22 = this.f8047s;
            if (i22 != -1) {
                this.f8025e0 = i22;
            }
            int i23 = this.f8048t;
            if (i23 != -1) {
                this.f8029g0 = i23;
            }
            int i24 = this.f8049u;
            if (i24 != -1) {
                this.f8031h0 = i24;
            }
            int i25 = this.f8054z;
            if (i25 != Integer.MIN_VALUE) {
                this.f8033i0 = i25;
            }
            int i26 = this.A;
            if (i26 != Integer.MIN_VALUE) {
                this.f8035j0 = i26;
            }
        }
        if (this.f8048t == -1 && this.f8049u == -1 && this.f8047s == -1 && this.f8046r == -1) {
            int i27 = this.f8026f;
            if (i27 != -1) {
                this.f8029g0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                }
            } else {
                int i28 = this.f8028g;
                if (i28 != -1) {
                    this.f8031h0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                }
            }
            int i29 = this.f8022d;
            if (i29 != -1) {
                this.f8025e0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                return;
            }
            int i30 = this.f8024e;
            if (i30 != -1) {
                this.f8027f0 = i30;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
            }
        }
    }
}
