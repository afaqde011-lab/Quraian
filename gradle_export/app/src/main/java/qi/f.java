package qi;

import java.io.IOException;

public final class f implements k {
    public static final sg.f C = new sg.f();
    public final Object A;
    public Object B;

    public f(ui.b bVar) {
        this.A = bVar;
        this.B = C;
    }

    public f(byte[] bArr, int[] iArr) {
        this.A = bArr;
        this.B = iArr;
    }

    @Override
    public void a(j jVar, int i10) throws IOException {
        int[] iArr = (int[]) this.B;
        try {
            jVar.read((byte[]) this.A, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            jVar.close();
        }
    }
}
