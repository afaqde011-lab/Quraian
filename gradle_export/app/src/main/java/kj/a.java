package kj;

import oi.k;

public final class a {

    public String f9683a;

    public int f9684b;

    public String f9685c;

    public String f9686d;

    public long f9687e;

    public long f9688f;

    public String f9689g;

    public byte f9690h;

    public final b a() {
        if (this.f9690h == 3 && this.f9684b != 0) {
            return new b(this.f9683a, this.f9684b, this.f9685c, this.f9686d, this.f9687e, this.f9688f, this.f9689g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9684b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f9690h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f9690h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }
}
