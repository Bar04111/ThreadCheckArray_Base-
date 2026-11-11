
import java.util.ArrayList;

public class SharedData {
    private final ArrayList<Integer> array;
    private boolean[] winArray;
    private volatile boolean flag;
    private final int b;

    public SharedData(ArrayList<Integer> array, int b) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        this.array = new ArrayList<>(array);
        this.b = b;

        // Initialize the winArray with the same size as the array
        this.winArray = new boolean[array.size()];
    }

    /**
     * Retrieves the ArrayList of integers.
     *
     * @return the ArrayList containing integers
     */
    public ArrayList<Integer> getArray() {
        return new ArrayList<>(array);
    }

    /**
     * Retrieves the array of booleans representing win conditions.
     *
     * @return the boolean array indicating win conditions
     */
    public boolean[] getWinArray() {
        return winArray.clone();
    }

    /**
     * Sets the array of booleans representing win conditions.
     *
     * @param winArray the new boolean array
     */
    public void setWinArray(boolean[] winArray) {
        if (winArray == null || winArray.length != array.size()) {
            throw new IllegalArgumentException("Invalid winArray size");
        }

        this.winArray = winArray.clone();
    }

    /**
     * Retrieves the final value of b.
     *
     * @return the final value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Retrieves the current state of the flag variable.
     *
     * @return the current value of the flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the state of the flag variable.
     *
     * @param flag the new value of the flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
