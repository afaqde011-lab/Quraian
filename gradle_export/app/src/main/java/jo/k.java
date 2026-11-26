package jo;

import com.mchutov.quranify.audiostories.domain.model.AudioStoryLanguageNotAvailableException;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class k {
    public final vn.f a;

    public k(vn.f fVar) {
        this.a = fVar;
    }

    public final Object a(String str, int i, m00.c cVar) {
        j jVar;
        Object objG;
        String str2;
        Object obj;
        int i2;
        List list;
        Iterator it;
        List<ho.g> list2;
        Throwable thA;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i3 = jVar.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.F = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj2 = jVar.D;
        l00.a aVar = l00.a.A;
        int i4 = jVar.F;
        vn.f fVar = this.a;
        if (i4 == 0) {
            t1.O(obj2);
            jVar.A = str;
            jVar.C = i;
            jVar.F = 1;
            objG = fVar.g(str, jVar, true);
            if (objG != aVar) {
            }
            return aVar;
        }
        if (i4 == 1) {
            i = jVar.C;
            str = jVar.A;
            t1.O(obj2);
            objG = ((g00.n) obj2).A;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = jVar.C;
            obj = jVar.B;
            str2 = jVar.A;
            t1.O(obj2);
        }
        list = (List) obj2;
        if (list != null || !list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                list2 = ((ho.a) it.next()).g;
                if (!list2.isEmpty()) {
                    for (ho.g gVar : list2) {
                        if (gVar.a != i2 && gVar.c.equals(str2)) {
                            return new ho.c(str2, list);
                        }
                    }
                }
            }
        }
        if (list.isEmpty()) {
            return t1.s(new AudioStoryLanguageNotAvailableException(str2));
        }
        thA = g00.n.a(obj);
        if (thA == null) {
            thA = new AudioStoryLanguageNotAvailableException(str2);
        }
        return t1.s(thA);
        int i5 = i;
        str2 = str;
        obj = objG;
        d40.i iVarE = fVar.e(str2, null);
        jVar.A = str2;
        jVar.B = obj;
        jVar.C = i5;
        jVar.F = 2;
        Object objS = d40.o.s(iVarE, jVar);
        if (objS != aVar) {
            obj2 = objS;
            i2 = i5;
            list = (List) obj2;
            if (list != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    list2 = ((ho.a) it.next()).g;
                    if (!list2.isEmpty()) {
                        while (r1.hasNext()) {
                            if (gVar.a != i2) {
                            }
                        }
                    }
                }
            } else {
                it = list.iterator();
                while (it.hasNext()) {
                    list2 = ((ho.a) it.next()).g;
                    if (!list2.isEmpty()) {
                        while (r1.hasNext()) {
                            if (gVar.a != i2) {
                            }
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                return t1.s(new AudioStoryLanguageNotAvailableException(str2));
            }
            thA = g00.n.a(obj);
            if (thA == null) {
                thA = new AudioStoryLanguageNotAvailableException(str2);
            }
            return t1.s(thA);
        }
        return aVar;
    }
}
