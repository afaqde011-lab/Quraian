package sg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class q extends s {

    public static final RectF f14196h = new RectF();

    public final float f14197b;

    public final float f14198c;

    public final float f14199d;

    public final float f14200e;

    public float f14201f;

    public float f14202g;

    public q(float f3, float f10, float f11, float f12) {
        this.f14197b = f3;
        this.f14198c = f10;
        this.f14199d = f11;
        this.f14200e = f12;
    }

    @Override
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f14205a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f3 = this.f14199d;
        float f10 = this.f14200e;
        RectF rectF = f14196h;
        rectF.set(this.f14197b, this.f14198c, f3, f10);
        path.arcTo(rectF, this.f14201f, this.f14202g, false);
        path.transform(matrix);
    }
}
