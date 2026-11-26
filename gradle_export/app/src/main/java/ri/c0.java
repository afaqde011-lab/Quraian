package ri;

import java.util.List;

public final class c0 {

    public int f13286a;

    public String f13287b;

    public int f13288c;

    public int f13289d;

    public long f13290e;

    public long f13291f;

    public long f13292g;

    public String f13293h;

    public List f13294i;

    public byte f13295j;

    public final d0 a() {
        String str;
        if (this.f13295j == 63 && (str = this.f13287b) != null) {
            return new d0(this.f13286a, str, this.f13288c, this.f13289d, this.f13290e, this.f13291f, this.f13292g, this.f13293h, this.f13294i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13295j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f13287b == null) {
            sb2.append(" processName");
        }
        if ((this.f13295j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f13295j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f13295j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f13295j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f13295j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
