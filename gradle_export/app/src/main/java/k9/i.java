package k9;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class i {
    public static final String A;
    public static final String B;
    public static final String C;

    public static final String f9341o;

    public static final String f9342p;

    public static final String f9343q;

    public static final String f9344r;

    public static final String f9345s;

    public static final String f9346t;

    public static final String f9347u;

    public static final String f9348v;

    public static final String f9349w;

    public static final String f9350x;

    public static final String f9351y;

    public static final String f9352z;

    public final int f9353a;

    public final int f9354b;

    public final m f9355c;

    public final PendingIntent f9356d;

    public final a4 f9357e;

    public final androidx.media3.common.b1 f9358f;

    public final androidx.media3.common.b1 f9359g;

    public final Bundle f9360h;

    public final Bundle f9361i;

    public final t3 f9362j;

    public final fh.t0 f9363k;
    public final fh.t0 l;
    public final MediaSession.Token m;

    public final fh.t0 f9364n;

    static {
        String str = e7.i0.f5136a;
        f9341o = Integer.toString(0, 36);
        f9342p = Integer.toString(1, 36);
        f9343q = Integer.toString(2, 36);
        f9344r = Integer.toString(9, 36);
        f9345s = Integer.toString(14, 36);
        f9346t = Integer.toString(13, 36);
        f9347u = Integer.toString(3, 36);
        f9348v = Integer.toString(4, 36);
        f9349w = Integer.toString(5, 36);
        f9350x = Integer.toString(6, 36);
        f9351y = Integer.toString(11, 36);
        f9352z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public i(int i10, int i11, m mVar, PendingIntent pendingIntent, fh.t0 t0Var, fh.t0 t0Var2, fh.t0 t0Var3, a4 a4Var, androidx.media3.common.b1 b1Var, androidx.media3.common.b1 b1Var2, Bundle bundle, Bundle bundle2, t3 t3Var, MediaSession.Token token) {
        this.f9353a = i10;
        this.f9354b = i11;
        this.f9355c = mVar;
        this.f9356d = pendingIntent;
        this.f9363k = t0Var;
        this.l = t0Var2;
        this.f9364n = t0Var3;
        this.f9357e = a4Var;
        this.f9358f = b1Var;
        this.f9359g = b1Var2;
        this.f9360h = bundle;
        this.f9361i = bundle2;
        this.f9362j = t3Var;
        this.m = token;
    }

    public static i a(Bundle bundle) {
        fh.d2 d2VarG;
        fh.d2 d2VarG2;
        fh.d2 d2VarG3;
        m mVar;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof h) {
            return ((h) binder).f9329e;
        }
        int i10 = bundle.getInt(f9341o, 0);
        int i11 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(f9342p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f9343q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f9344r);
        if (parcelableArrayList != null) {
            fh.q0 q0VarM = fh.t0.m();
            for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i12);
                bundle2.getClass();
                q0VarM.c(b.i(i11, bundle2));
            }
            d2VarG = q0VarM.g();
        } else {
            fh.r0 r0Var = fh.t0.B;
            d2VarG = fh.d2.E;
        }
        fh.d2 d2Var = d2VarG;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f9345s);
        if (parcelableArrayList2 != null) {
            fh.q0 q0VarM2 = fh.t0.m();
            for (int i13 = 0; i13 < parcelableArrayList2.size(); i13++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i13);
                bundle3.getClass();
                q0VarM2.c(b.i(i11, bundle3));
            }
            d2VarG2 = q0VarM2.g();
        } else {
            fh.r0 r0Var2 = fh.t0.B;
            d2VarG2 = fh.d2.E;
        }
        fh.d2 d2Var2 = d2VarG2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(f9346t);
        if (parcelableArrayList3 != null) {
            fh.q0 q0VarM3 = fh.t0.m();
            for (int i14 = 0; i14 < parcelableArrayList3.size(); i14++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i14);
                bundle4.getClass();
                q0VarM3.c(b.i(i11, bundle4));
            }
            d2VarG3 = q0VarM3.g();
        } else {
            fh.r0 r0Var3 = fh.t0.B;
            d2VarG3 = fh.d2.E;
        }
        fh.d2 d2Var3 = d2VarG3;
        Bundle bundle5 = bundle.getBundle(f9347u);
        a4 a4VarA = bundle5 == null ? a4.f9211b : a4.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f9349w);
        androidx.media3.common.b1 b1VarB = bundle6 == null ? androidx.media3.common.b1.f1101b : androidx.media3.common.b1.b(bundle6);
        Bundle bundle7 = bundle.getBundle(f9348v);
        androidx.media3.common.b1 b1VarB2 = bundle7 == null ? androidx.media3.common.b1.f1101b : androidx.media3.common.b1.b(bundle7);
        Bundle bundle8 = bundle.getBundle(f9350x);
        Bundle bundle9 = bundle.getBundle(f9351y);
        Bundle bundle10 = bundle.getBundle(f9352z);
        t3 t3VarR = bundle10 == null ? t3.H : t3.r(i11, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i15 = p3.f9382k;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) {
            l lVar = new l();
            lVar.f9370e = iBinder;
            mVar = lVar;
        } else {
            mVar = (m) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new i(i10, i11, mVar, pendingIntent, d2Var, d2Var2, d2Var3, a4VarA, b1VarB2, b1VarB, bundle12, bundle11, t3VarR, token);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f9341o, this.f9353a);
        bundle.putBinder(f9342p, this.f9355c.asBinder());
        bundle.putParcelable(f9343q, this.f9356d);
        fh.t0 t0Var = this.f9363k;
        boolean zIsEmpty = t0Var.isEmpty();
        String str = f9344r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(t0Var.size());
            Iterator<E> it = t0Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((b) it.next()).o());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        fh.t0 t0Var2 = this.l;
        if (!t0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(t0Var2.size());
                Iterator<E> it2 = t0Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((b) it2.next()).o());
                }
                bundle.putParcelableArrayList(f9345s, arrayList2);
            } else {
                fh.d2 d2VarJ = b.j(t0Var2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(d2VarJ.D);
                fh.r0 r0VarListIterator = d2VarJ.listIterator(0);
                while (r0VarListIterator.hasNext()) {
                    arrayList3.add(((b) r0VarListIterator.next()).o());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        fh.t0 t0Var3 = this.f9364n;
        if (!t0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(t0Var3.size());
            Iterator<E> it3 = t0Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((b) it3.next()).o());
            }
            bundle.putParcelableArrayList(f9346t, arrayList4);
        }
        bundle.putBundle(f9347u, this.f9357e.b());
        String str2 = f9348v;
        androidx.media3.common.b1 b1Var = this.f9358f;
        bundle.putBundle(str2, b1Var.c());
        String str3 = f9349w;
        androidx.media3.common.b1 b1Var2 = this.f9359g;
        bundle.putBundle(str3, b1Var2.c());
        bundle.putBundle(f9350x, this.f9360h);
        bundle.putBundle(f9351y, this.f9361i);
        bundle.putBundle(f9352z, this.f9362j.q(q3.d(b1Var, b1Var2), false, false).t(i10));
        bundle.putInt(A, this.f9354b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
