package g4;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m;

public abstract class c {
    public static int a(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static int b(o6.h hVar, int i10, int i11) {
        return (Integer.hashCode(hVar.f11666a) + i10) * i11;
    }

    public static int c(u30.b bVar, int i10, int i11) {
        return (bVar.hashCode() + i10) * i11;
    }

    public static Object d(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String e(int i10, int i11, String str, String str2, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String f(int i10, String str) {
        return str + i10;
    }

    public static String g(int i10, String str, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(Object obj, String str) {
        return str + obj;
    }

    public static String i(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String j(String str, String str2, boolean z10) {
        return str + z10 + str2;
    }

    public static String k(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder m(String str, int i10, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static KotlinNothingValueException o(String str) {
        g0.a.b(str);
        return new KotlinNothingValueException();
    }

    public static void p(int i10) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m.j(nullPointerException, m.class.getName());
        throw nullPointerException;
    }

    public static void q(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m.h(str));
        m.j(nullPointerException, m.class.getName());
        throw nullPointerException;
    }

    public static void r(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(w.c.j(str, " must not be null"));
        m.j(nullPointerException, m.class.getName());
        throw nullPointerException;
    }

    public static String s(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static String t(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static String u(int i10) {
        if (i10 == 1) {
            return "DECLARATION";
        }
        if (i10 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static String v(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
