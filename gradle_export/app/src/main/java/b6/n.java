package b6;

import java.io.File;

public final class n extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final u00.a B;

    public n(int i10, u00.a aVar) {
        super(0);
        this.A = i10;
        this.B = aVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return this.B.invoke();
            case 1:
                return this.B.invoke();
            case 2:
                return this.B.invoke();
            case 3:
                return this.B.invoke();
            default:
                File file = (File) this.B.invoke();
                if (r00.i.Z(file).equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.m.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
