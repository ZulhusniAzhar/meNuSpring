package com.zulhusnidev.meNu.service;

import com.zulhusnidev.meNu.exception.MenuNotFoundException;
import com.zulhusnidev.meNu.model.Menu;
import com.zulhusnidev.meNu.repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MenuService {
    private final MenuRepo menuRepo;

    @Autowired
    public MenuService(MenuRepo menuRepo){
        this.menuRepo=menuRepo;
    }
    public Menu addMenu(Menu menu){
        return menuRepo.save(menu);
    }

    public List<Menu> findAllMenu(){
        return menuRepo.findAll();
    }

    public Menu updateMenu(Menu menu){
        return menuRepo.save(menu);
    }

    public Menu findMenuById(Long id){
        return menuRepo.findMenuById(id)
                .orElseThrow(()->new MenuNotFoundException("User by"+id+" does not exist"));
    }

    public void deleteMenu(Long id){
        menuRepo.deleteById(id);
    }


}
