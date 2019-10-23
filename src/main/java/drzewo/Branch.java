package drzewo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Branch<L extends Leaf> {

    private double length = 0;
    private List<L> leaves = new ArrayList<>();

    public double getLength() {
        return length;
    }

    public void grow(double gain) {
        length += gain;
    }

    public void addLeaf(L leaf) {
        leaves.add(leaf);
    }

    public List<L> getLeaves() {
        return leaves;
    }

    public int getNumberOfLeaves() {
        return leaves.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch)) return false;
        Branch<?> branch = (Branch<?>) o;
        return Double.compare(branch.length, length) == 0 &&
                Objects.equals(leaves, branch.leaves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, leaves);
    }
}
