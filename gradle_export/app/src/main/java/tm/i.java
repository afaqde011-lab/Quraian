package tm;

import a1.g2;
import a40.z;
import android.graphics.RuntimeShader;
import b2.o;
import b2.r;
import kotlin.jvm.internal.m;
import sm.p;
import u00.n;
import v2.f0;
import x.b1;

public final class i {
    public final z a;
    public final n b;
    public final b1 c;
    public final b1 d;
    public final x.b e;
    public final x.b f;
    public long g;
    public final RuntimeShader h;
    public final r i;
    public final r j;

    public i(z zVar) {
        this(zVar, new sw.a(5));
    }

    public i(z animationScope, n nVar) {
        m.e(animationScope, "animationScope");
        this.a = animationScope;
        this.b = nVar;
        this.c = new b1(0.5f, 300.0f, Float.valueOf(0.001f));
        this.d = new b1(0.5f, 300.0f, new h2.b((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)));
        this.e = x.c.a(0.0f, 0.001f);
        this.f = new x.b(new h2.b(0L), x.c.p, new h2.b((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 8);
        this.g = 0L;
        this.h = new RuntimeShader("\nuniform float2 size;\nlayout(color) uniform half4 color;\nuniform float radius;\nuniform float2 position;\n\nhalf4 main(float2 coord) {\n    float dist = distance(coord, position);\n    float intensity = smoothstep(radius, radius * 0.5, dist);\n    return color * intensity;\n}");
        p pVar = new p(this, 2);
        o oVar = o.A;
        this.i = f2.h.g(oVar, pVar);
        this.j = f0.b(oVar, animationScope, new g2(this, 6));
    }
}
