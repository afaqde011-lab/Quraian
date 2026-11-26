package d6;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;

public final class h1 implements RemoteViewsService.RemoteViewsFactory {

    public final GlanceRemoteViewsService f4634a;

    public final int f4635b;

    public final int f4636c;

    public final String f4637d;

    public h1(GlanceRemoteViewsService glanceRemoteViewsService, int i10, int i11, String str) {
        this.f4634a = glanceRemoteViewsService;
        this.f4635b = i10;
        this.f4636c = i11;
        this.f4637d = str;
    }

    public static final java.lang.Object a(d6.h1 r10, d6.h r11, m00.c r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        throw new UnsupportedOperationException("Method not decompiled: d6.h1.a(d6.h1, d6.h, m00.c):java.lang.Object");
    }

    public final v1 b() {
        v1 v1Var;
        a8.l lVar = GlanceRemoteViewsService.A;
        int i10 = this.f4635b;
        int i11 = this.f4636c;
        String str = this.f4637d;
        a8.l lVar2 = GlanceRemoteViewsService.A;
        synchronized (lVar2) {
            v1Var = (v1) lVar2.A.get(i10 + '-' + i11 + '-' + str);
            if (v1Var == null) {
                v1Var = v1.f4705d;
            }
        }
        return v1Var;
    }

    @Override
    public final int getCount() {
        return b().f4706a.length;
    }

    @Override
    public final long getItemId(int i10) {
        try {
            return b().f4706a[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public final RemoteViews getViewAt(int i10) {
        try {
            return b().f4707b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f4634a.getPackageName(), 2131558893);
        }
    }

    @Override
    public final int getViewTypeCount() {
        return b().f4708c;
    }

    @Override
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override
    public final void onCreate() {
    }

    @Override
    public final void onDataSetChanged() {
        a40.c0.D(new a1.a0(this, (k00.c) null, 13));
    }

    @Override
    public final void onDestroy() {
        a8.l lVar = GlanceRemoteViewsService.A;
        int i10 = this.f4635b;
        int i11 = this.f4636c;
        String str = this.f4637d;
        a8.l lVar2 = GlanceRemoteViewsService.A;
        synchronized (lVar2) {
            lVar2.A.remove(i10 + '-' + i11 + '-' + str);
        }
    }
}
