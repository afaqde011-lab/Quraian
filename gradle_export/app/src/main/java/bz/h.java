package bz;

public final class h implements j {
    public final String a;

    public h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnTerminateDeviceClicked(deviceId=", this.a, ")");
    }
}
