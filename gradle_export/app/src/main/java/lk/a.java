package lk;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import jk.f;
import kotlin.jvm.internal.m;

public abstract class a {

    public static final ColorMatrixColorFilter f10316a = new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.3935f, -0.3575f, -0.036f, 0.0f, 0.0f, -0.1065f, 1.1425f, -0.036f, 0.0f, 0.0f, -0.1065f, -0.3575f, 1.464f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));

    public static final void a(f fVar) {
        m.e(fVar, "<this>");
        ColorMatrixColorFilter colorMatrixColorFilter = f10316a;
        m.e(colorMatrixColorFilter, "colorFilter");
        RenderEffect renderEffect = fVar.F;
        fVar.F = renderEffect != null ? RenderEffect.createColorFilterEffect(colorMatrixColorFilter, renderEffect) : RenderEffect.createColorFilterEffect(colorMatrixColorFilter);
    }
}
