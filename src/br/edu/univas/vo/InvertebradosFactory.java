package br.edu.univas.vo;

public class InvertebradosFactory  implements AbstractFactory{

	@Override
	public AnimalEat getType(AnimalEatType animalType) {
		if (animalType.equals(AnimalEatType.BEE)) {
			return new Bee();

		}if (animalType.equals(AnimalEatType.ANT)) {
			return new Ant();

		}
		return null;
	}

}
