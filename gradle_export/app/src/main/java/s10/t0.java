package s10;

import java.util.ArrayList;

public final class t0 {
    public final ArrayList a;
    public final ArrayList b;

    public t0(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
            default:
                this.a = new ArrayList(0);
                this.b = new ArrayList(0);
                break;
        }
    }
}
