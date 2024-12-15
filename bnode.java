package sid;

public class bnode {
    int key;
    bnode left;
    bnode right;

    public bnode(int val) {
        key = val;
        left = right = null;
    }

    static class bst {
 
        static bnode insert(bnode root, int key) {
            if (root == null) return new bnode(key);
            if (key < root.key) {
                root.left = insert(root.left, key);
            } else {
                root.right = insert(root.right, key);
            }
            return root;
        }

     
        static void preorder(bnode q) {
            if (q != null) {
                System.out.println(q.key);
                preorder(q.left);
                preorder(q.right);
            }
        }

 
        static void inorder(bnode q) {
            if (q != null) {
                inorder(q.left);
                System.out.println(q.key);
                inorder(q.right);
            }
        }


        static void postorder(bnode q) {
            if (q != null) {
                postorder(q.left);
                postorder(q.right);
                System.out.println(q.key);
            }
        }

        static void min(bnode q) {
            bnode pre = null;
            while (q != null) {
                pre = q;
                q = q.left;
            }
            if (pre != null) {
                System.out.println("\n\tMin element in tree is=" + pre.key);
            }
        }

  
        static void max(bnode q) {
            bnode post = null;
            while (q != null) {
                post = q;
                q = q.right;
            }
            if (post != null) {
                System.out.println("\n\tMax element in tree is=" + post.key);
            }
        }

        public static void main(String[] args) {
            bnode root = null;
            root = insert(root, 50);
            root = insert(root, 30);
            root = insert(root, 20);
            root = insert(root, 70);
            root = insert(root, 40);
            root = insert(root, 60);
            root = insert(root, 80);

            System.out.println("In-order:");
            inorder(root);
            
            System.out.println("\nPre-order:");
            preorder(root);

            System.out.println("\nPost-order:");
            postorder(root);

            min(root);
            max(root);
        }
    }
}
