
public class TreeMethods {

/**
 * This method will conduct a depth first search using recursion for a specific tree
 * @param node
 */
public void DFS(Node node) {
	
    if (node == null) {
      return;
    }
    
    System.out.printf("%s ", node.data);
    DFS(node.lChild);
    DFS(node.rChild);
}
/**
 * This method is used to retrieve the height of a tree
 * @param node
 * @return
 */
public int getHeight(Node node)
{
    if (node == null)
        return -1;
    else
    {
        int lHeight = getHeight(node.lChild);
        int rHeight = getHeight(node.rChild);

        if (lHeight > rHeight)
            return (lHeight + 1);
         else
            return (rHeight + 1);
    }
}
/**
 * This method will provide the amount of nodes that have been traversed
 * @param root
 * @return
 */
public int getFullNodes(Node root)
{
    if (root == null)
    return 0;
 
    int count = 0;
    if (root.lChild != null && root.rChild != null)
    count++;
 
    count += (getFullNodes(root.lChild) + getFullNodes(root.rChild));
    return count;
}
}