package mk;

import android.graphics.RuntimeShader;
import android.graphics.Shader;
import b3.o0;
import com.google.android.gms.internal.measurement.y3;
import i2.t;
import jk.j;
import jk.k;
import kotlin.jvm.internal.m;

public final class d implements h {

    public final long f10934b = t.b(0.38f, t.f7163c);

    public final int f10935c = 3;

    @Override
    public final long a() {
        return this.f10934b;
    }

    @Override
    public final Shader b(o0 o0Var, k kVar, j jVar) {
        m.e(jVar, "runtimeShaderCache");
        RuntimeShader runtimeShaderA = jVar.a("Ambient", "\nuniform float2 size;\nuniform float4 cornerRadii;\nuniform float angle;\nuniform float falloff;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = coord - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = gradSdRoundedRect(centeredCoord, halfSize, gradRadius);\n    float2 normal = float2(cos(angle), sin(angle));\n    float d = dot(grad, normal);\n    float intensity = pow(abs(d), falloff);\n    float t = step(0.0, d);\n    return half4(t, t, t, 1.0) * intensity;\n}");
        k2.b bVar = o0Var.A;
        runtimeShaderA.setFloatUniform("size", Float.intBitsToFloat((int) (bVar.b() >> 32)), Float.intBitsToFloat((int) (bVar.b() & 4294967295L)));
        runtimeShaderA.setFloatUniform("cornerRadii", y3.l(o0Var, kVar));
        runtimeShaderA.setFloatUniform("angle", 0.7853982f);
        runtimeShaderA.setFloatUniform("falloff", 1.0f);
        return runtimeShaderA;
    }

    @Override
    public final int c() {
        return this.f10935c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(0.38f, 0.38f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.38f);
    }

    public final String toString() {
        return "Ambient(intensity=0.38)";
    }
}
