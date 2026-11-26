package v4;

import java.util.List;
import java.util.Objects;

public final class a {

    public String f15429a;

    public String f15430b;

    public List f15431c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f15429a, aVar.f15429a) && Objects.equals(this.f15430b, aVar.f15430b) && Objects.equals(this.f15431c, aVar.f15431c);
    }

    public final int hashCode() {
        return Objects.hash(this.f15429a, this.f15430b, this.f15431c);
    }
}
