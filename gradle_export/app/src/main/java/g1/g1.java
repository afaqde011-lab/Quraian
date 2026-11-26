package g1;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.Locale;

public final class g1 {

    public final z00.e f5799a;

    public final d6 f5800b;

    public final h1.a0 f5801c;

    public final r1 f5802d;

    public final String f5803e;

    public final String f5804f;

    public final String f5805g;

    public g1(z00.e eVar, d6 d6Var, h1.a0 a0Var, r1 r1Var, String str, String str2, String str3) {
        this.f5799a = eVar;
        this.f5800b = d6Var;
        this.f5801c = a0Var;
        this.f5802d = r1Var;
        this.f5803e = str;
        this.f5804f = str2;
        this.f5805g = str3;
    }

    public final String a(h1.s sVar, Locale locale) {
        if (sVar == null) {
            String upperCase = this.f5801c.f6488a.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.f5803e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i10 = sVar.A;
        long j9 = sVar.D;
        z00.e eVar = this.f5799a;
        if (!eVar.e(i10)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{y.a(((z00.c) eVar).A, locale, 7), y.a(((z00.c) eVar).B, locale, 7)}, 2);
            return String.format(this.f5804f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        d6 d6Var = this.f5800b;
        if (d6Var.b(i10) && d6Var.a(j9)) {
            return RuntimeVersion.SUFFIX;
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.f5802d.a(Long.valueOf(j9), locale, false)}, 1);
        return String.format(this.f5805g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
    }
}
