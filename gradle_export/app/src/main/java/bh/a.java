package bh;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import dh.q;

public abstract class a extends Binder implements IInterface {

    public final int f2500e;

    public a(String str, int i10) {
        this.f2500e = i10;
        switch (i10) {
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public static void g2(Parcel parcel) {
        int i10 = com.google.android.gms.internal.play_billing.d.f3950a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(g4.c.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void h2(Parcel parcel) {
        int i10 = jf.c.f8279a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(g4.c.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    @Override
    public final IBinder asBinder() {
        int i10 = this.f2500e;
        return this;
    }

    public abstract boolean d(int i10, Parcel parcel);

    public abstract boolean f(int i10, Parcel parcel, Parcel parcel2);

    public abstract boolean i2(int i10, Parcel parcel, Parcel parcel2);

    public boolean j2(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        boolean zOnTransact = false;
        boolean zOnTransact2 = false;
        switch (this.f2500e) {
            case 0:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                ah.g gVar = (ah.g) this;
                if (i10 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i12 = b.f2501a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(g4.c.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                l lVar = gVar.f481h.f483a;
                if (lVar != null) {
                    xf.g gVar2 = gVar.f480g;
                    synchronized (lVar.f2512f) {
                        lVar.f2511e.remove(gVar2);
                        break;
                    }
                    lVar.a().post(new j(lVar, zOnTransact ? 1 : 0));
                }
                gVar.f479f.g("onGetLaunchReviewFlowInfo", new Object[0]);
                gVar.f480g.d(new ah.b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
            case 1:
                if (i10 > 16777215) {
                    zOnTransact = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return f(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                yg.e eVar = (yg.e) this;
                xf.g gVar3 = eVar.f16870f;
                yg.g gVar4 = eVar.f16871g;
                if (i10 == 2) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) q.a(parcel);
                    q.b(parcel);
                    eVar.k1(bundle2);
                } else if (i10 == 3) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) q.a(parcel);
                    q.b(parcel);
                    eVar.i0(bundle3);
                } else {
                    if (i10 != 4 && i10 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    q.b(parcel);
                    gVar4.f16879e.c(gVar3);
                }
                return true;
            case 3:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return i2(i10, parcel, parcel2);
            case 4:
                if (i10 > 16777215) {
                    zOnTransact2 = super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return d(i10, parcel);
            default:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return j2(i10, parcel, parcel2);
        }
    }
}
