package t6;

import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import java.util.Arrays;
import k00.f;
import kotlin.jvm.internal.m;

public final class c implements c1 {

    public final e[] f14361a;

    public c(e... eVarArr) {
        m.e(eVarArr, "initializers");
        this.f14361a = eVarArr;
    }

    @Override
    public final a1 c(Class cls, d dVar) {
        e eVar;
        a10.d dVarI = f.I(cls);
        e[] eVarArr = this.f14361a;
        e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
        m.e(eVarArr2, "initializers");
        int length = eVarArr2.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr2[i10];
            if (eVar.f14362a.equals(dVarI)) {
                break;
            }
            i10++;
        }
        w6.a aVar = eVar != null ? new w6.a() : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + dVarI.m()).toString());
    }
}
