package com.niu.spring.data;

import com.niu.spring.beans.Data;
import com.niu.spring.beans.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DataServiceImpl implements DataService {
    public List<Data> retrieveData(User user) {
        return Arrays.asList(new Data(10), new Data(15));
    }
}
