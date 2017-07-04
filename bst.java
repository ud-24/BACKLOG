import java.io.*;
import java.util.*;
public class bst{
    node root;
    public bst(){
        this.root=null;
    }
    void insert(int d)
    {
        node n= new node(d);
        node p=this.root;
        node g=null;
        if(this.root==null)
        this.root=n;
        else {
           while(p!=null)
           {
               if(p.data>d)
               {
                   g=p;
                   p=p.left;

               }
               else{
                   g=p;
                   p=p.right;
               }
           }
           if(g.data>d)
           g.left=n;
           else
           g.right=n;
        }
    }
    void inorder(node p)
    {
        //node p=this.root;
        if(p==null)
        return;
        else
        inorder(p.left);
        System.out.println(p.data);
        inorder(p.right);
    }
   /* void delete(int d)
    {
        node p=this.root;
        node q=p;
        while(p.data!=d)
        {
            if(p.data>d)
            {
                q=p;
                p=p.left;
            }
            //else if(p.data==d)
            //break;
            else
           { q=p;
               p=p.right;
           
        }}
       // System.out.println(p.data);
        if(p.left==null && p.right==null)
        {
         if(q.data>d)
         q.left=null;
         else 
         q.right=null;
    }
    else if(p.left==null && p.right!=null)
    {
        if(q.data>d)
         q.left=p.right;
         else 
         q.right=p.right;
    }
     else if(p.left!=null && p.right==null)
    {
        if(q.data>d)
         q.left=p.left;;
        if(q.data<d) 
         q.right=p.left;
    }
    else
    {
       // if(q.data>d)
      //  p.data=max(p);
      int mu =0;
      if(q.data>d)
       mu =max(q.right);
      if(q.data<d)
      mu =max(q.left);
        System.out.println(mu);
        //delete(p.data);
    }
    }
    int max(node n)
    {
        int m=0;;
        while(n!=null)
        {
            m=n.left.data;
            n=n.left;
        }
        return m;
    }
*/
void delete(int data)
{
   root= deleterec(this.root,data);
}
node deleterec(node r , int data)
{
    if(r==null)
    return r;
    if(data<r.data)
   r.left= deleterec(r.left,data);
    else if(data>r.data)
    r.right=deleterec(r.right,data);
    else{
       //if(r.left==null && r.right==null)
        //r;
        if(r.left==null)
        return r.right;
        else if(r.right==null)
        return r.left;
        r.data=minValue(r.right);
        r.right=deleterec(r.right,r.data);


    }
    return r;

}
int minValue(node r)
    {
        int minv = r.data;
        while (r.left != null)
        {
            minv = r.left.data;
            r = r.left;
        }
        return minv;
    }
}