package g1;

import com.google.protobuf.RuntimeVersion;

public final class c3 implements r3.e0 {
    public final int A;
    public final int B;
    public int C;
    public final Object D;
    public Object E;

    public c3(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public c3(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = RuntimeVersion.SUFFIX;
        }
        this.D = str;
        this.A = i11;
        this.B = i12;
        this.C = Integer.MIN_VALUE;
        this.E = RuntimeVersion.SUFFIX;
    }

    public c3(h1.a0 a0Var) {
        this.D = a0Var;
        String str = a0Var.f6488a;
        char c10 = a0Var.f6489b;
        this.A = r30.k.I0(str, c10, 0, 6);
        this.B = r30.k.O0(str, c10, 0, 6);
        this.C = a0Var.f6490c.length();
        this.E = new qj.c(this, 26);
    }

    public void a() {
        int i10 = this.C;
        this.C = i10 == Integer.MIN_VALUE ? this.A : i10 + this.B;
        this.E = ((String) this.D) + this.C;
    }

    public void b() {
        if (this.C == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    @Override
    public r3.c0 d(m3.h hVar) {
        String strSubstring = hVar.B;
        int length = strSubstring.length();
        int i10 = this.C;
        int i11 = 0;
        if (length > i10) {
            z00.e eVarI0 = ab.a0.I0(0, i10);
            kotlin.jvm.internal.m.e(strSubstring, "<this>");
            kotlin.jvm.internal.m.e(eVarI0, "range");
            strSubstring = strSubstring.substring(((z00.c) eVarI0).A, ((z00.c) eVarI0).B + 1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        }
        String string = RuntimeVersion.SUFFIX;
        int i12 = 0;
        while (i11 < strSubstring.length()) {
            int i13 = i12 + 1;
            string = string + strSubstring.charAt(i11);
            if (i13 == this.A || i12 + 2 == this.B) {
                StringBuilder sbQ = com.google.android.gms.internal.measurement.x5.q(string);
                sbQ.append(((h1.a0) this.D).f6489b);
                string = sbQ.toString();
            }
            i11++;
            i12 = i13;
        }
        return new r3.c0(new m3.h(string), (qj.c) this.E);
    }
}
