package com.niu.spring.business;

import com.niu.spring.beans.Data;
import com.niu.spring.beans.User;
import com.niu.spring.data.DataService;
import com.niu.spring.data.DataServiceImpl;

public class BusinessServiceImplBeforeRefactoring {
    public long calculatieSum(User user) {
        DataService dataService = new DataServiceImpl();

        long sum = 0;
        for (Data data : dataService.retrieveData(user)) {
            sum += data.getValue();
        }
        return sum;
    }
}
