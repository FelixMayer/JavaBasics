public class BasicJavaTest {
	public static void main(String[] args){
		BasicJava iD = new BasicJava();
		iD.upTo255();
		iD.odd255();
		iD.printSum();
		int[] array = {1, -3, 5, 7};
		iD.iterateArr(array);
		iD.getMax(array);
		iD.average(array);
		iD.oddNumArray();
		iD.grtThanY(array, 1);
		iD.squareValue(array);
		iD.noNegative(array);
		iD.maxMinAvrg(array);
		iD.shiftValues(array);
	}
}