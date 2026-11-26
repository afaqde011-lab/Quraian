package sd;

public final class q {

    public static final q f14044c = new q(p.A, 0);

    public static final q f14045d = new q(p.F, 1);

    public final p f14046a;

    public final int f14047b;

    public q(p pVar, int i10) {
        this.f14046a = pVar;
        this.f14047b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f14046a == qVar.f14046a && this.f14047b == qVar.f14047b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14046a);
        sb2.append(" ");
        int i10 = this.f14047b;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
