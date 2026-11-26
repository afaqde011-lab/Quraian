package oj;

import com.google.firebase.messaging.FirebaseMessaging;

public final class j implements xf.e {
    public final int A;
    public final FirebaseMessaging B;

    public j(FirebaseMessaging firebaseMessaging, int i10) {
        this.A = i10;
        this.B = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z10;
        int i10 = this.A;
        FirebaseMessaging firebaseMessaging = this.B;
        switch (i10) {
            case 0:
                w wVar = (w) obj;
                if (!firebaseMessaging.f4358e.k() || wVar.f12125h.a() == null) {
                    return;
                }
                synchronized (wVar) {
                    z10 = wVar.f12124g;
                }
                if (z10) {
                    return;
                }
                wVar.f(0L);
                return;
            default:
                oe.a aVar = (oe.a) obj;
                bd.d dVar = FirebaseMessaging.f4353k;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    ab.a0.l0(aVar.A);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
