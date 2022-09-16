package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserDao extends JpaRepository <User,Integer>
{
	List<User> findAll();
	
	

}
