package k5;

import androidx.credentials.exceptions.GetCredentialException;
import f5.f;

public final class b implements Runnable {
    public final int A;
    public final c B;
    public final GetCredentialException C;

    public b(c cVar, GetCredentialException getCredentialException, int i10) {
        this.A = i10;
        this.B = cVar;
        this.C = getCredentialException;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ((f) this.B.f()).a(this.C);
                break;
            default:
                ((f) this.B.f()).a(this.C);
                break;
        }
    }
}
