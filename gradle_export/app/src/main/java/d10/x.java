package d10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;

public final class x implements u00.a {
    public final int A;
    public final m0 B;

    public x(m0 m0Var, int i) {
        this.A = i;
        this.B = m0Var;
    }

    @Override
    public final Object invoke() throws IOException {
        m10.r rVarA0;
        boolean zD;
        Class<?> enclosingClass;
        int i = this.A;
        m0 m0Var = this.B;
        int i2 = 2;
        boolean z = true;
        switch (i) {
            case 0:
                n20.b bVar = c2.a;
                j10.l0 l0VarW = m0Var.w();
                l1 l1Var = m0Var.H;
                qd.s0 s0VarB = c2.b(l0VarW);
                if (!(s0VarB instanceof y0)) {
                    if (s0VarB instanceof w0) {
                        return ((w0) s0VarB).b;
                    }
                    if ((s0VarB instanceof x0) || (s0VarB instanceof z0)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                y0 y0Var = (y0) s0VarB;
                i20.j0 j0Var = y0Var.c;
                j10.l0 l0Var = y0Var.b;
                o20.h hVar = m20.g.a;
                m20.d dVarB = m20.g.b(j0Var, y0Var.e, y0Var.f, true);
                if (dVarB == null) {
                    return null;
                }
                if (l0Var.getKind() != 2) {
                    j10.k kVarL = l0Var.l();
                    if (kVarL == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (q20.d.k(kVarL)) {
                        j10.k kVarL2 = kVarL.l();
                        if (q20.d.l(kVarL2, j10.f.A) || q20.d.l(kVarL2, j10.f.C)) {
                            j10.e eVar = (j10.e) kVarL;
                            LinkedHashSet linkedHashSet = g10.d.a;
                            if (q20.d.k(eVar)) {
                                LinkedHashSet linkedHashSet2 = g10.d.a;
                                n20.b bVarF = u20.d.f(eVar);
                                if (h00.q.F0(linkedHashSet2, bVarF != null ? bVarF.e() : null)) {
                                    if (q20.d.k(l0Var.l())) {
                                        rVarA0 = l0Var.a0();
                                        if (rVarA0 == null && rVarA0.getAnnotations().d(x10.u.a)) {
                                            zD = true;
                                        } else {
                                            zD = l0Var.getAnnotations().d(x10.u.a);
                                        }
                                        if (!zD) {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                        } else if (q20.d.k(l0Var.l())) {
                            z = false;
                        } else {
                            rVarA0 = l0Var.a0();
                            if (rVarA0 == null) {
                                zD = l0Var.getAnnotations().d(x10.u.a);
                            } else {
                                zD = l0Var.getAnnotations().d(x10.u.a);
                            }
                            if (!zD) {
                                z = false;
                            }
                        }
                    } else if (q20.d.k(l0Var.l())) {
                        z = false;
                    } else {
                        rVarA0 = l0Var.a0();
                        if (rVarA0 == null) {
                            zD = l0Var.getAnnotations().d(x10.u.a);
                        } else {
                            zD = l0Var.getAnnotations().d(x10.u.a);
                        }
                        if (!zD) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                if (z || m20.g.d(j0Var)) {
                    enclosingClass = l1Var.v().getEnclosingClass();
                } else {
                    j10.k kVarL3 = l0Var.l();
                    enclosingClass = kVarL3 instanceof j10.e ? i2.i((j10.e) kVarL3) : l1Var.v();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(dVarB.b);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            default:
                l1 l1Var2 = m0Var.H;
                String name = m0Var.I;
                String signature = m0Var.J;
                l1Var2.getClass();
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(signature, "signature");
                r30.j jVar = l1.A;
                jVar.getClass();
                Matcher matcher = jVar.A.matcher(signature);
                kotlin.jvm.internal.m.d(matcher, "matcher(...)");
                r30.h hVar2 = matcher.matches() ? new r30.h(matcher, signature) : null;
                if (hVar2 != null) {
                    String str = (String) ((h00.g0) hVar2.a()).get(1);
                    j10.l0 l0VarB = l1Var2.B(Integer.parseInt(str));
                    if (l0VarB != null) {
                        return l0VarB;
                    }
                    StringBuilder sbN = g4.c.n("Local property #", str, " not found in ");
                    sbN.append(l1Var2.v());
                    throw new a40.b0(sbN.toString());
                }
                Collection collectionD = l1Var2.D(n20.e.e(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionD) {
                    if (kotlin.jvm.internal.m.a(c2.b((j10.l0) obj).W(), signature)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbS = a1.b.s("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbS.append(l1Var2);
                    throw new a40.b0(sbS.toString());
                }
                if (arrayList.size() == 1) {
                    return (j10.l0) h00.q.d1(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    j10.o visibility = ((j10.l0) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                Collection collectionValues = h00.d0.d0(linkedHashMap, new i(i2)).values();
                kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
                List list = (List) h00.q.S0(collectionValues);
                if (list.size() == 1) {
                    return (j10.l0) h00.q.L0(list);
                }
                String strR0 = h00.q.R0(l1Var2.D(n20.e.e(name)), "\n", null, null, b.P, 30);
                StringBuilder sbS2 = a1.b.s("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbS2.append(l1Var2);
                sbS2.append(':');
                sbS2.append(strR0.length() == 0 ? " no members found" : "\n".concat(strR0));
                throw new a40.b0(sbS2.toString());
        }
    }
}
