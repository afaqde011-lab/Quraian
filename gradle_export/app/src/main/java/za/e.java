package za;

import android.net.NetworkRequest;
import java.util.Set;

public final class e {

    public static final e f17355j = new e();

    public final w f17356a;

    public final ib.f f17357b;

    public final boolean f17358c;

    public final boolean f17359d;

    public final boolean f17360e;

    public final boolean f17361f;

    public final long f17362g;

    public final long f17363h;

    public final Set f17364i;

    public e() {
        w wVar = w.A;
        this.f17357b = new ib.f(null);
        this.f17356a = wVar;
        this.f17358c = false;
        this.f17359d = false;
        this.f17360e = false;
        this.f17361f = false;
        this.f17362g = -1L;
        this.f17363h = -1L;
        this.f17364i = h00.z.A;
    }

    public e(ib.f fVar, w wVar, boolean z10, boolean z11, boolean z12, boolean z13, long j9, long j10, Set set) {
        this.f17357b = fVar;
        this.f17356a = wVar;
        this.f17358c = z10;
        this.f17359d = z11;
        this.f17360e = z12;
        this.f17361f = z13;
        this.f17362g = j9;
        this.f17363h = j10;
        this.f17364i = set;
    }

    public e(e eVar) {
        kotlin.jvm.internal.m.e(eVar, "other");
        this.f17358c = eVar.f17358c;
        this.f17359d = eVar.f17359d;
        this.f17357b = eVar.f17357b;
        this.f17356a = eVar.f17356a;
        this.f17360e = eVar.f17360e;
        this.f17361f = eVar.f17361f;
        this.f17364i = eVar.f17364i;
        this.f17362g = eVar.f17362g;
        this.f17363h = eVar.f17363h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f17357b.f7571a;
    }

    public final boolean b() {
        return !this.f17364i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f17358c == eVar.f17358c && this.f17359d == eVar.f17359d && this.f17360e == eVar.f17360e && this.f17361f == eVar.f17361f && this.f17362g == eVar.f17362g && this.f17363h == eVar.f17363h && kotlin.jvm.internal.m.a(a(), eVar.a()) && this.f17356a == eVar.f17356a) {
            return kotlin.jvm.internal.m.a(this.f17364i, eVar.f17364i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f17356a.hashCode() * 31) + (this.f17358c ? 1 : 0)) * 31) + (this.f17359d ? 1 : 0)) * 31) + (this.f17360e ? 1 : 0)) * 31) + (this.f17361f ? 1 : 0)) * 31;
        long j9 = this.f17362g;
        int i10 = (iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f17363h;
        int iHashCode2 = (this.f17364i.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f17356a + ", requiresCharging=" + this.f17358c + ", requiresDeviceIdle=" + this.f17359d + ", requiresBatteryNotLow=" + this.f17360e + ", requiresStorageNotLow=" + this.f17361f + ", contentTriggerUpdateDelayMillis=" + this.f17362g + ", contentTriggerMaxDelayMillis=" + this.f17363h + ", contentUriTriggers=" + this.f17364i + ", }";
    }
}
