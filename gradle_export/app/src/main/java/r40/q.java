package r40;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import q40.b0;
import q40.z;

public final class q extends m {
    public String i;
    public boolean j;

    @Override
    public final q40.l I() {
        return new q40.x((LinkedHashMap) this.h);
    }

    @Override
    public final void L(String key, q40.l element) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(element, "element");
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str = this.i;
            if (str == null) {
                kotlin.jvm.internal.m.k("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.j = true;
            return;
        }
        if (element instanceof b0) {
            this.i = ((b0) element).a();
            this.j = false;
        } else {
            if (element instanceof q40.x) {
                throw j.b(z.b);
            }
            if (!(element instanceof q40.e)) {
                throw new NoWhenBranchMatchedException();
            }
            throw j.b(q40.g.b);
        }
    }
}
