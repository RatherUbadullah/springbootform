package com.ubaiid.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ubaiid.demo.dao.UserRepository;
import com.ubaiid.demo.model.User;

@Controller
public class UserController
{
	@Autowired
	UserRepository repo;

	@RequestMapping("/")             //Calling Home Page.
	public String home()
	{
		return "index.html";
	}
	
	@RequestMapping("/register")       //Calling Register Form Page.
	public String register()
	{
		return "register.html";
	}
	
	@RequestMapping("/addUser")        // Registering the User.
	public String addUser(User user)
	{
		repo.save(user);
		return "success.html";
	}
	
	@RequestMapping("/findUser")							//Finding User By User ID.
	public ModelAndView getUser(@RequestParam int id)
	{
	    ModelAndView mv = new ModelAndView("showUser.jsp");
	    User user = repo.findById(id).orElse(new User());
	    mv.addObject(user);
	    return mv;
	}
	
	@RequestMapping("/getAllUsers")							// Extracting All Registered Users.
	@ResponseBody
	public String getAllUsers()
	{
	   return repo.findAll().toString();				// Converting  To String Representation.
	}
		
}
