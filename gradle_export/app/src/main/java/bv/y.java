package bv;

public final class y implements b {
    public final yu.e a;

    public y(yu.e command) {
        kotlin.jvm.internal.m.e(command, "command");
        this.a = command;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMemorizationCommand(command=" + this.a + ")";
    }
}
