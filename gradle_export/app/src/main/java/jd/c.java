package jd;

import ab.a0;
import h00.d0;
import h1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.m;
import v2.d;

public final class c implements hd.c {
    public final int A;
    public final hd.b B;
    public Object C;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = hd.b.A;
                break;
            default:
                this.B = hd.b.A;
                break;
        }
    }

    @Override
    public final void a(rc.c cVar) {
        nd.c cVar2;
        ArrayList arrayList;
        switch (this.A) {
            case 0:
                Object obj = nd.c.f11223b;
                String str = cVar.f13151a.f13176e;
                m.e(str, "instanceName");
                synchronized (nd.c.f11223b) {
                    try {
                        LinkedHashMap linkedHashMap = nd.c.f11224c;
                        Object cVar3 = linkedHashMap.get(str);
                        if (cVar3 == null) {
                            cVar3 = new nd.c();
                            linkedHashMap.put(str, cVar3);
                        }
                        cVar2 = (nd.c) cVar3;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.C = cVar2.f11225a;
                return;
            default:
                String str2 = cVar.f13151a.f13176e;
                Object obj2 = qc.a.f12827c;
                qc.a aVarF0 = a0.f0(str2);
                this.C = aVarF0;
                l lVar = aVarF0.f12830b;
                d dVar = new d(1);
                synchronized (lVar.A) {
                    arrayList = new ArrayList();
                    ((ArrayBlockingQueue) lVar.B).drainTo(arrayList);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    dVar.invoke(null);
                    throw null;
                }
                return;
        }
    }

    @Override
    public final gd.a b(gd.a aVar) {
        nd.b bVar;
        switch (this.A) {
            case 0:
                if (aVar.O != null) {
                    l lVar = (l) this.C;
                    if (lVar == null) {
                        m.k("eventBridge");
                        throw null;
                    }
                    nd.d dVar = nd.d.A;
                    nd.a aVar2 = new nd.a(aVar.a(), aVar.N, aVar.O, aVar.P, aVar.Q);
                    synchronized (lVar.A) {
                        try {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.B;
                            Object bVar2 = linkedHashMap.get(dVar);
                            if (bVar2 == null) {
                                bVar2 = new nd.b();
                                linkedHashMap.put(dVar, bVar2);
                            }
                            bVar = (nd.b) bVar2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    synchronized (bVar.f11221a) {
                        bVar.f11222b.offer(aVar2);
                    }
                }
                return aVar;
            default:
                LinkedHashMap linkedHashMap2 = aVar.O;
                if (linkedHashMap2 != null && !linkedHashMap2.isEmpty() && !m.a(aVar.a(), "$exposure")) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Map) {
                            try {
                                map.put(str, (Map) value);
                            } catch (ClassCastException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    qc.a aVar3 = (qc.a) this.C;
                    if (aVar3 == null) {
                        m.k("connector");
                        throw null;
                    }
                    p10.a aVar4 = aVar3.f12829a;
                    ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) aVar4.A).readLock();
                    lock.lock();
                    try {
                        qc.b bVar3 = (qc.b) aVar4.B;
                        lock.unlock();
                        String str2 = bVar3.f12831a;
                        String str3 = bVar3.f12832b;
                        LinkedHashMap linkedHashMapB0 = d0.b0(bVar3.f12833c);
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str4 = (String) entry2.getKey();
                            Map map2 = (Map) entry2.getValue();
                            int iHashCode = str4.hashCode();
                            if (iHashCode != 1186238) {
                                if (iHashCode != 146417720) {
                                    if (iHashCode == 1142092165 && str4.equals("$unset")) {
                                        Iterator it = map2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            linkedHashMapB0.remove(((Map.Entry) it.next()).getKey());
                                        }
                                    }
                                } else if (str4.equals("$clearAll")) {
                                    linkedHashMapB0.clear();
                                }
                            } else if (str4.equals("$set")) {
                                linkedHashMapB0.putAll(map2);
                            }
                        }
                        aVar4.z(new qc.b(str2, str3, linkedHashMapB0));
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                }
                return aVar;
        }
    }

    @Override
    public final hd.b getType() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B;
    }
}
