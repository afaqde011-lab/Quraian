package fc;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

public final class k extends i {

    public final PointF f5615h;

    public final float[] f5616i;

    public final PathMeasure f5617j;

    public j f5618k;

    public k(ArrayList arrayList) {
        super(arrayList);
        this.f5615h = new PointF();
        this.f5616i = new float[2];
        this.f5617j = new PathMeasure();
    }

    @Override
    public final Object f(pc.a aVar, float f3) {
        j jVar = (j) aVar;
        Path path = jVar.f5613q;
        if (path == null) {
            return (PointF) aVar.f12475b;
        }
        j jVar2 = this.f5618k;
        PathMeasure pathMeasure = this.f5617j;
        if (jVar2 != jVar) {
            pathMeasure.setPath(path, false);
            this.f5618k = jVar;
        }
        float length = pathMeasure.getLength() * f3;
        float[] fArr = this.f5616i;
        pathMeasure.getPosTan(length, fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        PointF pointF = this.f5615h;
        pointF.set(f10, f11);
        return pointF;
    }
}
