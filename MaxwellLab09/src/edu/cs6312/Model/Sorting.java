/**
 * 
 */
package edu.cs6312.Model;

/**
 * Define sorting methods
 * 
 * @author justinmaxwell
 * @version 3/3/2023
 */
public class Sorting {

	/**
	 * Sort values using bubble sort alg
	 * 
	 * @param values
	 * @return array of sorted values
	 */
	public int[] bubbleSort(int[] values) {
		for (int i = 1; i < values.length; i++) {
			for (int j = 0; j < values.length - i; j++) {
				if (values[j] > values[j + 1]) {
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}

		return values;
	}

	/**
	 * Sort values using merge sort alg
	 * 
	 * @param list
	 * @return array of sorted values
	 */
	public int[] mergeSort(int[] list) {
		if (list.length > 1) {
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			this.mergeSort(firstHalf);

			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			this.mergeSort(secondHalf);

			int current1 = 0;
			int current2 = 0;
			int current3 = 0;

			while (current1 < firstHalf.length && current2 < secondHalf.length) {
				if (firstHalf[current1] < secondHalf[current2]) {
					list[current3++] = firstHalf[current1++];
				} else {
					list[current3++] = secondHalf[current2++];
				}
			}

			while (current1 < firstHalf.length) {
				list[current3++] = firstHalf[current1++];
			}

			while (current2 < secondHalf.length) {
				list[current3++] = secondHalf[current2++];
			}
		}

		return list;
	}

	/**
	 * Sort values using insertion sort alg
	 * 
	 * @param list
	 * @return array of sorted values
	 */
	public int[] insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int j;
			for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
				list[j + 1] = list[j];
			}

			list[j + 1] = currentElement;
		}

		return list;
	}

	/**
	 * Generate random array of numbers between 0 and 1000
	 * 
	 * @return array of numbers
	 */
	public int[] randomArr() {
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = (int) (Math.floor(Math.random() * (1000 - 0 + 1) + 0));
		}

		return arr;
	}
	
	/**
	 * Sort by id using insertion sort
	 * @param people
	 * @return array of Person
	 */
	public Person[] sortIdByInsertionSort(Person[] people) {
		
		for (int i = 1; i < people.length; i++) {
			Person currentElement = people[i];
			int j;
			for (j = i - 1; j >= 0 && Integer.valueOf(people[j].getId()) > Integer.valueOf(currentElement.getId()); j--) {
				people[j + 1] = people[j];
			}

			people[j + 1] = currentElement;
		}

		return people;
		
	}	
	
	/**
	 * Sort by last names using bubble sort
	 * @param people
	 * @return array of Person
	 */
	public Person[] sortLastNameByBubbleSort(Person[] people) {	
        Person temp;
        for (int i = 1; i < people.length; i++) {
    		for (int j = 0; j < people.length - i; j++) {
    			if (people[j].getLastName().compareTo(people[j + 1].getLastName()) > 0) {
    				temp = people[j];
    				people[j] = people[j + 1];
    				people[j + 1] = temp;
    			}
    		}
    	}
		
		return people;
	}
}
