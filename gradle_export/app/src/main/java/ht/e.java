package ht;

import h00.x;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.HttpException;
import ri.t1;

public final class e {
    public final kt.a a;
    public final et.a b;
    public final ConcurrentHashMap c;

    public e(kt.a aVar, et.a aVar2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = aVar;
        this.b = aVar2;
        this.c = concurrentHashMap;
    }

    public final Object a(long j, m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.A;
        Object obj = l00.a.A;
        int i2 = cVar2.C;
        if (i2 == 0) {
            t1.O(objB);
            cVar2.C = 1;
            objB = b(j, cVar2);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
        }
        ot.f fVar = objB instanceof ot.f ? (ot.f) objB : null;
        List list = fVar != null ? fVar.a : null;
        return list == null ? x.A : list;
    }

    public final Object b(long j, m00.c cVar) {
        d dVar;
        et.a aVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.E = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.C;
        l00.a aVar2 = l00.a.A;
        int i2 = dVar.E;
        Object obj2 = ot.h.a;
        ot.g gVar = ot.g.a;
        ConcurrentHashMap concurrentHashMap = this.c;
        try {
            if (i2 == 0) {
                t1.O(obj);
                List list = (List) concurrentHashMap.get(new Long(j));
                if (list != null) {
                    return list.isEmpty() ? obj2 : new ot.f(list);
                }
                et.a aVar3 = this.b;
                kt.a aVar4 = this.a;
                dVar.B = aVar3;
                dVar.A = j;
                dVar.E = 1;
                Object objA = aVar4.a(j, dVar);
                if (objA == aVar2) {
                    return aVar2;
                }
                obj = objA;
                aVar = aVar3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = dVar.A;
                aVar = dVar.B;
                t1.O(obj);
            }
            List listX = aVar.X((List) obj);
            concurrentHashMap.put(new Long(j), listX);
            return listX.isEmpty() ? obj2 : new ot.f(listX);
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            if (e2.A != 404) {
                obj2 = gVar;
            }
            return obj2;
        } catch (Exception unused) {
            return gVar;
        }
    }
}
