package vj;

import oi.k;

public final class b {

    public String f15720a;

    public String f15721b;

    public String f15722c;

    public String f15723d;

    public long f15724e;

    public byte f15725f;

    public final c a() {
        if (this.f15725f == 1 && this.f15720a != null && this.f15721b != null && this.f15722c != null && this.f15723d != null) {
            return new c(this.f15720a, this.f15721b, this.f15722c, this.f15723d, this.f15724e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15720a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f15721b == null) {
            sb2.append(" variantId");
        }
        if (this.f15722c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f15723d == null) {
            sb2.append(" parameterValue");
        }
        if ((this.f15725f & 1) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }
}
