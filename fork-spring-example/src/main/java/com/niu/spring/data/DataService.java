package com.niu.spring.data;

import com.niu.spring.beans.Data;
import com.niu.spring.beans.User;

import java.util.List;

public interface DataService {
    List<Data> retrieveData(User user);
}
