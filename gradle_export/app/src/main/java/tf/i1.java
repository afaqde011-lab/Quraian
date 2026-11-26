package tf;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

public final class i1 implements Runnable {
    public final int A;
    public final g4 B;
    public final n1 C;

    public i1(n1 n1Var, g4 g4Var, int i10) {
        this.A = i10;
        this.B = g4Var;
        this.C = n1Var;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.A) {
            case 0:
                n1 n1Var = this.C;
                n1Var.f14673e.x();
                n1Var.f14673e.V(this.B);
                break;
            case 1:
                n1 n1Var2 = this.C;
                n1Var2.f14673e.x();
                y3 y3Var = n1Var2.f14673e;
                if (y3Var.Y != null) {
                    ArrayList arrayList = new ArrayList();
                    y3Var.Z = arrayList;
                    arrayList.addAll(y3Var.Y);
                }
                m mVar = y3Var.C;
                y3.R(mVar);
                h1 h1Var = (h1) mVar.B;
                g4 g4Var = this.B;
                String str = g4Var.A;
                com.google.android.gms.common.internal.d0.h(str);
                com.google.android.gms.common.internal.d0.e(str);
                mVar.V0();
                mVar.W0();
                try {
                    SQLiteDatabase sQLiteDatabaseK1 = mVar.K1();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseK1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseK1.delete("events", "app_id=?", strArr) + sQLiteDatabaseK1.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseK1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseK1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseK1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseK1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseK1.delete("queue", "app_id=?", strArr) + sQLiteDatabaseK1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseK1.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseK1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseK1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseK1.delete("upload_queue", "app_id=?", strArr);
                    if (h1Var.D.f1(null, b0.f14568h1)) {
                        iDelete += sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.O.d("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e3) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.d("Error resetting analytics data. appId, error", q0.d1(str), e3);
                }
                if (g4Var.H) {
                    y3Var.V(g4Var);
                }
                break;
            default:
                y3 y3Var2 = this.C.f14673e;
                y3Var2.x();
                y3Var2.m0(this.B);
                break;
        }
    }
}
