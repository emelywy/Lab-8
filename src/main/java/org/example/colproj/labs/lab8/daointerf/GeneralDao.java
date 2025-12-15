package org.example.colproj.labs.lab8.daointerf;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll(); // отримання список усіх записів з таблиці
    T getById(Long id); // знайти конкретний запис за його унікальним ідентифікатором
    void save(T t); // зберегти новий об'єкт у базу даних
    void update(T t); // оновити існуючий запис у базі даних
    void delete(T t); // видалити конкретний об'єкт
    void delete(Long id); // видалити запис за його ID
    void deleteAll(); // очистити всю таблицю
}
