package com.quest.oops.test1;

public class RandomClass extends AbstractClass{
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass(){
            @Override
            void drive(){
                System.out.println("Random Object");
            }

            @Override
            void add() {
                super.add();
                System.out.println("Random Add Object");
            }
        };
        abstractClass.drive();
        RandomClass randomClass = new RandomClass();
        randomClass.drive();
        randomClass.add();
    }

    @Override
    void drive(){
        System.out.println("Random abstract Object");
    }
    void add(int a){

    }
    public void add(){
        System.out.println("Random abstract add");
    }
}
