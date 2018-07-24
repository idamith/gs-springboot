package com.idotrick.gssb.user;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.idotrick.gssb.user.model.User;
import com.idotrick.gssb.user.service.UserService;

@Controller
public class UserController {
	
	Logger log = Logger.getLogger(UserController.class);

	private UserService userService;

	@RequestMapping(value = "/users/new", method = RequestMethod.GET)
	public String initCreationForm(Map<String, Object> model) {
		User user = new User();
		model.put("user", user);
		return UserConstants.VIEW_USER_CREATE_OR_UPDATE_FORM;
	}

	@RequestMapping(value = "/users/new", method = RequestMethod.POST)
	public String processCreationForm(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return UserConstants.VIEW_USER_CREATE_OR_UPDATE_FORM;
		} else {
			this.userService.saveUser(user);
			return "redirect:/"+UserConstants.VIEW_USERS_NEW;
		}
	}

	@RequestMapping(value = "/users/find", method = RequestMethod.GET)
	public String userFind(@RequestParam("q") Optional<String> query, User user, BindingResult result, Map<String, Object> model) {
		log.debug("initFindForm [Begin]");
		if(query.isPresent()) {
			log.debug("initFindForm [query]"+query);
			Collection<User> results;
			
			if((query.get()!=null)?query.get().isEmpty():true) {// Search query is empty
				log.debug("initFindForm [query is empty]");
				results = this.userService.listUsers();
			} else {
				log.debug("start finding users for [query]"+query.get());
				results = this.userService.getUserByString(query.get());
			}
	        
	        if (results.isEmpty()) {
	            // no users found
	            result.rejectValue("lastName", "notFound", "not found");
	            return UserConstants.VIEW_FIND_USER_FORM;
	        } else {
	            model.put("selections", results);
	            return UserConstants.VIEW_USERS_LIST;        	
	        }			
		} else {
			log.debug("initFindForm [query param does not exist]");
			return UserConstants.VIEW_FIND_USER_FORM;
		}
	}

	@RequestMapping("/users/remove/{id}")
	public String removeUser(@PathVariable("id") int id) {
		this.userService.removeUser(id);
		return "redirect:/users";
	}

	@RequestMapping("/users/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", this.userService.getUserById(id));
		model.addAttribute("listusers", this.userService.listUsers());
		return "user";
	}

	@RequestMapping("/users/find={searchTerm}")
	public List<User> getUserByString(@PathVariable String searchTerm) {
		return userService.getUserByString(searchTerm);
	}

	public UserService getUserService() {
		return userService;
	}

	@Autowired(required = true)
	@Qualifier(value = "userServiceImpl")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
