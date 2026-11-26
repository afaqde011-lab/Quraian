package i10;

import h00.j0;
import h00.v;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class r {
    public static final LinkedHashSet a = j0.r0(g20.f.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<v20.c> listS = va.a.S(new v20.c[]{v20.c.BOOLEAN, v20.c.CHAR});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v20.c cVar : listS) {
            n20.c cVar2 = cVar.D;
            if (cVar2 == null) {
                v20.c.a(15);
                throw null;
            }
            String strB = cVar2.a.g().b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
            v.u0(g20.f.f(strB, cVar.B + "Value()" + cVar.c()), linkedHashSet);
        }
        b = j0.q0(j0.q0(j0.q0(j0.q0(j0.q0(j0.q0(linkedHashSet, g20.f.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), g20.f.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), g20.f.f("Double", "isInfinite()Z", "isNaN()Z")), g20.f.f("Float", "isInfinite()Z", "isNaN()Z")), g20.f.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), g20.f.f("CharSequence", "isEmpty()Z"));
        c = g20.f.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        d = j0.q0(j0.q0(j0.q0(j0.q0(j0.q0(j0.q0(g20.f.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), g20.f.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), g20.f.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), g20.f.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), g20.f.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), g20.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), g20.f.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = j0.q0(j0.q0(g20.f.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), g20.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), g20.f.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        v20.c cVar3 = v20.c.BOOLEAN;
        v20.c cVar4 = v20.c.BYTE;
        List listS2 = va.a.S(new v20.c[]{cVar3, cVar4, v20.c.DOUBLE, v20.c.FLOAT, cVar4, v20.c.INT, v20.c.LONG, v20.c.SHORT});
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listS2.iterator();
        while (it.hasNext()) {
            n20.c cVar5 = ((v20.c) it.next()).D;
            if (cVar5 == null) {
                v20.c.a(15);
                throw null;
            }
            String strB2 = cVar5.a.g().b();
            kotlin.jvm.internal.m.d(strB2, "asString(...)");
            String[] strArrA = g20.f.a("Ljava/lang/String;");
            v.u0(g20.f.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)), linkedHashSet2);
        }
        String[] strArrA2 = g20.f.a("D");
        LinkedHashSet linkedHashSetQ0 = j0.q0(linkedHashSet2, g20.f.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = g20.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = j0.q0(linkedHashSetQ0, g20.f.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = g20.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = g20.f.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
