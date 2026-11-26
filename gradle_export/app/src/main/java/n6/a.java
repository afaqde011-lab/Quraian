package n6;

import b6.h;
import b6.k;
import b6.m;
import com.google.protobuf.RuntimeVersion;

public final class a implements h {

    public e f11109b;

    public String f11108a = RuntimeVersion.SUFFIX;

    public int f11110c = Integer.MAX_VALUE;

    public m f11111d = k.f2179a;

    @Override
    public final h a() {
        a aVar = new a();
        aVar.f11111d = this.f11111d;
        aVar.f11108a = this.f11108a;
        aVar.f11109b = this.f11109b;
        aVar.f11110c = this.f11110c;
        return aVar;
    }

    @Override
    public final m b() {
        return this.f11111d;
    }

    @Override
    public final void c(m mVar) {
        this.f11111d = mVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmittableText(");
        sb2.append(this.f11108a);
        sb2.append(", style=");
        sb2.append(this.f11109b);
        sb2.append(", modifier=");
        sb2.append(this.f11111d);
        sb2.append(", maxLines=");
        return oi.k.l(sb2, this.f11110c, ')');
    }
}
