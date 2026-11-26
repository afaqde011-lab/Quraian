package sd;

public final class l {

    public m f14014a;

    public q0 f14015b;

    public int f14016c;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f14014a));
        sb2.append(" {...} (src=");
        int i10 = this.f14016c;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
