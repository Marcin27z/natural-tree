package drzewo;

import java.util.Objects;

public class RegularLeaf extends Leaf {

    private int color;

    public RegularLeaf(int color) {
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegularLeaf)) return false;
        RegularLeaf that = (RegularLeaf) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
