package pointEx;

public class Ex01 {

}

class Point {
    int x, y, z;

    Point() {}
    Point(int x) {
        this(x, 1, 2);
    }
    Point(int x, int y) {
        this(x, y, 2);
    }

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Point3D extends Point {
    int s;

    Point3D(int x, int y, int z, int s) {
        super(x, y, z);
        this.s = s;
    }
}