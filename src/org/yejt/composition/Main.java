package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class Main
{
    public static void main(String[] args)
    {
        Equipment composite1 = new CompositeEquipment("MotherFucker");
        composite1.addEquipment(new Chassis("Chassis"));
        composite1.addEquipment(new FloppyDisk("Floppy Disk"));
        Equipment composite2 = new CompositeEquipment("FotherMucker");
        composite2.addEquipment(new Bus("Bus"));
        composite2.addEquipment(new Cabinet("Cabinet"));
        composite2.addEquipment(composite1);

        System.out.println("Total price is " + composite2.getPrice());
        System.out.println("This component contains:");
        System.out.println(composite2.toString());
    }
}
