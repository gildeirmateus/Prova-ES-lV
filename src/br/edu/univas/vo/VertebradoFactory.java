package br.edu.univas.vo;

public class VertebradoFactory implements AbstractFactory{

	@Override
	public AnimalEat getType(AnimalEatType animalType) {
		if (animalType.equals(AnimalEatType.ELEPHANT)) {
			return new Elephant();

		}if (animalType.equals(AnimalEatType.SHARK)) {
			return new Shark();

		}
		return null;
	}

}
