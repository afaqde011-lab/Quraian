package m3;

import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;

public abstract class i {

    public static final h f10456a = new h(RuntimeVersion.SUFFIX);

    public static final List a(h hVar, int i10, int i11, ks.e eVar) {
        List list;
        if (i10 == i11 || (list = hVar.A) == null) {
            return null;
        }
        if (i10 != 0 || i11 < hVar.B.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                f fVar = (f) list.get(i12);
                if ((eVar != null ? ((Boolean) eVar.invoke(fVar.f10423a)).booleanValue() : true) && b(i10, i11, fVar.f10424b, fVar.f10425c)) {
                    arrayList.add(new f(ab.a0.y(fVar.f10424b, i10, i11) - i10, ab.a0.y(fVar.f10425c, i10, i11) - i10, (c) fVar.f10423a, fVar.f10426d));
                }
            }
            return arrayList;
        }
        if (eVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) eVar.invoke(((f) obj).f10423a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
