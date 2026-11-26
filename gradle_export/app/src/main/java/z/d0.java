package z;

import android.content.Context;
import android.widget.EdgeEffect;

public final class d0 {

    public final Context f16900a;

    public final int f16901b;

    public long f16902c = 0;

    public EdgeEffect f16903d;

    public EdgeEffect f16904e;

    public EdgeEffect f16905f;

    public EdgeEffect f16906g;

    public EdgeEffect f16907h;

    public EdgeEffect f16908i;

    public EdgeEffect f16909j;

    public EdgeEffect f16910k;

    public d0(Context context, int i10) {
        this.f16900a = context;
        this.f16901b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float distance;
        if (edgeEffect == null) {
            return false;
        }
        try {
            distance = edgeEffect.getDistance();
        } catch (Throwable unused) {
            distance = 0.0f;
        }
        return !(distance == 0.0f);
    }

    public final EdgeEffect a(d0.q1 q1Var) {
        EdgeEffect edgeEffect;
        Context context = this.f16900a;
        try {
            edgeEffect = new EdgeEffect(context, null);
        } catch (Throwable unused) {
            edgeEffect = new EdgeEffect(context);
        }
        edgeEffect.setColor(this.f16901b);
        if (!y3.l.b(this.f16902c, 0L)) {
            if (q1Var == d0.q1.A) {
                long j9 = this.f16902c;
                edgeEffect.setSize((int) (j9 >> 32), (int) (j9 & 4294967295L));
            } else {
                long j10 = this.f16902c;
                edgeEffect.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
            }
        }
        return edgeEffect;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f16904e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.q1.A);
        this.f16904e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f16905f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.q1.B);
        this.f16905f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f16906g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.q1.B);
        this.f16906g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f16903d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.q1.A);
        this.f16903d = edgeEffectA;
        return edgeEffectA;
    }
}
