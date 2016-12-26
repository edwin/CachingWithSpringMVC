package com.edw.mavenproject5.service;

import com.edw.mavenproject5.bean.Dosen;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <pre>
 *  com.edw.mavenproject5.service.DosenService 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Dec 26, 2016 10:38:26 PM
 *
 */
@Service
@Transactional
public class DosenService {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Cacheable(key = "#root.methodName", value = "duaMenit")
    public List<Dosen> getDosens() {
        return sessionFactory.getCurrentSession().createCriteria(Dosen.class).list();
    }
    
    @Cacheable(key = "#root.methodName + #idDosen", value = "satuMenit")
    public Dosen getDosen(String idDosen) {
        return (Dosen) sessionFactory.getCurrentSession().get(Dosen.class, idDosen);
    }
    
}
