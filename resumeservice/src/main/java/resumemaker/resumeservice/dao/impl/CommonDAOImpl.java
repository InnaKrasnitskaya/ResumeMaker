package resumemaker.resumeservice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDAOImpl<T> {
	
	private Class<T> ClassType;
	
    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
	public List<T> getList() {
        return (List<T>) getSession().createCriteria(ClassType).list();
	}

}
