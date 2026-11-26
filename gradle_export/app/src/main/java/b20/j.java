package b20;

import com.google.android.gms.internal.measurement.b5;
import e30.v0;
import j10.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class j implements u00.a {
    public final int A = 0;
    public final oj.q B;
    public final n C;

    public j(n nVar, oj.q qVar) {
        this.C = nVar;
        this.B = qVar;
    }

    public j(oj.q qVar, n nVar) {
        this.B = qVar;
        this.C = nVar;
    }

    @Override
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        n nVar;
        ?? arrayList;
        ?? r13;
        ?? r1;
        g00.k kVar;
        List listD;
        switch (this.A) {
            case 0:
                n nVar2 = this.C;
                p10.o oVar = nVar2.o;
                oj.q qVar = nVar2.b;
                j10.e thisDescriptor = nVar2.n;
                Constructor<?>[] declaredConstructors = oVar.a.getDeclaredConstructors();
                kotlin.jvm.internal.m.d(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z = false;
                List<p10.r> listU0 = q30.l.u0(q30.l.r0(new q30.f(h00.n.l0(declaredConstructors), false, p10.j.A), p10.k.A));
                ArrayList arrayList2 = new ArrayList(listU0.size());
                for (p10.r rVar : listU0) {
                    a20.e eVarF = ca.v.F(qVar, rVar);
                    a20.b bVar = (a20.b) qVar.B;
                    z10.b bVarP1 = z10.b.p1(thisDescriptor, eVarF, z, bVar.j.b(rVar));
                    oj.q qVar2 = new oj.q(bVar, new a20.g(qVar, bVarP1, rVar, thisDescriptor.p().size()), (g00.h) qVar.D);
                    Constructor constructor = rVar.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    kotlin.jvm.internal.m.b(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = h00.x.A;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) h00.n.x0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) h00.n.x0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = rVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    z zVarU = a0.u(qVar2, bVarP1, listD);
                    List listP = thisDescriptor.p();
                    kotlin.jvm.internal.m.d(listP, "getDeclaredTypeParameters(...)");
                    ArrayList typeParameters = rVar.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(h00.r.q0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        r0 r0VarA = ((a20.h) qVar2.C).a((p10.c0) it.next());
                        kotlin.jvm.internal.m.b(r0VarA);
                        arrayList3.add(r0VarA);
                    }
                    bVarP1.n1(zVarU.b, b5.O(rVar.e()), h00.q.Y0(arrayList3, listP));
                    bVarP1.g1(false);
                    bVarP1.h1(zVarU.c);
                    bVarP1.i1(thisDescriptor.n());
                    ((a20.b) qVar2.B).g.getClass();
                    arrayList2.add(bVarP1);
                    z = false;
                }
                boolean zG = oVar.g();
                Class cls = oVar.a;
                oj.q c = this.B;
                k10.f fVar = k10.g.a;
                if (zG) {
                    z10.b bVarP2 = z10.b.p1(thisDescriptor, fVar, true, ((a20.b) qVar.B).j.b(oVar));
                    ArrayList<p10.a0> arrayListF = oVar.f();
                    ArrayList arrayList4 = new ArrayList(arrayListF.size());
                    c20.a aVarT0 = p30.f.t0(v0.B, false, null, 6);
                    int i = 0;
                    for (p10.a0 a0Var : arrayListF) {
                        arrayList4.add(new m10.r0(bVarP2, null, i, fVar, a0Var.c(), ((a1.i) qVar.E).G(a0Var.f(), aVarT0), false, false, false, null, ((a20.b) qVar.B).j.b(a0Var)));
                        i++;
                        nVar2 = nVar2;
                    }
                    nVar = nVar2;
                    bVarP2.h1(false);
                    j10.o PROTECTED_AND_PACKAGE = thisDescriptor.getVisibility();
                    kotlin.jvm.internal.m.d(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (PROTECTED_AND_PACKAGE.equals(x10.o.b)) {
                        PROTECTED_AND_PACKAGE = x10.o.c;
                        kotlin.jvm.internal.m.d(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    bVarP2.m1(arrayList4, PROTECTED_AND_PACKAGE);
                    bVarP2.g1(false);
                    bVarP2.i1(thisDescriptor.n());
                    String strU = c7.i.u(bVarP2, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(bVarP2);
                        ((a20.b) c.B).g.getClass();
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList2.add(bVarP2);
                                ((a20.b) c.B).g.getClass();
                            }
                        } while (!kotlin.jvm.internal.m.a(c7.i.u((m10.i) it2.next(), 2), strU));
                    }
                } else {
                    nVar = nVar2;
                }
                ((v20.a) ((a20.b) c.B).x).getClass();
                kotlin.jvm.internal.m.e(thisDescriptor, "thisDescriptor");
                kotlin.jvm.internal.m.e(c, "c");
                f20.d dVar = ((a20.b) c.B).r;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listT = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        a20.b bVar2 = (a20.b) qVar.B;
                        a1.i iVar = (a1.i) qVar.E;
                        ?? P1 = z10.b.p1(thisDescriptor, fVar, true, bVar2.j.b(oVar));
                        if (zIsAnnotation) {
                            List listD2 = oVar.d();
                            arrayList = new ArrayList(listD2.size());
                            c20.a aVarT1 = p30.f.t0(v0.B, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<p10.x> arrayList6 = new ArrayList();
                            for (Object obj : listD2) {
                                if (kotlin.jvm.internal.m.a(((p10.x) obj).c(), x10.v.b)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            arrayList5.size();
                            p10.x xVar = (p10.x) h00.q.N0(arrayList5);
                            if (xVar != null) {
                                p10.b0 b0VarF = xVar.f();
                                if (b0VarF instanceof p10.i) {
                                    p10.i iVar2 = (p10.i) b0VarF;
                                    kVar = new g00.k(iVar.F(iVar2, aVarT1, true), iVar.G(iVar2.b, aVarT1));
                                } else {
                                    kVar = new g00.k(iVar.G(b0VarF, aVarT1), null);
                                }
                                ?? r2 = nVar;
                                r2.v(arrayList, P1, 0, xVar, (e30.w) kVar.A, (e30.w) kVar.B);
                                r1 = r2;
                            } else {
                                r1 = nVar;
                            }
                            int i2 = xVar != null ? 1 : 0;
                            int i3 = 0;
                            for (p10.x xVar2 : arrayList6) {
                                r1.v(arrayList, P1, i3 + i2, xVar2, iVar.G(xVar2.f(), aVarT1), null);
                                i3++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        P1.h1(false);
                        j10.o PROTECTED_AND_PACKAGE2 = thisDescriptor.getVisibility();
                        kotlin.jvm.internal.m.d(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                        if (PROTECTED_AND_PACKAGE2.equals(x10.o.b)) {
                            PROTECTED_AND_PACKAGE2 = x10.o.c;
                            kotlin.jvm.internal.m.d(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        P1.m1(arrayList, PROTECTED_AND_PACKAGE2);
                        P1.g1(true);
                        P1.i1(thisDescriptor.n());
                        ((a20.b) qVar.B).g.getClass();
                        r13 = P1;
                    } else {
                        r13 = 0;
                    }
                    listT = va.a.T((Object) r13);
                }
                return h00.q.n1(dVar.e(c, listT));
            default:
                oj.q c2 = this.B;
                v20.e eVar = ((a20.b) c2.B).x;
                j10.e thisDescriptor2 = this.C.n;
                ((v20.a) eVar).getClass();
                kotlin.jvm.internal.m.e(thisDescriptor2, "thisDescriptor");
                kotlin.jvm.internal.m.e(c2, "c");
                return h00.q.r1(new ArrayList());
        }
    }
}
