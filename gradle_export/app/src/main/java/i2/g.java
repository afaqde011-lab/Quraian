package i2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class g {

    public final Path f7128a;

    public RectF f7129b;

    public float[] f7130c;

    public Matrix f7131d;

    public g(Path path) {
        this.f7128a = path;
    }

    public static void a(g gVar, g gVar2) {
        Path path = gVar.f7128a;
        if (!(gVar2 instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(gVar2.f7128a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(g gVar, h2.c cVar) {
        m0[] m0VarArr = m0.A;
        gVar.getClass();
        float f3 = cVar.f6546a;
        float f10 = cVar.f6549d;
        float f11 = cVar.f6548c;
        float f12 = cVar.f6547b;
        if (Float.isNaN(f3) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (gVar.f7129b == null) {
            gVar.f7129b = new RectF();
        }
        RectF rectF = gVar.f7129b;
        kotlin.jvm.internal.m.b(rectF);
        rectF.set(f3, f12, f11, f10);
        Path path = gVar.f7128a;
        RectF rectF2 = gVar.f7129b;
        kotlin.jvm.internal.m.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(g gVar, h2.d dVar) {
        m0[] m0VarArr = m0.A;
        if (gVar.f7129b == null) {
            gVar.f7129b = new RectF();
        }
        RectF rectF = gVar.f7129b;
        kotlin.jvm.internal.m.b(rectF);
        float f3 = dVar.f6550a;
        long j9 = dVar.f6557h;
        long j10 = dVar.f6556g;
        long j11 = dVar.f6555f;
        long j12 = dVar.f6554e;
        rectF.set(f3, dVar.f6551b, dVar.f6552c, dVar.f6553d);
        if (gVar.f7130c == null) {
            gVar.f7130c = new float[8];
        }
        float[] fArr = gVar.f7130c;
        kotlin.jvm.internal.m.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        Path path = gVar.f7128a;
        RectF rectF2 = gVar.f7129b;
        kotlin.jvm.internal.m.b(rectF2);
        float[] fArr2 = gVar.f7130c;
        kotlin.jvm.internal.m.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final h2.c d() {
        if (this.f7129b == null) {
            this.f7129b = new RectF();
        }
        RectF rectF = this.f7129b;
        kotlin.jvm.internal.m.b(rectF);
        this.f7128a.computeBounds(rectF, true);
        return new h2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f3, float f10) {
        this.f7128a.lineTo(f3, f10);
    }

    public final void f(float f3, float f10) {
        this.f7128a.moveTo(f3, f10);
    }

    public final boolean g(g gVar, g gVar2, int i10) {
        Path.Op op;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = gVar.f7128a;
        if (gVar2 instanceof g) {
            return this.f7128a.op(path, gVar2.f7128a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void h() {
        this.f7128a.reset();
    }

    public final void i() {
        this.f7128a.rewind();
    }

    public final void j(int i10) {
        this.f7128a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void k(long j9) {
        Matrix matrix = this.f7131d;
        if (matrix == null) {
            this.f7131d = new Matrix();
        } else {
            kotlin.jvm.internal.m.b(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f7131d;
        kotlin.jvm.internal.m.b(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
        Matrix matrix3 = this.f7131d;
        kotlin.jvm.internal.m.b(matrix3);
        this.f7128a.transform(matrix3);
    }
}
