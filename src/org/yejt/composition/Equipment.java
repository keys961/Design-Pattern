package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public abstract class Equipment
{
    private String name;

    protected Equipment(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract double getPower();
    public abstract double getPrice();
    public abstract double getDiscountPrice();

    public void addEquipment(Equipment equipment){}
    public void removeEquipment(Equipment equipment){}

    @Override
    public boolean equals(Object obj)
    {
        return this.getName().equals(((Equipment)obj).getName());
    }

    @Override
    public String toString()
    {
        return getName() + "\n";
    }
}
