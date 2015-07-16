package org.gyt.hackerrank.datastructure.queue.truck_tour;
import java.util.*;

class PetrolPump {
	int petrol;
	int distToNextPump;
	int index;

	public PetrolPump(int petrol, int distToNextPump, int index) {
		this.petrol = petrol;
		this.distToNextPump = distToNextPump;
		this.index = index;
	}
}

public class Solution {

	static int minIndex(Queue<PetrolPump> pumpQueue) {
		int index = -1;
		int availablePetrol = 0;
		int distanceToCover = -1;

		PetrolPump pump = pumpQueue.peek();
		pumpQueue.poll();
		availablePetrol = pump.petrol;
		distanceToCover = pump.distToNextPump;
		pumpQueue.add(pump);

		while (!pump.equals(pumpQueue.peek())) {
			if (availablePetrol >= distanceToCover) {
				availablePetrol = availablePetrol - distanceToCover;

				PetrolPump temp = pumpQueue.poll();
				availablePetrol = availablePetrol+temp.petrol;
				distanceToCover = temp.distToNextPump;
				pumpQueue.add(temp);

			} else {
				pump = pumpQueue.poll();
				availablePetrol = pump.petrol;
				distanceToCover = pump.distToNextPump;
				pumpQueue.add(pump);
			}

		}

		index = pump.index;

		return index;
	}


	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int N;
		N = scanner.nextInt();
		Queue<PetrolPump> pumpQueue = new LinkedList<PetrolPump>();
		int i = 0;
		while (N > 0) {
			int petrol = scanner.nextInt();
			int distToNextPump = scanner.nextInt();
			scanner.nextLine();
			pumpQueue.add(new PetrolPump(petrol, distToNextPump, i++));
			N--;
		}

		System.out.println(minIndex(pumpQueue));

		scanner.close();
	}
}