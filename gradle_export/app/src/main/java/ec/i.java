package ec;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public final class i extends b {

    public final boolean f5298q;

    public final u.q f5299r;

    public final u.q f5300s;

    public final RectF f5301t;

    public final int f5302u;

    public final int f5303v;

    public final fc.h f5304w;

    public final fc.h f5305x;

    public final fc.h f5306y;

    public i(cc.i iVar, lc.b bVar, kc.e eVar) {
        Paint.Join join;
        Paint.Join join2;
        int iB = e4.f.b(eVar.f9601g);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = e4.f.b(eVar.f9602h);
        if (iB2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iB2 != 1) {
                if (iB2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(iVar, bVar, cap, join2, eVar.f9603i, eVar.f9597c, eVar.f9600f, eVar.f9604j, eVar.f9605k);
                this.f5299r = new u.q((Object) null);
                this.f5300s = new u.q((Object) null);
                this.f5301t = new RectF();
                this.f5302u = eVar.f9595a;
                this.f5298q = eVar.l;
                this.f5303v = (int) (iVar.A.b() / 32.0f);
                fc.e eVarM0 = eVar.f9596b.m0();
                this.f5304w = (fc.h) eVarM0;
                eVarM0.a(this);
                bVar.f(eVarM0);
                fc.e eVarM1 = eVar.f9598d.m0();
                this.f5305x = (fc.h) eVarM1;
                eVarM1.a(this);
                bVar.f(eVarM1);
                fc.e eVarM2 = eVar.f9599e.m0();
                this.f5306y = (fc.h) eVarM2;
                eVarM2.a(this);
                bVar.f(eVarM2);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(iVar, bVar, cap, join2, eVar.f9603i, eVar.f9597c, eVar.f9600f, eVar.f9604j, eVar.f9605k);
        this.f5299r = new u.q((Object) null);
        this.f5300s = new u.q((Object) null);
        this.f5301t = new RectF();
        this.f5302u = eVar.f9595a;
        this.f5298q = eVar.l;
        this.f5303v = (int) (iVar.A.b() / 32.0f);
        fc.e eVarM3 = eVar.f9596b.m0();
        this.f5304w = (fc.h) eVarM3;
        eVarM3.a(this);
        bVar.f(eVarM3);
        fc.e eVarM4 = eVar.f9598d.m0();
        this.f5305x = (fc.h) eVarM4;
        eVarM4.a(this);
        bVar.f(eVarM4);
        fc.e eVarM5 = eVar.f9599e.m0();
        this.f5306y = (fc.h) eVarM5;
        eVarM5.a(this);
        bVar.f(eVarM5);
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        Shader radialGradient;
        if (this.f5298q) {
            return;
        }
        c(this.f5301t, matrix, false);
        int i11 = this.f5302u;
        fc.h hVar = this.f5304w;
        fc.h hVar2 = this.f5306y;
        fc.h hVar3 = this.f5305x;
        if (i11 == 1) {
            long jF = f();
            u.q qVar = this.f5299r;
            radialGradient = (LinearGradient) qVar.b(jF);
            if (radialGradient == null) {
                PointF pointF = (PointF) hVar3.e();
                PointF pointF2 = (PointF) hVar2.e();
                kc.c cVar = (kc.c) hVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, cVar.f9587b, cVar.f9586a, Shader.TileMode.CLAMP);
                qVar.e(radialGradient, jF);
            }
        } else {
            long jF2 = f();
            u.q qVar2 = this.f5300s;
            radialGradient = (RadialGradient) qVar2.b(jF2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) hVar3.e();
                PointF pointF4 = (PointF) hVar2.e();
                kc.c cVar2 = (kc.c) hVar.e();
                int[] iArr = cVar2.f9587b;
                float[] fArr = cVar2.f9586a;
                float f3 = pointF3.x;
                float f10 = pointF3.y;
                radialGradient = new RadialGradient(f3, f10, (float) Math.hypot(pointF4.x - f3, pointF4.y - f10), iArr, fArr, Shader.TileMode.CLAMP);
                qVar2.e(radialGradient, jF2);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.f5252i.setShader(radialGradient);
        super.d(canvas, matrix, i10);
    }

    public final int f() {
        float f3 = this.f5305x.f5599d;
        float f10 = this.f5303v;
        int iRound = Math.round(f3 * f10);
        int iRound2 = Math.round(this.f5306y.f5599d * f10);
        int iRound3 = Math.round(this.f5304w.f5599d * f10);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
