package k20;

public final class i {
    public static final i d = new i(256, 256, 256);
    public final int a;
    public final int b;
    public final int c;

    public i(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && this.c == iVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w.c.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        int i3 = this.c;
        if (i3 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i3);
        return sb2.toString();
    }
}
