package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class e extends re.a {
    public static final Parcelable.Creator<e> CREATOR = new k0(11);
    public final d A;
    public final a B;
    public final String C;
    public final boolean D;
    public final int E;
    public final c F;
    public final b G;
    public final boolean H;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        d0.h(dVar);
        this.A = dVar;
        d0.h(aVar);
        this.B = aVar;
        this.C = str;
        this.D = z10;
        this.E = i10;
        this.F = cVar == null ? new c(null, false, null) : cVar;
        this.G = bVar == null ? new b(null, false) : bVar;
        this.H = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d0.k(this.A, eVar.A) && d0.k(this.B, eVar.B) && d0.k(this.F, eVar.F) && d0.k(this.G, eVar.G) && d0.k(this.C, eVar.C) && this.D == eVar.D && this.E == eVar.E && this.H == eVar.H;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.F, this.G, this.C, Boolean.valueOf(this.D), Integer.valueOf(this.E), Boolean.valueOf(this.H)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.a0(parcel, 2, this.B, i10);
        t1.b0(parcel, 3, this.C);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D ? 1 : 0);
        t1.f0(parcel, 5, 4);
        parcel.writeInt(this.E);
        t1.a0(parcel, 6, this.F, i10);
        t1.a0(parcel, 7, this.G, i10);
        t1.f0(parcel, 8, 4);
        parcel.writeInt(this.H ? 1 : 0);
        t1.h0(iG0, parcel);
    }
}
