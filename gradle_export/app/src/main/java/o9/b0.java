package o9;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.CredentialsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class b0 {

    public final a0 f11737a;

    public final String f11738b;

    public final String f11739c;

    public String f11740d;

    public String f11741e;

    public Uri f11742f;

    public boolean f11743g;

    public final boolean f11744h;

    public int f11745i;

    public boolean f11746j;
    public int l;
    public int m;

    public int f11748n;

    public int f11749o;

    public int f11750p;

    public int f11751q;

    public Bundle f11753s;

    public IntentSender f11754t;

    public m f11755u;

    public final ArrayList f11747k = new ArrayList();

    public int f11752r = -1;

    public ArrayList f11756v = new ArrayList();

    public b0(a0 a0Var, String str, String str2, boolean z10) {
        this.f11737a = a0Var;
        this.f11738b = str;
        this.f11739c = str2;
        this.f11744h = z10;
    }

    public static p b() {
        c0.b();
        r rVar = c0.c().f11782e;
        if (rVar instanceof p) {
            return (p) rVar;
        }
        return null;
    }

    public final x a() {
        if (this instanceof x) {
            return (x) this;
        }
        return null;
    }

    public final t c() {
        a0 a0Var = this.f11737a;
        a0Var.getClass();
        c0.b();
        return a0Var.f11729a;
    }

    public final boolean d() {
        c0.b();
        b0 b0Var = c0.c().f11798w;
        if (b0Var == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (b0Var == this || this.f11748n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) c().B.B).getPackageName(), CredentialsData.CREDENTIALS_TYPE_ANDROID) && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return !this.f11756v.isEmpty();
    }

    public final boolean f() {
        return this.f11755u != null && this.f11743g;
    }

    public final boolean g() {
        c0.b();
        return c0.c().h() == this;
    }

    public final boolean h(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c0.b();
        ArrayList<IntentFilter> arrayList = this.f11747k;
        if (arrayList == null) {
            return false;
        }
        uVar.a();
        if (uVar.f11878b.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = uVar.f11878b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int i(m mVar) {
        int i10;
        b0 b0Var;
        int iCountActions;
        if (this.f11755u != mVar) {
            this.f11755u = mVar;
            if (mVar != null) {
                Bundle bundle = mVar.f11825a;
                if (Objects.equals(this.f11740d, bundle.getString("name"))) {
                    i10 = 0;
                } else {
                    this.f11740d = bundle.getString("name");
                    i10 = 1;
                }
                if (!Objects.equals(this.f11741e, bundle.getString("status"))) {
                    this.f11741e = bundle.getString("status");
                    i10 = 1;
                }
                Uri uri = this.f11742f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f11742f = string2 == null ? null : Uri.parse(string2);
                    i10 = 1;
                }
                if (this.f11743g != bundle.getBoolean("enabled", true)) {
                    this.f11743g = bundle.getBoolean("enabled", true);
                    i10 = 1;
                }
                if (this.f11745i != bundle.getInt("connectionState", 0)) {
                    this.f11745i = bundle.getInt("connectionState", 0);
                    i10 = 1;
                }
                ArrayList arrayListB = mVar.b();
                ArrayList arrayList = this.f11747k;
                if (arrayList != arrayListB) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = arrayListB.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter intentFilter = (IntentFilter) listIterator.next();
                                IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i12).equals(intentFilter2.getCategory(i12))) {
                                                            i12++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i11).equals(intentFilter2.getAction(i11))) {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(mVar.b());
                            i10 = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(mVar.b());
                        i10 = 1;
                    }
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i10 = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i10 = 1;
                }
                if (this.f11748n != bundle.getInt("deviceType")) {
                    this.f11748n = bundle.getInt("deviceType");
                    i10 = 1;
                }
                int i13 = 3;
                if (this.f11749o != bundle.getInt("volumeHandling", 0)) {
                    this.f11749o = bundle.getInt("volumeHandling", 0);
                    i10 = 3;
                }
                if (this.f11750p != bundle.getInt("volume")) {
                    this.f11750p = bundle.getInt("volume");
                    i10 = 3;
                }
                if (this.f11751q != bundle.getInt("volumeMax")) {
                    this.f11751q = bundle.getInt("volumeMax");
                } else {
                    i13 = i10;
                }
                if (this.f11752r != bundle.getInt("presentationDisplayId", -1)) {
                    this.f11752r = bundle.getInt("presentationDisplayId", -1);
                    i13 |= 5;
                }
                if (!Objects.equals(this.f11753s, bundle.getBundle("extras"))) {
                    this.f11753s = bundle.getBundle("extras");
                    i13 |= 1;
                }
                if (!Objects.equals(this.f11754t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.f11754t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i13 |= 1;
                }
                if (this.f11746j != bundle.getBoolean("canDisconnect", false)) {
                    this.f11746j = bundle.getBoolean("canDisconnect", false);
                    i13 |= 5;
                }
                ArrayList<String> arrayListC = mVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = arrayListC.size() != this.f11756v.size();
                if (!arrayListC.isEmpty()) {
                    f fVarC = c0.c();
                    for (String str : arrayListC) {
                        fVarC.getClass();
                        String str2 = (String) fVarC.l.get(new y4.b(((ComponentName) this.f11737a.f11732d.B).flattenToShortString(), str));
                        Iterator it = fVarC.f11787j.iterator();
                        do {
                            if (!it.hasNext()) {
                                b0Var = null;
                                break;
                            }
                            b0Var = (b0) it.next();
                        } while (!b0Var.f11739c.equals(str2));
                        if (b0Var != null) {
                            arrayList2.add(b0Var);
                            if (!z10 && !this.f11756v.contains(b0Var)) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    return i13;
                }
                this.f11756v = arrayList2;
                return i13 | 1;
            }
        }
        return 0;
    }

    public final void j(int i10) {
        c0.b();
        f fVarC = c0.c();
        int iMin = Math.min(this.f11751q, Math.max(0, i10));
        r rVarG = fVarC.g(this);
        if (rVarG != null) {
            rVarG.f(iMin);
        }
    }

    public final void k(int i10) {
        r rVarG;
        c0.b();
        if (i10 == 0 || (rVarG = c0.c().g(this)) == null) {
            return;
        }
        rVarG.i(i10);
    }

    public final void l(boolean z10) {
        c0.b();
        c0.c().l(this, 3, z10);
    }

    public final boolean m(String str) {
        c0.b();
        Iterator it = this.f11747k.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f11739c);
        sb2.append(", name=");
        sb2.append(this.f11740d);
        sb2.append(", description=");
        sb2.append(this.f11741e);
        sb2.append(", iconUri=");
        sb2.append(this.f11742f);
        sb2.append(", enabled=");
        sb2.append(this.f11743g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.f11744h);
        sb2.append(", connectionState=");
        sb2.append(this.f11745i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f11746j);
        sb2.append(", playbackType=");
        sb2.append(this.l);
        sb2.append(", playbackStream=");
        sb2.append(this.m);
        sb2.append(", deviceType=");
        sb2.append(this.f11748n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f11749o);
        sb2.append(", volume=");
        sb2.append(this.f11750p);
        sb2.append(", volumeMax=");
        sb2.append(this.f11751q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f11752r);
        sb2.append(", extras=");
        sb2.append(this.f11753s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f11754t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f11737a.f11732d.B).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.f11756v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.f11756v.get(i10) != this) {
                    sb2.append(((b0) this.f11756v.get(i10)).f11739c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
