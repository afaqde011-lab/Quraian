package ba;

public final class a {

    public int f2230a;

    public int f2231b;

    public Object f2232c;

    public int f2233d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = this.f2230a;
            if (i10 != aVar.f2230a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f2233d - this.f2231b) != 1 || this.f2233d != aVar.f2231b || this.f2231b != aVar.f2233d) {
                if (this.f2233d != aVar.f2233d || this.f2231b != aVar.f2231b) {
                    return false;
                }
                Object obj2 = this.f2232c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f2232c)) {
                        return false;
                    }
                } else if (aVar.f2232c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2230a * 31) + this.f2231b) * 31) + this.f2233d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f2230a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f2231b);
        sb2.append("c:");
        sb2.append(this.f2233d);
        sb2.append(",p:");
        sb2.append(this.f2232c);
        sb2.append("]");
        return sb2.toString();
    }
}
