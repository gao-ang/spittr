package gasyz.spittr.service;

import gasyz.spittr.domain.OrderRecord;
import gasyz.spittr.domain.Spitter;
import gasyz.spittr.domain.SpitterOrder;
import gasyz.spittr.domain.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoang on 2018/3/2.
 */
@Service
@Transactional
public class SpitterService {
    @Autowired
    private SpitterRepository spitterRepository;
    @Autowired
    private JpaRepository<Spitter,Long> jpaRepository;


    public List<Spitter> findAll() {
        List all1 = jpaRepository.findAll();
        List<Spitter> all = spitterRepository.findAll();
        Spitter a = spitterRepository.findByUsername("a");
        List<OrderRecord> spitters = spitterRepository.testEmail();
        List<SpitterOrder> spitterOrders = spitterRepository.testSpitterOrder();
        String orderName = spitterOrders.get(0).getOrderName();
        Integer integer = spitterRepository.eliteSweep();
        return all;
    }
}
