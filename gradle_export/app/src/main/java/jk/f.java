package jk;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import y3.m;

public final class f implements j, y3.c {
    public float E;
    public RenderEffect F;
    public final g H;
    public float A = 1.0f;
    public float B = 1.0f;
    public long C = 9205357640488583168L;
    public m D = m.A;
    public final a8.l G = new a8.l(4);

    public f(g gVar) {
        this.H = gVar;
    }

    @Override
    public final RuntimeShader a(String str, String str2) {
        return this.G.a(str, str2);
    }

    @Override
    public final float c() {
        return this.A;
    }

    @Override
    public final float t0() {
        return this.B;
    }
}
