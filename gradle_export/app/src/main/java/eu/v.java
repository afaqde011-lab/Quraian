package eu;

public final class v implements u00.a {
    public final int A;
    public final int B;

    public v(int i, int i2) {
        this.A = i2;
        this.B = i;
    }

    @Override
    public final Object invoke() {
        int i;
        int i2;
        switch (this.A) {
            case 0:
                int i3 = this.B;
                if (i3 == 0) {
                    i = 2131887139;
                } else if (i3 == 1) {
                    i = 2131887138;
                } else if (i3 != 2) {
                    i = 2131887139;
                } else {
                    i = 2131887137;
                }
                return Integer.valueOf(i);
            case 1:
                int i4 = this.B;
                if (i4 == 0) {
                    i2 = 2131886521;
                } else if (i4 == 1) {
                    i2 = 2131886523;
                } else if (i4 == 2) {
                    i2 = 2131886524;
                } else if (i4 == 3) {
                    i2 = 2131886522;
                } else if (i4 != 4) {
                    i2 = 2131886521;
                } else {
                    i2 = 2131886519;
                }
                return Integer.valueOf(i2);
            case 2:
                return new j0.v(this.B, 0);
            default:
                return new k0.y(this.B, 0);
        }
    }
}
