package sm;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;

public final class i0 implements u00.k {
    public final float A;
    public final long B;
    public final float C;

    public i0(float f, float f2, long j) {
        this.A = f;
        this.B = j;
        this.C = f2;
    }

    @Override
    public final Object invoke(Object obj) {
        jk.f drawPlainBackdrop = (jk.f) obj;
        kotlin.jvm.internal.m.e(drawPlainBackdrop, "$this$drawPlainBackdrop");
        ca.v.p(drawPlainBackdrop, drawPlainBackdrop.A * this.A);
        RuntimeShader runtimeShaderA = drawPlainBackdrop.G.a("AlphaMask", "\nuniform shader content;\n\nuniform float2 size;\nlayout(color) uniform half4 tint;\nuniform float tintIntensity;\n\nhalf4 main(float2 coord) {\n\n    float alpha = smoothstep(\n        size.y * 0.5,\n        size.y,\n        coord.y\n    );\n\n    half4 blurred = content.eval(coord) * alpha;\n\n    half4 tinted = tint * alpha;\n\n    return mix(\n        blurred,\n        tinted,\n        tintIntensity\n    );\n}\n");
        runtimeShaderA.setFloatUniform("size", Float.intBitsToFloat((int) (drawPlainBackdrop.C >> 32)), Float.intBitsToFloat((int) (drawPlainBackdrop.C & 4294967295L)));
        runtimeShaderA.setColorUniform("tint", i2.b0.C(this.B));
        runtimeShaderA.setFloatUniform("tintIntensity", this.C);
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderA, "content");
        kotlin.jvm.internal.m.d(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
        RenderEffect renderEffect = drawPlainBackdrop.F;
        if (renderEffect != null) {
            renderEffectCreateRuntimeShaderEffect = RenderEffect.createChainEffect(renderEffectCreateRuntimeShaderEffect, renderEffect);
        }
        drawPlainBackdrop.F = renderEffectCreateRuntimeShaderEffect;
        return g00.b0.a;
    }
}
