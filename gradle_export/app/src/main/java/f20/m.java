package f20;

import a1.u0;
import java.util.LinkedHashMap;

public abstract class m {
    public static final e a = new e(h.B, false);
    public static final e b;
    public static final e c;
    public static final LinkedHashMap d;

    static {
        h hVar = h.C;
        b = new e(hVar, false);
        c = new e(hVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        a8.l lVar = new a8.l(3);
        new u0(lVar, "java/util/".concat("Iterator")).B("forEachRemaining", (String) null, new j(strConcat4, 0));
        new u0(lVar, "java/lang/".concat("Iterable")).B("spliterator", (String) null, new o(4));
        u0 u0Var = new u0(lVar, "java/util/".concat("Collection"));
        u0Var.B("removeIf", (String) null, new j(strConcat2, 17));
        u0Var.B("stream", (String) null, new j(strConcat8, 26));
        u0Var.B("parallelStream", (String) null, new l(strConcat8, 1));
        u0 u0Var2 = new u0(lVar, "java/util/".concat("List"));
        u0Var2.B("replaceAll", (String) null, new l(strConcat7, 2));
        u0Var2.B("addFirst", "2.1", new l(strConcat, 3));
        u0Var2.B("addLast", "2.1", new l(strConcat, 4));
        u0Var2.B("removeFirst", "2.1", new l(strConcat, 5));
        u0Var2.B("removeLast", "2.1", new l(strConcat, 6));
        u0 u0Var3 = new u0(lVar, "java/util/".concat("LinkedList"));
        u0Var3.B("addFirst", "2.1", new j(strConcat, 1));
        u0Var3.B("addLast", "2.1", new j(strConcat, 2));
        u0Var3.B("removeFirst", "2.1", new j(strConcat, 3));
        u0Var3.B("removeLast", "2.1", new j(strConcat, 4));
        u0 u0Var4 = new u0(lVar, "java/util/".concat("LinkedHashSet"));
        u0Var4.B("addFirst", "2.2", new j(strConcat, 5));
        u0Var4.B("addLast", "2.2", new j(strConcat, 6));
        u0Var4.B("removeFirst", "2.2", new j(strConcat, 7));
        u0Var4.B("removeLast", "2.2", new j(strConcat, 8));
        u0Var4.B("getFirst", "2.2", new j(strConcat, 9));
        u0Var4.B("getLast", "2.2", new j(strConcat, 10));
        u0 u0Var5 = new u0(lVar, "java/util/".concat("Map"));
        u0Var5.B("forEach", (String) null, new j(strConcat6, 11));
        u0Var5.B("putIfAbsent", (String) null, new j(strConcat, 12));
        u0Var5.B("replace", (String) null, new j(strConcat, 13));
        u0Var5.B("replace", (String) null, new j(strConcat, 14));
        u0Var5.B("replaceAll", (String) null, new j(strConcat5, 15));
        u0Var5.B("compute", (String) null, new k(strConcat, strConcat5, 0));
        u0Var5.B("computeIfAbsent", (String) null, new k(strConcat, strConcat3, 1));
        u0Var5.B("computeIfPresent", (String) null, new k(strConcat, strConcat5, 2));
        u0Var5.B("merge", (String) null, new k(strConcat, strConcat5, 3));
        u0 u0Var6 = new u0(lVar, "java/util/".concat("LinkedHashMap"));
        u0Var6.B("putFirst", "2.2", new j(strConcat, 16));
        u0Var6.B("putLast", "2.2", new j(strConcat, 18));
        u0 u0Var7 = new u0(lVar, strConcat9);
        u0Var7.B("empty", (String) null, new j(strConcat9, 19));
        u0Var7.B("of", (String) null, new k(strConcat, strConcat9, 4));
        u0Var7.B("ofNullable", (String) null, new k(strConcat, strConcat9, 5));
        u0Var7.B("get", (String) null, new j(strConcat, 20));
        u0Var7.B("ifPresent", (String) null, new j(strConcat4, 21));
        new u0(lVar, "java/lang/".concat("ref/Reference")).B("get", (String) null, new j(strConcat, 22));
        new u0(lVar, strConcat2).B("test", (String) null, new j(strConcat, 23));
        new u0(lVar, "java/util/function/".concat("BiPredicate")).B("test", (String) null, new j(strConcat, 24));
        new u0(lVar, strConcat4).B("accept", (String) null, new j(strConcat, 25));
        new u0(lVar, strConcat6).B("accept", (String) null, new j(strConcat, 27));
        new u0(lVar, strConcat3).B("apply", (String) null, new j(strConcat, 28));
        new u0(lVar, strConcat5).B("apply", (String) null, new j(strConcat, 29));
        new u0(lVar, "java/util/function/".concat("Supplier")).B("get", (String) null, new l(strConcat, 0));
        d = lVar.A;
    }
}
