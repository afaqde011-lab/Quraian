package i2;

import android.graphics.PathMeasure;

public final class i {

    public final PathMeasure f7138a;

    public i(PathMeasure pathMeasure) {
        this.f7138a = pathMeasure;
    }

    public final boolean a(float f3, float f10, g gVar) {
        if (gVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f7138a.getSegment(f3, f10, gVar.f7128a, true);
    }
}
