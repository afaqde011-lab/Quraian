package cw;

import a10.h0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import dw.c;
import g00.q;
import java.util.Iterator;
import r30.k;
import vp.x;
import yt.b;

public final class a extends h0 {
    public final x f;

    public a(x xVar) {
        this.f = xVar;
    }

    public final PlayerItem X(q qVar) {
        String str;
        Object next;
        Object obj = qVar.B;
        if (this.f.k()) {
            Iterator it = ((Iterable) qVar.C).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                b bVar = (b) next;
                dw.b bVar2 = (dw.b) obj;
                if (bVar.a == bVar2.f.a && bVar.b == bVar2.a) {
                    break;
                }
            }
            b bVar3 = (b) next;
            if (bVar3 != null) {
                str = bVar3.f;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        dw.b bVar4 = (dw.b) obj;
        long j = bVar4.a;
        String str2 = bVar4.b;
        String str3 = str2 == null ? "" : str2;
        c cVar = bVar4.f;
        String str4 = cVar.b;
        int i = bVar4.e;
        int i2 = cVar.a;
        Integer num = (Integer) qVar.A;
        String str5 = cVar.c;
        String str6 = !k.L0(str5) ? str5 : null;
        String str7 = bVar4.d;
        return new PlayerItem(j, str3, "", str4, i, i2, num, str4, str6, str, str7 == null ? "" : str7);
    }
}
