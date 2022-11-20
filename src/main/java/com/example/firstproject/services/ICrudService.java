package com.example.firstproject.services;

import java.util.List;

public interface ICrudService <Class,TypeId> {
    List<Class>getAll();
    Class add(Class class1)throws Exception;
    Class update(TypeId typeId,Class class1)throws Exception;
    void delete(TypeId typeId);
}
