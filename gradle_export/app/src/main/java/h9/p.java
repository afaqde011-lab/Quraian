package h9;

import a8.l0;
import a8.n0;
import android.util.SparseArray;
import com.google.android.gms.cast.Cast;

public final class p {

    public final l0 f6811a;

    public final boolean f6812b;

    public final boolean f6813c;

    public final n0 f6816f;

    public byte[] f6817g;

    public int f6818h;

    public int f6819i;

    public long f6820j;

    public boolean f6821k;
    public long l;

    public boolean f6823o;

    public long f6824p;

    public long f6825q;

    public boolean f6826r;

    public boolean f6827s;

    public final SparseArray f6814d = new SparseArray();

    public final SparseArray f6815e = new SparseArray();
    public o m = new o();

    public o f6822n = new o();

    public p(l0 l0Var, boolean z10, boolean z11) {
        this.f6811a = l0Var;
        this.f6812b = z10;
        this.f6813c = z11;
        byte[] bArr = new byte[Cast.MAX_NAMESPACE_LENGTH];
        this.f6817g = bArr;
        this.f6816f = new n0(bArr, 0, 0);
        this.f6821k = false;
        this.f6823o = false;
        o oVar = this.f6822n;
        oVar.f6798b = false;
        oVar.f6797a = false;
    }
}
