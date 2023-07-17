package org.example;

public interface StringList {
    String add(String item);


    String add(int index, String item);  // выходит за пределы фактического количества элементов


    String set(int index, String item);     // Выбросить исключение, если индекс больше фактического количества элементов

    String remove(String item);

    String remove(int index);

    boolean contains(String item);                                         //Проверка на существование элемента

    int indexOf(String item);                                              //Поиск элемента

    int lastIndexOf(String item);                                          //Поиск элемента с конца

    String get(int index);           // Получить элемент по индексу

    boolean equals(StringList otherList);     //Сравнить текущий список с другим.

    int size();                                                            // Вернуть фактическое количество элементов

    boolean isEmpty();                                                     // Вернуть true, если элементов в списке нет иначе false.

    void clear();                                                          // Удалить все элементы из списка.

    String[] toArray();                                                    // Создать новый массив
}

