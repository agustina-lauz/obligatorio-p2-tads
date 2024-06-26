package uy.edu.um.tads.tree;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.edu.um.tads.list.MyLinkedListImpl;
import uy.edu.um.tads.list.MyList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BinaryTreeImpl<V> implements BinaryTree<V> {

    protected TreeNode<V> root;

    @Override
    public int depth() {
        return root == null ? 0 : root.depth();
    }

    @Override
    public int size() {
        return root == null ? 0 : root.size();
    }

    @Override
    public int breadthSize() {
        return root == null ? 0 : root.breadthSize();
    }

    @Override
    public MyList<V> breadth() {
        MyList<V> laLista = new MyLinkedListImpl<>();
        if (root != null) {
            root.breadth(laLista);
        }
        return laLista;
    }

    @Override
    public MyList<V> preorder() {
        MyList<V> laLista = new MyLinkedListImpl<>();
        if (root != null) {
            root.preorder(laLista);
        }
        return laLista;
    }

    @Override
    public MyList<V> postorder() {
        MyList<V> laLista = new MyLinkedListImpl<>();
        if (root != null) {
            root.postorder(laLista);
        }
        return laLista;
    }

    @Override
    public MyList<V> inorder() {
        MyList<V> laLista = new MyLinkedListImpl<>();
        if (root != null) {
            root.inorder(laLista);
        }
        return laLista;
    }

    @Override
    public void printPreOrden() {
        if (this.root == null)
            System.out.println("Arbol Vacío");
        else {
            System.out.println("");
            this.root.printPreOrden();
            System.out.println("");
        }
    }

    public void printInOrder() {
        if (this.root == null)
            System.out.println("Arbol Vacío");
        else {
            System.out.println("");
            this.root.printInOrder();
            System.out.println("");
        }
    }

    public void printPostOrder() {
        if (this.root == null)
            System.out.println("Arbol Vacío");
        else {
            System.out.println("");
            this.root.printPostOrder();
            System.out.println("");
        }
    }

    @Override
    public V getRoot() {
        return root == null ? null : root.getValue();
    }

    @Override
    public TreeNode<V> getRootNode() {
        return root == null ? null : root;
    }
}