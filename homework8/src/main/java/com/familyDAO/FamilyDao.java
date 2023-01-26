package com.familyDAO;


import java.util.List;

public interface FamilyDao<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T family);
    void saveFamily(T family);
}

