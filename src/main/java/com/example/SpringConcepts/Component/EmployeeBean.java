package com.example.SpringConcepts.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eId;
    private String eName;
    @Autowired
    private DepartmentBean dept;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    @Autowired
    public EmployeeBean(DepartmentBean dept) {
        this.dept = dept;
    }
    public int geteId() {
        return eId;
    }



    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Autowired
    public void setDept(DepartmentBean dept) {
        this.dept = dept;
    }

    public DepartmentBean getDept() {
        return dept;
    }

    public void showDetails() {
        logger.debug("employee Id: " + eId);
        logger.debug("employee Name: " + eName);
        dept.setDeptName("Information Technology");
        logger.debug("Department Name: " + dept.getDeptName());
    }
}
