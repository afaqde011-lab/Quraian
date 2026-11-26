package kc;

import android.graphics.PointF;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.List;

public final class k {

    public final ArrayList f9627a;

    public PointF f9628b;

    public boolean f9629c;

    public k() {
        this.f9627a = new ArrayList();
    }

    public k(PointF pointF, boolean z10, List list) {
        this.f9628b = pointF;
        this.f9629c = z10;
        this.f9627a = new ArrayList(list);
    }

    public final void a(float f3, float f10) {
        if (this.f9628b == null) {
            this.f9628b = new PointF();
        }
        this.f9628b.set(f3, f10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f9627a.size());
        sb2.append("closed=");
        return x5.o(sb2, this.f9629c, '}');
    }
}
