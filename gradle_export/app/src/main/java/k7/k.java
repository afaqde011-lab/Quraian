package k7;

import java.util.Objects;

public final class k {

    public final int f9100a;

    public final int f9101b;

    public final int f9102c;

    public final boolean f9103d;

    public final boolean f9104e;

    public final int f9105f;

    public final androidx.media3.common.d f9106g;

    public final int f9107h;

    public final int f9108i;

    public final boolean f9109j;

    public final boolean f9110k;

    public k(j jVar) {
        this.f9100a = jVar.f9089a;
        this.f9101b = jVar.f9090b;
        this.f9102c = jVar.f9091c;
        this.f9103d = jVar.f9092d;
        this.f9104e = jVar.f9093e;
        this.f9105f = jVar.f9094f;
        this.f9106g = jVar.f9095g;
        this.f9107h = jVar.f9096h;
        this.f9108i = jVar.f9097i;
        this.f9109j = jVar.f9098j;
        this.f9110k = jVar.f9099k;
    }

    public final j a() {
        j jVar = new j();
        jVar.f9089a = this.f9100a;
        jVar.f9090b = this.f9101b;
        jVar.f9091c = this.f9102c;
        jVar.f9092d = this.f9103d;
        jVar.f9093e = this.f9104e;
        jVar.f9094f = this.f9105f;
        jVar.f9095g = this.f9106g;
        jVar.f9096h = this.f9107h;
        jVar.f9097i = this.f9108i;
        jVar.f9098j = this.f9109j;
        jVar.f9099k = this.f9110k;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9100a == kVar.f9100a && this.f9101b == kVar.f9101b && this.f9102c == kVar.f9102c && this.f9103d == kVar.f9103d && this.f9104e == kVar.f9104e && this.f9105f == kVar.f9105f && this.f9107h == kVar.f9107h && this.f9108i == kVar.f9108i && this.f9109j == kVar.f9109j && this.f9110k == kVar.f9110k && this.f9106g.equals(kVar.f9106g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9100a), Integer.valueOf(this.f9101b), Integer.valueOf(this.f9102c), Boolean.valueOf(this.f9103d), Boolean.valueOf(this.f9104e), Integer.valueOf(this.f9105f), this.f9106g, Integer.valueOf(this.f9107h), Integer.valueOf(this.f9108i), Boolean.valueOf(this.f9110k), Boolean.valueOf(this.f9109j));
    }
}
