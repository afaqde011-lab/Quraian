package t0;

import android.view.textclassifier.TextClassification;
import oi.k;

public final class h extends b {

    public final TextClassification f14323b;

    public final int f14324c;

    public h(Object obj, TextClassification textClassification, int i10) {
        super(obj);
        this.f14323b = textClassification;
        this.f14324c = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f14311a);
        sb2.append(", textClassification=");
        sb2.append(this.f14323b);
        sb2.append(", index=");
        return k.l(sb2, this.f14324c, ')');
    }
}
