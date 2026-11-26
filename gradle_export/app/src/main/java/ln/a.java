package ln;

import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public final b b;

    public a(String letter, b bVar) {
        m.e(letter, "letter");
        this.a = letter;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsightsWidgetDay(letter=" + this.a + ", state=" + this.b + ")";
    }
}
