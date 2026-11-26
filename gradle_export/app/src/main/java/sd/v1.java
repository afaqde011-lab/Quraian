package sd;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

public final class v1 extends p30.f {

    public final int f14094b;

    public float f14095c;

    public final float f14096d;

    public final y1 f14097e;

    public final Object f14098f;

    public v1(y1 y1Var, float f3, float f10) {
        this.f14094b = 1;
        this.f14097e = y1Var;
        this.f14098f = new RectF();
        this.f14095c = f3;
        this.f14096d = f10;
    }

    public v1(y1 y1Var, float f3, float f10, Path path) {
        this.f14094b = 0;
        this.f14097e = y1Var;
        this.f14095c = f3;
        this.f14096d = f10;
        this.f14098f = path;
    }

    public final boolean b0(j1 j1Var) {
        switch (this.f14094b) {
            case 0:
                if (!(j1Var instanceof k1)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(j1Var instanceof k1)) {
                    return true;
                }
                k1 k1Var = (k1) j1Var;
                w0 w0VarE = j1Var.f14129a.E(k1Var.f14011n);
                if (w0VarE == null) {
                    y1.v("TextPath path reference '%s' not found", k1Var.f14011n);
                } else {
                    i0 i0Var = (i0) w0VarE;
                    s1 s1Var = new s1(i0Var.f13999o);
                    Matrix matrix = i0Var.f14128n;
                    Path path = s1Var.f14082a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.f14098f).union(rectF);
                }
                return false;
        }
    }

    public final void l0(String str) {
        String str2;
        switch (this.f14094b) {
            case 0:
                y1 y1Var = this.f14097e;
                if (y1Var.g0()) {
                    Path path = new Path();
                    str2 = str;
                    ((w1) y1Var.f14134c).f14111d.getTextPath(str2, 0, str.length(), this.f14095c, this.f14096d, path);
                    ((Path) this.f14098f).addPath(path);
                } else {
                    str2 = str;
                }
                this.f14095c = ((w1) y1Var.f14134c).f14111d.measureText(str2) + this.f14095c;
                break;
            default:
                y1 y1Var2 = this.f14097e;
                if (y1Var2.g0()) {
                    Rect rect = new Rect();
                    ((w1) y1Var2.f14134c).f14111d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f14095c, this.f14096d);
                    ((RectF) this.f14098f).union(rectF);
                }
                this.f14095c = ((w1) y1Var2.f14134c).f14111d.measureText(str) + this.f14095c;
                break;
        }
    }
}
