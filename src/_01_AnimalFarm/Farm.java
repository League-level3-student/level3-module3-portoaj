package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cow());
		animals.add(new Sheep());
		animals.add(new Pig());
		animals.add(new Human());
		animals.add(new Human());
		animals.add(new Human());
		for(Animal animal : animals)
		{
			animal.makeNoise();
			animal.sayHi();
		}
	}

}
