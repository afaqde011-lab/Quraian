package g10;

import java.util.HashMap;
import java.util.HashSet;

public abstract class o {
    public static final n20.c A;
    public static final n20.c B;
    public static final n20.c C;
    public static final n20.c D;
    public static final n20.c E;
    public static final n20.c F;
    public static final n20.c G;
    public static final n20.c H;
    public static final n20.c I;
    public static final n20.c J;
    public static final n20.c K;
    public static final n20.c L;
    public static final n20.c M;
    public static final n20.c N;
    public static final n20.c O;
    public static final n20.c P;
    public static final n20.d Q;
    public static final n20.b R;
    public static final n20.b S;
    public static final n20.b T;
    public static final n20.b U;
    public static final n20.b V;
    public static final n20.c W;
    public static final n20.c X;
    public static final n20.c Y;
    public static final n20.c Z;
    public static final n20.c a0;
    public static final n20.c b0;
    public static final n20.c c0;
    public static final n20.d d;
    public static final HashSet d0;
    public static final n20.d e;
    public static final HashSet e0;
    public static final n20.d f;
    public static final HashMap f0;
    public static final n20.d g;
    public static final HashMap g0;
    public static final n20.d h;
    public static final n20.d i;
    public static final n20.d j;
    public static final n20.c k;
    public static final n20.c l;
    public static final n20.c m;
    public static final n20.c n;
    public static final n20.c o;
    public static final n20.c p;
    public static final n20.c q;
    public static final n20.c r;
    public static final n20.c s;
    public static final n20.c t;
    public static final n20.c u;
    public static final n20.c v;
    public static final n20.c w;
    public static final n20.c x;
    public static final n20.c y;
    public static final n20.c z;
    public static final n20.d a = d("Any").a;
    public static final n20.d b = d("Nothing").a;
    public static final n20.d c = d("Cloneable").a;

    static {
        d("Suppress");
        d = d("Unit").a;
        e = d("CharSequence").a;
        f = d("String").a;
        g = d("Array").a;
        h = d("Boolean").a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").a;
        j = d("Enum").a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        n20.c cVar = p.o;
        cVar.a(n20.e.e("IntRange"));
        cVar.a(n20.e.e("LongRange"));
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        n20.c cVarD = d("ParameterName");
        r = cVarD;
        kh.n.n0(cVarD);
        s = d("Annotation");
        n20.c cVarA = a("Target");
        t = cVarA;
        kh.n.n0(cVarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        n20.c cVarA2 = a("Retention");
        w = cVarA2;
        kh.n.n0(cVarA2);
        kh.n.n0(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        p.p.a(n20.e.e("AccessibleLateinitPropertyLiteral"));
        n20.c cVar2 = new n20.c("kotlin.internal.PlatformDependent");
        z = cVar2;
        kh.n.n0(cVar2);
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        n20.c cVarB = b("Map");
        G = cVarB;
        H = cVarB.a(n20.e.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        n20.c cVarB2 = b("MutableMap");
        O = cVarB2;
        P = cVarB2.a(n20.e.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        n20.d dVarE = e("KProperty");
        e("KMutableProperty");
        R = kh.n.n0(dVarE.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        n20.c cVarD2 = d("UByte");
        n20.c cVarD3 = d("UShort");
        n20.c cVarD4 = d("UInt");
        n20.c cVarD5 = d("ULong");
        S = kh.n.n0(cVarD2);
        T = kh.n.n0(cVarD3);
        U = kh.n.n0(cVarD4);
        V = kh.n.n0(cVarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        int length = k.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (k kVar : k.values()) {
            hashSet.add(kVar.A);
        }
        d0 = hashSet;
        int length2 = k.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (k kVar2 : k.values()) {
            hashSet2.add(kVar2.B);
        }
        e0 = hashSet2;
        int length3 = k.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (k kVar3 : k.values()) {
            String strB = kVar3.A.b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
            map.put(d(strB).a, kVar3);
        }
        f0 = map;
        int length4 = k.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (k kVar4 : k.values()) {
            String strB2 = kVar4.B.b();
            kotlin.jvm.internal.m.d(strB2, "asString(...)");
            map2.put(d(strB2).a, kVar4);
        }
        g0 = map2;
    }

    public static n20.c a(String str) {
        return p.m.a(n20.e.e(str));
    }

    public static n20.c b(String str) {
        return p.n.a(n20.e.e(str));
    }

    public static n20.c c(String str) {
        return p.q.a(n20.e.e(str));
    }

    public static n20.c d(String str) {
        return p.l.a(n20.e.e(str));
    }

    public static final n20.d e(String str) {
        return p.i.a(n20.e.e(str)).a;
    }
}
