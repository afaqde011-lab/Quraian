package cr;

import a10.h0;
import h00.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mr.c;
import r30.k;

public final class a extends h0 {
    public final ArrayList X(dr.a aVar) {
        mr.b bVar;
        String slug;
        String type;
        Object next;
        List<dr.b> sections = aVar != null ? aVar.getSections() : null;
        if (sections == null) {
            sections = x.A;
        }
        ArrayList arrayList = new ArrayList();
        for (dr.b bVar2 : sections) {
            if (bVar2 == null || (slug = bVar2.getSlug()) == null) {
                bVar = null;
            } else {
                if (k.L0(slug)) {
                    slug = null;
                }
                if (slug == null || (type = bVar2.getType()) == null) {
                    bVar = null;
                } else {
                    c.B.getClass();
                    Iterator it = c.I.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((c) next).A.contains(type));
                    c cVar = (c) next;
                    if (cVar == null) {
                        bVar = null;
                    } else {
                        bVar = new mr.b(slug, cVar);
                    }
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            mr.b bVar3 = (mr.b) obj;
            if (hashSet.add(new g00.k(bVar3.b, bVar3.a))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
