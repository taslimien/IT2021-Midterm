package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "C:\\Users\\HP\\IT2021\\IdeaProjects\\IT2021-Midterm\\src\\data\\self-driving-car";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e){
			e.printStackTrace();

		}
		br = new BufferedReader(fr);
		String data = " ";
		while (true){
			try {
				if (!((data = br.readLine()) != null)) break;

			} catch (IOException e){
				e.printStackTrace();
			}
			System.out.println(data);
		}



	}

}
