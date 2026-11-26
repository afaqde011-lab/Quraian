package fh;

public final class v0 {

    public final Object f5678a;

    public final Object f5679b;

    public final Object f5680c;

    public v0(Object obj, Object obj2, Object obj3) {
        this.f5678a = obj;
        this.f5679b = obj2;
        this.f5680c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f5678a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f5679b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f5680c);
        return new IllegalArgumentException(sb2.toString());
    }
}
