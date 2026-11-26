package n20;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import r30.k;
import r30.r;

public final class d {
    public static final e e = e.g("<root>");
    public final String a;
    public transient c b;
    public transient d c;
    public transient e d;

    static {
        m.d(Pattern.compile("\\."), "compile(...)");
    }

    public d(String str) {
        this.a = str;
    }

    public d(String fqName, c cVar) {
        m.e(fqName, "fqName");
        this.a = fqName;
        this.b = cVar;
    }

    public d(String str, d dVar, e eVar) {
        this.a = str;
        this.c = dVar;
        this.d = eVar;
    }

    public static final List f(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        List listF = f(dVar.e());
        listF.add(dVar.g());
        return listF;
    }

    public final d a(e name) {
        String strB;
        m.e(name, "name");
        if (c()) {
            strB = name.b();
        } else {
            strB = this.a + '.' + name.b();
        }
        m.b(strB);
        return new d(strB, this, name);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.d = e.d(str);
            this.c = c.c.a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        m.d(strSubstring, "substring(...)");
        this.d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        m.d(strSubstring2, "substring(...)");
        this.c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || k.I0(this.a, '<', 0, 6) < 0;
    }

    public final d e() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        d dVar2 = this.c;
        m.b(dVar2);
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return m.a(this.a, ((d) obj).a);
        }
        return false;
    }

    public final e g() {
        e eVar = this.d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.d;
        m.b(eVar2);
        return eVar2;
    }

    public final boolean h(e segment) {
        m.e(segment, "segment");
        if (!c()) {
            String str = this.a;
            int iI0 = k.I0(str, '.', 0, 6);
            if (iI0 == -1) {
                iI0 = str.length();
            }
            int i = iI0;
            String strB = segment.b();
            m.d(strB, "asString(...)");
            if (i == strB.length() && r.s0(0, 0, i, this.a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final c i() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.b = cVar2;
        return cVar2;
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String strB = e.b();
        m.d(strB, "asString(...)");
        return strB;
    }
}
