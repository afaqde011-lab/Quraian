package c4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c3.k1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.z0;
import z2.p1;

public final class g extends kotlin.jvm.internal.n implements u00.k {
    public final int A = 0;
    public final u00.a B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public g(z zVar, u00.a aVar, c0 c0Var, String str, y3.m mVar) {
        super(1);
        this.C = zVar;
        this.B = aVar;
        this.D = c0Var;
        this.E = str;
        this.F = mVar;
    }

    public g(cc.a aVar, Matrix matrix, cc.i iVar, u00.a aVar2, z0 z0Var) {
        super(1);
        this.C = aVar;
        this.D = matrix;
        this.E = iVar;
        this.B = aVar2;
        this.F = z0Var;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        int i10 = this.A;
        Object obj2 = this.F;
        u00.a aVar = this.B;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i10) {
            case 0:
                z zVar = (z) obj5;
                zVar.P.addView(zVar, zVar.Q);
                zVar.n(aVar, (c0) obj4, (String) obj3, (y3.m) obj2);
                return new k1(zVar, 2);
            default:
                k2.d dVar = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar, "$this$Canvas");
                cc.a aVar2 = (cc.a) obj5;
                Matrix matrix = (Matrix) obj4;
                cc.i iVar = (cc.i) obj3;
                z0 z0Var = (z0) obj2;
                i2.s sVarN = dVar.G0().n();
                long jI = ca.v.i(aVar2.f3114i.width(), aVar2.f3114i.height());
                long jF = (((long) w00.a.F(h2.e.e(dVar.b()))) << 32) | (((long) w00.a.F(h2.e.b(dVar.b()))) & 4294967295L);
                float fD = z2.d0.d(jI, dVar.b());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fD)) << 32);
                int i11 = p1.f17155a;
                float fE = h2.e.e(jI);
                int i12 = p1.f17155a;
                int i13 = (int) (jFloatToRawIntBits >> 32);
                int i14 = (int) (jFloatToRawIntBits & 4294967295L);
                long jIntBitsToFloat = (((long) ((int) (Float.intBitsToFloat(i13) * fE))) << 32) | (((long) ((int) (Float.intBitsToFloat(i14) * h2.e.b(jI)))) & 4294967295L);
                float f3 = (((int) (jF >> 32)) - ((int) (jIntBitsToFloat >> 32))) / 2.0f;
                float f10 = 1;
                long jRound = (((long) Math.round((f10 + 0.0f) * ((((int) (jF & 4294967295L)) - ((int) (jIntBitsToFloat & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round(((dVar.getLayoutDirection() == y3.m.A ? 0.0f : (-1) * 0.0f) + f10) * f3)) << 32);
                matrix.reset();
                matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
                matrix.preScale(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
                iVar.getClass();
                iVar.Y = 1;
                iVar.a();
                ArrayList arrayList = iVar.D;
                oc.c cVar = iVar.B;
                if (iVar.A != aVar2) {
                    iVar.W = true;
                    if (cVar.M) {
                        cVar.cancel();
                        if (!iVar.isVisible()) {
                            iVar.X = 1;
                        }
                    }
                    iVar.A = null;
                    iVar.H = null;
                    iVar.E = null;
                    cVar.L = null;
                    cVar.J = -2.1474836E9f;
                    cVar.K = 2.1474836E9f;
                    iVar.invalidateSelf();
                    iVar.A = aVar2;
                    cc.a aVar3 = iVar.A;
                    if (aVar3 != null) {
                        h7.b bVar = mc.q.f10855a;
                        Rect rect = aVar3.f3114i;
                        List list = Collections.EMPTY_LIST;
                        lc.c cVar2 = new lc.c(iVar, new lc.e(list, aVar3, "__container", -1L, 1, -1L, null, list, new jc.d(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null), aVar3.f3113h, aVar3);
                        iVar.H = cVar2;
                        cVar2.E = iVar.G;
                    }
                    boolean z10 = cVar.L == null;
                    cVar.L = aVar2;
                    if (z10) {
                        cVar.h(Math.max(cVar.J, aVar2.f3115j), Math.min(cVar.K, aVar2.f3116k));
                    } else {
                        cVar.h((int) aVar2.f3115j, (int) aVar2.f3116k);
                    }
                    float f11 = cVar.H;
                    cVar.H = 0.0f;
                    cVar.G = 0.0f;
                    cVar.g((int) f11);
                    cVar.e();
                    iVar.g(cVar.getAnimatedFraction());
                    Iterator it = new ArrayList(arrayList).iterator();
                    while (it.hasNext()) {
                        cc.h hVar = (cc.h) it.next();
                        if (hVar != null) {
                            hVar.run();
                        }
                        it.remove();
                    }
                    arrayList.clear();
                    aVar2.f3106a.getClass();
                    iVar.a();
                    Drawable.Callback callback = iVar.getCallback();
                    if (callback instanceof ImageView) {
                        ImageView imageView = (ImageView) callback;
                        imageView.setImageDrawable(null);
                        imageView.setImageDrawable(iVar);
                    }
                }
                if (z0Var.getValue() != null) {
                    throw new ClassCastException();
                }
                if (true != iVar.G) {
                    iVar.G = true;
                    lc.c cVar3 = iVar.H;
                    if (cVar3 != null) {
                        cVar3.E = true;
                    }
                    iVar.invalidateSelf();
                }
                iVar.g(((Number) aVar.invoke()).floatValue());
                iVar.setBounds(0, 0, aVar2.f3114i.width(), aVar2.f3114i.height());
                Canvas canvasA = i2.b.a(sVarN);
                lc.c cVar4 = iVar.H;
                cc.a aVar4 = iVar.A;
                if (cVar4 != null && aVar4 != null) {
                    if (iVar.J) {
                        canvasA.save();
                        canvasA.concat(matrix);
                        iVar.d(canvasA, cVar4);
                        canvasA.restore();
                    } else {
                        cVar4.d(canvasA, matrix, iVar.I);
                    }
                    iVar.W = false;
                }
                return g00.b0.a;
        }
    }
}
