package ba;

import android.graphics.Rect;
import android.view.View;

public abstract class y {

    public int f2461a;

    public final Object f2462b;

    public final Object f2463c;

    public y(p0 p0Var) {
        this.f2461a = Integer.MIN_VALUE;
        this.f2463c = new Rect();
        this.f2462b = p0Var;
    }

    public y(String str, int i10, String str2) {
        this.f2461a = i10;
        this.f2462b = str;
        this.f2463c = str2;
    }

    public y(v5.f fVar) {
        this.f2461a = 0;
        this.f2463c = new v5.b();
        this.f2462b = fVar;
    }

    public static y b(p0 p0Var, int i10) {
        if (i10 == 0) {
            return new x(p0Var, 0);
        }
        if (i10 == 1) {
            return new x(p0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(ma.a aVar);

    public abstract void c(ma.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i10);

    public abstract void r(ma.a aVar);

    public abstract void s(ma.a aVar);

    public abstract void t(ma.a aVar);

    public abstract void u(ma.a aVar);

    public abstract androidx.media3.common.q v(ma.a aVar);
}
