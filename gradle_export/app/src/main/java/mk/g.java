package mk;

import android.graphics.Shader;
import b3.o0;
import i2.l;
import i2.t;
import jk.j;
import jk.k;
import kotlin.jvm.internal.m;

public final class g implements h {

    public final long f10944b = t.b(0.38f, t.f7163c);

    public final int f10945c = 12;

    @Override
    public final long a() {
        return this.f10944b;
    }

    @Override
    public final Shader b(o0 o0Var, k kVar, j jVar) {
        m.e(jVar, "runtimeShaderCache");
        return null;
    }

    @Override
    public final int c() {
        return this.f10945c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.c(this.f10944b, gVar.f10944b) && this.f10945c == gVar.f10945c;
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Integer.hashCode(this.f10945c) + (Long.hashCode(this.f10944b) * 31);
    }

    public final String toString() {
        return a1.b.q("Plain(color=", t.i(this.f10944b), ", blendMode=", l.a(this.f10945c), ")");
    }
}
