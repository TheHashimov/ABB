package BuilderPattern;

public class Car {
    private String engine;
    private String color;
    private int doors;
    private String wheels;
    private String seats;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.doors = builder.doors;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String engine;
        private String color;
        private int doors;
        private String wheels;
        private String seats;

        private CarBuilder() {
        }

        public Car build() {
            return new Car(this);
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public CarBuilder wheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder seats(String seats) {
            this.seats = seats;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", wheels='" + wheels + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }
}