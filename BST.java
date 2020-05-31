package RandomBinaryTree;

public class BST {

    public Node root;

    public BST(){
        root = null;
    }

    public void insert(int putin){
        root = insert(putin,root);
    }

    public int calculateheight(Node x){

        if(x == null){
            return -1;
        }
        else {
            return x.height;
        }
    }

    public int maxheight(int left, int right){
        if(left > right){
            return left;
        }
        else{
            return right;
        }
    }



    public Node insert(int insertbook, Node avl){
        if(avl == null){
            avl = new Node(insertbook);
        }
        else if(insertbook< avl.value){

            avl.left = insert(insertbook,avl.left);
            if( calculateheight(avl.left) - calculateheight(avl.right) == 2) {
                if (insertbook < avl.value) {
                    //avl = rotatewithleftchild(avl);

                    System.out.printf("Imbalance occurred at inserting ISBN %s ; fixed in left rotation \n",avl.value);
                } else {
                    //avl = doublewithleftchild(avl);

                    System.out.printf("Imbalance occurred at inserting ISBN %s ; fixed in leftRight rotation \n",avl.value);
                }
            }

        }
        else if(insertbook > avl.value){
            avl.right = insert(insertbook,avl.right);
            if(calculateheight(avl.right) - calculateheight(avl.left) == 2){
                if(insertbook > avl.right.value){
                    //avl = rotatewithrightchild(avl);
                    System.out.printf("Imbalance occurred at inserting ISBN %s ; fixed in right rotation \n",avl.value);
                }
                else{
                    //avl = doublewithrightchild(avl);
                    System.out.printf("Imbalance occurred at inserting ISBN %s ; fixed in rightLeft rotation \n",avl.value);
                }
            }
        }

        avl.height = maxheight(calculateheight(avl.left), calculateheight(avl.right))+1;
        return avl;
    }






}
