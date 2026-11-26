package oi;

import java.util.Objects;

public final class j {

    public final a2.o f12006a;

    public final i f12007b;

    public j(a2.o oVar, ui.b bVar) {
        this.f12006a = oVar;
        this.f12007b = new i(bVar);
    }

    public final void a(String str) {
        i iVar = this.f12007b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f12004b, str)) {
                i.a(iVar.f12003a, str, iVar.f12005c);
                iVar.f12004b = str;
            }
        }
    }
}
