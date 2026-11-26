package mk;

import android.graphics.RuntimeShader;
import android.graphics.Shader;
import b3.o0;
import com.google.android.gms.internal.measurement.y3;
import i2.b0;
import i2.l;
import i2.t;
import jk.j;
import jk.k;
import kotlin.jvm.internal.m;

public final class f implements h {

    public final long f10940b;

    public final int f10941c;

    public final float f10942d;

    public final float f10943e;

    public f(long j9, int i10) {
        this.f10940b = (i10 & 1) != 0 ? t.b(0.5f, t.f7163c) : j9;
        this.f10941c = 12;
        this.f10942d = 45.0f;
        this.f10943e = 1.0f;
    }

    @Override
    public final long a() {
        return this.f10940b;
    }

    @Override
    public final Shader b(o0 o0Var, k kVar, j jVar) {
        m.e(jVar, "runtimeShaderCache");
        RuntimeShader runtimeShaderA = jVar.a("Default", "\nuniform float2 size;\nuniform float4 cornerRadii;\nlayout(color) uniform half4 color;\nuniform float angle;\nuniform float falloff;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = coord - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = gradSdRoundedRect(centeredCoord, halfSize, gradRadius);\n    float2 normal = float2(cos(angle), sin(angle));\n    float d = dot(grad, normal);\n    float intensity = pow(abs(d), falloff);\n    return color * intensity;\n}");
        k2.b bVar = o0Var.A;
        runtimeShaderA.setFloatUniform("size", Float.intBitsToFloat((int) (bVar.b() >> 32)), Float.intBitsToFloat((int) (bVar.b() & 4294967295L)));
        runtimeShaderA.setFloatUniform("cornerRadii", y3.l(o0Var, kVar));
        runtimeShaderA.setColorUniform("color", b0.C(t.b(1.0f, this.f10940b)));
        runtimeShaderA.setFloatUniform("angle", this.f10942d * 0.017453292f);
        runtimeShaderA.setFloatUniform("falloff", this.f10943e);
        return runtimeShaderA;
    }

    @Override
    public final int c() {
        return this.f10941c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.c(this.f10940b, fVar.f10940b) && this.f10941c == fVar.f10941c && Float.compare(this.f10942d, fVar.f10942d) == 0 && Float.compare(this.f10943e, fVar.f10943e) == 0;
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Float.hashCode(this.f10943e) + w.c.c(this.f10942d, w.c.d(this.f10941c, Long.hashCode(this.f10940b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("Default(color=", t.i(this.f10940b), ", blendMode=", l.a(this.f10941c), ", angle=");
        sbS.append(this.f10942d);
        sbS.append(", falloff=");
        sbS.append(this.f10943e);
        sbS.append(")");
        return sbS.toString();
    }
}
