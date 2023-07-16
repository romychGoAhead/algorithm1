package org.example;

public interface StringList {
    String add(String item);
    String add(int index, String item) throws EmployeeStoragelsFullException; // выходит за пределы фактического количества элементов


    String set(int index, String item) throws IndexFullException;     // Выбросить исключение, если индекс больше фактического количества элементов

    String remove(String item) throws EmployeeRemoveException;
    String remove(int index) throws EmployeeRemoveException;
    boolean contains(String item);                                         //Проверка на существование элемента
    int indexOf(String item);                                              //Поиск элемента
    int lastIndexOf(String item);                                          //Поиск элемента с конца
    String get(int index) throws EmployeeStoragelsFullException;           // Получить элемент по индексу
    boolean equals(StringList otherList) throws exceptionListsUnequal;     //Сравнить текущий список с другим.
    int size();                                                            // Вернуть фактическое количество элементов
    boolean isEmpty();                                                     // Вернуть true, если элементов в списке нет иначе false.
    void clear();                                                          // Удалить все элементы из списка.
    String[] toArray();                                                    // Создать новый массив
}

