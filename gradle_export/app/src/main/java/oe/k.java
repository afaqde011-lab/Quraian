package oe;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kh.r;

public final class k implements Runnable {
    public final int A;
    public final m B;

    public k(m mVar, int i10) {
        this.A = i10;
        this.B = mVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                m mVar = this.B;
                synchronized (mVar) {
                    if (mVar.A == 1) {
                        mVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.B.a("Service disconnected");
                return;
        }
        while (true) {
            m mVar2 = this.B;
            synchronized (mVar2) {
                try {
                    if (mVar2.A != 2) {
                        return;
                    }
                    if (mVar2.D.isEmpty()) {
                        mVar2.c();
                        return;
                    }
                    n nVar = (n) mVar2.D.poll();
                    mVar2.E.put(nVar.f11950a, nVar);
                    ((ScheduledExecutorService) mVar2.F.C).schedule(new r(mVar2, nVar, 11), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(nVar)));
                    }
                    o oVar = mVar2.F;
                    Messenger messenger = mVar2.B;
                    int i10 = nVar.f11952c;
                    Context context = (Context) oVar.B;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = nVar.f11950a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", nVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", nVar.f11953d);
                    messageObtain.setData(bundle);
                    try {
                        h7.b bVar = mVar2.C;
                        Messenger messenger2 = (Messenger) bVar.A;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) bVar.B;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.A;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e3) {
                        mVar2.a(e3.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
