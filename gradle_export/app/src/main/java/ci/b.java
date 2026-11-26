package ci;

import android.os.Bundle;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.firebase.abt.AbtException;
import com.google.protobuf.RuntimeVersion;
import fh.e1;
import fi.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tf.u1;

public final class b {

    public final ij.b f3165a;

    public Integer f3166b = null;

    public b(ij.b bVar) {
        this.f3165a = bVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f3159a;
        String str2 = aVar.f3160b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f3159a.equals(str) && aVar2.f3160b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        c cVar = (c) ((fi.b) this.f3165a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((j1) cVar.f5698a.B).f("frc", RuntimeVersion.SUFFIX)) {
            e1 e1Var = gi.a.f6336a;
            d0.h(bundle);
            fi.a aVar = new fi.a();
            String str = (String) u1.e(bundle, "origin", String.class, null);
            d0.h(str);
            aVar.f5684a = str;
            String str2 = (String) u1.e(bundle, "name", String.class, null);
            d0.h(str2);
            aVar.f5685b = str2;
            aVar.f5686c = u1.e(bundle, "value", Object.class, null);
            aVar.f5687d = (String) u1.e(bundle, "trigger_event_name", String.class, null);
            aVar.f5688e = ((Long) u1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f5689f = (String) u1.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f5690g = (Bundle) u1.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f5691h = (String) u1.e(bundle, "triggered_event_name", String.class, null);
            aVar.f5692i = (Bundle) u1.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f5693j = ((Long) u1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f5694k = (String) u1.e(bundle, "expired_event_name", String.class, null);
            aVar.l = (Bundle) u1.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f5695n = ((Boolean) u1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) u1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f5696o = ((Long) u1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) throws AbtException {
        ?? r11;
        ?? r10;
        ?? r4;
        String str;
        String str2;
        String str3;
        ij.b bVar = this.f3165a;
        if (bVar.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<a> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str4 = RuntimeVersion.SUFFIX;
            if (!zHasNext) {
                Object obj = null;
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        String str5 = ((fi.a) it2.next()).f5685b;
                        j1 j1Var = (j1) ((c) ((fi.b) bVar.get())).f5698a.B;
                        j1Var.c(new w0(j1Var, str5, null, null, 0));
                    }
                    return;
                }
                if (bVar.get() == null) {
                    throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<fi.a> arrayListB = b();
                ArrayList<a> arrayList3 = new ArrayList();
                for (fi.a aVar : arrayListB) {
                    String[] strArr = a.f3157g;
                    String str6 = aVar.f5687d;
                    arrayList3.add(new a(aVar.f5685b, String.valueOf(aVar.f5686c), str6 != null ? str6 : RuntimeVersion.SUFFIX, new Date(aVar.m), aVar.f5688e, aVar.f5693j));
                    obj = obj;
                }
                ?? r21 = obj;
                ArrayList arrayList4 = new ArrayList();
                for (a aVar2 : arrayList3) {
                    if (!a(arrayList2, aVar2)) {
                        arrayList4.add(aVar2.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    String str7 = ((fi.a) it3.next()).f5685b;
                    j1 j1Var2 = (j1) ((c) ((fi.b) bVar.get())).f5698a.B;
                    j1Var2.c(new w0(j1Var2, str7, r21, r21, 0));
                }
                ArrayList<a> arrayList5 = new ArrayList();
                for (a aVar3 : arrayList2) {
                    if (!a(arrayList3, aVar3)) {
                        arrayList5.add(aVar3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f3166b == null) {
                    this.f3166b = Integer.valueOf(((j1) ((c) ((fi.b) bVar.get())).f5698a.B).b("frc"));
                }
                int iIntValue = this.f3166b.intValue();
                for (a aVar4 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        String str8 = ((fi.a) arrayDeque.pollFirst()).f5685b;
                        j1 j1Var3 = (j1) ((c) ((fi.b) bVar.get())).f5698a.B;
                        j1Var3.c(new w0(j1Var3, str8, r21, r21, 0));
                    }
                    fi.a aVarA = aVar4.a();
                    c cVar = (c) ((fi.b) bVar.get());
                    cVar.getClass();
                    e1 e1Var = gi.a.f6336a;
                    String str9 = aVarA.f5684a;
                    if (!str9.isEmpty()) {
                        Object obj2 = aVarA.f5686c;
                        if (obj2 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj2);
                                    objectOutputStream.flush();
                                    ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                            r4 = object;
                                        } catch (IOException | ClassNotFoundException unused) {
                                            r4 = r21;
                                        }
                                        if (r4 != 0) {
                                            if (!gi.a.a(str9) && gi.a.c(str9, aVarA.f5685b) && (((str = aVarA.f5694k) == null || (gi.a.b(str, aVarA.l) && gi.a.d(str9, aVarA.f5694k, aVarA.l))) && (((str2 = aVarA.f5691h) == null || (gi.a.b(str2, aVarA.f5692i) && gi.a.d(str9, aVarA.f5691h, aVarA.f5692i))) && ((str3 = aVarA.f5689f) == null || (gi.a.b(str3, aVarA.f5690g) && gi.a.d(str9, aVarA.f5689f, aVarA.f5690g)))))) {
                                                o10.b bVar2 = cVar.f5698a;
                                                Bundle bundle = new Bundle();
                                                bundle.putString("origin", aVarA.f5684a);
                                                String str10 = aVarA.f5685b;
                                                if (str10 != null) {
                                                    bundle.putString("name", str10);
                                                }
                                                Object obj3 = aVarA.f5686c;
                                                if (obj3 != null) {
                                                    u1.c(bundle, obj3);
                                                }
                                                String str11 = aVarA.f5687d;
                                                if (str11 != null) {
                                                    bundle.putString("trigger_event_name", str11);
                                                }
                                                bundle.putLong("trigger_timeout", aVarA.f5688e);
                                                String str12 = aVarA.f5689f;
                                                if (str12 != null) {
                                                    bundle.putString("timed_out_event_name", str12);
                                                }
                                                Bundle bundle2 = aVarA.f5690g;
                                                if (bundle2 != null) {
                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                }
                                                String str13 = aVarA.f5691h;
                                                if (str13 != null) {
                                                    bundle.putString("triggered_event_name", str13);
                                                }
                                                Bundle bundle3 = aVarA.f5692i;
                                                if (bundle3 != null) {
                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                }
                                                bundle.putLong("time_to_live", aVarA.f5693j);
                                                String str14 = aVarA.f5694k;
                                                if (str14 != null) {
                                                    bundle.putString("expired_event_name", str14);
                                                }
                                                Bundle bundle4 = aVarA.l;
                                                if (bundle4 != null) {
                                                    bundle.putBundle("expired_event_params", bundle4);
                                                }
                                                bundle.putLong("creation_timestamp", aVarA.m);
                                                bundle.putBoolean("active", aVarA.f5695n);
                                                bundle.putLong("triggered_timestamp", aVarA.f5696o);
                                                j1 j1Var4 = (j1) bVar2.B;
                                                j1Var4.c(new v0(j1Var4, bundle));
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r10 = objectOutputStream;
                                        r11 = objectInputStream;
                                        if (r10 != 0) {
                                            r10.close();
                                        }
                                        if (r11 != 0) {
                                            r11.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r11 = r21;
                                    r10 = objectOutputStream;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ?? r12 = r21;
                                r11 = r12;
                                r10 = r12;
                            }
                        } else if (!gi.a.a(str9)) {
                        }
                    }
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = a.f3157g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = a.f3157g;
            for (int i10 = 0; i10 < 5; i10++) {
                String str15 = strArr3[i10];
                if (!map.containsKey(str15)) {
                    arrayList6.add(str15);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                Date date = a.f3158h.parse((String) map.get("experimentStartTime"));
                long j9 = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                long j10 = Long.parseLong((String) map.get("timeToLiveMillis"));
                String str16 = (String) map.get("experimentId");
                String str17 = (String) map.get("variantId");
                if (map.containsKey("triggerEvent")) {
                    str4 = (String) map.get("triggerEvent");
                }
                arrayList2.add(new a(str16, str17, str4, date, j9, j10));
            } catch (NumberFormatException e3) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e3);
            } catch (ParseException e10) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e10);
            }
        }
    }
}
