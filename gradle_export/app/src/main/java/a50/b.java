package a50;

import b50.m;
import b50.n;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b extends a {
    public final int e;
    public final Object f;

    public b(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    public b(n nVar, String str) {
        super(str, true);
        this.e = 1;
        this.f = nVar;
    }

    @Override
    public final long a() {
        switch (this.e) {
            case 0:
                ((u00.a) this.f).invoke();
                return -1L;
            case 1:
                n nVar = (n) this.f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                m mVar = null;
                int i2 = 0;
                for (m connection : (ConcurrentLinkedQueue) nVar.e) {
                    kotlin.jvm.internal.m.d(connection, "connection");
                    synchronized (connection) {
                        if (nVar.b(connection, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - connection.q;
                            if (j2 > j) {
                                mVar = connection;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = nVar.b;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                kotlin.jvm.internal.m.b(mVar);
                synchronized (mVar) {
                    if (!mVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.q + j != jNanoTime) {
                        return 0L;
                    }
                    mVar.j = true;
                    ((ConcurrentLinkedQueue) nVar.e).remove(mVar);
                    Socket socket = mVar.d;
                    kotlin.jvm.internal.m.b(socket);
                    y40.b.e(socket);
                    if (!((ConcurrentLinkedQueue) nVar.e).isEmpty()) {
                        return 0L;
                    }
                    ((c) nVar.c).a();
                    return 0L;
                }
            default:
                e50.m mVar2 = (e50.m) this.f;
                mVar2.getClass();
                try {
                    mVar2.W.x(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    mVar2.a(2, 2, e);
                    return -1L;
                }
        }
    }
}
