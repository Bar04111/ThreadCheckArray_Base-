
import java.util.ArrayList;

/**
 * Checks whether a given number can be obtained from the elements
 * of an array using the required recursive search.
 *
 * The array is represented as an {@code ArrayList<Integer>}, while
 * the result array remains a primitive {@code boolean[]}.
 */
public class ThreadCheckArray implements Runnable {

    private boolean flag;
    private boolean[] winArray;
    SharedData sd;
    ArrayList<Integer> array;
    int b;

    /**
     * Creates a new thread task using the shared data.
     *
     * @param sd shared data containing the array and target number
     */
    public ThreadCheckArray(SharedData sd) {
        this.sd = sd;

        synchronized (sd) {
            array = sd.getArray();
            b = sd.getB();
        }

        winArray = new boolean[array.size()];
    }

    /**
     * Recursively searches for a solution.
     *
     * @param n number of elements currently considered
     * @param b remaining target value
     */
    void rec(int n, int b) {
        synchronized (sd) {
            if (sd.getFlag())
                return;
        }

        if (n == 1) {
            if (b == 0 || b == array.get(n - 1)) {
                flag = true;

                synchronized (sd) {
                    sd.setFlag(true);
                }
            }

            if (b == array.get(n - 1))
                winArray[n - 1] = true;

            return;
        }

        rec(n - 1, b - array.get(n - 1));

        if (flag)
            winArray[n - 1] = true;

        synchronized (sd) {
            if (sd.getFlag())
                return;
        }

        rec(n - 1, b);
    }

    /**
     * Starts the recursive search for the current thread.
     */
    public void run() {
        if (array.size() != 1) {
            if (Thread.currentThread().getName().equals("thread1"))
                rec(array.size() - 1, b - array.get(array.size() - 1));
            else
                rec(array.size() - 1, b);
        }

        if (array.size() == 1) {
            if (b == array.get(0) && !flag) {
                winArray[0] = true;
                flag = true;

                synchronized (sd) {
                    sd.setFlag(true);
                }
            }
        }

        if (flag) {
            if (Thread.currentThread().getName().equals("thread1"))
                winArray[array.size() - 1] = true;

            synchronized (sd) {
                sd.setWinArray(winArray);
            }
        }
    }
}

