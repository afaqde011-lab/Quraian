package x10;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;

public final class p implements q20.e {
    @Override
    public final int a(j10.b superDescriptor, j10.b subDescriptor, j10.e eVar) {
        boolean z;
        j10.u uVar;
        kotlin.jvm.internal.m.e(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.m.e(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof j10.c) && (subDescriptor instanceof j10.u) && !g10.i.A(subDescriptor)) {
            int i = e.l;
            j10.u uVar2 = (j10.u) subDescriptor;
            m10.m mVar = (m10.m) uVar2;
            n20.e name = mVar.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            if (e.b(name)) {
                j10.c cVarO = g4.O((j10.c) superDescriptor);
                z = superDescriptor instanceof j10.u;
                if (z) {
                    uVar = (j10.u) superDescriptor;
                } else {
                    uVar = null;
                }
                if (uVar == null) {
                    if (eVar instanceof z10.c) {
                        if (y3.B(superDescriptor, subDescriptor)) {
                            return 3;
                        }
                    } else if (y3.B(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (eVar instanceof z10.c) {
                    if (y3.B(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (y3.B(superDescriptor, subDescriptor)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = e0.a;
                n20.e name2 = mVar.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                if (e0.j.contains(name2)) {
                    j10.c cVarO2 = g4.O((j10.c) superDescriptor);
                    z = superDescriptor instanceof j10.u;
                    if (z) {
                        uVar = (j10.u) superDescriptor;
                    } else {
                        uVar = null;
                    }
                    if ((uVar == null && uVar2.g0() == uVar.g0()) || (cVarO2 != null && uVar2.g0())) {
                        if ((eVar instanceof z10.c) || uVar2.S() != null || cVarO2 == null || g4.P(eVar, cVarO2)) {
                            if (y3.B(superDescriptor, subDescriptor)) {
                                return 3;
                            }
                        } else if ((cVarO2 instanceof j10.u) && z && e.a((j10.u) cVarO2) != null) {
                            String strU = c7.i.u(uVar2, 2);
                            j10.u uVarA = ((j10.u) superDescriptor).a();
                            kotlin.jvm.internal.m.d(uVarA, "getOriginal(...)");
                            if (kotlin.jvm.internal.m.a(strU, c7.i.u(uVarA, 2))) {
                                if (y3.B(superDescriptor, subDescriptor)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (y3.B(superDescriptor, subDescriptor)) {
                    return 3;
                }
            }
        } else if (y3.B(superDescriptor, subDescriptor)) {
            return 3;
        }
        return 2;
    }

    @Override
    public final int b() {
        return 1;
    }
}
