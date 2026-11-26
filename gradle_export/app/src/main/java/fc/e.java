package fc;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;

public abstract class e {

    public final b f5598c;

    public final ArrayList f5596a = new ArrayList(1);

    public boolean f5597b = false;

    public float f5599d = 0.0f;

    public Object f5600e = null;

    public float f5601f = -1.0f;

    public float f5602g = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new hb.f();
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.f5598c = dVar;
    }

    public final void a(a aVar) {
        this.f5596a.add(aVar);
    }

    public final pc.a b() {
        pc.a aVarD = this.f5598c.d();
        y3.D();
        return aVarD;
    }

    public final float c() {
        pc.a aVarB = b();
        if (aVarB == null || aVarB.c()) {
            return 0.0f;
        }
        return aVarB.f12477d.getInterpolation(d());
    }

    public final float d() {
        if (this.f5597b) {
            return 0.0f;
        }
        pc.a aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f5599d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object e() {
        float fD = d();
        if (this.f5598c.c(fD)) {
            return this.f5600e;
        }
        pc.a aVarB = b();
        Interpolator interpolator = aVarB.f12478e;
        Interpolator interpolator2 = aVarB.f12479f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(aVarB, c()) : g(aVarB, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f5600e = objF;
        return objF;
    }

    public abstract Object f(pc.a aVar, float f3);

    public Object g(pc.a aVar, float f3, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h(float f3) {
        b bVar = this.f5598c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f5601f == -1.0f) {
            this.f5601f = bVar.k();
        }
        float f10 = this.f5601f;
        if (f3 < f10) {
            if (f10 == -1.0f) {
                this.f5601f = bVar.k();
            }
            f3 = this.f5601f;
        } else {
            if (this.f5602g == -1.0f) {
                this.f5602g = bVar.i();
            }
            float f11 = this.f5602g;
            if (f3 > f11) {
                if (f11 == -1.0f) {
                    this.f5602g = bVar.i();
                }
                f3 = this.f5602g;
            }
        }
        if (f3 == this.f5599d) {
            return;
        }
        this.f5599d = f3;
        if (!bVar.e(f3)) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5596a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).a();
            i10++;
        }
    }
}
