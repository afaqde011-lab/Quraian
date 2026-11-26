package k20;

import androidx.media3.common.k;
import kotlin.jvm.internal.a0;
import o20.p;
import p1.k0;

public abstract class d {
    public final int a;
    public final int b;
    public final int c;

    public d(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }

    public d(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public static c a(d dVar, p[] pVarArr) {
        return new c(dVar.b + dVar.c, pVarArr);
    }

    public static b b(d dVar) {
        return new b(dVar.b + dVar.c, 1, 0, (byte) 0);
    }

    public static b c() {
        return new b(0, 1, 0, (byte) 0);
    }

    public abstract void d(k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var);

    public abstract Object e(int i);

    public o1.b f(k kVar) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String strN = a0.a.b(getClass()).n();
                return strN == null ? "" : strN;
            default:
                return super.toString();
        }
    }
}
