import drzewo.Branch;
import drzewo.Conifer;
import drzewo.LeafyTree;
import drzewo.NeedleShapedLeaf;

public class Main {
    public static void main(String[] args) {
        Conifer conifer = new Conifer();
        LeafyTree leafyTree = new LeafyTree();
        System.out.println(conifer.getLeavesType());
        System.out.println(leafyTree.getLeavesType());

        Branch<NeedleShapedLeaf> branch = new Branch<>();
        branch.addLeaf(new NeedleShapedLeaf());
    }
}
