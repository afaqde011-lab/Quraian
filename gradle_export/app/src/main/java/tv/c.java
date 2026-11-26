package tv;

import androidx.media3.common.b1;
import androidx.media3.common.d1;
import h00.q;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class c implements d1 {
    public final d A;

    public c(d dVar) {
        this.A = dVar;
    }

    public final void T(b1 availableCommands) {
        m.e(availableCommands, "availableCommands");
        d dVar = this.A;
        if (dVar.getAvailableCommands().equals(availableCommands)) {
            return;
        }
        b1 availableCommands2 = dVar.getAvailableCommands();
        Iterator it = q.n1(dVar.c).iterator();
        while (it.hasNext()) {
            ((d1) it.next()).T(availableCommands2);
        }
    }
}
