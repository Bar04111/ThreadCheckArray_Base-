# README.md

## Project Overview

This project is a Java implementation of a recursive multithreaded Subset Sum algorithm, featuring thread synchronization and data structure refactoring to `ArrayList<Integer>`. The code includes comprehensive Javadoc documentation and adheres to the Braude College Academic License.

## Recursive Multithreaded Subset Sum Algorithm

The Subset Sum problem involves determining if there exists a subset within a given set of non-negative integers that sums up to a specified target. This project implements an efficient recursive multithreaded approach to solve this problem. The algorithm uses thread synchronization mechanisms to ensure safe access and modification of shared resources.

### Thread Synchronization

Thread synchronization is crucial in this implementation to avoid race conditions when multiple threads access or modify the shared state concurrently. We use Java's `synchronized` keyword to synchronize access to critical sections of code, ensuring that only one thread can execute these sections at a time.

```java
// Example synchronized block
synchronized (lock) {
    // Critical section code
}
```

## Data Structure Refactoring

To improve performance and memory usage, the project refactors the data structure used in the algorithm from an array to `ArrayList<Integer>`. This change enhances flexibility and reduces the need for pre-allocation of fixed-size arrays.

```java
// Example ArrayList usage
List<Integer> subset = new ArrayList<>();
subset.add(number);
```

## Code Documentation with Javadoc

The code is well-documented using Javadoc annotations, providing clear explanations and examples of how each class, method, and function should be used. This documentation helps other developers understand the codebase quickly and efficiently.

```java
/**
 * Finds a subset in arr[0..n-1] such that sum of elements in the subset is equal to s.
 *
 * @param arr   Array containing non-negative integers.
 * @param n     Size of the array.
 * @param s     The target sum.
 * @return      True if there is a subset with sum `s`, false otherwise.
 */
public boolean isSubsetSum(int arr[], int n, int s) {
    // Implementation details
}
```

## Authors and Git Collaboration Roles

- **Bar Nahman**: Student A responsible for refactoring of SharedData
- **Oudai Juma**: Student B responsible for refactoring of TestThreadCheckArray

Authors follow a collaborative Git workflow:
1. **Bar Nahman** initiated the project .
2. **Oudai Juma** reviewed the initial code, provided documentation, and managed version control using Git.

## Licensing

This project is licensed under the Braude College Academic License. For more details, refer to the `LICENSE` file in the repository.

---

**Note**: This README provides a high-level overview of the project's features and components. Detailed implementation specifics are available within the source code files.