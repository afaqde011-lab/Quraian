package d10;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class g implements u00.a {
    public final int A;
    public final j B;

    public g(j jVar, int i) {
        this.A = i;
        this.B = jVar;
    }

    @Override
    public final Object invoke() {
        Type[] lowerBounds;
        m10.u uVarX0;
        g00.k kVar;
        Collection collection;
        int iX;
        int i = this.A;
        Type type = null;
        int i2 = 0;
        z = false;
        boolean z = false;
        int i3 = 1;
        j jVar = this.B;
        switch (i) {
            case 0:
                return i2.b(jVar.w());
            case 1:
                if (jVar.isSuspend()) {
                    Object objU0 = h00.q.U0(jVar.a().a());
                    ParameterizedType parameterizedType = objU0 instanceof ParameterizedType ? (ParameterizedType) objU0 : null;
                    if (kotlin.jvm.internal.m.a(parameterizedType != null ? parameterizedType.getRawType() : null, k00.c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objR0 = h00.n.R0(actualTypeArguments);
                        WildcardType wildcardType = objR0 instanceof WildcardType ? (WildcardType) objR0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) h00.n.D0(lowerBounds);
                        }
                    }
                }
                return type == null ? jVar.a().getReturnType() : type;
            case 2:
                ArrayList arrayList = new ArrayList();
                j10.c cVarW = jVar.w();
                n20.c cVar = i2.a;
                if (cVarW.T() != null) {
                    j10.k kVarL = cVarW.l();
                    kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    uVarX0 = ((j10.e) kVarL).x0();
                } else {
                    uVarX0 = null;
                }
                if (uVarX0 != null) {
                    arrayList.add(new w(jVar, arrayList.size(), a10.n.A, new h(uVarX0, 0)));
                }
                j10.c cVarW2 = jVar.w();
                if (cVarW2 instanceof c30.t) {
                    c30.t tVar = (c30.t) cVarW2;
                    kVar = new g00.k(tVar.f0, tVar.e0.O);
                } else if (cVarW2 instanceof c30.s) {
                    c30.s sVar = (c30.s) cVarW2;
                    kVar = new g00.k(sVar.c0, sVar.b0.O);
                } else if (cVarW2 instanceof j10.k0) {
                    j10.l0 l0VarY0 = ((m10.g0) ((j10.k0) cVarW2)).Y0();
                    c30.s sVar2 = l0VarY0 instanceof c30.s ? (c30.s) l0VarY0 : null;
                    if (sVar2 != null) {
                        kVar = new g00.k(sVar2.c0, sVar2.b0.O);
                    } else {
                        kVar = null;
                    }
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    collection = h00.x.A;
                } else {
                    k20.g gVar = (k20.g) kVar.A;
                    List list = (List) kVar.B;
                    List listB0 = cVarW2.b0();
                    kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
                    ArrayList arrayList2 = new ArrayList(h00.r.q0(listB0, 10));
                    int i4 = 0;
                    for (Object obj : listB0) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        m10.u uVar = (m10.u) obj;
                        arrayList2.add(new m10.r0(cVarW2, null, i4, uVar.getAnnotations(), n20.e.d(gVar.getString(((i20.c1) list.get(i4)).E)), uVar.getType(), false, false, false, null, j10.n0.n));
                        i4 = i5;
                    }
                    collection = arrayList2;
                }
                int size = collection.size();
                while (i2 < size) {
                    arrayList.add(new w(jVar, arrayList.size(), a10.n.B, new f(collection, i2, 2)));
                    i2++;
                }
                m10.u uVarX = jVar.w().X();
                if (uVarX != null) {
                    arrayList.add(new w(jVar, arrayList.size(), a10.n.C, new h(uVarX, 1)));
                }
                return arrayList;
            case 3:
                j10.c cVarW3 = jVar.w();
                ArrayList arrayList3 = new ArrayList();
                if (!ri.t1.D(jVar)) {
                    Object objInvoke = jVar.B.invoke();
                    kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
                    arrayList3.addAll((List) objInvoke);
                }
                int size2 = cVarW3.O().size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList3.add(new w(jVar, arrayList3.size(), a10.n.D, new f(cVarW3, i6, i3)));
                }
                if (jVar.y() && (cVarW3 instanceof z10.a) && arrayList3.size() > 1) {
                    h00.u.t0(arrayList3, new i(i2));
                }
                arrayList3.trimToSize();
                return arrayList3;
            case 4:
                e30.w returnType = jVar.w().getReturnType();
                kotlin.jvm.internal.m.b(returnType);
                return new p30.i(returnType, new g(jVar, i3));
            case 5:
                List<j10.r0> typeParameters = jVar.w().getTypeParameters();
                kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
                ArrayList arrayList4 = new ArrayList(h00.r.q0(typeParameters, 10));
                for (j10.r0 r0Var : typeParameters) {
                    kotlin.jvm.internal.m.b(r0Var);
                    arrayList4.add(new r1(jVar, r0Var));
                }
                return arrayList4;
            case 6:
                List<w1> parameters = jVar.getParameters();
                int size3 = (jVar.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) jVar.G.getValue()).booleanValue()) {
                    iX = 0;
                    for (w1 w1Var : parameters) {
                        iX += ((w) w1Var).C == a10.n.D ? jVar.x(w1Var) : 0;
                    }
                } else if (parameters.isEmpty()) {
                    iX = 0;
                } else {
                    Iterator it = parameters.iterator();
                    iX = 0;
                    while (it.hasNext()) {
                        if (((w) ((w1) it.next())).C == a10.n.D && (iX = iX + 1) < 0) {
                            va.a.j0();
                            throw null;
                        }
                    }
                }
                int i7 = (iX + 31) / 32;
                Object[] objArr = new Object[size3 + i7 + 1];
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    w wVar = (w) ((w1) it2.next());
                    boolean zO = wVar.o();
                    int i8 = wVar.B;
                    if (zO) {
                        p30.i iVarG = wVar.g();
                        n20.c cVar2 = i2.a;
                        a10.e eVarS = iVarG.s();
                        j1 j1Var = eVarS instanceof j1 ? (j1) eVarS : null;
                        if (j1Var != null) {
                            s10.n0 n0VarN = j1Var.N();
                            if ((n0VarN != null ? n0VarN.M : null) != null) {
                            }
                        }
                        p30.i iVarG2 = wVar.g();
                        x1 x1Var = iVarG2.A;
                        Type typeN = x1Var != null ? (Type) x1Var.invoke() : null;
                        if (typeN == null) {
                            typeN = a10.h0.n(iVarG2, false);
                        }
                        objArr[i8] = i2.d(typeN);
                    }
                    if (wVar.t()) {
                        objArr[i8] = j.v(wVar.g());
                    }
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    objArr[size3 + i9] = 0;
                }
                return objArr;
            default:
                List parameters2 = jVar.getParameters();
                if (!parameters2.isEmpty()) {
                    Iterator it3 = parameters2.iterator();
                    while (it3.hasNext()) {
                        if (i2.f(((w) ((w1) it3.next())).g())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
