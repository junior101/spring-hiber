package com.serg.model;

import java.util.List;

/**
 * Created by Sergey Manko
 * Date: 20.12.2015
 */
public interface UserDAO {
    public List<User> list();

    public User get(int id);

    public void saveOrUpdate(User user);

    public void delete(int id);
}
