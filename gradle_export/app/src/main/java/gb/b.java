package gb;

import a40.e1;
import ab.y;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import db.e;
import db.g;
import g4.c;
import hb.i;
import hb.p;
import ib.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import za.m;
import za.v;

public final class b implements e, ab.b {
    public static final String J = v.f("SystemFgDispatcher");
    public final y A;
    public final jb.b B;
    public final Object C = new Object();
    public i D;
    public final LinkedHashMap E;
    public final HashMap F;
    public final HashMap G;
    public final g H;
    public SystemForegroundService I;

    public b(Context context) {
        y yVarL0 = y.l0(context);
        this.A = yVarL0;
        this.B = yVarL0.f421d;
        this.D = null;
        this.E = new LinkedHashMap();
        this.G = new HashMap();
        this.F = new HashMap();
        this.H = new g(yVarL0.f427j);
        yVarL0.f423f.a(this);
    }

    public static Intent a(Context context, i iVar, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", iVar.f6976a);
        intent.putExtra("KEY_GENERATION", iVar.f6977b);
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f17391a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f17392b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f17393c);
        return intent;
    }

    public final void b(Intent intent) {
        if (this.I == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        i iVar = new i(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        v vVarD = v.d();
        StringBuilder sbM = c.m("Notifying with (id:", intExtra, ", workSpecId: ", stringExtra, ", notificationType :");
        sbM.append(intExtra2);
        sbM.append(")");
        vVarD.a(J, sbM.toString());
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        m mVar = new m(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.E;
        linkedHashMap.put(iVar, mVar);
        m mVar2 = (m) linkedHashMap.get(this.D);
        if (mVar2 == null) {
            this.D = iVar;
        } else {
            this.I.D.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i10 |= ((m) ((Map.Entry) it.next()).getValue()).f17392b;
            }
            mVar = new m(mVar2.f17391a, mVar2.f17393c, i10);
        }
        SystemForegroundService systemForegroundService = this.I;
        int i11 = mVar.f17391a;
        int i12 = mVar.f17392b;
        Notification notification2 = mVar.f17393c;
        systemForegroundService.getClass();
        String str = SystemForegroundService.E;
        try {
            systemForegroundService.startForeground(i11, notification2, i12);
        } catch (ForegroundServiceStartNotAllowedException e3) {
            if (v.d().f17403a <= 5) {
                Log.w(str, "Unable to start foreground service", e3);
            }
        } catch (SecurityException e10) {
            if (v.d().f17403a <= 5) {
                Log.w(str, "Unable to start foreground service", e10);
            }
        }
    }

    public final void c() {
        this.I = null;
        synchronized (this.C) {
            try {
                Iterator it = this.G.values().iterator();
                while (it.hasNext()) {
                    ((e1) it.next()).i((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ab.g gVar = this.A.f423f;
        synchronized (gVar.f378k) {
            gVar.f377j.remove(this);
        }
    }

    @Override
    public final void d(i iVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.C) {
            try {
                e1 e1Var = ((p) this.F.remove(iVar)) != null ? (e1) this.G.remove(iVar) : null;
                if (e1Var != null) {
                    e1Var.i((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m mVar = (m) this.E.remove(iVar);
        if (iVar.equals(this.D)) {
            if (this.E.size() > 0) {
                Iterator it = this.E.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.D = (i) entry.getKey();
                if (this.I != null) {
                    m mVar2 = (m) entry.getValue();
                    SystemForegroundService systemForegroundService = this.I;
                    int i10 = mVar2.f17391a;
                    int i11 = mVar2.f17392b;
                    Notification notification = mVar2.f17393c;
                    systemForegroundService.getClass();
                    String str = SystemForegroundService.E;
                    try {
                        systemForegroundService.startForeground(i10, notification, i11);
                    } catch (ForegroundServiceStartNotAllowedException e3) {
                        if (v.d().f17403a <= 5) {
                            Log.w(str, "Unable to start foreground service", e3);
                        }
                    } catch (SecurityException e10) {
                        if (v.d().f17403a <= 5) {
                            Log.w(str, "Unable to start foreground service", e10);
                        }
                    }
                    this.I.D.cancel(mVar2.f17391a);
                }
            } else {
                this.D = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.I;
        if (mVar == null || systemForegroundService2 == null) {
            return;
        }
        v.d().a(J, "Removing Notification (id: " + mVar.f17391a + ", workSpecId: " + iVar + ", notificationType: " + mVar.f17392b);
        systemForegroundService2.D.cancel(mVar.f17391a);
    }

    @Override
    public final void e(p pVar, db.c cVar) {
        if (cVar instanceof db.b) {
            String str = pVar.f7004a;
            v.d().a(J, "Constraints unmet for WorkSpec " + str);
            i iVarC = bi.b.C(pVar);
            int i10 = ((db.b) cVar).f4845a;
            y yVar = this.A;
            yVar.f421d.f8258a.execute(new j(yVar.f423f, new ab.m(iVarC), true, i10));
        }
    }

    public final void f(int i10, int i11) {
        v.d().e(J, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry entry : this.E.entrySet()) {
            if (((m) entry.getValue()).f17392b == i11) {
                i iVar = (i) entry.getKey();
                y yVar = this.A;
                yVar.f421d.f8258a.execute(new j(yVar.f423f, new ab.m(iVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.I;
        if (systemForegroundService != null) {
            systemForegroundService.B = true;
            v.d().a(SystemForegroundService.E, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i10);
        }
    }
}
