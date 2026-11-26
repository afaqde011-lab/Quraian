package a40;

public final class b0 extends Error {
    public b0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public b0(String message) {
        super(message);
        kotlin.jvm.internal.m.e(message, "message");
    }
}
