package ea;

import a10.h0;
import java.util.concurrent.locks.ReentrantLock;
import ri.t1;

public final class w {

    public final int f5228a;

    public final u00.a f5229b;

    public final ReentrantLock f5230c = new ReentrantLock();

    public int f5231d;

    public boolean f5232e;

    public final i[] f5233f;

    public final j40.i f5234g;

    public final h00.m f5235h;

    public w(int i10, u00.a aVar) {
        this.f5228a = i10;
        this.f5229b = aVar;
        this.f5233f = new i[i10];
        int i11 = j40.j.a;
        this.f5234g = new j40.i(i10, 0);
        this.f5235h = new h00.m(i10);
    }

    public final Object a(m00.c cVar) {
        u uVar;
        h00.m mVar = this.f5235h;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.C = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.A;
        l00.a aVar = l00.a.A;
        int i11 = uVar.C;
        j40.i iVar = this.f5234g;
        if (i11 == 0) {
            t1.O(obj);
            uVar.C = 1;
            if (iVar.b(uVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f5230c;
            reentrantLock.lock();
            try {
                if (this.f5232e) {
                    h0.M(21, "Connection pool is closed");
                    throw null;
                }
                if (mVar.isEmpty() && this.f5231d < this.f5228a) {
                    i iVar2 = new i((ma.a) this.f5229b.invoke());
                    i[] iVarArr = this.f5233f;
                    int i12 = this.f5231d;
                    this.f5231d = i12 + 1;
                    iVarArr[i12] = iVar2;
                    mVar.addLast(iVar2);
                }
                i iVar3 = (i) mVar.removeLast();
                reentrantLock.unlock();
                return iVar3;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            iVar.d();
            throw th3;
        }
    }

    public final java.lang.Object b(long r9, ea.d r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: ea.w.b(long, ea.d, m00.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f5230c;
        reentrantLock.lock();
        try {
            this.f5232e = true;
            for (i iVar : this.f5233f) {
                if (iVar != null) {
                    iVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(StringBuilder sb2) {
        h00.m mVar = this.f5235h;
        ReentrantLock reentrantLock = this.f5230c;
        reentrantLock.lock();
        try {
            i00.b bVarS = va.a.s();
            int i10 = mVar.C;
            for (int i11 = 0; i11 < i10; i11++) {
                bVarS.add(mVar.get(i11));
            }
            i00.b bVarK = va.a.k(bVarS);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f5228a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            j40.i iVar = this.f5234g;
            iVar.getClass();
            sb3.append(Math.max(j40.h.G.get(iVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + bVarK.a() + ")[" + h00.q.R0(bVarK, (CharSequence) null, (String) null, (String) null, (u00.k) null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            i[] iVarArr = this.f5233f;
            int length = iVarArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                i iVar2 = iVarArr[i13];
                i12++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i12);
                sb4.append("] - ");
                sb4.append(iVar2 != null ? iVar2.A.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (iVar2 != null) {
                    iVar2.r(sb2);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(i iVar) {
        kotlin.jvm.internal.m.e(iVar, "connection");
        ReentrantLock reentrantLock = this.f5230c;
        reentrantLock.lock();
        try {
            this.f5235h.addLast(iVar);
            reentrantLock.unlock();
            this.f5234g.d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
