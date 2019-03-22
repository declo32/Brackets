import java.util.ArrayList;

public class TreeNode<T> {
	private T data;
	private ArrayList<T> children;

	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public void addChild(T data) {
		children.add(data);
	}
}
