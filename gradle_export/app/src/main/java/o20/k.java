package o20;

import java.util.Iterator;
import java.util.Map;

public abstract class k extends j implements u {
    public i B = i.c;
    public boolean C;

    public final void d(l lVar) {
        z zVar;
        if (!this.C) {
            this.B = this.B.clone();
            this.C = true;
        }
        i iVar = this.B;
        i iVar2 = lVar.A;
        iVar.getClass();
        int i = 0;
        while (true) {
            zVar = iVar2.a;
            if (i >= zVar.B.size()) {
                break;
            }
            iVar.g((Map.Entry) zVar.B.get(i));
            i++;
        }
        Iterator it = zVar.d().iterator();
        while (it.hasNext()) {
            iVar.g((Map.Entry) it.next());
        }
    }
}
