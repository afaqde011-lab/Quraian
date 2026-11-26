package h;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import q30.l;

public abstract class i {

    public final LinkedHashMap f6370a = new LinkedHashMap();

    public final LinkedHashMap f6371b = new LinkedHashMap();

    public final LinkedHashMap f6372c = new LinkedHashMap();

    public final ArrayList f6373d = new ArrayList();

    public final transient LinkedHashMap f6374e = new LinkedHashMap();

    public final LinkedHashMap f6375f = new LinkedHashMap();

    public final Bundle f6376g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f6370a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f6374e.get(str);
        if ((fVar != null ? fVar.f6362a : null) != null) {
            ArrayList arrayList = this.f6373d;
            if (arrayList.contains(str)) {
                fVar.f6362a.a(fVar.f6363b.c(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f6375f.remove(str);
        this.f6376g.putParcelable(str, new a(intent, i11));
        return true;
    }

    public abstract void b(int i10, i.a aVar, Object obj, hf.c cVar);

    public final h c(final String str, w wVar, final i.a aVar, final b bVar) {
        m.e(str, "key");
        m.e(aVar, "contract");
        m.e(bVar, "callback");
        q lifecycle = wVar.getLifecycle();
        if (lifecycle.b().compareTo(p.D) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + wVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f6372c;
        g gVar = (g) linkedHashMap.get(str);
        if (gVar == null) {
            gVar = new g(lifecycle);
        }
        u uVar = new u() {
            @Override
            public final void a(w wVar2, o oVar) {
                i iVar = this.A;
                LinkedHashMap linkedHashMap2 = iVar.f6374e;
                o oVar2 = o.ON_START;
                String str2 = str;
                if (oVar2 != oVar) {
                    if (o.ON_STOP == oVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (o.ON_DESTROY == oVar) {
                            iVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = iVar.f6376g;
                LinkedHashMap linkedHashMap3 = iVar.f6375f;
                i.a aVar2 = aVar;
                b bVar2 = bVar;
                linkedHashMap2.put(str2, new f(aVar2, bVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.a(obj);
                }
                a aVar3 = (a) b5.v(str2, bundle);
                if (aVar3 != null) {
                    bundle.remove(str2);
                    bVar2.a(aVar2.c(aVar3.B, aVar3.A));
                }
            }
        };
        gVar.f6364a.a(uVar);
        gVar.f6365b.add(uVar);
        linkedHashMap.put(str, gVar);
        return new h(this, str, aVar, 0);
    }

    public final h d(String str, i.a aVar, b bVar) {
        m.e(str, "key");
        e(str);
        this.f6374e.put(str, new f(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f6375f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f6376g;
        a aVar2 = (a) b5.v(str, bundle);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.B, aVar2.A));
        }
        return new h(this, str, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f6371b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : l.o0(new e(0))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f6370a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        m.e(str, "key");
        if (!this.f6373d.contains(str) && (num = (Integer) this.f6371b.remove(str)) != null) {
            this.f6370a.remove(num);
        }
        this.f6374e.remove(str);
        LinkedHashMap linkedHashMap = this.f6375f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbN = g4.c.n("Dropping pending result for request ", str, ": ");
            sbN.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f6376g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) b5.v(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f6372c;
        g gVar = (g) linkedHashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f6365b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f6364a.d((u) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
