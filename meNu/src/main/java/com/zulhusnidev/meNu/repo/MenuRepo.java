package com.zulhusnidev.meNu.repo;

import com.zulhusnidev.meNu.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface MenuRepo extends JpaRepository<Menu,Long>{
    void deleteMenuById(Long id);
    Optional<Menu> findMenuById(Long id);
}
