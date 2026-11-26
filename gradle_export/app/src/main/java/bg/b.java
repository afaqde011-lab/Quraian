package bg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.t;
import e7.i0;
import e7.u;
import f7.d;
import g7.e;
import g7.f;
import j4.n;
import j4.r;
import java.util.ArrayList;
import java.util.List;
import l1.l;
import l9.f0;
import q0.j2;
import r3.p;
import x.c0;
import x.o;
import x.u1;
import x.v;

public final class b implements e, l1.a, p, u8.b, u1 {
    public int A;
    public int B;
    public final Object C;

    public b(int i10) {
        switch (i10) {
            case 2:
                this.C = new f0(29);
                this.A = 8000;
                this.B = 8000;
                break;
            default:
                this.C = new b[256];
                this.A = 0;
                this.B = 0;
                break;
        }
    }

    public b(int i10, int i11) {
        this.C = null;
        this.A = i10;
        int i12 = i11 & 7;
        this.B = i12 == 0 ? 8 : i12;
    }

    public b(int i10, int i11, Object obj) {
        this.A = i10;
        this.B = i11;
        this.C = obj;
    }

    public b(int i10, int i11, v vVar) {
        this.A = i10;
        this.B = i11;
        this.C = new p10.a(new c0(i10, i11, vVar));
    }

    public b(Context context) {
        this.B = 0;
        this.C = context;
    }

    public b(Context context, XmlResourceParser xmlResourceParser) {
        this.C = new ArrayList();
        this.B = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f8163h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.A = typedArrayObtainStyledAttributes.getResourceId(index, this.A);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.B);
                this.B = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public b(View view) {
        this.C = view;
    }

    public b(d dVar, t tVar) {
        u uVar = dVar.C;
        this.C = uVar;
        uVar.N(12);
        int iE = uVar.E();
        if ("audio/raw".equals(tVar.f1594n)) {
            int iP = i0.p(tVar.H) * tVar.F;
            if (iE == 0 || iE % iP != 0) {
                e7.a.m("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iP + ", stsz sample size: " + iE);
                iE = iP;
            }
        }
        this.A = iE == 0 ? -1 : iE;
        this.B = uVar.E();
    }

    public b(l1.a aVar, int i10) {
        this.C = aVar;
        this.A = i10;
    }

    public b(p pVar, int i10, int i11) {
        this.C = pVar;
        this.A = i10;
        this.B = i11;
    }

    @Override
    public o c(long j9, o oVar, o oVar2, o oVar3) {
        return ((p10.a) this.C).c(j9, oVar, oVar2, oVar3);
    }

    @Override
    public void d(int i10, Object obj) {
        ((l1.a) this.C).d(i10 + (this.B == 0 ? this.A : 0), obj);
    }

    @Override
    public void e(Object obj) {
        this.B++;
        ((l1.a) this.C).e(obj);
    }

    @Override
    public void f() {
        ((l1.a) this.C).f();
    }

    @Override
    public void g(int i10, int i11, int i12) {
        int i13 = this.B == 0 ? this.A : 0;
        ((l1.a) this.C).g(i10 + i13, i11 + i13, i12);
    }

    @Override
    public void h(int i10, int i11) {
        ((l1.a) this.C).h(i10 + (this.B == 0 ? this.A : 0), i11);
    }

    @Override
    public int i() {
        return this.A;
    }

    @Override
    public void j(Object obj, u00.n nVar) {
        ((l1.a) this.C).j(obj, nVar);
    }

    @Override
    public int k(int i10) {
        int iK = ((p) this.C).k(i10);
        if (i10 >= 0 && i10 <= this.B) {
            j2.c(iK, this.A, i10);
        }
        return iK;
    }

    @Override
    public void l() {
        if (this.B <= 0) {
            l.a("OffsetApplier up called with no corresponding down");
        }
        this.B--;
        ((l1.a) this.C).l();
    }

    @Override
    public void n(int i10, Object obj) {
        ((l1.a) this.C).n(i10 + (this.B == 0 ? this.A : 0), obj);
    }

    @Override
    public Object p() {
        return ((l1.a) this.C).p();
    }

    @Override
    public int q() {
        return this.B;
    }

    @Override
    public o r(long j9, o oVar, o oVar2, o oVar3) {
        return ((p10.a) this.C).r(j9, oVar, oVar2, oVar3);
    }

    @Override
    public int s() {
        return this.B;
    }

    @Override
    public f t() {
        return new g7.n(this.A, this.B, (f0) this.C);
    }

    @Override
    public int u() {
        int i10 = this.A;
        return i10 == -1 ? ((u) this.C).E() : i10;
    }

    @Override
    public int v() {
        return this.A;
    }

    public synchronized int w() {
        PackageInfo packageInfoB;
        if (this.A == 0) {
            try {
                packageInfoB = xe.b.a((Context) this.C).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("Metadata", "Failed to find package ".concat(e3.toString()));
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.A = packageInfoB.versionCode;
            }
        }
        return this.A;
    }

    public synchronized int x() {
        int i10 = this.B;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.C;
        PackageManager packageManager = context.getPackageManager();
        if (xe.b.a(context).f14783a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.B = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.B = 2;
        return 2;
    }

    @Override
    public int z(int i10) {
        int iZ = ((p) this.C).z(i10);
        if (i10 >= 0 && i10 <= this.A) {
            j2.b(iZ, this.B, i10);
        }
        return iZ;
    }
}
