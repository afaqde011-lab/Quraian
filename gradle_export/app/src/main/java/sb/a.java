package sb;

import java.io.File;
import wb.l;

public final class a implements b {

    public final boolean f13945a;

    public a(boolean z10) {
        this.f13945a = z10;
    }

    @Override
    public final String a(Object obj, l lVar) {
        File file = (File) obj;
        if (!this.f13945a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
