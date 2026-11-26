package e00;

import ab.a0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import d00.c0;
import d00.d0;
import d00.e0;
import d00.f0;
import d00.g0;
import d00.h0;
import d00.r0;
import d00.x;
import d00.y;
import d00.z;
import i2.b0;
import i2.p0;
import java.util.List;

public abstract class e {
    public static final Object a = rd.a.I(g00.i.C, new a2.f(29));

    public static final p0 a(r0 r0Var, p pVar) {
        Shader.TileMode tileMode;
        RenderEffect renderEffectCreateBlurEffect;
        g0 g0Var;
        ?? r15;
        z zVar;
        char c;
        ?? r2 = a;
        p0 p0Var = (p0) ((u.s) r2.getValue()).c(pVar);
        if (p0Var != null) {
            return p0Var;
        }
        Context context = h0.f(r0Var.a);
        y3.c density = b3.m.y(r0Var.a).Z;
        Object obj = b.a;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(density, "density");
        float f = pVar.a;
        float f2 = pVar.c;
        float f3 = f * f2;
        if (y3.f.a(f3, 0) < 0) {
            throw new IllegalArgumentException("blurRadius needs to be equal or greater than 0.dp");
        }
        long jG = h2.e.g(f2, pVar.d);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jG & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jG >> 32))))) << 32);
        long jG2 = h2.b.g(f2, pVar.e);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(w00.a.F(Float.intBitsToFloat((int) (jG2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(w00.a.F(Float.intBitsToFloat((int) (jG2 >> 32))))) << 32);
        float fA0 = density.A0(f3);
        int i = pVar.i;
        if (fA0 > 0.0f || fA0 > 0.0f) {
            if (i == 0) {
                tileMode = Shader.TileMode.CLAMP;
            } else if (i == 1) {
                tileMode = Shader.TileMode.REPEAT;
            } else if (i == 2) {
                tileMode = Shader.TileMode.MIRROR;
            } else {
                tileMode = i == 3 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
            }
            try {
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fA0, fA0, tileMode);
                kotlin.jvm.internal.m.d(renderEffectCreateBlurEffect, "createBlurEffect(...)");
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Error whilst creating blur effect. This is likely because this device does not support a blur radius of x=" + fA0 + "px, y=" + fA0 + "px", e);
            }
        } else {
            renderEffectCreateBlurEffect = null;
        }
        if (renderEffectCreateBlurEffect == null) {
            renderEffectCreateBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            kotlin.jvm.internal.m.d(renderEffectCreateBlurEffect, "createOffsetEffect(...)");
        }
        float f4 = pVar.b;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        Bitmap bitmapO = w50.c.O(context);
        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapO, tileMode2, tileMode2);
        if (Math.abs(f2 - 1.0f) >= 0.001f) {
            Matrix matrix = new Matrix();
            float f5 = 1.0f / f2;
            matrix.setScale(f5, f5);
            bitmapShader.setLocalMatrix(matrix);
        }
        float fX = a0.x(f4, 0.0f, 1.0f);
        RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
        kotlin.jvm.internal.m.d(renderEffectCreateShaderEffect, "createShaderEffect(...)");
        if (fX < 1.0f) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setScale(1.0f, 1.0f, 1.0f, fX);
            renderEffectCreateShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateShaderEffect);
        }
        kotlin.jvm.internal.m.b(renderEffectCreateShaderEffect);
        z zVar2 = z.a;
        RenderEffect renderEffectA = h0.a(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect, zVar2, 9205357640488583168L);
        List list = pVar.f;
        float f6 = pVar.g;
        int size = list.size();
        int i2 = 0;
        ?? r3 = r2;
        while (true) {
            g0Var = d00.l.a;
            if (i2 >= size) {
                break;
            }
            m mVar = (m) list.get(i2);
            if (mVar.a() && (mVar instanceof k)) {
                k kVar = (k) mVar;
                r15 = r3;
                zVar = zVar2;
                long jB = kVar.a;
                int i3 = kVar.b;
                if (f6 < 1.0f) {
                    jB = i2.t.b(i2.t.d(jB) * f6, jB);
                }
                r15 = r15;
                if (i2.t.d(jB) >= 0.005f) {
                    int iC = b0.C(jB);
                    if (i3 == 0) {
                        g0Var = d00.d.a;
                    } else {
                        if (i3 == 1) {
                            g0Var = d00.a0.a;
                        } else {
                            c = 2;
                            if (i3 == 2) {
                                g0Var = d00.j.a;
                            } else if (i3 == 3) {
                                g0Var = e0.a;
                            } else if (i3 == 4) {
                                g0Var = d00.n.a;
                            } else if (i3 == 5) {
                                g0Var = c0.a;
                            } else if (i3 != 6) {
                                if (i3 == 7) {
                                    g0Var = d0.a;
                                } else if (i3 == 8) {
                                    g0Var = d00.m.a;
                                } else if (i3 == 9) {
                                    g0Var = d00.b0.a;
                                } else if (i3 == 10) {
                                    g0Var = d00.k.a;
                                } else if (i3 == 11) {
                                    g0Var = f0.a;
                                } else if (i3 == 12) {
                                    g0Var = d00.w.a;
                                } else if (i3 == 13) {
                                    g0Var = d00.t.a;
                                } else if (i3 == 14) {
                                    g0Var = y.a;
                                } else if (i3 == 15) {
                                    g0Var = d00.v.a;
                                } else if (i3 == 16) {
                                    g0Var = d00.h.a;
                                } else if (i3 == 17) {
                                    g0Var = d00.r.a;
                                } else if (i3 == 18) {
                                    g0Var = d00.g.a;
                                } else if (i3 == 19) {
                                    g0Var = d00.f.a;
                                } else if (i3 == 20) {
                                    g0Var = d00.p.a;
                                } else if (i3 == 21) {
                                    g0Var = zVar;
                                } else if (i3 == 22) {
                                    g0Var = d00.i.a;
                                } else if (i3 == 23) {
                                    g0Var = d00.o.a;
                                } else if (i3 == 24) {
                                    g0Var = d00.u.a;
                                } else if (i3 == 25) {
                                    g0Var = d00.q.a;
                                } else if (i3 == 26) {
                                    g0Var = x.a;
                                } else if (i3 == 27) {
                                    g0Var = d00.e.a;
                                } else if (i3 == 28) {
                                    g0Var = d00.s.a;
                                } else {
                                    g0Var = e0.a;
                                }
                            }
                        }
                        renderEffectA = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(iC, h0.h(g0Var)), renderEffectA);
                        kotlin.jvm.internal.m.d(renderEffectA, "createColorFilterEffect(...)");
                    }
                    c = 2;
                    renderEffectA = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(iC, h0.h(g0Var)), renderEffectA);
                    kotlin.jvm.internal.m.d(renderEffectA, "createColorFilterEffect(...)");
                }
                i2++;
                r3 = r15;
                zVar2 = zVar;
                list = list;
            } else {
                r15 = r3;
                zVar = zVar2;
                list = list;
            }
            c = 2;
            i2++;
            r3 = r15;
            zVar2 = zVar;
            list = list;
        }
        ?? r16 = r3;
        i2.r0 r0Var2 = pVar.h;
        if (r0Var2 != null) {
            Shader shaderB = r0Var2 instanceof i2.r0 ? r0Var2.b(jFloatToRawIntBits) : null;
            if (shaderB != null) {
                RenderEffect renderEffectCreateShaderEffect2 = RenderEffect.createShaderEffect(shaderB);
                kotlin.jvm.internal.m.d(renderEffectCreateShaderEffect2, "createShaderEffect(...)");
                renderEffectA = h0.a(renderEffectA, renderEffectCreateShaderEffect2, g0Var, jFloatToRawIntBits2);
            }
        }
        kotlin.jvm.internal.m.e(renderEffectA, "<this>");
        i2.k kVar2 = new i2.k(renderEffectA);
        ((u.s) r16.getValue()).d(pVar, kVar2);
        return kVar2;
    }
}
