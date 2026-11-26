package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class o implements Handler.Callback, ServiceConnection {
    public final Context A;
    public final Handler B;
    public final HashMap C = new HashMap();
    public HashSet D = new HashSet();

    public o(Context context) {
        this.A = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.B = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(n nVar) {
        boolean z10;
        ArrayDeque arrayDeque = nVar.f11097d;
        ComponentName componentName = nVar.f11094a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (nVar.f11095b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.A;
            boolean zBindService = context.bindService(component, this, 33);
            nVar.f11095b = zBindService;
            if (zBindService) {
                nVar.f11098e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = nVar.f11095b;
        }
        if (!z10 || nVar.f11096c == null) {
            b(nVar);
            return;
        }
        while (true) {
            l lVar = (l) arrayDeque.peek();
            if (lVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + lVar);
                }
                lVar.a(nVar.f11096c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e3) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e3);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(nVar);
    }

    public final void b(n nVar) {
        ComponentName componentName = nVar.f11094a;
        ArrayDeque arrayDeque = nVar.f11097d;
        Handler handler = this.B;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = nVar.f11098e;
        int i11 = i10 + 1;
        nVar.f11098e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + nVar.f11098e + " retries");
        arrayDeque.clear();
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 == 0) {
            l lVar = (l) message.obj;
            String string = Settings.Secure.getString(this.A.getContentResolver(), "enabled_notification_listeners");
            synchronized (p.f11099c) {
                if (string != null) {
                    try {
                        if (!string.equals(p.f11100d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            p.f11101e = hashSet2;
                            p.f11100d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = p.f11101e;
            }
            if (!hashSet.equals(this.D)) {
                this.D = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.A.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.C.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.C.put(componentName2, new n(componentName2));
                    }
                }
                Iterator it = this.C.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        n nVar = (n) entry.getValue();
                        if (nVar.f11095b) {
                            this.A.unbindService(this);
                            nVar.f11095b = false;
                        }
                        nVar.f11096c = null;
                        it.remove();
                    }
                }
            }
            for (n nVar2 : this.C.values()) {
                nVar2.f11097d.add(lVar);
                a(nVar2);
            }
        } else if (i10 == 1) {
            m mVar = (m) message.obj;
            ComponentName componentName3 = mVar.f11092a;
            IBinder iBinder = mVar.f11093b;
            n nVar3 = (n) this.C.get(componentName3);
            if (nVar3 != null) {
                int i11 = b.b.f1919e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.c.f1920a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.f1918e = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) iInterfaceQueryLocalInterface;
                    }
                }
                nVar3.f11096c = cVar;
                nVar3.f11098e = 0;
                a(nVar3);
                return true;
            }
        } else if (i10 == 2) {
            n nVar4 = (n) this.C.get((ComponentName) message.obj);
            if (nVar4 != null) {
                if (nVar4.f11095b) {
                    this.A.unbindService(this);
                    nVar4.f11095b = false;
                }
                nVar4.f11096c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            n nVar5 = (n) this.C.get((ComponentName) message.obj);
            if (nVar5 != null) {
                a(nVar5);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.B.obtainMessage(1, new m(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.B.obtainMessage(2, componentName).sendToTarget();
    }
}
