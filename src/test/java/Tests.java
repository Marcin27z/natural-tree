import drzewo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void When_CreateNewConifer_Should_LeavesTypeIsNeedleShaped() {
        Tree tree = new Conifer();
        assertEquals( LeavesType.NEEDLE_SHAPED, tree.getLeavesType());
    }

    @Test
    public void When_CreateNewLeafyTree_Should_LeavesTypeIsRegular() {
        Tree tree = new LeafyTree();
        assertEquals(LeavesType.REGULAR, tree.getLeavesType());
    }

    @Test
    public void When_GrowTree_Should_HeightIncrease() {
        Tree tree = new LeafyTree();
        double gain = 1.245634;
        double oldHeight = tree.getHeight();
        tree.grow(gain);
        assertEquals(gain, tree.getHeight() - oldHeight, 0.001);
    }

    @Test
    public void When_GrowBranch_Should_LengthIncrease() {
        Branch branch = new Branch();
        double gain = 1.56345;
        double oldLength = branch.getLength();
        branch.grow(gain);
        assertEquals(gain, branch.getLength() - oldLength, 0.001);
    }

    @Test
    public void When_AddLeafToEmptyBranch_Should_BranchContainOneLeaf() {
        Branch<RegularLeaf> regularLeafBranch = new Branch<>();
        regularLeafBranch.addLeaf(new RegularLeaf(100));
        assertEquals(1, regularLeafBranch.getNumberOfLeaves());
    }

    @Test
    public void When_AddLeafToEmptyBranch_Should_BranchContainThatLeaf() {
        Branch<RegularLeaf> regularLeafBranch = new Branch<>();
        RegularLeaf regularLeaf = new RegularLeaf(100);
        regularLeafBranch.addLeaf(regularLeaf);
        assertTrue(regularLeafBranch.getLeaves().contains(regularLeaf));
    }

    @Test
    public void When_IncreaseTrunkRadius_Should_TrunkRadiusIncrease() {
        Tree tree = new LeafyTree();
        double gain = 1.245634;
        double oldTrunkRadius = tree.getTrunkRadius();
        tree.increaseTrunkRadius(gain);
        assertEquals(gain, tree.getTrunkRadius() - oldTrunkRadius, 0.001);
    }

    @Test
    public void When_GetTrunkCircumference_Should_TrunkCircumference() {
        Tree tree = new LeafyTree();
        double gain = 3.234;
        tree.increaseTrunkRadius(gain);
        assertEquals(tree.getTrunkRadius() * 2 * Math.PI, tree.getTrunkCircumference(), 0.001);
    }
}
