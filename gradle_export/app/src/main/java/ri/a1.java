package ri;

public final class a1 {

    public Double f13250a;

    public int f13251b;

    public boolean f13252c;

    public int f13253d;

    public long f13254e;

    public long f13255f;

    public byte f13256g;

    public final b1 a() {
        if (this.f13256g == 31) {
            return new b1(this.f13250a, this.f13251b, this.f13252c, this.f13253d, this.f13254e, this.f13255f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13256g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f13256g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f13256g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f13256g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f13256g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
