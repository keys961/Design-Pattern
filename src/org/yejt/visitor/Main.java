package org.yejt.visitor;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class Main
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.addComponent(new Monitor());
        computer.addComponent(new Mouse());
        computer.addComponent(new Keyboard());
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
