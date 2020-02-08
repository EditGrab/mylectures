package lv.edite.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		File fileObj = new File("newfile.txt");
		FileWriter fw = new FileWriter(fileObj, true);
		fw.write("Check is it work?");   // teksts paradas newfile dokumenta
		fw.append("\n String next line"); // pierakstis klat papildus tekstu jauna rinda
		fw.close();
		
		//if(fileObj.createNewFile()){
			//System.out.println("File created: "+fileObj.getName());
		//}else{
			//System.out.println("File exists");
		}

	}


