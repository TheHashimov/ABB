package BuilderPattern;

public class Practice {
    public static void main(String[] args) {
        Car sportsCar = Car.builder()
                .engine("V8")
                .color("Red")
                .doors(2)
                .wheels("Alloy")
                .seats("Leather")
                .build();

        Car familyCar = Car.builder()
                .engine("V6")
                .color("Blue")
                .doors(4)
                .seats("Fabric")
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
