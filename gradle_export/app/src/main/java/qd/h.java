package qd;

import com.google.protobuf.RuntimeVersion;

public final class h {

    public int f12892a;

    public int f12893b;

    public String f12894c;

    public static a8.a a() {
        a8.a aVar = new a8.a();
        aVar.f195c = 0;
        aVar.f193a = RuntimeVersion.SUFFIX;
        return aVar;
    }

    public final String toString() {
        int i10 = this.f12892a;
        int i11 = com.google.android.gms.internal.play_billing.q.f4028a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.g.C;
        Integer numValueOf = Integer.valueOf(i10);
        return "Response Code: " + (!a0Var.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.g.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.g) a0Var.get(numValueOf)).toString() + ", Debug Message: " + this.f12894c;
    }
}
