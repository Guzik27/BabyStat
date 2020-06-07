package BabyStat.dao;

import BabyStat.domain.Baby;

import java.util.List;


public interface BabyDao {

    List<Baby> getChildren();

    void saveBaby(Baby baby);

    void removeBaby(Long id);

    Baby getById(Long id);


}
