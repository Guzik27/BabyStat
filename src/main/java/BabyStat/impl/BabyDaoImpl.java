package BabyStat.impl;

import BabyStat.domain.Baby;
import BabyStat.dao.BabyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BabyDaoImpl implements BabyDao {


    private Map<Long, Baby> babyMap;
    private static Long id = 1L;

    @Override
    public List<Baby> getChildren() {
        return new ArrayList<>(babyMap.values());
    }


    public BabyDaoImpl() {
        this.babyMap = new HashMap<>();
        prepareBabyList();
    }

    @Override
    public void saveBaby(Baby baby) {
        if (baby.getId() < 1) {
            baby.setId(id);
            id++;
        }
        babyMap.put(baby.getId(), baby);
    }

    @Override
    public void removeBaby(Long id) {
        babyMap.remove(id);
    }

    @Override
    public Baby getById(Long id) {
        return babyMap.get(id);
    }


    private void prepareBabyList() {
        Baby baby = new Baby();
        baby.setId(id);
        baby.setName("Leon");
    }



}
