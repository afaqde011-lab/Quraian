package i2;

import android.graphics.Paint;
import android.graphics.Shader;

public final class e {

    public final Paint f7120a;

    public int f7121b = 3;

    public Shader f7122c;

    public m f7123d;

    public h f7124e;

    public e(Paint paint) {
        this.f7120a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.f7120a.getStrokeCap();
        int i10 = strokeCap == null ? -1 : f.f7126a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.f7120a.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : f.f7127b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f3) {
        this.f7120a.setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public final void d(int i10) {
        if (this.f7121b == i10) {
            return;
        }
        this.f7121b = i10;
        this.f7120a.setBlendMode(b0.y(i10));
    }

    public final void e(long j9) {
        this.f7120a.setColor(b0.C(j9));
    }

    public final void f(m mVar) {
        this.f7123d = mVar;
        this.f7120a.setColorFilter(mVar != null ? mVar.f7144a : null);
    }

    public final void g(int i10) {
        this.f7120a.setFilterBitmap(!(i10 == 0));
    }

    public final void h(h hVar) {
        this.f7120a.setPathEffect(hVar != null ? hVar.f7136a : null);
        this.f7124e = hVar;
    }

    public final void i(Shader shader) {
        this.f7122c = shader;
        this.f7120a.setShader(shader);
    }

    public final void j(int i10) {
        Paint.Cap cap;
        if (i10 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i10 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.f7120a.setStrokeCap(cap);
    }

    public final void k(int i10) {
        Paint.Join join;
        if (i10 == 0) {
            join = Paint.Join.MITER;
        } else if (i10 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.f7120a.setStrokeJoin(join);
    }

    public final void l(float f3) {
        this.f7120a.setStrokeWidth(f3);
    }

    public final void m(int i10) {
        this.f7120a.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
