package yg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dh.q;
import dh.s;
import dh.u;
import java.util.Objects;

public final class c extends f {
    public final long C;
    public final xf.g D;
    public final g E;

    public c(g gVar, xf.g gVar2, long j9, xf.g gVar3) {
        super(gVar, gVar2);
        this.C = j9;
        this.D = gVar3;
        Objects.requireNonNull(gVar);
        this.E = gVar;
    }

    @Override
    public final void b() {
        xf.g gVar = this.D;
        long j9 = this.C;
        g gVar2 = this.E;
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
            Bundle bundleB = g.b(gVar2, j9);
            e eVar = new e(gVar2, gVar, 1);
            s sVar = (s) uVar;
            sVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i10 = q.f4890a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(eVar);
            try {
                sVar.f4893e.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e3) {
            gVar2.f16875a.a(e3, "warmUpIntegrityToken(%s)", Long.valueOf(j9));
            gVar.c(new StandardIntegrityException(-100, e3));
        }
    }
}
