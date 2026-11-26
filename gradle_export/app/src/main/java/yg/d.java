package yg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dh.q;
import dh.s;
import dh.u;
import java.util.Objects;

public final class d extends f {
    public final m C;
    public final long D;
    public final long E;
    public final xf.g F;
    public final g G;

    public d(g gVar, xf.g gVar2, m mVar, long j9, long j10, xf.g gVar3) {
        super(gVar, gVar2);
        this.C = mVar;
        this.D = j9;
        this.E = j10;
        this.F = gVar3;
        Objects.requireNonNull(gVar);
        this.G = gVar;
    }

    @Override
    public final void b() {
        m mVar = this.C;
        xf.g gVar = this.F;
        g gVar2 = this.G;
        if (g.d(gVar2)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (g.c(gVar2)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            u uVar = gVar2.f16879e.f4888n;
            Bundle bundleA = g.a(gVar2, mVar, this.D, this.E);
            e eVar = new e(gVar2, gVar, 0);
            s sVar = (s) uVar;
            sVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i10 = q.f4890a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(eVar);
            try {
                sVar.f4893e.transact(3, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e3) {
            gVar2.f16875a.a(e3, "requestExpressIntegrityToken(%s, %s, %s)", mVar.f16887a, mVar.f16888b, Long.valueOf(this.D));
            gVar.c(new StandardIntegrityException(-100, e3));
        }
    }
}
