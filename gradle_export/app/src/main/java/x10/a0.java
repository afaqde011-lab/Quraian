package x10;

import com.google.android.gms.internal.measurement.x5;

public final class a0 {
    public final String a;
    public final n20.e b;
    public final String c;
    public final String d;
    public final String e;

    public a0(String classInternalName, n20.e eVar, String str, String str2) {
        kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
        this.a = classInternalName;
        this.b = eVar;
        this.c = str;
        this.d = str2;
        String jvmDescriptor = eVar + '(' + str + ')' + str2;
        kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
        this.e = classInternalName + '.' + jvmDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.a, a0Var.a) && kotlin.jvm.internal.m.a(this.b, a0Var.b) && kotlin.jvm.internal.m.a(this.c, a0Var.c) && kotlin.jvm.internal.m.a(this.d, a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x5.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return g4.c.k(sb, this.d, ')');
    }
}
