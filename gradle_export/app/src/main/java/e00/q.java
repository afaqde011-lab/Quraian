package e00;

import a1.e1;
import ab.a0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import b3.o0;
import d00.r0;
import h1.g0;
import i2.b0;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.z;
import l1.p2;
import l1.z0;
import m3.h0;
import m3.q0;
import u.j0;

public final class q implements u00.k {
    public final int A;
    public final long B;
    public final Object C;
    public final Object D;
    public final Object E;

    public q(long j, kotlin.jvm.internal.w wVar, t tVar, r0 r0Var) {
        this.A = 0;
        this.B = j;
        this.C = wVar;
        this.D = tVar;
        this.E = r0Var;
    }

    public q(long j, float[] fArr, x xVar, kotlin.jvm.internal.w wVar) {
        this.A = 2;
        this.B = j;
        this.D = fArr;
        this.E = xVar;
        this.C = wVar;
    }

    public q(Object obj, Object obj2, long j, Object obj3, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.B = j;
        this.E = obj3;
    }

    public q(u00.k kVar, long j, z0 z0Var, z0 z0Var2) {
        this.A = 3;
        this.C = kVar;
        this.B = j;
        this.D = z0Var;
        this.E = z0Var2;
    }

    @Override
    public final Object invoke(Object obj) throws Throwable {
        long j;
        long j2;
        Iterator it;
        Context context;
        i2.e eVar;
        i2.e eVar2;
        a1.i iVar;
        long j3;
        float[] fArr;
        long j4;
        boolean z;
        float fA;
        float fA2;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.C;
                t tVar = (t) this.D;
                r0 r0Var = (r0) this.E;
                k2.d record = (k2.d) obj;
                kotlin.jvm.internal.m.e(record, "$this$record");
                long j5 = this.B;
                long j6 = j5 ^ (-9223372034707292160L);
                long jG = h2.e.g(wVar.A, record.b());
                d dVar = tVar.a;
                Context context2 = tVar.c;
                w00.a.p(record, j6, jG, dVar.f(), new e1(tVar, 14));
                long jB = record.b();
                float f = 2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB >> 32)) + (Math.max(Float.intBitsToFloat((int) (j5 >> 32)), 0.0f) * f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)) + (Math.max(Float.intBitsToFloat((int) (j5 & 4294967295L)), 0.0f) * f))) & 4294967295L);
                float fN = dVar.n();
                if (fN > 0.0f) {
                    j = 9187343241974906880L;
                    if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
                        context = context2;
                        if (h2.b.b(j6, 0L)) {
                            j2 = j6;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                            j2 = j6;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                            ((hf.c) record.G0().B).I(fIntBitsToFloat, fIntBitsToFloat2);
                            try {
                                me.i iVar2 = n.a;
                                i2.e eVarA = n.a(iVar2);
                                try {
                                    eVarA.a.setAntiAlias(true);
                                    eVarA.c(a0.x(fN, 0.0f, 1.0f));
                                    Bitmap bitmapO = w50.c.O(context);
                                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                                    BitmapShader bitmapShader = new BitmapShader(bitmapO, tileMode, tileMode);
                                    float f2 = wVar.A;
                                    float f3 = f2 > 0.0f ? f2 : 1.0f;
                                    if (Math.abs(f3 - 1.0f) >= 0.001f) {
                                        Matrix matrix = new Matrix();
                                        float f4 = 1.0f / f3;
                                        matrix.setScale(f4, f4);
                                        bitmapShader.setLocalMatrix(matrix);
                                    }
                                    eVarA.i(bitmapShader);
                                    eVarA.d(9);
                                    i2.s sVarN = record.G0().n();
                                    h2.c cVarG = bi.b.g(0L, jFloatToRawIntBits);
                                    sVarN.getClass();
                                    try {
                                        sVarN.a(cVarG.a, cVarG.b, cVarG.c, cVarG.d, eVarA);
                                        b0.o(eVarA).reset();
                                        j0 j0Var = (j0) iVar2.B;
                                        if (j0Var.d < 3) {
                                            j0Var.j(eVarA);
                                        }
                                        ((hf.c) record.G0().B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                    } catch (Throwable th) {
                                        th = th;
                                        eVar2 = eVarA;
                                        b0.o(eVar2).reset();
                                        j0 j0Var2 = (j0) iVar2.B;
                                        if (j0Var2.d < 3) {
                                            j0Var2.j(eVar2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    eVar2 = eVarA;
                                }
                            } catch (Throwable th3) {
                                ((hf.c) record.G0().B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                throw th3;
                            }
                        }
                    } else {
                        context = context2;
                        j2 = j6;
                    }
                    me.i iVar3 = n.a;
                    i2.e eVarA2 = n.a(iVar3);
                    j0 j0Var3 = (j0) iVar3.B;
                    try {
                        eVarA2.a.setAntiAlias(true);
                        eVarA2.c(a0.x(fN, 0.0f, 1.0f));
                        Bitmap bitmapO2 = w50.c.O(context);
                        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                        BitmapShader bitmapShader2 = new BitmapShader(bitmapO2, tileMode2, tileMode2);
                        float f5 = wVar.A;
                        float f6 = f5 > 0.0f ? f5 : 1.0f;
                        if (Math.abs(f6 - 1.0f) >= 0.001f) {
                            Matrix matrix2 = new Matrix();
                            float f7 = 1.0f / f6;
                            matrix2.setScale(f7, f7);
                            bitmapShader2.setLocalMatrix(matrix2);
                        }
                        eVarA2.i(bitmapShader2);
                        eVarA2.d(9);
                        i2.s sVarN2 = record.G0().n();
                        h2.c cVarG2 = bi.b.g(0L, jFloatToRawIntBits);
                        sVarN2.getClass();
                        try {
                            sVarN2.a(cVarG2.a, cVarG2.b, cVarG2.c, cVarG2.d, eVarA2);
                            b0.o(eVarA2).reset();
                            if (j0Var3.d < 3) {
                                j0Var3.j(eVarA2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eVar = eVarA2;
                            b0.o(eVar).reset();
                            if (j0Var3.d < 3) {
                                j0Var3.j(eVar);
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        eVar = eVarA2;
                    }
                } else {
                    j = 9187343241974906880L;
                    j2 = j6;
                }
                if (((((j2 & j) ^ j) - 4294967297L) & (-9223372034707292160L)) == 0) {
                    long j7 = j2;
                    if (h2.b.b(j7, 0L)) {
                        it = dVar.l().iterator();
                        while (it.hasNext()) {
                            w00.a.q(record, (m) it.next(), r0Var, j5, jFloatToRawIntBits);
                        }
                    } else {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                        ((hf.c) record.G0().B).I(fIntBitsToFloat3, fIntBitsToFloat4);
                        try {
                            Iterator it2 = dVar.l().iterator();
                            while (it2.hasNext()) {
                                long j8 = j5;
                                w00.a.q(record, (m) it2.next(), r0Var, j8, jFloatToRawIntBits);
                                j5 = j8;
                            }
                            ((hf.c) record.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        } catch (Throwable th6) {
                            ((hf.c) record.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            throw th6;
                        }
                    }
                } else {
                    it = dVar.l().iterator();
                    while (it.hasNext()) {
                        w00.a.q(record, (m) it.next(), r0Var, j5, jFloatToRawIntBits);
                    }
                }
                return g00.b0.a;
            case 1:
                g0 g0Var = (g0) this.C;
                p2 p2Var = (p2) this.D;
                long j9 = this.B;
                i2.g gVar = (i2.g) this.E;
                k2.d dVar2 = (k2.d) obj;
                float fInvoke = g0Var.invoke();
                float fMax = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5) / 3;
                float fX = a0.x(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fX - (((float) Math.pow(fX, 2)) / 4))) * 0.5f;
                float f8 = 360;
                float f9 = fPow * f8;
                float f11 = ((0.8f * fMax) + fPow) * f8;
                float fMin = Math.min(1.0f, fMax);
                gg.e eVar3 = new gg.e();
                eVar3.A = f11;
                eVar3.B = fMin;
                float fFloatValue = ((Number) p2Var.getValue()).floatValue();
                long jY0 = dVar2.Y0();
                a1.i iVarG0 = dVar2.G0();
                long jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    ((hf.c) iVarG0.B).F(fPow, jY0);
                    float fA0 = dVar2.A0(j1.k.b);
                    float f12 = j1.k.a;
                    float fA1 = (dVar2.A0(f12) / 2.0f) + fA0;
                    long jX = ca.v.x(dVar2.b());
                    int i = (int) (jX >> 32);
                    int i2 = (int) (jX & 4294967295L);
                    try {
                        h2.c cVar = new h2.c(Float.intBitsToFloat(i) - fA1, Float.intBitsToFloat(i2) - fA1, Float.intBitsToFloat(i) + fA1, Float.intBitsToFloat(i2) + fA1);
                        float f13 = f11 - f9;
                        long jE = cVar.e();
                        long jD = cVar.d();
                        k2.h hVar = new k2.h(dVar2.A0(f12), 0.0f, 0, 0, (i2.h) null, 26);
                        iVar = iVarG0;
                        try {
                            k2.d.n1(dVar2, j9, f9, f13, jE, jD, fFloatValue, hVar, 768);
                            j1.k.c(dVar2, gVar, cVar, j9, fFloatValue, eVar3);
                            w.c.t(iVar, jQ);
                        } catch (Throwable th7) {
                            th = th7;
                            j3 = jQ;
                            w.c.t(iVar, j3);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        iVar = iVarG0;
                        j3 = jQ;
                        w.c.t(iVar, j3);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    iVar = iVarG0;
                }
                break;
            case 2:
                float[] fArr2 = (float[]) this.D;
                x xVar = (x) this.E;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.C;
                m3.s sVar = (m3.s) obj;
                int i3 = sVar.b;
                m3.b bVar = sVar.a;
                int iF = sVar.c;
                long j11 = this.B;
                int iG = i3 > q0.g(j11) ? sVar.b : q0.g(j11);
                if (iF >= q0.f(j11)) {
                    iF = q0.f(j11);
                }
                long jB2 = h0.b(sVar.d(iG), sVar.d(iF));
                int i4 = xVar.A;
                n3.i iVar4 = bVar.d;
                int iG2 = q0.g(jB2);
                int iF2 = q0.f(jB2);
                Layout layout = iVar4.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    s3.a.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    s3.a.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    s3.a.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    s3.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iF2 - iG2) * 4) {
                    s3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iG2);
                int lineForOffset2 = layout.getLineForOffset(iF2 - 1);
                i3.f fVar = new i3.f(iVar4);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = iVar4.f(lineForOffset);
                        int iMax = Math.max(iG2, lineStart);
                        int iMin = Math.min(iF2, iF3);
                        float fG = iVar4.g(lineForOffset);
                        float fE = iVar4.e(lineForOffset);
                        int i5 = i4;
                        fArr = fArr2;
                        j4 = jB2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i6 = i5;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = fVar.a(iMax, false, false, false);
                                    z = z3;
                                    fA = fVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = fVar.a(iMax, false, false, false);
                                        fA2 = fVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = fVar.a(iMax, false, false, true);
                                        fA = fVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i6] = fA;
                                fArr[i6 + 1] = fG;
                                fArr[i6 + 2] = fA2;
                                fArr[i6 + 3] = fE;
                                i6 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = fVar.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = fVar.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i6] = fA;
                            fArr[i6 + 1] = fG;
                            fArr[i6 + 2] = fA2;
                            fArr[i6 + 3] = fE;
                            i6 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i4 = i6;
                            fArr2 = fArr;
                            jB2 = j4;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j4 = jB2;
                }
                int iE = (q0.e(j4) * 4) + xVar.A;
                for (int i7 = xVar.A; i7 < iE; i7 += 4) {
                    int i8 = i7 + 1;
                    float f14 = fArr[i8];
                    float f15 = wVar2.A;
                    fArr[i8] = f14 + f15;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f15;
                }
                xVar.A = iE;
                wVar2.A = bVar.b() + wVar2.A;
                break;
            case 3:
                u00.k kVar = (u00.k) this.C;
                z0 z0Var = (z0) this.D;
                z0 z0Var2 = (z0) this.E;
                float fFloatValue2 = ((Float) obj).floatValue();
                z0Var.setValue((Object) null);
                z0Var2.setValue(Boolean.FALSE);
                kVar.invoke(Long.valueOf((long) (fFloatValue2 * this.B)));
                break;
            default:
                h2.c cVar2 = (h2.c) this.C;
                z zVar = (z) this.D;
                long j12 = this.B;
                i2.m mVar = (i2.m) this.E;
                o0 o0Var = (o0) obj;
                o0Var.a();
                float f16 = cVar2.a;
                float f17 = cVar2.b;
                k2.b bVar2 = o0Var.A;
                ((hf.c) bVar2.B.B).I(f16, f17);
                try {
                    k2.d.y(o0Var, (i2.d) zVar.A, j12, 0L, 0.0f, mVar, 0, 890);
                } finally {
                    ((hf.c) bVar2.B.B).I(-f16, -f17);
                }
                break;
        }
        return g00.b0.a;
    }
}
