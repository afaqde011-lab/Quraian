package x10;

public abstract class e extends e0 {
    public static final int l = 0;

    public static final j10.u a(j10.u functionDescriptor) {
        kotlin.jvm.internal.m.e(functionDescriptor, "functionDescriptor");
        n20.e name = ((m10.m) functionDescriptor).getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        if (b(name)) {
            return (j10.u) u20.d.b(functionDescriptor, d.B);
        }
        return null;
    }

    public static boolean b(n20.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        return e0.e.contains(eVar);
    }
}
