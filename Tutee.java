

public class Tutee {
	String currentName;
	Float sleepiness; // 0-1
	Boolean present;

	public Tutee(String name) {
		this.currentName = name;
	}

	public void setSleepiness(Float currentSleepiness) {
		this.sleepiness = currentSleepiness;
	}

	public void changeName(String newName) {
		this.currentName = newName;
	}
}