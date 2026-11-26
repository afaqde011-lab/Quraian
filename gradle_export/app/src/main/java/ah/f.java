package ah;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import bh.k;
import bh.l;
import java.util.HashMap;
import java.util.Iterator;

public final class f extends bh.g {
    public final int B = 0;
    public final Object C;
    public final Object D;

    public f(h hVar, xf.g gVar, xf.g gVar2) {
        super(gVar);
        this.C = gVar2;
        this.D = hVar;
    }

    public f(k kVar, IBinder iBinder) {
        this.C = iBinder;
        this.D = kVar;
    }

    @Override
    public final void a() {
        HashMap map;
        bh.e cVar = null;
        switch (this.B) {
            case 0:
                try {
                    h hVar = (h) this.D;
                    bh.e eVar = hVar.f483a.m;
                    String str = hVar.f484b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = i.f485a;
                    synchronized (i.class) {
                        map = i.f485a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    h hVar2 = (h) this.D;
                    xf.g gVar = (xf.g) this.C;
                    String str2 = hVar2.f484b;
                    g gVar2 = new g(hVar2, gVar);
                    bh.c cVar2 = (bh.c) eVar;
                    cVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i10 = bh.b.f2501a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(gVar2);
                    try {
                        cVar2.f2502e.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e3) {
                    h hVar3 = (h) this.D;
                    bh.f fVar = h.f482c;
                    Object[] objArr = {hVar3.f484b};
                    fVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", bh.f.i(fVar.A, "error requesting in-app review for %s", objArr), e3);
                    }
                    ((xf.g) this.C).c(new RuntimeException(e3));
                    return;
                }
            default:
                l lVar = (l) ((k) this.D).B;
                IBinder iBinder = (IBinder) this.C;
                int i11 = bh.d.f2503f;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    cVar = iInterfaceQueryLocalInterface instanceof bh.e ? (bh.e) iInterfaceQueryLocalInterface : new bh.c(iBinder);
                }
                lVar.m = cVar;
                bh.f fVar2 = lVar.f2508b;
                fVar2.g("linkToDeath", new Object[0]);
                try {
                    ((bh.c) lVar.m).f2502e.linkToDeath(lVar.f2516j, 0);
                    break;
                } catch (RemoteException e10) {
                    Object[] objArr2 = new Object[0];
                    fVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", bh.f.i(fVar2.A, "linkToDeath failed", objArr2), e10);
                    }
                }
                lVar.f2513g = false;
                Iterator it = lVar.f2510d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                lVar.f2510d.clear();
                return;
        }
    }
}
