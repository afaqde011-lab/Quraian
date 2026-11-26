package sg;

import android.graphics.Matrix;
import android.graphics.Path;

public final class r extends s {

    public float f14203b;

    public float f14204c;

    @Override
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f14205a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f14203b, this.f14204c);
        path.transform(matrix);
    }
}
