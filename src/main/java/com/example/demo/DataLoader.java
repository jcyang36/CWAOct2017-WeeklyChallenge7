package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    RecordRepository recordRepository;

    @Override
    public void run(String... strings) throws Exception{
        System.out.println("Loading data. . .");

        Record record = new Record("John","Smith","JHU", "Java","Amtrak","j@gmail.com","BS","Psychology","2010","Programmer","2012-2014","Developing software","Expert" );
        recordRepository.save(record);

        record = new Record("Sally","Smith","UMBC", "Python","Amtrak","s@gmail.com","BS","Psychology","2010","Assistant","2010-2014","Developing software","Expert" );
        recordRepository.save(record);
    }

}
