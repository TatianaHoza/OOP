package dz_4.tasks;

import java.util.Arrays;

public class DynamicArray<T> {

    private T[] array;
    private int size;
    private int length;

    public DynamicArray() {
        this.size = 0;
        this.length = 10;
        this.array = (T[]) new Object[this.length];
    }

    public DynamicArray(T[] array) {
        this();
        for (T element : array) {
            this.add(element);
        }
    }

    private void add(T element) {
        sizeCheck();
        array[size++] = element;
    }

//16. Длинна массива

    public int arrayLength() {
        return array.length;

    }

    public T sizeCheck() {
        if ((size > 0) && ((double) (size / length) > 0.95)) {
            length = (int) (length * 1.5);
            array = Arrays.copyOf(array, length);
        }
        if ((size > 10) && (double) (size / length) < 0.45) {
            length = (int) (length * 0.5);
            array = Arrays.copyOf(array, length);
        }
        return null;
    }


    // 2. Удаление элемента по индексу

    public T remove(int index) {
        T result = null;
        if (index < size) {
            result = array[index];
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
            sizeCheck();
        }
        return result;
    }

    public T min(java.util.Comparator<? super T> comparator) {
        T minRes = array[0];
        for (int i = 1; i < size; i++) {
            if (comparator.compare(minRes, array[i]) > 0)
                minRes = array[i];
        }
        return minRes;
    }

    public T max(java.util.Comparator<? super T> comparator) {
        T maxRes = array[0];
        for (int i = 1; i < size; i++) {
            if (comparator.compare(maxRes, array[i]) < 0)
                maxRes = array[i];
        }
        return maxRes;
    }


    public T sum() throws Exception {
        if (array[0] instanceof Long || array[0] instanceof Integer || array[0] instanceof Short || array[0] instanceof Byte) {
            Long sumRes = 0L;
            for (int i = 0; i < size; i++)
                sumRes += ((Number) array[i]).longValue();
            return (T) sumRes;
        } else if (array[0] instanceof Double || array[0] instanceof Float) {
            Double sumRes = 0.0;
            for (int i = 0; i < size; i++)
                sumRes += ((Number) array[i]).doubleValue();
            return (T) sumRes;
        } else
            throw new Exception(array[0].getClass().getSimpleName());
    }

    public T mul() throws Exception {
        if (array[0] instanceof Long || array[0] instanceof Integer || array[0] instanceof Short || array[0] instanceof Byte) {
            Long mulRes = 1L;
            for (int i = 0; i < size; i++)
                mulRes *= ((Number) array[i]).longValue();
            return (T) mulRes;
        } else if (array[0] instanceof Double || array[0] instanceof Float) {
            Double mulRes = 1.0;
            for (int i = 0; i < size; i++)
                mulRes *= ((Number) array[i]).doubleValue();
            return (T) mulRes;
        } else
            throw new Exception(array[0].getClass().getSimpleName() + " невозможно суммировать");
    }

    public Integer find(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(this.array[i])) return i;
        }
        return -1;
    }

    public boolean isExist(T element) {
        return this.find(element) != -1;
    }

    public void bubbleSort(java.util.Comparator<? super T> comparator) {
        for (int j = 1; j < size; j++) {
            Boolean isSorted = true;
            for (int i = 0; i < size - j; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    T tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    public void insertionSort(java.util.Comparator<? super T> comparator) {
        for (int j = 1; j < size; j++) {
            T key = array[j];
            int i = j - 1;
            while ((i >= 0 && comparator.compare(array[i], key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public void selectionSort(java.util.Comparator<? super T> comparator) {
        for (int i = 0; i < size - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < size; ++j) {
                if (comparator.compare(array[j], array[minPos]) < 0) {
                    minPos = j;
                }
            }
            T tmp = array[minPos];
            array[minPos] = array[i];
            array[i] = tmp;
        }
    }


    public T get(int index) {
        if (index > 0 && index < size) return array[index];
        else return null;
    }

    public T replace(T element, int index) {
        if (index > 0 && index < size) {
            T oldElement = array[index];
            array[index] = element;
            return oldElement;
        } else return null;
    }


    public void printArray() {
        System.out.println(array);
    }

}







