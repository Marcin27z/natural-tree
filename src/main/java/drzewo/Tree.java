package drzewo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Tree<L extends Leaf> {

    private double height = 0.0;

    private LeavesType leavesType;

    private Trunk trunk = new Trunk();

    private List<Branch<L>> branches = new ArrayList<>();

    Tree(LeavesType leavesType) {
        this.leavesType = leavesType;
    }

    public void increaseTrunkRadius(double gain) {
        trunk.increaseRadius(gain);
    }

    public double getTrunkRadius() {
        return trunk.getRadius();
    }

    public double getTrunkCircumference() {
        return trunk.getCircumference();
    }

    public LeavesType getLeavesType() {
        return leavesType;
    }

    public double getHeight() {
        return height;
    }

    public void grow(double gain) {
        height += gain;
    }

    public void addBranch(Branch<L> branch) {
        branches.add(branch);
    }

    public List<Branch<L>> getBranches() {
        return branches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return Double.compare(tree.height, height) == 0 &&
                leavesType == tree.leavesType &&
                trunk.equals(tree.trunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, leavesType, trunk);
    }
}
