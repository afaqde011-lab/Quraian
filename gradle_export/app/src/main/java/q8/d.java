package q8;

import java.util.Collections;
import java.util.List;

public final class d extends b {

    public final long f12782a;

    public final long f12783b;

    public final List f12784c;

    public d(long j9, long j10, List list) {
        this.f12782a = j9;
        this.f12783b = j10;
        this.f12784c = Collections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f12782a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a1.b.k(this.f12783b, " }", sb2);
    }
}
