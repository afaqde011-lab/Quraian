package yv;

import androidx.datastore.core.DataStore;
import bt.y1;
import com.mchutov.quranify.PlaylistsModel;
import d40.i;
import d40.o;
import java.io.Serializable;
import ri.t1;

public final class c {
    public final DataStore a;
    public final vv.b b;
    public final y1 c;

    public c(DataStore dataStore, vv.b bVar) {
        this.a = dataStore;
        this.b = bVar;
        this.c = new y1(dataStore.getData(), bVar, 28);
    }

    public final Serializable a(m00.c cVar) {
        a aVar;
        vv.b bVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.D = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objS = aVar.B;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.D;
        if (i2 == 0) {
            t1.O(objS);
            i data = this.a.getData();
            bVar = this.b;
            aVar.A = bVar;
            aVar.D = 1;
            objS = o.s(data, aVar);
            if (objS == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = aVar.A;
            t1.O(objS);
        }
        bVar.getClass();
        return vv.b.X((PlaylistsModel) objS);
    }
}
