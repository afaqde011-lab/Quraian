package ua;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

public final class l {

    public static final Matrix f15204p = new Matrix();

    public final Path f15205a;

    public final Path f15206b;

    public final Matrix f15207c;

    public Paint f15208d;

    public Paint f15209e;

    public PathMeasure f15210f;

    public final i f15211g;

    public float f15212h;

    public float f15213i;

    public float f15214j;

    public float f15215k;
    public int l;
    public String m;

    public Boolean f15216n;

    public final u.e f15217o;

    public l() {
        this.f15207c = new Matrix();
        this.f15212h = 0.0f;
        this.f15213i = 0.0f;
        this.f15214j = 0.0f;
        this.f15215k = 0.0f;
        this.l = 255;
        this.m = null;
        this.f15216n = null;
        this.f15217o = new u.e(0);
        this.f15211g = new i();
        this.f15205a = new Path();
        this.f15206b = new Path();
    }

    public l(l lVar) {
        this.f15207c = new Matrix();
        this.f15212h = 0.0f;
        this.f15213i = 0.0f;
        this.f15214j = 0.0f;
        this.f15215k = 0.0f;
        this.l = 255;
        this.m = null;
        this.f15216n = null;
        u.e eVar = new u.e(0);
        this.f15217o = eVar;
        this.f15211g = new i(lVar.f15211g, eVar);
        this.f15205a = new Path(lVar.f15205a);
        this.f15206b = new Path(lVar.f15206b);
        this.f15212h = lVar.f15212h;
        this.f15213i = lVar.f15213i;
        this.f15214j = lVar.f15214j;
        this.f15215k = lVar.f15215k;
        this.l = lVar.l;
        this.m = lVar.m;
        String str = lVar.m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f15216n = lVar.f15216n;
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f3;
        int i13;
        Matrix matrix2 = iVar.f15190a;
        ArrayList arrayList = iVar.f15191b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f15190a;
        matrix3.preConcat(iVar.f15199j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else {
                if (jVar instanceof k) {
                    k kVar = (k) jVar;
                    float f10 = i10 / this.f15214j;
                    float f11 = i11 / this.f15215k;
                    float fMin = Math.min(f10, f11);
                    Matrix matrix4 = this.f15207c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f10, f11);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    boolean z10 = c10;
                    i12 = i14;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f12 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f12) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f15205a;
                        path.reset();
                        q4.c[] cVarArr = kVar.f15201a;
                        if (cVarArr != null) {
                            q4.c.b(cVarArr, path);
                        }
                        Path path2 = this.f15206b;
                        path2.reset();
                        if (kVar instanceof g) {
                            path2.setFillType(kVar.f15203c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            h hVar = (h) kVar;
                            float f13 = hVar.f15186i;
                            if (f13 != 0.0f || hVar.f15187j != 1.0f) {
                                float f14 = hVar.f15188k;
                                float f15 = (f13 + f14) % 1.0f;
                                float f16 = (hVar.f15187j + f14) % 1.0f;
                                if (this.f15210f == null) {
                                    this.f15210f = new PathMeasure();
                                }
                                this.f15210f.setPath(path, z10);
                                float length = this.f15210f.getLength();
                                float f17 = f15 * length;
                                float f18 = f16 * length;
                                path.reset();
                                if (f17 > f18) {
                                    this.f15210f.getSegment(f17, length, path, true);
                                    f3 = 0.0f;
                                    this.f15210f.getSegment(0.0f, f18, path, true);
                                } else {
                                    f3 = 0.0f;
                                    this.f15210f.getSegment(f17, f18, path, true);
                                }
                                path.rLineTo(f3, f3);
                            }
                            path2.addPath(path, matrix4);
                            c50.h hVar2 = hVar.f15183f;
                            float f19 = 255.0f;
                            if (((Shader) hVar2.C) == null && hVar2.B == 0) {
                                f19 = 255.0f;
                                i13 = 16777215;
                            } else {
                                if (this.f15209e == null) {
                                    i13 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f15209e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i13 = 16777215;
                                }
                                Paint paint2 = this.f15209e;
                                Shader shader = (Shader) hVar2.C;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(hVar.f15185h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i15 = hVar2.B;
                                    float f20 = hVar.f15185h;
                                    PorterDuff.Mode mode = o.J;
                                    paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f20)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(hVar.f15203c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            c50.h hVar3 = hVar.f15181d;
                            if (((Shader) hVar3.C) != null || hVar3.B != 0) {
                                if (this.f15208d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f15208d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f15208d;
                                Paint.Join join = hVar.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = hVar.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(hVar.f15189n);
                                Shader shader2 = (Shader) hVar3.C;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(hVar.f15184g * f19));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i16 = hVar3.B;
                                    float f21 = hVar.f15184g;
                                    PorterDuff.Mode mode2 = o.J;
                                    paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f21)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(hVar.f15182e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i14 = i12 + 1;
                c10 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.l = i10;
    }
}
