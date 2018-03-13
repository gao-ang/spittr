package com.gasyz.spittr.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * 混合自定义的功能
 */
@Transactional
public class SpitterRepositoryImpl implements SpitterSweeper {
    @PersistenceContext
    private EntityManager em;

    public Integer eliteSweep() {
        String sql="UPDATE Spitter spitter SET spitter.username = 'aaa' WHERE spitter.username = 'sdf' AND spitter.id IN (1,2)";
        return em.createQuery(sql).executeUpdate();
    }
}
