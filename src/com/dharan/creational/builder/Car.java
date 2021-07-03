package com.dharan.creational.builder;

public class Car {
    /**
     * Mandatory Attributes
     */
    private final String engine;
    private final String wheelType;
    private final String steeringType;
    /**
     * Optional Attributes
     */
    private final String sunRoof;
    private final String ac;
    private final boolean isLeatherSeats;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheelType = builder.wheelType;
        this.steeringType = builder.steeringType;
        this.sunRoof = builder.sunRoof;
        this.ac = builder.ac;
        this.isLeatherSeats = builder.isLeatherSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheelType='" + wheelType + '\'' +
                ", steeringType='" + steeringType + '\'' +
                ", sunRoof='" + sunRoof + '\'' +
                ", ac='" + ac + '\'' +
                ", isLeatherSeats=" + isLeatherSeats +
                '}';
    }

    static class CarBuilder {
        /**
         * Mandatory Attributes
         */
        private final String engine;
        private final String wheelType;
        private final String steeringType;
        /**
         * Optional Attributes
         */
        private String sunRoof;
        private String ac;
        private boolean isLeatherSeats;

        public CarBuilder(String engine, String wheelType, String steeringType) {
            this.engine = engine;
            this.wheelType = wheelType;
            this.steeringType = steeringType;
        }

        public CarBuilder setSunRoof(String sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder setAc(String ac) {
            this.ac = ac;
            return this;
        }

        public CarBuilder setLeatherSeats(boolean leatherSeats) {
            isLeatherSeats = leatherSeats;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
