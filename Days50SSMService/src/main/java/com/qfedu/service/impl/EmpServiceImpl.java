package com.qfedu.service.impl;

import com.qfedu.dao.EmpDao;
import com.qfedu.entity.Emp;
import com.qfedu.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> getAllEmps() {
        return empDao.queryAll();
    }
}
