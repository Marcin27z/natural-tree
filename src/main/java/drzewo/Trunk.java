package drzewo;

import java.util.Objects;

class Trunk {

    private double radius = 0.0;

    double getRadius() {
        return radius;
    }

    void increaseRadius(double gain) {
        this.radius += gain;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trunk)) return false;
        Trunk trunk = (Trunk) o;
        return Double.compare(trunk.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
