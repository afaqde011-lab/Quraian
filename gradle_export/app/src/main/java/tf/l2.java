package tf;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

public final class l2 implements Runnable {
    public final int A = 1;
    public final int B;
    public final Object C;
    public final Object D;
    public final Cloneable E;

    public l2(o10.b bVar, int i10, q0 q0Var, Intent intent) {
        this.C = bVar;
        this.B = i10;
        this.D = q0Var;
        this.E = intent;
    }

    public l2(s0 s0Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.C = s0Var;
        this.B = i10;
        this.D = exc;
        this.E = bArr;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                s0 s0Var = (s0) this.C;
                ((k2) s0Var.F).b(this.B, (Exception) this.D, (byte[]) this.E);
                break;
            default:
                o10.b bVar = (o10.b) this.C;
                q0 q0Var = (q0) this.D;
                Intent intent = (Intent) this.E;
                Service service = (Service) bVar.B;
                f3 f3Var = (f3) service;
                int i10 = this.B;
                if (f3Var.a(i10)) {
                    q0Var.O.c(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
                    q0 q0Var2 = h1.m(service, null, null).F;
                    h1.g(q0Var2);
                    q0Var2.O.b("Completed wakeful intent.");
                    f3Var.b(intent);
                }
                break;
        }
    }
}
