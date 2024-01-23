package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BikeTest {
	public static void main(String[] args) {
		Bike bikeFz, bikeSplendor;
		bikeFz = new BikeFZ();
		bikeSplendor = new BikeSplendor();

		bikeFz.run();
		bikeSplendor.run();

		try {
			FileInputStream fileInputStream = new FileInputStream("abc.txt");
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Last Line");
	}

}
