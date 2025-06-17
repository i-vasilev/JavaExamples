package lesson9.builder;

public class HouseBuilder {
    private int countFloors;
    private Material material;
    private int area;
    private boolean hasGroundFloor;
    private boolean hasBasement;

    public HouseBuilder withCountFloors(int countFloors) {
        this.countFloors = countFloors;
        return this;
    }

    public HouseBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

    public HouseBuilder withArea(int area) {
        this.area = area;
        return this;
    }

    public HouseBuilder withHasGroundFloor(boolean hasGroundFloor) {
        this.hasGroundFloor = hasGroundFloor;
        return this;
    }

    public HouseBuilder withHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
        return this;
    }

    public House build() {
        return new House(countFloors, material, area, hasGroundFloor, hasBasement);
    }
}
