package com.vav.Reference.CTCI.Archive.work_2017.Chapter3;

import com.vav.Reference.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 8/30/17.
 */
public class Q6_AnimalShelter {
    /* we need to create a queue of cat and dog type elements so that only the oldest element can pop
    user can also select the type of animal he wants in that case oldest animal of his choice will pop
     */
    /*
    To achieve this we can create a data structure two different queues and create a pointer that defaults to the oldest animal
     */
    private LinkedList<Animal> animalLinkedList;

    public Q6_AnimalShelter(){
        animalLinkedList = new LinkedList<>();
    }
    public void insert(Animal animal){
        animalLinkedList.insertAtEnd(animal);
    }
    public Animal iLikeAllAnimals(){
        return (Animal) animalLinkedList.getHead();
    }
//    public Animal iLikeCats(){
//        int i=0;
//        while(!((Animal)animalLinkedList.getHead() instanceof Cat)){
//             i++;
//        }
//        //if(i=animalLinkedList.)
//    }


}
interface Animal{

}
class Cat implements Animal{

}
class Dog implements Animal{

}