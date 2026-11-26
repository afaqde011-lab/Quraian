package qu;

import a10.h0;
import bx.c;
import bx.f;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import h00.q;
import java.util.Iterator;
import r30.k;
import ru.b;
import vp.x;

public final class a extends h0 {
    public final x f;

    public a(x xVar) {
        this.f = xVar;
    }

    public final PlayerItem X(b bVar) {
        String str;
        Object next;
        f fVar = bVar.b;
        c cVar = bVar.a;
        String str2 = null;
        if (this.f.k()) {
            Iterator it = bVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                yt.b bVar2 = (yt.b) next;
                if (bVar2.a == cVar.a && bVar2.b == fVar.a) {
                    break;
                }
            }
            yt.b bVar3 = (yt.b) next;
            if (bVar3 != null) {
                str = bVar3.f;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        long j = fVar.a;
        String str3 = fVar.c;
        String str4 = fVar.e;
        String str5 = fVar.d;
        int i = fVar.b;
        int i2 = cVar.a;
        Integer num = bVar.c;
        String str6 = cVar.b;
        String str7 = cVar.e;
        String str8 = !k.L0(str7) ? str7 : null;
        bx.b bVarA = cVar.a();
        if (bVarA != null || (bVarA = (bx.b) q.N0(cVar.d)) != null) {
            str2 = bVarA.c + fVar.a + ".mp3";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new PlayerItem(j, str3, str4, str5, i, i2, num, str6, str8, str, str2);
    }
}
