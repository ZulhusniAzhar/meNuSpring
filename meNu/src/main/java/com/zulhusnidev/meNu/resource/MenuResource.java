package com.zulhusnidev.meNu.resource;


import com.zulhusnidev.meNu.model.Menu;
import com.zulhusnidev.meNu.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuResource {
    private final MenuService menuService;

    public MenuResource(MenuService menuService){
        this.menuService=menuService;
    }

    //return http response by spring class (ResponseEntity)
    @GetMapping("/all")
    public ResponseEntity<List<Menu>> getAllMenus(){
        List<Menu> menus=menuService.findAllMenu();
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable("id") Long id){ //the id in path variable must be the same variable as in Get Mapping
        Menu menu=menuService.findMenuById(id);
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }

    @PostMapping("/add") //as the task is posting (create)
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu){ //we will take the data from the body of the request (Post)
        Menu newMenu=menuService.addMenu(menu);
        return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
    }

    @PutMapping("/update") //as the task is put (update)
    public ResponseEntity<Menu> updateMenu(@RequestBody Menu menu){ //we will take the data from the body of the request (Post)
        Menu updateMenu=menuService.updateMenu(menu);
        return new ResponseEntity<>(updateMenu, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}") //as the task is delete
    public ResponseEntity<?> deleteMenu(@PathVariable("id") Long id){ //question mark because delete function don't return anything
        menuService.deleteMenu(id);
        return new ResponseEntity<>( HttpStatus.OK); //
    }

}
