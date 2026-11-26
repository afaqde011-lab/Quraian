package ud;

public final class a {

    public final Integer f15245a;

    public final Object f15246b;

    public final d f15247c;

    public final b f15248d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f15245a = num;
        this.f15246b = obj;
        this.f15247c = dVar;
        this.f15248d = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f15248d;
            Integer num = aVar.f15245a;
            Integer num2 = this.f15245a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f15246b.equals(aVar.f15246b) && this.f15247c.equals(aVar.f15247c) && ((bVar = this.f15248d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f15245a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f15246b.hashCode()) * 1000003) ^ this.f15247c.hashCode()) * 1000003;
        b bVar = this.f15248d;
        return (iHashCode ^ (bVar != null ? bVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f15245a + ", payload=" + this.f15246b + ", priority=" + this.f15247c + ", productData=" + this.f15248d + ", eventContext=null}";
    }
}
