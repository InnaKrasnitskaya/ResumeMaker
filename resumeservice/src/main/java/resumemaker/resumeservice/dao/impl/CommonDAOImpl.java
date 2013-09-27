package resumemaker.resumeservice.dao.impl;

import java.util.List;
import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CommonDAOImpl<T> {
	
	private Class<T> ClassType;
	
    public CommonDAOImpl(Class<T> classType) {
    	ClassType = classType;
    }
	
    @Inject
    private SessionFactory sessionFactory;    
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
	public List<T> getList() {
      return (List<T>) getSession().createCriteria(ClassType).list();
	}

}
