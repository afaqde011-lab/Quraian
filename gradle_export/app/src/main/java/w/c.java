package w;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class c {
    public static boolean a(int i10) {
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static float b(float f3, float f10, float f11, float f12) {
        return ((f3 - f10) * f11) + f12;
    }

    public static int c(float f3, int i10, int i11) {
        return (Float.hashCode(f3) + i10) * i11;
    }

    public static int d(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int e(int i10, int i11, boolean z10) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static int f(int i10, long j9, int i11) {
        return (Long.hashCode(j9) + i10) * i11;
    }

    public static f0.i g(l1.g0 g0Var) {
        f0.i iVar = new f0.i();
        g0Var.n0(iVar);
        return iVar;
    }

    public static String h(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String i(long j9, String str) {
        return str + j9;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(StringBuilder sb2, float f3, char c10) {
        sb2.append(f3);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, Map map, char c10) {
        sb2.append(map);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder n(String str, long j9, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j9);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap o(Class cls, ej.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map p(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static wb.i q(wb.h hVar, int i10) {
        hVar.c(i10);
        hVar.b();
        return hVar.a();
    }

    public static void r(float f3, StringBuilder sb2, String str) {
        sb2.append((Object) y3.f.c(f3));
        sb2.append(str);
    }

    public static void s(long j9, String str, StringBuilder sb2) {
        sb2.append((Object) i2.t.i(j9));
        sb2.append(str);
    }

    public static void t(a1.i iVar, long j9) {
        iVar.n().q();
        iVar.C(j9);
    }

    public static void u(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void v(StringBuilder sb2, String str, int i10, String str2, int i11) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
    }
}
