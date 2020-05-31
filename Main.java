package RandomBinaryTree;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args){

        BST tree = new BST();
        int readin;


        for(int i = 0; i<25; i++){
            //Random r = new Random();

            // readin = r.nextInt((100 - 0) + 1);

           //System.out.println((int)(Math.random() * ((100 - 10) + 1)) + 10);

            //tree.insert(readin);
        }

        for(int i = 0; i<25; i++){
            //Random r = new Random();

           // readin = r.nextInt((100 - 0) + 1);

            readin = (int)(Math.random() * ((100 - 10) + 1)) + 10;

            tree.insert(readin);
        }
        System.out.print("The book list has been parsed into book objects");

    }

}
