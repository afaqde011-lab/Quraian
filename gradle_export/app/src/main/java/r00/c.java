package r00;

import java.io.File;
import kotlin.jvm.internal.m;

public final class c extends b {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d >= fileArr.length) {
            if (this.b) {
                return null;
            }
            this.b = true;
            return file;
        }
        m.b(fileArr);
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }
}
