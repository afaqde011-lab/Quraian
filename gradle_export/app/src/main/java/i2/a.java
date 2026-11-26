package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

public final class a implements s {

    public Canvas f7106a = b.f7109a;

    public Rect f7107b;

    public Rect f7108c;

    @Override
    public final void a(float f3, float f10, float f11, float f12, e eVar) {
        this.f7106a.drawRect(f3, f10, f11, f12, b0.o(eVar));
    }

    @Override
    public final void b(g gVar, e eVar) {
        Canvas canvas = this.f7106a;
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(gVar.f7128a, b0.o(eVar));
    }

    @Override
    public final void c(float f3, float f10) {
        this.f7106a.scale(f3, f10);
    }

    @Override
    public final void d(float f3) {
        this.f7106a.rotate(f3);
    }

    @Override
    public final void e(g gVar) {
        Canvas canvas = this.f7106a;
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(gVar.f7128a, Region.Op.INTERSECT);
    }

    @Override
    public final void f(float f3, long j9, e eVar) {
        this.f7106a.drawCircle(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), f3, b0.o(eVar));
    }

    @Override
    public final void g(d dVar, long j9, e eVar) {
        this.f7106a.drawBitmap(b0.j(dVar), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), b0.o(eVar));
    }

    @Override
    public final void h(h2.c cVar, e eVar) {
        this.f7106a.saveLayer(cVar.f6546a, cVar.f6547b, cVar.f6548c, cVar.f6549d, b0.o(eVar), 31);
    }

    @Override
    public final void i() {
        this.f7106a.save();
    }

    @Override
    public final void j() {
        this.f7106a.disableZ();
    }

    @Override
    public final void k(float f3, float f10, float f11, float f12, float f13, float f14, e eVar) {
        this.f7106a.drawRoundRect(f3, f10, f11, f12, f13, f14, b0.o(eVar));
    }

    @Override
    public final void l(long j9, long j10, e eVar) {
        this.f7106a.drawLine(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), b0.o(eVar));
    }

    @Override
    public final void m(float[] fArr) {
        if (b0.s(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        b0.w(matrix, fArr);
        this.f7106a.concat(matrix);
    }

    @Override
    public final void n(d dVar, long j9, long j10, long j11, e eVar) {
        if (this.f7107b == null) {
            this.f7107b = new Rect();
            this.f7108c = new Rect();
        }
        Canvas canvas = this.f7106a;
        Bitmap bitmapJ = b0.j(dVar);
        Rect rect = this.f7107b;
        kotlin.jvm.internal.m.b(rect);
        int i10 = (int) (j9 >> 32);
        rect.left = i10;
        int i11 = (int) (j9 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f7108c;
        kotlin.jvm.internal.m.b(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j11 >> 32));
        rect2.bottom = i13 + ((int) (j11 & 4294967295L));
        canvas.drawBitmap(bitmapJ, rect, rect2, b0.o(eVar));
    }

    @Override
    public final void o(float f3, float f10, float f11, float f12, int i10) {
        this.f7106a.clipRect(f3, f10, f11, f12, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override
    public final void p(float f3, float f10) {
        this.f7106a.translate(f3, f10);
    }

    @Override
    public final void q() {
        this.f7106a.restore();
    }

    @Override
    public final void r(float f3, float f10, float f11, float f12, float f13, float f14, e eVar) {
        this.f7106a.drawArc(f3, f10, f11, f12, f13, f14, false, b0.o(eVar));
    }

    @Override
    public final void t() {
        this.f7106a.enableZ();
    }
}
