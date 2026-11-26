package sg;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements d {

    public final d f14147a;

    public final float f14148b;

    public b(float f3, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f14147a;
            f3 += ((b) dVar).f14148b;
        }
        this.f14147a = dVar;
        this.f14148b = f3;
    }

    @Override
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f14147a.a(rectF) + this.f14148b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14147a.equals(bVar.f14147a) && this.f14148b == bVar.f14148b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14147a, Float.valueOf(this.f14148b)});
    }
}
