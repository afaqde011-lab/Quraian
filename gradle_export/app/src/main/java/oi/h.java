package oi;

import java.io.File;
import java.io.FilenameFilter;

public final class h implements FilenameFilter {

    public final int f12000a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f12000a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
