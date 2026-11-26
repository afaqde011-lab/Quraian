package b50;

import b3.i2;
import h00.v;
import h00.x;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import x40.e0;
import x40.q;

public final class f {
    public final n a;
    public final x40.a b;
    public final j c;
    public o d;
    public i2 e;
    public int f;
    public int g;
    public int h;
    public e0 i;

    public f(n connectionPool, x40.a aVar, j jVar) {
        kotlin.jvm.internal.m.e(connectionPool, "connectionPool");
        this.a = connectionPool;
        this.b = aVar;
        this.c = jVar;
    }

    public final m a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        e0 e0Var;
        o oVar;
        i2 i2Var;
        ArrayList arrayList;
        o oVar2;
        x40.a aVar;
        Proxy proxy;
        String hostName;
        int port;
        List listR;
        boolean zContains;
        x40.a aVar2;
        URI uriH;
        List<Proxy> listSelect;
        List listK;
        m mVar;
        qj.c cVar;
        Socket socketM;
        while (!this.c.M) {
            m mVar2 = this.c.H;
            if (mVar2 != null) {
                synchronized (mVar2) {
                    try {
                        socketM = (mVar2.j || !b(mVar2.b.a.h)) ? this.c.m() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.H == null) {
                    if (socketM != null) {
                        y40.b.e(socketM);
                    }
                    this.f = 0;
                    this.g = 0;
                    this.h = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        mVar2 = this.c.H;
                        kotlin.jvm.internal.m.b(mVar2);
                    } else {
                        e0Var = this.i;
                        try {
                            if (e0Var != null) {
                                this.i = null;
                            } else {
                                oVar = this.d;
                                if (oVar == null && oVar.b()) {
                                    o oVar3 = this.d;
                                    kotlin.jvm.internal.m.b(oVar3);
                                    if (!oVar3.b()) {
                                        throw new NoSuchElementException();
                                    }
                                    ArrayList arrayList2 = oVar3.a;
                                    int i4 = oVar3.b;
                                    oVar3.b = i4 + 1;
                                    e0Var = (e0) arrayList2.get(i4);
                                } else {
                                    i2Var = this.e;
                                    if (i2Var == null) {
                                        aVar2 = this.b;
                                        qj.c routeDatabase = this.c.A.Y;
                                        kotlin.jvm.internal.m.e(routeDatabase, "routeDatabase");
                                        i2Var = new i2();
                                        i2Var.b = aVar2;
                                        i2Var.c = routeDatabase;
                                        x xVar = x.A;
                                        i2Var.d = xVar;
                                        i2Var.e = xVar;
                                        i2Var.f = new ArrayList();
                                        q url = aVar2.h;
                                        kotlin.jvm.internal.m.e(url, "url");
                                        uriH = url.h();
                                        if (uriH.getHost() == null) {
                                            listK = y40.b.k(Proxy.NO_PROXY);
                                        } else {
                                            listSelect = aVar2.g.select(uriH);
                                            if (listSelect != null || listSelect.isEmpty()) {
                                                listK = y40.b.k(Proxy.NO_PROXY);
                                            } else {
                                                listK = y40.b.w(listSelect);
                                            }
                                        }
                                        i2Var.d = listK;
                                        i2Var.a = 0;
                                        this.e = i2Var;
                                    }
                                    if (i2Var.l()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (i2Var.a < ((List) i2Var.d).size()) {
                                        aVar = (x40.a) i2Var.b;
                                        if (i2Var.a < ((List) i2Var.d).size()) {
                                            throw new SocketException("No route to " + aVar.h.d + "; exhausted proxy configurations: " + ((List) i2Var.d));
                                        }
                                        List list = (List) i2Var.d;
                                        int i5 = i2Var.a;
                                        i2Var.a = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList3 = new ArrayList();
                                        i2Var.e = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            q qVar = aVar.h;
                                            hostName = qVar.d;
                                            port = qVar.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostName = inetSocketAddress.getHostName();
                                                kotlin.jvm.internal.m.d(hostName, "hostName");
                                            } else {
                                                hostName = address.getHostAddress();
                                                kotlin.jvm.internal.m.d(hostName, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            byte[] bArr = y40.b.a;
                                            kotlin.jvm.internal.m.e(hostName, "<this>");
                                            if (y40.b.f.b(hostName)) {
                                                listR = va.a.R(InetAddress.getByName(hostName));
                                            } else {
                                                aVar.a.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                                    kotlin.jvm.internal.m.d(allByName, "getAllByName(hostname)");
                                                    List listV0 = h00.n.V0(allByName);
                                                    if (listV0.isEmpty()) {
                                                        throw new UnknownHostException(aVar.a + " returned no addresses for " + hostName);
                                                    }
                                                    listR = listV0;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listR.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = i2Var.e.iterator();
                                        while (it2.hasNext()) {
                                            e0 e0Var2 = new e0((x40.a) i2Var.b, proxy, (InetSocketAddress) it2.next());
                                            qj.c cVar2 = (qj.c) i2Var.c;
                                            synchronized (cVar2) {
                                                zContains = ((LinkedHashSet) cVar2.B).contains(e0Var2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) i2Var.f).add(e0Var2);
                                            } else {
                                                arrayList.add(e0Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        v.u0((ArrayList) i2Var.f, arrayList);
                                        ((ArrayList) i2Var.f).clear();
                                    }
                                    oVar2 = new o(arrayList);
                                    this.d = oVar2;
                                    if (!this.c.M) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        mVar2 = this.c.H;
                                        kotlin.jvm.internal.m.b(mVar2);
                                    } else {
                                        if (oVar2.b()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i6 = oVar2.b;
                                        oVar2.b = i6 + 1;
                                        e0Var = (e0) arrayList.get(i6);
                                        mVar = new m(this.a, e0Var);
                                        this.c.O = mVar;
                                        mVar.c(i, i2, i3, z, this.c);
                                        this.c.O = null;
                                        cVar = this.c.A.Y;
                                        synchronized (cVar) {
                                            ((LinkedHashSet) cVar.B).remove(e0Var);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            mVar2 = this.c.H;
                                            kotlin.jvm.internal.m.b(mVar2);
                                            this.i = e0Var;
                                            Socket socket = mVar.d;
                                            kotlin.jvm.internal.m.b(socket);
                                            y40.b.e(socket);
                                        } else {
                                            synchronized (mVar) {
                                                n nVar = this.a;
                                                nVar.getClass();
                                                byte[] bArr2 = y40.b.a;
                                                ((ConcurrentLinkedQueue) nVar.e).add(mVar);
                                                ((a50.c) nVar.c).c((a50.b) nVar.d, 0L);
                                                this.c.b(mVar);
                                            }
                                            mVar2 = mVar;
                                        }
                                    }
                                }
                            }
                            mVar.c(i, i2, i3, z, this.c);
                            this.c.O = null;
                            cVar = this.c.A.Y;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.B).remove(e0Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    mVar2 = this.c.H;
                                    kotlin.jvm.internal.m.b(mVar2);
                                    this.i = e0Var;
                                    Socket socket2 = mVar.d;
                                    kotlin.jvm.internal.m.b(socket2);
                                    y40.b.e(socket2);
                                } else {
                                    synchronized (mVar) {
                                        n nVar2 = this.a;
                                        nVar2.getClass();
                                        byte[] bArr3 = y40.b.a;
                                        ((ConcurrentLinkedQueue) nVar2.e).add(mVar);
                                        ((a50.c) nVar2.c).c((a50.b) nVar2.d, 0L);
                                        this.c.b(mVar);
                                        mVar2 = mVar;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.O = null;
                            throw th2;
                        }
                        arrayList = null;
                        mVar = new m(this.a, e0Var);
                        this.c.O = mVar;
                    }
                } else if (socketM != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f = 0;
                this.g = 0;
                this.h = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    mVar2 = this.c.H;
                    kotlin.jvm.internal.m.b(mVar2);
                } else {
                    e0Var = this.i;
                    if (e0Var != null) {
                        this.i = null;
                    } else {
                        oVar = this.d;
                        if (oVar == null) {
                        }
                        i2Var = this.e;
                        if (i2Var == null) {
                            aVar2 = this.b;
                            qj.c routeDatabase2 = this.c.A.Y;
                            kotlin.jvm.internal.m.e(routeDatabase2, "routeDatabase");
                            i2Var = new i2();
                            i2Var.b = aVar2;
                            i2Var.c = routeDatabase2;
                            x xVar2 = x.A;
                            i2Var.d = xVar2;
                            i2Var.e = xVar2;
                            i2Var.f = new ArrayList();
                            q url2 = aVar2.h;
                            kotlin.jvm.internal.m.e(url2, "url");
                            uriH = url2.h();
                            if (uriH.getHost() == null) {
                                listK = y40.b.k(Proxy.NO_PROXY);
                            } else {
                                listSelect = aVar2.g.select(uriH);
                                if (listSelect != null) {
                                    listK = y40.b.k(Proxy.NO_PROXY);
                                } else {
                                    listK = y40.b.k(Proxy.NO_PROXY);
                                }
                            }
                            i2Var.d = listK;
                            i2Var.a = 0;
                            this.e = i2Var;
                        }
                        if (i2Var.l()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (i2Var.a < ((List) i2Var.d).size()) {
                            aVar = (x40.a) i2Var.b;
                            if (i2Var.a < ((List) i2Var.d).size()) {
                                throw new SocketException("No route to " + aVar.h.d + "; exhausted proxy configurations: " + ((List) i2Var.d));
                            }
                            List list2 = (List) i2Var.d;
                            int i7 = i2Var.a;
                            i2Var.a = i7 + 1;
                            proxy = (Proxy) list2.get(i7);
                            ArrayList arrayList4 = new ArrayList();
                            i2Var.e = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                q qVar2 = aVar.h;
                                hostName = qVar2.d;
                                port = qVar2.e;
                            } else {
                                q qVar3 = aVar.h;
                                hostName = qVar3.d;
                                port = qVar3.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            v.u0((ArrayList) i2Var.f, arrayList);
                            ((ArrayList) i2Var.f).clear();
                        }
                        oVar2 = new o(arrayList);
                        this.d = oVar2;
                        if (!this.c.M) {
                            throw new IOException("Canceled");
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            mVar2 = this.c.H;
                            kotlin.jvm.internal.m.b(mVar2);
                        } else {
                            if (oVar2.b()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = oVar2.b;
                            oVar2.b = i8 + 1;
                            e0Var = (e0) arrayList.get(i8);
                            mVar = new m(this.a, e0Var);
                            this.c.O = mVar;
                            mVar.c(i, i2, i3, z, this.c);
                            this.c.O = null;
                            cVar = this.c.A.Y;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.B).remove(e0Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    mVar2 = this.c.H;
                                    kotlin.jvm.internal.m.b(mVar2);
                                    this.i = e0Var;
                                    Socket socket3 = mVar.d;
                                    kotlin.jvm.internal.m.b(socket3);
                                    y40.b.e(socket3);
                                } else {
                                    synchronized (mVar) {
                                        n nVar3 = this.a;
                                        nVar3.getClass();
                                        byte[] bArr4 = y40.b.a;
                                        ((ConcurrentLinkedQueue) nVar3.e).add(mVar);
                                        ((a50.c) nVar3.c).c((a50.b) nVar3.d, 0L);
                                        this.c.b(mVar);
                                        mVar2 = mVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    mVar = new m(this.a, e0Var);
                    this.c.O = mVar;
                    mVar.c(i, i2, i3, z, this.c);
                    this.c.O = null;
                    cVar = this.c.A.Y;
                    synchronized (cVar) {
                        ((LinkedHashSet) cVar.B).remove(e0Var);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            mVar2 = this.c.H;
                            kotlin.jvm.internal.m.b(mVar2);
                            this.i = e0Var;
                            Socket socket4 = mVar.d;
                            kotlin.jvm.internal.m.b(socket4);
                            y40.b.e(socket4);
                        } else {
                            synchronized (mVar) {
                                n nVar4 = this.a;
                                nVar4.getClass();
                                byte[] bArr5 = y40.b.a;
                                ((ConcurrentLinkedQueue) nVar4.e).add(mVar);
                                ((a50.c) nVar4.c).c((a50.b) nVar4.d, 0L);
                                this.c.b(mVar);
                                mVar2 = mVar;
                            }
                        }
                    }
                }
            }
            if (mVar2.i(z2)) {
                return mVar2;
            }
            mVar2.k();
            if (this.i == null) {
                o oVar4 = this.d;
                if (oVar4 != null ? oVar4.b() : true) {
                    continue;
                } else {
                    i2 i2Var2 = this.e;
                    if (!(i2Var2 != null ? i2Var2.l() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(q url) {
        kotlin.jvm.internal.m.e(url, "url");
        q qVar = this.b.h;
        return url.e == qVar.e && kotlin.jvm.internal.m.a(url.d, qVar.d);
    }

    public final void c(IOException e) {
        kotlin.jvm.internal.m.e(e, "e");
        this.i = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).A == 8) {
            this.f++;
        } else if (e instanceof ConnectionShutdownException) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
