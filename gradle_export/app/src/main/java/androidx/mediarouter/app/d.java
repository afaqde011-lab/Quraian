package androidx.mediarouter.app;

import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import fh.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k9.a2;
import k9.m1;
import k9.z1;

public final class d extends Handler {

    public final int f1726a;

    public Object f1727b;

    public d(Looper looper) {
        super(looper);
        this.f1726a = 4;
    }

    public d(Looper looper, oj.q qVar) {
        super(looper);
        this.f1726a = 3;
        this.f1727b = qVar;
    }

    public d(Object obj, int i10) {
        this.f1726a = i10;
        this.f1727b = obj;
    }

    public d(Object obj, Looper looper, int i10) {
        super(looper);
        this.f1726a = i10;
        this.f1727b = obj;
    }

    public d(o9.h hVar) {
        super(Looper.getMainLooper());
        this.f1726a = 8;
        this.f1727b = hVar;
    }

    private final void a(Message message) {
        gj.e eVar;
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 == 1) {
            n7.b bVar = (n7.b) this.f1727b;
            h7.b bVar2 = bVar.f11123c;
            if (obj == bVar.f11144z) {
                if (bVar.f11134p == 2 || bVar.i()) {
                    bVar.f11144z = null;
                    if (obj2 instanceof Exception) {
                        bVar2.v((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.f11122b.s(((n7.t) obj2).f11183a);
                        bVar2.B = null;
                        HashSet hashSet = (HashSet) bVar2.A;
                        t0 t0VarO = t0.o(hashSet);
                        hashSet.clear();
                        fh.r0 r0VarListIterator = t0VarO.listIterator(0);
                        while (r0VarListIterator.hasNext()) {
                            n7.b bVar3 = (n7.b) r0VarListIterator.next();
                            if (bVar3.l()) {
                                bVar3.h(true);
                            }
                        }
                        return;
                    } catch (Exception e3) {
                        bVar2.v(e3, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        n7.b bVar4 = (n7.b) this.f1727b;
        if (obj == bVar4.f11142x && bVar4.i()) {
            bVar4.f11142x = null;
            synchronized (bVar4.f11133o) {
                gi.c cVar = bVar4.f11143y;
                cVar.getClass();
                eVar = new gj.e(23);
                ((fh.q0) cVar.B).g();
                bVar4.f11143y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar4.k((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrR = bVar4.f11122b.r(bVar4.f11140v, ((n7.t) obj2).f11183a);
                if (bVar4.f11141w != null && bArrR != null && bArrR.length != 0) {
                    bVar4.f11141w = bArrR;
                }
                bVar4.f11134p = 4;
                e7.i iVar = bVar4.f11128h;
                synchronized (iVar.A) {
                    set = iVar.C;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n7.h) it.next()).a(eVar);
                }
            } catch (Exception | NoSuchMethodError e10) {
                bVar4.k(e10, true);
            }
        }
    }

    public void b(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        l9.c0 c0Var;
        l9.n nVar;
        d dVar;
        l9.n nVar2;
        p7.c cVar;
        ArrayDeque arrayDeque;
        boolean z10 = false;
        cVar = null;
        cVar = null;
        cVar = null;
        p7.c cVar2 = null;
        switch (this.f1726a) {
            case 0:
                h hVar = (h) this.f1727b;
                d dVar2 = hVar.X;
                int i10 = message.what;
                if (i10 == 1) {
                    hVar.e((List) message.obj);
                    return;
                }
                if (i10 == 2) {
                    if (hVar.J.isEmpty()) {
                        hVar.h(2);
                        dVar2.removeMessages(2);
                        dVar2.removeMessages(3);
                        dVar2.sendMessageDelayed(dVar2.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i10 == 3 && hVar.J.isEmpty()) {
                    hVar.h(3);
                    dVar2.removeMessages(2);
                    dVar2.removeMessages(3);
                    dVar2.removeMessages(1);
                    hVar.G.h(hVar.H);
                    return;
                }
                return;
            case 1:
                if (message.what != 1) {
                    return;
                }
                d0 d0Var = (d0) this.f1727b;
                List list = (List) message.obj;
                d0Var.Q = SystemClock.uptimeMillis();
                d0Var.K.clear();
                d0Var.K.addAll(list);
                d0Var.L.a();
                return;
            case 2:
                q0 q0Var = (q0) this.f1727b;
                int i11 = message.what;
                if (i11 == 1) {
                    q0Var.l();
                    return;
                } else {
                    if (i11 == 2 && q0Var.X != null) {
                        q0Var.X = null;
                        q0Var.m();
                        return;
                    }
                    return;
                }
            case 3:
                a2 a2Var = (a2) message.obj;
                oj.q qVar = (oj.q) this.f1727b;
                if (qVar.M(a2Var)) {
                    z1 z1Var = a2Var.f9209d;
                    z1Var.getClass();
                    z1Var.g();
                    qVar.R(a2Var);
                    return;
                }
                return;
            case 4:
                m1 m1Var = (m1) this.f1727b;
                if (m1Var == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                l9.h hVar2 = m1Var.B;
                Bundle data = message.getData();
                switch (message.what) {
                    case 3:
                        Bundle bundle = data.getBundle("data_options");
                        l9.f0.h(bundle);
                        ((m1) hVar2.f10149a).G.b(new l9.r(hVar2, new l9.h(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle, 0));
                        return;
                    case 4:
                        ((m1) hVar2.f10149a).G.b(new com.google.android.gms.internal.cast.r0(2, hVar2, new l9.h(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), false));
                        return;
                    case 5:
                        String string = data.getString("data_media_item_id");
                        c.d dVar3 = (c.d) data.getParcelable("data_result_receiver");
                        l9.h hVar3 = new l9.h(message.replyTo);
                        hVar2.getClass();
                        if (TextUtils.isEmpty(string) || dVar3 == null) {
                            return;
                        }
                        ((m1) hVar2.f10149a).G.b(new com.google.android.gms.internal.cast.r0(3, hVar2, hVar3, string, dVar3, false));
                        return;
                    case 6:
                        Bundle bundle2 = data.getBundle("data_root_hints");
                        l9.f0.h(bundle2);
                        ((m1) hVar2.f10149a).G.b(new l9.s(hVar2, new l9.h(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle2));
                        return;
                    case 7:
                        ((m1) hVar2.f10149a).G.b(new kh.r(10, hVar2, new l9.h(message.replyTo), z10));
                        return;
                    case 8:
                        Bundle bundle3 = data.getBundle("data_search_extras");
                        l9.f0.h(bundle3);
                        String string2 = data.getString("data_search_query");
                        c.d dVar4 = (c.d) data.getParcelable("data_result_receiver");
                        l9.h hVar4 = new l9.h(message.replyTo);
                        hVar2.getClass();
                        if (TextUtils.isEmpty(string2) || dVar4 == null) {
                            return;
                        }
                        ((m1) hVar2.f10149a).G.b(new l9.t(hVar2, hVar4, string2, bundle3, dVar4, 0));
                        return;
                    case 9:
                        Bundle bundle4 = data.getBundle("data_custom_action_extras");
                        l9.f0.h(bundle4);
                        String string3 = data.getString("data_custom_action");
                        c.d dVar5 = (c.d) data.getParcelable("data_result_receiver");
                        l9.h hVar5 = new l9.h(message.replyTo);
                        hVar2.getClass();
                        if (TextUtils.isEmpty(string3) || dVar5 == null) {
                            return;
                        }
                        ((m1) hVar2.f10149a).G.b(new l9.t(hVar2, hVar5, string3, bundle4, dVar5, 1));
                        return;
                    default:
                        e7.a.m("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 5:
                if (message.what == 1) {
                    synchronized (((l9.n) this.f1727b).f10171a) {
                        c0Var = (l9.c0) ((WeakReference) ((l9.n) this.f1727b).f10173c).get();
                        nVar = (l9.n) this.f1727b;
                        dVar = (d) nVar.f10174d;
                        break;
                    }
                    if (c0Var != null) {
                        synchronized (c0Var.f10129d) {
                            nVar2 = c0Var.l;
                            break;
                        }
                        if (nVar != nVar2 || dVar == null) {
                            return;
                        }
                        c0Var.b((l9.g0) message.obj);
                        c0Var.b(null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                a(message);
                return;
            case 7:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (n7.b bVar : ((n7.d) this.f1727b).m) {
                    bVar.n();
                    if (Arrays.equals(bVar.f11140v, bArr)) {
                        if (message.what == 2 && bVar.f11134p == 4) {
                            String str = e7.i0.f5136a;
                            bVar.h(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                int i12 = message.what;
                int i13 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                SparseArray sparseArray = ((o9.h) this.f1727b).f11809j;
                o9.p0 p0Var = (o9.p0) sparseArray.get(i13);
                if (p0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i13);
                if (i12 == 3) {
                    p0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i12 != 4) {
                        return;
                    }
                    o9.p0.a(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj);
                    return;
                }
            case 9:
                o9.t tVar = (o9.t) this.f1727b;
                int i14 = message.what;
                if (i14 != 1) {
                    if (i14 != 2) {
                        return;
                    }
                    tVar.F = false;
                    tVar.e(tVar.E);
                    return;
                }
                tVar.H = false;
                o9.a aVar = tVar.D;
                if (aVar != null) {
                    b20.z zVar = tVar.G;
                    o9.f fVar = aVar.f11728a;
                    o9.a0 a0VarD = fVar.d(tVar);
                    if (a0VarD != null) {
                        fVar.p(a0VarD, zVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                p7.d dVar6 = (p7.d) this.f1727b;
                int i15 = message.what;
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            dVar6.E.d();
                        } else if (i15 != 4) {
                            dVar6.D.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
                        } else {
                            try {
                                dVar6.A.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e3) {
                                dVar6.D.compareAndSet(null, e3);
                            }
                        }
                        break;
                    } else {
                        cVar = (p7.c) message.obj;
                        int i16 = cVar.f12376a;
                        MediaCodec.CryptoInfo cryptoInfo = cVar.f12378c;
                        long j9 = cVar.f12379d;
                        int i17 = cVar.f12380e;
                        try {
                            synchronized (p7.d.H) {
                                try {
                                    dVar6.A.queueSecureInputBuffer(i16, 0, cryptoInfo, j9, i17);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (RuntimeException e10) {
                            dVar6.D.compareAndSet(null, e10);
                        }
                        break;
                    }
                    if (cVar2 != null) {
                        arrayDeque = p7.d.G;
                        synchronized (arrayDeque) {
                            arrayDeque.add(cVar2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                cVar = (p7.c) message.obj;
                try {
                    dVar6.A.queueInputBuffer(cVar.f12376a, 0, cVar.f12377b, cVar.f12379d, cVar.f12380e);
                } catch (RuntimeException e11) {
                    dVar6.D.compareAndSet(null, e11);
                }
                break;
                cVar2 = cVar;
                if (cVar2 != null) {
                    arrayDeque = p7.d.G;
                    synchronized (arrayDeque) {
                        arrayDeque.add(cVar2);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean sendMessageAtTime(Message message, long j9) {
        switch (this.f1726a) {
            case 4:
                Bundle data = message.getData();
                ClassLoader classLoader = l9.h.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j9);
    }
}
