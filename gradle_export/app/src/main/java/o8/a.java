package o8;

import androidx.media3.common.s0;
import java.util.Arrays;
import java.util.Objects;

public final class a extends j {

    public final String f11684b;

    public final String f11685c;

    public final int f11686d;

    public final byte[] f11687e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f11684b = str;
        this.f11685c = str2;
        this.f11686d = i10;
        this.f11687e = bArr;
    }

    @Override
    public final void b(s0 s0Var) {
        s0Var.a(this.f11686d, this.f11687e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f11686d == aVar.f11686d && Objects.equals(this.f11684b, aVar.f11684b) && Objects.equals(this.f11685c, aVar.f11685c) && Arrays.equals(this.f11687e, aVar.f11687e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f11686d) * 31;
        String str = this.f11684b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11685c;
        return Arrays.hashCode(this.f11687e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": mimeType=" + this.f11684b + ", description=" + this.f11685c;
    }
}
