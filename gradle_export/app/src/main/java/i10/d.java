package i10;

import com.google.android.gms.internal.measurement.x5;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class d {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final n20.b e;
    public static final n20.c f;
    public static final n20.b g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final LinkedHashSet n;
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        h10.g gVar = h10.g.c;
        sb.append(gVar.a);
        sb.append('.');
        sb.append(gVar.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        h10.h hVar = h10.h.c;
        sb2.append(hVar.a);
        sb2.append('.');
        sb2.append(hVar.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        h10.j jVar = h10.j.c;
        sb3.append(jVar.a);
        sb3.append('.');
        sb3.append(jVar.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        h10.i iVar = h10.i.c;
        sb4.append(iVar.a);
        sb4.append('.');
        sb4.append(iVar.b);
        d = sb4.toString();
        n20.b bVarN0 = kh.n.n0(new n20.c("kotlin.jvm.functions.FunctionN"));
        e = bVarN0;
        f = bVarN0.a();
        g = n20.h.u;
        e(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new LinkedHashSet();
        n20.b bVarN1 = kh.n.n0(g10.o.B);
        n20.c cVar = g10.o.J;
        n20.c cVar2 = bVarN1.a;
        c cVar3 = new c(e(Iterable.class), bVarN1, new n20.b(cVar2, p30.f.s0(cVar, cVar2), false));
        n20.b bVarN2 = kh.n.n0(g10.o.A);
        n20.c cVar4 = g10.o.I;
        n20.c cVar5 = bVarN2.a;
        c cVar6 = new c(e(Iterator.class), bVarN2, new n20.b(cVar5, p30.f.s0(cVar4, cVar5), false));
        n20.b bVarN3 = kh.n.n0(g10.o.C);
        n20.c cVar7 = g10.o.K;
        n20.c cVar8 = bVarN3.a;
        c cVar9 = new c(e(Collection.class), bVarN3, new n20.b(cVar8, p30.f.s0(cVar7, cVar8), false));
        n20.b bVarN4 = kh.n.n0(g10.o.D);
        n20.c cVar10 = g10.o.L;
        n20.c cVar11 = bVarN4.a;
        c cVar12 = new c(e(List.class), bVarN4, new n20.b(cVar11, p30.f.s0(cVar10, cVar11), false));
        n20.b bVarN5 = kh.n.n0(g10.o.F);
        n20.c cVar13 = g10.o.N;
        n20.c cVar14 = bVarN5.a;
        c cVar15 = new c(e(Set.class), bVarN5, new n20.b(cVar14, p30.f.s0(cVar13, cVar14), false));
        n20.b bVarN6 = kh.n.n0(g10.o.E);
        n20.c cVar16 = g10.o.M;
        n20.c cVar17 = bVarN6.a;
        c cVar18 = new c(e(ListIterator.class), bVarN6, new n20.b(cVar17, p30.f.s0(cVar16, cVar17), false));
        n20.c cVar19 = g10.o.G;
        n20.b bVarN7 = kh.n.n0(cVar19);
        n20.c cVar20 = g10.o.O;
        n20.c cVar21 = bVarN7.a;
        c cVar22 = new c(e(Map.class), bVarN7, new n20.b(cVar21, p30.f.s0(cVar20, cVar21), false));
        n20.b bVarD = kh.n.n0(cVar19).d(g10.o.H.a.g());
        n20.c cVar23 = g10.o.P;
        n20.c cVar24 = bVarD.a;
        List<c> listS = va.a.S(new c[]{cVar3, cVar6, cVar9, cVar12, cVar15, cVar18, cVar22, new c(e(Map.Entry.class), bVarD, new n20.b(cVar24, p30.f.s0(cVar23, cVar24), false))});
        o = listS;
        d(Object.class, g10.o.a);
        d(String.class, g10.o.f);
        d(CharSequence.class, g10.o.e);
        c(Throwable.class, g10.o.k);
        d(Cloneable.class, g10.o.c);
        d(Number.class, g10.o.i);
        c(Comparable.class, g10.o.l);
        d(Enum.class, g10.o.j);
        c(Annotation.class, g10.o.s);
        for (c cVar25 : listS) {
            n20.b bVar = cVar25.a;
            n20.b bVar2 = cVar25.b;
            n20.b bVar3 = cVar25.c;
            a(bVar, bVar2);
            b(bVar3.a(), bVar);
            l.put(bVar3, bVar2);
            m.put(bVar2, bVar3);
            n20.c cVarA = bVar2.a();
            n20.c cVarA2 = bVar3.a();
            j.put(bVar3.a().a, cVarA);
            k.put(cVarA.a, cVarA2);
        }
        for (v20.c cVar26 : v20.c.values()) {
            n20.c cVar27 = cVar26.D;
            if (cVar27 == null) {
                v20.c.a(15);
                throw null;
            }
            n20.b bVar4 = new n20.b(cVar27.b(), cVar27.a.g());
            g10.k kVarD = cVar26.d();
            kotlin.jvm.internal.m.d(kVarD, "getPrimitiveType(...)");
            n20.c cVarA3 = g10.p.l.a(kVarD.A);
            a(bVar4, new n20.b(cVarA3.b(), cVarA3.a.g()));
        }
        for (n20.b bVar5 : g10.d.a) {
            n20.c cVar28 = new n20.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            a(new n20.b(cVar28.b(), cVar28.a.g()), bVar5.d(n20.g.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            n20.c cVar29 = new n20.c(g4.c.f(i2, "kotlin.jvm.functions.Function"));
            a(new n20.b(cVar29.b(), cVar29.a.g()), new n20.b(g10.p.l, n20.e.e("Function" + i2)));
            b(new n20.c(x5.j(i2, b, new StringBuilder())), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            h10.i iVar2 = h10.i.c;
            b(new n20.c((iVar2.a + '.' + iVar2.b) + i3), g);
        }
        b(new n20.c("kotlin.concurrent.atomics.AtomicInt"), e(AtomicInteger.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicLong"), e(AtomicLong.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicBoolean"), e(AtomicBoolean.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicReference"), e(AtomicReference.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicIntArray"), e(AtomicIntegerArray.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicLongArray"), e(AtomicLongArray.class));
        b(new n20.c("kotlin.concurrent.atomics.AtomicArray"), e(AtomicReferenceArray.class));
        b(g10.o.b.i(), e(Void.class));
    }

    public static void a(n20.b bVar, n20.b bVar2) {
        h.put(bVar.a().a, bVar2);
        b(bVar2.a(), bVar);
    }

    public static void b(n20.c cVar, n20.b bVar) {
        n.add(cVar);
        i.put(cVar.a, bVar);
    }

    public static void c(Class cls, n20.c topLevelFqName) {
        n20.b bVarE = e(cls);
        kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
        a(bVarE, new n20.b(topLevelFqName.b(), topLevelFqName.a.g()));
    }

    public static void d(Class cls, n20.d dVar) {
        c(cls, dVar.i());
    }

    public static n20.b e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return e(declaringClass).d(n20.e.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.m.d(canonicalName, "getCanonicalName(...)");
        n20.c cVar = new n20.c(canonicalName);
        return new n20.b(cVar.b(), cVar.a.g());
    }

    public static boolean f(n20.d dVar, String str) {
        Integer numY0;
        String str2 = dVar.a;
        if (r30.r.x0(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            if (!r30.k.Y0(strSubstring, '0') && (numY0 = r30.r.y0(strSubstring)) != null && numY0.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static n20.b g(n20.d kotlinFqName) {
        kotlin.jvm.internal.m.e(kotlinFqName, "kotlinFqName");
        if (f(kotlinFqName, a) || f(kotlinFqName, c)) {
            return e;
        }
        return (f(kotlinFqName, b) || f(kotlinFqName, d)) ? g : (n20.b) i.get(kotlinFqName);
    }

    public static n20.c h(n20.d dVar) {
        return (n20.c) k.get(dVar);
    }
}
