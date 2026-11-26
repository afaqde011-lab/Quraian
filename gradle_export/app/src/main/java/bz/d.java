package bz;

public final class d implements j {
    public final String a;

    public d(String deviceId) {
        kotlin.jvm.internal.m.e(deviceId, "deviceId");
        this.a = deviceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnDeviceClicked(deviceId=", this.a, ")");
    }
}
