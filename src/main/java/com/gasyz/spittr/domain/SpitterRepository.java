package com.gasyz.spittr.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by gaoang on 2018/3/2.
 */
public interface SpitterRepository extends JpaRepository<Spitter,Long>,SpitterSweeper {
    Spitter findByUsername(String username);//Spring Data JPA自带方法签名，不需要自己实现

    @Query("select s from OrderRecord s where orderName like '%gmail.com'")
    List<OrderRecord> testEmail();

    @Query("SELECT new com.gasyz.spittr.domain.SpitterOrder(s.id,s.email,o.orderName) from Spitter s inner join OrderRecord o on s.id=o.id")
    List<SpitterOrder> testSpitterOrder();
}
