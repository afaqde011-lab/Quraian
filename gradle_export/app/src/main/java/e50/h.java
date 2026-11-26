package e50;

import java.io.IOException;
import kotlin.jvm.internal.z;

public final class h extends a50.a {
    public final int e;
    public final Object f;
    public final Object g;

    public h(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override
    public final long a() {
        long jA;
        int i;
        u[] uVarArr;
        switch (this.e) {
            case 0:
                m mVar = (m) this.f;
                mVar.A.a(mVar, (y) ((z) this.g).A);
                return -1L;
            case 1:
                try {
                    ((m) this.f).A.b((u) this.g);
                    break;
                } catch (IOException e) {
                    f50.m mVar2 = f50.m.a;
                    f50.m mVar3 = f50.m.a;
                    String str = "Http2Connection.Listener failure for " + ((m) this.f).C;
                    mVar3.getClass();
                    f50.m.g(str, 4, e);
                    try {
                        ((u) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                a20.a aVar = (a20.a) this.f;
                y yVar = (y) this.g;
                z zVar = new z();
                m mVar4 = (m) aVar.C;
                synchronized (mVar4.W) {
                    try {
                        synchronized (mVar4) {
                            try {
                                y yVar2 = mVar4.Q;
                                y yVar3 = new y();
                                yVar3.b(yVar2);
                                yVar3.b(yVar);
                                zVar.A = yVar3;
                                jA = ((long) yVar3.a()) - ((long) yVar2.a());
                                i = 0;
                                uVarArr = (jA == 0 || mVar4.B.isEmpty()) ? null : (u[]) mVar4.B.values().toArray(new u[0]);
                                y yVar4 = (y) zVar.A;
                                kotlin.jvm.internal.m.e(yVar4, "<set-?>");
                                mVar4.Q = yVar4;
                                mVar4.J.c(new h(mVar4.C + " onSettings", mVar4, zVar, i), 0L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            mVar4.W.a((y) zVar.A);
                        } catch (IOException e2) {
                            mVar4.a(2, 2, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (uVarArr != null) {
                    int length = uVarArr.length;
                    while (i < length) {
                        u uVar = uVarArr[i];
                        synchronized (uVar) {
                            uVar.f += jA;
                            if (jA > 0) {
                                uVar.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
