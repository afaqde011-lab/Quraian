package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class j implements k {

    public IBinder f9369e;

    @Override
    public final void A0(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void D0(int i10, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            ca.v.I(parcelObtain, bundle3);
            this.f9369e.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void J0(int i10, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            ca.v.I(parcelObtain, bundle2);
            this.f9369e.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void O0(int i10, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.m(parcelObtain, list);
            this.f9369e.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void R1(int i10, Bundle bundle, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9369e.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void V1(int i10, String str, int i11, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i11);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(4001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void X0(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void Y0(int i10, String str, int i11, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i11);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(4002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void Z(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void a(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            this.f9369e.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f9369e;
    }

    @Override
    public final void b(int i10, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9369e.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void b2(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void g() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(0);
            this.f9369e.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void g1(int i10, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            ca.v.I(parcelObtain, bundle2);
            this.f9369e.transact(3010, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void k(int i10, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.m(parcelObtain, list);
            this.f9369e.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void x0(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i10);
            ca.v.I(parcelObtain, bundle);
            this.f9369e.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
