public class MathOperation {
    private int result;

    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second, int tree){
        return add(first, second) + tree;
    }

    public int add(int first, int second, int tree, int four){
        return add(first, second) + add(tree, four);
    }
}
