
public class HeavyBox implements Comparable<HeavyBox>{ 

	private int weight;
	
	public HeavyBox(int w) {
		weight = w;
	}
	public void ChangeWeight(int w) {
		weight = w;
	}
	
	public int mass() {
		return weight;
	}
	public int compareTo(HeavyBox anotherBox)
    {
        if (this.weight == anotherBox.weight) {
            return 0;
        } else if (this.weight < anotherBox.weight) {
            return -1;
        } else {
            return 1;
        }
    }
}
