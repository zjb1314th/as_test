package com.zjb.ifelse;

public enum OperateImp implements Operate{

    ADMIN {
        @Override
        public void op() {
            System.out.println("ADMIN");
        }
    },
    ORDER {
        @Override
        public void op() {
            System.out.println("ORDER");
        }
    },
    ORDINARY {
        @Override
        public void op() {
            System.out.println("ORDINARY TEST");
        }
    };
}
