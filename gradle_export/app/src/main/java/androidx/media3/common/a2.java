package androidx.media3.common;

public final class a2 {
    public k2 A;
    public s2 B;
    public t0 C;
    public t0 D;
    public int E;
    public int F;
    public int G;
    public Long H;
    public z1 I;
    public z1 J;
    public z1 K;
    public z1 L;
    public z1 M;
    public boolean N;
    public int O;
    public long P;

    public b1 f1067a;

    public boolean f1068b;

    public int f1069c;

    public int f1070d;

    public int f1071e;

    public PlaybackException f1072f;

    public int f1073g;

    public boolean f1074h;

    public boolean f1075i;

    public long f1076j;

    public long f1077k;
    public long l;
    public z0 m;

    public q2 f1078n;

    public d f1079o;

    public float f1080p;

    public float f1081q;

    public w2 f1082r;

    public d7.c f1083s;

    public l f1084t;

    public int f1085u;

    public boolean f1086v;

    public e7.v f1087w;

    public boolean f1088x;

    public v0 f1089y;

    public fh.t0 f1090z;

    public final void a(int i10, int i11) {
        ta.c0.s((i10 == -1) == (i11 == -1));
        this.F = i10;
        this.G = i11;
    }

    public final void b(int i10) {
        ta.c0.s(i10 >= 0);
        this.f1085u = i10;
    }

    public final void c(float f3) {
        ta.c0.s(f3 >= 0.0f && f3 <= 1.0f);
        this.f1081q = f3 != 0.0f ? f3 : this.f1080p;
        this.f1080p = f3;
    }
}
