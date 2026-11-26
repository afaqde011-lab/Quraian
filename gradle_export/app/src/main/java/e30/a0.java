package e30;

import java.io.IOException;
import java.util.Iterator;

public abstract class a0 extends z0 implements h30.i, h30.j {
    @Override
    public abstract a0 z0(boolean z);

    @Override
    public abstract a0 B0(h0 h0Var);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", p20.h.e.x((k10.b) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(m0());
        if (!e0().isEmpty()) {
            h00.q.Q0(e0(), sb, ", ", "<", ">", null, 112);
        }
        if (t0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
