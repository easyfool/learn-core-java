package com.github.wangfeng.core.enumeration.v5;

public enum Operation implements Calculator {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    }, MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    }, DIVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    }, MULTIPLY {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    };


}
