package lesson9.builder;

import static lesson9.builder.Material.*;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.setCountFloors(1);
        house.setArea(100);
        house.setHasBasement(false);
        house.setHasGroundFloor(true);
        house.setMaterial(BRICKS);

        House houseBuilded = new HouseBuilder()
                .withArea(100)
                .withCountFloors(2)
                .withMaterial(SAWDUST_CONCRETE)
                .withHasGroundFloor(true)
                .build();
    }
}
