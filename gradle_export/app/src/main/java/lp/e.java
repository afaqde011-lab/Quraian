package lp;

import com.google.android.gms.internal.measurement.z3;
import java.util.Collection;
import java.util.Iterator;
import jp.x;
import kotlin.jvm.internal.m;

public final class e implements u00.a {
    public final int A;
    public final u30.f B;
    public final x C;

    public e(u30.f fVar, x xVar, int i) {
        this.A = i;
        this.B = fVar;
        this.C = xVar;
    }

    @Override
    public final Object invoke() {
        boolean z;
        boolean z2;
        switch (this.A) {
            case 0:
                Collection collectionValues = this.B.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    x xVar = this.C;
                    String str = xVar.r;
                    String str2 = xVar.s;
                    z = z3.E(str) ? false : false;
                } else {
                    Iterator it = collectionValues.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            x xVar2 = this.C;
                            String str3 = xVar2.r;
                            String str4 = xVar2.s;
                            if (z3.E(str3) && !r30.k.L0(str4) && m.a(xVar2.r, str4) && !xVar2.a) {
                                z = true;
                            }
                        } else if (!((Boolean) it.next()).booleanValue()) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Collection collectionValues2 = this.B.values();
                if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                    x xVar3 = this.C;
                    String str5 = xVar3.r;
                    String str6 = xVar3.s;
                    z2 = z3.E(str5) ? false : false;
                } else {
                    Iterator it2 = collectionValues2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            x xVar4 = this.C;
                            String str7 = xVar4.r;
                            String str8 = xVar4.s;
                            if (z3.E(str7) && !r30.k.L0(str8) && m.a(xVar4.r, str8) && !xVar4.a) {
                                z2 = true;
                            }
                        } else if (!((Boolean) it2.next()).booleanValue()) {
                        }
                    }
                }
                return Boolean.valueOf(z2);
        }
    }
}
