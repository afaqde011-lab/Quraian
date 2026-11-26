package c3;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class x1 {

    public final int f2768a;

    public boolean f2769b;

    public int f2770c;

    public Object f2771d;

    public Object f2772e;

    public x1(Context context, u uVar) {
        this.f2768a = 0;
        this.f2771d = uVar;
        this.f2770c = 0;
        this.f2772e = new GestureDetector(context, new w1(this));
    }

    public x1(Parcel parcel) {
        this.f2768a = 2;
        kotlin.jvm.internal.m.e(parcel, "parcel");
        int i10 = parcel.readInt();
        long[] jArr = new long[i10];
        this.f2771d = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        kotlin.jvm.internal.m.d(creator, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[i10];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i11 = 0; i11 < i10; i11++) {
            if (remoteViewsArr[i11] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f2772e = remoteViewsArr;
        this.f2769b = parcel.readInt() == 1;
        this.f2770c = parcel.readInt();
    }

    public x1(BottomSheetBehavior bottomSheetBehavior) {
        this.f2768a = 3;
        this.f2772e = bottomSheetBehavior;
        this.f2771d = new a50.d(this, 10);
    }

    public x1(SideSheetBehavior sideSheetBehavior) {
        this.f2768a = 5;
        this.f2772e = sideSheetBehavior;
        this.f2771d = new m9.f(this, 13);
    }

    public x1(boolean z10, int i10, String str, Bundle bundle) {
        this.f2768a = 4;
        this.f2769b = z10;
        this.f2770c = i10;
        this.f2771d = str;
        this.f2772e = bundle == null ? Bundle.EMPTY : bundle;
    }

    public x1(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f2768a = 2;
        this.f2771d = jArr;
        this.f2772e = remoteViewsArr;
        this.f2769b = false;
        this.f2770c = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = h00.q.G0(arrayList).size();
        if (size > 1) {
            throw new IllegalArgumentException(g4.c.i("View type count is set to 1, but the collection contains ", size, " different layout ids").toString());
        }
    }

    public com.google.android.gms.common.api.internal.o0 a() {
        com.google.android.gms.common.internal.d0.a("execute parameter required", ((com.google.android.gms.common.api.internal.q) this.f2771d) != null);
        return new com.google.android.gms.common.api.internal.o0(this, (pe.d[]) this.f2772e, this.f2769b, this.f2770c);
    }

    public void b(int i10) {
        switch (this.f2768a) {
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2772e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2770c = i10;
                    if (!this.f2769b) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((a50.d) this.f2771d);
                        this.f2769b = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2772e;
                WeakReference weakReference2 = sideSheetBehavior.f4191p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2770c = i10;
                    if (!this.f2769b) {
                        ((View) sideSheetBehavior.f4191p.get()).postOnAnimation((m9.f) this.f2771d);
                        this.f2769b = true;
                    }
                    break;
                }
                break;
        }
    }
}
