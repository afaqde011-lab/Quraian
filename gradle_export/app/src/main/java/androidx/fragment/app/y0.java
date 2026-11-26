package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

public final class y0 implements h.b {
    public final int A;
    public final i1 B;

    public y0(i1 i1Var, int i10) {
        this.A = i10;
        this.B = i1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.A) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                i1 i1Var = this.B;
                e1 e1Var = (e1) i1Var.F.pollFirst();
                if (e1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = e1Var.A;
                    int i11 = e1Var.B;
                    j0 j0VarC = i1Var.f751c.c(str);
                    if (j0VarC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        j0VarC.onRequestPermissionsResult(i11, strArr, iArr);
                    }
                }
                break;
            case 1:
                h.a aVar = (h.a) obj;
                i1 i1Var2 = this.B;
                e1 e1Var2 = (e1) i1Var2.F.pollLast();
                if (e1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = e1Var2.A;
                    int i12 = e1Var2.B;
                    j0 j0VarC2 = i1Var2.f751c.c(str2);
                    if (j0VarC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        j0VarC2.onActivityResult(i12, aVar.A, aVar.B);
                    }
                }
                break;
            default:
                h.a aVar2 = (h.a) obj;
                i1 i1Var3 = this.B;
                e1 e1Var3 = (e1) i1Var3.F.pollFirst();
                if (e1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = e1Var3.A;
                    int i13 = e1Var3.B;
                    j0 j0VarC3 = i1Var3.f751c.c(str3);
                    if (j0VarC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        j0VarC3.onActivityResult(i13, aVar2.A, aVar2.B);
                    }
                }
                break;
        }
    }
}
