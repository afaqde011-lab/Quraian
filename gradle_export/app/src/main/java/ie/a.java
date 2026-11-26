package ie;

public final class a {

    public final String f7617a;

    public final boolean f7618b;

    public a(String str, boolean z10) {
        this.f7617a = str;
        this.f7618b = z10;
    }

    public final boolean a() {
        return this.f7618b;
    }

    public final String toString() {
        String str = this.f7617a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f7618b);
        return sb2.toString();
    }
}
