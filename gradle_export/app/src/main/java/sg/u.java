package sg;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class u {

    public float f14206a;

    public float f14207b;

    public float f14208c;

    public float f14209d;

    public float f14210e;

    public final ArrayList f14211f = new ArrayList();

    public final ArrayList f14212g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3) {
        float f10 = this.f14209d;
        if (f10 == f3) {
            return;
        }
        float f11 = ((f3 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f14207b;
        float f13 = this.f14208c;
        q qVar = new q(f12, f13, f12, f13);
        qVar.f14201f = this.f14209d;
        qVar.f14202g = f11;
        this.f14212g.add(new o(qVar));
        this.f14209d = f3;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f14211f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f3, float f10) {
        r rVar = new r();
        rVar.f14203b = f3;
        rVar.f14204c = f10;
        this.f14211f.add(rVar);
        p pVar = new p(rVar, this.f14207b, this.f14208c);
        float fA = pVar.a() + 270.0f;
        float fA2 = pVar.a() + 270.0f;
        a(fA);
        this.f14212g.add(pVar);
        this.f14209d = fA2;
        this.f14207b = f3;
        this.f14208c = f10;
    }

    public final void d(float f3, float f10, float f11) {
        this.f14206a = f3;
        this.f14207b = 0.0f;
        this.f14208c = f3;
        this.f14209d = f10;
        this.f14210e = (f10 + f11) % 360.0f;
        this.f14211f.clear();
        this.f14212g.clear();
    }
}
