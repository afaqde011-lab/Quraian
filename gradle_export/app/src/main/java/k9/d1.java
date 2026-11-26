package k9;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

public final class d1 extends Binder implements k {

    public final WeakReference f9263e;

    public d1(t0 t0Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.f9263e = new WeakReference(t0Var);
    }

    public static k d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof k)) {
            return (k) iInterfaceQueryLocalInterface;
        }
        j jVar = new j();
        jVar.f9369e = iBinder;
        return jVar;
    }

    @Override
    public final void A0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            f(new k7.t(c4.b(bundle), 2));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e3);
        }
    }

    @Override
    public final void D0(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            e7.a.m("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            f(new androidx.media3.common.k1(i10, z3.a(bundle), bundle2));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e3);
        }
    }

    @Override
    public final void J0(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iG2 = g2();
            if (iG2 == -1) {
                return;
            }
            try {
                f(new ak.a(t3.r(iG2, bundle), new r3(bundle2.getBoolean(r3.f9409d, false), bundle2.getBoolean(r3.f9410e, false)), 14));
            } catch (RuntimeException e3) {
                e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e3);
            }
        } catch (RuntimeException e10) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e10);
        }
    }

    @Override
    public final void O0(int i10, List list) {
        if (list == null) {
            return;
        }
        try {
            int iG2 = g2();
            if (iG2 == -1) {
                return;
            }
            fh.q0 q0VarM = fh.t0.m();
            for (int i11 = 0; i11 < list.size(); i11++) {
                Bundle bundle = (Bundle) list.get(i11);
                bundle.getClass();
                q0VarM.c(b.i(iG2, bundle));
            }
            f(new androidx.media3.common.k1(i10, q0VarM.g(), 2));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e3);
        }
    }

    @Override
    public final void R1(int i10, Bundle bundle, boolean z10) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(r3.f9409d, z10);
        bundle2.putBoolean(r3.f9410e, true);
        J0(i10, bundle, bundle2);
    }

    @Override
    public final void V1(int i10, String str, int i11, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            e7.a.m("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i11 < 0) {
            a1.b.y("onChildrenChanged(): Ignoring negative itemCount: ", i11, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                e1.a(bundle);
            } catch (RuntimeException e3) {
                e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e3);
                return;
            }
        }
        f(new j7.e(17));
    }

    @Override
    public final void X0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            h2(i10, q.a(bundle));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e3);
        }
    }

    @Override
    public final void Y0(int i10, String str, int i11, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            e7.a.m("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i11 < 0) {
            a1.b.y("onSearchResultChanged(): Ignoring negative itemCount: ", i11, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                e1.a(bundle);
            } catch (RuntimeException e3) {
                e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e3);
                return;
            }
        }
        f(new j7.e(17));
    }

    @Override
    public final void Z(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            f(new k7.t(i.a(bundle), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e3);
            g();
        }
    }

    @Override
    public final void a(int i10) {
        f(new j7.e(15));
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void b(int i10, int i11, int i12) {
        f(new i7.p(i11, i12, 2));
    }

    @Override
    public final void b2(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            h2(i10, d4.a(bundle));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e3);
        }
    }

    public final void f(c1 c1Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            t0 t0Var = (t0) this.f9263e.get();
            if (t0Var == null) {
                return;
            }
            e7.i0.M(t0Var.f9438a.f9523f, new ji.a(t0Var, c1Var, 11));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void g() {
        f(new j7.e(16));
    }

    @Override
    public final void g1(int i10, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            try {
                f(new b1(a4.a(bundle), androidx.media3.common.b1.b(bundle2)));
            } catch (RuntimeException e3) {
                e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
            }
        } catch (RuntimeException e10) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e10);
        }
    }

    public final int g2() {
        f4 f4Var;
        t0 t0Var = (t0) this.f9263e.get();
        if (t0Var == null || (f4Var = t0Var.f9449n) == null) {
            return -1;
        }
        return f4Var.f9293a.f();
    }

    public final void h2(int i10, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            t0 t0Var = (t0) this.f9263e.get();
            if (t0Var == null) {
                return;
            }
            t0Var.f9439b.j(i10, obj);
            t0Var.f9438a.b(new i7.a0(t0Var, i10, 2));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void k(int i10, List list) {
        if (list == null) {
            return;
        }
        try {
            int iG2 = g2();
            if (iG2 == -1) {
                return;
            }
            fh.q0 q0VarM = fh.t0.m();
            for (int i11 = 0; i11 < list.size(); i11++) {
                Bundle bundle = (Bundle) list.get(i11);
                bundle.getClass();
                q0VarM.c(b.i(iG2, bundle));
            }
            f(new androidx.media3.common.k1(i10, q0VarM.g(), 3));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e3);
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i10 == 4001) {
            V1(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
            return true;
        }
        if (i10 == 4002) {
            Y0(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
            return true;
        }
        switch (i10) {
            case 3001:
                Z(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
                return true;
            case 3002:
                b2(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
                return true;
            case 3003:
                X0(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
                return true;
            case 3004:
                k(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3005:
                int i12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                D0(i12, (Bundle) ca.v.l(parcel, creator), (Bundle) ca.v.l(parcel, creator));
                return true;
            case 3006:
                parcel.readInt();
                g();
                return true;
            case 3007:
                R1(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3008:
                A0(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
                return true;
            case 3009:
                x0(parcel.readInt(), (Bundle) ca.v.l(parcel, Bundle.CREATOR));
                return true;
            case 3010:
                int i13 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                g1(i13, (Bundle) ca.v.l(parcel, creator2), (Bundle) ca.v.l(parcel, creator2));
                return true;
            case 3011:
                a(parcel.readInt());
                return true;
            case 3012:
                parcel.readInt();
                Bundle bundle = (Bundle) ca.v.l(parcel, Bundle.CREATOR);
                if (bundle == null) {
                    e7.a.m("MediaControllerStub", "Ignoring null Bundle for extras");
                    return true;
                }
                f(new k7.t(bundle, 4));
                return true;
            case 3013:
                int i14 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                J0(i14, (Bundle) ca.v.l(parcel, creator3), (Bundle) ca.v.l(parcel, creator3));
                return true;
            case 3014:
                f(new k7.t(parcel.readInt(), (PendingIntent) ca.v.l(parcel, PendingIntent.CREATOR)));
                return true;
            case 3015:
                parcel.readInt();
                try {
                    b4.a((Bundle) ca.v.l(parcel, Bundle.CREATOR));
                    f(new j7.e(14));
                } catch (RuntimeException e3) {
                    e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e3);
                }
                return true;
            case 3016:
                O0(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3017:
                int i15 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) ca.v.l(parcel, creator4);
                Bundle bundle3 = (Bundle) ca.v.l(parcel, creator4);
                Bundle bundle4 = (Bundle) ca.v.l(parcel, creator4);
                if (bundle2 == null || bundle3 == null) {
                    e7.a.m("MediaControllerStub", "Ignoring custom command progress update with null args.");
                } else {
                    try {
                        f(new androidx.media3.cast.n(i15, z3.a(bundle2), bundle3, bundle4));
                    } catch (RuntimeException e10) {
                        e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e10);
                    }
                }
                return true;
            case 3018:
                b(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override
    public final void x0(int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            f(new a1(androidx.media3.common.b1.b(bundle)));
        } catch (RuntimeException e3) {
            e7.a.n("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
        }
    }
}
