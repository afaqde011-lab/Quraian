package ec;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

public final class m implements e, j, fc.a, c {

    public final Matrix f5329a = new Matrix();

    public final Path f5330b = new Path();

    public final cc.i f5331c;

    public final lc.b f5332d;

    public final boolean f5333e;

    public final fc.f f5334f;

    public final fc.f f5335g;

    public final fc.n f5336h;

    public d f5337i;

    public m(cc.i iVar, lc.b bVar, kc.i iVar2) {
        this.f5331c = iVar;
        this.f5332d = bVar;
        this.f5333e = iVar2.f9623c;
        fc.e eVarM0 = iVar2.f9622b.m0();
        this.f5334f = (fc.f) eVarM0;
        bVar.f(eVarM0);
        eVarM0.a(this);
        fc.e eVarM1 = ((jc.b) iVar2.f9624d).m0();
        this.f5335g = (fc.f) eVarM1;
        bVar.f(eVarM1);
        eVarM1.a(this);
        jc.d dVar = (jc.d) iVar2.f9625e;
        dVar.getClass();
        fc.n nVar = new fc.n(dVar);
        this.f5336h = nVar;
        nVar.a(bVar);
        nVar.b(this);
    }

    @Override
    public final void a() {
        this.f5331c.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        this.f5337i.b(list, list2);
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f5337i.c(rectF, matrix, z10);
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = ((Float) this.f5334f.e()).floatValue();
        float fFloatValue2 = ((Float) this.f5335g.e()).floatValue();
        fc.n nVar = this.f5336h;
        float fFloatValue3 = ((Float) ((fc.f) nVar.l).e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) ((fc.f) nVar.m).e()).floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f5329a;
            matrix2.set(matrix);
            float f3 = i11;
            matrix2.preConcat(nVar.i(f3 + fFloatValue2));
            this.f5337i.d(canvas, matrix2, (int) (oc.d.d(fFloatValue3, fFloatValue4, f3 / fFloatValue) * i10));
        }
    }

    @Override
    public final Path e() {
        Path pathE = this.f5337i.e();
        Path path = this.f5330b;
        path.reset();
        float fFloatValue = ((Float) this.f5334f.e()).floatValue();
        float fFloatValue2 = ((Float) this.f5335g.e()).floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrixI = this.f5336h.i(i10 + fFloatValue2);
            Matrix matrix = this.f5329a;
            matrix.set(matrixI);
            path.addPath(pathE, matrix);
        }
        return path;
    }
}
