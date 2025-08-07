package springJDBC.spring6.dao;

import java.util.List;

public interface Personal_DAO {
	void insert(Personal person);         
    Personal get(int id);                 
    List<Personal> list();                
    void update(Personal person);         
    void delete(int id);  
}
