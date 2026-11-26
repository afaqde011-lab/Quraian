package tf;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class f1 implements Runnable {
    public final int A;
    public final com.google.android.gms.internal.measurement.l0 B;
    public final AppMeasurementDynamiteService C;

    public f1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, int i10) {
        this.A = i10;
        this.B = l0Var;
        this.C = appMeasurementDynamiteService;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                c3 c3VarJ = this.C.f4066e.j();
                com.google.android.gms.internal.measurement.l0 l0Var = this.B;
                c3VarJ.V0();
                c3VarJ.W0();
                c3VarJ.j1(new ca.u(c3VarJ, c3VarJ.l1(false), l0Var, false, 13));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.C;
                e4 e4Var = appMeasurementDynamiteService.f4066e.I;
                h1.e(e4Var);
                h1 h1Var = appMeasurementDynamiteService.f4066e;
                e4Var.H1(this.B, h1Var.Y != null && h1Var.Y.booleanValue());
                break;
        }
    }
}
