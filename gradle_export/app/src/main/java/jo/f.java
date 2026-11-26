package jo;

import com.mchutov.quranify.AudioStoryCatalogLocalModel;
import com.mchutov.quranify.AudioStoryCatalogsModel;
import g00.b0;
import java.util.List;
import java.util.Map;
import ri.t1;

public final class f implements d40.j {
    public final int A;
    public final d40.j B;
    public final String C;

    public f(d40.j jVar, String str, int i) {
        this.A = i;
        this.B = jVar;
        this.C = str;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        e eVar;
        nm.a aVar;
        wn.a aVar2;
        switch (this.A) {
            case 0:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i = eVar.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eVar.B = i - Integer.MIN_VALUE;
                    } else {
                        eVar = new e(this, cVar);
                    }
                } else {
                    eVar = new e(this, cVar);
                }
                Object obj2 = eVar.A;
                l00.a aVar3 = l00.a.A;
                int i2 = eVar.B;
                if (i2 == 0) {
                    t1.O(obj2);
                    ho.c cVar2 = new ho.c(this.C, (List) obj);
                    eVar.B = 1;
                    if (this.B.emit(cVar2, eVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj2);
                }
                return b0.a;
            case 1:
                if (cVar instanceof nm.a) {
                    aVar = (nm.a) cVar;
                    int i3 = aVar.B;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.B = i3 - Integer.MIN_VALUE;
                    } else {
                        aVar = new nm.a(this, cVar);
                    }
                } else {
                    aVar = new nm.a(this, cVar);
                }
                Object obj3 = aVar.A;
                l00.a aVar4 = l00.a.A;
                int i4 = aVar.B;
                if (i4 == 0) {
                    t1.O(obj3);
                    Object objRemove = ((Map) obj).remove(this.C);
                    aVar.B = 1;
                    if (this.B.emit(objRemove, aVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj3);
                }
                return b0.a;
            default:
                if (cVar instanceof wn.a) {
                    aVar2 = (wn.a) cVar;
                    int i5 = aVar2.B;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aVar2.B = i5 - Integer.MIN_VALUE;
                    } else {
                        aVar2 = new wn.a(this, cVar);
                    }
                } else {
                    aVar2 = new wn.a(this, cVar);
                }
                Object obj4 = aVar2.A;
                l00.a aVar5 = l00.a.A;
                int i6 = aVar2.B;
                if (i6 == 0) {
                    t1.O(obj4);
                    AudioStoryCatalogLocalModel audioStoryCatalogLocalModel = ((AudioStoryCatalogsModel) obj).getCatalogsMap().get(this.C);
                    aVar2.B = 1;
                    if (this.B.emit(audioStoryCatalogLocalModel, aVar2) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj4);
                }
                return b0.a;
        }
    }
}
