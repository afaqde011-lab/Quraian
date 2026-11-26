package w6;

import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a extends a1 {

    public final LinkedHashMap f15841c = new LinkedHashMap();

    @Override
    public final void g() {
        Iterator it = this.f15841c.entrySet().iterator();
        while (it.hasNext()) {
            ((e1) ((Map.Entry) it.next()).getValue()).a();
        }
    }
}
