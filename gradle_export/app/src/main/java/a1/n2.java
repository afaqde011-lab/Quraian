package a1;

import com.google.android.gms.internal.measurement.x5;

public final class n2 {

    public static final i1 f106f = new i1(2);

    public final w2 f107a;

    public final m3.r0 f108b;

    public final boolean f109c;

    public final boolean f110d;

    public final boolean f111e;

    public n2(w2 w2Var, m3.r0 r0Var, boolean z10, boolean z11, boolean z12) {
        this.f107a = w2Var;
        this.f108b = r0Var;
        this.f109c = z10;
        this.f110d = z11;
        this.f111e = z12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb2.append(this.f107a);
        sb2.append(", textStyle=");
        sb2.append(this.f108b);
        sb2.append(", singleLine=");
        sb2.append(this.f109c);
        sb2.append(", softWrap=");
        sb2.append(this.f110d);
        sb2.append(", isKeyboardTypePhone=");
        return x5.o(sb2, this.f111e, ')');
    }
}
