package h10;

public abstract class k {
    public final n20.c a;
    public final String b;

    public k(String str, n20.c packageFqName) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        this.a = packageFqName;
        this.b = str;
    }

    public final n20.e a(int i) {
        return n20.e.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return g4.c.k(sb, this.b, 'N');
    }
}
