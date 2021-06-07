/**
 * @author Klrushka;
 * @vesion 1
 */

/**
 *  Class about tree
 */
public class Tree16 {
    /**
     * This int field storage data about height of tree
     */
    int height;

    /**
     * This constructor without params
     */
    Tree16(){
        System.out.println("We plant a sprout");
        height = 0;
    }
    /**
     * This constructor has param
     * @param initialHeight meas start height of tree
     */
    Tree16(int initialHeight){
        height = initialHeight;
        System.out.println("Creating a new tree height " + height + "m");
    }

    /**
     * This method without params
     * display info about Tree
     */
    void info () {
        System.out.println("Tree height " + height + "m");
    }


    /**
     * This method with params
     * @param s
     * display info about Tree with s
     */
    void info (String s){
        System.out.println(s + ": Tree height " + height + "m");
    }
}
