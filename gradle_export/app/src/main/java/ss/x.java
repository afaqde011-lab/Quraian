package ss;

public final class x {
    public final long a;
    public final int b;
    public final String c;

    public x(String str, long j, int i) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public static x a(x xVar, long j, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            j = xVar.a;
        }
        if ((i2 & 2) != 0) {
            i = xVar.b;
        }
        if ((i2 & 4) != 0) {
            str = xVar.c;
        }
        return new x(str, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b && kotlin.jvm.internal.m.a(this.c, xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListeningToday(listenedMs=");
        sb.append(this.a);
        sb.append(", dailyGoalMinutes=");
        sb.append(this.b);
        return w.c.l(sb, ", date=", this.c, ")");
    }
}
