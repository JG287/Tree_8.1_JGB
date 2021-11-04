/**
 * @author njohnson3
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree((Integer.parseInt(args[0])));
		TreeMethods aMethod =new TreeMethods();
		aMethod.DFS(root);
		System.out.print("\nThe height of the tree is: " + aMethod.getHeight(root));
		System.out.print("\nThe number of nodes traversed is: " + aMethod.getFullNodes(root));
	}
}