package ru.zinin.sqldemo.persistance;


import org.springframework.data.repository.CrudRepository;
import ru.zinin.sqldemo.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
}
