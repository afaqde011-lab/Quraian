package l60;

import java.util.ArrayList;
import java.util.regex.Pattern;
import sd.p1;

public final class m0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final x40.q b;
    public String c;
    public sg.x d;
    public final ce.c e = new ce.c(18);
    public final db.g f;
    public x40.s g;
    public final boolean h;
    public final p1 i;
    public final s10.t0 j;
    public x40.z k;

    public m0(String str, x40.q qVar, String str2, x40.p pVar, x40.s sVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = qVar;
        this.c = str2;
        this.g = sVar;
        this.h = z;
        if (pVar != null) {
            this.f = pVar.e();
        } else {
            this.f = new db.g(9, (byte) 0);
        }
        if (z2) {
            this.j = new s10.t0(1);
            return;
        }
        if (z3) {
            p1 p1Var = new p1(19);
            this.i = p1Var;
            x40.s type = x40.u.f;
            kotlin.jvm.internal.m.e(type, "type");
            if (type.b.equals("multipart")) {
                p1Var.C = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String str, boolean z) {
        s10.t0 t0Var = this.j;
        if (z) {
            t0Var.getClass();
            kotlin.jvm.internal.m.e(name, "name");
            t0Var.a.add(x40.m.b(0, name, 0, 83, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            t0Var.b.add(x40.m.b(0, str, 0, 83, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            return;
        }
        t0Var.getClass();
        kotlin.jvm.internal.m.e(name, "name");
        t0Var.a.add(x40.m.b(0, name, 0, 91, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        t0Var.b.add(x40.m.b(0, str, 0, 91, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = x40.s.d;
                this.g = w50.c.H(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(a1.b.o("Malformed content type: ", str2), e);
            }
        }
        db.g gVar = this.f;
        if (z) {
            gVar.g(str, str2);
        } else {
            gVar.b(str, str2);
        }
    }

    public final void c(x40.p pVar, x40.z body) {
        p1 p1Var = this.i;
        p1Var.getClass();
        kotlin.jvm.internal.m.e(body, "body");
        if (pVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (pVar.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) p1Var.D).add(new x40.t(pVar, body));
    }

    public final void d(String name, String str, boolean z) {
        String str2 = this.c;
        if (str2 != null) {
            x40.q qVar = this.b;
            sg.x xVarF = qVar.f(str2);
            this.d = xVarF;
            if (xVarF == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + qVar + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            sg.x xVar = this.d;
            xVar.getClass();
            kotlin.jvm.internal.m.e(name, "encodedName");
            if (((ArrayList) xVar.h) == null) {
                xVar.h = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) xVar.h;
            kotlin.jvm.internal.m.b(arrayList);
            arrayList.add(x40.m.b(0, name, 0, 211, " \"'<>#&="));
            ArrayList arrayList2 = (ArrayList) xVar.h;
            kotlin.jvm.internal.m.b(arrayList2);
            arrayList2.add(str != null ? x40.m.b(0, str, 0, 211, " \"'<>#&=") : null);
            return;
        }
        sg.x xVar2 = this.d;
        xVar2.getClass();
        kotlin.jvm.internal.m.e(name, "name");
        if (((ArrayList) xVar2.h) == null) {
            xVar2.h = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) xVar2.h;
        kotlin.jvm.internal.m.b(arrayList3);
        arrayList3.add(x40.m.b(0, name, 0, 219, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = (ArrayList) xVar2.h;
        kotlin.jvm.internal.m.b(arrayList4);
        arrayList4.add(str != null ? x40.m.b(0, str, 0, 219, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
