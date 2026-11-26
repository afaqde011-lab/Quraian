package th;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import k9.x0;
import tf.w;

public abstract class p {

    public static final w f14810a = new w(12);

    public static void a(x0 x0Var) {
        mh.f fVar;
        ArrayList arrayList = new ArrayList();
        wh.a aVar = wh.a.f16082b;
        Iterator it = ((ConcurrentMap) x0Var.B).values().iterator();
        while (it.hasNext()) {
            for (mh.j jVar : (List) it.next()) {
                int iOrdinal = jVar.f10917d.ordinal();
                if (iOrdinal == 1) {
                    fVar = mh.f.f10907c;
                } else if (iOrdinal == 2) {
                    fVar = mh.f.f10908d;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    fVar = mh.f.f10909e;
                }
                int i10 = jVar.f10919f;
                String strSubstring = jVar.f10920g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new wh.b(fVar, i10, strSubstring, jVar.f10918e.name()));
            }
        }
        mh.j jVar2 = (mh.j) x0Var.C;
        Integer numValueOf = jVar2 != null ? Integer.valueOf(jVar2.f10919f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((wh.b) it2.next()).f16085b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
