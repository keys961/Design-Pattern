package org.yejt.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class CompositeEquipment extends Equipment
{
    private List<Equipment> list = new ArrayList<>();

    public CompositeEquipment(String name)
    {
        super(name);
    }

    @Override
    public double getPower()
    {
        double sum = 0;
        for(Equipment item : list)
            sum += item.getPower();
        return sum;
    }

    @Override
    public double getPrice()
    {
        double sum = 0;
        for(Equipment item : list)
            sum += item.getPrice();
        return sum;
    }

    @Override
    public double getDiscountPrice()
    {
        double sum = 0;
        for(Equipment item : list)
            sum += item.getDiscountPrice();
        return sum;
    }

    @Override
    public void addEquipment(Equipment equipment)
    {
        list.add(equipment);
    }

    @Override
    public void removeEquipment(Equipment equipment)
    {
        if(list.contains(equipment))
            list.remove(equipment);
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(this.getName() + "\n");
        for(Equipment equipment : list)
            stringBuilder.append(equipment.toString());
        return stringBuilder.toString();
    }
}
