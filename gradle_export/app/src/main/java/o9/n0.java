package o9;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

public final class n0 implements IBinder.DeathRecipient {

    public final Messenger f11828a;

    public final k.e f11829b;

    public final Messenger f11830c;

    public int f11833f;

    public int f11834g;

    public final s0 f11836i;

    public int f11831d = 1;

    public int f11832e = 1;

    public final SparseArray f11835h = new SparseArray();

    public n0(s0 s0Var, Messenger messenger) {
        this.f11836i = s0Var;
        this.f11828a = messenger;
        k.e eVar = new k.e(this);
        this.f11829b = eVar;
        this.f11830c = new Messenger(eVar);
    }

    public final void a(int i10) {
        int i11 = this.f11831d;
        this.f11831d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = i11;
        messageObtain.arg2 = i12;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.f11830c;
        try {
            this.f11828a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e3) {
            if (i10 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e3);
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f11836i.J.post(new m0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i11);
        int i12 = this.f11831d;
        this.f11831d = i12 + 1;
        b(7, i12, i10, null, bundle);
    }

    public final void d(int i10, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i11);
        int i12 = this.f11831d;
        this.f11831d = i12 + 1;
        b(8, i12, i10, null, bundle);
    }
}
