package y7;

import android.content.Context;
import android.view.Surface;

public final class x {

    public final b1.q f16746a;

    public final Context f16747b;

    public w f16748c;

    public boolean f16749d;

    public Surface f16750e;

    public float f16751f;

    public float f16752g;

    public float f16753h;

    public float f16754i;

    public int f16755j;

    public long f16756k;
    public long l;
    public long m;

    public long f16757n;

    public long f16758o;

    public long f16759p;

    public long f16760q;

    public long f16761r;

    public long f16762s;

    public x(Context context) {
        this.f16747b = context;
        b1.q qVar = new b1.q();
        qVar.D = new d();
        qVar.E = new d();
        qVar.B = -9223372036854775807L;
        this.f16746a = qVar;
        this.f16751f = -1.0f;
        this.f16754i = 1.0f;
        this.f16755j = 0;
    }

    public final void a() {
        Surface surface = this.f16750e;
        if (surface == null || this.f16755j == Integer.MIN_VALUE || this.f16753h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f16753h = 0.0f;
        try {
            this.f16750e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e3) {
            e7.a.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }

    public final void b() {
        this.m = 0L;
        this.f16760q = -1L;
        this.f16757n = -1L;
        this.f16756k = 0L;
        this.l = 0L;
    }

    public final void c() {
        float f3;
        float f10;
        if (this.f16750e == null) {
            return;
        }
        b1.q qVar = this.f16746a;
        if (!((d) qVar.D).a()) {
            f3 = this.f16751f;
        } else if (((d) qVar.D).a()) {
            d dVar = (d) qVar.D;
            long j9 = dVar.f16657e;
            f3 = (float) (1.0E9d / (j9 != 0 ? dVar.f16658f / j9 : 0L));
        } else {
            f3 = -1.0f;
        }
        float f11 = this.f16752g;
        if (f3 == f11) {
            return;
        }
        if (f3 != -1.0f && f11 != -1.0f) {
            if (((d) qVar.D).a()) {
                if ((((d) qVar.D).a() ? ((d) qVar.D).f16658f : -9223372036854775807L) >= 5000000000L) {
                    f10 = 0.1f;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 1.0f;
            }
            if (Math.abs(f3 - this.f16752g) < f10) {
                return;
            }
        } else if (f3 == -1.0f && qVar.C < 30) {
            return;
        }
        this.f16752g = f3;
        d(false);
    }

    public final void d(boolean z10) {
        float f3;
        Surface surface = this.f16750e;
        if (surface == null || this.f16755j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f16749d) {
            float f10 = this.f16752g;
            if (f10 != -1.0f) {
                f3 = f10 * this.f16754i;
            } else {
                f3 = 0.0f;
            }
        } else {
            f3 = 0.0f;
        }
        if (z10 || this.f16753h != f3) {
            this.f16753h = f3;
            try {
                this.f16750e.setFrameRate(f3, f3 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e3) {
                e7.a.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
            }
        }
    }
}
