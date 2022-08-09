package com.example.demo.config;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBItemWriter implements ItemWriter<User> {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void write(List<? extends User> list) throws Exception {
        System.out.println("---------------------------------------------------------");
        System.out.println("Data save " + list);
        System.out.println("---------------------------------------------------------");
        userRepo.saveAll(list);
        Thread.sleep(200);
    }
}
