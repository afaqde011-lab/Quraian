package h9;

import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i20.a1;
import i20.t0;
import i20.u0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class f implements xf.a {
    public final List A;

    public f(a1 a1Var) throws UninitializedMessageException {
        kotlin.jvm.internal.m.e(a1Var, "typeTable");
        List list = a1Var.C;
        if ((a1Var.B & 1) == 1) {
            int i10 = a1Var.D;
            kotlin.jvm.internal.m.d(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    va.a.k0();
                    throw null;
                }
                u0 u0VarE = (u0) obj;
                if (i11 >= i10) {
                    u0VarE.getClass();
                    t0 t0VarP = u0.p(u0VarE);
                    t0VarP.D |= 2;
                    t0VarP.F = true;
                    u0VarE = t0VarP.e();
                    if (!u0VarE.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(u0VarE);
                i11 = i12;
            }
            list = arrayList;
        }
        kotlin.jvm.internal.m.d(list, "run(...)");
        this.A = list;
    }

    public f(List list) {
        this.A = list;
    }

    @Override
    public Object M(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.A);
        return Tasks.d(arrayList);
    }

    public u0 a(int i10) {
        return (u0) this.A.get(i10);
    }

    public List b(c50.h hVar) {
        String str;
        int i10;
        List listSingletonList;
        e7.u uVar = new e7.u((byte[]) hVar.D);
        ArrayList arrayList = this.A;
        while (uVar.a() > 0) {
            int iA = uVar.A();
            int iA2 = uVar.f5183b + uVar.A();
            if (iA == 134) {
                arrayList = new ArrayList();
                int iA3 = uVar.A() & 31;
                for (int i11 = 0; i11 < iA3; i11++) {
                    String strY = uVar.y(3, StandardCharsets.UTF_8);
                    int iA4 = uVar.A();
                    boolean z10 = (iA4 & Cast.MAX_NAMESPACE_LENGTH) != 0;
                    if (z10) {
                        i10 = iA4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bA = (byte) uVar.A();
                    uVar.O(1);
                    if (z10) {
                        boolean z11 = (bA & 64) != 0;
                        byte[] bArr = e7.e.f5121a;
                        listSingletonList = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    androidx.media3.common.s sVar = new androidx.media3.common.s();
                    sVar.m = x0.n(str);
                    sVar.f1494d = strY;
                    sVar.J = i10;
                    sVar.f1504p = listSingletonList;
                    arrayList.add(new androidx.media3.common.t(sVar));
                }
            }
            uVar.N(iA2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
