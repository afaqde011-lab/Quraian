package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

public final class l implements m {

    public IBinder f9370e;

    @Override
    public final void B(k kVar, int i10, boolean z10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(z10 ? 1 : 0);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void B0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void B1(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void C0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3058, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void E1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void F(k kVar, int i10, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9370e.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void F0(k kVar, int i10, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void G0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void G1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void H0(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void I0(k kVar, int i10, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, surface);
            this.f9370e.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void I1(k kVar, int i10, float f3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeFloat(f3);
            this.f9370e.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void L0(k kVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            this.f9370e.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void M(k kVar, int i10, int i11, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void M0(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void M1(k kVar, int i10, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9370e.transact(3062, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void N(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void N1(k kVar, int i10, int i11, int i12, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            parcelObtain.writeInt(i13);
            this.f9370e.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void P0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void Q1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void R(k kVar, int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle3);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3060, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void S(k kVar, int i10, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9370e.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void S0(k kVar, int i10, int i11, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeStrongBinder(iBinder);
            this.f9370e.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void T1(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void U(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void U1(k kVar, int i10, float f3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeFloat(f3);
            this.f9370e.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void W(k kVar, int i10, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9370e.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void W0(k kVar, int i10, int i11, int i12, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            parcelObtain.writeStrongBinder(iBinder);
            this.f9370e.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void W1(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void X1(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void Y1(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3029, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f9370e;
    }

    @Override
    public final void b0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void f0(k kVar, int i10, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void f1(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void f2(k kVar, int i10, Surface surface, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, surface);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            this.f9370e.transact(3061, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void g0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3059, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void j0(k kVar, int i10, IBinder iBinder, int i11, long j9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i11);
            parcelObtain.writeLong(j9);
            this.f9370e.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void j1(k kVar, int i10, androidx.media3.common.g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(gVar);
            this.f9370e.transact(3010, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void l(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void l0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void l1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void m1(k kVar, int i10, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(iBinder);
            this.f9370e.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void n(k kVar, int i10, Bundle bundle, long j9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            parcelObtain.writeLong(j9);
            this.f9370e.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void n0(k kVar, int i10, int i11, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void n1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void o1(k kVar, int i10, int i11, long j9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeLong(j9);
            this.f9370e.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void p(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void p1(k kVar, int i10, IBinder iBinder, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void q0(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void r(k kVar, int i10, Bundle bundle, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void r0(k kVar, int i10, Bundle bundle) {
        Bundle bundle2 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle2);
            this.f9370e.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void s1(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void t1(k kVar, int i10, long j9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeLong(j9);
            this.f9370e.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void u0(k kVar, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            this.f9370e.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void v0(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void v1(k kVar, int i10, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void w(k kVar, int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            this.f9370e.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void w1(k kVar, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            this.f9370e.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void z0(k kVar, int i10, Bundle bundle, boolean z10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(i10);
            com.google.android.gms.internal.measurement.y3.k(parcelObtain, bundle);
            parcelObtain.writeInt(z10 ? 1 : 0);
            this.f9370e.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
