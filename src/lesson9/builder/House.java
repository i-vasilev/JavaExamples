package lesson9.builder;

public class House {
    private int countFloors;
    private Material material;
    private int area;
    private boolean hasGroundFloor;
    private boolean hasBasement;

    public House() {
    }

    public House(int countFloors, Material material, int area, boolean hasGroundFloor, boolean hasBasement) {
        this.countFloors = countFloors;
        this.material = material;
        this.area = area;
        this.hasGroundFloor = hasGroundFloor;
        this.hasBasement = hasBasement;
    }

    public int getCountFloors() {
        return countFloors;
    }

    public void setCountFloors(int countFloors) {
        this.countFloors = countFloors;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isHasGroundFloor() {
        return hasGroundFloor;
    }

    public void setHasGroundFloor(boolean hasGroundFloor) {
        this.hasGroundFloor = hasGroundFloor;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }
}
