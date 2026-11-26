package j10;

import java.util.ArrayList;
import java.util.Map;

public final class a0 extends s0 {
    public final ArrayList a;
    public final Map b;

    public a0(ArrayList arrayList) {
        this.a = arrayList;
        this.b = h00.d0.Y(arrayList);
    }

    @Override
    public final boolean a(n20.e eVar) {
        return this.b.containsKey(eVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
