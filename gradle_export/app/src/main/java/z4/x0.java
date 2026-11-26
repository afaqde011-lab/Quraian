package z4;

import android.graphics.Rect;
import java.util.List;

public abstract class x0 {

    public final j1 f17228a;

    public final Rect[][] f17229b;

    public final Rect[][] f17230c;

    public x0() {
        this(new j1((j1) null));
    }

    public x0(j1 j1Var) {
        this.f17229b = new Rect[10][];
        this.f17230c = new Rect[10][];
        this.f17228a = j1Var;
        c(j1Var);
    }

    public final void a() {
    }

    public abstract j1 b();

    public void c(j1 j1Var) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            List<Rect> listF = j1Var.f17202a.f(i10);
            int iK = f50.c.K(i10);
            this.f17229b[iK] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i10 != 8) {
                List<Rect> listG = j1Var.f17202a.g(i10);
                this.f17230c[iK] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public abstract void d(q4.b bVar);

    public abstract void e(q4.b bVar);

    public abstract void f(q4.b bVar);

    public abstract void g(q4.b bVar);

    public abstract void h(q4.b bVar);
}
