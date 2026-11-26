package tf;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class c0 extends com.google.android.gms.internal.measurement.x implements e0 {
    public c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override
    public final i A(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        Parcel parcelH2 = h2(21, parcelI2);
        i iVar = (i) com.google.android.gms.internal.measurement.z.a(parcelH2, i.CREATOR);
        parcelH2.recycle();
        return iVar;
    }

    @Override
    public final void C(e eVar, g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, eVar);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(12, parcelI2);
    }

    @Override
    public final List E0(String str, String str2, boolean z10, g4 g4Var) {
        Parcel parcelI2 = i2();
        parcelI2.writeString(str);
        parcelI2.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f3938a;
        parcelI2.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        Parcel parcelH2 = h2(14, parcelI2);
        ArrayList arrayListCreateTypedArrayList = parcelH2.createTypedArrayList(b4.CREATOR);
        parcelH2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final void J(s sVar, g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, sVar);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(1, parcelI2);
    }

    @Override
    public final void K1(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(26, parcelI2);
    }

    @Override
    public final void L1(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(6, parcelI2);
    }

    @Override
    public final void O1(g4 g4Var, d dVar) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        com.google.android.gms.internal.measurement.z.b(parcelI2, dVar);
        j2(30, parcelI2);
    }

    @Override
    public final void R0(Bundle bundle, g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, bundle);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(19, parcelI2);
    }

    @Override
    public final void S1(String str, String str2, long j9, String str3) {
        Parcel parcelI2 = i2();
        parcelI2.writeLong(j9);
        parcelI2.writeString(str);
        parcelI2.writeString(str2);
        parcelI2.writeString(str3);
        j2(10, parcelI2);
    }

    @Override
    public final void T(g4 g4Var, Bundle bundle, g0 g0Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        com.google.android.gms.internal.measurement.z.b(parcelI2, bundle);
        com.google.android.gms.internal.measurement.z.c(parcelI2, g0Var);
        j2(31, parcelI2);
    }

    @Override
    public final void U0(b4 b4Var, g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, b4Var);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(2, parcelI2);
    }

    @Override
    public final byte[] V(String str, s sVar) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, sVar);
        parcelI2.writeString(str);
        Parcel parcelH2 = h2(9, parcelI2);
        byte[] bArrCreateByteArray = parcelH2.createByteArray();
        parcelH2.recycle();
        return bArrCreateByteArray;
    }

    @Override
    public final void Y(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(20, parcelI2);
    }

    @Override
    public final void Z0(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(18, parcelI2);
    }

    @Override
    public final List a0(String str, String str2, String str3) {
        Parcel parcelI2 = i2();
        parcelI2.writeString(null);
        parcelI2.writeString(str2);
        parcelI2.writeString(str3);
        Parcel parcelH2 = h2(17, parcelI2);
        ArrayList arrayListCreateTypedArrayList = parcelH2.createTypedArrayList(e.CREATOR);
        parcelH2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final void b1(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(27, parcelI2);
    }

    @Override
    public final void e2(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(25, parcelI2);
    }

    @Override
    public final void m(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        j2(4, parcelI2);
    }

    @Override
    public final String m0(g4 g4Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        Parcel parcelH2 = h2(11, parcelI2);
        String string = parcelH2.readString();
        parcelH2.recycle();
        return string;
    }

    @Override
    public final List q(String str, String str2, String str3, boolean z10) {
        Parcel parcelI2 = i2();
        parcelI2.writeString(null);
        parcelI2.writeString(str2);
        parcelI2.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f3938a;
        parcelI2.writeInt(z10 ? 1 : 0);
        Parcel parcelH2 = h2(15, parcelI2);
        ArrayList arrayListCreateTypedArrayList = parcelH2.createTypedArrayList(b4.CREATOR);
        parcelH2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final List s0(String str, String str2, g4 g4Var) {
        Parcel parcelI2 = i2();
        parcelI2.writeString(str);
        parcelI2.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        Parcel parcelH2 = h2(16, parcelI2);
        ArrayList arrayListCreateTypedArrayList = parcelH2.createTypedArrayList(e.CREATOR);
        parcelH2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final void y0(g4 g4Var, r3 r3Var, i0 i0Var) {
        Parcel parcelI2 = i2();
        com.google.android.gms.internal.measurement.z.b(parcelI2, g4Var);
        com.google.android.gms.internal.measurement.z.b(parcelI2, r3Var);
        com.google.android.gms.internal.measurement.z.c(parcelI2, i0Var);
        j2(29, parcelI2);
    }
}
