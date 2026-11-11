import java.util.ArrayList;

/**
 * Stores the shared data used by the threads.
 *
 * The input array is represented as an {@code ArrayList<Integer>},
 * while the solution array remains a primitive {@code boolean[]}.
 */
public class SharedData {

    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Creates a SharedData object.
     *
     * @param array the input array as an {@code ArrayList<Integer>}
     * @param b the target number
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    public boolean[] getWinArray() {
        return winArray;
    }

    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public int getB() {
        return b;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
