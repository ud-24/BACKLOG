import java.io.*;
import java.util.*;
public class imp{
    public static void main(String args[]){
    bst b= new bst();
    b.insert(20);
    b.insert(10);
    b.insert(40);
  //  b.insert(35);
   // b.insert(15);
   // b.insert(10);
   // b.insert(17);
    b.inorder(b.root);
    b.delete(10);
    System.out.println("\n\n\n\n\n");
     b.inorder(b.root);

}}