package ri;

import java.util.List;

public final class i0 {

    public String f13368a;

    public String f13369b;

    public String f13370c;

    public long f13371d;

    public Long f13372e;

    public boolean f13373f;

    public u1 f13374g;

    public l2 f13375h;

    public k2 f13376i;

    public v1 f13377j;

    public List f13378k;
    public int l;
    public byte m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.m == 7 && (str = this.f13368a) != null && (str2 = this.f13369b) != null && (u1Var = this.f13374g) != null) {
            return new j0(str, str2, this.f13370c, this.f13371d, this.f13372e, this.f13373f, u1Var, this.f13375h, this.f13376i, this.f13377j, this.f13378k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13368a == null) {
            sb2.append(" generator");
        }
        if (this.f13369b == null) {
            sb2.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f13374g == null) {
            sb2.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
