package db;

import android.content.Context;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Bundle;
import c3.s0;
import com.google.protobuf.RuntimeVersion;
import ec.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import o2.j;
import o2.s;
import o2.t;
import o2.z;
import o9.u;
import org.json.JSONArray;
import org.json.JSONObject;
import qd.n;
import r30.k;
import s10.v0;
import sd.l;
import x40.p;

public final class g implements jc.e {
    public final int A;
    public ArrayList B;

    public g(int i10) {
        this.A = 3;
        this.B = new ArrayList(i10);
    }

    public g(int i10, byte b7) {
        this.A = i10;
        switch (i10) {
            case 4:
                this.B = new ArrayList(32);
                break;
            case 5:
                break;
            case 6:
            case 7:
            default:
                this.B = new ArrayList();
                break;
            case 8:
                this.B = null;
                break;
            case 9:
                this.B = new ArrayList(20);
                break;
        }
    }

    public g(fb.g gVar) {
        this.A = 0;
        m.e(gVar, "trackers");
        String str = h.f4853a;
        ArrayList arrayListW = va.a.W(new eb.b(gVar.f5593b, 0), new eb.b(gVar.f5594c), new eb.b(gVar.f5595d, 2));
        Context context = gVar.f5592a;
        m.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        m.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        arrayListW.add(new d((ConnectivityManager) systemService));
        this.B = arrayListW;
    }

    public g(ArrayList arrayList) {
        this.A = 2;
        this.B = arrayList;
    }

    public g(JSONArray jSONArray) {
        this.A = 6;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new n(jSONObjectOptJSONObject));
                }
            }
        }
        this.B = arrayList;
    }

    public g(v0 v0Var) {
        this.A = 7;
        this.B = new ArrayList(1);
    }

    public void a(Object obj) {
        this.B.add(obj);
    }

    public void b(String str, String str2) {
        m.e(str, "name");
        m.e(str2, "value");
        w00.a.m(str);
        w00.a.n(str2, str);
        e(str, str2);
    }

    public void c(l lVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (((l) this.B.get(i10)).f14014a.f14023b > lVar.f14014a.f14023b) {
                this.B.add(i10, lVar);
                return;
            }
        }
        this.B.add(lVar);
    }

    public void d(g gVar) {
        if (gVar.B == null) {
            return;
        }
        if (this.B == null) {
            this.B = new ArrayList(gVar.B.size());
        }
        Iterator it = gVar.B.iterator();
        while (it.hasNext()) {
            c((l) it.next());
        }
    }

    public void e(String str, String str2) {
        m.e(str, "name");
        m.e(str2, "value");
        ArrayList arrayList = this.B;
        arrayList.add(str);
        arrayList.add(k.j1(str2).toString());
    }

    public void f(Object obj) {
        ArrayList arrayList = this.B;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void g(String str, String str2) {
        m.e(str, "name");
        m.e(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(y40.b.h("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(cCharAt), Integer.valueOf(i10), str}).toString());
            }
        }
        e(str, str2);
    }

    public void h(Path path) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q qVar = (q) arrayList.get(size);
            s0 s0Var = oc.e.f11922a;
            if (qVar != null && !qVar.f5349a) {
                oc.e.a(path, qVar.f5352d.i() / 100.0f, qVar.f5353e.i() / 100.0f, qVar.f5354f.i() / 360.0f);
            }
        }
    }

    public u i() {
        if (this.B == null) {
            return u.f11876c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.B);
        return new u(bundle, this.B);
    }

    public p j() {
        return new p((String[]) this.B.toArray(new String[0]));
    }

    public void k() {
        this.B.add(j.f11607c);
    }

    public void l(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.B.add(new s(f3, f10, f11, f12, f13, f14));
    }

    public void m(float f3) {
        this.B.add(new t(f3));
    }

    @Override
    public fc.e m0() {
        ArrayList arrayList = this.B;
        return ((pc.a) arrayList.get(0)).c() ? new fc.h(1, arrayList) : new fc.k(arrayList);
    }

    public void n(float f3, float f10) {
        this.B.add(new o2.m(f3, f10));
    }

    public void o(float f3, float f10) {
        this.B.add(new o2.u(f3, f10));
    }

    public void p(float f3, float f10) {
        this.B.add(new o2.n(f3, f10));
    }

    public void q(String str) {
        ArrayList arrayList = this.B;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public void r(float f3) {
        this.B.add(new z(f3));
    }

    @Override
    public List t0() {
        return this.B;
    }

    public String toString() {
        switch (this.A) {
            case 8:
                if (this.B == null) {
                    return RuntimeVersion.SUFFIX;
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    sb2.append(((l) it.next()).toString());
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public boolean w0() {
        ArrayList arrayList = this.B;
        return arrayList.size() == 1 && ((pc.a) arrayList.get(0)).c();
    }
}
