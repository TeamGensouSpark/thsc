package io.github.teamgensouspark.thsc.data;

public class Vector3Data {
    public final double X;
    public final double Y;

    public final double Z;

    public Vector3Data(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }


    public Vector3Data copyX(double x) {
        return new Vector3Data(x, Y, Z);
    }

    public Vector3Data copyY(double y) {
        return new Vector3Data(X, y, Z);
    }

    public Vector3Data copyZ(double z) {
        return new Vector3Data(X, Y, z);
    }
}
