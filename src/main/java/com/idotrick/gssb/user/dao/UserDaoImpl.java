package com.idotrick.gssb.user.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.idotrick.gssb.common.dao.AbstractDao;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idotrick.gssb.user.model.User;

@Transactional
@Repository
public class UserDaoImpl extends AbstractDao {
	
	Logger log = Logger.getLogger(UserDaoImpl.class);
	
	List<User> users= new ArrayList<>();
	
	@Override
    protected Criteria getCriteria() {
        return getSession().createCriteria(User.class);
    }
	
	@Override
	public User getById(int id) {
		Criteria criteria = getCriteria();
		
		criteria.add(Expression.eq("id",id));

		return (User) criteria.list().get(1);
			
	}
	
	@Override
	public List<User> getByString(String searchTerm) {
		log.debug("Inside getByString: [searchTerm] :" + searchTerm );
		List<User> matchedUsers= new ArrayList<>();
		String[] searchTermsArr = searchTerm.toLowerCase().split(" ");
		
		for(User u: (List<User>) list()) {
			if (Arrays.stream(searchTermsArr).parallel().anyMatch(e -> u.toString().toLowerCase().indexOf(" "+e+" ")!=-1)) {
				matchedUsers.add(u);
				continue;
			}
		}
		
		return matchedUsers;
	}
}
