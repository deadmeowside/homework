package edu.dnu.fpm.pz.list;

public class Validator {

    public static void validateIndex(int index, int size) throws ListException {
        if (index < 0 || index >= size) {
            throw new ListException(CList.class.toString(), "IndexOutOfBounds", "Індекс виходить за межі списку.");
        }
    }

    public static void validateNotEmpty(boolean isEmpty) throws ListException {
        if (isEmpty) {
            throw new ListException(CList.class.toString(), "EmptyList", "Список порожній.");
        }
    }

}
