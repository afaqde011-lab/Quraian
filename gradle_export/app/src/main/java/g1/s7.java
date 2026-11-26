package g1;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

public final class s7 implements z2.w0 {

    public static final s7 f5962b = new s7(0);

    public static final s7 f5963c = new s7(1);

    public final int f5964a;

    public s7(int i10) {
        this.f5964a = i10;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) throws KotlinNothingValueException {
        switch (this.f5964a) {
            case 0:
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    z2.v0 v0Var = (z2.v0) list.get(i10);
                    if (kotlin.jvm.internal.m.a(z2.d0.j(v0Var), "Spacer")) {
                        final z2.l1 l1VarO = v0Var.O(y3.a.a(j9, 0, y0Var.R0(k1.d0.f8601o), 0, 0, 12));
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            Object obj = list.get(i11);
                            if (!kotlin.jvm.internal.m.a(z2.d0.j((z2.v0) obj), "Spacer")) {
                                arrayList.add(obj);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size3 = arrayList.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            arrayList2.add(((z2.v0) arrayList.get(i12)).O(y3.a.a(j9, 0, y3.a.h(j9) / 2, 0, 0, 12)));
                        }
                        final int i13 = 0;
                        return y0Var.o0(y3.a.h(j9), y3.a.g(j9), h00.y.A, new u00.k() {
                            public final Object invoke(Object obj2) {
                                z2.k1 k1Var = (z2.k1) obj2;
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList3 = arrayList2;
                                        k1Var.h((z2.l1) arrayList3.get(0), 0, 0, 0.0f);
                                        k1Var.h((z2.l1) arrayList3.get(1), ((z2.l1) arrayList3.get(0)).A, 0, 0.0f);
                                        int i14 = ((z2.l1) arrayList3.get(0)).A;
                                        z2.l1 l1Var = l1VarO;
                                        k1Var.h(l1Var, i14 - (l1Var.A / 2), 0, 0.0f);
                                        break;
                                    default:
                                        ArrayList arrayList4 = arrayList2;
                                        k1Var.h((z2.l1) arrayList4.get(0), 0, 0, 0.0f);
                                        k1Var.h((z2.l1) arrayList4.get(1), 0, ((z2.l1) arrayList4.get(0)).B, 0.0f);
                                        int i15 = ((z2.l1) arrayList4.get(0)).B;
                                        z2.l1 l1Var2 = l1VarO;
                                        k1Var.h(l1Var2, 0, i15 - (l1Var2.B / 2), 0.0f);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        });
                    }
                }
                a4.a.b("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            default:
                int size4 = list.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    z2.v0 v0Var2 = (z2.v0) list.get(i14);
                    if (kotlin.jvm.internal.m.a(z2.d0.j(v0Var2), "Spacer")) {
                        final z2.l1 l1VarO2 = v0Var2.O(y3.a.a(j9, 0, 0, 0, y0Var.R0(k1.d0.f8601o), 3));
                        ArrayList arrayList3 = new ArrayList(list.size());
                        int size5 = list.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            Object obj2 = list.get(i15);
                            if (!kotlin.jvm.internal.m.a(z2.d0.j((z2.v0) obj2), "Spacer")) {
                                arrayList3.add(obj2);
                            }
                        }
                        final ArrayList arrayList4 = new ArrayList(arrayList3.size());
                        int size6 = arrayList3.size();
                        for (int i16 = 0; i16 < size6; i16++) {
                            arrayList4.add(((z2.v0) arrayList3.get(i16)).O(y3.a.a(j9, 0, 0, 0, y3.a.g(j9) / 2, 3)));
                        }
                        final int i17 = 1;
                        return y0Var.o0(y3.a.h(j9), y3.a.g(j9), h00.y.A, new u00.k() {
                            public final Object invoke(Object obj3) {
                                z2.k1 k1Var = (z2.k1) obj3;
                                switch (i17) {
                                    case 0:
                                        ArrayList arrayList5 = arrayList4;
                                        k1Var.h((z2.l1) arrayList5.get(0), 0, 0, 0.0f);
                                        k1Var.h((z2.l1) arrayList5.get(1), ((z2.l1) arrayList5.get(0)).A, 0, 0.0f);
                                        int i18 = ((z2.l1) arrayList5.get(0)).A;
                                        z2.l1 l1Var = l1VarO2;
                                        k1Var.h(l1Var, i18 - (l1Var.A / 2), 0, 0.0f);
                                        break;
                                    default:
                                        ArrayList arrayList6 = arrayList4;
                                        k1Var.h((z2.l1) arrayList6.get(0), 0, 0, 0.0f);
                                        k1Var.h((z2.l1) arrayList6.get(1), 0, ((z2.l1) arrayList6.get(0)).B, 0.0f);
                                        int i19 = ((z2.l1) arrayList6.get(0)).B;
                                        z2.l1 l1Var2 = l1VarO2;
                                        k1Var.h(l1Var2, 0, i19 - (l1Var2.B / 2), 0.0f);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        });
                    }
                }
                a4.a.b("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
        }
    }
}
