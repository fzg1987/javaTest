package interfaces;

public class Test {
    public static void main(String[] args) {
        EquipmentA equipmentA = new EquipmentA();
        EquipmentB equipmentB = new EquipmentB();
        Factory factory = new Factory();
        factory.setEquipment(equipmentB);
        factory.work();
    }
}
