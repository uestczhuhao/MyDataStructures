import java.util.List;

/**
 * Created by zhuhao on 17-4-12.
 */
public class Test {
    public static void main(String[] args) {
//        testSingleLinkList();
//        testDoubleCircularList ();
//        testLinkStack ();
        testBinaryTree ();
    }
    public static void testSingleLinkList(){
        SingleLinkList ListTest = new SingleLinkList ("ccc"  );

        for (int i=0;i<3;i++)
            ListTest.addElement ( i );
        ListTest.addElementAtIndex ( 444,0 );
//        SingleLinkList.Node p =ListTest.getPreNode ( 5 );
//        System.out.println (ListTest.getDataOfNode(p));
        ListTest.print ();
        ListTest.clear ();
        ListTest.print ();
//        System.out.println (ListTest.getSize ());
//        ListTest.removeElement ( 2 );
//        ListTest.print ();
//        System.out.println (ListTest.getSize ());
    }
    public static void testDoubleCircularList(){
        DoubleCircularList ListTest = new DoubleCircularList (  );
        ListTest.print ();
        ListTest.addElement ( 11 );
        ListTest.addElement ( 111 );
        ListTest.addElement ( 1111 );
        ListTest.addElementAtIndex ( 2,2 );
//        ListTest.removeElement ( 2 );
        ListTest.print ();
        ListTest.clear ();
        ListTest.print ();
    }
    public static void testLinkStack(){
        LinkStack stack = new LinkStack ();
        stack.print ();
        stack.push ( 1 );
        stack.push ( 2 );
        stack.push ( 3 );
        stack.pop();
        System.out.println (stack.getStackLength ());
        stack.pop();
        System.out.println (stack.getStackLength ());
        stack.pop();
        stack.print ();
    }
    public static void testBinaryTree(){
        BinaryTree tree = new BinaryTree ();
        String str = "ABCDEFG";
        char[] strTest = str.toCharArray ();
        for(int i=0;i<strTest.length;i++){
            tree.CreateBiTree ( tree.getRoot (),strTest[i] );
        }
        System.out.println (tree.getSize ());
        tree.PreOrderTraverse ( tree.getRoot () );
        System.out.println ();
        tree.InOrderTraverse ( tree.getRoot () );
        System.out.println ();
        tree.PostOrderTraverse ( tree.getRoot () );
    }

}
