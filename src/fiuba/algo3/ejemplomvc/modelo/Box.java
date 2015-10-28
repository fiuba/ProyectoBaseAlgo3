package fiuba.algo3.ejemplomvc.modelo;

/**
 * Created by nicopaez on 10/26/15.
 */
public class Box {
    private final int width;
    private final int height;

    public Box(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
