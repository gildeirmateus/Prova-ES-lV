package br.edu.univas.vo;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(AnimalType animalType) {
		if (animalType.equals(AnimalType.VERTEBRADOS)) {
			return new VertebradoFactory();
		} else if (animalType.equals(AnimalType.INVERTEBRADOS)) {
			return new InvertebradosFactory();
		}
		return null;
	}

}
