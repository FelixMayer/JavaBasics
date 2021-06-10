import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	public void upTo255() {
		for(int i = 0; i <= 255; i++){
			System.out.println(i);
		}
	}
	public void odd255() {
		for(int i = 0; i <= 255; i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
	public void printSum() {
		int sum = 0;
		for(int i = 0; i <= 255; i++){
			sum += i;
			System.out.println("New Number: " + i + "  Sum: " + sum);
		}
	}
	// Possibly another way to iterate an Array?
	// public void iterateArr(int[] array) {
	// 	for(Integer number : array) {
	// 		System.out.println(number)
	// 	}
	// }
	public void iterateArr(int[] array) {
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	public void getMax(int[] array) {
		int max = array[0];
		for(int i = 0; i <= array.length; i++) {
			if(array[i] > max){
				max = array[i];
			}
		}
		System.out.println(max);
	}
	public void average(int[] array) {
		int sum = 0;
		for(int i = 0; i <= array.length; i++) {
			sum += array[i];
		}
		double avrg = sum / array.length;
		System.out.println(avrg);
	}
	public void oddNumArray(){
		ArrayList<Integer> oddNum = new ArrayList<Integer>(); 
		for(int i = 0; i <= 255; i++) {
			if( i % 2 != 0){
				oddNum.add(i);
			}
		}
		System.out.println(oddNum);
	}
	public void grtThanY(int[] array, int value){
		int larger = 0;
		for(int i = 0; i <= array.length; i++) {
			if(array[i] > value) {
				larger++;
			}
		}
		System.out.println(larger);
	}
	public void squareValue(int[] array){
		for(int i = 0; i <= array.length; i++){
			array[i] = array[i] * array[i];
		}
		System.out.println(Arrays.toString(array));
	}
	public void noNegative(int[] array){
		for(int i = 0; i <= array.length; i++){
			if( i < 0 ){
				array[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	public void maxMinAvrg(int[] array){
		ArrayList<Integer> mMA = new ArrayList<Integer>(); 
		int max = array[0];
		for(int i = 0; i <= array.length; i++) {
			if(array[i] > max){
				max = array[i];
			}
		}
		mMA.add(max);
		int min = array[0];
		for(int i = 0; i <= array.length; i++) {
			if(array[i] < min){
				min = array[i];
			}	
		}
		mMA.add(min);
		int sum = 0;
		for(int i = 0; i <= array.length; i++) {
			sum += array[i];
		}
		int avrg = sum / array.length;
		mMA.add(avrg);
		System.out.println(mMA);
	}
	public void shiftValues(int[] array){
		for (int i = 0; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));
	}
}