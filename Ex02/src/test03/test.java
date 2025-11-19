package test03;

public class test {
public static void main(String[] args) {
	flying birdFlying = new bird();
	flying insectFlying = new insect();
	
	birdFlying.fly();
	insectFlying.fly();
	((bird)birdFlying).name();
	((insect)insectFlying).name();
}
}
