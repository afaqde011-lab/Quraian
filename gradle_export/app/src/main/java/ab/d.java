package ab;

import android.content.Context;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public final class d implements Callable {

    public final int f362a;

    public final Object f363b;

    public final Object f364c;

    public final Object f365d;

    public d(Object obj, Object obj2, Object obj3, int i10) {
        this.f362a = i10;
        this.f364c = obj;
        this.f365d = obj2;
        this.f363b = obj3;
    }

    @Override
    public final Object call() {
        Boolean bool;
        int i10 = this.f362a;
        int i11 = 0;
        Object obj = this.f363b;
        Object obj2 = this.f365d;
        Object obj3 = this.f364c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                WorkDatabase workDatabase = ((g) obj3).f372e;
                hb.z zVarX = workDatabase.x();
                zVarX.getClass();
                kotlin.jvm.internal.m.e(str, "id");
                ((ArrayList) obj2).addAll((List) rd.a.M(zVarX.f7033a, true, false, new hb.u(str, 6)));
                return workDatabase.w().e(str);
            case 1:
                Context context = (Context) obj2;
                String str2 = (String) obj;
                Context context2 = (Context) ((WeakReference) obj3).get();
                if (context2 != null) {
                    context = context2;
                }
                try {
                    k50.c0 c0VarR = bi.b.r(bi.b.S(context.getResources().openRawResource(2131820549)));
                    try {
                        try {
                            k50.c0 c0VarR2 = bi.b.r(new k50.a0(c0VarR));
                            byte[] bArr = cc.d.f3124c;
                            int length = bArr.length;
                            while (true) {
                                if (i11 < length) {
                                    if (c0VarR2.readByte() != bArr[i11]) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    c0VarR2.close();
                                    bool = Boolean.TRUE;
                                }
                            }
                        } catch (NoSuchMethodError unused) {
                            bool = Boolean.FALSE;
                        }
                    } catch (Exception unused2) {
                        oc.b.f11920a.getClass();
                        bool = Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        ZipInputStream zipInputStream = new ZipInputStream(new k50.g(c0VarR, 1));
                        try {
                            return cc.d.b(context, zipInputStream, str2);
                        } finally {
                            oc.e.b(zipInputStream);
                        }
                    }
                    k50.g gVar = new k50.g(c0VarR, 1);
                    try {
                        k50.c0 c0VarR3 = bi.b.r(bi.b.S(gVar));
                        String[] strArr = nc.c.E;
                        return cc.d.a(new nc.d(c0VarR3), str2, true);
                    } finally {
                        oc.e.b(gVar);
                    }
                } catch (Resources.NotFoundException e3) {
                    return new cc.l((Throwable) e3);
                }
                return new cc.l((Throwable) e3);
            default:
                return ((ji.f) obj3).A.submit(new ji.a((Callable) obj2, (gi.c) obj, 1));
        }
    }
}
