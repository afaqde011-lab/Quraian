package k10;

import g00.s;
import h00.d0;
import h00.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class n {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    EXPRESSION(false),
    FILE(false),
    TYPEALIAS(false),
    PROPERTY_PARAMETER(false),
    STAR_PROJECTION(false),
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    LOCAL_FUNCTION(false),
    MEMBER_FUNCTION(false),
    TOP_LEVEL_FUNCTION(false),
    MEMBER_PROPERTY(false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    TOP_LEVEL_PROPERTY(false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    BACKING_FIELD(true),
    INITIALIZER(false),
    DESTRUCTURING_DECLARATION(false),
    LAMBDA_EXPRESSION(false),
    ANONYMOUS_FUNCTION(false),
    OBJECT_LITERAL(false);

    public static final HashMap B;
    public static final List C;
    public static final List D;
    public static final List E;
    public static final List F;
    public static final List G;
    public static final List H;
    public static final List I;
    public static final List J;
    public static final List K;
    public static final List L;
    public static final List M;
    public static final List N;
    public static final n00.b k0;
    public final boolean A;

    static {
        n00.b bVarV = f50.c.v(nVarArr);
        k0 = bVarV;
        B = new HashMap();
        s sVar = new s(bVarV, 4);
        while (sVar.hasNext()) {
            n nVar = (n) sVar.next();
            B.put(nVar.name(), nVar);
        }
        n00.b bVar = k0;
        ArrayList arrayList = new ArrayList();
        bVar.getClass();
        s sVar2 = new s(bVar, 4);
        while (sVar2.hasNext()) {
            Object next = sVar2.next();
            if (((n) next).A) {
                arrayList.add(next);
            }
        }
        q.r1(arrayList);
        q.r1(k0);
        n nVar2 = ANNOTATION_CLASS;
        n nVar3 = CLASS;
        C = va.a.S(new n[]{nVar2, nVar3});
        D = va.a.S(new n[]{LOCAL_CLASS, nVar3});
        E = va.a.S(new n[]{CLASS_ONLY, nVar3});
        n nVar4 = COMPANION_OBJECT;
        n nVar5 = OBJECT;
        F = va.a.S(new n[]{nVar4, nVar5, nVar3});
        G = va.a.S(new n[]{STANDALONE_OBJECT, nVar5, nVar3});
        H = va.a.S(new n[]{INTERFACE, nVar3});
        I = va.a.S(new n[]{ENUM_CLASS, nVar3});
        n nVar6 = ENUM_ENTRY;
        n nVar7 = PROPERTY;
        n nVar8 = FIELD;
        J = va.a.S(new n[]{nVar6, nVar7, nVar8});
        n nVar9 = PROPERTY_SETTER;
        K = va.a.R(nVar9);
        n nVar10 = PROPERTY_GETTER;
        L = va.a.R(nVar10);
        M = va.a.R(FUNCTION);
        n nVar11 = FILE;
        N = va.a.R(nVar11);
        d dVar = d.CONSTRUCTOR_PARAMETER;
        n nVar12 = VALUE_PARAMETER;
        d0.R(new g00.k(dVar, nVar12), new g00.k(d.FIELD, nVar8), new g00.k(d.PROPERTY, nVar7), new g00.k(d.FILE, nVar11), new g00.k(d.PROPERTY_GETTER, nVar10), new g00.k(d.PROPERTY_SETTER, nVar9), new g00.k(d.RECEIVER, nVar12), new g00.k(d.SETTER_PARAMETER, nVar12), new g00.k(d.PROPERTY_DELEGATE_FIELD, nVar8));
    }

    public n(boolean z) {
        super(str, i);
        this.A = z;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) j0.clone();
    }
}
