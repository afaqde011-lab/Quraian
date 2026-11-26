package tf;

public final class q {

    public final String f14683a;

    public final String f14684b;

    public final long f14685c;

    public final long f14686d;

    public final long f14687e;

    public final long f14688f;

    public final long f14689g;

    public final Long f14690h;

    public final Long f14691i;

    public final Long f14692j;

    public final Boolean f14693k;

    public q(String str, String str2, long j9, long j10, long j11, long j12, long j13, Long l, Long l10, Long l11, Boolean bool) {
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        com.google.android.gms.common.internal.d0.b(j9 >= 0);
        com.google.android.gms.common.internal.d0.b(j10 >= 0);
        com.google.android.gms.common.internal.d0.b(j11 >= 0);
        com.google.android.gms.common.internal.d0.b(j13 >= 0);
        this.f14683a = str;
        this.f14684b = str2;
        this.f14685c = j9;
        this.f14686d = j10;
        this.f14687e = j11;
        this.f14688f = j12;
        this.f14689g = j13;
        this.f14690h = l;
        this.f14691i = l10;
        this.f14692j = l11;
        this.f14693k = bool;
    }

    public final q a(long j9) {
        return new q(this.f14683a, this.f14684b, this.f14685c, this.f14686d, this.f14687e, j9, this.f14689g, this.f14690h, this.f14691i, this.f14692j, this.f14693k);
    }

    public final q b(Long l, Long l10, Boolean bool) {
        return new q(this.f14683a, this.f14684b, this.f14685c, this.f14686d, this.f14687e, this.f14688f, this.f14689g, this.f14690h, l, l10, bool);
    }
}
