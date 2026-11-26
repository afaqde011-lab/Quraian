package tf;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class n1 extends com.google.android.gms.internal.measurement.y implements e0 {

    public final y3 f14673e;

    public Boolean f14674f;

    public String f14675g;

    public n1(y3 y3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.d0.h(y3Var);
        this.f14673e = y3Var;
        this.f14675g = null;
    }

    @Override
    public final i A(g4 g4Var) {
        g2(g4Var);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        y3 y3Var = this.f14673e;
        try {
            return (i) y3Var.C().d1(new qd.b0(this, g4Var, 2)).get(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            y3Var.t().G.d("Failed to get consent. appId", q0.d1(str), e3);
            return new i(null);
        }
    }

    @Override
    public final void C(e eVar, g4 g4Var) {
        com.google.android.gms.common.internal.d0.h(eVar);
        com.google.android.gms.common.internal.d0.h(eVar.C);
        g2(g4Var);
        e eVar2 = new e(eVar);
        eVar2.A = g4Var.A;
        i2(new ca.u(this, eVar2, g4Var, false, 7));
    }

    @Override
    public final List E0(String str, String str2, boolean z10, g4 g4Var) {
        g2(g4Var);
        String str3 = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str3);
        y3 y3Var = this.f14673e;
        try {
            List<c4> list = (List) y3Var.C().c1(new l1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c4 c4Var : list) {
                if (z10 || !e4.t1(c4Var.f14610c)) {
                    arrayList.add(new b4(c4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e3) {
            y3Var.t().G.d("Failed to query user properties. appId", q0.d1(str3), e3);
            return Collections.EMPTY_LIST;
        }
    }

    @Override
    public final void J(s sVar, g4 g4Var) {
        com.google.android.gms.common.internal.d0.h(sVar);
        g2(g4Var);
        i2(new ca.u(this, sVar, g4Var, false, 8));
    }

    @Override
    public final void K1(g4 g4Var) {
        com.google.android.gms.common.internal.d0.e(g4Var.A);
        com.google.android.gms.common.internal.d0.h(g4Var.S);
        f(new i1(this, g4Var, 2));
    }

    @Override
    public final void L1(g4 g4Var) {
        g2(g4Var);
        i2(new j1(this, g4Var, 1));
    }

    @Override
    public final void O1(g4 g4Var, d dVar) {
        g2(g4Var);
        i2(new ca.u(this, g4Var, dVar, 11));
    }

    @Override
    public final void R0(Bundle bundle, g4 g4Var) {
        g2(g4Var);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str);
        i2(new com.google.android.gms.internal.cast.r0(this, bundle, str, g4Var, 7));
    }

    @Override
    public final void S1(String str, String str2, long j9, String str3) {
        i2(new k1(this, str2, str3, str, j9, 0));
    }

    @Override
    public final void T(g4 g4Var, Bundle bundle, g0 g0Var) {
        g2(g4Var);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str);
        this.f14673e.C().e1(new l9.r(this, g4Var, bundle, g0Var, str));
    }

    @Override
    public final void U0(b4 b4Var, g4 g4Var) {
        com.google.android.gms.common.internal.d0.h(b4Var);
        g2(g4Var);
        i2(new ca.u(this, b4Var, g4Var, false, 10));
    }

    @Override
    public final byte[] V(String str, s sVar) {
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.h(sVar);
        h2(str, true);
        y3 y3Var = this.f14673e;
        b50.b bVar = y3Var.t().N;
        h1 h1Var = y3Var.L;
        m0 m0Var = h1Var.J;
        String str2 = sVar.A;
        bVar.c(m0Var.a(str2), "Log and bundle. event");
        ((ve.b) y3Var.k0()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) y3Var.C().d1(new ef.b(this, sVar, str)).get();
            if (bArr == null) {
                y3Var.t().G.c(q0.d1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((ve.b) y3Var.k0()).getClass();
            y3Var.t().N.e("Log and bundle processed. event, size, time_ms", h1Var.J.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e3) {
            y3Var.t().G.e("Failed to log and bundle. appId, event, error", q0.d1(str), h1Var.J.a(str2), e3);
            return null;
        }
    }

    @Override
    public final void Y(g4 g4Var) {
        com.google.android.gms.common.internal.d0.e(g4Var.A);
        com.google.android.gms.common.internal.d0.h(g4Var.S);
        f(new j1(this, g4Var, 2));
    }

    @Override
    public final void Z0(g4 g4Var) {
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        h2(str, false);
        i2(new i1(this, g4Var, 1));
    }

    @Override
    public final List a0(String str, String str2, String str3) {
        h2(str, true);
        y3 y3Var = this.f14673e;
        try {
            return (List) y3Var.C().c1(new l1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e3) {
            y3Var.t().G.c(e3, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override
    public final void b1(g4 g4Var) {
        g2(g4Var);
        i2(new j1(this, g4Var, 0));
    }

    @Override
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        List list;
        y3 y3Var = this.f14673e;
        ArrayList arrayList = null;
        g0 f0Var = null;
        i0 h0Var = null;
        int i11 = 1;
        switch (i10) {
            case 1:
                s sVar = (s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR);
                g4 g4Var = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                J(sVar, g4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                b4 b4Var = (b4) com.google.android.gms.internal.measurement.z.a(parcel, b4.CREATOR);
                g4 g4Var2 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                U0(b4Var, g4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                g4 g4Var3 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                m(g4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                s sVar2 = (s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                com.google.android.gms.common.internal.d0.h(sVar2);
                com.google.android.gms.common.internal.d0.e(string);
                h2(string, true);
                i2(new ca.u(this, sVar2, string, false, 9));
                parcel2.writeNoException();
                return true;
            case 6:
                g4 g4Var4 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                L1(g4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                g4 g4Var5 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                g2(g4Var5);
                String str = g4Var5.A;
                com.google.android.gms.common.internal.d0.h(str);
                try {
                    List<c4> list2 = (List) y3Var.C().c1(new qd.b0(this, str, i11)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (c4 c4Var : list2) {
                        if (z10 || !e4.t1(c4Var.f14610c)) {
                            arrayList2.add(new b4(c4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e3) {
                    y3Var.t().G.d("Failed to get user properties. appId", q0.d1(str), e3);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                s sVar3 = (s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                byte[] bArrV = V(string2, sVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrV);
                return true;
            case 10:
                long j9 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                S1(string3, string4, j9, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                g4 g4Var6 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                String strM0 = m0(g4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strM0);
                return true;
            case 12:
                e eVar = (e) com.google.android.gms.internal.measurement.z.a(parcel, e.CREATOR);
                g4 g4Var7 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                C(eVar, g4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) com.google.android.gms.internal.measurement.z.a(parcel, e.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                com.google.android.gms.common.internal.d0.h(eVar2);
                com.google.android.gms.common.internal.d0.h(eVar2.C);
                com.google.android.gms.common.internal.d0.e(eVar2.A);
                h2(eVar2.A, true);
                i2(new com.google.android.gms.internal.play_billing.r0(14, this, new e(eVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f3938a;
                z10 = parcel.readInt() != 0;
                g4 g4Var8 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listE0 = E0(string6, string7, z10, g4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE0);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.z.f3938a;
                z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listQ = q(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                g4 g4Var9 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listS0 = s0(string11, string12, g4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listS0);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listA0 = a0(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA0);
                return true;
            case TYPE_SINT64_VALUE:
                g4 g4Var10 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                Z0(g4Var10);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                g4 g4Var11 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                R0(bundle, g4Var11);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                g4 g4Var12 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                Y(g4Var12);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                g4 g4Var13 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                i iVarA = A(g4Var13);
                parcel2.writeNoException();
                if (iVarA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarA.writeToParcel(parcel2, 1);
                return true;
            case 24:
                g4 g4Var14 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                g2(g4Var14);
                String str2 = g4Var14.A;
                com.google.android.gms.common.internal.d0.h(str2);
                if (!y3Var.b0().f1(null, b0.Y0)) {
                    try {
                        list = (List) y3Var.C().c1(new m1(this, g4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        y3Var.t().G.d("Failed to get trigger URIs. appId", q0.d1(str2), e10);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) y3Var.C().d1(new m1(this, g4Var14, bundle2, 0)).get(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                        y3Var.t().G.d("Failed to get trigger URIs. appId", q0.d1(str2), e11);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                g4 g4Var15 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                e2(g4Var15);
                parcel2.writeNoException();
                return true;
            case RuntimeVersion.MINOR:
                g4 g4Var16 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                K1(g4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                g4 g4Var17 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                b1(g4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                g4 g4Var18 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                r3 r3Var = (r3) com.google.android.gms.internal.measurement.z.a(parcel, r3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    h0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new h0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                y0(g4Var18, r3Var, h0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                g4 g4Var19 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                d dVar = (d) com.google.android.gms.internal.measurement.z.a(parcel, d.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                O1(g4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                g4 g4Var20 = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    f0Var = iInterfaceQueryLocalInterface2 instanceof g0 ? (g0) iInterfaceQueryLocalInterface2 : new f0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                T(g4Var20, bundle3, f0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override
    public final void e2(g4 g4Var) {
        com.google.android.gms.common.internal.d0.e(g4Var.A);
        com.google.android.gms.common.internal.d0.h(g4Var.S);
        f(new j1(this, g4Var, 3));
    }

    public final void f(Runnable runnable) {
        y3 y3Var = this.f14673e;
        if (y3Var.C().b1()) {
            runnable.run();
        } else {
            y3Var.C().g1(runnable);
        }
    }

    public final void g2(g4 g4Var) {
        com.google.android.gms.common.internal.d0.h(g4Var);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        h2(str, false);
        this.f14673e.i0().Z0(g4Var.B);
    }

    public final void h2(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        y3 y3Var = this.f14673e;
        if (zIsEmpty) {
            y3Var.t().G.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f14674f == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f14675g) && !ve.c.e(y3Var.L.A, Binder.getCallingUid()) && !pe.h.a(y3Var.L.A).b(Binder.getCallingUid())) {
                        z11 = false;
                    }
                    this.f14674f = Boolean.valueOf(z11);
                }
                if (this.f14674f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e3) {
                y3Var.t().G.c(q0.d1(str), "Measurement Service called with invalid calling package. appId");
                throw e3;
            }
        }
        if (this.f14675g == null) {
            Context context = y3Var.L.A;
            int callingUid = Binder.getCallingUid();
            int i10 = pe.g.f12498e;
            if (ve.c.g(callingUid, context, str)) {
                this.f14675g = str;
            }
        }
        if (str.equals(this.f14675g)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void i2(Runnable runnable) {
        y3 y3Var = this.f14673e;
        if (y3Var.C().b1()) {
            runnable.run();
        } else {
            y3Var.C().e1(runnable);
        }
    }

    @Override
    public final void m(g4 g4Var) {
        g2(g4Var);
        i2(new i1(this, g4Var, 0));
    }

    @Override
    public final String m0(g4 g4Var) {
        g2(g4Var);
        y3 y3Var = this.f14673e;
        try {
            return (String) y3Var.C().c1(new qd.b0(y3Var, g4Var)).get(NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            y3Var.t().G.d("Failed to get app instance id. appId", q0.d1(g4Var.A), e3);
            return null;
        }
    }

    @Override
    public final List q(String str, String str2, String str3, boolean z10) {
        h2(str, true);
        y3 y3Var = this.f14673e;
        try {
            List<c4> list = (List) y3Var.C().c1(new l1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c4 c4Var : list) {
                if (z10 || !e4.t1(c4Var.f14610c)) {
                    arrayList.add(new b4(c4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e3) {
            y3Var.t().G.d("Failed to get user properties as. appId", q0.d1(str), e3);
            return Collections.EMPTY_LIST;
        }
    }

    @Override
    public final List s0(String str, String str2, g4 g4Var) {
        g2(g4Var);
        String str3 = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str3);
        y3 y3Var = this.f14673e;
        try {
            return (List) y3Var.C().c1(new l1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e3) {
            y3Var.t().G.c(e3, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override
    public final void y0(g4 g4Var, r3 r3Var, i0 i0Var) {
        g2(g4Var);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str);
        this.f14673e.C().e1(new com.google.android.gms.internal.cast.r0(this, str, r3Var, i0Var, 5));
    }
}
