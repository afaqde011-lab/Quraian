package k9;

public final class p2 implements Runnable {
    public final int A;
    public final v3 B;
    public final int C;

    public p2(v3 v3Var, int i10, int i11) {
        this.A = i11;
        this.B = v3Var;
        this.C = i10;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                v3 v3Var = this.B;
                if (v3Var.isCommandAvailable(25) || v3Var.isCommandAvailable(33)) {
                    boolean zIsCommandAvailable = v3Var.isCommandAvailable(33);
                    int i10 = this.C;
                    if (!zIsCommandAvailable) {
                        v3Var.setDeviceVolume(i10);
                    } else {
                        v3Var.setDeviceVolume(i10, 1);
                    }
                }
                break;
            default:
                v3 v3Var2 = this.B;
                if (v3Var2.isCommandAvailable(26) || v3Var2.isCommandAvailable(34)) {
                    int i11 = this.C;
                    if (i11 == -100) {
                        if (!v3Var2.isCommandAvailable(34)) {
                            v3Var2.setDeviceMuted(true);
                        } else {
                            v3Var2.setDeviceMuted(true, 1);
                        }
                    } else if (i11 == -1) {
                        if (!v3Var2.isCommandAvailable(34)) {
                            v3Var2.decreaseDeviceVolume();
                        } else {
                            v3Var2.decreaseDeviceVolume(1);
                        }
                    } else if (i11 == 1) {
                        if (!v3Var2.isCommandAvailable(34)) {
                            v3Var2.increaseDeviceVolume();
                        } else {
                            v3Var2.increaseDeviceVolume(1);
                        }
                    } else if (i11 == 100) {
                        if (!v3Var2.isCommandAvailable(34)) {
                            v3Var2.setDeviceMuted(false);
                        } else {
                            v3Var2.setDeviceMuted(false, 1);
                        }
                    } else if (i11 != 101) {
                        a1.b.y("onAdjustVolume: Ignoring unknown direction: ", i11, "VolumeProviderCompat");
                    } else if (!v3Var2.isCommandAvailable(34)) {
                        v3Var2.setDeviceMuted(!v3Var2.f());
                    } else {
                        v3Var2.setDeviceMuted(!v3Var2.f(), 1);
                    }
                }
                break;
        }
    }
}
