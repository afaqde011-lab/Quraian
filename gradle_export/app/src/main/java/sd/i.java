package sd;

import java.util.Iterator;
import java.util.List;

public final class i implements e {

    public List f13998a;

    @Override
    public final boolean a(w0 w0Var) {
        Iterator it = this.f13998a.iterator();
        while (it.hasNext()) {
            if (c7.g.j((m) it.next(), w0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.f13998a + ")";
    }
}
